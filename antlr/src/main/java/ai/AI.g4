grammar AI;
ai: (expr NEWLINE)*EOF;
expr: 'Der Computer feuert auf' CHAR INT'.' | 'Der Computer feuert per Zufall auf eine noch nicht getroffene Zelle.';
NEWLINE: [\r\n]+;
INT: [1-7];
CHAR : [A-G];
WS: [ \t]+ -> skip;
