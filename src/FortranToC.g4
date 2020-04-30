grammar FortranToC;

@parser::members {
	ArrayList<Constante> constantes = new ArrayList<>();
	ArrayList<Cabecera> cabeceras = new ArrayList<>();
	ArrayList<Variable> functionVarList = new ArrayList<>();
	ArrayList<String> sentencias = new ArrayList<>();
	Programa programa = new Programa();

	String varListToString (ArrayList<Variable> vars) {
	    String result = "";
	    int size = vars.size();
	    for(int i=0;i<size;i++) {
            result += vars.get(i).toString();
            result = result.replace('*','&');
            if (i < (size-1))
                result += " , ";
        }
        return result;
	}
}

/////////////////////////////////////////////
/////////////////////////////////Primera Zona
/////////////////////////////////////////////

prg : prgmal | 'PROGRAM'  IDENT ';' dcllist cabecera {programa.setCabeceras(cabeceras);} sent sentlist
'END' 'PROGRAM' {sentencias.add("}");} IDENT subproglist {programa.setConstantes(constantes); programa.setSentencias(sentencias); programa.printPrograma();};
//Un ejemplo de error controlado desde la especificación léxica
prgmal : 'program' IDENT ';' dcllist cabecera sent sentlist 'END' 'program' IDENT subproglist {System.err.println("PROGRAM debe ir con mayusculas");};
//Original: dcllist : | dcllist dcl;
//Cambiado para que no sea recursiva por la izqda y lograr LL(1)
dcllist : dcl dcllist | ;
cabecera : cabeceramal | 'INTERFACE' cablist 'END' 'INTERFACE' | ;
//Otro ejemplo de error controlado desde la especificación léxica
cabeceramal : 'interface' cablist 'END' 'interface' {System.err.println("INTERFACE debe ir con mayusculas");};
cablist : decproc decsubprog | decfun decsubprog ;
decsubprog : decproc decsubprog | decfun decsubprog | ;
sentlist: sent sentlist | ;

/////////////////////////////////////////////
///////////////Zona de Constantes y Variables
/////////////////////////////////////////////

//Original: dcl: defcte | defvar;
//Cambiado para evitar que se acepte cadena vacia, se fuerza a que al menos reconozca una vez,
//o bien defcte, o bien defvar
dcl : tipo dcl2[$tipo.tipoValue, $tipo.charSize];
dcl2[String tipoValue, String charSize]
    : ',' 'PARAMETER' '::' IDENT '=' simpvalue {constantes.add(new Constante($IDENT.text, $simpvalue.simpvalueValue));} ctelist ';' defcte
    | '::' varlist[$tipoValue, $charSize] ';' defvar ;
defcte : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue {constantes.add(new Constante($IDENT.text, $simpvalue.simpvalueValue));} ctelist ';' defcte | ;
defvar : tipo '::' varlist[$tipo.tipoValue, $tipo.charSize] ';' defvar | ;
ctelist : ',' IDENT '=' simpvalue {constantes.add(new Constante($IDENT.text, $simpvalue.simpvalueValue));} ctelist | ;
//anadida parte opcional
simpvalue returns [String simpvalueValue]
    : NUM_INT_CONST {$simpvalueValue = $NUM_INT_CONST.text;}
    | NUM_REAL_CONST {$simpvalueValue = $NUM_REAL_CONST.text;}
    | STRING_CONST {$simpvalueValue = $STRING_CONST.text;}
    | NUM_INT_CONST_B {$simpvalueValue = $NUM_INT_CONST_B.text;}
    | NUM_INT_CONST_O {$simpvalueValue = $NUM_INT_CONST_O.text;}
    | NUM_INT_CONST_H {$simpvalueValue = $NUM_INT_CONST_H.text;};
tipo returns [String tipoValue, String charSize]
    : 'INTEGER' {$tipoValue = "int"; $charSize = "";}
    | 'REAL' {$tipoValue = "float"; $charSize = "";}
    | 'CHARACTER' charlength {$tipoValue = "char"; $charSize = $charlength.charlengthValue;} ;
charlength returns [String charlengthValue]
    : '(' NUM_INT_CONST ')' {$charlengthValue = "[" + $NUM_INT_CONST.text + "]";}
    | {$charlengthValue = "";};
//Original: varlist: IDENT init | IDENT init ',' varlist;
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
varlist[String tipoValue, String charSize]
    : IDENT init {sentencias.add($tipoValue + " " + $IDENT.text + $charSize + $init.initValue + ";");} varlist2[$tipoValue, $charSize];
varlist2[String tipoValue, String charSize]  : | ',' varlist[$tipoValue, $charSize];
init returns [String initValue]
    : '='  simpvalue {$initValue = " = " + $simpvalue.simpvalueValue;}
    | {$initValue = "";};

/////////////////////////////////////////////
///////////////////Procedimientos y Funciones
/////////////////////////////////////////////

decproc : 'SUBROUTINE' IDENT1=IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT2=IDENT
  {Cabecera cab = new Cabecera($IDENT1.text, $IDENT2.text, "void"); cab.setVars(functionVarList);
  functionVarList = new ArrayList<>(); cabeceras.add(cab);};

formal_paramlist : | '(' nomparamlist ')';
//Original: nomparamlist : IDENT | IDENT ',' nomparamlist;
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
nomparamlist : IDENT nomparamlist2;
nomparamlist2 : | ',' nomparamlist;

dec_s_paramlist : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';'
 {functionVarList.add(new Variable($tipoparam.tipoparamValue + $IDENT.text, $tipo.tipoValue, $tipo.charSize));} dec_s_paramlist | ;
tipoparam returns [String tipoparamValue]
    : 'IN' {$tipoparamValue = "";}
    | 'OUT' {$tipoparamValue = "*";}
    | 'INOUT' {$tipoparamValue = "*";};

decfun : 'FUNCTION' IDENT1=IDENT '(' nomparamlist ')' tipo '::' IDENT2=IDENT ';' dec_f_paramlist
 {Cabecera cab = new Cabecera($IDENT1.text, $IDENT2.text, $tipo.tipoValue); cab.setVars(functionVarList);
 functionVarList = new ArrayList<>(); cabeceras.add(cab);} 'END' 'FUNCTION' IDENT ;

dec_f_paramlist : tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';'
 {functionVarList.add(new Variable($IDENT.text, $tipo.tipoValue, $tipo.charSize));} dec_f_paramlist | ;

/////////////////////////////////////////////
////////////////Sentencias Programa Principal
/////////////////////////////////////////////

//anadida parte opcional
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
sent : IDENT '=' exp ';' {sentencias.add($IDENT.text + " = " + $exp.expValue + ";");}
    | proc_call ';' {sentencias.add($proc_call.proc_callValue);}
    | 'IF' '(' expcond {sentencias.add("if ( " + $expcond.expcondValue + " ) {");} ')' sent2
    | 'DO' sent4
    | 'SELECT' 'CASE' '(' exp ')' {sentencias.add("switch (" + $exp.expValue + ") {");} casos 'END' 'SELECT' {sentencias.add("}");};
sent2 : sent {sentencias.add("}");}
    | 'THEN' sentlist sent3 ;
sent3 : 'ENDIF' {sentencias.add("}");}
    | {sentencias.add("} else {");} 'ELSE' sentlist 'ENDIF' {sentencias.add("}");};
sent4 : 'WHILE' '(' expcond ')' {sentencias.add("while ( " + $expcond.expcondValue + " ) {");} sentlist 'ENDDO' {sentencias.add("}");}
    | IDENT '=' doval1=doval ',' doval2=doval ',' doval3=doval {sentencias.add("for ( " + $IDENT.text + "=" + $doval1.dovalValue + " ; "
     + $IDENT.text + "!=" + $doval2.dovalValue + " ; " + $IDENT.text + "=" + $IDENT.text + "+" + $doval3.dovalValue + " ) {");}
    sentlist 'ENDDO' {sentencias.add("}");};
doval returns [String dovalValue]
    : NUM_INT_CONST {$dovalValue = $NUM_INT_CONST.text;}
    | IDENT {$dovalValue = $IDENT.text;};
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
casos : 'CASE' casos2 | ;
casos2
    : '(' etiquetas ')' sentlist {sentencias.add("break;");} casos
    | 'DEFAULT' {sentencias.add("default :");} sentlist;
//Cambiado para ser LL(1), ya que dos producciones de una misma regla no pueden tener el mismo director
etiquetas
    : simpvalue etiquetas2[$simpvalue.simpvalueValue]
    | ':' simpvalue  {sentencias.add("case < " + $simpvalue.simpvalueValue + " :");};
etiquetas2[String simpvalueValue]
    : listaetiquetas {sentencias.add("case " + $simpvalueValue + " :");}
    | ':' etiquetas3[$simpvalueValue] ;
etiquetas3[String simpvalueValue1]
    : simpvalue {sentencias.add("case " + $simpvalueValue1 + " to " + $simpvalue.simpvalueValue + " :");}
    | {sentencias.add("case > " + $simpvalueValue1 + " :");};
listaetiquetas : ',' simpvalue {sentencias.add("case " + $simpvalue.simpvalueValue + " :");} listaetiquetas | ;
//Original: exp: exp op exp| factor;
//Cambiado para que no sea recursiva por la izqda y lograr LL(1)
exp returns [String expValue] : factor expAux {$expValue = $factor.factorValue + $expAux.expAuxValue;};

expAux returns [String expAuxValue]
    : op exp expAux2=expAux {$expAuxValue = $op.opValue + $exp.expValue + $expAux2.expAuxValue;}
    | {$expAuxValue = "";};

op returns [String opValue]: oparit {$opValue = $oparit.oparitValue;};
oparit returns [String oparitValue]
    : '+' {$oparitValue = " + ";}
    | '-' {$oparitValue = " - ";}
    | '*' {$oparitValue = " * ";}
    | '/' {$oparitValue = " / ";};
//anadida parte opcional y eliminada recursividad por la izquierda
expcond returns [String expcondValue]: factorcond expcondAux {$expcondValue = $factorcond.factorcondValue + $expcondAux.expcondAuxValue;};
expcondAux returns [String expcondAuxValue]
    : oplog expcond {$expcondAuxValue= $oplog.oplogValue + $expcond.expcondValue;}
    | {$expcondAuxValue = "";};

oplog returns [String oplogValue]
    : '.OR.' {$oplogValue = " || ";}
    | '.AND.' {$oplogValue = " && ";}
    | '.EQV.' {$oplogValue = " !^ ";}
    | '.NEQV.' {$oplogValue = " ^ ";};

factorcond returns [String factorcondValue]
    : exp1=exp opcomp exp2=exp {$factorcondValue = $exp1.expValue + $opcomp.opcompValue + $exp2.expValue;}
    | '(' expcond ')' {$factorcondValue = "(" + $expcond.expcondValue + ")";}
    | '.NOT.' factorcond2=factorcond {$factorcondValue = "!" + $factorcond2.factorcondValue;}
    | '.TRUE.' {$factorcondValue = "true";}
    | '.FALSE.' {$factorcondValue = "false";};

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
    : {$factor2Value = "";}
    | '(' exp explist ')' {$factor2Value = "(" + $exp.expValue + $explist.explistValue + ")";};
explist returns [String explistValue]
    : ',' exp explist2=explist {$explistValue = "," + $exp.expValue + $explist2.explistValue;}
    | {$explistValue = "";};

/////////////////////////////////////////////
////Implementacion Funciones y Procedimientos
/////////////////////////////////////////////

proc_call returns [String proc_callValue]
    : 'CALL' IDENT subpparamlist {$proc_callValue  = $IDENT.text + " (" + $subpparamlist.subpparamlistValue + ") ;"; };
subpparamlist returns [String subpparamlistValue]
    : '(' exp explist ')' {$subpparamlistValue = $exp.expValue + $explist.explistValue;}
    | {$subpparamlistValue = "";};
subproglist : codproc subproglist | codfun subproglist | ;
codproc : 'SUBROUTINE' IDENT {functionVarList = new ArrayList<>();} formal_paramlist dec_s_paramlist
    {sentencias.add("void " + $IDENT.text + " (" + varListToString(functionVarList) + ") {");} dcllist
    sent sentlist 'END' 'SUBROUTINE' IDENT {sentencias.add("}");};
codfun : 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT ';' {functionVarList = new ArrayList<>();} dec_f_paramlist
    {sentencias.add($tipo.tipoValue + " " + $IDENT.text + " (" + varListToString(functionVarList) + ") {");} dcllist sent sentlist IDENT '=' exp
    {sentencias.add("return " + $exp.expValue);} ';' 'END' 'FUNCTION' IDENT {sentencias.add("}");};

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

