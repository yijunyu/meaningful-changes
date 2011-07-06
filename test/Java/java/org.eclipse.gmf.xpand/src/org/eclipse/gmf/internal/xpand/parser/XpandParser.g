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

%options fp=XpandParser,prefix=TK_
%options programming_language=java
%options package=org.eclipse.gmf.internal.xpand.parser
%options template=../expression/parser/dtParserTemplateD.g
%options ast_type=Template
%options import_terminals=XpandLexer.g
%options lalr=2

$Globals
	/.
	import org.eclipse.gmf.internal.xpand.expression.parser.ExpressionFactory;
	import org.eclipse.gmf.internal.xpand.ast.*;
	./
$End

$Headers
	/.
		private final XpandFactory xpandFactory;
	./
$End

$Start
	template
$End

$Import
	../expression/parser/ExpressionParser.g
$End

$Define
	-- definition of init code should go *after* import
	$initialization_code /.xpandFactory = new XpandFactory(lexStream.getFileName());
			factory = new ExpressionFactory(lexStream.getFileName());./
$End

$Terminals
	IMPORT EXTENSION
	AROUND ENDAROUND
	DEFINE ENDDEFINE
	ERROR
	EXPAND
	FOR SEPARATOR AS ITERATOR 
	FOREACH ENDFOREACH
	FILE ENDFILE
	IF ELSEIF ELSE ENDIF
	LET ENDLET
	PROTECT CSTART CEND ID DISABLE ENDPROTECT

	LG ::= '\u00AB'

--	RG ::= '\u00BB' -- useless
$End

$Rules

	template ::= emptyTemplate
		/.$BeginJava
			setResult(xpandFactory.createTemplate(Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, getRightIToken()));
		$EndJava./

	-- original xpand allows empty templates, not sure what for; added support to handle comments-only content
	emptyTemplate -> $empty | LG TEXT commentTextPairAny

	-- unlike original xpand, do not allow mixed order of imports (ext and regular)
	template ::= LG commentTextPairAny imports extensionImports defineOrAroundSeq
		/.$BeginJava
			List imports = (List) getRhsSym(3);
			List extensionImports = (List) getRhsSym(4);
			List defineOrAround = (List) getRhsSym(5);
			List<Advice> advices = new LinkedList<Advice>();
			List<Definition> defines = new LinkedList<Definition>();
			for (Object o : defineOrAround) {
				if (o instanceof Definition) {
					defines.add((Definition) o);
				} else if (o instanceof Advice) {
					advices.add((Advice) o);
				} else {
					throw new IllegalStateException();// assert false?
				}
			}
			setResult(xpandFactory.createTemplate(imports, extensionImports, defines, advices, getRightIToken()));
		$EndJava./

	defineOrAroundSeq ::= define TEXT commentTextPairAny defineOrAroundSuffix
		/.$BeginJava
			List result = new LinkedList();
			result.add(getRhsSym(1));
			result.addAll((List) getRhsSym(4));
			setResult(result);
		$EndJava./
	defineOrAroundSeq ::= around TEXT commentTextPairAny defineOrAroundSuffix 
		/.$BeginJava
			List result = new LinkedList();
			result.add(getRhsSym(1));
			result.addAll((List) getRhsSym(4));
			setResult(result);
		$EndJava./
	defineOrAroundSuffix ::= $empty
		/.$BeginJava
			setResult(Collections.EMPTY_LIST);
		$EndJava./
	defineOrAroundSuffix -> defineOrAroundSeq

	lgOpt -> $empty | LG
	commentTextPairAny -> $empty | TEXT commentTextPairAny

	imports ::= $empty
		/.$BeginJava
			setResult(Collections.EMPTY_LIST);
		$EndJava./
	imports ::= anImport imports
		/.$BeginJava
			List res = new LinkedList();
			res.add(getRhsSym(1));
			res.addAll((List) getRhsSym(2));
			setResult(res);
		$EndJava./

	anImport ::= "IMPORT" STRING TEXT commentTextPairAny 
		/.$BeginJava
			setResult(xpandFactory.createNamespaceImport(getLeftIToken(),xpandFactory.createStringLiteral(getRhsIToken(2))));
		$EndJava./

	extensionImports ::= $empty
		/.$BeginJava
			setResult(Collections.EMPTY_LIST);
		$EndJava./
	extensionImports ::= anExtensionImport extensionImports
		/.$BeginJava
			List res = new LinkedList();
			res.add(getRhsSym(1));
			res.addAll((List) getRhsSym(2));
			setResult(res);
		$EndJava./

	anExtensionImport ::= "EXTENSION" simpleType TEXT commentTextPairAny 
		/.$BeginJava
			setResult(xpandFactory.createImportDeclaration(getLeftIToken(), (Identifier) getRhsSym(2)));
		$EndJava./

	around ::= "AROUND" pointcut "FOR" type sequence "ENDAROUND"
		/.$BeginJava
			setResult(xpandFactory.createAround(getLeftIToken(), getRightIToken(), (Identifier) getRhsSym(2), Collections.EMPTY_LIST, false, (Identifier) getRhsSym(4), (List) getRhsSym(5)));
		$EndJava./
	around ::= "AROUND" pointcut LPAREN declaredParameterList RPAREN "FOR" type sequence "ENDAROUND"
		/.$BeginJava
			setResult(xpandFactory.createAround(getLeftIToken(), getRightIToken(), (Identifier) getRhsSym(2), (List) getRhsSym(4), false, (Identifier) getRhsSym(7), (List) getRhsSym(8)));
		$EndJava./
	around ::= "AROUND" pointcut LPAREN declaredParameterList COMMA MULTI RPAREN "FOR" type sequence "ENDAROUND"
		/.$BeginJava
			setResult(xpandFactory.createAround(getLeftIToken(), getRightIToken(), (Identifier) getRhsSym(2), (List) getRhsSym(4), true, (Identifier) getRhsSym(9), (List) getRhsSym(10)));
		$EndJava./
	around ::= "AROUND" pointcut LPAREN MULTI RPAREN "FOR" type sequence "ENDAROUND"
		/.$BeginJava
			setResult(xpandFactory.createAround(getLeftIToken(), getRightIToken(), (Identifier) getRhsSym(2), Collections.EMPTY_LIST, true, (Identifier) getRhsSym(7), (List) getRhsSym(8)));
		$EndJava./

	pointcut ::= MULTI pointcutSuffix 
		/.$BeginJava
			Identifier res = xpandFactory.createIdentifier(getLeftIToken());
			if (getRhsSym(2) != null) {
				res = res.append((Identifier) getRhsSym(2));
			}
			setResult(res);
		$EndJava./
	pointcut ::= IDENT pointcutSuffix
		/.$BeginJava
			Identifier res = xpandFactory.createIdentifier(getLeftIToken());
			if (getRhsSym(2) != null) {
				res = res.append((Identifier) getRhsSym(2));
			}
			setResult(res);
		$EndJava./

	pointcutSuffix ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	pointcutSuffix -> pointcut
	pointcutSuffix ::= DCOLON pointcutSuffix
		/.$BeginJava
			Identifier res = xpandFactory.createIdentifier(getLeftIToken());
			if (getRhsSym(2) != null) {
				res = res.append((Identifier) getRhsSym(2));
			}
			setResult(res);
		$EndJava./

	define ::= "DEFINE" IDENT  "FOR" type sequence "ENDDEFINE"
		/.$BeginJava
			setResult(xpandFactory.createDefinition(getLeftIToken(), getRightIToken(), getRhsIToken(2), Collections.EMPTY_LIST, (Identifier) getRhsSym(4), (List) getRhsSym(5)));
		$EndJava./
	define ::= "DEFINE" IDENT LPAREN declaredParameterList RPAREN "FOR" type sequence "ENDDEFINE"
		/.$BeginJava
			setResult(xpandFactory.createDefinition(getLeftIToken(), getRightIToken(), getRhsIToken(2), (List) getRhsSym(4), (Identifier) getRhsSym(7), (List) getRhsSym(8)));
		$EndJava./
	
	sequence ::= text sequenceSuffix
		/.$BeginJava
			List res = new LinkedList();
			res.addAll((List) getRhsSym(1));
			res.addAll((List) getRhsSym(2));
			setResult(res);
		$EndJava./
	sequenceSuffix ::= $empty
		/.$BeginJava
			setResult(Collections.EMPTY_LIST);
		$EndJava./
	sequenceSuffix ::= statement text sequenceSuffix
		/.$BeginJava
			List res = new LinkedList();
			res.add(getRhsSym(1));
			res.addAll((List) getRhsSym(2));
			res.addAll((List) getRhsSym(3));
			setResult(res);
		$EndJava./


--
-- Statements
--
--
	statement -> simpleStatement | fileStatement | foreachStatement | ifStatement | letStatement | protectStatement

	text ::= minusOpt TEXT textSuffix 
		/.$BeginJava
			List res = new LinkedList();
			res.add(xpandFactory.createTextStatement(getRhsIToken(2), (IToken) getRhsSym(1)));
			res.addAll((List) getRhsSym(3));
			setResult(res);
		$EndJava./

	textSuffix ::= $empty
		/.$BeginJava
			setResult(Collections.EMPTY_LIST);
		$EndJava./
	textSuffix ::= minusOpt TEXT textSuffix
		/.$BeginJava
			List res = new LinkedList();
			res.add(xpandFactory.createTextStatement(getRhsIToken(2), (IToken) getRhsSym(1)));
			res.addAll((List) getRhsSym(3));
			setResult(res);
		$EndJava./

	minusOpt ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	minusOpt ::= MINUS
		/.$BeginJava
			setResult(getLeftIToken());
		$EndJava./

	simpleStatement -> errorStatement | expandStatement | expressionStmt

	errorStatement ::= "ERROR" expression
		/.$BeginJava
			setResult(xpandFactory.createErrorStatement(getLeftIToken(), (Expression) getRhsSym(2)));
		$EndJava./


	expandStatement ::= "EXPAND" definitionName parameterListOpt
		/.$BeginJava
			setResult(xpandFactory.createExpandStatement(getLeftIToken(), (Identifier) getRhsSym(2), (List) getRhsSym(3), null, false, null));
		$EndJava./
	expandStatement ::= "EXPAND" definitionName parameterListOpt "FOR" expression
		/.$BeginJava
			setResult(xpandFactory.createExpandStatement(getLeftIToken(), (Identifier) getRhsSym(2), (List) getRhsSym(3), (Expression) getRhsSym(5), false, null));
		$EndJava./
	expandStatement ::= "EXPAND" definitionName parameterListOpt "FOREACH" expression separatorOpt
		/.$BeginJava
			setResult(xpandFactory.createExpandStatement(getLeftIToken(), (Identifier) getRhsSym(2), (List) getRhsSym(3), (Expression) getRhsSym(5), true, (Expression) getRhsSym(6)));
		$EndJava./

	parameterListOpt ::= $empty
		/.$BeginJava
			setResult(Collections.EMPTY_LIST);
		$EndJava./
	parameterListOpt ::= LPAREN parameterList RPAREN
		/.$BeginJava
			setResult(getRhsSym(2));
		$EndJava./


	definitionName -> simpleType

	expressionStmt ::= expression
		/.$BeginJava
			setResult(xpandFactory.createExpressionStatement((Expression) getRhsSym(1)));
		$EndJava./

	fileStatement ::= "FILE" expression identOpt sequence "ENDFILE"
		/.$BeginJava
			setResult(xpandFactory.createFileStatement(getLeftIToken(), getRightIToken(), (Expression) getRhsSym(2), (Identifier) getRhsSym(3), (List) getRhsSym(4)));
		$EndJava./

	identOpt ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	identOpt ::= IDENT
		/.$BeginJava
			setResult(xpandFactory.createIdentifier(getLeftIToken()));
		$EndJava./

	foreachStatement ::= "FOREACH" expression "AS" IDENT iteratorOpt separatorOpt sequence "ENDFOREACH"
		/.$BeginJava
			setResult(xpandFactory.createForEachStatement(getLeftIToken(), getRightIToken(), (Expression) getRhsSym(2), getRhsIToken(4), (Expression) getRhsSym(6), (IToken) getRhsSym(5), (List) getRhsSym(7)));
		$EndJava./

	iteratorOpt ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	iteratorOpt ::= "ITERATOR" IDENT
		/.$BeginJava
			setResult(getRightIToken());
		$EndJava./

	separatorOpt ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	separatorOpt ::= "SEPARATOR" expression
		/.$BeginJava
			setResult(getRhsSym(2));
		$EndJava./


	ifStatement ::= "IF" expression sequence elseifAny elseOpt "ENDIF"
		/.$BeginJava
			IfStatement i = xpandFactory.createIfStatement(getLeftIToken(), (Expression) getRhsSym(2), (List) getRhsSym(3), null);
			IfStatement elseIf = (IfStatement) getRhsSym(4);
			IfStatement elseStmt = (IfStatement) getRhsSym(5);
			if (elseIf != null) {
				i.setElseIf(elseIf);
				IfStatement curElseIf = elseIf;
				// get the latest one in the chain
				while (curElseIf.getElseIf() != null) {
					curElseIf = curElseIf.getElseIf();
				}
				curElseIf.setElseIf(elseStmt);
			} else {
				i.setElseIf(elseStmt);
			}
			setResult(i);
		$EndJava./

	elseifAny ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	elseifAny ::= "ELSEIF" expression sequence elseifAny
		/.$BeginJava
			IfStatement elseIf = xpandFactory.createIfStatement(getLeftIToken(), (Expression) getRhsSym(2), (List) getRhsSym(3), null);
			IfStatement restElseIf = (IfStatement) getRhsSym(4);
			elseIf.setElseIf(restElseIf);
			setResult(elseIf);
		$EndJava./

	elseOpt ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	elseOpt ::= "ELSE" sequence
		/.$BeginJava
			setResult(xpandFactory.createIfStatement(getLeftIToken(), null, (List) getRhsSym(2), null));
		$EndJava./

	letStatement ::= "LET" expression "AS" IDENT sequence "ENDLET"
		/.$BeginJava
			setResult(xpandFactory.createLetStatement(getLeftIToken(), getRightIToken(), (Expression) getRhsSym(2), getRhsIToken(4), (List) getRhsSym(5)));
		$EndJava./
	
	protectStatement ::= "PROTECT" "CSTART" expression "CEND" expression "ID" expression disabledOpt sequence "ENDPROTECT"
		/.$BeginJava
			setResult(xpandFactory.createProtectStatement(getLeftIToken(), getRightIToken(), (Expression) getRhsSym(3), (Expression) getRhsSym(5), (Expression) getRhsSym(7), (IToken) getRhsSym(8), (List) getRhsSym(9)));
		$EndJava./

	disabledOpt ::= $empty
		/.$BeginJava
			setResult(null);
		$EndJava./
	disabledOpt ::= "DISABLE"
		/.$BeginJava
			setResult(getLeftIToken());
		$EndJava./

$End