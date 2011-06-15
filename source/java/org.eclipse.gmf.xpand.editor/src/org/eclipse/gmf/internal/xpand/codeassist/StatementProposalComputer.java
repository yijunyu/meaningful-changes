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
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.codeassist.ProposalComputer;
import org.eclipse.gmf.internal.xpand.expression.codeassist.ProposalFactory;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

public class StatementProposalComputer implements ProposalComputer {

    public List<ICompletionProposal> computeProposals(final String txt, final ExecutionContext ctx, final ProposalFactory factory) {
        final List<ICompletionProposal> result = new ArrayList<ICompletionProposal>();
        final String prefix = "";
        final String ws = findTrailingWhitespace(txt);

        final Stack<StackElement> s = FastAnalyzer.computeStack(txt);
        if (s.size() > 0) {
            final StackElement se = s.peek();
            result.add(factory.createStatementProposal(XpandTokens.LT + "END" + se.block + XpandTokens.RT, "END"
                    + se.block, prefix));
            if (contains(XpandTokens.IF, s)) {
                result.add(factory.createStatementProposal(XpandTokens.LT + "ELSE" + XpandTokens.RT, "ELSE", prefix));
                result.add(factory.createStatementProposal(XpandTokens.LT + "ELSEIF statement" + XpandTokens.RT,
                        "ELSEIF", prefix));
            }
            if (!contains(XpandTokens.FILE, s)) {
                result.add(fileBlockProposal(ws, factory));
            }
            if (!contains(XpandTokens.PROTECT, s)) {
                result.add(protectBlockProposal(ws, factory));
            }
            result.add(foreachBlockProposal(ws, factory));
            result.add(ifBlockProposal(ws, factory));
            result.add(letBlockProposal(ws, factory));
            result.add(expandStatementProposal(ws, factory));
        } else {
            if (txt.indexOf(XpandTokens.LT + XpandTokens.DEFINE) == -1) {
                if (txt.indexOf(XpandTokens.LT + XpandTokens.EXTENSION) == -1) {
                    result.add(importStatementProposal(factory));
                }
                result.add(extensionStatementProposal(factory));
            }
            result.add(defineBlockProposal(ws, factory));
            result.add(aroundBlockProposal(ws, factory));
        }
        return result;
    }

    private ICompletionProposal importStatementProposal(final ProposalFactory factory) {
        final String insertString = XpandTokens.LT + XpandTokens.IMPORT + " my::imported::namespace" + XpandTokens.RT;
        return factory.createStatementProposal(insertString, "IMPORT statement", "", insertString
                .indexOf("my::imported::namespace"), "my::imported::namespace".length());
    }

    private ICompletionProposal extensionStatementProposal(final ProposalFactory factory) {
        final String insertString = XpandTokens.LT + XpandTokens.EXTENSION + " path::to::Extension" + XpandTokens.RT;
        return factory.createStatementProposal(insertString, "EXTENSION statement", "", insertString
                .indexOf("path::to::Extension"), "path::to::Extension".length());
    }

    private final static Pattern WS_PATTERN = Pattern.compile("(\\n?[\\t ]*)\\z");

    private String findTrailingWhitespace(final String txt) {
        final Matcher m = WS_PATTERN.matcher(txt);
        m.find();
        return m.group(1);
    }

    private ICompletionProposal expandStatementProposal(final String ws, final ProposalFactory factory) {
        final String insertString = XpandTokens.LT + "EXPAND definition FOR this" + XpandTokens.RT;
        return factory.createStatementProposal(insertString, "EXPAND statement", "",
                insertString.indexOf("definition"), "definition".length());
    }

    private ICompletionProposal letBlockProposal(final String ws, final ProposalFactory factory) {
        final String insertString = XpandTokens.LT + "LET expression AS e" + XpandTokens.RT + ws + XpandTokens.LT
                + "ENDLET" + XpandTokens.RT;
        return factory.createStatementProposal(insertString, "LET block", "", insertString.indexOf("expression"),
                "expression".length());
    }

    private ICompletionProposal ifBlockProposal(final String ws, final ProposalFactory factory) {
        final String insertString = XpandTokens.LT + "IF condition" + XpandTokens.RT + ws + XpandTokens.LT + "ENDIF"
                + XpandTokens.RT;
        return factory.createStatementProposal(insertString, "IF block", "", insertString.indexOf("condition"),
                "condition".length());
    }

    private ICompletionProposal foreachBlockProposal(final String ws, final ProposalFactory factory) {
        final String insertString = XpandTokens.LT + "FOREACH elements AS e" + XpandTokens.RT + ws + XpandTokens.LT
                + "ENDFOREACH" + XpandTokens.RT;
        return factory.createStatementProposal(insertString, "FOREACH block", "", insertString.indexOf("elements"),
                "elements".length());
    }

    private ICompletionProposal protectBlockProposal(final String ws, final ProposalFactory factory) {
        final String insertString = XpandTokens.LT + "PROTECT CSTART '/*' CEND '*/' ID uniqueId ENABLED"
                + XpandTokens.RT + ws + XpandTokens.LT + "ENDPROTECT" + XpandTokens.RT;
        return factory.createStatementProposal(insertString, "PROTECT region", "", insertString.indexOf("uniqueId"),
                "uniqueId".length());
    }

    private ICompletionProposal fileBlockProposal(final String ws, final ProposalFactory factory) {
        final String insertString = XpandTokens.LT + "FILE fileName" + XpandTokens.RT + ws + XpandTokens.LT + "ENDFILE"
                + XpandTokens.RT;
        return factory.createStatementProposal(insertString, "FILE block", "", insertString.indexOf("fileName"),
                "fileName".length());
    }

    private ICompletionProposal defineBlockProposal(final String ws, final ProposalFactory factory) {
        final String insertString = XpandTokens.LT + "DEFINE definionName FOR Type" + XpandTokens.RT + ws
                + XpandTokens.LT + "ENDDEFINE" + XpandTokens.RT;
        return factory.createStatementProposal(insertString, "new DEFINE", "", insertString.indexOf("definionName"),
                "definionName".length());
    }

    private ICompletionProposal aroundBlockProposal(final String ws, final ProposalFactory factory) {
        final String insertString = XpandTokens.LT + "AROUND fullyQualifiedDefinionName FOR Type" + XpandTokens.RT + ws
                + XpandTokens.LT + "ENDAROUND" + XpandTokens.RT;
        return factory.createStatementProposal(insertString, "new AROUND", "", insertString
                .indexOf("fullyQualifiedDefinionName"), "fullyQualifiedDefinionName".length());
    }

    private boolean contains(final String blockName, final Stack<StackElement> s) {
        for (StackElement element : s) {
            if (element.block.equals(blockName)) {
				return true;
			}
        }
        return false;
    }

    protected String findPrefix(final String txt) {
        final StringBuffer result = new StringBuffer();
        int i = txt.length() - 1;
        char c = txt.charAt(i);
        while ((i > 0) && Character.isJavaIdentifierStart(c)) {
            result.append(c);
            c = txt.charAt(--i);
        }
        return result.reverse().toString();
    }
}
