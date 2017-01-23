grammar Ai;

ai: start_ai instr* end_ai;

start_ai: WS AINAME WS PARENTHESIS_OPEN WS LINE_BREAK;

end_ai: WS PARENTHESIS_CLOSE WS LINE_BREAK* EOF;

instr: ANY_CHAR;

ANY_CHAR: [a-zA-Z0-9]*;

AI_NAME: [a-zA-Z0-9]+;
PARENTHESIS_OPEN: '(';
PARENTHESIS_CLOSE: ')';

COLON: ';' ;
LINE_BREAK: '\r'?'\n' | '\r';
WS: [ \t]*