import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import parser.ComparatorExpressionParser
import kotlin.test.assertNotNull

class ComparartorExpressionParserTest {

  @Test
  fun comparartorExpressionParserWithoutErrorTest() {
    assertNotNull(ComparatorExpressionParser.parse("(25) == (25)"))
    assertNotNull(ComparatorExpressionParser.parse("(1 + 1) == (1 + 1)"))
    assertNotNull(ComparatorExpressionParser.parse("(1 + 1) == (1 + 1 + 1)"))
    assertNotNull(ComparatorExpressionParser.parse("((1 + 1) * 10) >= ((1 + 1) + 1)"))
    assertNotNull(ComparatorExpressionParser.parse("((2 / 5) * 10) <= ((2 + 1) * 30)"))
    assertNotNull(ComparatorExpressionParser.parse("((2 / 5) * (1 + 1)) != ((1 + 1) * (1 + 1) * (1 + 1))"))
    assertNotNull(ComparatorExpressionParser.parse("(01.07.2005) != (02.05.2005)"))
  }

  @Test
  fun comparartorExpressionParserWithErrorTest() {
    assertThrows<Exception> { ComparatorExpressionParser.parse("(25) == 25)") }
    assertThrows<Exception> { ComparatorExpressionParser.parse("1 + 1) == (1 + 1)") }
    assertThrows<Exception> { ComparatorExpressionParser.parse("(1  1) == (1 + 1 + 1)") }
    assertThrows<Exception> { ComparatorExpressionParser.parse("((1 + 1) * 10) === ((1 + 1) + 1)") }
    assertThrows<Exception> { ComparatorExpressionParser.parse("((2 / 5) *+ 10 <= ((2 + 1) * 30)") }
    assertThrows<Exception> { ComparatorExpressionParser.parse("((2 / 5) * (1 + 1)) != ((1 + 1) * 1 + 1) * (1 + 1))") }
    assertThrows<Exception> { ComparatorExpressionParser.parse("((1 + 1) * 10) != (02.05.2005)") }
    assertThrows<Exception> { ComparatorExpressionParser.parse("(01.07.2005) != (1 + 1)") }
  }
}