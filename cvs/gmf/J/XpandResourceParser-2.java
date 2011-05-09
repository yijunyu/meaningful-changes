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
package org.eclipse.gmf.internal.xpand.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gmf.internal.xpand.Activator;
import org.eclipse.gmf.internal.xpand.ast.Template;
import org.eclipse.gmf.internal.xpand.model.XpandResource;
import org.eclipse.gmf.internal.xpand.parser.XpandLexer;
import org.eclipse.gmf.internal.xpand.parser.XpandParser;

public class XpandResourceParser {

	public XpandResource parse(final IFile file) {
		Template tpl = null;
		XpandParser parser = null;
		XpandLexer scanner = null;
		char[] buffer;
		try {
			StreamConverter sc = new StreamConverter();
			buffer = sc.toCharArray(file);
		} catch (final CoreException ex) {
			Activator.log(ex.getStatus());
			return null;
		} catch (UnsupportedEncodingException ex) {
			Activator.logError(ex);
			return null;
		} catch (IOException ex) {
			Activator.logError(ex);
			return null;
		}
		try {
			scanner = new XpandLexer(buffer, file.getName());
			parser = new XpandParser(scanner);
			scanner.lexer(parser);
			tpl = parser.parser();
			// FIXME handle errors
//		} catch (final MismatchedTokenException e) {
//			final Token t = e.token;
//			final int offSet = t.getColumn() - 1;
//			OawMarkerManager.deleteMarkers(file);
//			OawMarkerManager.addErrorMarker(file, e.getMessage(), IMarker.SEVERITY_ERROR, offSet, offSet + t.getText().length());
//		} catch (final NoViableAltException e) {
//			final Token t = e.token;
//			final int offSet = t.getColumn() - 1;
//			final int length = t.getText() == null ? offSet : offSet + t.getText().length();
//			OawMarkerManager.deleteMarkers(file);
//			OawMarkerManager.addErrorMarker(file, e.getMessage(), IMarker.SEVERITY_ERROR, offSet, length);
		} catch (final Exception e) {
			final int start = scanner.getStreamIndex() - 1;
			final int end = start + 1;
			OawMarkerManager.deleteMarkers(file);
			OawMarkerManager.addErrorMarker(file, e.getMessage(), IMarker.SEVERITY_ERROR, start, end);
		}
		if (tpl != null) {
			tpl.setFullyQualifiedName(Activator.getQualifiedName(file));
			return tpl;
		}
		return null;
	}

}
