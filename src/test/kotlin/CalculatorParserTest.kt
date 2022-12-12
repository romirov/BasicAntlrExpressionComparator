import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import parser.ComparatorExpressionParser
import kotlin.test.assertNotNull

class CalculatorParcerTest {
  @Test
  fun parserTestsWithotException(){
    assertNotNull(ComparatorExpressionParser.parse(stringToParse = "2 * 2"))
    assertNotNull(ComparatorExpressionParser.parse(stringToParse = "2 / 2"))
    assertNotNull(ComparatorExpressionParser.parse(stringToParse = "2 + 2"))
    assertNotNull(ComparatorExpressionParser.parse(stringToParse = "2 - 2"))
    assertNotNull(ComparatorExpressionParser.parse(stringToParse = "(2 + 2) * 2"))
    assertNotNull(ComparatorExpressionParser.parse(stringToParse = "(2 + 2) * (2 / 2)"))
    assertNotNull(ComparatorExpressionParser.parse(stringToParse = "((2 + 2) * (2 / 2)) - 2"))
    assertNotNull(ComparatorExpressionParser.parse(stringToParse = "(2 ^ 2 * (2 / 2)) - 2"))
  }

  @Test
  fun parserTestsWithException(){
    assertThrows<Exception> {  ComparatorExpressionParser.parse(stringToParse = "2 /* 2") }
    assertThrows<Exception> {  ComparatorExpressionParser.parse(stringToParse = "2 / (2 + 2") }
    assertThrows<Exception> {  ComparatorExpressionParser.parse(stringToParse = "2 = 2") }
    assertThrows<Exception> {  ComparatorExpressionParser.parse(stringToParse = "2 > 2") }
    assertThrows<Exception> {  ComparatorExpressionParser.parse(stringToParse = "2 ^> 2") }
    assertThrows<Exception> {  ComparatorExpressionParser.parse(stringToParse = "2 < 2 =") }
    assertThrows<Exception> {  ComparatorExpressionParser.parse(stringToParse = "2 + 2 = 4") }
    assertThrows<Exception> {  ComparatorExpressionParser.parse(stringToParse = "(2 + 2) * 2 / 2)") }
  }
}