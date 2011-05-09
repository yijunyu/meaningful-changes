/*******************************************************************************
* Copyright (c) 2006 Eclipse.org
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.eclipse.gmf.internal.xpand.expression.parser;

public class ExpressionKWLexerprs implements lpg.lpgjavaruntime.ParseTable, ExpressionKWLexersym {

    public interface IsKeyword {
        public final static byte isKeyword[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static byte baseCheck[] = {0,
            4,4,5,3,3,6,4,7,7,3,
            4,10,6,6,9,7,6,6,10
        };
    };
    public final static byte baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static byte rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,22,8,32,21,37,40,41,45,47,
            20,29,49,31,14,15,51,52,9,53,
            56,54,55,60,64,61,69,71,72,76,
            73,77,79,80,83,88,91,90,93,97,
            98,100,103,107,109,101,110,115,117,105,
            111,119,122,120,126,127,130,128,134,136,
            140,135,142,143,144,145,152,147,154,155,
            156,160,163,161,165,166,169,173,175,178,
            179,180,183,184,187,189,188,194,110,110
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static byte termCheck[] = {0,
            0,1,2,3,4,5,6,0,0,9,
            2,11,12,0,0,1,16,17,0,0,
            0,7,9,23,10,25,7,8,0,1,
            0,0,1,26,21,15,0,7,8,0,
            0,1,14,7,0,6,0,1,0,1,
            0,0,0,0,0,0,4,6,3,0,
            0,2,2,0,20,11,13,4,0,19,
            0,0,0,3,6,0,0,2,0,0,
            9,3,0,0,2,13,10,0,1,0,
            0,2,0,14,4,3,0,0,2,0,
            0,2,0,1,0,8,0,1,0,0,
            0,3,2,4,0,1,0,1,0,0,
            1,0,22,5,3,0,0,0,24,0,
            1,6,5,0,0,0,10,2,5,0,
            1,0,0,0,0,3,0,4,2,5,
            16,0,1,0,0,0,15,3,5,0,
            0,2,0,1,0,0,6,3,0,4,
            0,3,0,18,0,3,2,0,0,0,
            1,4,0,0,6,3,0,0,0,0,
            7,5,4,0,0,0,3,0,0,12,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            110,24,32,34,31,30,28,110,110,23,
            57,33,35,110,110,53,27,29,110,110,
            110,52,51,25,54,26,43,44,110,45,
            110,110,36,109,50,37,110,48,49,110,
            110,40,46,38,110,39,110,42,110,47,
            110,110,110,110,110,110,58,56,120,110,
            110,61,63,110,41,60,59,62,110,55,
            110,110,110,115,64,110,110,66,110,110,
            65,69,110,110,70,67,68,110,71,110,
            110,73,110,114,72,121,110,110,74,110,
            110,76,110,117,110,75,110,77,110,110,
            110,78,111,80,110,81,110,112,110,110,
            85,110,79,83,84,110,110,110,82,110,
            88,86,89,110,110,110,87,91,90,110,
            113,110,110,110,110,128,110,124,96,94,
            92,110,95,110,110,110,93,127,97,110,
            110,123,110,98,110,110,99,100,110,119,
            110,118,110,116,110,126,101,110,110,110,
            104,102,110,110,103,105,110,110,110,110,
            106,107,125,110,110,110,129,110,110,122
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }
    public final int asb(int index) { return 0; }
    public final int asr(int index) { return 0; }
    public final int nasb(int index) { return 0; }
    public final int nasr(int index) { return 0; }
    public final int terminalIndex(int index) { return 0; }
    public final int nonterminalIndex(int index) { return 0; }
    public final int scopePrefix(int index) { return 0;}
    public final int scopeSuffix(int index) { return 0;}
    public final int scopeLhs(int index) { return 0;}
    public final int scopeLa(int index) { return 0;}
    public final int scopeStateSet(int index) { return 0;}
    public final int scopeRhs(int index) { return 0;}
    public final int scopeState(int index) { return 0;}
    public final int inSymb(int index) { return 0;}
    public final String name(int index) { return null; }
    public final int getErrorSymbol() { return 0; }
    public final int getScopeUbound() { return 0; }
    public final int getScopeSize() { return 0; }
    public final int getMaxNameLength() { return 0; }

    public final static int
           NUM_STATES        = 87,
           NT_OFFSET         = 54,
           LA_STATE_OFFSET   = 129,
           MAX_LA            = 0,
           NUM_RULES         = 19,
           NUM_NONTERMINALS  = 2,
           NUM_SYMBOLS       = 56,
           SEGMENT_SIZE      = 8192,
           START_STATE       = 20,
           IDENTIFIER_SYMBOL = 0,
           EOFT_SYMBOL       = 26,
           EOLT_SYMBOL       = 55,
           ACCEPT_ACTION     = 109,
           ERROR_ACTION      = 110;

    public final static boolean BACKTRACK = false;

    public final int getNumStates() { return NUM_STATES; }
    public final int getNtOffset() { return NT_OFFSET; }
    public final int getLaStateOffset() { return LA_STATE_OFFSET; }
    public final int getMaxLa() { return MAX_LA; }
    public final int getNumRules() { return NUM_RULES; }
    public final int getNumNonterminals() { return NUM_NONTERMINALS; }
    public final int getNumSymbols() { return NUM_SYMBOLS; }
    public final int getSegmentSize() { return SEGMENT_SIZE; }
    public final int getStartState() { return START_STATE; }
    public final int getStartSymbol() { return lhs[0]; }
    public final int getIdentifierSymbol() { return IDENTIFIER_SYMBOL; }
    public final int getEoftSymbol() { return EOFT_SYMBOL; }
    public final int getEoltSymbol() { return EOLT_SYMBOL; }
    public final int getAcceptAction() { return ACCEPT_ACTION; }
    public final int getErrorAction() { return ERROR_ACTION; }
    public final boolean isValidForParser() { return isValidForParser; }
    public final boolean getBacktrack() { return BACKTRACK; }

    public final int originalState(int state) { return 0; }
    public final int asi(int state) { return 0; }
    public final int nasi(int state) { return 0; }
    public final int inSymbol(int state) { return 0; }

    public final int ntAction(int state, int sym) {
        return baseAction[state + sym];
    }

    public final int tAction(int state, int sym) {
        int i = baseAction[state],
            k = i + sym;
        return termAction[termCheck[k] == sym ? k : i];
    }
    public final int lookAhead(int la_state, int sym) {
        int k = la_state + sym;
        return termAction[termCheck[k] == sym ? k : la_state];
    }
}
