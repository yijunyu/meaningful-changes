/*******************************************************************************
* Copyright (c) 2006, 2007 Eclipse.org
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.eclipse.gmf.internal.xpand.parser;

import lpg.lpgjavaruntime.*;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.gmf.internal.xpand.util.ParserException.ErrorLocationInfo;

import org.eclipse.gmf.internal.xpand.expression.parser.ExpressionFactory;
import org.eclipse.gmf.internal.xpand.ast.*;

import org.eclipse.gmf.internal.xpand.expression.ast.*;

import java.util.Collections;

public class XpandParser extends PrsStream implements RuleAction {
    private static ParseTable prs = new XpandParserprs();
    private DeterministicParser dtParser;

    public DeterministicParser getParser() { return dtParser; }
    private void setResult(Object object) { dtParser.setSym1(object); }
    public Object getRhsSym(int i) { return dtParser.getSym(i); }

    public int getRhsTokenIndex(int i) { return dtParser.getToken(i); }
    public IToken getRhsIToken(int i) { return super.getIToken(getRhsTokenIndex(i)); }
    
    public int getRhsFirstTokenIndex(int i) { return dtParser.getFirstToken(i); }
    public IToken getRhsFirstIToken(int i) { return super.getIToken(getRhsFirstTokenIndex(i)); }

    public int getRhsLastTokenIndex(int i) { return dtParser.getLastToken(i); }
    public IToken getRhsLastIToken(int i) { return super.getIToken(getRhsLastTokenIndex(i)); }

    public int getLeftSpan() { return dtParser.getFirstToken(); }
    public IToken getLeftIToken()  { return super.getIToken(getLeftSpan()); }

    public int getRightSpan() { return dtParser.getLastToken(); }
    public IToken getRightIToken() { return super.getIToken(getRightSpan()); }

    public int getRhsErrorTokenIndex(int i) {
        int index = dtParser.getToken(i);
        IToken err = super.getIToken(index);
        return (err instanceof ErrorToken ? index : 0);
    }
    public ErrorToken getRhsErrorIToken(int i) {
        int index = dtParser.getToken(i);
        IToken err = super.getIToken(index);
        return (ErrorToken) (err instanceof ErrorToken ? err : null);
    }

    public XpandParser(LexStream lexStream) {
        super(lexStream);
        xpandFactory = new XpandFactory(lexStream.getFileName());
		factory = new ExpressionFactory(lexStream.getFileName());

        try {
            super.remapTerminalSymbols(orderedTerminalSymbols(), XpandParserprs.EOFT_SYMBOL);
        }
        catch(NullExportedSymbolsException e) {
        }
        catch(NullTerminalSymbolsException e) {
        }
        catch(UnimplementedTerminalsException e) {
            java.util.ArrayList unimplemented_symbols = e.getSymbols();
            System.out.println("The Lexer will not scan the following token(s):");
            for (int i = 0; i < unimplemented_symbols.size(); i++)
            {
                Integer id = (Integer) unimplemented_symbols.get(i);
                System.out.println("    " + XpandParsersym.orderedTerminalSymbols[id.intValue()]);               
            }
            System.out.println();                        
        }
        catch(UndefinedEofSymbolException e) {
            throw new Error(new UndefinedEofSymbolException
                                ("The Lexer does not implement the Eof symbol " +
                                 XpandParsersym.orderedTerminalSymbols[XpandParserprs.EOFT_SYMBOL]));
        } 
    }

    public String[] orderedTerminalSymbols() { return XpandParsersym.orderedTerminalSymbols; }
    public String getTokenKindName(int kind) { return XpandParsersym.orderedTerminalSymbols[kind]; }            
    public int getEOFTokenKind() { return XpandParserprs.EOFT_SYMBOL; }
    public PrsStream getParseStream() { return (PrsStream) this; }

    public Template parser() {
        return parser(null, 0);
    }
        
    public Template parser(Monitor monitor) {
        return parser(monitor, 0);
    }
        
    public Template parser(int error_repair_count) {
        return parser(null, error_repair_count);
    }
        
    public Template parser(Monitor monitor, int error_repair_count) {
        try {
        	resetErrors();
            dtParser = new DeterministicParser(monitor, (TokenStream)this, prs, (RuleAction)this);
        }
        catch (NotDeterministicParseTableException e) {
            throw new Error(new NotDeterministicParseTableException
                                ("Regenerate XpandParserprs.java with -NOBACKTRACK option"));
        }
        catch (BadParseSymFileException e) {
            throw new Error(new BadParseSymFileException("Bad Parser Symbol File -- XpandParsersym.java. Regenerate XpandParserprs.java"));
        }

        try {
            return (Template) dtParser.parse();
        }
        catch (BadParseException e) {
            reset(e.error_token); // point to error token

            DiagnoseParser diagnoseParser = new DiagnoseParser(this, prs);
            diagnoseParser.diagnose(e.error_token);
        }

        return null;
    }


	public ErrorLocationInfo[] getErrors() {
		return errors.toArray(new ErrorLocationInfo[errors.size()]);
	}

	private void resetErrors() {
		errors.clear();
	}

	private final List<ErrorLocationInfo> errors = new LinkedList<ErrorLocationInfo>();

	@Override
	public void reportError(int errorCode, String locationInfo, int leftToken, int rightToken, String tokenText) {
		final int leftTokenLine = getLine(leftToken);
		final int leftTokenColumn = getColumn(leftToken);
		final int rightTokenLine = getEndLine(rightToken);
		final int rightTokenColumn = getEndColumn(rightToken);
		final String msg = tokenText + errorMsgText[errorCode];
		errors.add(new ErrorLocationInfo(msg, leftTokenLine, leftTokenColumn, rightTokenLine, rightTokenColumn));
	}
/*
	@Override
	public void reportError(int leftToken, int rightToken) {
		int errorCode = (rightToken >= getStreamLength() ? EOF_CODE : leftToken == rightToken ? LEX_ERROR_CODE : INVALID_TOKEN_CODE);
		int endToken = (leftToken == rightToken ? rightToken : rightToken - 1);
		String msg = (errorCode == EOF_CODE ? "End-of-file " : errorCode == INVALID_TOKEN_CODE
					? "\"" + new String(getInputChars(), leftToken, rightToken - leftToken) + "\" "
					: "\"" + getCharValue(leftToken) + "\" ");

		final int leftTokenLine = getLine(leftToken);
		final int leftTokenColumn = getColumn(leftToken);
		final int rightTokenLine = getEndLine(endToken);
		final int rightTokenColumn = getEndColumn(endToken);
		errors.add(new ErrorLocationInfo(msg, leftTokenLine, leftTokenColumn, rightTokenLine, rightTokenColumn));
	}
*/
	@Override
	public void reportError(int errorCode, String locationInfo, String tokenText) {
		try {
			Matcher m = Pattern.compile("[^:]+:(\\d+):(\\d+):(\\d+):(\\d+):.*").matcher(locationInfo);
			boolean t = m.matches(); // ignore return value, rely on exception if anything wrong
			assert t;
			final int leftTokenLine = getLine(Integer.parseInt(m.group(1)));
			final int leftTokenColumn = getColumn(Integer.parseInt(m.group(2)));
			final int rightTokenLine = getEndLine(Integer.parseInt(m.group(3)));
			final int rightTokenColumn = getEndColumn(Integer.parseInt(m.group(4)));
			final String msg = tokenText + errorMsgText[errorCode];
			errors.add(new ErrorLocationInfo(msg, leftTokenLine, leftTokenColumn, rightTokenLine, rightTokenColumn));
		} catch (Exception ex) {
			// ignore
			errors.add(new ErrorLocationInfo(tokenText + errorMsgText[errorCode]));
		}
	}

	private final XpandFactory xpandFactory;

	private final ExpressionFactory factory;

    public void ruleAction(int ruleNumber) {
        switch (ruleNumber) {
 
            //
            // Rule 2:  letExpression ::= let IDENT ASSIGN castedExpression COLON castedExpression
            //
            case 2: {
                
		setResult(factory.createLetExpression(getLeftIToken(),getRhsIToken(2),(Expression) getRhsSym(4), (Expression) getRhsSym(6)));
	          break;
            } 
            //
            // Rule 4:  castedExpression ::= LPAREN type RPAREN infixExpression
            //
            case 4: {
                
		setResult(factory.createCast(getLeftIToken(), (Identifier) getRhsSym(2),(Expression) getRhsSym(4)));
	          break;
            } 
            //
            // Rule 7:  chainExpression ::= ifExpression ARROW chainExpression
            //
            case 7: {
                
		Expression e = (Expression) getRhsSym(1);
		Expression right = (Expression) getRhsSym(3);
		if (right instanceof ChainExpression) {
			ChainExpression rchain = (ChainExpression) right;
			Expression newFirst = factory.createChainExpression(e, rchain.getFirst()); 
			setResult(factory.createChainExpression(newFirst, rchain.getNext()));
		} else {
			setResult(factory.createChainExpression(e, right));
		}
	          break;
            } 
            //
            // Rule 9:  ifExpression ::= switchExpression QUESTION_MARK switchExpression COLON switchExpression
            //
            case 9: {
                
		setResult(factory.createIf((Expression) getRhsSym(1),(Expression) getRhsSym(3), (Expression) getRhsSym(5)));
	          break;
            } 
            //
            // Rule 10:  switchExpression ::= switch LPAREN expression RPAREN LCURLY switchCases default COLON orExpression RCURLY
            //
            case 10: {
                
		setResult(factory.createSwitchExpression(getLeftIToken(),getRightIToken(), (Expression) getRhsSym(3), (List) getRhsSym(6), (Expression) getRhsSym(9)));
	          break;
            } 
            //
            // Rule 12:  switchCases ::= $Empty
            //
            case 12: {
                
		setResult(Collections.emptyList());
	          break;
            } 
            //
            // Rule 13:  switchCases ::= case orExpression COLON orExpression switchCases
            //
            case 13: {
                
		LinkedList r = new LinkedList();
		r.add(factory.createCase(getLeftIToken(), (Expression) getRhsSym(2), (Expression) getRhsSym(4)));
		r.addAll((List) getRhsSym(5));
		setResult(r);
	          break;
            } 
            //
            // Rule 15:  orExpression ::= andExpression OR orExpression
            //
            case 15: {
                
		Expression e = (Expression) getRhsSym(1);
		Expression r = (Expression) getRhsSym(3);
		setResult(factory.createBooleanOperation(e.getStart(),r.getEnd(),e.getLine(),getRhsIToken(2),e,r));
	          break;
            } 
            //
            // Rule 17:  andExpression ::= impliesExpression AND andExpression
            //
            case 17: {
                
		Expression e = (Expression) getRhsSym(1);
		Expression r = (Expression) getRhsSym(3);
		setResult(factory.createBooleanOperation(e.getStart(),r.getEnd(),e.getLine(),getRhsIToken(2),e,r));
	          break;
            } 
            //
            // Rule 19:  impliesExpression ::= relationalExpression implies relationalExpression
            //
            case 19: {
                
		Expression e = (Expression) getRhsSym(1);
		Expression r = (Expression) getRhsSym(3);
		setResult(factory.createBooleanOperation(e.getStart(),r.getEnd(),e.getLine(),getRhsIToken(2),e,r));
	          break;
            } 
            //
            // Rule 21:  relationalExpression ::= additiveExpression relationalOperator additiveExpression
            //
            case 21: {
                
		Expression e = (Expression) getRhsSym(1);
		IToken t = (IToken) getRhsSym(2);
		Expression r = (Expression) getRhsSym(3);
		setResult(factory.createOperationCall(e.getStart(),r.getEnd(),e.getLine(),t,e,Collections.singletonList(r)));
	          break;
            } 
            //
            // Rule 22:  relationalOperator ::= EQ
            //
            case 22: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 23:  relationalOperator ::= NE
            //
            case 23: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 24:  relationalOperator ::= GE
            //
            case 24: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 25:  relationalOperator ::= LE
            //
            case 25: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 26:  relationalOperator ::= GT
            //
            case 26: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 27:  relationalOperator ::= LT
            //
            case 27: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 29:  additiveExpression ::= additiveExpression additiveOperator multiplicativeExpression
            //
            case 29: {
                
		Expression e = (Expression) getRhsSym(1);
		IToken t = (IToken) getRhsSym(2);
		Expression r = (Expression) getRhsSym(3);
		setResult(factory.createOperationCall(e.getStart(),r.getEnd(),e.getLine(),t,e,Collections.singletonList(r)));
	          break;
            } 
            //
            // Rule 30:  additiveOperator ::= PLUS
            //
            case 30: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 31:  additiveOperator ::= MINUS
            //
            case 31: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 33:  multiplicativeExpression ::= unaryExpression multiplicativeOperator multiplicativeExpression
            //
            case 33: {
                
		Expression e = (Expression) getRhsSym(1);
		IToken t = (IToken) getRhsSym(2);
		Expression r = (Expression) getRhsSym(3);
		setResult(factory.createOperationCall(e.getStart(),r.getEnd(),e.getLine(),t,e,Collections.singletonList(r)));
	          break;
            } 
            //
            // Rule 34:  multiplicativeOperator ::= MULTI
            //
            case 34: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 35:  multiplicativeOperator ::= DIV
            //
            case 35: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 37:  unaryExpression ::= NOT infixExpression
            //
            case 37: {
                
		Expression e = (Expression) getRhsSym(2);
		setResult(factory.createOperationCall(getLeftIToken().getColumn(),e.getEnd(),getLeftIToken().getLine(),getLeftIToken(),e,Collections.EMPTY_LIST));
	          break;
            } 
            //
            // Rule 38:  unaryExpression ::= MINUS infixExpression
            //
            case 38: {
                
		Expression e = (Expression) getRhsSym(2);
		setResult(factory.createOperationCall(getLeftIToken().getColumn(),e.getEnd(),getLeftIToken().getLine(),getLeftIToken(),e,Collections.EMPTY_LIST));
	          break;
            } 
            //
            // Rule 39:  infixExpressionSuffix ::= DOT featureCall
            //
            case 39: {
                
		setResult(getRhsSym(2));
	          break;
            } 
            //
            // Rule 40:  infixExpressionSuffix ::= DOT featureCall infixExpressionSuffix
            //
            case 40: {
                
		final FeatureCall op = (FeatureCall) getRhsSym(3);
		FeatureCall fc = op;
		while (fc.getTarget() != null) {
			fc = (FeatureCall) fc.getTarget();
		}
		fc.setTarget((FeatureCall) getRhsSym(2));
		setResult(op);
	          break;
            } 
            //
            // Rule 42:  infixExpression ::= primaryExpression infixExpressionSuffix
            //
            case 42: {
                
		final FeatureCall op = (FeatureCall) getRhsSym(2);
		FeatureCall fc = op;
		while (fc.getTarget() != null) {
			fc = (FeatureCall) fc.getTarget();
		}
		fc.setTarget((Expression) getRhsSym(1));
		setResult(op);
	          break;
            } 
            //
            // Rule 43:  primaryExpression ::= STRING
            //
            case 43: {
                
		setResult(factory.createStringLiteral(getLeftIToken()));
	          break;
            } 
            //
            // Rule 51:  primaryExpression ::= LPAREN expression RPAREN
            //
            case 51: {
                
		setResult(getRhsSym(2));
	          break;
            } 
            //
            // Rule 52:  featureCall ::= IDENT LPAREN parameterList RPAREN
            //
            case 52: {
                
		setResult(factory.createOperationCall(getRightIToken(),getLeftIToken(),null, (List<Expression>) getRhsSym(3)));
	          break;
            } 
            //
            // Rule 53:  featureCall ::= IDENT LPAREN RPAREN
            //
            case 53: {
                
		setResult(factory.createOperationCall(getRightIToken(), getLeftIToken(), null, Collections.EMPTY_LIST));
	          break;
            } 
            //
            // Rule 54:  featureCall ::= type
            //
            case 54: {
                
		setResult(factory.createFeatureCall((Identifier) getRhsSym(1),null));
	          break;
            } 
            //
            // Rule 56:  listLiteral ::= LCURLY parameterList RCURLY
            //
            case 56: {
                
		setResult(factory.createListLiteral(getLeftIToken(),getRightIToken(), (List<Expression>) getRhsSym(2)));
	          break;
            } 
            //
            // Rule 57:  listLiteral ::= LCURLY RCURLY
            //
            case 57: {
                
		setResult(factory.createListLiteral(getLeftIToken(), getRightIToken(), Collections.EMPTY_LIST));
	          break;
            } 
            //
            // Rule 58:  constructorCall ::= new simpleType
            //
            case 58: {
                
		setResult(factory.createConstructorCall(getLeftIToken(), (Identifier) getRhsSym(2)));
	          break;
            } 
            //
            // Rule 59:  booleanLiteral ::= false
            //
            case 59: {
                
		setResult(factory.createBooleanLiteral(getRhsIToken(1)));
	          break;
            } 
            //
            // Rule 60:  booleanLiteral ::= true
            //
            case 60: {
                
		setResult(factory.createBooleanLiteral(getRhsIToken(1)));
	          break;
            } 
            //
            // Rule 61:  nullLiteral ::= null
            //
            case 61: {
                
		setResult(factory.createNullLiteral(getRhsIToken(1)));
	          break;
            } 
            //
            // Rule 62:  intLiteral ::= INT_CONST
            //
            case 62: {
                
		setResult(factory.createIntegerLiteral(getRhsIToken(1)));
	          break;
            } 
            //
            // Rule 63:  realLiteral ::= REAL_CONST
            //
            case 63: {
                
		setResult(factory.createRealLiteral(getRhsIToken(1)));
	          break;
            } 
            //
            // Rule 64:  collectionExpression ::= typeSelect LPAREN type RPAREN
            //
            case 64: {
                
		setResult(factory.createTypeSelectExpression(getRhsIToken(1), getRightIToken(), (Identifier) getRhsSym(3),null));
	          break;
            } 
            //
            // Rule 65:  collectionExpression ::= collectionExpressionName LPAREN IDENT BAR expression RPAREN
            //
            case 65: {
                
		setResult(factory.createCollectionExpression((IToken) getRhsSym(1), getRightIToken(), getRhsIToken(3), (Expression) getRhsSym(5),null));
	          break;
            } 
            //
            // Rule 66:  collectionExpression ::= collectionExpressionName LPAREN expression RPAREN
            //
            case 66: {
                
		setResult(factory.createCollectionExpression((IToken) getRhsSym(1), getRightIToken(), null, (Expression) getRhsSym(3),null));
	          break;
            } 
            //
            // Rule 67:  collectionExpressionName ::= collect
            //
            case 67: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 68:  collectionExpressionName ::= select
            //
            case 68: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 69:  collectionExpressionName ::= reject
            //
            case 69: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 70:  collectionExpressionName ::= exists
            //
            case 70: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 71:  collectionExpressionName ::= notExists
            //
            case 71: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 72:  collectionExpressionName ::= forAll
            //
            case 72: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 73:  declaredParameterListOpt ::= $Empty
            //
            case 73: {
                
		setResult(Collections.EMPTY_LIST);
	          break;
            } 
            //
            // Rule 75:  declaredParameterList ::= type IDENT
            //
            case 75: {
                
		Identifier id = factory.createIdentifier(getRightIToken());
		DeclaredParameter p = factory.createDeclaredParameter((Identifier) getRhsSym(1), id);
		setResult(Collections.singletonList(p));
	          break;
            } 
            //
            // Rule 76:  declaredParameterList ::= type IDENT COMMA declaredParameterList
            //
            case 76: {
                
		LinkedList r = new LinkedList();
		Identifier id = factory.createIdentifier(getRhsIToken(2));
		DeclaredParameter p = factory.createDeclaredParameter((Identifier) getRhsSym(1), id);
		r.add(p);
		r.addAll((List) getRhsSym(4));
		setResult(r);
	          break;
            } 
            //
            // Rule 77:  parameterList ::= expression
            //
            case 77: {
                
		setResult(Collections.singletonList((Expression) getRhsSym(1)));
	          break;
            } 
            //
            // Rule 78:  parameterList ::= expression COMMA parameterList
            //
            case 78: {
                
		LinkedList r = new LinkedList();
		r.add(getRhsSym(1));
		r.addAll((List) getRhsSym(3));
		setResult(r);
	          break;
            } 
            //
            // Rule 81:  collectionType ::= collectionTypeName LSQUARE simpleType RSQUARE
            //
            case 81: {
                
		Identifier id = (Identifier) getRhsSym(1);
		id = id.append(factory.createIdentifier(getRhsIToken(2)));
		id = id.append((Identifier) getRhsSym(3));
		id = id.append(factory.createIdentifier(getRhsIToken(4)));
		setResult(id);
	          break;
            } 
            //
            // Rule 82:  collectionTypeName ::= Collection
            //
            case 82: {
                
		setResult(factory.createIdentifier(getRhsIToken(1)));
	          break;
            } 
            //
            // Rule 83:  collectionTypeName ::= List
            //
            case 83: {
                
		setResult(factory.createIdentifier(getRhsIToken(1)));
	          break;
            } 
            //
            // Rule 84:  collectionTypeName ::= Set
            //
            case 84: {
                
		setResult(factory.createIdentifier(getRhsIToken(1)));
	          break;
            } 
            //
            // Rule 85:  simpleType ::= IDENT NOT qualifiedType
            //
            case 85: {
                
		Identifier id = factory.createIdentifier(getLeftIToken());
		id = id.append(factory.createIdentifier(getRhsIToken(2)));
		id = id.append((Identifier) getRhsSym(3));
		setResult(id);
	          break;
            } 
            //
            // Rule 87:  qualifiedType ::= IDENT
            //
            case 87: {
                
		setResult(factory.createIdentifier(getLeftIToken()));
	          break;
            } 
            //
            // Rule 88:  qualifiedType ::= IDENT DCOLON qualifiedType
            //
            case 88: {
                
		Identifier id = factory.createIdentifier(getLeftIToken());
		id = id.append(factory.createIdentifier(getRhsIToken(2)));
		id = id.append((Identifier) getRhsSym(3));
		setResult(id);
	          break;
            } 
            //
            // Rule 89:  template ::= emptyTemplate
            //
            case 89: {
                
		setResult(xpandFactory.createTemplate(Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, getRightIToken()));
	          break;
            } 
            //
            // Rule 92:  template ::= LG commentTextPairAny imports extensionImports defineOrAroundSeq
            //
            case 92: {
                
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
	          break;
            } 
            //
            // Rule 93:  defineOrAroundSeq ::= define TEXT commentTextPairAny defineOrAroundSuffix
            //
            case 93: {
                
		List result = new LinkedList();
		result.add(getRhsSym(1));
		result.addAll((List) getRhsSym(4));
		setResult(result);
	          break;
            } 
            //
            // Rule 94:  defineOrAroundSeq ::= around TEXT commentTextPairAny defineOrAroundSuffix
            //
            case 94: {
                
		List result = new LinkedList();
		result.add(getRhsSym(1));
		result.addAll((List) getRhsSym(4));
		setResult(result);
	          break;
            } 
            //
            // Rule 95:  defineOrAroundSuffix ::= $Empty
            //
            case 95: {
                
		setResult(Collections.EMPTY_LIST);
	          break;
            } 
            //
            // Rule 101:  imports ::= $Empty
            //
            case 101: {
                
		setResult(Collections.EMPTY_LIST);
	          break;
            } 
            //
            // Rule 102:  imports ::= anImport imports
            //
            case 102: {
                
		List res = new LinkedList();
		res.add(getRhsSym(1));
		res.addAll((List) getRhsSym(2));
		setResult(res);
	          break;
            } 
            //
            // Rule 103:  anImport ::= IMPORT STRING TEXT commentTextPairAny
            //
            case 103: {
                
		setResult(xpandFactory.createNamespaceImport(getLeftIToken(),xpandFactory.createStringLiteral(getRhsIToken(2))));
	          break;
            } 
            //
            // Rule 104:  extensionImports ::= $Empty
            //
            case 104: {
                
		setResult(Collections.EMPTY_LIST);
	          break;
            } 
            //
            // Rule 105:  extensionImports ::= anExtensionImport extensionImports
            //
            case 105: {
                
		List res = new LinkedList();
		res.add(getRhsSym(1));
		res.addAll((List) getRhsSym(2));
		setResult(res);
	          break;
            } 
            //
            // Rule 106:  anExtensionImport ::= EXTENSION simpleType TEXT commentTextPairAny
            //
            case 106: {
                
		setResult(xpandFactory.createImportDeclaration(getLeftIToken(), (Identifier) getRhsSym(2)));
	          break;
            } 
            //
            // Rule 107:  around ::= AROUND pointcut FOR type sequence ENDAROUND
            //
            case 107: {
                
		setResult(xpandFactory.createAround(getLeftIToken(), getRightIToken(), (Identifier) getRhsSym(2), Collections.EMPTY_LIST, false, (Identifier) getRhsSym(4), (List) getRhsSym(5)));
	          break;
            } 
            //
            // Rule 108:  around ::= AROUND pointcut LPAREN declaredParameterList RPAREN FOR type sequence ENDAROUND
            //
            case 108: {
                
		setResult(xpandFactory.createAround(getLeftIToken(), getRightIToken(), (Identifier) getRhsSym(2), (List) getRhsSym(4), false, (Identifier) getRhsSym(7), (List) getRhsSym(8)));
	          break;
            } 
            //
            // Rule 109:  around ::= AROUND pointcut LPAREN declaredParameterList COMMA MULTI RPAREN FOR type sequence ENDAROUND
            //
            case 109: {
                
		setResult(xpandFactory.createAround(getLeftIToken(), getRightIToken(), (Identifier) getRhsSym(2), (List) getRhsSym(4), true, (Identifier) getRhsSym(9), (List) getRhsSym(10)));
	          break;
            } 
            //
            // Rule 110:  around ::= AROUND pointcut LPAREN MULTI RPAREN FOR type sequence ENDAROUND
            //
            case 110: {
                
		setResult(xpandFactory.createAround(getLeftIToken(), getRightIToken(), (Identifier) getRhsSym(2), Collections.EMPTY_LIST, true, (Identifier) getRhsSym(7), (List) getRhsSym(8)));
	          break;
            } 
            //
            // Rule 111:  pointcut ::= MULTI pointcutSuffix
            //
            case 111: {
                
		Identifier res = xpandFactory.createIdentifier(getLeftIToken());
		if (getRhsSym(2) != null) {
			res = res.append((Identifier) getRhsSym(2));
		}
		setResult(res);
	          break;
            } 
            //
            // Rule 112:  pointcut ::= IDENT pointcutSuffix
            //
            case 112: {
                
		Identifier res = xpandFactory.createIdentifier(getLeftIToken());
		if (getRhsSym(2) != null) {
			res = res.append((Identifier) getRhsSym(2));
		}
		setResult(res);
	          break;
            } 
            //
            // Rule 113:  pointcutSuffix ::= $Empty
            //
            case 113: {
                
		setResult(null);
	          break;
            } 
            //
            // Rule 115:  pointcutSuffix ::= DCOLON pointcutSuffix
            //
            case 115: {
                
		Identifier res = xpandFactory.createIdentifier(getLeftIToken());
		if (getRhsSym(2) != null) {
			res = res.append((Identifier) getRhsSym(2));
		}
		setResult(res);
	          break;
            } 
            //
            // Rule 116:  define ::= DEFINE IDENT FOR type sequence ENDDEFINE
            //
            case 116: {
                
		setResult(xpandFactory.createDefinition(getLeftIToken(), getRightIToken(), getRhsIToken(2), Collections.EMPTY_LIST, (Identifier) getRhsSym(4), (List) getRhsSym(5)));
	          break;
            } 
            //
            // Rule 117:  define ::= DEFINE IDENT LPAREN declaredParameterList RPAREN FOR type sequence ENDDEFINE
            //
            case 117: {
                
		setResult(xpandFactory.createDefinition(getLeftIToken(), getRightIToken(), getRhsIToken(2), (List) getRhsSym(4), (Identifier) getRhsSym(7), (List) getRhsSym(8)));
	          break;
            } 
            //
            // Rule 118:  sequence ::= text sequenceSuffix
            //
            case 118: {
                
		List res = new LinkedList();
		res.addAll((List) getRhsSym(1));
		res.addAll((List) getRhsSym(2));
		setResult(res);
	          break;
            } 
            //
            // Rule 119:  sequenceSuffix ::= $Empty
            //
            case 119: {
                
		setResult(Collections.EMPTY_LIST);
	          break;
            } 
            //
            // Rule 120:  sequenceSuffix ::= statement text sequenceSuffix
            //
            case 120: {
                
		List res = new LinkedList();
		res.add(getRhsSym(1));
		res.addAll((List) getRhsSym(2));
		res.addAll((List) getRhsSym(3));
		setResult(res);
	          break;
            } 
            //
            // Rule 127:  text ::= minusOpt TEXT textSuffix
            //
            case 127: {
                
		List res = new LinkedList();
		res.add(xpandFactory.createTextStatement(getRhsIToken(2), (IToken) getRhsSym(1)));
		res.addAll((List) getRhsSym(3));
		setResult(res);
	          break;
            } 
            //
            // Rule 128:  textSuffix ::= $Empty
            //
            case 128: {
                
		setResult(Collections.EMPTY_LIST);
	          break;
            } 
            //
            // Rule 129:  textSuffix ::= minusOpt TEXT textSuffix
            //
            case 129: {
                
		List res = new LinkedList();
		res.add(xpandFactory.createTextStatement(getRhsIToken(2), (IToken) getRhsSym(1)));
		res.addAll((List) getRhsSym(3));
		setResult(res);
	          break;
            } 
            //
            // Rule 130:  minusOpt ::= $Empty
            //
            case 130: {
                
		setResult(null);
	          break;
            } 
            //
            // Rule 131:  minusOpt ::= MINUS
            //
            case 131: {
                
		setResult(getLeftIToken());
	          break;
            } 
            //
            // Rule 135:  errorStatement ::= ERROR expression
            //
            case 135: {
                
		setResult(xpandFactory.createErrorStatement(getLeftIToken(), (Expression) getRhsSym(2)));
	          break;
            } 
            //
            // Rule 136:  expandStatement ::= EXPAND definitionName parameterListOpt
            //
            case 136: {
                
		setResult(xpandFactory.createExpandStatement(getLeftIToken(), (Identifier) getRhsSym(2), (List) getRhsSym(3), null, false, null));
	          break;
            } 
            //
            // Rule 137:  expandStatement ::= EXPAND definitionName parameterListOpt FOR expression
            //
            case 137: {
                
		setResult(xpandFactory.createExpandStatement(getLeftIToken(), (Identifier) getRhsSym(2), (List) getRhsSym(3), (Expression) getRhsSym(5), false, null));
	          break;
            } 
            //
            // Rule 138:  expandStatement ::= EXPAND definitionName parameterListOpt FOREACH expression separatorOpt
            //
            case 138: {
                
		setResult(xpandFactory.createExpandStatement(getLeftIToken(), (Identifier) getRhsSym(2), (List) getRhsSym(3), (Expression) getRhsSym(5), true, (Expression) getRhsSym(6)));
	          break;
            } 
            //
            // Rule 139:  parameterListOpt ::= $Empty
            //
            case 139: {
                
		setResult(Collections.EMPTY_LIST);
	          break;
            } 
            //
            // Rule 140:  parameterListOpt ::= LPAREN parameterList RPAREN
            //
            case 140: {
                
		setResult(getRhsSym(2));
	          break;
            } 
            //
            // Rule 142:  expressionStmt ::= expression
            //
            case 142: {
                
		setResult(xpandFactory.createExpressionStatement((Expression) getRhsSym(1)));
	          break;
            } 
            //
            // Rule 143:  fileStatement ::= FILE expression identOpt sequence ENDFILE
            //
            case 143: {
                
		setResult(xpandFactory.createFileStatement(getLeftIToken(), getRightIToken(), (Expression) getRhsSym(2), (Identifier) getRhsSym(3), (List) getRhsSym(4)));
	          break;
            } 
            //
            // Rule 144:  identOpt ::= $Empty
            //
            case 144: {
                
		setResult(null);
	          break;
            } 
            //
            // Rule 145:  identOpt ::= IDENT
            //
            case 145: {
                
		setResult(xpandFactory.createIdentifier(getLeftIToken()));
	          break;
            } 
            //
            // Rule 146:  foreachStatement ::= FOREACH expression AS IDENT iteratorOpt separatorOpt sequence ENDFOREACH
            //
            case 146: {
                
		setResult(xpandFactory.createForEachStatement(getLeftIToken(), getRightIToken(), (Expression) getRhsSym(2), getRhsIToken(4), (Expression) getRhsSym(6), (IToken) getRhsSym(5), (List) getRhsSym(7)));
	          break;
            } 
            //
            // Rule 147:  iteratorOpt ::= $Empty
            //
            case 147: {
                
		setResult(null);
	          break;
            } 
            //
            // Rule 148:  iteratorOpt ::= ITERATOR IDENT
            //
            case 148: {
                
		setResult(getRightIToken());
	          break;
            } 
            //
            // Rule 149:  separatorOpt ::= $Empty
            //
            case 149: {
                
		setResult(null);
	          break;
            } 
            //
            // Rule 150:  separatorOpt ::= SEPARATOR expression
            //
            case 150: {
                
		setResult(getRhsSym(2));
	          break;
            } 
            //
            // Rule 151:  ifStatement ::= IF expression sequence elseifAny elseOpt ENDIF
            //
            case 151: {
                
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
	          break;
            } 
            //
            // Rule 152:  elseifAny ::= $Empty
            //
            case 152: {
                
		setResult(null);
	          break;
            } 
            //
            // Rule 153:  elseifAny ::= ELSEIF expression sequence elseifAny
            //
            case 153: {
                
		IfStatement elseIf = xpandFactory.createIfStatement(getLeftIToken(), (Expression) getRhsSym(2), (List) getRhsSym(3), null);
		IfStatement restElseIf = (IfStatement) getRhsSym(4);
		elseIf.setElseIf(restElseIf);
		setResult(elseIf);
	          break;
            } 
            //
            // Rule 154:  elseOpt ::= $Empty
            //
            case 154: {
                
		setResult(null);
	          break;
            } 
            //
            // Rule 155:  elseOpt ::= ELSE sequence
            //
            case 155: {
                
		setResult(xpandFactory.createIfStatement(getLeftIToken(), null, (List) getRhsSym(2), null));
	          break;
            } 
            //
            // Rule 156:  letStatement ::= LET expression AS IDENT sequence ENDLET
            //
            case 156: {
                
		setResult(xpandFactory.createLetStatement(getLeftIToken(), getRightIToken(), (Expression) getRhsSym(2), getRhsIToken(4), (List) getRhsSym(5)));
	          break;
            } 
            //
            // Rule 157:  protectStatement ::= PROTECT CSTART expression CEND expression ID expression disabledOpt sequence ENDPROTECT
            //
            case 157: {
                
		setResult(xpandFactory.createProtectStatement(getLeftIToken(), getRightIToken(), (Expression) getRhsSym(3), (Expression) getRhsSym(5), (Expression) getRhsSym(7), (IToken) getRhsSym(8), (List) getRhsSym(9)));
	          break;
            } 
            //
            // Rule 158:  disabledOpt ::= $Empty
            //
            case 158: {
                
		setResult(null);
	          break;
            } 
            //
            // Rule 159:  disabledOpt ::= DISABLE
            //
            case 159: {
                
		setResult(getLeftIToken());
	          break;
            }
    
            default:
                break;
        }
        return;
    }
}

