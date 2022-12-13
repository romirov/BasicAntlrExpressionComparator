package parser

import CalculatorGrammarLexer
import CalculatorGrammarParser
import ComparatorGrammarLexer
import ComparatorGrammarParser
import listener.ThrowingErrorListener
import mu.KotlinLogging
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree

object ExpressionParser {
  fun parse(stringToParse: String, expressionType: ExpressionType): ParseTree {
    val logger = KotlinLogging.logger {}
    val lexerInterpreter = getGrammarLexer(stringToParse, expressionType)
    lexerInterpreter.addErrorListener(ThrowingErrorListener())
    val tokens = CommonTokenStream(lexerInterpreter)
    val parserInterpreter = getGrammarParser(tokens, expressionType)
    parserInterpreter.addErrorListener(ThrowingErrorListener())
    val parseTree: ParseTree = getParseTree(parserInterpreter)
    logger.info("parse tree: " + parseTree.toStringTree(parserInterpreter))
    return parseTree
  }

  private fun getGrammarLexer(stringToParse: String, expressionType: ExpressionType) =
      when (expressionType) {
        ExpressionType.COMPUTED_EXPRESSION -> CalculatorGrammarLexer(
            CharStreams.fromString(
                stringToParse))

        ExpressionType.СOMPARABLE_EXPRESSION -> ComparatorGrammarLexer(
            CharStreams.fromString(
                stringToParse))
      }

  private fun getGrammarParser(tokens: CommonTokenStream, expressionType: ExpressionType) =
    when (expressionType) {
      ExpressionType.COMPUTED_EXPRESSION -> CalculatorGrammarParser(tokens)
      ExpressionType.СOMPARABLE_EXPRESSION -> ComparatorGrammarParser(tokens)
    }

  private fun getParseTree(parser: Parser) = when(parser){
    is CalculatorGrammarParser -> parser.calculation()
    is ComparatorGrammarParser -> parser.comparator()
    else -> parser.context
  }
}

enum class ExpressionType {
  COMPUTED_EXPRESSION, СOMPARABLE_EXPRESSION
}