import mu.KotlinLogging
import service.ComparatorService

fun main(args: Array<String>) {
  val logger = KotlinLogging.logger{}
  readLine()?.let{logger.info(ComparatorService().compare(it).toString())}
}