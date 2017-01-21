grammar Field;

field       : row* EOF ;

row         : value (Separator value)* (LineBreak | EOF) ;

value       : Value ;

Separator   : ';' ;

LineBreak   : '\r'?'\n' | '\r';

Value : ('0'|'1'|'2'|'3')+ ;


