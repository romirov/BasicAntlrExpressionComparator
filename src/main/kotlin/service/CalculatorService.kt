package service

import listener.CalculatorWalkerListener
import org.antlr.v4.runtime.tree.ParseTreeWalker
import parser.ComparatorExpressionParser

class CalculatorService {
  fun calculate(expressionToCalculate: String): Double {
    var parseTree = ComparatorExpressionParser.parse(stringToParse = expressionToCalculate)
    val walker = ParseTreeWalker.DEFAULT
    val listener = CalculatorWalkerListener()
    while (parseTree.getChild(0).childCount != 1) {
      walker.walk(listener, parseTree)
      parseTree = ComparatorExpressionParser.parse(stringToParse = listener.getRezult())
    }
    return parseTree.text.toDouble()
  }
}