import org.antlr.v4.runtime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * [CalculatorGrammarParser].
 */
interface CalculatorGrammarListener : ParseTreeListener {
  /**
   * Enter a parse tree produced by [CalculatorGrammarParser.calculation].
   * @param ctx the parse tree
   */
  fun enterCalculation(ctx: CalculatorGrammarParser.CalculationContext?)

  /**
   * Exit a parse tree produced by [CalculatorGrammarParser.calculation].
   * @param ctx the parse tree
   */
  fun exitCalculation(ctx: CalculatorGrammarParser.CalculationContext?)

  /**
   * Enter a parse tree produced by the `NumberInExpression`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterNumberInExpression(ctx: CalculatorGrammarParser.NumberInExpressionContext?)

  /**
   * Exit a parse tree produced by the `NumberInExpression`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitNumberInExpression(ctx: CalculatorGrammarParser.NumberInExpressionContext?)

  /**
   * Enter a parse tree produced by the `AdditionOrSubtraction`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterAdditionOrSubtraction(ctx: CalculatorGrammarParser.AdditionOrSubtractionContext?)

  /**
   * Exit a parse tree produced by the `AdditionOrSubtraction`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitAdditionOrSubtraction(ctx: CalculatorGrammarParser.AdditionOrSubtractionContext?)

  /**
   * Enter a parse tree produced by the `MultiplicationOrDivision`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterMultiplicationOrDivision(ctx: CalculatorGrammarParser.MultiplicationOrDivisionContext?)

  /**
   * Exit a parse tree produced by the `MultiplicationOrDivision`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitMultiplicationOrDivision(ctx: CalculatorGrammarParser.MultiplicationOrDivisionContext?)

  /**
   * Enter a parse tree produced by the `MultiplicationOrDivisionParen`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterMultiplicationOrDivisionParen(ctx: CalculatorGrammarParser.MultiplicationOrDivisionParenContext?)

  /**
   * Exit a parse tree produced by the `MultiplicationOrDivisionParen`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitMultiplicationOrDivisionParen(ctx: CalculatorGrammarParser.MultiplicationOrDivisionParenContext?)

  /**
   * Enter a parse tree produced by the `AdditionOrSubtractionParen`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterAdditionOrSubtractionParen(ctx: CalculatorGrammarParser.AdditionOrSubtractionParenContext?)

  /**
   * Exit a parse tree produced by the `AdditionOrSubtractionParen`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitAdditionOrSubtractionParen(ctx: CalculatorGrammarParser.AdditionOrSubtractionParenContext?)

  /**
   * Enter a parse tree produced by the `Parentheses`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterParentheses(ctx: CalculatorGrammarParser.ParenthesesContext?)

  /**
   * Exit a parse tree produced by the `Parentheses`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitParentheses(ctx: CalculatorGrammarParser.ParenthesesContext?)

  /**
   * Enter a parse tree produced by [CalculatorGrammarParser.paren_expression].
   * @param ctx the parse tree
   */
  fun enterParen_expression(ctx: CalculatorGrammarParser.Paren_expressionContext?)

  /**
   * Exit a parse tree produced by [CalculatorGrammarParser.paren_expression].
   * @param ctx the parse tree
   */
  fun exitParen_expression(ctx: CalculatorGrammarParser.Paren_expressionContext?)

  /**
   * Enter a parse tree produced by [CalculatorGrammarParser.number].
   * @param ctx the parse tree
   */
  fun enterNumber(ctx: CalculatorGrammarParser.NumberContext?)

  /**
   * Exit a parse tree produced by [CalculatorGrammarParser.number].
   * @param ctx the parse tree
   */
  fun exitNumber(ctx: CalculatorGrammarParser.NumberContext?)
}