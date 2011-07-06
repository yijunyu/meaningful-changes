/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.editor.scan;

import org.eclipse.gmf.internal.xpand.editor.ColorProvider;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;

/**
 * The only purpose of this class is to have all token definitions in a single
 * place, to be able to see them all at once. 
 * NOTE: Should be invoked in UI thread, as {@link #setTokens(ColorProvider))} 
 * may ask for current display
 * 
 * @author artem
 */
/*package*/ class XpandTokenFactory {

	private XpandTokenFactory() {
	}

	public static Token newTerminalsToken(final ColorProvider provider) {
		return new Token(new TextAttribute(provider.getTerminalsColor()));
	}

	public static Token newKeywordsToken(final ColorProvider provider) {
    	return new Token(new TextAttribute(provider.getKeywordsColor(), null, SWT.BOLD));
    }

	public static Token newStringToken(final ColorProvider provider) {
		return new Token(new TextAttribute(provider.getStringColor()));
	}

	public static Token newDefineToken(final ColorProvider provider) {
		return new Token(new TextAttribute(provider.getDefineColor(), null, SWT.BOLD));
	}

	public static Token newTextToken(final ColorProvider provider) {
		return new Token(new TextAttribute(provider.getTextColor()));
	}

	public static Token newCommentToken(final ColorProvider provider) {
		return new Token(new TextAttribute(provider.getCommentColor()));
	}

	public static Token newOtherToken(final ColorProvider provider) {
		return new Token(new TextAttribute(provider.getOtherColor()));
	}
}
