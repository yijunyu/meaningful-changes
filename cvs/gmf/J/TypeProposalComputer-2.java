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
package org.eclipse.gmf.internal.xpand.expression.codeassist;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.TypeNameUtil;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

public class TypeProposalComputer implements ProposalComputer {

    public List<ICompletionProposal> computeProposals(final String txt, final ExecutionContext ctx, final ProposalFactory factory) {
        final String prefix = findPrefix(txt);
        final EClassifier[] types = ctx.findTypesForPrefix(prefix);
        final List<ICompletionProposal> result = new ArrayList<ICompletionProposal>();
        for (final EClassifier type : types) {
            String insertString = TypeNameUtil.getQualifiedName(type);
            if (!insertString.startsWith(prefix) && insertString.indexOf(prefix) > 0) {
                insertString = insertString.substring(insertString.indexOf(prefix));
            }
            result.add(factory.createTypeProposal(insertString, type, prefix));
        }
        return result;
    }

    protected String findPrefix(final String txt) {
        final StringBuilder result = new StringBuilder();
        int i = txt.length() - 1;
        char c = txt.charAt(i);
        while ((i > 0) && (Character.isJavaIdentifierStart(c) || (c == ':'))) {
            result.append(c);
            c = txt.charAt(--i);
        }
        return result.reverse().toString();
    }

}
