import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATN
import org.antlr.v4.runtime.atn.ATNDeserializer
import org.antlr.v4.runtime.atn.ParserATNSimulator
import org.antlr.v4.runtime.atn.PredictionContextCache
import org.antlr.v4.runtime.dfa.DFA
import org.antlr.v4.runtime.tree.ParseTreeListener
import org.antlr.v4.runtime.tree.TerminalNode

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

  open class CompareContext : ParserRuleContext {
    constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {}

    override fun getRuleIndex(): Int {
      return RULE_compare
    }

    constructor() {}

    fun copyFrom(ctx: CompareContext?) {
      super.copyFrom(ctx)
    }
  }

  class CompareExpressionContext(ctx: CompareContext?) : CompareContext() {
    var left_expression: Paren_expressionContext? = null
    var operation: ComparisonContext? = null
    var right_expression: Paren_expressionContext? = null
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

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterCompareExpression(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitCompareExpression(this)
    }
  }

  class CompareDateContext(ctx: CompareContext?) : CompareContext() {
    var left_expression: Paren_dateContext? = null
    var operation: ComparisonContext? = null
    var right_expression: Paren_dateContext? = null
    fun paren_date(): List<Paren_dateContext> {
      return getRuleContexts(Paren_dateContext::class.java)
    }

    fun paren_date(i: Int): Paren_dateContext {
      return getRuleContext(Paren_dateContext::class.java, i)
    }

    fun comparison(): ComparisonContext {
      return getRuleContext(ComparisonContext::class.java, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.enterCompareDate(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is ComparatorGrammarListener) listener.exitCompareDate(this)
    }
  }

  @Throws(RecognitionException::class)
  fun compare(): CompareContext {
    var _localctx = CompareContext(_ctx, state)
    enterRule(_localctx, 2, RULE_compare)
    try {
      state = 29
      _errHandler.sync(this)
      when (interpreter.adaptivePredict(_input, 0, _ctx)) {
        1 -> {
          _localctx = CompareExpressionContext(_localctx)
          enterOuterAlt(_localctx, 1)
          run {
            state = 21
            (_localctx as CompareExpressionContext).left_expression = paren_expression()
            state = 22
            (_localctx as CompareExpressionContext).operation = comparison()
            state = 23
            (_localctx as CompareExpressionContext).right_expression = paren_expression()
          }
        }

        2 -> {
          _localctx = CompareDateContext(_localctx)
          enterOuterAlt(_localctx, 2)
          run {
            state = 25
            _localctx.left_expression = paren_date()
            state = 26
            _localctx.operation = comparison()
            state = 27
            _localctx.right_expression = paren_date()
          }
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
        state = 31
        match(LPAREN)
        state = 32
        date()
        state = 33
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
    enterRule(_localctx, 6, RULE_date)
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 35
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
    enterRule(_localctx, 8, RULE_comparison)
    var _la: Int
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 37
        _la = _input.LA(1)
        if (!(_la and 0x3f.inv() == 0 && 1L shl _la and 252L != 0L)) {
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

  class CalculationContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    fun expression(): List<ExpressionContext> {
      return getRuleContexts(
          ExpressionContext::class.java)
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
        state = 42
        _errHandler.sync(this)
        _la = _input.LA(1)
        while (_la and 0x3f.inv() == 0 && 1L shl _la and 25344L != 0L) {
          run {
            run {
              state = 39
              expression(0)
            }
          }
          state = 44
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
      return getRuleContexts(
          ExpressionContext::class.java)
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
      return getRuleContexts(
          ExpressionContext::class.java)
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
      return getRuleContexts(
          ExpressionContext::class.java)
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
      return getRuleContexts(
          ExpressionContext::class.java)
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
        state = 48
        _errHandler.sync(this)
        when (_input.LA(1)) {
          LPAREN -> {
            _localctx = ParenthesesContext(_localctx)
            _ctx = _localctx
            _prevctx = _localctx
            state = 46
            paren_expression()
          }

          NUMBER, ADD, SUB -> {
            _localctx = NumberInExpressionContext(_localctx)
            _ctx = _localctx
            _prevctx = _localctx
            state = 47
            number()
          }

          else -> throw NoViableAltException(this)
        }
        _ctx.stop = _input.LT(-1)
        state = 64
        _errHandler.sync(this)
        _alt = interpreter.adaptivePredict(_input, 4, _ctx)
        while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent()
            _prevctx = _localctx
            run {
              state = 62
              _errHandler.sync(this)
              when (interpreter.adaptivePredict(_input, 3, _ctx)) {
                1 -> {
                  _localctx = MultiplicationOrDivisionParenContext(
                      ExpressionContext(
                          _parentctx,
                          _parentState))
                  (_localctx as MultiplicationOrDivisionParenContext).left_expr = _prevctx
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 50
                  if (!precpred(_ctx, 6)) throw FailedPredicateException(this, "precpred(_ctx, 6)")
                  state = 51
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
                  state = 52
                  (_localctx as MultiplicationOrDivisionParenContext).right_expr = expression(7)
                }

                2 -> {
                  _localctx =
                      AdditionOrSubtractionParenContext(ExpressionContext(_parentctx, _parentState))
                  (_localctx as AdditionOrSubtractionParenContext).left_expr = _prevctx
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 53
                  if (!precpred(_ctx, 5)) throw FailedPredicateException(this, "precpred(_ctx, 5)")
                  state = 54
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
                  state = 55
                  (_localctx as AdditionOrSubtractionParenContext).right_expr = expression(6)
                }

                3 -> {
                  _localctx =
                      MultiplicationOrDivisionContext(ExpressionContext(_parentctx, _parentState))
                  (_localctx as MultiplicationOrDivisionContext).left_expr = _prevctx
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 56
                  if (!precpred(_ctx, 3)) throw FailedPredicateException(this, "precpred(_ctx, 3)")
                  state = 57
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
                  state = 58
                  (_localctx as MultiplicationOrDivisionContext).right_expr = expression(4)
                }

                4 -> {
                  _localctx =
                      AdditionOrSubtractionContext(ExpressionContext(_parentctx, _parentState))
                  (_localctx as AdditionOrSubtractionContext).left_expr = _prevctx
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 59
                  if (!precpred(_ctx, 2)) throw FailedPredicateException(this, "precpred(_ctx, 2)")
                  state = 60
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
                  state = 61
                  (_localctx as AdditionOrSubtractionContext).right_expr = expression(3)
                }
              }
            }
          }
          state = 66
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
        state = 67
        match(LPAREN)
        state = 68
        _localctx.inner = expression(0)
        state = 69
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
        state = 74
        _errHandler.sync(this)
        _la = _input.LA(1)
        while (_la == ADD || _la == SUB) {
          run {
            run {
              state = 71
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
          state = 76
          _errHandler.sync(this)
          _la = _input.LA(1)
        }
        state = 77
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
    const val RULE_comparator = 0
    const val RULE_compare = 1
    const val RULE_paren_date = 2
    const val RULE_date = 3
    const val RULE_comparison = 4
    const val RULE_calculation = 5
    const val RULE_expression = 6
    const val RULE_paren_expression = 7
    const val RULE_number = 8
    private fun makeRuleNames(): Array<String> {
      return arrayOf(
          "comparator", "compare", "paren_date", "date", "comparison", "calculation",
          "expression", "paren_expression", "number"
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
        "\u0004\u0001\u0010P\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
            "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
            "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
            "\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
            "\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005" +
            ")\b\u0005\n\u0005\u000c\u0005,\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006" +
            "\u0003\u00061\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
            "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
            "\u0001\u0006\u0001\u0006\u0005\u0006?\b\u0006\n\u0006\u000c\u0006B\t\u0006" +
            "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0005\bI\b\b" +
            "\n\b\u000c\bL\t\b\u0001\b\u0001\b\u0001\b\u0000\u0001\u000c\t\u0000\u0002\u0004" +
            "\u0006\b\n\u000c\u000e\u0010\u0000\u0003\u0001\u0000\u0002\u0007\u0001\u0000" +
            "\u000b\u000c\u0001\u0000\r\u000eN\u0000\u0012\u0001\u0000\u0000\u0000\u0002" +
            "\u001d\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006" +
            "#\u0001\u0000\u0000\u0000\b%\u0001\u0000\u0000\u0000\n*\u0001\u0000\u0000" +
            "\u0000\u000c0\u0001\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000\u0010" +
            "J\u0001\u0000\u0000\u0000\u0012\u0013\u0003\u0002\u0001\u0000\u0013\u0014" +
            "\u0005\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0016" +
            "\u0003\u000e\u0007\u0000\u0016\u0017\u0003\b\u0004\u0000\u0017\u0018\u0003" +
            "\u000e\u0007\u0000\u0018\u001e\u0001\u0000\u0000\u0000\u0019\u001a\u0003" +
            "\u0004\u0002\u0000\u001a\u001b\u0003\b\u0004\u0000\u001b\u001c\u0003\u0004" +
            "\u0002\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u0015\u0001\u0000" +
            "\u0000\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001e\u0003\u0001\u0000" +
            "\u0000\u0000\u001f \u0005\t\u0000\u0000 !\u0003\u0006\u0003\u0000!\"\u0005" +
            "\n\u0000\u0000\"\u0005\u0001\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000" +
            "$\u0007\u0001\u0000\u0000\u0000%&\u0007\u0000\u0000\u0000&\t\u0001\u0000" +
            "\u0000\u0000\')\u0003\u000c\u0006\u0000(\'\u0001\u0000\u0000\u0000),\u0001" +
            "\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000" +
            "+\u000b\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0006\u0006" +
            "\uffff\uffff\u0000.1\u0003\u000e\u0007\u0000/1\u0003\u0010\b\u00000-\u0001" +
            "\u0000\u0000\u00000/\u0001\u0000\u0000\u00001@\u0001\u0000\u0000\u0000" +
            "23\n\u0006\u0000\u000034\u0007\u0001\u0000\u00004?\u0003\u000c\u0006\u0007" +
            "56\n\u0005\u0000\u000067\u0007\u0002\u0000\u00007?\u0003\u000c\u0006\u0006" +
            "89\n\u0003\u0000\u00009:\u0007\u0001\u0000\u0000:?\u0003\u000c\u0006\u0004" +
            ";<\n\u0002\u0000\u0000<=\u0007\u0002\u0000\u0000=?\u0003\u000c\u0006\u0003" +
            ">2\u0001\u0000\u0000\u0000>5\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000" +
            "\u0000>;\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000" +
            "\u0000\u0000@A\u0001\u0000\u0000\u0000A\r\u0001\u0000\u0000\u0000B@\u0001" +
            "\u0000\u0000\u0000CD\u0005\t\u0000\u0000DE\u0003\u000c\u0006\u0000EF\u0005" +
            "\n\u0000\u0000F\u000f\u0001\u0000\u0000\u0000GI\u0007\u0002\u0000\u0000" +
            "HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000" +
            "\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000" +
            "\u0000\u0000MN\u0005\b\u0000\u0000N\u0011\u0001\u0000\u0000\u0000\u0006" +
            "\u001d*0>@J"
    val _ATN = ATNDeserializer().deserialize(_serializedATN.toCharArray())

    init {
      _decisionToDFA = arrayOfNulls(_ATN.numberOfDecisions)
      for (i in 0 until _ATN.numberOfDecisions) {
        _decisionToDFA[i] = DFA(_ATN.getDecisionState(i), i)
      }
    }
  }
}