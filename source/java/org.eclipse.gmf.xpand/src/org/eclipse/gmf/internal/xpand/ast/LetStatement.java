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
package org.eclipse.gmf.internal.xpand.ast;

import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.expression.ast.Expression;
import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;

/**
 * @author Sven Efftinge
 */
public class LetStatement extends Statement {

	private final Identifier varName;

	private final Expression varValue;

	private final Statement[] body;

	public LetStatement(final int start, final int end, final int line, final Identifier varName, final Expression value, final Statement[] body) {
		super(start, end, line);
		this.varName = varName;
		this.varValue = value;
		this.body = body;
	}

	public Statement[] getBody() {
		return body;
	}

	public Identifier getVarName() {
		return varName;
	}

	public Expression getVarValue() {
		return varValue;
	}

	public void analyze(XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
		EClassifier t = getVarValue().analyze(ctx, issues);
		if (t == null) {
			t = EcorePackage.eINSTANCE.getEObject();
		}
		ctx = ctx.cloneWithVariable(new Variable(getVarName().getValue(), t));
		for (Statement statement : getBody()) {
			statement.analyze(ctx, issues);
		}
	}

	@Override
	public void evaluateInternal(XpandExecutionContext ctx) {
		ctx = ctx.cloneWithVariable(new Variable(getVarName().getValue(), getVarValue().evaluate(ctx)));
		for (Statement statement : getBody()) {
			statement.evaluate(ctx);
		}
	}

}
