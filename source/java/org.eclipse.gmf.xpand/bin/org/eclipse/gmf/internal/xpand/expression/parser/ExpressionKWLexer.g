--
-- Copyright (c) 2006 Borland Software Corp.
-- 
-- All rights reserved. This program and the accompanying materials
-- are made available under the terms of the Eclipse Public License v1.0
-- which accompanies this distribution, and is available at
-- http://www.eclipse.org/legal/epl-v10.html
--
-- Contributors:
--    Artem Tikhomirov (Borland)
--

%options fp=ExpressionKWLexer,prefix=Char_
%options package=org.eclipse.gmf.internal.xpand.expression.parser
%options template=KeywordTemplateD.g
%options export_terminals=("ExpressionParsersym.java", "TK_")

$Notice
/./*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/./
$End

-- COPY OF KWLexerMap.g, instead of $Include
-- CHANGES: no '$' since none of out keywords use it
$Headers
    /.
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
    ./
$End
-- COPY OF KWLexerMap.g ENDS

$Export
	true
	false
	null
	new
	let
	switch
	case
	default
	implies

	Collection
	List
	Set

	collect
	select
	reject
	exists
	notExists
	forAll
	typeSelect
$End

$Terminals
	a b c d e f g h i j k l m n o p q r s t u v w x y z
	A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
$End

$Start
	KeyWord
$End

$Rules
	KeyWord ::=
		n u l l
		/.$BeginAction
			$setResult($_null);
		  $EndAction
		./

		| t r u e
		/.$BeginAction
			$setResult($_true);
		  $EndAction
		./
		
		| f a l s e
		/.$BeginAction
			$setResult($_false);
		  $EndAction
		./

		| n e w
		/.$BeginAction
			$setResult($_new);
		  $EndAction
		./
		
		| l e t
		/.$BeginAction
			$setResult($_let);
		  $EndAction
		./
		
		| s w i t c h
		/.$BeginAction
			$setResult($_switch);
		  $EndAction
		./
		
		| c a s e
		/.$BeginAction
			$setResult($_case);
		  $EndAction
		./
		
		| d e f a u l t
		/.$BeginAction
			$setResult($_default);
		  $EndAction
		./
		
		| i m p l i e s
		/.$BeginAction
			$setResult($_implies);
		  $EndAction
		./

		| S e t
		/.$BeginAction
			$setResult($_Set);
		  $EndAction
		./
		
		| L i s t
		/.$BeginAction
			$setResult($_List);
		  $EndAction
		./
		
		| C o l l e c t i o n
		/.$BeginAction
			$setResult($_Collection);
		  $EndAction
		./

		| f o r A l l
		/.$BeginAction
			$setResult($_forAll);
		  $EndAction
		./
		
		| e x i s t s
		/.$BeginAction
			$setResult($_exists);
		  $EndAction
		./

		| n o t E x i s t s
		/.$BeginAction
			$setResult($_notExists);
		  $EndAction
		./

		| c o l l e c t
		/.$BeginAction
			$setResult($_collect);
		  $EndAction
		./

		| s e l e c t
		/.$BeginAction
			$setResult($_select);
		  $EndAction
		./

		| r e j e c t
		/.$BeginAction
			$setResult($_reject);
		  $EndAction
		./

		| t y p e S e l e c t
		/.$BeginAction
			$setResult($_typeSelect);
		  $EndAction
		./
$End
