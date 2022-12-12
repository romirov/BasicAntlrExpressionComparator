package listener

import ComparatorGrammarBaseListener
import service.CalculatorService
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class ComparatorWalkerListener : ComparatorGrammarBaseListener() {
  private lateinit var expr: String
  private var compareReult: Boolean = false
  private val calculatorService = CalculatorService()

  fun getResult(): Boolean = compareReult

  override fun enterComparator(ctx: ComparatorGrammarParser.ComparatorContext?) {
    ctx?.text?.let { expr = it }
  }

  override fun exitCompareExpression(ctx: ComparatorGrammarParser.CompareExpressionContext?) {
    val rightExpression = ctx?.right_expression?.text?.let { calculatorService.calculate(it) }
    val leftExpression = ctx?.left_expression?.text?.let { calculatorService.calculate(it) }
    val operation = ctx?.operation?.text
    if(rightExpression != null && leftExpression != null && operation != null)
      compare(rightExpression, leftExpression, operation)
  }

  override fun exitCompareDate(ctx: ComparatorGrammarParser.CompareDateContext?) {
    val rightExpression = ctx?.right_expression?.text?.let { getDateFormString(it) }
    val leftExpression = ctx?.left_expression?.text?.let { getDateFormString(it) }
    val operation = ctx?.operation?.text
    if(rightExpression != null && leftExpression != null && operation != null)
      compare(rightExpression.toEpochDay().toDouble(), leftExpression.toEpochDay().toDouble(), operation)
  }

  private fun getDateFormString(date: String) = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"))

  private fun compare(right: Double, left: Double, operation: String) {
    compareReult = when(operation){
      "==" -> right == left
      "!=" -> right != left
      ">=" -> right >= left
      ">" -> right > left
      "<=" -> right <= left
      "<" -> right < left
      else -> false
    }
  }
}