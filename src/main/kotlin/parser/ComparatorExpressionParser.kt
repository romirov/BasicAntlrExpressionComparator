package parser

import ComparatorGrammarLexer
import ComparatorGrammarParser
import listener.ThrowingErrorListener
import mu.KotlinLogging
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree

object ComparatorExpressionParser {
  fun parse(stringToParse: String): ParseTree {
    val logger = KotlinLogging.logger{}
    val lexerInterpreter = ComparatorGrammarLexer(CharStreams.fromString(stringToParse))
    lexerInterpreter.addErrorListener(ThrowingErrorListener())
    val tokens = CommonTokenStream(lexerInterpreter)
    val parserInterpreter = ComparatorGrammarParser(tokens)
    parserInterpreter.addErrorListener(ThrowingErrorListener())
    val parseTree: ParseTree = parserInterpreter.comparator()
    logger.info ("parse tree: " + parseTree.toStringTree(parserInterpreter))
    return parseTree
  }
}