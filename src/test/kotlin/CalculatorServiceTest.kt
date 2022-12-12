import org.junit.jupiter.api.Test
import service.CalculatorService
import kotlin.test.assertEquals

class CalculatorServiceTest {
  private val calculatorService = CalculatorService()

  @Test
  fun simpleTest() {
    assertEquals(calculatorService.calculate("1 + 1"), 2.0)
    assertEquals(calculatorService.calculate("(1 + 1) / 2"), 1.0)
    assertEquals(calculatorService.calculate("(1 + 1) * (1 + 1)"), 4.0)
    assertEquals(calculatorService.calculate("((1 + 1) * (1 + 1) + (1 + 1)) / 2"), 3.0)
    assertEquals(calculatorService.calculate("(1 + 1) * (1 + 1) + (1 + 1) * (1 + 1) + 1"), 9.0)
    assertEquals(calculatorService.calculate("((1 + 1) * (1 + 1) + (1 + 1)) + ((1 + 1) + 1)"), 9.0)
  }
}