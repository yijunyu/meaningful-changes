/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.expression.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class ListLiteral extends Expression {

    private Expression[] elements;

    public ListLiteral(final int start, final int end, final int line, final Expression[] contents) {
        super(start, end, line);
        elements = contents;
    }

    public Expression[] getElements() {
        return elements;
    }

    @Override
    public Object evaluateInternal(final ExecutionContext ctx) {
        final List<Object> col = new ArrayList<Object>();
        final Expression[] params = getElements();
        for (final Expression element : params) {
            col.add(element.evaluate(ctx));
        }
        return col;
    }

    public EClassifier analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
    	EClassifier commonDenominator = null;
        for (final Expression element : elements) {
            final EClassifier exprType = element.analyze(ctx, issues);
            if (exprType == null) {
				return null;
			}
            if (commonDenominator == null) {
                commonDenominator = exprType;
            } else {
            	 if (BuiltinMetaModel.isAssignableFrom(exprType, commonDenominator)) {
            		 commonDenominator = exprType;
            	 } else {
            		 if (!BuiltinMetaModel.isAssignableFrom(commonDenominator, exprType)) {
            			 // XXX here one could try to find common superclass
            			 // but currently a fail-fast approach seems reasonable
            			 commonDenominator = EcorePackage.eINSTANCE.getEJavaObject();
            		 }// else just go on with current commonDenominator
            	 }
            }
        }
        return BuiltinMetaModel.getListType(commonDenominator);
    }

    @Override
    public String toString() {
        return "{" + expressionsToString() + "}";
    }

    private String expressionsToString() {
        String r = "";
        for (int i = 0; i < elements.length; i++) {
            r += elements[i].toString();
            if (i + 1 < elements.length) {
                r += ",";
            }

        }
        return r;
    }
}
