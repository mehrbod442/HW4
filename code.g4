grammar PasswordValidator;

password: (DIGIT | SYMBOL | UPPERCASE_LETTER | ~(' '))*;

DIGIT: [0-9];
SYMBOL: [!@#$%^&*()];
UPPERCASE_LETTER: [A-Z];

WS: [ \t\r\n]+ -> skip;