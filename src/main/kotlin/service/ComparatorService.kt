package service

import listener.ComparatorWalkerListener
import org.antlr.v4.runtime.tree.ParseTreeWalker
import parser.ExpressionParser
import parser.ExpressionType

class ComparatorService {
  fun compare(expressionToCalculate: String): Boolean {
    var parseTree = ExpressionParser.parse(stringToParse = expressionToCalculate, ExpressionType.СOMPARABLE_EXPRESSION)
    val walker = ParseTreeWalker.DEFAULT
    val listener = ComparatorWalkerListener()
    walker.walk(listener, parseTree)
    return listener.getResult()
  }
}