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

import org.eclipse.gmf.internal.xpand.editor.scan.CommentScanner;
import org.eclipse.gmf.internal.xpand.editor.scan.ContentScanner;
import org.eclipse.gmf.internal.xpand.editor.scan.TemplateTagScanner;
import org.eclipse.gmf.internal.xpand.editor.scan.XpandPartitionScanner;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

/**
 * Example configuration for an <code>SourceViewer</code> which shows Template
 * code.
 */
public class XpandSourceViewerConfiguration extends SourceViewerConfiguration {
    private final XpandEditor editor;

    private ContentScanner contentScanner;

    private CommentScanner commentScanner;

    private TemplateTagScanner tagScanner;

    /**
     * Default constructor.
     */
    public XpandSourceViewerConfiguration(XpandEditor editor) {
        this.editor = editor;
    }

    /**
     * Returns all configured content types for the given source viewer.
     * 
     * @param sourceViewer
     *            the source viewer to be configured by this configuration
     * @return all configured content types
     */
    @Override
    public String[] getConfiguredContentTypes(final ISourceViewer aSourceViewer) {
        return new String[] { IDocument.DEFAULT_CONTENT_TYPE, XpandPartitionScanner.TAG, XpandPartitionScanner.COMMENT };
    }

    /**
     * Returns the content assistant ready to be used with the given source
     * viewer.
     * 
     * @param sourceViewer
     *            the source viewer to be configured by this configuration
     * @return a content assistant or null if content assist should not be
     *         supported
     */
    @Override
    public IContentAssistant getContentAssistant(final ISourceViewer aSourceViewer) {
        ContentAssistant contentAssistant;
        contentAssistant = new ContentAssistant();
        final IContentAssistProcessor processor = new XpandContentAssistProcessor(editor);
        contentAssistant.setContentAssistProcessor(processor, IDocument.DEFAULT_CONTENT_TYPE);
        contentAssistant.setContentAssistProcessor(processor, XpandPartitionScanner.TAG);
        contentAssistant.setContentAssistProcessor(processor, XpandPartitionScanner.COMMENT);
        contentAssistant.enableAutoActivation(true);
        contentAssistant.setAutoActivationDelay(500);
        contentAssistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
        contentAssistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
        return contentAssistant;
    }

    /**
     * Returns the prefixes to be used by the line-shift operation. This
     * implementation always returns new String[] { "\t", " " }.
     * 
     * @param sourceViewer
     *            the source viewer to be configured by this configuration
     * @param contentType
     *            the content type for which the strategy is applicable
     * @return the prefixes or null if the prefix operation should not be
     *         supported
     */
    @Override
    public String[] getIndentPrefixes(final ISourceViewer aSourceViewer, final String aContentType) {
        return new String[] { "\t", "    " }; // see also 'getTabWidth' ...
    }

    /**
     * Returns the presentation reconciler ready to be used with the given
     * source viewer.
     * 
     * @param sourceViewer
     *            the source viewer to be configured by this configuration
     * @return the presentation reconciler or null if presentation reconciling
     *         should not be supported
     */
    @Override
    public IPresentationReconciler getPresentationReconciler(final ISourceViewer aSourceViewer) {
        final PresentationReconciler reconciler = new PresentationReconciler();
        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getTemplateTagScanner());
        reconciler.setDamager(dr, XpandPartitionScanner.TAG);
        reconciler.setRepairer(dr, XpandPartitionScanner.TAG);

        dr = new DefaultDamagerRepairer(getCommentScanner());
        reconciler.setDamager(dr, XpandPartitionScanner.COMMENT);
        reconciler.setRepairer(dr, XpandPartitionScanner.COMMENT);

        dr = new DefaultDamagerRepairer(getContentScanner());
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
        return reconciler;
    }

    /**
     * @return
     */
    private CommentScanner getCommentScanner() {
        if (commentScanner == null) {
            commentScanner = new CommentScanner(editor.getColorProvider());
        }
        return commentScanner;
    }

    /**
     * @return
     */
    protected ITokenScanner getTemplateTagScanner() {
        if (tagScanner == null) {
            tagScanner = new TemplateTagScanner(editor.getColorProvider());
        }
        return tagScanner;
    }

    /**
     * @return
     */
    protected ITokenScanner getContentScanner() {
        if (contentScanner == null) {
            contentScanner = new ContentScanner(editor.getColorProvider());
        }
        return contentScanner;
    }

    @Override
    public IAnnotationHover getAnnotationHover(final ISourceViewer sourceViewer) {
        return new OawProblemHover(sourceViewer);
    }

    @Override
    public ITextHover getTextHover(final ISourceViewer sourceViewer, final String contentType) {
        return new OawProblemHover(sourceViewer);
    }
}