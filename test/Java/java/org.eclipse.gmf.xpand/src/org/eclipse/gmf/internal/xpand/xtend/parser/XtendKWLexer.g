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

%options fp=XtendKWLexer,prefix=Char_
%options package=org.eclipse.gmf.internal.xpand.xtend.parser
%options template=../../expression/parser/KeywordTemplateD.g
%options export_terminals=("XtendParsersym.java", "TK_")

$Import
	../../expression/parser/ExpressionKWLexer.g
$End

$Export
	import extension reexport private create cached
	JAVA GLOBALVAR 
$End

$Rules
	KeyWord ::=
		i m p o r t
		/.$BeginAction
			$setResult($_import);
		$EndAction./

		| e x t e n s i o n
		/.$BeginAction
			$setResult($_extension);
		$EndAction./

		| r e e x p o r t
		/.$BeginAction
			$setResult($_reexport);
		$EndAction./

		| p r i v a t e
		/.$BeginAction
			$setResult($_private);
		$EndAction./

		| c r e a t e
		/.$BeginAction
			$setResult($_create);
		$EndAction./

		| c a c h e d
		/.$BeginAction
			$setResult($_cached);
		$EndAction./

		| J A V A
		/.$BeginAction
			$setResult($_JAVA);
		$EndAction./

		| G L O B A L V A R
		/.$BeginAction
			$setResult($_GLOBALVAR);
		$EndAction./
$End