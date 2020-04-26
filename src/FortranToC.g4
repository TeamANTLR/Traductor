grammar FortranToC;

@parser::members {
	ArrayList<Constante> constantes = new ArrayList<>();
	ArrayList<Cabecera> cabeceras = new ArrayList<>();
	ArrayList<Variable> functionVarList = new ArrayList<>();
}

/////////////////////////////////////////////
/////////////////////////////////Primera Zona
/////////////////////////////////////////////

prg : prgmal | 'PROGRAM' {System.out.println("\n");} IDENT ';' dcllist {constantes.forEach(cte -> {cte.printConstante();}); System.out.println("\n");}
cabecera {cabeceras.forEach(cab -> {cab.printCabecera();}); System.out.println("\n");} sent sentlist 'END' 'PROGRAM' IDENT subproglist;
//Un ejemplo de error controlado desde la especificación léxica
prgmal : 'program' IDENT ';' dcllist cabecera sent sentlist 'END' 'program' IDENT subproglist{System.err.println("PROGRAM debe ir con mayusculas");};
//Original: dcllist : | dcllist dcl;
//Cambiado para que no sea recursiva por la izqda y lograr LL(1)
dcllist : dcl dcllist | ;
cabecera : cabeceramal | 'INTERFACE' cablist 'END' 'INTERFACE' | ;
//Otro ejemplo de error controlado desde la especificación léxica
cabeceramal : 'interface' cablist 'END' 'interface'{System.err.println("INTERFACE debe ir con mayusculas");};
cablist : decproc decsubprog | decfun decsubprog ;
decsubprog : decproc decsubprog | decfun decsubprog | ;
sentlist: sent sentlist | ;

/////////////////////////////////////////////
///////////////Zona de Constantes y Variables
/////////////////////////////////////////////

//Original: dcl: defcte | defvar;
//Cambiado para evitar que se acepte cadena vacia, se fuerza a que al menos reconozca una vez,
//o bien defcte, o bien defvar
dcl : tipo dcl2;
dcl2 : ',' 'PARAMETER' '::' IDENT '=' simpvalue {constantes.add(new Constante($IDENT.text, $simpvalue.simpvalueValue));} ctelist ';' defcte | '::' varlist ';' defvar ;
defcte : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue {constantes.add(new Constante($IDENT.text, $simpvalue.simpvalueValue));} ctelist ';' defcte | ;
defvar : tipo '::' varlist ';' defvar | ;
ctelist : ',' IDENT '=' simpvalue {constantes.add(new Constante($IDENT.text, $simpvalue.simpvalueValue));} ctelist | ;
//anadida parte opcional
simpvalue returns [String simpvalueValue]
: NUM_INT_CONST {$simpvalueValue = $NUM_INT_CONST.text;}
| NUM_REAL_CONST {$simpvalueValue = $NUM_REAL_CONST.text;}
| STRING_CONST {$simpvalueValue = $STRING_CONST.text;}
| NUM_INT_CONST_B {$simpvalueValue = $NUM_INT_CONST_B.text;}
| NUM_INT_CONST_O {$simpvalueValue = $NUM_INT_CONST_O.text;}
| NUM_INT_CONST_H {$simpvalueValue = $NUM_INT_CONST_H.text;};
tipo returns [String tipoValue]
: 'INTEGER' {$tipoValue = "int";}
| 'REAL' {$tipoValue = "float";}
| 'CHARACTER' charlength {$tipoValue = "char" + $charlength.text;} ;
charlength : '(' NUM_INT_CONST ')' | ;
//Original: varlist: IDENT init | IDENT init ',' varlist;
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
varlist : IDENT init varlist2;
varlist2 : | ',' varlist;
init : '='  simpvalue | ;

/////////////////////////////////////////////
///////////////////Procedimientos y Funciones
/////////////////////////////////////////////

decproc : 'SUBROUTINE' IDENT {String name = $IDENT.text;}
 formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT
  {Cabecera cab = new Cabecera(name, $IDENT.text, "void"); cab.setVars(functionVarList);
  functionVarList = new ArrayList<>(); cabeceras.add(cab);};

formal_paramlist : | '(' nomparamlist ')';
//Original: nomparamlist : IDENT | IDENT ',' nomparamlist;
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
nomparamlist : IDENT nomparamlist2;
nomparamlist2 : | ',' nomparamlist;

dec_s_paramlist : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';'
 {functionVarList.add(new Variable($IDENT.text, $tipo.tipoValue, $tipoparam.tipoparamValue));} dec_s_paramlist | ;
tipoparam returns [String tipoparamValue]
: 'IN' {$tipoparamValue = "IN";}
| 'OUT' {$tipoparamValue = "OUT";}
| 'INOUT' {$tipoparamValue = "INOUT";};

decfun : 'FUNCTION' IDENT {String name = $IDENT.text;} '(' nomparamlist ')' tipo '::' IDENT ';' dec_f_paramlist
 {Cabecera cab = new Cabecera(name, $IDENT.text, $tipo.tipoValue); cab.setVars(functionVarList);
 functionVarList = new ArrayList<>(); cabeceras.add(cab);} 'END' 'FUNCTION' IDENT ;

dec_f_paramlist : tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';'
 {functionVarList.add(new Variable($IDENT.text, $tipo.tipoValue, "IN"));} dec_f_paramlist | ;

/////////////////////////////////////////////
////////////////Sentencias Programa Principal
/////////////////////////////////////////////

//anadida parte opcional
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
sent : IDENT '=' exp ';'| proc_call ';'
    | 'IF' '(' expcond {System.out.println("if ( " + $expcond.expcondValue + " ) {");} ')' sent2
    | 'DO' sent4
    | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT' ;
sent2 : sent | 'THEN' sentlist sent3 ;
sent3 : 'ENDIF' | 'ELSE' sentlist 'ENDIF' ;
sent4 : 'WHILE' '(' expcond ')' sentlist 'ENDDO' | IDENT '=' doval ',' doval ',' doval sentlist 'ENDDO' ;
doval : NUM_INT_CONST | IDENT ;
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
casos : 'CASE' casos2 | ;
casos2 : '(' etiquetas ')' sentlist casos | 'DEFAULT' sentlist ;
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
etiquetas : simpvalue etiquetas2 | ':' simpvalue ;
etiquetas2 : listaetiquetas | ':' etiquetas3 ;
etiquetas3 : simpvalue | ;
listaetiquetas : ',' simpvalue | ;
//Original: exp: exp op exp| factor;
//Cambiado para que no sea recursiva por la izqda y lograr LL(1)
exp returns [String expValue]
: factor expAux {$expValue = $factor.factorValue + $expAux.expAuxValue;};

exp1 returns [String exp1Value]
: factor expAux {$exp1Value = $factor.factorValue + $expAux.expAuxValue;};
exp2 returns [String exp2Value]
: factor expAux {$exp2Value = $factor.factorValue + $expAux.expAuxValue;};

expAux returns [String expAuxValue]
: op exp expAux2 {$expAuxValue = $op.opValue + $exp.expValue + $expAux2.expAux2Value;}
| {$expAuxValue = "";};

expAux2 returns [String expAux2Value]
: op exp expAux {$expAux2Value = $op.opValue + $exp.expValue + $expAux.expAuxValue;}
| {$expAux2Value = "";};

op returns [String opValue]
: oparit {$opValue = $oparit.oparitValue;};
oparit returns [String oparitValue]
: '+' {$oparitValue = " + ";}
| '-' {$oparitValue = " - ";}
| '*' {$oparitValue = " * ";}
| '/' {$oparitValue = " / ";};
//anadida parte opcional y eliminada recursividad por la izquierda
expcond returns [String expcondValue]
: factorcond expcondAux {$expcondValue = $factorcond.factorcondValue + $expcondAux.expcondAuxValue;};
expcondAux returns [String expcondAuxValue]
: oplog expcond {$expcondAuxValue= $oplog.oplogValue + $expcond.expcondValue;}
| {$expcondAuxValue = "";};

oplog returns [String oplogValue]
: '.OR.' {$oplogValue = " || ";}
| '.AND.' {$oplogValue = " && ";}
| '.EQV.' {$oplogValue = " !^ ";}
| '.NEQV.' {$oplogValue = " ^ ";};

factorcond returns [String factorcondValue]
: exp1 opcomp exp2 {$factorcondValue = $exp1.exp1Value + $opcomp.opcompValue + $exp2.exp2Value;}
| '(' expcond ')' {$factorcondValue = "(" + $expcond.expcondValue + ")";}
| '.NOT.' factorcond2 {$factorcondValue = "!" + $factorcond2.factorcond2Value;}
| '.TRUE.' {$factorcondValue = "true";}
| '.FALSE.' {$factorcondValue = "false";};

factorcond2 returns [String factorcond2Value]
: exp1 opcomp exp2 {$factorcond2Value = $exp1.exp1Value+ $opcomp.opcompValue + $exp2.exp2Value;}
| '(' expcond ')' {$factorcond2Value = "(" + $expcond.expcondValue + ")";}
| '.NOT.' factorcond {$factorcond2Value = ".NOT." + $factorcond.factorcondValue;}
| '.TRUE.' {$factorcond2Value = ".TRUE.";}
| '.FALSE.' {$factorcond2Value = ".FALSE.";};

opcomp returns [String opcompValue]
: '<' {$opcompValue = " < ";}
| '>' {$opcompValue = " > ";}
| '<=' {$opcompValue = " <= ";}
| '>=' {$opcompValue = " >= ";}
| '==' {$opcompValue = " == ";}
| '/=' {$opcompValue = " != ";};
//Original: factor :simpvalue | '(' exp ')' | IDENT '(' exp explist ')' | IDENT;
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
factor returns [String factorValue]
: simpvalue {$factorValue = $simpvalue.simpvalueValue;}
| '(' exp ')' {$factorValue = "(" + $exp.expValue + ")";}
| IDENT factor2 {$factorValue = $IDENT.text + $factor2.factor2Value;};
factor2 returns [String factor2Value]
: {$factor2Value = "";}|
 '(' exp explist ')' {$factor2Value = "(" + $exp.expValue + $explist.explistValue + ")";};
explist returns [String explistValue]
: ',' exp explist2 {$explistValue = "," + $exp.expValue + $explist2.explist2Value;}
| {$explistValue = "";};

explist2 returns [String explist2Value]
: ',' exp explist {$explist2Value = "," + $exp.expValue + $explist.explistValue;}
| {$explist2Value = "";};


/////////////////////////////////////////////
////Implementacion Funciones y Procedimientos
/////////////////////////////////////////////

proc_call : 'CALL' IDENT subpparamlist ;
subpparamlist : '(' exp explist ')' | ;
subproglist : codproc subproglist | codfun subproglist | ;
codproc : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist dcllist sent sentlist 'END' 'SUBROUTINE' IDENT ;
codfun : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT ';'dec_f_paramlist
 dcllist sent sentlist IDENT '=' exp ';' 'END' 'FUNCTION' IDENT ;

/////////////////////////////////////////////
/////////////////////////////Constantes y mas
/////////////////////////////////////////////

IDENT : [a-zA-Z]([a-zA-Z]|[0-9]|'_')*;
NUM_INT_CONST_B : [b]['][01][01][01]['] ;
NUM_INT_CONST_O : [o]['][0-7][0-7][0-7]['] ;
NUM_INT_CONST_H : [z]['][0-9A-F][0-9A-F][0-9A-F]['] ;
NUM_INT_CONST : [+-]? [0-9]+ ;
NUM_REAL_CONST : NUM_INT_CONST (('.' [0-9]+)? [eE] '-'? | '.') [0-9]+ ;
STRING_CONST : ['] ([']['] | ["] | CHARS)+ ['] | ["] (["]["] | ['] | CHARD)+ ["] ;
LINE_COMMENT : '!' ~[\r\n]* -> skip;
WS : [ \t\r\n]+ -> skip;

/////////////////////////////////////////////
////////////////////////////////////Fragments
/////////////////////////////////////////////

fragment CHARS : (~[\r\n;'])+ ;
fragment CHARD : (~[\r\n;"])+ ;

