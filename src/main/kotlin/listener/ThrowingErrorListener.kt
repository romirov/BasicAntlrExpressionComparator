package listener

import exception.InlineRecognitionException
import exception.SyntaxError
import logger.Logger
import org.antlr.v4.runtime.*

class ThrowingErrorListener: BaseErrorListener() {
  private val logger = Logger.getLogger()

  override fun syntaxError(
    recognizer: Recognizer<*, *>?,
    offendingSymbol: Any?,
    line: Int,
    charPositionInLine: Int,
    message: String?,
    exception: RecognitionException?
  ) {
    val errorPosition = "$line:$charPositionInLine"
    if (exception == null) {
      val ire = InlineRecognitionException(
          message,
          recognizer,
          (recognizer as Parser).inputStream,
          recognizer.context,
          offendingSymbol as Token?
      )
      syntaxError( errorPosition, SyntaxError(message, ire))
    }
    val error = "Syntax error position in line $errorPosition message $message"
    logger.error(error)
    throw Exception(error)
  }

  fun syntaxError(errorPosition: String, exception: RecognitionException) {
    val error = "Syntax error position in line $errorPosition ${exception.message}"
    logger.error(error)
    throw Exception(exception.message)
  }
}