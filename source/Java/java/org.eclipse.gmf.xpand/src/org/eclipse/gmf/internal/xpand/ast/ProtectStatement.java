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

import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ast.Expression;
import org.eclipse.gmf.internal.xpand.model.ProtectedRegion;
import org.eclipse.gmf.internal.xpand.model.ProtectedRegionSyntaxException;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;

/**
 * @author Sven Efftinge
 */
public class ProtectStatement extends Statement {

    private final Expression commentStart;

    private final Expression commentEnd;

    private final Statement[] body;

    private final Expression id;

    private final boolean disable;

    public ProtectStatement(final int start, final int end, final int line, final Expression commentStart,
            final Expression commentEnd, final Statement[] body, final Expression id, final boolean disable) {
        super(start, end, line);
        this.commentStart = commentStart;
        this.commentEnd = commentEnd;
        this.body = body;
        this.id = id;
        this.disable = disable;
    }

    public Statement[] getBody() {
        return body;
    }

    public Expression getCommentEnd() {
        return commentEnd;
    }

    public Expression getCommentStart() {
        return commentStart;
    }

    public Expression getId() {
        return id;
    }

    public void analyze(final XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
        getCommentStart().analyze(ctx, issues);
        getCommentEnd().analyze(ctx, issues);
        getId().analyze(ctx, issues);

        for (int i = 0; i < getBody().length; i++) {
            getBody()[i].analyze(ctx, issues);
        }
    }

    @Override
    public void evaluateInternal(final XpandExecutionContext ctx) {
        final String cStart = nullSave(getCommentStart().evaluate(ctx));
        if (cStart == null) {
			throw new EvaluationException("NullEvaluation!", getCommentStart());
		}
        final String cEnd = nullSave(getCommentEnd().evaluate(ctx));
        if (cEnd == null) {
			throw new EvaluationException("NullEvaluation!", getCommentEnd());
		}
        final String id = nullSave(getId().evaluate(ctx));
        if (id == null) {
			throw new EvaluationException("NullEvaluation!", getId());
		}

        ProtectedRegion region = null;
        if (ctx.getProtectedRegionResolver() != null) {
            region = ctx.getProtectedRegionResolver().getProtectedRegion(id.toString());
        } else {
            throw new RuntimeException("No protected region resolver configured!");
        }

        if (region == null) {
            region = ctx.getProtectedRegionResolver().createProtectedRegion(id, disable);
            ctx.getOutput().write(region.getStartString(cStart, cEnd));
            for (int i = 0; i < getBody().length; i++) {
                getBody()[i].evaluate(ctx);
            }
            ctx.getOutput().write(region.getEndString(cStart, cEnd));
        } else {
            ctx.getOutput().write(region.getStartString(cStart, cEnd));
            try {
                ctx.getOutput().write(region.getBody(cStart, cEnd));
            } catch (final ProtectedRegionSyntaxException e) {
                throw new EvaluationException(e.getMessage(), getId());
            }
            ctx.getOutput().write(region.getEndString(cStart, cEnd));
        }

    }

    private String nullSave(final Object string) {
        return string != null ? string.toString() : "";
    }

}
