/*
 * Copyright (c) 2005, 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *    Radek Dvorak (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.codegen;

/**
 * Utility class for converting data values for various purposes.
 */
public class Conversions {
	// no instances
	private Conversions() {
	}

	/**
	 * Escapes the xml markup characters in the input text
	 * 
	 * @param text
	 *            the string to be escaped
	 * @return escaped string or empty string if the input text is
	 *         <code>null</code>
	 */
	public static String escapeXML(String text) {
		if (text == null) {
			text = ""; //$NON-NLS-1$
		}
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch == '<') {
				result.append("&lt;");
			} else if (ch == '>') {
				result.append("&gt;");
			} else if (ch == '&') {
				result.append("&amp;");
			} else if (ch == '\'') {
				result.append("&apos;");
			} else if (ch == '"') {
				result.append("&quot;");
			} else {
				result.append(ch);
			}
		}
		return result.toString();
	}

	/**
	 * Returns valid String literal for the given <code>String</code> as it
	 * should appear in java source code.
	 * </p>
	 * Each of its characters will appear in the same form as if it was the
	 * argument to {@link #toCharLiteral}.
	 * 
	 * @param strValue
	 *            a string which is the input for the convertsion
	 * @return converted string literal eclosed with quation marks or "null"
	 *         string literal in case the <code>strValue</code> is
	 *         <code>null</code>
	 */
	public static String toStringLiteral(String strValue) {
		if (strValue == null)
			return "null";
		int len = strValue.length();
		StringBuffer result = new StringBuffer(len + 16);
		result.append('\"');
		for (int i = 0; i < len; i++) {
			result.append(escapeChar(strValue.charAt(i)));
		}
		result.append('\"');
		return result.toString();
	}

	private static String escapeChar(char c) {
		if (c == '\b')
			return "\\b";
		if (c == '\t')
			return "\\t";
		if (c == '\n')
			return "\\n";
		if (c == '\f')
			return "\\f";
		if (c == '\r')
			return "\\r";
		if (c == '\"')
			return "\\\"";
		if (c == '\'')
			return "\\\'";
		if (c == '\\')
			return "\\\\";
		if (c >= 32 && c < 127)
			return String.valueOf(c);

		// escaped unicode form
		String num = Integer.toHexString(c);
		switch (num.length()) {
		case 1:
			return "\\u000" + num;
		case 2:
			return "\\u00" + num;
		case 3:
			return "\\u0" + num;
		}
		return "\\u" + num;
	}

	public static String escapeUnicode(String text) {
		StringBuffer result = new StringBuffer(text.length());
		for (int i = 0, size = text.length(); i < size; ++i) {
			char character = text.charAt(i);
			if (character > '\u00ff') {
				result.append("\\u");
				String hex = Integer.toString(character, 16);
				for (int j = hex.length(); j < 4; ++j) {
					result.append("0");
				}
				result.append(hex);
			} else {
				result.append(character);
			}
		}

		return result.toString();
	}
}
