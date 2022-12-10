grammar ComparatorGrammar;
import CalculatorGrammar;

comparator
   : compare EOF
   ;

compare
   : paren_expression comparison (paren_expression | paren_date)
   ;

paren_date
    : LPAREN date RPAREN
    ;

comparison
   : EQ
   | NE
   | GT
   | GE
   | LT
   | LE
   ;

EQ
   : '='
   ;

NE
   : '!='
   ;

GT
   : '>'
   ;

GE
   : '>='
   ;

LT
   : '<'
   ;

LE
   : '<='
   ;

date
   : DATE
   ;

DATE
   : ('0' .. '3')('0' .. '9')  '.' ('0' .. '1')('0' .. '9') '.' ('0' .. '9')+
   ;