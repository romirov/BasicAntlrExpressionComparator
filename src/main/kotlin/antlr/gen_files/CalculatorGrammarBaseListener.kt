import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.TerminalNode

/**
 * This class provides an empty implementation of [CalculatorGrammarListener],
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
open class CalculatorGrammarBaseListener : CalculatorGrammarListener {
  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterCalculation(ctx: CalculatorGrammarParser.CalculationContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitCalculation(ctx: CalculatorGrammarParser.CalculationContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterNumberInExpression(ctx: CalculatorGrammarParser.NumberInExpressionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitNumberInExpression(ctx: CalculatorGrammarParser.NumberInExpressionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterAdditionOrSubtraction(ctx: CalculatorGrammarParser.AdditionOrSubtractionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitAdditionOrSubtraction(ctx: CalculatorGrammarParser.AdditionOrSubtractionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterMultiplicationOrDivision(ctx: CalculatorGrammarParser.MultiplicationOrDivisionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitMultiplicationOrDivision(ctx: CalculatorGrammarParser.MultiplicationOrDivisionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterMultiplicationOrDivisionParen(ctx: CalculatorGrammarParser.MultiplicationOrDivisionParenContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitMultiplicationOrDivisionParen(ctx: CalculatorGrammarParser.MultiplicationOrDivisionParenContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterAdditionOrSubtractionParen(ctx: CalculatorGrammarParser.AdditionOrSubtractionParenContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitAdditionOrSubtractionParen(ctx: CalculatorGrammarParser.AdditionOrSubtractionParenContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterParentheses(ctx: CalculatorGrammarParser.ParenthesesContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitParentheses(ctx: CalculatorGrammarParser.ParenthesesContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterParen_expression(ctx: CalculatorGrammarParser.Paren_expressionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitParen_expression(ctx: CalculatorGrammarParser.Paren_expressionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterNumber(ctx: CalculatorGrammarParser.NumberContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitNumber(ctx: CalculatorGrammarParser.NumberContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterEveryRule(ctx: ParserRuleContext) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitEveryRule(ctx: ParserRuleContext) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun visitTerminal(node: TerminalNode) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun visitErrorNode(node: ErrorNode) {}
}