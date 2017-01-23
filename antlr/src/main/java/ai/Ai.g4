grammar Ai;

ai: startai LINE_BREAK (ai_body)+ end_ai;

startai: NAME_IDENTIFIER PARENTHESIS_OPEN;

ai_body: WS* (LINE_BREAK|block_declaration|assignment|reference|DIRECTION_EXPR|bracket);

bracket: '{'|'}';

//!random
reference: '!' NAME_IDENTIFIER;

block_declaration: (if_free_statement|random_statement|leave_free_statement|get_nth_free_statement);

//-> = ::PAC_POSITION
assignment: DIRECTION WS? '=' WS? '::' WS? NAME_IDENTIFIER;

if_free_statement: 'if *(' DIRECTION_EXPR ')';

random_statement: '%' ratio_expr?;

ratio_expr: '(' RATIO_EXPR RATIO_EXPR+ ')';

leave_free_statement: '**';

get_nth_free_statement: NTH_FREE;

end_ai: PARENTHESIS_CLOSE WS* LINE_BREAK* EOF;

DIRECTION_EXPR: DIRECTION';' LINE_BREAK?;

DIRECTION: ('->' | '<-' | '=>' | '<=');

NAME_IDENTIFIER: ([a-zA-Z_])+;

RATIO_EXPR: RATIO ':'?;

RATIO: DIGIT DIGIT?;

NTH_FREE: '*'DIGIT+;

DIGIT: [0-9];

WS: [ \t];

LINE_BREAK: '\r'?'\n' | '\r';
PARENTHESIS_OPEN: '(';
PARENTHESIS_CLOSE: ')';
