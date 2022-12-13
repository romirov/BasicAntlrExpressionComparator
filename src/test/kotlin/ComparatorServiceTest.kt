import org.junit.jupiter.api.Test
import service.ComparatorService
import kotlin.test.assertFails
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ComparatorServiceTest {
  private val comparatorService = ComparatorService()

  @Test
  fun simpleTest() {
    assertTrue { comparatorService.compare("(2) == (2)") }
    assertTrue { comparatorService.compare("((1 + 1) * (1 + 1)) > ((1 + 1) / 2)") }
    assertFalse { comparatorService.compare("(2 * (1 + 1)) <= (3 / 1)") }
    assertFalse { comparatorService.compare("(((1 + 1) * (1 + 1) + (1 + 1)) + ((1 + 1) + 1)) >= (10)") }
    assertTrue { comparatorService.compare("(01.05.2023) > (01.03.2023)") }
  }
}