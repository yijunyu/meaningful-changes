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
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.PatternRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Sven Efftinge
 */
public class XpandPartitionScanner extends RuleBasedScanner implements IPartitionTokenScanner {
	public final static String TAG = "__tag";

	public final static String COMMENT = "__comment";

	public XpandPartitionScanner() {

		final IToken tag = new Token(TAG);
		final IToken comment = new Token(COMMENT);

		final List<PatternRule> rules = new ArrayList<PatternRule>();

		// TODO we need to handle whitespace like this: '<< REM .... ENDREM >>'

		rules.add(new MultiLineRule(XpandTokens.LT + XpandTokens.REM, XpandTokens.ENDREM + XpandTokens.RT, comment));

		rules.add(new MultiLineRule(XpandTokens.LT + XpandTokens.REM, XpandTokens.ENDREM + '-' + XpandTokens.RT, comment) {
			@Override
			public IToken evaluate(ICharacterScanner scanner) {
				return super.evaluate(scanner);
			}
		});

		rules.add(new MultiLineRule(XpandTokens.LT, XpandTokens.RT, tag));

		setRules(rules.toArray(new IPredicateRule[rules.size()]));
	}

	public void setPartialRange(IDocument document, int offset, int length, String contentType, int partitionOffset) {
		// copied from RuleBasedPartitionScanner,
		// the idea seems to be to shift range to the start of the partition
		if (partitionOffset > -1) {
			int delta = offset - partitionOffset;
			if (delta > 0) {
				super.setRange(document, partitionOffset, length + delta);
				//fOffset = offset;
				return;
			}
		}
		super.setRange(document, offset, length);
	}

	@Override
	public IToken nextToken() {
		// copy from superclass, added reseting fOffset to initial value prior to next rule 
		// invocation to protect from badly written rules (e.g. PatternRule) thad do not unread
		// characters if matched partially
		fTokenOffset= fOffset;
		fColumn= UNDEFINED;

		if (fRules != null) {
			for (int i= 0; i < fRules.length; i++) {
				IToken token= (fRules[i].evaluate(this));
				if (!token.isUndefined()) {
					return token;
				} else {
					// reset offset for the next rule
					fOffset = fTokenOffset;
				}
			}
		}

		if (read() == EOF)
			return Token.EOF;
		return fDefaultReturnToken;
	}
}
