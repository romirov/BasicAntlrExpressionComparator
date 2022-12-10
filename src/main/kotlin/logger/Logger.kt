package logger

import mu.KotlinLogging

object Logger {
  fun getLogger() = KotlinLogging.logger{}
}