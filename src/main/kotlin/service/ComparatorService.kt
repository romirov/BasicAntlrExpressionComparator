package service

import listener.CalculatorWalkerListener
import listener.ComparatorWalkerListener
import org.antlr.v4.runtime.tree.ParseTreeWalker
import parser.ComparatorExpressionParser

class ComparatorService {
  fun compare(expressionToCalculate: String): Boolean {
    var parseTree = ComparatorExpressionParser.parse(stringToParse = expressionToCalculate)
    val walker = ParseTreeWalker.DEFAULT
    val listener = ComparatorWalkerListener()
    walker.walk(listener, parseTree)
    return listener.getResult()
  }
}