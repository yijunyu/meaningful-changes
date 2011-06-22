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
package org.eclipse.gmf.internal.xpand.editor.scan;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Sven Efftinge
 */
public class XpandKeywordRule implements IRule {

    private final IToken token;

    private final String[] keywords;

    public XpandKeywordRule(final IToken token, final String[] keywords) {
        this.token = token;
        this.keywords = keywords;
    }

    private boolean isKeyword(final String word) {
    	// XXX linear search
        for (final String w : keywords) {
            if (w.equals(word)) {
				return true;
			}
        }
        return false;
    }

    private boolean keywordExists(final String prefix) {
        for (final String w : keywords) {
            if (w.startsWith(prefix)) {
				return true;
			}
        }
        return false;
    }

    public IToken evaluate(final ICharacterScanner scanner) {
        final StringBuilder buff = new StringBuilder();
        boolean stopReading = false;
        int reads = 0;
        while (!stopReading) {
            reads++;
            final char c = (char) scanner.read();
            if ((buff.length() > 0) && !Character.isJavaIdentifierPart(c)) {
                if (isKeyword(buff.toString()) && !keywordExists(buff.toString() + c)) {
                    scanner.unread();
                    return token;
                }
            }
            buff.append(c);
            stopReading = !keywordExists(buff.toString());
        }

        for (int i = 0; i < reads; i++) {
            scanner.unread();
        }
        return Token.UNDEFINED;
    }

}
