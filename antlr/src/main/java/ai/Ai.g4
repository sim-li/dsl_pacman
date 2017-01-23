grammar Ai;

ai: startai LINE_BREAK end_ai;

startai: AI_NAME PARENTHESIS_OPEN;
end_ai: PARENTHESIS_CLOSE WS* LINE_BREAK* EOF;

//instr: WS* ANY_CHAR* WS*;
AI_NAME: ('a'..'z' | 'A'..'Z' | '0'..'9')+;


ANY_CHAR: ('a'..'z' | 'A'..'Z' | '0'..'9')+;

//WS: [ \t]*;


LINE_BREAK: '\r'?'\n' | '\r';
PARENTHESIS_OPEN: '(';
PARENTHESIS_CLOSE: ')';



//
//ai: start_ai instr* end_ai;
//
//start_ai: WS AI_NAME WS PARENTHESIS_OPEN WS LINE_BREAK;
//
//end_ai: WS PARENTHESIS_CLOSE WS LINE_BREAK* EOF;
//

//
//ANY_CHAR: [a-zA-Z0-9]*;
//WS: [ \t]*;
//AI_NAME: [a-zA-Z0-9]+;
//
//PARENTHESIS_OPEN: '(';
//PARENTHESIS_CLOSE: ')';
//
//COLON: ';' ;
//LINE_BREAK: '\r'?'\n' | '\r';
