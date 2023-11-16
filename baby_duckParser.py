# Generated from baby_duck.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


from funciones import *

def serializedATN():
    return [
        4,1,31,242,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,1,0,1,0,1,0,1,0,3,0,41,8,
        0,1,0,5,0,44,8,0,10,0,12,0,47,9,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,4,1,60,8,1,11,1,12,1,61,1,2,1,2,1,2,5,2,67,8,2,10,
        2,12,2,70,9,2,1,3,1,3,5,3,74,8,3,10,3,12,3,77,9,3,1,3,1,3,1,4,1,
        4,1,4,1,4,1,4,3,4,86,8,4,1,5,1,5,1,5,1,5,1,5,1,5,3,5,94,8,5,1,5,
        1,5,1,5,1,5,1,5,3,5,101,8,5,5,5,103,8,5,10,5,12,5,106,9,5,1,5,1,
        5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,
        7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,3,8,138,8,8,1,
        8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,3,9,149,8,9,1,10,1,10,1,11,1,11,
        1,11,1,11,1,11,1,11,1,11,5,11,160,8,11,10,11,12,11,163,9,11,1,12,
        1,12,1,12,1,12,1,12,1,12,1,12,5,12,172,8,12,10,12,12,12,175,9,12,
        1,13,1,13,1,13,1,13,1,13,1,13,1,13,3,13,184,8,13,1,13,1,13,1,13,
        1,13,1,13,3,13,191,8,13,3,13,193,8,13,1,14,1,14,1,14,1,14,1,14,1,
        14,3,14,201,8,14,1,14,1,14,1,14,1,14,1,15,1,15,1,15,1,15,1,15,1,
        15,1,15,1,15,1,15,5,15,216,8,15,10,15,12,15,219,9,15,3,15,221,8,
        15,1,15,1,15,1,16,1,16,1,16,1,16,1,16,5,16,230,8,16,10,16,12,16,
        233,9,16,3,16,235,8,16,1,16,1,16,1,16,1,17,1,17,1,17,0,0,18,0,2,
        4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,0,2,1,0,17,19,1,0,28,
        29,247,0,36,1,0,0,0,2,52,1,0,0,0,4,63,1,0,0,0,6,71,1,0,0,0,8,85,
        1,0,0,0,10,87,1,0,0,0,12,110,1,0,0,0,14,118,1,0,0,0,16,128,1,0,0,
        0,18,142,1,0,0,0,20,150,1,0,0,0,22,152,1,0,0,0,24,164,1,0,0,0,26,
        192,1,0,0,0,28,194,1,0,0,0,30,206,1,0,0,0,32,224,1,0,0,0,34,239,
        1,0,0,0,36,37,5,1,0,0,37,38,5,27,0,0,38,40,5,2,0,0,39,41,3,2,1,0,
        40,39,1,0,0,0,40,41,1,0,0,0,41,45,1,0,0,0,42,44,3,28,14,0,43,42,
        1,0,0,0,44,47,1,0,0,0,45,43,1,0,0,0,45,46,1,0,0,0,46,48,1,0,0,0,
        47,45,1,0,0,0,48,49,5,3,0,0,49,50,3,6,3,0,50,51,5,4,0,0,51,1,1,0,
        0,0,52,59,5,5,0,0,53,54,3,4,2,0,54,55,5,6,0,0,55,56,5,26,0,0,56,
        57,6,1,-1,0,57,58,5,2,0,0,58,60,1,0,0,0,59,53,1,0,0,0,60,61,1,0,
        0,0,61,59,1,0,0,0,61,62,1,0,0,0,62,3,1,0,0,0,63,68,5,27,0,0,64,65,
        5,7,0,0,65,67,5,27,0,0,66,64,1,0,0,0,67,70,1,0,0,0,68,66,1,0,0,0,
        68,69,1,0,0,0,69,5,1,0,0,0,70,68,1,0,0,0,71,75,5,8,0,0,72,74,3,8,
        4,0,73,72,1,0,0,0,74,77,1,0,0,0,75,73,1,0,0,0,75,76,1,0,0,0,76,78,
        1,0,0,0,77,75,1,0,0,0,78,79,5,9,0,0,79,7,1,0,0,0,80,86,3,12,6,0,
        81,86,3,16,8,0,82,86,3,14,7,0,83,86,3,32,16,0,84,86,3,10,5,0,85,
        80,1,0,0,0,85,81,1,0,0,0,85,82,1,0,0,0,85,83,1,0,0,0,85,84,1,0,0,
        0,86,9,1,0,0,0,87,88,5,10,0,0,88,93,5,11,0,0,89,90,3,18,9,0,90,91,
        6,5,-1,0,91,94,1,0,0,0,92,94,5,30,0,0,93,89,1,0,0,0,93,92,1,0,0,
        0,94,104,1,0,0,0,95,100,5,7,0,0,96,97,3,18,9,0,97,98,6,5,-1,0,98,
        101,1,0,0,0,99,101,5,30,0,0,100,96,1,0,0,0,100,99,1,0,0,0,101,103,
        1,0,0,0,102,95,1,0,0,0,103,106,1,0,0,0,104,102,1,0,0,0,104,105,1,
        0,0,0,105,107,1,0,0,0,106,104,1,0,0,0,107,108,5,12,0,0,108,109,5,
        2,0,0,109,11,1,0,0,0,110,111,5,27,0,0,111,112,6,6,-1,0,112,113,5,
        23,0,0,113,114,6,6,-1,0,114,115,3,18,9,0,115,116,6,6,-1,0,116,117,
        5,2,0,0,117,13,1,0,0,0,118,119,5,13,0,0,119,120,6,7,-1,0,120,121,
        3,6,3,0,121,122,5,14,0,0,122,123,5,11,0,0,123,124,3,18,9,0,124,125,
        5,12,0,0,125,126,6,7,-1,0,126,127,5,2,0,0,127,15,1,0,0,0,128,129,
        5,15,0,0,129,130,5,11,0,0,130,131,3,18,9,0,131,132,5,12,0,0,132,
        133,6,8,-1,0,133,137,3,6,3,0,134,135,5,16,0,0,135,136,6,8,-1,0,136,
        138,3,6,3,0,137,134,1,0,0,0,137,138,1,0,0,0,138,139,1,0,0,0,139,
        140,5,2,0,0,140,141,6,8,-1,0,141,17,1,0,0,0,142,148,3,22,11,0,143,
        144,3,20,10,0,144,145,6,9,-1,0,145,146,3,22,11,0,146,147,6,9,-1,
        0,147,149,1,0,0,0,148,143,1,0,0,0,148,149,1,0,0,0,149,19,1,0,0,0,
        150,151,7,0,0,0,151,21,1,0,0,0,152,153,3,24,12,0,153,161,6,11,-1,
        0,154,155,5,24,0,0,155,156,6,11,-1,0,156,157,3,24,12,0,157,158,6,
        11,-1,0,158,160,1,0,0,0,159,154,1,0,0,0,160,163,1,0,0,0,161,159,
        1,0,0,0,161,162,1,0,0,0,162,23,1,0,0,0,163,161,1,0,0,0,164,165,3,
        26,13,0,165,173,6,12,-1,0,166,167,5,25,0,0,167,168,6,12,-1,0,168,
        169,3,26,13,0,169,170,6,12,-1,0,170,172,1,0,0,0,171,166,1,0,0,0,
        172,175,1,0,0,0,173,171,1,0,0,0,173,174,1,0,0,0,174,25,1,0,0,0,175,
        173,1,0,0,0,176,177,5,11,0,0,177,178,6,13,-1,0,178,179,3,18,9,0,
        179,180,5,12,0,0,180,181,6,13,-1,0,181,193,1,0,0,0,182,184,5,24,
        0,0,183,182,1,0,0,0,183,184,1,0,0,0,184,190,1,0,0,0,185,186,5,27,
        0,0,186,191,6,13,-1,0,187,188,3,34,17,0,188,189,6,13,-1,0,189,191,
        1,0,0,0,190,185,1,0,0,0,190,187,1,0,0,0,191,193,1,0,0,0,192,176,
        1,0,0,0,192,183,1,0,0,0,193,27,1,0,0,0,194,195,5,20,0,0,195,196,
        5,27,0,0,196,197,3,30,15,0,197,198,6,14,-1,0,198,200,5,21,0,0,199,
        201,3,2,1,0,200,199,1,0,0,0,200,201,1,0,0,0,201,202,1,0,0,0,202,
        203,3,6,3,0,203,204,5,22,0,0,204,205,5,2,0,0,205,29,1,0,0,0,206,
        220,5,11,0,0,207,208,5,27,0,0,208,209,5,6,0,0,209,210,5,26,0,0,210,
        217,1,0,0,0,211,212,5,7,0,0,212,213,5,27,0,0,213,214,5,6,0,0,214,
        216,5,26,0,0,215,211,1,0,0,0,216,219,1,0,0,0,217,215,1,0,0,0,217,
        218,1,0,0,0,218,221,1,0,0,0,219,217,1,0,0,0,220,207,1,0,0,0,220,
        221,1,0,0,0,221,222,1,0,0,0,222,223,5,12,0,0,223,31,1,0,0,0,224,
        225,5,27,0,0,225,234,5,11,0,0,226,231,3,18,9,0,227,228,5,7,0,0,228,
        230,3,18,9,0,229,227,1,0,0,0,230,233,1,0,0,0,231,229,1,0,0,0,231,
        232,1,0,0,0,232,235,1,0,0,0,233,231,1,0,0,0,234,226,1,0,0,0,234,
        235,1,0,0,0,235,236,1,0,0,0,236,237,5,12,0,0,237,238,5,2,0,0,238,
        33,1,0,0,0,239,240,7,1,0,0,240,35,1,0,0,0,21,40,45,61,68,75,85,93,
        100,104,137,148,161,173,183,190,192,200,217,220,231,234
    ]

class baby_duckParser ( Parser ):

    grammarFileName = "baby_duck.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'program'", "';'", "'main'", "'end'", 
                     "'var'", "':'", "','", "'{'", "'}'", "'print'", "'('", 
                     "')'", "'while'", "'do'", "'if'", "'else'", "'<'", 
                     "'>'", "'!='", "'void'", "'['", "']'", "'='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "EQ", "OPER_EXP", 
                      "OPER_TERM", "TYPE", "ID", "CTE_INT", "CTE_FLOAT", 
                      "CTE_STRING", "WHITESPACE" ]

    RULE_programa = 0
    RULE_vars = 1
    RULE_varlist = 2
    RULE_body = 3
    RULE_statement = 4
    RULE_print = 5
    RULE_assign = 6
    RULE_cycle = 7
    RULE_condition = 8
    RULE_expresion = 9
    RULE_oper_rel = 10
    RULE_exp = 11
    RULE_termino = 12
    RULE_factor = 13
    RULE_funcs = 14
    RULE_params = 15
    RULE_f_call = 16
    RULE_cte = 17

    ruleNames =  [ "programa", "vars", "varlist", "body", "statement", "print", 
                   "assign", "cycle", "condition", "expresion", "oper_rel", 
                   "exp", "termino", "factor", "funcs", "params", "f_call", 
                   "cte" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    EQ=23
    OPER_EXP=24
    OPER_TERM=25
    TYPE=26
    ID=27
    CTE_INT=28
    CTE_FLOAT=29
    CTE_STRING=30
    WHITESPACE=31

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(baby_duckParser.ID, 0)

        def body(self):
            return self.getTypedRuleContext(baby_duckParser.BodyContext,0)


        def vars_(self):
            return self.getTypedRuleContext(baby_duckParser.VarsContext,0)


        def funcs(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(baby_duckParser.FuncsContext)
            else:
                return self.getTypedRuleContext(baby_duckParser.FuncsContext,i)


        def getRuleIndex(self):
            return baby_duckParser.RULE_programa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrograma" ):
                listener.enterPrograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrograma" ):
                listener.exitPrograma(self)




    def programa(self):

        localctx = baby_duckParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self.match(baby_duckParser.T__0)
            self.state = 37
            self.match(baby_duckParser.ID)
            self.state = 38
            self.match(baby_duckParser.T__1)
            self.state = 40
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==5:
                self.state = 39
                self.vars_()


            self.state = 45
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==20:
                self.state = 42
                self.funcs()
                self.state = 47
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 48
            self.match(baby_duckParser.T__2)
            self.state = 49
            self.body()
            self.state = 50
            self.match(baby_duckParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VarsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._varlist = None # VarlistContext
            self._TYPE = None # Token

        def varlist(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(baby_duckParser.VarlistContext)
            else:
                return self.getTypedRuleContext(baby_duckParser.VarlistContext,i)


        def TYPE(self, i:int=None):
            if i is None:
                return self.getTokens(baby_duckParser.TYPE)
            else:
                return self.getToken(baby_duckParser.TYPE, i)

        def getRuleIndex(self):
            return baby_duckParser.RULE_vars

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVars" ):
                listener.enterVars(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVars" ):
                listener.exitVars(self)




    def vars_(self):

        localctx = baby_duckParser.VarsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_vars)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 52
            self.match(baby_duckParser.T__4)
            self.state = 59 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 53
                localctx._varlist = self.varlist()
                self.state = 54
                self.match(baby_duckParser.T__5)
                self.state = 55
                localctx._TYPE = self.match(baby_duckParser.TYPE)
                agregar_vars((None if localctx._varlist is None else self._input.getText(localctx._varlist.start,localctx._varlist.stop)), (None if localctx._TYPE is None else localctx._TYPE.text))
                self.state = 57
                self.match(baby_duckParser.T__1)
                self.state = 61 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==27):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VarlistContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(baby_duckParser.ID)
            else:
                return self.getToken(baby_duckParser.ID, i)

        def getRuleIndex(self):
            return baby_duckParser.RULE_varlist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVarlist" ):
                listener.enterVarlist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVarlist" ):
                listener.exitVarlist(self)




    def varlist(self):

        localctx = baby_duckParser.VarlistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_varlist)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.match(baby_duckParser.ID)
            self.state = 68
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==7:
                self.state = 64
                self.match(baby_duckParser.T__6)
                self.state = 65
                self.match(baby_duckParser.ID)
                self.state = 70
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(baby_duckParser.StatementContext)
            else:
                return self.getTypedRuleContext(baby_duckParser.StatementContext,i)


        def getRuleIndex(self):
            return baby_duckParser.RULE_body

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBody" ):
                listener.enterBody(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBody" ):
                listener.exitBody(self)




    def body(self):

        localctx = baby_duckParser.BodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_body)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 71
            self.match(baby_duckParser.T__7)
            self.state = 75
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 134259712) != 0):
                self.state = 72
                self.statement()
                self.state = 77
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 78
            self.match(baby_duckParser.T__8)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assign(self):
            return self.getTypedRuleContext(baby_duckParser.AssignContext,0)


        def condition(self):
            return self.getTypedRuleContext(baby_duckParser.ConditionContext,0)


        def cycle(self):
            return self.getTypedRuleContext(baby_duckParser.CycleContext,0)


        def f_call(self):
            return self.getTypedRuleContext(baby_duckParser.F_callContext,0)


        def print_(self):
            return self.getTypedRuleContext(baby_duckParser.PrintContext,0)


        def getRuleIndex(self):
            return baby_duckParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)




    def statement(self):

        localctx = baby_duckParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_statement)
        try:
            self.state = 85
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 80
                self.assign()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 81
                self.condition()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 82
                self.cycle()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 83
                self.f_call()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 84
                self.print_()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PrintContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(baby_duckParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(baby_duckParser.ExpresionContext,i)


        def CTE_STRING(self, i:int=None):
            if i is None:
                return self.getTokens(baby_duckParser.CTE_STRING)
            else:
                return self.getToken(baby_duckParser.CTE_STRING, i)

        def getRuleIndex(self):
            return baby_duckParser.RULE_print

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint" ):
                listener.enterPrint(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint" ):
                listener.exitPrint(self)




    def print_(self):

        localctx = baby_duckParser.PrintContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_print)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 87
            self.match(baby_duckParser.T__9)
            self.state = 88
            self.match(baby_duckParser.T__10)
            self.state = 93
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [11, 24, 27, 28, 29]:
                self.state = 89
                self.expresion()
                print_expresion()
                pass
            elif token in [30]:
                self.state = 92
                self.match(baby_duckParser.CTE_STRING)
                pass
            else:
                raise NoViableAltException(self)

            self.state = 104
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==7:
                self.state = 95
                self.match(baby_duckParser.T__6)
                self.state = 100
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [11, 24, 27, 28, 29]:
                    self.state = 96
                    self.expresion()
                    print_expresion()
                    pass
                elif token in [30]:
                    self.state = 99
                    self.match(baby_duckParser.CTE_STRING)
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 106
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 107
            self.match(baby_duckParser.T__11)
            self.state = 108
            self.match(baby_duckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(baby_duckParser.ID, 0)

        def EQ(self):
            return self.getToken(baby_duckParser.EQ, 0)

        def expresion(self):
            return self.getTypedRuleContext(baby_duckParser.ExpresionContext,0)


        def getRuleIndex(self):
            return baby_duckParser.RULE_assign

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssign" ):
                listener.enterAssign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssign" ):
                listener.exitAssign(self)




    def assign(self):

        localctx = baby_duckParser.AssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_assign)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 110
            localctx._ID = self.match(baby_duckParser.ID)
            push_operando((None if localctx._ID is None else localctx._ID.text), 'ID')
            self.state = 112
            self.match(baby_duckParser.EQ)
            push_operador('=')
            self.state = 114
            self.expresion()
            pop_assign()
            self.state = 116
            self.match(baby_duckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CycleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def body(self):
            return self.getTypedRuleContext(baby_duckParser.BodyContext,0)


        def expresion(self):
            return self.getTypedRuleContext(baby_duckParser.ExpresionContext,0)


        def getRuleIndex(self):
            return baby_duckParser.RULE_cycle

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCycle" ):
                listener.enterCycle(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCycle" ):
                listener.exitCycle(self)




    def cycle(self):

        localctx = baby_duckParser.CycleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_cycle)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 118
            self.match(baby_duckParser.T__12)
            cycle1()
            self.state = 120
            self.body()
            self.state = 121
            self.match(baby_duckParser.T__13)
            self.state = 122
            self.match(baby_duckParser.T__10)
            self.state = 123
            self.expresion()
            self.state = 124
            self.match(baby_duckParser.T__11)
            cycle2()
            self.state = 126
            self.match(baby_duckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(baby_duckParser.ExpresionContext,0)


        def body(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(baby_duckParser.BodyContext)
            else:
                return self.getTypedRuleContext(baby_duckParser.BodyContext,i)


        def getRuleIndex(self):
            return baby_duckParser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)




    def condition(self):

        localctx = baby_duckParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_condition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 128
            self.match(baby_duckParser.T__14)
            self.state = 129
            self.match(baby_duckParser.T__10)
            self.state = 130
            self.expresion()
            self.state = 131
            self.match(baby_duckParser.T__11)
            if1()
            self.state = 133
            self.body()
            self.state = 137
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==16:
                self.state = 134
                self.match(baby_duckParser.T__15)
                if3()
                self.state = 136
                self.body()


            self.state = 139
            self.match(baby_duckParser.T__1)
            if2()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpresionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._oper_rel = None # Oper_relContext

        def exp(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(baby_duckParser.ExpContext)
            else:
                return self.getTypedRuleContext(baby_duckParser.ExpContext,i)


        def oper_rel(self):
            return self.getTypedRuleContext(baby_duckParser.Oper_relContext,0)


        def getRuleIndex(self):
            return baby_duckParser.RULE_expresion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresion" ):
                listener.enterExpresion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresion" ):
                listener.exitExpresion(self)




    def expresion(self):

        localctx = baby_duckParser.ExpresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_expresion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 142
            self.exp()
            self.state = 148
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 917504) != 0):
                self.state = 143
                localctx._oper_rel = self.oper_rel()
                punto8((None if localctx._oper_rel is None else self._input.getText(localctx._oper_rel.start,localctx._oper_rel.stop)))
                self.state = 145
                self.exp()
                punto9()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Oper_relContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return baby_duckParser.RULE_oper_rel

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOper_rel" ):
                listener.enterOper_rel(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOper_rel" ):
                listener.exitOper_rel(self)




    def oper_rel(self):

        localctx = baby_duckParser.Oper_relContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_oper_rel)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 150
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 917504) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._OPER_EXP = None # Token

        def termino(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(baby_duckParser.TerminoContext)
            else:
                return self.getTypedRuleContext(baby_duckParser.TerminoContext,i)


        def OPER_EXP(self, i:int=None):
            if i is None:
                return self.getTokens(baby_duckParser.OPER_EXP)
            else:
                return self.getToken(baby_duckParser.OPER_EXP, i)

        def getRuleIndex(self):
            return baby_duckParser.RULE_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp" ):
                listener.enterExp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp" ):
                listener.exitExp(self)




    def exp(self):

        localctx = baby_duckParser.ExpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_exp)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 152
            self.termino()
            punto4()
            self.state = 161
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==24:
                self.state = 154
                localctx._OPER_EXP = self.match(baby_duckParser.OPER_EXP)
                punto2((None if localctx._OPER_EXP is None else localctx._OPER_EXP.text))
                self.state = 156
                self.termino()
                punto4()
                self.state = 163
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TerminoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._OPER_TERM = None # Token

        def factor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(baby_duckParser.FactorContext)
            else:
                return self.getTypedRuleContext(baby_duckParser.FactorContext,i)


        def OPER_TERM(self, i:int=None):
            if i is None:
                return self.getTokens(baby_duckParser.OPER_TERM)
            else:
                return self.getToken(baby_duckParser.OPER_TERM, i)

        def getRuleIndex(self):
            return baby_duckParser.RULE_termino

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermino" ):
                listener.enterTermino(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermino" ):
                listener.exitTermino(self)




    def termino(self):

        localctx = baby_duckParser.TerminoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_termino)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 164
            self.factor()
            punto5()
            self.state = 173
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==25:
                self.state = 166
                localctx._OPER_TERM = self.match(baby_duckParser.OPER_TERM)
                punto3((None if localctx._OPER_TERM is None else localctx._OPER_TERM.text))
                self.state = 168
                self.factor()
                punto5()
                self.state = 175
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FactorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._OPER_EXP = None # Token
            self._ID = None # Token
            self._cte = None # CteContext

        def expresion(self):
            return self.getTypedRuleContext(baby_duckParser.ExpresionContext,0)


        def ID(self):
            return self.getToken(baby_duckParser.ID, 0)

        def cte(self):
            return self.getTypedRuleContext(baby_duckParser.CteContext,0)


        def OPER_EXP(self):
            return self.getToken(baby_duckParser.OPER_EXP, 0)

        def getRuleIndex(self):
            return baby_duckParser.RULE_factor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor" ):
                listener.enterFactor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor" ):
                listener.exitFactor(self)




    def factor(self):

        localctx = baby_duckParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_factor)
        self._la = 0 # Token type
        try:
            self.state = 192
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [11]:
                self.enterOuterAlt(localctx, 1)
                self.state = 176
                self.match(baby_duckParser.T__10)
                punto6()
                self.state = 178
                self.expresion()
                self.state = 179
                self.match(baby_duckParser.T__11)
                punto7()
                pass
            elif token in [24, 27, 28, 29]:
                self.enterOuterAlt(localctx, 2)
                self.state = 183
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==24:
                    self.state = 182
                    localctx._OPER_EXP = self.match(baby_duckParser.OPER_EXP)


                self.state = 190
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [27]:
                    self.state = 185
                    localctx._ID = self.match(baby_duckParser.ID)
                    punto1((None if localctx._ID is None else localctx._ID.text), 'ID', (None if localctx._OPER_EXP is None else localctx._OPER_EXP.text))
                    pass
                elif token in [28, 29]:
                    self.state = 187
                    localctx._cte = self.cte()
                    punto1((None if localctx._cte is None else self._input.getText(localctx._cte.start,localctx._cte.stop)), 'cte', (None if localctx._OPER_EXP is None else localctx._OPER_EXP.text))
                    pass
                else:
                    raise NoViableAltException(self)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token
            self._params = None # ParamsContext

        def ID(self):
            return self.getToken(baby_duckParser.ID, 0)

        def params(self):
            return self.getTypedRuleContext(baby_duckParser.ParamsContext,0)


        def body(self):
            return self.getTypedRuleContext(baby_duckParser.BodyContext,0)


        def vars_(self):
            return self.getTypedRuleContext(baby_duckParser.VarsContext,0)


        def getRuleIndex(self):
            return baby_duckParser.RULE_funcs

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuncs" ):
                listener.enterFuncs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuncs" ):
                listener.exitFuncs(self)




    def funcs(self):

        localctx = baby_duckParser.FuncsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_funcs)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 194
            self.match(baby_duckParser.T__19)
            self.state = 195
            localctx._ID = self.match(baby_duckParser.ID)
            self.state = 196
            localctx._params = self.params()
            nueva_func((None if localctx._ID is None else localctx._ID.text), (None if localctx._params is None else self._input.getText(localctx._params.start,localctx._params.stop)))
            self.state = 198
            self.match(baby_duckParser.T__20)
            self.state = 200
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==5:
                self.state = 199
                self.vars_()


            self.state = 202
            self.body()
            self.state = 203
            self.match(baby_duckParser.T__21)
            self.state = 204
            self.match(baby_duckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(baby_duckParser.ID)
            else:
                return self.getToken(baby_duckParser.ID, i)

        def TYPE(self, i:int=None):
            if i is None:
                return self.getTokens(baby_duckParser.TYPE)
            else:
                return self.getToken(baby_duckParser.TYPE, i)

        def getRuleIndex(self):
            return baby_duckParser.RULE_params

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParams" ):
                listener.enterParams(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParams" ):
                listener.exitParams(self)




    def params(self):

        localctx = baby_duckParser.ParamsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_params)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 206
            self.match(baby_duckParser.T__10)
            self.state = 220
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==27:
                self.state = 207
                self.match(baby_duckParser.ID)
                self.state = 208
                self.match(baby_duckParser.T__5)
                self.state = 209
                self.match(baby_duckParser.TYPE)
                self.state = 217
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==7:
                    self.state = 211
                    self.match(baby_duckParser.T__6)
                    self.state = 212
                    self.match(baby_duckParser.ID)
                    self.state = 213
                    self.match(baby_duckParser.T__5)
                    self.state = 214
                    self.match(baby_duckParser.TYPE)
                    self.state = 219
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 222
            self.match(baby_duckParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class F_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(baby_duckParser.ID, 0)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(baby_duckParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(baby_duckParser.ExpresionContext,i)


        def getRuleIndex(self):
            return baby_duckParser.RULE_f_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterF_call" ):
                listener.enterF_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitF_call" ):
                listener.exitF_call(self)




    def f_call(self):

        localctx = baby_duckParser.F_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_f_call)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 224
            self.match(baby_duckParser.ID)
            self.state = 225
            self.match(baby_duckParser.T__10)
            self.state = 234
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 956303360) != 0):
                self.state = 226
                self.expresion()
                self.state = 231
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==7:
                    self.state = 227
                    self.match(baby_duckParser.T__6)
                    self.state = 228
                    self.expresion()
                    self.state = 233
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 236
            self.match(baby_duckParser.T__11)
            self.state = 237
            self.match(baby_duckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CTE_INT(self):
            return self.getToken(baby_duckParser.CTE_INT, 0)

        def CTE_FLOAT(self):
            return self.getToken(baby_duckParser.CTE_FLOAT, 0)

        def getRuleIndex(self):
            return baby_duckParser.RULE_cte

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCte" ):
                listener.enterCte(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCte" ):
                listener.exitCte(self)




    def cte(self):

        localctx = baby_duckParser.CteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_cte)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 239
            _la = self._input.LA(1)
            if not(_la==28 or _la==29):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





