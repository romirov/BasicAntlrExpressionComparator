import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATN
import org.antlr.v4.runtime.atn.ATNDeserializer
import org.antlr.v4.runtime.atn.LexerATNSimulator
import org.antlr.v4.runtime.atn.PredictionContextCache
import org.antlr.v4.runtime.dfa.DFA

class ComparatorGrammarLexer(input: CharStream?) : Lexer(input) {
  @Deprecated("")
  override fun getTokenNames(): Array<String?> {
    return Companion.tokenNames
  }

  override fun getVocabulary(): Vocabulary {
    return VOCABULARY
  }

  override fun getGrammarFileName(): String {
    return "ComparatorGrammar.g4"
  }

  override fun getRuleNames(): Array<String> {
    return Companion.ruleNames
  }

  override fun getSerializedATN(): String {
    return _serializedATN
  }

  override fun getChannelNames(): Array<String> {
    return Companion.channelNames
  }

  override fun getModeNames(): Array<String> {
    return Companion.modeNames
  }

  override fun getATN(): ATN {
    return _ATN
  }

  init {
    _interp = LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache)
  }

  companion object {
    init {
      RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION)
    }

    protected val _decisionToDFA: Array<DFA?>
    protected val _sharedContextCache = PredictionContextCache()
    const val DATE = 1
    const val EQ = 2
    const val NE = 3
    const val GT = 4
    const val GE = 5
    const val LT = 6
    const val LE = 7
    const val NUMBER = 8
    const val LPAREN = 9
    const val RPAREN = 10
    const val MUL = 11
    const val DIV = 12
    const val ADD = 13
    const val SUB = 14
    const val POINT = 15
    const val WS = 16
    var channelNames = arrayOf(
        "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    )
    var modeNames = arrayOf(
        "DEFAULT_MODE"
    )

    private fun makeRuleNames(): Array<String> {
      return arrayOf(
          "DATE", "EQ", "NE", "GT", "GE", "LT", "LE", "NUMBER", "LPAREN", "RPAREN",
          "MUL", "DIV", "ADD", "SUB", "POINT", "WS"
      )
    }

    val ruleNames = makeRuleNames()
    private fun makeLiteralNames(): Array<String?> {
      return arrayOf(
          null, null, "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", null, "'('",
          "')'", "'*'", "'/'", "'+'", "'-'", "'.'"
      )
    }

    private val _LITERAL_NAMES = makeLiteralNames()
    private fun makeSymbolicNames(): Array<String?> {
      return arrayOf(
          null, "DATE", "EQ", "NE", "GT", "GE", "LT", "LE", "NUMBER", "LPAREN",
          "RPAREN", "MUL", "DIV", "ADD", "SUB", "POINT", "WS"
      )
    }

    private val _SYMBOLIC_NAMES = makeSymbolicNames()
    val VOCABULARY: Vocabulary = VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES)

    @Deprecated("Use {@link #VOCABULARY} instead.")
    val tokenNames: Array<String?>

    init {
      tokenNames = arrayOfNulls(_SYMBOLIC_NAMES.size)
      for (i in tokenNames.indices) {
        tokenNames[i] = VOCABULARY.getLiteralName(i)
        if (tokenNames[i] == null) {
          tokenNames[i] = VOCABULARY.getSymbolicName(i)
        }
        if (tokenNames[i] == null) {
          tokenNames[i] = "<INVALID>"
        }
      }
    }

    const val _serializedATN =
        "\u0004\u0000\u0010^\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
            "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
            "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
            "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
            "\u0007\u000b\u0002\u000c\u0007\u000c\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002" +
            "\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001" +
            "\u0000\u0001\u0000\u0001\u0000\u0004\u0000)\b\u0000\u000b\u0000\u000c\u0000" +
            "*\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002" +
            "\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005" +
            "\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007" +
            ">\b\u0007\u000b\u0007\u000c\u0007?\u0001\u0007\u0001\u0007\u0004\u0007D\b" +
            "\u0007\u000b\u0007\u000c\u0007E\u0003\u0007H\b\u0007\u0001\b\u0001\b\u0001" +
            "\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000c\u0001\u000c\u0001" +
            "\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000fY\b\u000f\u000b" +
            "\u000f\u000c\u000fZ\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001" +
            "\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f" +
            "\b\u0011\t\u0013\n\u0015\u000b\u0017\u000c\u0019\r\u001b\u000e\u001d\u000f" +
            "\u001f\u0010\u0001\u0000\u0001\u0003\u0000\t\n\r\r  b\u0000\u0001\u0001" +
            "\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001" +
            "\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000" +
            "\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000" +
            "\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000" +
            "\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000" +
            "\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000" +
            "\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000" +
            "\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000" +
            "\u0003,\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00072" +
            "\u0001\u0000\u0000\u0000\t4\u0001\u0000\u0000\u0000\u000b7\u0001\u0000" +
            "\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000" +
            "\u0011I\u0001\u0000\u0000\u0000\u0013K\u0001\u0000\u0000\u0000\u0015M" +
            "\u0001\u0000\u0000\u0000\u0017O\u0001\u0000\u0000\u0000\u0019Q\u0001\u0000" +
            "\u0000\u0000\u001bS\u0001\u0000\u0000\u0000\u001dU\u0001\u0000\u0000\u0000" +
            "\u001fX\u0001\u0000\u0000\u0000!\"\u000203\u0000\"#\u000209\u0000#$\u0005" +
            ".\u0000\u0000$%\u000201\u0000%&\u000209\u0000&(\u0005.\u0000\u0000\')" +
            "\u000209\u0000(\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*(" +
            "\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0002\u0001\u0000" +
            "\u0000\u0000,-\u0005=\u0000\u0000-.\u0005=\u0000\u0000.\u0004\u0001\u0000" +
            "\u0000\u0000/0\u0005!\u0000\u000001\u0005=\u0000\u00001\u0006\u0001\u0000" +
            "\u0000\u000023\u0005>\u0000\u00003\b\u0001\u0000\u0000\u000045\u0005>" +
            "\u0000\u000056\u0005=\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005<" +
            "\u0000\u00008\u000c\u0001\u0000\u0000\u00009:\u0005<\u0000\u0000:;\u0005=" +
            "\u0000\u0000;\u000e\u0001\u0000\u0000\u0000<>\u000209\u0000=<\u0001\u0000" +
            "\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001" +
            "\u0000\u0000\u0000@G\u0001\u0000\u0000\u0000AC\u0005.\u0000\u0000BD\u0002" +
            "09\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000" +
            "\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GA\u0001" +
            "\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0010\u0001\u0000\u0000" +
            "\u0000IJ\u0005(\u0000\u0000J\u0012\u0001\u0000\u0000\u0000KL\u0005)\u0000" +
            "\u0000L\u0014\u0001\u0000\u0000\u0000MN\u0005*\u0000\u0000N\u0016\u0001" +
            "\u0000\u0000\u0000OP\u0005/\u0000\u0000P\u0018\u0001\u0000\u0000\u0000" +
            "QR\u0005+\u0000\u0000R\u001a\u0001\u0000\u0000\u0000ST\u0005-\u0000\u0000" +
            "T\u001c\u0001\u0000\u0000\u0000UV\u0005.\u0000\u0000V\u001e\u0001\u0000" +
            "\u0000\u0000WY\u0007\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001" +
            "\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000" +
            "[\\\u0001\u0000\u0000\u0000\\]\u0006\u000f\u0000\u0000] \u0001\u0000\u0000" +
            "\u0000\u0006\u0000*?EGZ\u0001\u0006\u0000\u0000"
    val _ATN = ATNDeserializer().deserialize(_serializedATN.toCharArray())

    init {
      _decisionToDFA = arrayOfNulls(_ATN.numberOfDecisions)
      for (i in 0 until _ATN.numberOfDecisions) {
        _decisionToDFA[i] = DFA(_ATN.getDecisionState(i), i)
      }
    }
  }
}