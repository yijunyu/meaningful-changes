/*******************************************************************************
* Copyright (c) 2006 Eclipse.org
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.eclipse.gmf.internal.xpand.expression.parser;

public class ExpressionKWLexer extends ExpressionKWLexerprs implements ExpressionParsersym
{
    private char[] inputChars;
    private final int keywordKind[] = new int[19 + 1];

    public int[] getKeywordKinds() { return keywordKind; }

    public int lexer(int curtok, int lasttok)
    {
        int current_kind = getKind(inputChars[curtok]),
            act;

        for (act = tAction(START_STATE, current_kind);
             act > NUM_RULES && act < ACCEPT_ACTION;
             act = tAction(act, current_kind))
        {
            curtok++;
            current_kind = (curtok > lasttok
                                   ? Char_EOF
                                   : getKind(inputChars[curtok]));
        }

        if (act > ERROR_ACTION)
        {
            curtok++;
            act -= ERROR_ACTION;
        }

        return keywordKind[act == ERROR_ACTION  || curtok <= lasttok ? 0 : act];
    }

    public void setInputChars(char[] inputChars) { this.inputChars = inputChars; }


    final static int tokenKind[] = new int[128];
    static {
        tokenKind['a'] = Char_a;
        tokenKind['b'] = Char_b;
        tokenKind['c'] = Char_c;
        tokenKind['d'] = Char_d;
        tokenKind['e'] = Char_e;
        tokenKind['f'] = Char_f;
        tokenKind['g'] = Char_g;
        tokenKind['h'] = Char_h;
        tokenKind['i'] = Char_i;
        tokenKind['j'] = Char_j;
        tokenKind['k'] = Char_k;
        tokenKind['l'] = Char_l;
        tokenKind['m'] = Char_m;
        tokenKind['n'] = Char_n;
        tokenKind['o'] = Char_o;
        tokenKind['p'] = Char_p;
        tokenKind['q'] = Char_q;
        tokenKind['r'] = Char_r;
        tokenKind['s'] = Char_s;
        tokenKind['t'] = Char_t;
        tokenKind['u'] = Char_u;
        tokenKind['v'] = Char_v;
        tokenKind['w'] = Char_w;
        tokenKind['x'] = Char_x;
        tokenKind['y'] = Char_y;
        tokenKind['z'] = Char_z;

        tokenKind['A'] = Char_A;
        tokenKind['B'] = Char_B;
        tokenKind['C'] = Char_C;
        tokenKind['D'] = Char_D;
        tokenKind['E'] = Char_E;
        tokenKind['F'] = Char_F;
        tokenKind['G'] = Char_G;
        tokenKind['H'] = Char_H;
        tokenKind['I'] = Char_I;
        tokenKind['J'] = Char_J;
        tokenKind['K'] = Char_K;
        tokenKind['L'] = Char_L;
        tokenKind['M'] = Char_M;
        tokenKind['N'] = Char_N;
        tokenKind['O'] = Char_O;
        tokenKind['P'] = Char_P;
        tokenKind['Q'] = Char_Q;
        tokenKind['R'] = Char_R;
        tokenKind['S'] = Char_S;
        tokenKind['T'] = Char_T;
        tokenKind['U'] = Char_U;
        tokenKind['V'] = Char_V;
        tokenKind['W'] = Char_W;
        tokenKind['X'] = Char_X;
        tokenKind['Y'] = Char_Y;
        tokenKind['Z'] = Char_Z;
    };

    final int getKind(char c) {
        return (c < 128 ? tokenKind[c] : 0);
    }


    public ExpressionKWLexer(char[] inputChars, int identifierKind)
    {
        this.inputChars = inputChars;
        keywordKind[0] = identifierKind;

        //
        // Rule 1:  KeyWord ::= n u l l
        //
		keywordKind[1] = (TK_null);
	  
	
        //
        // Rule 2:  KeyWord ::= t r u e
        //
		keywordKind[2] = (TK_true);
	  
	
        //
        // Rule 3:  KeyWord ::= f a l s e
        //
		keywordKind[3] = (TK_false);
	  
	
        //
        // Rule 4:  KeyWord ::= n e w
        //
		keywordKind[4] = (TK_new);
	  
	
        //
        // Rule 5:  KeyWord ::= l e t
        //
		keywordKind[5] = (TK_let);
	  
	
        //
        // Rule 6:  KeyWord ::= s w i t c h
        //
		keywordKind[6] = (TK_switch);
	  
	
        //
        // Rule 7:  KeyWord ::= c a s e
        //
		keywordKind[7] = (TK_case);
	  
	
        //
        // Rule 8:  KeyWord ::= d e f a u l t
        //
		keywordKind[8] = (TK_default);
	  
	
        //
        // Rule 9:  KeyWord ::= i m p l i e s
        //
		keywordKind[9] = (TK_implies);
	  
	
        //
        // Rule 10:  KeyWord ::= S e t
        //
		keywordKind[10] = (TK_Set);
	  
	
        //
        // Rule 11:  KeyWord ::= L i s t
        //
		keywordKind[11] = (TK_List);
	  
	
        //
        // Rule 12:  KeyWord ::= C o l l e c t i o n
        //
		keywordKind[12] = (TK_Collection);
	  
	
        //
        // Rule 13:  KeyWord ::= f o r A l l
        //
		keywordKind[13] = (TK_forAll);
	  
	
        //
        // Rule 14:  KeyWord ::= e x i s t s
        //
		keywordKind[14] = (TK_exists);
	  
	
        //
        // Rule 15:  KeyWord ::= n o t E x i s t s
        //
		keywordKind[15] = (TK_notExists);
	  
	
        //
        // Rule 16:  KeyWord ::= c o l l e c t
        //
		keywordKind[16] = (TK_collect);
	  
	
        //
        // Rule 17:  KeyWord ::= s e l e c t
        //
		keywordKind[17] = (TK_select);
	  
	
        //
        // Rule 18:  KeyWord ::= r e j e c t
        //
		keywordKind[18] = (TK_reject);
	  
	
        //
        // Rule 19:  KeyWord ::= t y p e S e l e c t
        //
		keywordKind[19] = (TK_typeSelect);
	  
	

        for (int i = 0; i < keywordKind.length; i++)
        {
            if (keywordKind[i] == 0)
                keywordKind[i] = identifierKind;
        }
    }
}

