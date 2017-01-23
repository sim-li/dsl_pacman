grammar Ai;

ai: startai LINE_BREAK (ai_body)+ end_ai;

startai: NAME_IDENTIFIER PARENTHESIS_OPEN;

ai_body: WS* (LINE_BREAK|COMMENT|bracket_close|block_declaration|assignment|reference|DIRECTION_EXPR);

bracket_open: '{';

bracket_close: '}';

//!random
reference: '!' NAME_IDENTIFIER;

block_declaration: (if_free_statement|else_free_statement|random_statement|leave_free_statement|get_nth_free_statement);

//-> = ::PAC_POSITION
assignment: DIRECTION WS? '=' WS? '::' WS? NAME_IDENTIFIER;

if_free_statement: 'if *(' DIRECTION ')' WS* bracket_open;

else_free_statement: 'else' WS* bracket_open;

random_statement: '%' ratio_expr? WS* bracket_open;

ratio_expr: '(' RATIO_EXPR RATIO_EXPR+ ')';

leave_free_statement: '**' WS* bracket_open;

get_nth_free_statement: NTH_FREE WS* bracket_open;

end_ai: PARENTHESIS_CLOSE WS* LINE_BREAK* EOF;

COMMENT: WS*'#'(WS|NAME_IDENTIFIER|DIGIT)*;

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
