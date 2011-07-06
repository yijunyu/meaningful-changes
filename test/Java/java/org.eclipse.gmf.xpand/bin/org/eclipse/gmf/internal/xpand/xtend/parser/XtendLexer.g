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

%options fp=XtendLexer,prefix=Char_
%options package=org.eclipse.gmf.internal.xpand.xtend.parser
%options template=../../expression/parser/LexerTemplateD.g
%options export_terminals=("XtendParsersym.java", "TK_")
%options filter=XtendKWLexer.g

$Import
	../../expression/parser/ExpressionLexer.g
$End

$Define
	$kw_lexer_class /.XtendKWLexer./
$End

$Export
	SEMI
$End

$Alias
	SEMI ::= SemiColon
$End

$Rules
	Token ::= ';'
		/.$BeginAction
				makeToken($_SEMI);
		$EndAction./
$End