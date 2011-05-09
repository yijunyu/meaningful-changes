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
public class Cast extends Expression {

    private Identifier type;

    private Expression target;

    public Cast(final int start, final int end, final int line, final Identifier type, final Expression target) {
        super(start, end, line);
        this.type = type;
        this.target = target;
    }

    public Expression getTarget() {
        return target;
    }

    public Identifier getType() {
        return type;
    }

    @Override
    public Object evaluateInternal(final ExecutionContext ctx) {
        return getTarget().evaluate(ctx);
    }

    public EClassifier analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        final EClassifier t = getTarget().analyze(ctx, issues);

        final EClassifier toCast = findType(getType(), ctx, issues);
        if (toCast == null) {
            issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, getType().getValue(), getType()));
            return null;
        }
        if (t == null) {
			return null;
		}
        if (BuiltinMetaModel.isParameterizedType(t) && BuiltinMetaModel.isParameterizedType(toCast)) {
        	// XXX looks like all we do here is converting from List or Set to Collection :)
            if (BuiltinMetaModel.isAssignableFrom(t, toCast)) {
            	// narrowing conversion (toCast is more specific, t is more general), like (String) anObject
                final EClassifier innerEClassifier = getCastedType(BuiltinMetaModel.getInnerType(t), BuiltinMetaModel.getInnerType(toCast));
                if (innerEClassifier == null) {
                    issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, "cannot cast from "
                            + t.toString() + " to " + toCast.toString(), this));
                    return null;
                }
                return BuiltinMetaModel.cloneParametrizedType(toCast, innerEClassifier);
            } else if (BuiltinMetaModel.isAssignableFrom(toCast, t)) {
            	// widening conversion, toCast is more general, like (Object) aString
                final EClassifier innerEClassifier = getCastedType(BuiltinMetaModel.getInnerType(t), BuiltinMetaModel.getInnerType(toCast));
                if (innerEClassifier == null) {
                    issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, "cannot cast from "
                            + t.toString() + " to " + toCast.toString(), this));
                    return null;
                }
                return BuiltinMetaModel.cloneParametrizedType(t, innerEClassifier);
            } else {
                issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, "cannot cast from " + t.toString()
                        + " to " + toCast.toString(), this));
                return null;
            }
        } else {
            final EClassifier rt = getCastedType(t, toCast);
            if (rt == null) {
                issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, "cannot cast from " + t.toString()
                        + " to " + toCast.toString(), this));
            }
            return rt;
        }
    }

    private EClassifier getCastedType(EClassifier typeA, EClassifier typeB) {
    	final EClassifier objEClassifier = EcorePackage.eINSTANCE.getEJavaObject();
        if (typeA == null || typeA == BuiltinMetaModel.VOID) {
			typeA = objEClassifier;
		}

        if (typeB == null || typeA == BuiltinMetaModel.VOID) {
			typeB = objEClassifier;
		}

        if (BuiltinMetaModel.isAssignableFrom(typeA, typeB)) {
            return typeB;
        } else if (BuiltinMetaModel.isAssignableFrom(typeB, typeA)) {
            return typeA;
        }
        return null;
    }

    @Override
    public String toString() {
        return "(" + type.getValue() + ")" + target.toString();
    }
}
