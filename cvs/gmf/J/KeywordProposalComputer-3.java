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
package org.eclipse.gmf.internal.xpand.codeassist;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.codeassist.ProposalComputer;
import org.eclipse.gmf.internal.xpand.expression.codeassist.ProposalFactory;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

public class KeywordProposalComputer implements ProposalComputer {

    public List<ICompletionProposal> computeProposals(final String txt, final ExecutionContext ctx, final ProposalFactory factory) {
        final String prefix = getPrefix(txt);
        final List<ICompletionProposal> result = new ArrayList<ICompletionProposal>();
        if (prefix.length() > 0 || txt.endsWith(XpandTokens.LT)) {
	        final String[] kw = XpandTokens.allKeywords();
	        for (final String string : kw) {
	            if (string.toLowerCase().startsWith(prefix.toLowerCase())) {
	                result.add(factory.createKeywordProposal(string + " ", string, prefix));
	            }
	        }
        }
        return result;
    }

    private final static Pattern PREFIX = Pattern.compile("([A-Z]+)\\z");

    private String getPrefix(final String txt) {
        final Matcher m = PREFIX.matcher(txt);
        if (m.find()) {
			return m.group(1);
		}
        return "";
    }

}
