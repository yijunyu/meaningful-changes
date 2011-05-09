/*******************************************************************************
* Copyright (c) 2006 Eclipse.org
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.eclipse.gmf.internal.xpand.expression.parser;

import lpg.lpgjavaruntime.*;

import org.eclipse.gmf.internal.xpand.expression.ast.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExpressionParser extends PrsStream implements RuleAction
{
    private static ParseTable prs = new ExpressionParserprs();
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

    public int getRhsErrorTokenIndex(int i)
    {
        int index = dtParser.getToken(i);
        IToken err = super.getIToken(index);
        return (err instanceof ErrorToken ? index : 0);
    }
    public ErrorToken getRhsErrorIToken(int i)
    {
        int index = dtParser.getToken(i);
        IToken err = super.getIToken(index);
        return (ErrorToken) (err instanceof ErrorToken ? err : null);
    }

    public ExpressionParser(LexStream lexStream)
    {
        super(lexStream);
        factory = new ExpressionFactory(lexStream.getFileName());

        try
        {
            super.remapTerminalSymbols(orderedTerminalSymbols(), ExpressionParserprs.EOFT_SYMBOL);
        }
        catch(NullExportedSymbolsException e) {
        }
        catch(NullTerminalSymbolsException e) {
        }
        catch(UnimplementedTerminalsException e)
        {
            java.util.ArrayList unimplemented_symbols = e.getSymbols();
            System.out.println("The Lexer will not scan the following token(s):");
            for (int i = 0; i < unimplemented_symbols.size(); i++)
            {
                Integer id = (Integer) unimplemented_symbols.get(i);
                System.out.println("    " + ExpressionParsersym.orderedTerminalSymbols[id.intValue()]);               
            }
            System.out.println();                        
        }
        catch(UndefinedEofSymbolException e)
        {
            throw new Error(new UndefinedEofSymbolException
                                ("The Lexer does not implement the Eof symbol " +
                                 ExpressionParsersym.orderedTerminalSymbols[ExpressionParserprs.EOFT_SYMBOL]));
        } 
    }

    public String[] orderedTerminalSymbols() { return ExpressionParsersym.orderedTerminalSymbols; }
    public String getTokenKindName(int kind) { return ExpressionParsersym.orderedTerminalSymbols[kind]; }            
    public int getEOFTokenKind() { return ExpressionParserprs.EOFT_SYMBOL; }
    public PrsStream getParseStream() { return (PrsStream) this; }

    public Expression parser()
    {
        return parser(null, 0);
    }
        
    public Expression parser(Monitor monitor)
    {
        return parser(monitor, 0);
    }
        
    public Expression parser(int error_repair_count)
    {
        return parser(null, error_repair_count);
    }
        
    public Expression parser(Monitor monitor, int error_repair_count)
    {
        try
        {
            dtParser = new DeterministicParser(monitor, (TokenStream)this, prs, (RuleAction)this);
        }
        catch (NotDeterministicParseTableException e)
        {
            throw new Error(new NotDeterministicParseTableException
                                ("Regenerate ExpressionParserprs.java with -NOBACKTRACK option"));
        }
        catch (BadParseSymFileException e)
        {
            throw new Error(new BadParseSymFileException("Bad Parser Symbol File -- ExpressionParsersym.java. Regenerate ExpressionParserprs.java"));
        }

        try
        {
            return (Expression) dtParser.parse();
        }
        catch (BadParseException e)
        {
            reset(e.error_token); // point to error token

            DiagnoseParser diagnoseParser = new DiagnoseParser(this, prs);
            diagnoseParser.diagnose(e.error_token);
        }

        return null;
    }


	private final ExpressionFactory factory;

    public void ruleAction(int ruleNumber)
    {
        switch (ruleNumber)
        {
 
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
            // Rule 29:  additiveExpression ::= multiplicativeExpression additiveOperator additiveExpression
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
    
            default:
                break;
        }
        return;
    }
}

