grammar FIELD;

field       : row* EOF ;

row         : value (Separator value)* (LineBreak | EOF) ;

value       : Value ;

Separator   : ';' ;

// line break maybe with preceding line feed
LineBreak   : '\r'?'\n' | '\r';

// Anything but a quoting character is allowed
Value : ('w'|'s')+ ;



//field: ((expr)* NEWLINE)*EOF;
//expr: WATER | COLON | SHIP;
//
//COLON: ';';
//WATER: 'w';
//SHIP: 's';
//
//NEWLINE: [\r\n]+;
