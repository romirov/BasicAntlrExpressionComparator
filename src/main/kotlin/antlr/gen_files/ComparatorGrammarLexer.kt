package antlr.gen_files

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATN
import org.antlr.v4.runtime.atn.ATNDeserializer
import org.antlr.v4.runtime.atn.LexerATNSimulator
import org.antlr.v4.runtime.atn.PredictionContextCache
import org.antlr.v4.runtime.dfa.DFA

// Generated from java-escape by ANTLR 4.11.1
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
    const val EQ = 1
    const val NE = 2
    const val GT = 3
    const val GE = 4
    const val LT = 5
    const val LE = 6
    const val DATE = 7
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
          "EQ", "NE", "GT", "GE", "LT", "LE", "DATE", "NUMBER", "LPAREN", "RPAREN",
          "MUL", "DIV", "ADD", "SUB", "POINT", "WS"
      )
    }

    val ruleNames = makeRuleNames()
    private fun makeLiteralNames(): Array<String?> {
      return arrayOf(
          null, "'='", "'!='", "'>'", "'>='", "'<'", "'<='", null, null, "'('",
          "')'", "'*'", "'/'", "'+'", "'-'", "'.'"
      )
    }

    private val _LITERAL_NAMES = makeLiteralNames()
    private fun makeSymbolicNames(): Array<String?> {
      return arrayOf(
          null, "EQ", "NE", "GT", "GE", "LT", "LE", "DATE", "NUMBER", "LPAREN",
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
        "\u0004\u0000\u0010]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
            "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
            "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
            "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
            "\u0007\u000b\u0002\u000c\u0007\u000c\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002" +
            "\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001" +
            "\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001" +
            "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004" +
            "\u00068\b\u0006\u000b\u0006\u000c\u00069\u0001\u0007\u0004\u0007=\b\u0007" +
            "\u000b\u0007\u000c\u0007>\u0001\u0007\u0001\u0007\u0004\u0007C\b\u0007\u000b" +
            "\u0007\u000c\u0007D\u0003\u0007G\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001" +
            "\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000c\u0001\u000c\u0001\r\u0001\r\u0001" +
            "\u000e\u0001\u000e\u0001\u000f\u0004\u000fX\b\u000f\u000b\u000f\u000c\u000f" +
            "Y\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005" +
            "\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n" +
            "\u0015\u000b\u0017\u000c\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001" +
            "\u0000\u0001\u0003\u0000\t\n\r\r  a\u0000\u0001\u0001\u0000\u0000\u0000" +
            "\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000" +
            "\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000" +
            "\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f" +
            "\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013" +
            "\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017" +
            "\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b" +
            "\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f" +
            "\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000" +
            "\u0000\u0000\u0005&\u0001\u0000\u0000\u0000\u0007(\u0001\u0000\u0000\u0000" +
            "\t+\u0001\u0000\u0000\u0000\u000b-\u0001\u0000\u0000\u0000\r0\u0001\u0000" +
            "\u0000\u0000\u000f<\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000\u0000" +
            "\u0013J\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017N" +
            "\u0001\u0000\u0000\u0000\u0019P\u0001\u0000\u0000\u0000\u001bR\u0001\u0000" +
            "\u0000\u0000\u001dT\u0001\u0000\u0000\u0000\u001fW\u0001\u0000\u0000\u0000" +
            "!\"\u0005=\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005!\u0000" +
            "\u0000$%\u0005=\u0000\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0005>\u0000" +
            "\u0000\'\u0006\u0001\u0000\u0000\u0000()\u0005>\u0000\u0000)*\u0005=\u0000" +
            "\u0000*\b\u0001\u0000\u0000\u0000+,\u0005<\u0000\u0000,\n\u0001\u0000" +
            "\u0000\u0000-.\u0005<\u0000\u0000./\u0005=\u0000\u0000/\u000c\u0001\u0000" +
            "\u0000\u000001\u000203\u000012\u000209\u000023\u0005.\u0000\u000034\u0002" +
            "01\u000045\u000209\u000057\u0005.\u0000\u000068\u000209\u000076\u0001" +
            "\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000" +
            "9:\u0001\u0000\u0000\u0000:\u000e\u0001\u0000\u0000\u0000;=\u000209\u0000" +
            "<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000" +
            "\u0000>?\u0001\u0000\u0000\u0000?F\u0001\u0000\u0000\u0000@B\u0005.\u0000" +
            "\u0000AC\u000209\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000" +
            "DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000" +
            "\u0000F@\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0010\u0001" +
            "\u0000\u0000\u0000HI\u0005(\u0000\u0000I\u0012\u0001\u0000\u0000\u0000" +
            "JK\u0005)\u0000\u0000K\u0014\u0001\u0000\u0000\u0000LM\u0005*\u0000\u0000" +
            "M\u0016\u0001\u0000\u0000\u0000NO\u0005/\u0000\u0000O\u0018\u0001\u0000" +
            "\u0000\u0000PQ\u0005+\u0000\u0000Q\u001a\u0001\u0000\u0000\u0000RS\u0005" +
            "-\u0000\u0000S\u001c\u0001\u0000\u0000\u0000TU\u0005.\u0000\u0000U\u001e" +
            "\u0001\u0000\u0000\u0000VX\u0007\u0000\u0000\u0000WV\u0001\u0000\u0000" +
            "\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000" +
            "\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0006\u000f\u0000\u0000\\ \u0001" +
            "\u0000\u0000\u0000\u0006\u00009>DFY\u0001\u0006\u0000\u0000"
    val _ATN = ATNDeserializer().deserialize(_serializedATN.toCharArray())

    init {
      _decisionToDFA = arrayOfNulls(_ATN.numberOfDecisions)
      for (i in 0 until _ATN.numberOfDecisions) {
        _decisionToDFA[i] = DFA(_ATN.getDecisionState(i), i)
      }
    }
  }
}