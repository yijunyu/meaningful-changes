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

%options fp=XtendParser,prefix=TK_
%options programming_language=java
%options package=org.eclipse.gmf.internal.xpand.xtend.parser
%options template=../../expression/parser/dtParserTemplateD.g
%options ast_type=ExtensionFile
%options import_terminals=XtendLexer.g
%options lalr=2

$Globals
	/.
	import org.eclipse.gmf.internal.xpand.expression.parser.ExpressionFactory;
	import org.eclipse.gmf.internal.xpand.xtend.ast.*;
	./
$End

$Headers
	/.
		private final ExtensionFactory xtendFactory;
	./
$End

$Start
	extensionFile
$End

$Import
	../../expression/parser/ExpressionParser.g
$End

$Define
	$initialization_code /.xtendFactory = new ExtensionFactory(lexStream.getFileName());
            factory = new ExpressionFactory(lexStream.getFileName());./
$End

$Terminals
	import extension reexport private create cached
	JAVA GLOBALVAR 

	SEMI ::= ';'
$End

$Rules
	extensionFile ::= nsImportsList extImportsList extensions
		/.$BeginJava
			setResult(xtendFactory.createExtensionFile((List) getRhsSym(1) , (List) getRhsSym(2), (List) getRhsSym(3)));
		$EndJava./

	nsImportsList ::= $empty
		/.$BeginJava
			setResult(Collections.EMPTY_LIST);
		$EndJava./
	nsImportsList ::= nsImport nsImportsList
		/.$BeginJava
			List res = new LinkedList();
			res.add(getRhsSym(1));
			res.addAll((List) getRhsSym(2));
			setResult(res);
		$EndJava./

	nsImport ::= 'import' STRING SEMI
		/.$BeginJava
			StringLiteral st = xtendFactory.createStringLiteral(getRhsIToken(2));
			setResult(xtendFactory.createNsImport(getLeftIToken(), getRightIToken(), st));
		$EndJava./


	extImportsList ::= $empty
		/.$BeginJava
			setResult(Collections.EMPTY_LIST);
		$EndJava./
	extImportsList ::= extImport extImportsList
		/.$BeginJava
			List res = new LinkedList();
			res.add(getRhsSym(1));
			res.addAll((List) getRhsSym(2));
			setResult(res);
		$EndJava./

	extImport ::= 'extension' type SEMI
		/.$BeginJava
			setResult(xtendFactory.createExtensionFileImport(getLeftIToken(), getRightIToken(), (Identifier) getRhsSym(2), null));
		$EndJava./

	extImport ::= 'extension' type 'reexport' SEMI
		/.$BeginJava
			setResult(xtendFactory.createExtensionFileImport(getLeftIToken(), getRightIToken(), (Identifier) getRhsSym(2), getRhsIToken(3)));
		$EndJava./

	extensions ::= $empty
		/.$BeginJava
			setResult(Collections.EMPTY_LIST);
		$EndJava./
	extensions ::= extensionDef extensions
		/.$BeginJava
			List res = new LinkedList();
			res.add(getRhsSym(1));
			res.addAll((List) getRhsSym(2));
			setResult(res);
		$EndJava./

	extensionDef -> regularExtension | createExtension

	-- though both JavaExtension and WorkflowExtensions do require type specified, changing typeOpt to type leads to grammar not being LALR(2), hence need more exploration
	regularExtension ::= visibilityOpt cachedOpt typeOpt IDENT LPAREN declaredParameterListOpt RPAREN COLON 'JAVA' instanceSlotOpt javaType LPAREN javaParamsOpt RPAREN SEMI
		/.$BeginJava
			setResult(xtendFactory.createJavaExtension(getRhsIToken(4), getRightIToken(), (Identifier) getRhsSym(3), (List) getRhsSym(6), (Identifier) getRhsSym(11), (List) getRhsSym(13), (IToken) getRhsSym(2), (IToken) getRhsSym(1), (Identifier) getRhsSym(10)));
		$EndJava./
	regularExtension ::= visibilityOpt cachedOpt typeOpt IDENT LPAREN declaredParameterListOpt RPAREN COLON 'GLOBALVAR' slot SEMI
		/.$BeginJava
			setResult(xtendFactory.createWorkflowSlotExtension(getRhsIToken(4), getRightIToken(), (Identifier) getRhsSym(3), (List) getRhsSym(6), (Identifier) getRhsSym(10), (IToken) getRhsSym(2), (IToken) getRhsSym(1)));
		$EndJava./
	regularExtension ::= visibilityOpt cachedOpt typeOpt IDENT LPAREN declaredParameterListOpt RPAREN COLON expression SEMI
		/.$BeginJava
			setResult(xtendFactory.createExpressionExtension(getRhsIToken(4), getRightIToken(), (Identifier) getRhsSym(3), (List) getRhsSym(6), (Expression) getRhsSym(9), (IToken) getRhsSym(2), (IToken) getRhsSym(1)));
		$EndJava./

	createExtension ::= visibilityOpt 'create' type identOpt IDENT LPAREN declaredParameterListOpt RPAREN COLON expression SEMI
		/.$BeginJava
			setResult(xtendFactory.createCreateExtension(getRhsIToken(2), getRightIToken(), (Identifier) getRhsSym(3), (IToken) getRhsSym(4), getRhsIToken(5), (List) getRhsSym(7), (Expression) getRhsSym(10), (IToken) getRhsSym(1)));
		$EndJava./

	visibilityOpt ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	visibilityOpt ::= 'private'
		/.$BeginJava
			setResult(getLeftIToken());
		$EndJava./

	cachedOpt ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	cachedOpt ::= 'cached'
		/.$BeginJava
			setResult(getLeftIToken());
		$EndJava./

	typeOpt ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	typeOpt -> type

	identOpt ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	identOpt ::= IDENT
		/.$BeginJava
			setResult(getLeftIToken());
		$EndJava./

	instanceSlotOpt ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	instanceSlotOpt ::= '[' slot ']'
		/.$BeginJava
			setResult(getRhsSym(2));
		$EndJava./

	javaType ::= IDENT javaTypeSuffix
		/.$BeginJava
			Identifier res = xtendFactory.createIdentifier(getRhsIToken(1));
			for (Object o : (List) getRhsSym(2)) {
				res = res.append(factory.createIdentifier((IToken) o));
			}
			setResult(res);
		$EndJava./

	javaTypeSuffix ::= $empty
		/.$BeginJava
			setResult(Collections.EMPTY_LIST);
		$EndJava./
	javaTypeSuffix ::= DOT IDENT javaTypeSuffix
		/.$BeginJava
			List res = new LinkedList();
			res.add(getRhsIToken(1));
			res.add(getRhsIToken(2));
			res.addAll((List) getRhsSym(3));
			setResult(res);
		$EndJava./
	javaTypeSuffix ::= DOT 'Collection' javaTypeSuffix
		/.$BeginJava
			List res = new LinkedList();
			res.add(getRhsIToken(1));
			res.add(getRhsIToken(2));
			res.addAll((List) getRhsSym(3));
			setResult(res);
		$EndJava./
	javaTypeSuffix ::= DOT 'List' javaTypeSuffix
		/.$BeginJava
			List res = new LinkedList();
			res.add(getRhsIToken(1));
			res.add(getRhsIToken(2));
			res.addAll((List) getRhsSym(3));
			setResult(res);
		$EndJava./
	javaTypeSuffix ::= DOT 'Set' javaTypeSuffix
		/.$BeginJava
			List res = new LinkedList();
			res.add(getRhsIToken(1));
			res.add(getRhsIToken(2));
			res.addAll((List) getRhsSym(3));
			setResult(res);
		$EndJava./

	javaParamsOpt ::= $empty
		/.$BeginJava
			setResult(Collections.EMPTY_LIST);
		$EndJava./
	javaParamsOpt -> javaParams
	javaParams ::= javaType
		/.$BeginJava
			setResult(Collections.singletonList(getRhsSym(1)));
		$EndJava./
	javaParams ::= javaType COMMA javaParams
		/.$BeginJava
			List res = new LinkedList();
			res.add(getRhsSym(1));
			res.addAll((List) getRhsSym(3));
			setResult(res);
		$EndJava./

	slot ::= IDENT
		/.$BeginJava
			setResult(xtendFactory.createIdentifier(getLeftIToken()));
		$EndJava./

$End