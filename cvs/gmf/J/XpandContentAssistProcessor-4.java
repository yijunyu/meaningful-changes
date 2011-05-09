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
package org.eclipse.gmf.internal.xpand.editor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.gmf.internal.xpand.codeassist.ExpandProposalComputer;
import org.eclipse.gmf.internal.xpand.codeassist.FastAnalyzer;
import org.eclipse.gmf.internal.xpand.codeassist.KeywordProposalComputer;
import org.eclipse.gmf.internal.xpand.codeassist.ProposalFactoryImpl;
import org.eclipse.gmf.internal.xpand.codeassist.StatementProposalComputer;
import org.eclipse.gmf.internal.xpand.codeassist.XpandPartition;
import org.eclipse.gmf.internal.xpand.codeassist.XpandTokens;
import org.eclipse.gmf.internal.xpand.expression.codeassist.ExpressionProposalComputer;
import org.eclipse.gmf.internal.xpand.expression.codeassist.ProposalFactory;
import org.eclipse.gmf.internal.xpand.expression.codeassist.TypeProposalComputer;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

/**
 * @author Sven Efftinge
 * @author artem
 */
public class XpandContentAssistProcessor implements IContentAssistProcessor {

    private final XpandEditor editor;

    // FIXME AbstractOawContentAssistProcessor did a nature check - MOVE it Editor

    public XpandContentAssistProcessor(final XpandEditor editor) {
        this.editor = editor;
    }

    public ICompletionProposal[] computeCompletionProposals(final ITextViewer viewer, final int documentOffset) {
        try {
            final String txt = viewer.getDocument().get(0, documentOffset);

            XpandExecutionContext ctx = editor.getContext(); 

            final XpandPartition p = FastAnalyzer.computePartition(txt);

            if (p == XpandPartition.COMMENT) {
				return new ICompletionProposal[0];
			}
            List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal>();
            final ProposalFactory f = new ProposalFactoryImpl(documentOffset);

            if (p == XpandPartition.TYPE_DECLARATION) {
                ctx = FastAnalyzer.computeExecutionContext(txt, ctx);
                proposals = new TypeProposalComputer().computeProposals(txt, ctx, f);
            } else if (p == XpandPartition.EXPRESSION) {
                ctx = FastAnalyzer.computeExecutionContext(txt, ctx);
                final String expression = txt.substring(txt.lastIndexOf(XpandTokens.LT_CHAR) + 1);
                proposals.addAll(new ExpressionProposalComputer().computeProposals(expression, ctx, f));
                proposals.addAll(new KeywordProposalComputer().computeProposals(txt, ctx, f));
            } else if (p == XpandPartition.EXPAND_STATEMENT) {
                ctx = FastAnalyzer.computeExecutionContext(txt, ctx);
                proposals.addAll(new ExpandProposalComputer().computeProposals(txt, ctx, f));
                proposals.add(new org.eclipse.jface.text.contentassist.CompletionProposal(XpandTokens.LT + XpandTokens.RT, documentOffset, 0, 1));
            } else if (p == XpandPartition.DEFAULT) {
                ctx = FastAnalyzer.computeExecutionContext(txt, ctx);
                proposals.addAll(new StatementProposalComputer().computeProposals(txt, ctx, f));
                proposals.add(new org.eclipse.jface.text.contentassist.CompletionProposal(XpandTokens.LT + XpandTokens.RT, documentOffset, 0, 1));
            }
            Collections.sort(proposals, new Comparator<ICompletionProposal>() {
                public int compare(final ICompletionProposal p1, final ICompletionProposal p2) {
                	// [artem] originally there was compareTo, but e.g. ExpressionProposalComputer
                	// ignores case when deciding what to take, so why should we
                	// XXX better would be put most matching proposal first!!!
                    return p1.getDisplayString().compareToIgnoreCase(p2.getDisplayString());
                }
            });
            return proposals.toArray(new ICompletionProposal[proposals.size()]);
        } catch (final Exception e) {
            Activator.logError(e);
        }
        return null;
    }

    public IContextInformation[] computeContextInformation(final ITextViewer viewer, final int documentOffset) {
        return null;
    }

    public char[] getCompletionProposalAutoActivationCharacters() {
        return null;
    }

    public char[] getContextInformationAutoActivationCharacters() {
        return null;
    }

    public String getErrorMessage() {
        return null;
    }

    public IContextInformationValidator getContextInformationValidator() {
    	// TODO Auto-generated method stub
    	return null;
    }
}
