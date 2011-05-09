/*******************************************************************************
* Copyright (c) 2006 Eclipse.org
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.eclipse.gmf.internal.xpand.parser;


public class XpandKWLexer extends XpandKWLexerprs implements XpandParsersym
{
    private char[] inputChars;
    private final int keywordKind[] = new int[47 + 1];

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
    static
    {
        tokenKind['$'] = Char_DollarSign;

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

    final int getKind(char c)
    {
        return (c < 128 ? tokenKind[c] : 0);
    }


    public XpandKWLexer(char[] inputChars, int identifierKind)
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
	  
	
        //
        // Rule 20:  KeyWord ::= I M P O R T
        //
		keywordKind[20] = (TK_IMPORT);
	
        //
        // Rule 21:  KeyWord ::= E X T E N S I O N
        //
		keywordKind[21] = (TK_EXTENSION);
	
        //
        // Rule 22:  KeyWord ::= A R O U N D
        //
		keywordKind[22] = (TK_AROUND);
	
        //
        // Rule 23:  KeyWord ::= E N D A R O U N D
        //
		keywordKind[23] = (TK_ENDAROUND);
	
        //
        // Rule 24:  KeyWord ::= D E F I N E
        //
		keywordKind[24] = (TK_DEFINE);
	
        //
        // Rule 25:  KeyWord ::= E N D D E F I N E
        //
		keywordKind[25] = (TK_ENDDEFINE);
	
        //
        // Rule 26:  KeyWord ::= E R R O R
        //
		keywordKind[26] = (TK_ERROR);
	
        //
        // Rule 27:  KeyWord ::= E X P A N D
        //
		keywordKind[27] = (TK_EXPAND);
	
        //
        // Rule 28:  KeyWord ::= F O R
        //
		keywordKind[28] = (TK_FOR);
	
        //
        // Rule 29:  KeyWord ::= S E P A R A T O R
        //
		keywordKind[29] = (TK_SEPARATOR);
	
        //
        // Rule 30:  KeyWord ::= A S
        //
		keywordKind[30] = (TK_AS);
	
        //
        // Rule 31:  KeyWord ::= I T E R A T O R
        //
		keywordKind[31] = (TK_ITERATOR);
	
        //
        // Rule 32:  KeyWord ::= F O R E A C H
        //
		keywordKind[32] = (TK_FOREACH);
	
        //
        // Rule 33:  KeyWord ::= E N D F O R E A C H
        //
		keywordKind[33] = (TK_ENDFOREACH);
	
        //
        // Rule 34:  KeyWord ::= F I L E
        //
		keywordKind[34] = (TK_FILE);
	
        //
        // Rule 35:  KeyWord ::= E N D F I L E
        //
		keywordKind[35] = (TK_ENDFILE);
	
        //
        // Rule 36:  KeyWord ::= I F
        //
		keywordKind[36] = (TK_IF);
	
        //
        // Rule 37:  KeyWord ::= E L S E I F
        //
		keywordKind[37] = (TK_ELSEIF);
	
        //
        // Rule 38:  KeyWord ::= E L S E
        //
		keywordKind[38] = (TK_ELSE);
	
        //
        // Rule 39:  KeyWord ::= E N D I F
        //
		keywordKind[39] = (TK_ENDIF);
	
        //
        // Rule 40:  KeyWord ::= L E T
        //
		keywordKind[40] = (TK_LET);
	
        //
        // Rule 41:  KeyWord ::= E N D L E T
        //
		keywordKind[41] = (TK_ENDLET);
	
        //
        // Rule 42:  KeyWord ::= P R O T E C T
        //
		keywordKind[42] = (TK_PROTECT);
	
        //
        // Rule 43:  KeyWord ::= C S T A R T
        //
		keywordKind[43] = (TK_CSTART);
	
        //
        // Rule 44:  KeyWord ::= C E N D
        //
		keywordKind[44] = (TK_CEND);
	
        //
        // Rule 45:  KeyWord ::= I D
        //
		keywordKind[45] = (TK_ID);
	
        //
        // Rule 46:  KeyWord ::= D I S A B L E
        //
		keywordKind[46] = (TK_DISABLE);
	
        //
        // Rule 47:  KeyWord ::= E N D P R O T E C T
        //
		keywordKind[47] = (TK_ENDPROTECT);
	

        for (int i = 0; i < keywordKind.length; i++)
        {
            if (keywordKind[i] == 0)
                keywordKind[i] = identifierKind;
        }
    }
}

