lexer grammar GrammarVocab;
@header{ 
	package parser.antlr4;
}


LCB: '{';
RCB: '}';

LB: '(';
RB: ')';

LSB: '[';
RSB: ']';
ASSIGN: ':=';

COLON: ':';
SEMI: ';';
ARROW: '->';
COMMA: ',';
DOT: '.';

STATE: 'State:';
TRANSITIONS: 'Transitions:'; //verifyta source
TRANSITION: 'Transition:';	//libutap source 
DELAY: 'Delay:';

MINUS: '-';
PLUS: '+';
MULT: '*';

EQ: EQ_TOKEN EQ_TOKEN?;
NE: '!=';
GE: '>=';
GT: '>';
LE: '<=';
LT: '<';

EQ_TOKEN: '=';
AND: '&&';
OR: '||';
EXCL: '!';
QM: '?';

TIMEZERO: 't(0)';
BOOL: 'true' | 'false';
OBJECTREF: (TIMEZERO | VARREF (DOT OBJECTREF)*);
VARREF: CHAR (CHAR| DIGIT)* (LSB (DIGIT+|VARREF) RSB)*;
REAL: NUM (DOT NUM)? ('e' (PLUS|MINUS) DIGIT DIGIT)?																																																																																																										;
NUM: MINUS? DIGIT+;

WS: [\t\r\n ]+ -> skip;
LINECOMMENT: '//' (~[\r\n])* -> skip; // not officially UPPAAL, but useful for debugging
BLOCKCOMMENT: '/*' .*? '*/' -> skip; // not officially UPPAAL, but useful for debugging

CHAR: [A-Za-z_#];
DIGIT: [0-9];

DIVIDE: '/';
