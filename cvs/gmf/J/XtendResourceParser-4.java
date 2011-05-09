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
import java.util.ArrayList;

import lpg.lpgjavaruntime.LexStream;
import lpg.lpgjavaruntime.ParseErrorCodes;

import org.eclipse.gmf.internal.xpand.xtend.ast.ExtensionFile;
import org.eclipse.gmf.internal.xpand.xtend.ast.XtendResource;
import org.eclipse.gmf.internal.xpand.xtend.parser.XtendLexer;
import org.eclipse.gmf.internal.xpand.xtend.parser.XtendParser;

public class XtendResourceParser {

    public XtendResource parse(final Reader source, final String name) throws IOException, ParserException {
        ExtensionFile tpl = null;
        XtendLexer scanner = null;
        final ArrayList<ParserException.ErrorLocationInfo> errors = new ArrayList<ParserException.ErrorLocationInfo>();
        final char[] buffer = new StreamConverter().toCharArray(source);
        try {
            scanner = new XtendLexer(buffer, name) {
        		// FIXME move to XtendLexer.g template
            	@Override
            	public void reportError(int left_loc, int right_loc) {
                    errors.add(createError(this, left_loc, right_loc));
            		super.reportError(left_loc, right_loc);
            	}
            };
            XtendParser parser = new XtendParser(scanner);
            scanner.lexer(parser);
            tpl = parser.parser();
			// FIXME handle errors - override Lexer#reportErrors, collect and 
        } catch (final Exception e) {
        	if (errors.isEmpty()) {
        		throw new IOException("Unexpected exception while parsing");
        	} else {
        		throw new ParserException(errors);
        	}
        }
        if (tpl != null) {
            tpl.setFullyQualifiedName(name);
            return tpl;
        }
        return null;
    }

    public static ParserException.ErrorLocationInfo createError(LexStream lexStream, int left_loc, int right_loc) {
		// COPY OF LexStream#reportError
        int errorCode = (right_loc >= lexStream.getStreamLength() ? ParseErrorCodes.EOF_CODE : left_loc == right_loc ? ParseErrorCodes.LEX_ERROR_CODE : ParseErrorCodes.INVALID_TOKEN_CODE); 
        int end_loc = (left_loc == right_loc ? right_loc : right_loc - 1);
        String tokenText = (errorCode == ParseErrorCodes.EOF_CODE ? "End-of-file " : errorCode == ParseErrorCodes.INVALID_TOKEN_CODE
                                ? "\"" + new String(lexStream.getInputChars(), left_loc, right_loc - left_loc) + "\" "
                                : "\"" + lexStream.getCharValue(left_loc) + "\" ");
        // END
        final int startLine = lexStream.getLineNumberOfCharAt(left_loc);
        final int startColumn = lexStream.getColumnOfCharAt(left_loc);
        final int endLine = lexStream.getLineNumberOfCharAt(end_loc);
        final int endColumn = lexStream.getColumnOfCharAt(end_loc);
        final String message = tokenText + ParseErrorCodes.errorMsgText[errorCode];
        return new ParserException.ErrorLocationInfo(message, startLine, startColumn, endLine, endColumn);
    }
}
