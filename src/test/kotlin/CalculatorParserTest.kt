import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import parser.ExpressionParser
import parser.ExpressionType
import kotlin.test.assertNotNull

class CalculatorParcerTest {
  @Test
  fun parserTestsWithotException() {
    assertNotNull(
        ExpressionParser.parse(
            stringToParse = "2 * 2",
            ExpressionType.COMPUTED_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            stringToParse = "2 / 2",
            ExpressionType.COMPUTED_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            stringToParse = "2 + 2",
            ExpressionType.COMPUTED_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            stringToParse = "2 - 2",
            ExpressionType.COMPUTED_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            stringToParse = "(2 + 2) * 2",
            ExpressionType.COMPUTED_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            stringToParse = "(2 + 2) * (2 / 2)",
            ExpressionType.COMPUTED_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            stringToParse = "((2 + 2) * (2 / 2)) - 2",
            ExpressionType.COMPUTED_EXPRESSION))
    assertNotNull(
        ExpressionParser.parse(
            stringToParse = "(2 * 2 * (2 / 2)) - 2",
            ExpressionType.COMPUTED_EXPRESSION))
  }

  @Test
  fun parserTestsWithException() {
    assertThrows<Exception> {
      ExpressionParser.parse(
          stringToParse = "2 /* 2",
          ExpressionType.COMPUTED_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          stringToParse = "2 / (2 + 2",
          ExpressionType.COMPUTED_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          stringToParse = "2 = 2",
          ExpressionType.COMPUTED_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          stringToParse = "2 > 2",
          ExpressionType.COMPUTED_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          stringToParse = "2 ^> 2",
          ExpressionType.COMPUTED_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          stringToParse = "2 < 2 =",
          ExpressionType.COMPUTED_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          stringToParse = "2 + 2 = 4",
          ExpressionType.COMPUTED_EXPRESSION)
    }
    assertThrows<Exception> {
      ExpressionParser.parse(
          stringToParse = "(2 + 2) * 2 / 2)",
          ExpressionType.COMPUTED_EXPRESSION)
    }
  }
}