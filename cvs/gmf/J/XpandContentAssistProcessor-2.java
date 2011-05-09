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

import org.eclipse.core.resources.IFile;
import org.eclipse.gmf.internal.xpand.ResourceManager;
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
import org.eclipse.gmf.internal.xpand.model.XpandDefinition;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.gmf.internal.xpand.model.XpandResource;
import org.eclipse.gmf.internal.xpand.util.ContextFactory;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.ui.IEditorPart;

/**
 * @author Sven Efftinge
 */
public class XpandContentAssistProcessor implements IContentAssistProcessor {

    private IEditorPart editor;

    // FIXME AbstractOawContentAssistProcessor did a nature check - MOVE it Editor

    public XpandContentAssistProcessor(final IEditorPart editor) {
        this.editor = editor;
    }

    protected IFile getFile() {
        return (IFile) editor.getEditorInput().getAdapter(IFile.class);
    }

    public ICompletionProposal[] computeCompletionProposals(final ITextViewer viewer, final int documentOffset) {
        try {
            final String txt = viewer.getDocument().get().substring(0, documentOffset);
            XpandDefinition[] defs = new XpandDefinition[0];

            final ResourceManager resourceManager = org.eclipse.gmf.internal.xpand.Activator.getResourceManager(getFile().getProject());

            final XpandResource tpl = resourceManager.loadXpandResource(getFile());
            if (tpl != null) {
                defs = tpl.getDefinitions();
            }
            XpandExecutionContext ctx = ContextFactory.createXpandContext(resourceManager);
            final XpandPartition p = FastAnalyzer.computePartition(txt);

            if (p == XpandPartition.COMMENT) {
				return new ICompletionProposal[0];
			}
            List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal>();
            final ProposalFactory f = new ProposalFactoryImpl(documentOffset);

            if (p == XpandPartition.TYPE_DECLARATION) {
                ctx = FastAnalyzer.computeExecutionContext(txt, ctx, defs);
                proposals = new TypeProposalComputer().computeProposals(txt, ctx, f);
            } else if (p == XpandPartition.EXPRESSION) {
                ctx = FastAnalyzer.computeExecutionContext(txt, ctx, defs);
                final String expression = txt.substring(txt.lastIndexOf(XpandTokens.LT_CHAR));
                proposals.addAll(new ExpressionProposalComputer().computeProposals(expression, ctx, f));
                proposals.addAll(new KeywordProposalComputer().computeProposals(txt, ctx, f));
            } else if (p == XpandPartition.EXPAND_STATEMENT) {
                ctx = FastAnalyzer.computeExecutionContext(txt, ctx, defs);
                proposals.addAll(new ExpandProposalComputer().computeProposals(txt, ctx, f));
                proposals.add(new org.eclipse.jface.text.contentassist.CompletionProposal(XpandTokens.LT + XpandTokens.RT, documentOffset, 0, 1));
            } else if (p == XpandPartition.DEFAULT) {
                ctx = FastAnalyzer.computeExecutionContext(txt, ctx, defs);
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
