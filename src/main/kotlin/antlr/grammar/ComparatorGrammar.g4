grammar ComparatorGrammar;
import CalculatorGrammar;

comparator
   : compare EOF
   ;

compare
   : left_expression=paren_expression operation=comparison right_expression=paren_expression #CompareExpression
   | left_expression=paren_date operation=comparison right_expression=paren_date             #CompareDate
   ;

paren_date
    : LPAREN date RPAREN
    ;

date
   : DATE
   ;

DATE
   : ('0' .. '3')('0' .. '9')  '.' ('0' .. '1')('0' .. '9') '.' ('0' .. '9')+
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
   : '=='
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