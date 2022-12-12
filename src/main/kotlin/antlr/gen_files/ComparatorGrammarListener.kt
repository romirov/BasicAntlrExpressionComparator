import ComparatorGrammarParser.*
import org.antlr.v4.runtime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * [ComparatorGrammarParser].
 */
interface ComparatorGrammarListener : ParseTreeListener {
  /**
   * Enter a parse tree produced by [ComparatorGrammarParser.comparator].
   * @param ctx the parse tree
   */
  fun enterComparator(ctx: ComparatorContext?)

  /**
   * Exit a parse tree produced by [ComparatorGrammarParser.comparator].
   * @param ctx the parse tree
   */
  fun exitComparator(ctx: ComparatorContext?)

  /**
   * Enter a parse tree produced by the `CompareExpression`
   * labeled alternative in [ComparatorGrammarParser.compare].
   * @param ctx the parse tree
   */
  fun enterCompareExpression(ctx: CompareExpressionContext?)

  /**
   * Exit a parse tree produced by the `CompareExpression`
   * labeled alternative in [ComparatorGrammarParser.compare].
   * @param ctx the parse tree
   */
  fun exitCompareExpression(ctx: CompareExpressionContext?)

  /**
   * Enter a parse tree produced by the `CompareDate`
   * labeled alternative in [ComparatorGrammarParser.compare].
   * @param ctx the parse tree
   */
  fun enterCompareDate(ctx: CompareDateContext?)

  /**
   * Exit a parse tree produced by the `CompareDate`
   * labeled alternative in [ComparatorGrammarParser.compare].
   * @param ctx the parse tree
   */
  fun exitCompareDate(ctx: CompareDateContext?)

  /**
   * Enter a parse tree produced by [ComparatorGrammarParser.paren_date].
   * @param ctx the parse tree
   */
  fun enterParen_date(ctx: Paren_dateContext?)

  /**
   * Exit a parse tree produced by [ComparatorGrammarParser.paren_date].
   * @param ctx the parse tree
   */
  fun exitParen_date(ctx: Paren_dateContext?)

  /**
   * Enter a parse tree produced by [ComparatorGrammarParser.date].
   * @param ctx the parse tree
   */
  fun enterDate(ctx: ComparatorGrammarParser.DateContext?)

  /**
   * Exit a parse tree produced by [ComparatorGrammarParser.date].
   * @param ctx the parse tree
   */
  fun exitDate(ctx: ComparatorGrammarParser.DateContext?)

  /**
   * Enter a parse tree produced by [ComparatorGrammarParser.comparison].
   * @param ctx the parse tree
   */
  fun enterComparison(ctx: ComparisonContext?)

  /**
   * Exit a parse tree produced by [ComparatorGrammarParser.comparison].
   * @param ctx the parse tree
   */
  fun exitComparison(ctx: ComparisonContext?)

  /**
   * Enter a parse tree produced by [ComparatorGrammarParser.calculation].
   * @param ctx the parse tree
   */
  fun enterCalculation(ctx: ComparatorGrammarParser.CalculationContext?)

  /**
   * Exit a parse tree produced by [ComparatorGrammarParser.calculation].
   * @param ctx the parse tree
   */
  fun exitCalculation(ctx: ComparatorGrammarParser.CalculationContext?)

  /**
   * Enter a parse tree produced by the `NumberInExpression`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterNumberInExpression(ctx: ComparatorGrammarParser.NumberInExpressionContext?)

  /**
   * Exit a parse tree produced by the `NumberInExpression`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitNumberInExpression(ctx: ComparatorGrammarParser.NumberInExpressionContext?)

  /**
   * Enter a parse tree produced by the `AdditionOrSubtraction`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterAdditionOrSubtraction(ctx: ComparatorGrammarParser.AdditionOrSubtractionContext?)

  /**
   * Exit a parse tree produced by the `AdditionOrSubtraction`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitAdditionOrSubtraction(ctx: ComparatorGrammarParser.AdditionOrSubtractionContext?)

  /**
   * Enter a parse tree produced by the `MultiplicationOrDivision`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterMultiplicationOrDivision(ctx: ComparatorGrammarParser.MultiplicationOrDivisionContext?)

  /**
   * Exit a parse tree produced by the `MultiplicationOrDivision`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitMultiplicationOrDivision(ctx: ComparatorGrammarParser.MultiplicationOrDivisionContext?)

  /**
   * Enter a parse tree produced by the `MultiplicationOrDivisionParen`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterMultiplicationOrDivisionParen(ctx: ComparatorGrammarParser.MultiplicationOrDivisionParenContext?)

  /**
   * Exit a parse tree produced by the `MultiplicationOrDivisionParen`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitMultiplicationOrDivisionParen(ctx: ComparatorGrammarParser.MultiplicationOrDivisionParenContext?)

  /**
   * Enter a parse tree produced by the `AdditionOrSubtractionParen`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterAdditionOrSubtractionParen(ctx: ComparatorGrammarParser.AdditionOrSubtractionParenContext?)

  /**
   * Exit a parse tree produced by the `AdditionOrSubtractionParen`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitAdditionOrSubtractionParen(ctx: ComparatorGrammarParser.AdditionOrSubtractionParenContext?)

  /**
   * Enter a parse tree produced by the `Parentheses`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterParentheses(ctx: ComparatorGrammarParser.ParenthesesContext?)

  /**
   * Exit a parse tree produced by the `Parentheses`
   * labeled alternative in [ComparatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitParentheses(ctx: ComparatorGrammarParser.ParenthesesContext?)

  /**
   * Enter a parse tree produced by [ComparatorGrammarParser.paren_expression].
   * @param ctx the parse tree
   */
  fun enterParen_expression(ctx: ComparatorGrammarParser.Paren_expressionContext?)

  /**
   * Exit a parse tree produced by [ComparatorGrammarParser.paren_expression].
   * @param ctx the parse tree
   */
  fun exitParen_expression(ctx: ComparatorGrammarParser.Paren_expressionContext?)

  /**
   * Enter a parse tree produced by [ComparatorGrammarParser.number].
   * @param ctx the parse tree
   */
  fun enterNumber(ctx: ComparatorGrammarParser.NumberContext?)

  /**
   * Exit a parse tree produced by [ComparatorGrammarParser.number].
   * @param ctx the parse tree
   */
  fun exitNumber(ctx: ComparatorGrammarParser.NumberContext?)
}