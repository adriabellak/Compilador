grammar baby_duck;

@parser::header {
from funciones import *
}
// antlr4 -Dlanguage=Python3 baby_duck.g4  
programa    : 'program' ID ';' vars? funcs* 'main' body 'end' ;
vars        : 'var' (varlist ':' TYPE {agregar_vars($varlist.text, $TYPE.text)} ';')+ ;
varlist     : ID (',' ID)*;
body        : '{' statement* '}' ;
statement   : assign
            | condition
            | cycle
            | f_call
            | print
            ;
print       : 'print' '(' (expresion {print_expresion()} | CTE_STRING) (',' (expresion {print_expresion()} | CTE_STRING))* ')' ';' ;
assign      : ID {push_operando($ID.text, 'ID')} EQ {push_operador('=')} expresion {pop_assign()}';' ;
cycle       : 'while' {cycle1()} body 'do' '(' expresion ')' {cycle2()} ';' ;
condition   : 'if' '(' expresion ')' {if1()} body ('else' {if3()} body)? ';' {if2()};
expresion   : exp ( oper_rel {punto8($oper_rel.text)} exp {punto9()})? ;
oper_rel    : ('<' | '>' | '!=') ;
exp         : termino {punto4()} (OPER_EXP {punto2($OPER_EXP.text)} termino {punto4()})* ;
termino     : factor {punto5()} (OPER_TERM {punto3($OPER_TERM.text)} factor {punto5()})* ;
factor      : '(' {punto6()} expresion ')' {punto7()}
            | OPER_EXP? (ID {punto1($ID.text, 'ID', $OPER_EXP.text)} | cte {punto1($cte.text, 'cte', $OPER_EXP.text)})
            ;
funcs       : 'void' ID params {nueva_func($ID.text, $params.text)} '[' vars? body ']' ';' ;
params      : '(' ( (ID ':' TYPE) (',' ID ':' TYPE)* )? ')' ;
f_call      : ID '(' (expresion (',' expresion)*)? ')' ';' ;
cte         : CTE_INT | CTE_FLOAT ;
// ---------------- tokens
EQ          : '=';
OPER_EXP    : ('+'|'-');
OPER_TERM   : ('*'|'/');
TYPE        : ('float'|'int') ;
ID          : ([A-Za-z_]+[0-9]*)+ ;
CTE_INT     : [0-9]+ ;
CTE_FLOAT   : [0-9]+('.'[0-9]+)? ;
CTE_STRING  : '"' .*? '"';
WHITESPACE  : [ \t\n\r]+ -> skip;