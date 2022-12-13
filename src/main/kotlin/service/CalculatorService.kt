package service

import listener.CalculatorWalkerListener
import org.antlr.v4.runtime.tree.ParseTreeWalker
import parser.ExpressionParser
import parser.ExpressionType

class CalculatorService {
  fun calculate(expressionToCalculate: String): Double {
    var parseTree = ExpressionParser.parse(
        stringToParse = expressionToCalculate,
        ExpressionType.COMPUTED_EXPRESSION)
    val walker = ParseTreeWalker.DEFAULT
    val listener = CalculatorWalkerListener()
    while (parseTree.getChild(0).childCount != 1) {
      walker.walk(listener, parseTree)
      parseTree = ExpressionParser.parse(
          stringToParse = listener.getRezult().replace("<EOF>", ""),
          ExpressionType.COMPUTED_EXPRESSION)
    }
    val result = parseTree.text.replace("<EOF>", "")
    return result.toDouble()
  }
}