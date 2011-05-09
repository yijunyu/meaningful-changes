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

import org.eclipse.gmf.internal.xpand.xtend.ast.ExtensionFile;
import org.eclipse.gmf.internal.xpand.xtend.ast.XtendResource;
import org.eclipse.gmf.internal.xpand.xtend.parser.XtendLexer;
import org.eclipse.gmf.internal.xpand.xtend.parser.XtendParser;

public class XtendResourceParser {

    public XtendResource parse(final Reader source, final String name) throws IOException, ParserException {
        ExtensionFile tpl = null;
        XtendLexer scanner = null;
        final char[] buffer = new StreamConverter().toCharArray(source);
        try {
            scanner = new XtendLexer(buffer, name);
            XtendParser parser = new XtendParser(scanner);
            scanner.lexer(parser);
            tpl = parser.parser();
			// FIXME handle errors - override Lexer#reportErrors, collect and 
        } catch (final Exception e) {
			ParserException.ErrorLocationInfo[] errors = scanner.getErrors();
        	if (errors.length == 0) {
        		throw new IOException("Unexpected exception while parsing");
        	} else {
        		throw new ParserException(errors);
        	}
        }
        if (tpl != null) {
            tpl.setFullyQualifiedName(name);
            return tpl;
        }
		ParserException.ErrorLocationInfo[] errors = scanner.getErrors();
		assert errors.length > 0 : "otherwise, no reason not to get template";
		throw new ParserException(errors);
    }
}
