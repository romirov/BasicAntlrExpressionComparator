import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import parser.ExpressionParser
import parser.ExpressionType
import kotlin.test.assertNotNull

class ComparartorExpressionParserTest {

  @Test
  fun comparartorExpressionParserWithoutErrorTest() {
    assertNotNull(ExpressionParser.parse("(25) == (25)", ExpressionType.СOMPARABLE_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            "(1 + 1) == (1 + 1)",
            ExpressionType.СOMPARABLE_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            "(1 + 1) == (1 + 1 + 1)",
            ExpressionType.СOMPARABLE_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            "((1 + 1) * 10) >= ((1 + 1) + 1)",
            ExpressionType.СOMPARABLE_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            "((2 / 5) * 10) <= ((2 + 1) * 30)",
            ExpressionType.СOMPARABLE_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            "((2 / 5) * (1 + 1)) != ((1 + 1) * (1 + 1) * (1 + 1))",
            ExpressionType.СOMPARABLE_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            "(01.07.2005) != (02.05.2005)",
            ExpressionType.СOMPARABLE_EXPRESSION))
  }

  @Test
  fun comparartorExpressionParserWithErrorTest() {
    assertThrows<Exception> {
      ExpressionParser.parse(
          "(25) == 25)",
          ExpressionType.СOMPARABLE_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          "1 + 1) == (1 + 1)",
          ExpressionType.СOMPARABLE_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          "(1  1) == (1 + 1 + 1)",
          ExpressionType.СOMPARABLE_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          "((1 + 1) * 10) === ((1 + 1) + 1)",
          ExpressionType.СOMPARABLE_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          "((2 / 5) *+ 10 <= ((2 + 1) * 30)",
          ExpressionType.СOMPARABLE_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          "((2 / 5) * (1 + 1)) != ((1 + 1) * 1 + 1) * (1 + 1))",
          ExpressionType.СOMPARABLE_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          "((1 + 1) * 10) != (02.05.2005)",
          ExpressionType.СOMPARABLE_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          "(01.07.2005) != (1 + 1)",
          ExpressionType.СOMPARABLE_EXPRESSION)
    }
  }
}