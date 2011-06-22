package org.eclipse.gmf.internal.xpand.eval;

import org.eclipse.gmf.internal.xpand.ast.Statement;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.ast.Expression;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.gmf.internal.xpand.xtend.ast.Extension;

public class EvaluationListener {

	public void enter(Expression expresssion, ExecutionContext context) {
	}
	public void leave(Expression expression, ExecutionContext context) {
	}
	public void enter(Extension ext, ExecutionContext context) {
	}
	public void leave(Extension ext, ExecutionContext context) {
	}
	public void enter(Statement stmt, XpandExecutionContext context) {
	}
	public void leave(Statement stmt, XpandExecutionContext context) {
	}
}
