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
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;

/**
 * @author Sven Efftinge
 */
public class TextStatement extends Statement {
    private final String value;

    private final boolean deleteLine;

    public TextStatement(final int start, final int end, final int line, final String text, final boolean nonl) {
        super(start, end, line);
        deleteLine = nonl;
        value = text;
    }

    public String getValue() {
        return value;
    }

    public boolean isDeleteLine() {
        return deleteLine;
    }

    public void analyze(final XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
        // Nothing to check here
    }

    @Override
    public void evaluateInternal(final XpandExecutionContext ctx) {
        ctx.getOutput().write(getValue());
    }

}
