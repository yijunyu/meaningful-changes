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

import org.eclipse.gmf.internal.xpand.codeassist.XpandTokens;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.PatternRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Sven Efftinge
 * 
 * 
 */
public class XpandPartitionScanner extends RuleBasedPartitionScanner {
    public final static String TAG = "__tag";

    public final static String COMMENT = "__comment";

    public XpandPartitionScanner() {

        final IToken tag = new Token(TAG);
        final IToken comment = new Token(COMMENT);

        final List<PatternRule> rules = new ArrayList<PatternRule>();

        // TODO we need to handle whitespace like this: '<< REM .... ENDREM >>'
        rules.add(new MultiLineRule(XpandTokens.LT + XpandTokens.REM, XpandTokens.ENDREM + XpandTokens.RT, comment));

        rules.add(new MultiLineRule(XpandTokens.LT, XpandTokens.RT, tag));

        setPredicateRules(rules.toArray(new IPredicateRule[rules.size()]));
    }
}
