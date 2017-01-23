grammar Ai;

ai: startai LINE_BREAK (ai_body)+ end_ai;

startai: NAME_IDENTIFIER PARENTHESIS_OPEN;

ai_body: WS* (LINE_BREAK|block_declaration|DIRECTION_EXPR|'{'|'}');

block_declaration: (if_free_statement|random_statement|leave_free_statement|get_nth_free_statement);

if_free_statement: 'if *(' DIRECTION_EXPR ')';

random_statement: '%' ratio_expr?;

ratio_expr: '(' RATIO_EXPR RATIO_EXPR+ ')';

leave_free_statement: '**';

get_nth_free_statement: NTH_FREE;

end_ai: PARENTHESIS_CLOSE WS* LINE_BREAK* EOF;


DIRECTION_EXPR: DIRECTION';' LINE_BREAK?;

DIRECTION: ('->' | '<-' | '=>' | '<=');

NAME_IDENTIFIER: [a-zA-Z0-9_]+;

RATIO_EXPR: RATIO ':'?;

RATIO: [0-9][0-9]?;

NTH_FREE: '*'[0-9]+;

WS: [ \t];

LINE_BREAK: '\r'?'\n' | '\r';
PARENTHESIS_OPEN: '(';
PARENTHESIS_CLOSE: ')';
