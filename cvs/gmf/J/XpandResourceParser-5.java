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
 *     Artem Tikhomirov - LPG lexer/parser and error reporting
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.util;

import java.io.IOException;
import java.io.Reader;

import org.eclipse.gmf.internal.xpand.ast.Template;
import org.eclipse.gmf.internal.xpand.model.XpandResource;
import org.eclipse.gmf.internal.xpand.parser.XpandLexer;
import org.eclipse.gmf.internal.xpand.parser.XpandParser;

public class XpandResourceParser {

	// XXX everything except exact lexer and parser instances are the same as n XtendResourceParser
	public XpandResource parse(final Reader source, final String qualifiedTemplateName) throws IOException, ParserException {
		Template tpl = null;
		XpandParser parser = null;
		XpandLexer scanner = null;
		final char[] buffer = new StreamConverter().toCharArray(source);
		try {
			scanner = new XpandLexer(buffer, qualifiedTemplateName);
			parser = new XpandParser(scanner);
			scanner.lexer(parser);
			tpl = parser.parser();
			// FIXME handle errors if find out how to force generated parser to throw exception instead of consuming it
		} catch (final Exception e) {
			ParserException.ErrorLocationInfo[] errors = scanner.getErrors();
        	if (errors.length == 0) {
        		throw new IOException("Unexpected exception while parsing");
        	} else {
        		throw new ParserException(errors);
        	}
		}
		if (tpl != null) {
			// XXX two choices here - 
			// (1) pass any name into parse method, do not assume it's fqn and move setFQN outside of this method
			// (2) assume fqn is passed into parse() as it's now.
			tpl.setFullyQualifiedName(qualifiedTemplateName);
			return tpl;
		}
		ParserException.ErrorLocationInfo[] errors = scanner.getErrors();
		assert errors.length > 0 : "otherwise, no reason not to get template";
		throw new ParserException(errors);
	}

}
