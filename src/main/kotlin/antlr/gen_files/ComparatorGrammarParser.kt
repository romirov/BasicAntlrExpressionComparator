package antlr.gen_files

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATN
import org.antlr.v4.runtime.atn.ATNDeserializer
import org.antlr.v4.runtime.atn.ParserATNSimulator
import org.antlr.v4.runtime.atn.PredictionContextCache
import org.antlr.v4.runtime.dfa.DFA
import org.antlr.v4.runtime.tree.ParseTreeListener
import org.antlr.v4.runtime.tree.TerminalNode

// Generated from java-escape by ANTLR 4.11.1
class ComparatorGrammarParser(input: TokenStream?) : Parser(input) {
  @Deprecated("")
  override fun getTokenNames(): Array<String?> {
    return Companion.tokenNames
  }

  override fun getVocabulary(): Vocabulary {
    return VOCABULARY
  }

  override fun getGrammarFileName(): String {
    return "java-escape"
  }

  override fun getRuleNames(): Array<String> {
    return Companion.ruleNames
  }

  override fun getSerializedATN(): String {
    return _serializedATN
  }

  override fun getATN(): ATN {
    return _ATN
  }

  class ComparatorContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    fun compare(): CompareContext {
      return getRuleContext(CompareContext::class.java, 0)
    }

    fun EOF(): TerminalNode {
      return getToken(EOF, 0)
    }

    override fun getRuleIndex(): Int {
      return RULE_comparator
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterComparator(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitComparator(this)
    }
  }

  @Throws(RecognitionException::class)
  fun comparator(): ComparatorContext {
    val _localctx = ComparatorContext(_ctx, state)
    enterRule(_localctx, 0, RULE_comparator)
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 18
        compare()
        state = 19
        match(EOF)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      exitRule()
    }
    return _localctx
  }

  class CompareContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    fun paren_expression(): List<Paren_expressionContext> {
      return getRuleContexts(
          Paren_expressionContext::class.java)
    }

    fun paren_expression(i: Int): Paren_expressionContext {
      return getRuleContext(
          Paren_expressionContext::class.java, i)
    }

    fun comparison(): ComparisonContext {
      return getRuleContext(ComparisonContext::class.java, 0)
    }

    fun paren_date(): Paren_dateContext {
      return getRuleContext(Paren_dateContext::class.java, 0)
    }

    override fun getRuleIndex(): Int {
      return RULE_compare
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterCompare(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitCompare(this)
    }
  }

  @Throws(RecognitionException::class)
  fun compare(): CompareContext {
    val _localctx = CompareContext(_ctx, state)
    enterRule(_localctx, 2, RULE_compare)
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 21
        paren_expression()
        state = 22
        comparison()
        state = 25
        _errHandler.sync(this)
        when (interpreter.adaptivePredict(_input, 0, _ctx)) {
          1 -> {
            state = 23
            paren_expression()
          }

          2 -> {
            state = 24
            paren_date()
          }

          else -> {}
        }
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      exitRule()
    }
    return _localctx
  }

  class Paren_dateContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    fun LPAREN(): TerminalNode {
      return getToken(LPAREN, 0)
    }

    fun date(): DateContext {
      return getRuleContext(DateContext::class.java, 0)
    }

    fun RPAREN(): TerminalNode {
      return getToken(RPAREN, 0)
    }

    override fun getRuleIndex(): Int {
      return RULE_paren_date
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterParen_date(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitParen_date(this)
    }
  }

  @Throws(RecognitionException::class)
  fun paren_date(): Paren_dateContext {
    val _localctx = Paren_dateContext(_ctx, state)
    enterRule(_localctx, 4, RULE_paren_date)
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 27
        match(LPAREN)
        state = 28
        date()
        state = 29
        match(RPAREN)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      exitRule()
    }
    return _localctx
  }

  class ComparisonContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    fun EQ(): TerminalNode {
      return getToken(EQ, 0)
    }

    fun NE(): TerminalNode {
      return getToken(NE, 0)
    }

    fun GT(): TerminalNode {
      return getToken(GT, 0)
    }

    fun GE(): TerminalNode {
      return getToken(GE, 0)
    }

    fun LT(): TerminalNode {
      return getToken(LT, 0)
    }

    fun LE(): TerminalNode {
      return getToken(LE, 0)
    }

    override fun getRuleIndex(): Int {
      return RULE_comparison
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterComparison(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitComparison(this)
    }
  }

  @Throws(RecognitionException::class)
  fun comparison(): ComparisonContext {
    val _localctx = ComparisonContext(_ctx, state)
    enterRule(_localctx, 6, RULE_comparison)
    var _la: Int
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 31
        _la = _input.LA(1)
        if (!(_la and 0x3f.inv() == 0 && 1L shl _la and 126L != 0L)) {
          _errHandler.recoverInline(this)
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true
          _errHandler.reportMatch(this)
          consume()
        }
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      exitRule()
    }
    return _localctx
  }

  class DateContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    fun DATE(): TerminalNode {
      return getToken(DATE, 0)
    }

    override fun getRuleIndex(): Int {
      return RULE_date
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterDate(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitDate(this)
    }
  }

  @Throws(RecognitionException::class)
  fun date(): DateContext {
    val _localctx = DateContext(_ctx, state)
    enterRule(_localctx, 8, RULE_date)
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 33
        match(DATE)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      exitRule()
    }
    return _localctx
  }

  class CalculationContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    fun expression(): List<ExpressionContext> {
      return getRuleContexts(ExpressionContext::class.java)
    }

    fun expression(i: Int): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, i)
    }

    override fun getRuleIndex(): Int {
      return RULE_calculation
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterCalculation(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitCalculation(this)
    }
  }

  @Throws(RecognitionException::class)
  fun calculation(): CalculationContext {
    val _localctx = CalculationContext(_ctx, state)
    enterRule(_localctx, 10, RULE_calculation)
    var _la: Int
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 38
        _errHandler.sync(this)
        _la = _input.LA(1)
        while (_la and 0x3f.inv() == 0 && 1L shl _la and 25344L != 0L) {
          run {
            run {
              state = 35
              expression(0)
            }
          }
          state = 40
          _errHandler.sync(this)
          _la = _input.LA(1)
        }
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      exitRule()
    }
    return _localctx
  }

  open class ExpressionContext : ParserRuleContext {
    constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {}

    override fun getRuleIndex(): Int {
      return RULE_expression
    }

    constructor() {}

    fun copyFrom(ctx: ExpressionContext?) {
      super.copyFrom(ctx)
    }
  }

  class NumberInExpressionContext(ctx: ExpressionContext?) : ExpressionContext() {
    fun number(): NumberContext {
      return getRuleContext(NumberContext::class.java, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterNumberInExpression(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitNumberInExpression(this)
    }
  }

  class AdditionOrSubtractionContext(ctx: ExpressionContext?) : ExpressionContext() {
    var left_expr: ExpressionContext? = null
    var operation: Token? = null
    var right_expr: ExpressionContext? = null
    fun expression(): List<ExpressionContext> {
      return getRuleContexts(ExpressionContext::class.java)
    }

    fun expression(i: Int): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, i)
    }

    fun ADD(): TerminalNode {
      return getToken(ADD, 0)
    }

    fun SUB(): TerminalNode {
      return getToken(SUB, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterAdditionOrSubtraction(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitAdditionOrSubtraction(this)
    }
  }

  class MultiplicationOrDivisionContext(ctx: ExpressionContext?) : ExpressionContext() {
    var left_expr: ExpressionContext? = null
    var operation: Token? = null
    var right_expr: ExpressionContext? = null
    fun expression(): List<ExpressionContext> {
      return getRuleContexts(ExpressionContext::class.java)
    }

    fun expression(i: Int): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, i)
    }

    fun MUL(): TerminalNode {
      return getToken(MUL, 0)
    }

    fun DIV(): TerminalNode {
      return getToken(DIV, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterMultiplicationOrDivision(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitMultiplicationOrDivision(this)
    }
  }

  class MultiplicationOrDivisionParenContext(ctx: ExpressionContext?) : ExpressionContext() {
    var left_expr: ExpressionContext? = null
    var operation: Token? = null
    var right_expr: ExpressionContext? = null
    fun expression(): List<ExpressionContext> {
      return getRuleContexts(ExpressionContext::class.java)
    }

    fun expression(i: Int): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, i)
    }

    fun MUL(): TerminalNode {
      return getToken(MUL, 0)
    }

    fun DIV(): TerminalNode {
      return getToken(DIV, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterMultiplicationOrDivisionParen(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitMultiplicationOrDivisionParen(this)
    }
  }

  class AdditionOrSubtractionParenContext(ctx: ExpressionContext?) : ExpressionContext() {
    var left_expr: ExpressionContext? = null
    var operation: Token? = null
    var right_expr: ExpressionContext? = null
    fun expression(): List<ExpressionContext> {
      return getRuleContexts(ExpressionContext::class.java)
    }

    fun expression(i: Int): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, i)
    }

    fun ADD(): TerminalNode {
      return getToken(ADD, 0)
    }

    fun SUB(): TerminalNode {
      return getToken(SUB, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterAdditionOrSubtractionParen(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitAdditionOrSubtractionParen(this)
    }
  }

  class ParenthesesContext(ctx: ExpressionContext?) : ExpressionContext() {
    fun paren_expression(): Paren_expressionContext {
      return getRuleContext(
          Paren_expressionContext::class.java, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterParentheses(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitParentheses(this)
    }
  }

  @Throws(RecognitionException::class)
  fun expression(): ExpressionContext {
    return expression(0)
  }

  @Throws(RecognitionException::class)
  private fun expression(_p: Int): ExpressionContext {
    val _parentctx = _ctx
    val _parentState = state
    var _localctx = ExpressionContext(_ctx, _parentState)
    var _prevctx = _localctx
    val _startState = 12
    enterRecursionRule(_localctx, 12, RULE_expression, _p)
    var _la: Int
    try {
      var _alt: Int
      enterOuterAlt(_localctx, 1)
      run {
        state = 44
        _errHandler.sync(this)
        when (_input.LA(1)) {
          LPAREN -> {
            _localctx = ParenthesesContext(_localctx)
            _ctx = _localctx
            _prevctx = _localctx
            state = 42
            paren_expression()
          }

          NUMBER, ADD, SUB -> {
            _localctx = NumberInExpressionContext(_localctx)
            _ctx = _localctx
            _prevctx = _localctx
            state = 43
            number()
          }

          else -> throw NoViableAltException(this)
        }
        _ctx.stop = _input.LT(-1)
        state = 60
        _errHandler.sync(this)
        _alt = interpreter.adaptivePredict(_input, 4, _ctx)
        while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent()
            _prevctx = _localctx
            run {
              state = 58
              _errHandler.sync(this)
              when (interpreter.adaptivePredict(_input, 3, _ctx)) {
                1 -> {
                  _localctx = MultiplicationOrDivisionParenContext(
                      ExpressionContext(
                          _parentctx,
                          _parentState))
                  (_localctx as MultiplicationOrDivisionParenContext).left_expr = _prevctx
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 46
                  if (!precpred(_ctx, 6)) throw FailedPredicateException(this, "precpred(_ctx, 6)")
                  state = 47
                  (_localctx as MultiplicationOrDivisionParenContext).operation = _input.LT(1)
                  _la = _input.LA(1)
                  if (!(_la == MUL || _la == DIV)) {
                    (_localctx as MultiplicationOrDivisionParenContext).operation =
                        _errHandler.recoverInline(this) as Token
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true
                    _errHandler.reportMatch(this)
                    consume()
                  }
                  state = 48
                  (_localctx as MultiplicationOrDivisionParenContext).right_expr = expression(7)
                }

                2 -> {
                  _localctx =
                      AdditionOrSubtractionParenContext(ExpressionContext(_parentctx, _parentState))
                  (_localctx as AdditionOrSubtractionParenContext).left_expr = _prevctx
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 49
                  if (!precpred(_ctx, 5)) throw FailedPredicateException(this, "precpred(_ctx, 5)")
                  state = 50
                  (_localctx as AdditionOrSubtractionParenContext).operation = _input.LT(1)
                  _la = _input.LA(1)
                  if (!(_la == ADD || _la == SUB)) {
                    (_localctx as AdditionOrSubtractionParenContext).operation =
                        _errHandler.recoverInline(this) as Token
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true
                    _errHandler.reportMatch(this)
                    consume()
                  }
                  state = 51
                  (_localctx as AdditionOrSubtractionParenContext).right_expr = expression(6)
                }

                3 -> {
                  _localctx =
                      MultiplicationOrDivisionContext(ExpressionContext(_parentctx, _parentState))
                  (_localctx as MultiplicationOrDivisionContext).left_expr = _prevctx
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 52
                  if (!precpred(_ctx, 3)) throw FailedPredicateException(this, "precpred(_ctx, 3)")
                  state = 53
                  (_localctx as MultiplicationOrDivisionContext).operation = _input.LT(1)
                  _la = _input.LA(1)
                  if (!(_la == MUL || _la == DIV)) {
                    (_localctx as MultiplicationOrDivisionContext).operation =
                        _errHandler.recoverInline(this) as Token
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true
                    _errHandler.reportMatch(this)
                    consume()
                  }
                  state = 54
                  (_localctx as MultiplicationOrDivisionContext).right_expr = expression(4)
                }

                4 -> {
                  _localctx =
                      AdditionOrSubtractionContext(ExpressionContext(_parentctx, _parentState))
                  (_localctx as AdditionOrSubtractionContext).left_expr = _prevctx
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 55
                  if (!precpred(_ctx, 2)) throw FailedPredicateException(this, "precpred(_ctx, 2)")
                  state = 56
                  (_localctx as AdditionOrSubtractionContext).operation = _input.LT(1)
                  _la = _input.LA(1)
                  if (!(_la == ADD || _la == SUB)) {
                    (_localctx as AdditionOrSubtractionContext).operation =
                        _errHandler.recoverInline(this) as Token
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true
                    _errHandler.reportMatch(this)
                    consume()
                  }
                  state = 57
                  (_localctx as AdditionOrSubtractionContext).right_expr = expression(3)
                }
              }
            }
          }
          state = 62
          _errHandler.sync(this)
          _alt = interpreter.adaptivePredict(_input, 4, _ctx)
        }
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      unrollRecursionContexts(_parentctx)
    }
    return _localctx
  }

  class Paren_expressionContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    var inner: ExpressionContext? = null
    fun LPAREN(): TerminalNode {
      return getToken(LPAREN, 0)
    }

    fun RPAREN(): TerminalNode {
      return getToken(RPAREN, 0)
    }

    fun expression(): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, 0)
    }

    override fun getRuleIndex(): Int {
      return RULE_paren_expression
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterParen_expression(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitParen_expression(this)
    }
  }

  @Throws(RecognitionException::class)
  fun paren_expression(): Paren_expressionContext {
    val _localctx = Paren_expressionContext(_ctx, state)
    enterRule(_localctx, 14, RULE_paren_expression)
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 63
        match(LPAREN)
        state = 64
        _localctx.inner = expression(0)
        state = 65
        match(RPAREN)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      exitRule()
    }
    return _localctx
  }

  class NumberContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    fun NUMBER(): TerminalNode {
      return getToken(NUMBER, 0)
    }

    fun ADD(): List<TerminalNode> {
      return getTokens(ADD)
    }

    fun ADD(i: Int): TerminalNode {
      return getToken(ADD, i)
    }

    fun SUB(): List<TerminalNode> {
      return getTokens(SUB)
    }

    fun SUB(i: Int): TerminalNode {
      return getToken(SUB, i)
    }

    override fun getRuleIndex(): Int {
      return RULE_number
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterNumber(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitNumber(this)
    }
  }

  @Throws(RecognitionException::class)
  fun number(): NumberContext {
    val _localctx = NumberContext(_ctx, state)
    enterRule(_localctx, 16, RULE_number)
    var _la: Int
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 70
        _errHandler.sync(this)
        _la = _input.LA(1)
        while (_la == ADD || _la == SUB) {
          run {
            run {
              state = 67
              _la = _input.LA(1)
              if (!(_la == ADD || _la == SUB)) {
                _errHandler.recoverInline(this)
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true
                _errHandler.reportMatch(this)
                consume()
              }
            }
          }
          state = 72
          _errHandler.sync(this)
          _la = _input.LA(1)
        }
        state = 73
        match(NUMBER)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      exitRule()
    }
    return _localctx
  }

  override fun sempred(_localctx: RuleContext, ruleIndex: Int, predIndex: Int): Boolean {
    when (ruleIndex) {
      6 -> return expression_sempred(_localctx as ExpressionContext, predIndex)
    }
    return true
  }

  private fun expression_sempred(_localctx: ExpressionContext, predIndex: Int): Boolean {
    when (predIndex) {
      0 -> return precpred(_ctx, 6)
      1 -> return precpred(_ctx, 5)
      2 -> return precpred(_ctx, 3)
      3 -> return precpred(_ctx, 2)
    }
    return true
  }

  init {
    _interp = ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache)
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
    const val RULE_comparator = 0
    const val RULE_compare = 1
    const val RULE_paren_date = 2
    const val RULE_comparison = 3
    const val RULE_date = 4
    const val RULE_calculation = 5
    const val RULE_expression = 6
    const val RULE_paren_expression = 7
    const val RULE_number = 8
    private fun makeRuleNames(): Array<String> {
      return arrayOf(
          "comparator", "compare", "paren_date", "comparison", "date", "calculation",
          "expression", "paren_expression", "number"
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
        "\u0004\u0001\u0010L\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
            "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
            "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
            "\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002\u0001\u0002" +
            "\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004" +
            "\u0001\u0005\u0005\u0005%\b\u0005\n\u0005\u000c\u0005(\t\u0005\u0001\u0006" +
            "\u0001\u0006\u0001\u0006\u0003\u0006-\b\u0006\u0001\u0006\u0001\u0006" +
            "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
            "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006;\b\u0006" +
            "\n\u0006\u000c\u0006>\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
            "\u0001\b\u0005\bE\b\b\n\b\u000c\bH\t\b\u0001\b\u0001\b\u0001\b\u0000\u0001" +
            "\u000c\t\u0000\u0002\u0004\u0006\b\n\u000c\u000e\u0010\u0000\u0003\u0001\u0000" +
            "\u0001\u0006\u0001\u0000\u000b\u000c\u0001\u0000\r\u000eJ\u0000\u0012\u0001" +
            "\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004\u001b\u0001" +
            "\u0000\u0000\u0000\u0006\u001f\u0001\u0000\u0000\u0000\b!\u0001\u0000" +
            "\u0000\u0000\n&\u0001\u0000\u0000\u0000\u000c,\u0001\u0000\u0000\u0000\u000e" +
            "?\u0001\u0000\u0000\u0000\u0010F\u0001\u0000\u0000\u0000\u0012\u0013\u0003" +
            "\u0002\u0001\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001" +
            "\u0000\u0000\u0000\u0015\u0016\u0003\u000e\u0007\u0000\u0016\u0019\u0003" +
            "\u0006\u0003\u0000\u0017\u001a\u0003\u000e\u0007\u0000\u0018\u001a\u0003" +
            "\u0004\u0002\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u0018\u0001" +
            "\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b\u001c\u0005" +
            "\t\u0000\u0000\u001c\u001d\u0003\b\u0004\u0000\u001d\u001e\u0005\n\u0000" +
            "\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f \u0007\u0000\u0000\u0000" +
            " \u0007\u0001\u0000\u0000\u0000!\"\u0005\u0007\u0000\u0000\"\t\u0001\u0000" +
            "\u0000\u0000#%\u0003\u000c\u0006\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000" +
            "\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u000b" +
            "\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0006\u0006\uffff" +
            "\uffff\u0000*-\u0003\u000e\u0007\u0000+-\u0003\u0010\b\u0000,)\u0001\u0000" +
            "\u0000\u0000,+\u0001\u0000\u0000\u0000-<\u0001\u0000\u0000\u0000./\n\u0006" +
            "\u0000\u0000/0\u0007\u0001\u0000\u00000;\u0003\u000c\u0006\u000712\n\u0005" +
            "\u0000\u000023\u0007\u0002\u0000\u00003;\u0003\u000c\u0006\u000645\n\u0003" +
            "\u0000\u000056\u0007\u0001\u0000\u00006;\u0003\u000c\u0006\u000478\n\u0002" +
            "\u0000\u000089\u0007\u0002\u0000\u00009;\u0003\u000c\u0006\u0003:.\u0001\u0000" +
            "\u0000\u0000:1\u0001\u0000\u0000\u0000:4\u0001\u0000\u0000\u0000:7\u0001" +
            "\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000" +
            "<=\u0001\u0000\u0000\u0000=\r\u0001\u0000\u0000\u0000><\u0001\u0000\u0000" +
            "\u0000?@\u0005\t\u0000\u0000@A\u0003\u000c\u0006\u0000AB\u0005\n\u0000\u0000" +
            "B\u000f\u0001\u0000\u0000\u0000CE\u0007\u0002\u0000\u0000DC\u0001\u0000" +
            "\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001" +
            "\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000" +
            "IJ\u0005\b\u0000\u0000J\u0011\u0001\u0000\u0000\u0000\u0006\u0019&,:<" +
            "F"
    val _ATN = ATNDeserializer().deserialize(_serializedATN.toCharArray())

    init {
      _decisionToDFA = arrayOfNulls(_ATN.numberOfDecisions)
      for (i in 0 until _ATN.numberOfDecisions) {
        _decisionToDFA[i] = DFA(_ATN.getDecisionState(i), i)
      }
    }
  }
}