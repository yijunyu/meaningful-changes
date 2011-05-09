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
package org.eclipse.gmf.internal.xpand.xtend.ast;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.ast.DeclaredParameter;
import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;

public class JavaExtensionStatement extends Extension {

    protected final Identifier javaType;

    protected final Identifier javaMethod;

    protected final List<Identifier> javaParamTypes;

    public JavaExtensionStatement(final int start, final int end, final int line, final Identifier name,
            final List<DeclaredParameter> formalParameters, final Identifier returnType, final Identifier defaultImplementation,
            final Identifier javaMethod, final List<Identifier> javaParamTypes, final boolean cached, final boolean isPrivate) {
        super(start, end, line, name, returnType, formalParameters, cached, isPrivate);
        javaType = defaultImplementation;
        this.javaMethod = javaMethod;
        this.javaParamTypes = javaParamTypes;
    }

    public Identifier getJavaType() {
        return javaType;
    }

    @Override
    public Object evaluateInternal(final Object[] parameters, final ExecutionContext ctx) {
        final HashSet<AnalysationIssue> issues = new HashSet<AnalysationIssue>();
        try {
            final Method method = getJavaMethod(ctx, issues);
            if (method == null) {
                final StringBuffer b = new StringBuffer();
                for (AnalysationIssue element : issues) {
                    b.append(element.toString()).append("\n");
                }
                throw new EvaluationException(javaMethodToString() + " not found, problems were: \n" + b, this);
            }
            return method.invoke(null, parameters);
        } catch (final InvocationTargetException ite) {
            throw new RuntimeException(ite.getCause());
        } catch (final EvaluationException e) {
        	throw e;
        } catch (final Exception e) {
            throw new EvaluationException(e, this);
        }
    }

    private String javaMethodToString() {
        final StringBuffer buff = new StringBuffer();
        for (final Iterator<Identifier> iter = javaParamTypes.iterator(); iter.hasNext();) {
            buff.append(iter.next());
            if (iter.hasNext()) {
                buff.append(",");
            }
        }

        return javaType + "." + javaMethod + "(" + buff + ")";
    }

    public Method getJavaMethod(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        try {
            Class clazz = null;
            clazz = ctx.loadClass(javaType.getValue());
            if (clazz == null) {
                issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, javaType.getValue(), javaType));
                return null;
            }
            final Class[] paramTypes = new Class[javaParamTypes.size()];
            for (int i = 0, x = javaParamTypes.size(); i < x; i++) {
                final Identifier javaParamType = javaParamTypes.get(i);

                String value = javaParamType.getValue();
                boolean isList = value.endsWith(".List");
				if (isList) {
                	value = value.substring(0, value.length() - 5);
                }
				paramTypes[i] = ctx.loadClass(value);
                if (paramTypes[i] == null) {
                    issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, value, javaParamType));
                    return null;
                }
                if (isList) {
                	// XXX unless I find out Class.forName alternative that is
                	// capable of resolving "String[]"
                	paramTypes[i] = Array.newInstance(paramTypes[i], 0).getClass();
                }
            }
            final Method m = clazz.getMethod(javaMethod.getValue(), paramTypes);
            if (!Modifier.isStatic(m.getModifiers())) {
                issues.add(new AnalysationIssue(AnalysationIssue.FEATURE_NOT_FOUND, javaMethod.getValue() + " must be static!", javaMethod));
            }

            if (!Modifier.isPublic(m.getModifiers())) {
                issues.add(new AnalysationIssue(AnalysationIssue.FEATURE_NOT_FOUND, javaMethod.getValue() + " must be public!", javaMethod));
            }
            return m;
        } catch (final NoSuchMethodException e) {
            issues.add(new AnalysationIssue(AnalysationIssue.FEATURE_NOT_FOUND, javaMethod.getValue(), javaMethod));
        }
        return null;
    }

    @Override
    public void analyzeInternal(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        if (returnType == null) {
            issues.add(new AnalysationIssue(AnalysationIssue.SYNTAX_ERROR, "A return type must be specified for java extensions!", this));
        }
        getJavaMethod(ctx, issues);
    }

    @Override
    protected EClassifier internalGetReturnType(final EClassifier[] parameters, final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        if (returnType == null) {
            issues.add(new AnalysationIssue(AnalysationIssue.SYNTAX_ERROR, "A return type must be specified for java extensions!", this));
            return null;
        } else {
            return ctx.getTypeForName(returnType.getValue());
        }
    }

}
