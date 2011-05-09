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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Sven Efftinge
 * 
 * 
 */
public class XpandKeywordRule implements IRule {

    private IToken token;

    private String[] keywords;

    private String[] getKeywords(final String prefix) {
        final List<String> result = new ArrayList<String>();
        for (final String w : keywords) {
            if (w.startsWith(prefix)) {
				result.add(w);
			}
        }
        return  result.toArray(new String[result.size()]);
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

    /**
     * 
     */
    public XpandKeywordRule(final IToken token, final String[] keywords) {
        this.token = token;
        this.keywords = keywords;
    }

    /**
     * @param prefix
     * @return
     */
    private boolean keywordExists(final String prefix) {
        final String[] currentWords = getKeywords(prefix.toString());
        return (currentWords != null) && (currentWords.length > 0);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.text.rules.IRule#evaluate(org.eclipse.jface.text.rules.ICharacterScanner)
     */
    public IToken evaluate(final ICharacterScanner scanner) {
        final StringBuffer buff = new StringBuffer();
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
