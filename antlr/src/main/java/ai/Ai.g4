grammar Ai;

ai: startai LINE_BREAK (ai_body|LINE_BREAK|DIRECTION)+ end_ai;

startai: AI_NAME PARENTHESIS_OPEN;

ai_body: LINE_BREAK? block_declaration '{' LINE_BREAK DIRECTION+|ai_body '}' LINE_BREAK?;

block_declaration: if_free_statement | random_statement | leave_free_statement | get_nth_free_statement;

if_free_statement: 'if *(' DIRECTION ')';

random_statement: '%' ratio_expr?;

ratio_expr: '(' RATIO_EXPR RATIO_EXPR+ ')';

leave_free_statement: '**';

get_nth_free_statement: NTH_FREE;

end_ai: PARENTHESIS_CLOSE WS* LINE_BREAK* EOF;

DIRECTION: ('->' | '<-' | '=>' | '<=')';' LINE_BREAK?;
NTH_FREE: '*'[0-9]+;
RATIO_EXPR: RATIO ':'?;

RATIO: [0-9][0-9]?;

AI_NAME: [a-zA-Z0-9]+;

WS: [ \t]*;

LINE_BREAK: '\r'?'\n' | '\r';
PARENTHESIS_OPEN: '(';
PARENTHESIS_CLOSE: ')';
