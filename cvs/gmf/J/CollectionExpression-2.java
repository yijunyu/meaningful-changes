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
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.SyntaxConstants;
import org.eclipse.gmf.internal.xpand.expression.Variable;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class CollectionExpression extends FeatureCall {

	private Expression closure;

	private String eleName;

	public CollectionExpression(final int end, final Identifier opNAme, final String eleName, final Expression closure, final Expression target) {
		super(opNAme.getStart(), end, opNAme.getLine(), opNAme, target);
		this.eleName = eleName;
		this.closure = closure;
	}

	@Override
	public String toString() {
		return super.toString() + "(" + (eleName != null ? eleName + "|" : "") + closure + ")";
	}

	@Override
	public Object evaluateInternal(final ExecutionContext ctx) {
		Object targetObj = null;
		if (getTarget() == null) {
			final Variable v = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
			if (v != null) {
				targetObj = v.getValue();
			}
		} else {
			targetObj = getTarget().evaluate(ctx);
		}
		if (targetObj == null) {
			return null;
		}
		if (!(targetObj instanceof Collection)) {
			throw new EvaluationException("Couldn't call '" + this.toString() + "' on an object of java type " + targetObj.getClass().getName(), this);
		}

		if (getName().getValue().equals(SyntaxConstants.COLLECT)) {
			return executeCollect((Collection) targetObj, ctx);
		} else if (getName().getValue().equals(SyntaxConstants.SELECT)) {
			return executeSelect((Collection) targetObj, ctx);
		} else if (getName().getValue().equals(SyntaxConstants.REJECT)) {
			return executeReject((Collection) targetObj, ctx);
		} else if (getName().getValue().equals(SyntaxConstants.EXISTS)) {
			return executeExists((Collection) targetObj, ctx);
		} else if (getName().getValue().equals(SyntaxConstants.NOT_EXISTS)) {
			return executeNotExists((Collection) targetObj, ctx);
		} else if (getName().getValue().equals(SyntaxConstants.FOR_ALL)) {
			return executeForAll((Collection) targetObj, ctx);
		} else {
			throw new EvaluationException("Unkown collection operation : " + getName().getValue(), this);
		}

	}

	private Object executeForAll(final Collection collection, ExecutionContext ctx) {
		for (final Iterator iter = collection.iterator(); iter.hasNext();) {
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), iter.next()));
			final Object result = closure.evaluate(ctx);
			if (!(result instanceof Boolean) || !((Boolean) result).booleanValue()) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	private Object executeExists(final Collection collection, ExecutionContext ctx) {
		for (final Iterator iter = collection.iterator(); iter.hasNext();) {
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), iter.next()));
			final Object result = closure.evaluate(ctx);
			if ((result instanceof Boolean) && ((Boolean) result).booleanValue()) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

	private Object executeNotExists(final Collection collection, ExecutionContext ctx) {
		for (final Iterator iter = collection.iterator(); iter.hasNext();) {
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), iter.next()));
			final Object result = closure.evaluate(ctx);
			if ((result instanceof Boolean) && ((Boolean) result).booleanValue()) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	private Object executeReject(final Collection<?> collection, ExecutionContext ctx) {
		final Collection resultCol = new ArrayList<Object>(collection);
		for (Object ele : collection) {
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), ele));
			final Object result = closure.evaluate(ctx);
			if ((result instanceof Boolean) && ((Boolean) result).booleanValue()) {
				resultCol.remove(ele);
			}
		}
		return resultCol;
	}

	private Object executeSelect(final Collection collection, ExecutionContext ctx) {
		final Collection<Object> resultCol = new ArrayList<Object>();
		for (final Iterator iter = collection.iterator(); iter.hasNext();) {
			final Object ele = iter.next();
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), ele));
			final Object result = closure.evaluate(ctx);
			if ((result instanceof Boolean) && ((Boolean) result).booleanValue()) {
				resultCol.add(ele);
			}
		}
		return resultCol;
	}

	private Object executeCollect(final Collection collection, ExecutionContext ctx) {
		final Collection<Object> resultCol = new ArrayList<Object>();
		for (final Iterator iter = collection.iterator(); iter.hasNext();) {
			final Object ele = iter.next();
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), ele));
			resultCol.add(closure.evaluate(ctx));
		}
		return resultCol;
	}

	@Override
	public EClassifier analyze(ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		EClassifier targetType = null;
		if (getTarget() == null) {
			final Variable v = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
			if (v != null) {
				targetType = (EClassifier) v.getValue();
			}
		} else {
			targetType = getTarget().analyze(ctx, issues);
		}
		if (targetType == null) {
			return null;
		}

		if (!(BuiltinMetaModel.isParameterizedType(targetType))) {
			issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, "Collection type expected! was : " + targetType, getTarget()));
			return null;
		}

		final EClassifier innerEClassifier = BuiltinMetaModel.getInnerType(targetType);
		EClassifier result = null;
		ctx = ctx.cloneWithVariable(new Variable(getElementName(), innerEClassifier));
		final EClassifier closureEClassifier = closure.analyze(ctx, issues);
		if (getName().getValue().equals(SyntaxConstants.COLLECT)) {
			if (targetType.getName().startsWith(BuiltinMetaModel.SET)) {
				return BuiltinMetaModel.getSetType(closureEClassifier);
			} else if (targetType.getName().startsWith(BuiltinMetaModel.LIST)) {
				return BuiltinMetaModel.getListType(closureEClassifier);
			} else {
				return BuiltinMetaModel.getCollectionType(closureEClassifier);
			}
		} else if (getName().getValue().equals(SyntaxConstants.SELECT) || getName().getValue().equals(SyntaxConstants.REJECT)) {
			return targetType;
		} else if (getName().getValue().equals(SyntaxConstants.TYPE_SELECT)) {
			if (closureEClassifier == null) {
				return null;
			}
			return BuiltinMetaModel.getListType(closureEClassifier);
		} else if (getName().getValue().equals(SyntaxConstants.EXISTS) || getName().getValue().equals(SyntaxConstants.NOT_EXISTS) || getName().getValue().equals(SyntaxConstants.FOR_ALL)) {
			if (!BuiltinMetaModel.isAssignableFrom(EcorePackage.eINSTANCE.getEBoolean(), closureEClassifier)) {
				issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, "Boolean type expected! was : " + closureEClassifier, closure));
			}
			result = EcorePackage.eINSTANCE.getEBoolean();
		} else {
			issues.add(new AnalysationIssue(AnalysationIssue.INTERNAL_ERROR, "Unknown operation : " + getName().getValue(), this));
		}
		return result;
	}

	private String getElementName() {
		return eleName != null ? eleName : SyntaxConstants.DEFAULT_ELE_NAME;
	}

}
