grammar FortranToC;

@parser::members {
	ArrayList<Constante> constantes = new ArrayList<>();
	ArrayList<Cabecera> cabeceras = new ArrayList<>();
	ArrayList<Variable> subroutineVars = new ArrayList<>();
}

/////////////////////////////////////////////
/////////////////////////////////Primera Zona
/////////////////////////////////////////////

prg : prgmal | 'PROGRAM' IDENT ';' dcllist {constantes.forEach(cte -> {System.out.println(cte.constante);});}
cabecera {cabeceras.forEach(cab -> {cab.printCabecera();});} sent sentlist 'END' 'PROGRAM' IDENT subproglist;
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
dcl2 : {Constante cte = new Constante();} ',' 'PARAMETER' '::' {cte.setName(getCurrentToken().getText());} IDENT '=' {cte.setValue(getCurrentToken().getText());} simpvalue {constantes.add(cte);} ctelist ';' defcte | '::' varlist ';' defvar ;
defcte : {Constante cte = new Constante();} tipo ',' 'PARAMETER' '::' {cte.setName(getCurrentToken().getText());} IDENT '=' {cte.setValue(getCurrentToken().getText());} simpvalue {constantes.add(cte);} ctelist ';' defcte | ;
defvar : tipo '::' varlist ';' defvar | ;
ctelist : {Constante cte = new Constante();} ',' {cte.setName(getCurrentToken().getText());} IDENT '=' {cte.setValue(getCurrentToken().getText());} simpvalue {constantes.add(cte);} ctelist | ;
//anadida parte opcional
simpvalue returns [String simpvalueReturn]
: NUM_INT_CONST {$simpvalueReturn = "1";}
| NUM_REAL_CONST {$simpvalueReturn = "1";}
| STRING_CONST {$simpvalueReturn = "1";}
| NUM_INT_CONST_B {$simpvalueReturn = "1";}
| NUM_INT_CONST_O {$simpvalueReturn = "1";}
| NUM_INT_CONST_H {$simpvalueReturn = "1";};
tipo returns [String type]
: 'INTEGER' {$type = "INTEGER";}
| 'REAL' {$type = "REAL";}
| 'CHARACTER' charlength {$type = "CHARACTER" + $charlength.text;} ;
charlength : '(' NUM_INT_CONST ')' | ;
//Original: varlist: IDENT init | IDENT init ',' varlist;
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
varlist : IDENT init varlist2;
varlist2 : | ',' varlist;
init : '='  simpvalue | ;

/////////////////////////////////////////////
///////////////////Procedimientos y Funciones
/////////////////////////////////////////////

decproc : {Cabecera cab = new Cabecera();} 'SUBROUTINE' {cab.setName(getCurrentToken().getText());} IDENT
 formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' {cab.checkName(getCurrentToken().getText());} IDENT
  {cab.setVars(subroutineVars); cabeceras.add(cab);};

formal_paramlist : | '(' nomparamlist ')';
//Original: nomparamlist : IDENT | IDENT ',' nomparamlist;
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
nomparamlist : IDENT nomparamlist2;
nomparamlist2 : | ',' nomparamlist;

dec_s_paramlist : {Variable var = new Variable(); var.setType(getCurrentToken().getText());} tipo ',' 'INTENT'
 '(' {var.modType(getCurrentToken().getText());} tipoparam ')' {var.setName(getCurrentToken().getText());} IDENT
  ';' {subroutineVars.add(var);} dec_s_paramlist | ;
tipoparam : 'IN' | 'OUT' | 'INOUT' ;

decfun : {Cabecera cab = new Cabecera();} 'FUNCTION' {cab.setName(getCurrentToken().getText());} IDENT
 '(' nomparamlist ')' {cab.setReturnType(getCurrentToken().getText());} tipo '::' {cab.checkName(getCurrentToken().getText());}
  IDENT ';' {cabeceras.add(cab);} dec_f_paramlist 'END' 'FUNCTION'  IDENT;
dec_f_paramlist : {Variable var = new Variable();} tipo {var.setType($tipo.type);}
 ',' 'INTENT' '(' 'IN' ')' {var.setName(getCurrentToken().getText());} IDENT ';'
  {cabeceras.get(cabeceras.size()-1).getVars().add(var);} dec_f_paramlist | ;

/////////////////////////////////////////////
////////////////Sentencias Programa Principal
/////////////////////////////////////////////

//anadida parte opcional
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
sent : IDENT '=' exp ';'| proc_call ';'
    | 'IF' '(' expcond {System.out.println($expcond.expcondReturn);} ')' sent2
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
exp returns [String expReturn]
: factor expAux {$expReturn = $factor.factorReturn + $expAux.expAuxReturn;};

exp1 returns [String exp1Return]
: factor expAux {$exp1Return = $factor.factorReturn + $expAux.expAuxReturn;};
exp2 returns [String exp2Return]
: factor expAux {$exp2Return = $factor.factorReturn + $expAux.expAuxReturn;};

expAux returns [String expAuxReturn]
: op exp expAux2 {$expAuxReturn = $op.opReturn + $exp.expReturn + $expAux2.expAux2Return;}
| {$expAuxReturn = "";};

expAux2 returns [String expAux2Return]
: op exp expAux {$expAux2Return = $op.opReturn + $exp.expReturn + $expAux.expAuxReturn;}
| {$expAux2Return = "";};

op returns [String opReturn]
: oparit {$opReturn = $oparit.oparitReturn;};
oparit returns [String oparitReturn]
: '+' {$oparitReturn = "+";}
| '-' {$oparitReturn = "-";}
| '*' {$oparitReturn = "*";}
| '/' {$oparitReturn = "/";};
//anadida parte opcional y eliminada recursividad por la izquierda
expcond returns [String expcondReturn]
: factorcond expcondAux {$expcondReturn = $factorcond.factorcondReturn + $expcondAux.expcondAuxReturn;};
expcondAux returns [String expcondAuxReturn]
: oplog expcond {$expcondAuxReturn= $oplog.oplogReturn+ $expcond.expcondReturn;}
| {$expcondAuxReturn = "";};

oplog returns [String oplogReturn]
: '.OR.' {$oplogReturn = "||";}
| '.AND.' {$oplogReturn = "&&";}
| '.EQV.' {$oplogReturn = "!^";}
| '.NEQV.' {$oplogReturn = "^";};

factorcond returns [String factorcondReturn]
: exp1 opcomp exp2 {$factorcondReturn = $exp1.exp1Return + $opcomp.opcompReturn + $exp2.exp2Return;}
| '(' expcond ')' {$factorcondReturn = "(" + $expcond.expcondReturn + ")";}
| '.NOT.' factorcond2 {$factorcondReturn = "!" + $factorcond2.factorcond2Return;}
| '.TRUE.' {$factorcondReturn = "true";}
| '.FALSE.' {$factorcondReturn = "false";};

factorcond2 returns [String factorcond2Return]
: exp1 opcomp exp2 {$factorcond2Return = $exp1.exp1Return + $opcomp.opcompReturn + $exp2.exp2Return;}
| '(' expcond ')' {$factorcond2Return = "(" + $expcond.expcondReturn + ")";}
| '.NOT.' factorcond {$factorcond2Return = ".NOT." + $factorcond.factorcondReturn;}
| '.TRUE.' {$factorcond2Return = ".TRUE.";}
| '.FALSE.' {$factorcond2Return = ".FALSE.";};

opcomp returns [String opcompReturn]
: '<' {$opcompReturn = "<";}
| '>' {$opcompReturn = ">";}
| '<=' {$opcompReturn = "<=";}
| '>=' {$opcompReturn = ">=";}
| '==' {$opcompReturn = "==";}
| '/=' {$opcompReturn = "!=";};
//Original: factor :simpvalue | '(' exp ')' | IDENT '(' exp explist ')' | IDENT;
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
factor returns [String factorReturn]
: simpvalue {$factorReturn = $simpvalue.simpvalueReturn;}
| '(' exp ')' {$factorReturn = "(" + $exp.expReturn + ")";}
| IDENT factor2 {$factorReturn = $IDENT.text + $factor2.factor2Return;};
factor2 returns [String factor2Return]
: {$factor2Return = "";}|
 '(' exp explist ')' {$factor2Return = "(" + $exp.expReturn + $explist.explistReturn + ")";};
explist returns [String explistReturn]
: ',' exp explist2 {$explistReturn = "," + $exp.expReturn + $explist2.explist2Return;}
| {$explistReturn = "";};

explist2 returns [String explist2Return]
: ',' exp explist {$explist2Return = "," + $exp.expReturn + $explist.explistReturn;}
| {$explist2Return = "";};


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

