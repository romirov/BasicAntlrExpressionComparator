package listener

import ComparatorGrammarBaseListener
import service.CalculatorService
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class ComparatorWalkerListener : ComparatorGrammarBaseListener() {
  private lateinit var expr: String
  private var compareReult: Boolean = false
  private val calculatorService = CalculatorService()
  private var date: String = ""

  fun getResult(): Boolean = compareReult

  override fun enterComparator(ctx: ComparatorGrammarParser.ComparatorContext?) {
    ctx?.text?.let { expr = it }
  }

  override fun exitCompareExpression(ctx: ComparatorGrammarParser.CompareExpressionContext?) {
    val leftExpression = ctx?.left_expression?.text?.let {
      calculatorService.calculate(deleteParentheses(it))
    }
    val rightExpression = ctx?.right_expression?.text?.let {
      calculatorService.calculate(deleteParentheses(it))
    }
    val operation = ctx?.operation?.text
    if(leftExpression != null && rightExpression != null && operation != null)
      compare(leftExpression.toDouble(), rightExpression.toDouble(), operation)
  }

  private fun deleteParentheses(string: String): String = string.substring(1, string.length - 1)

  override fun exitCompareDate(ctx: ComparatorGrammarParser.CompareDateContext?) {
    val leftExpression = ctx?.left_expression?.text?.let {
      getDateFormString(deleteParentheses(it))
    }
    val rightExpression = ctx?.right_expression?.text?.let {
      getDateFormString(deleteParentheses(it))
    }
    val operation = ctx?.operation?.text
    if(leftExpression != null && rightExpression != null && operation != null)
      compare(leftExpression.toEpochDay().toDouble(), rightExpression.toEpochDay().toDouble(), operation)
  }

  private fun getDateFormString(date: String) = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"))

  private fun compare(left: Double, right: Double, operation: String) {
    compareReult = when(operation){
      "==" -> left == right
      "!=" -> left != right
      ">=" -> left >= right
      ">" -> left > right
      "<=" -> left <= right
      "<" -> left < right
      else -> false
    }
  }
}