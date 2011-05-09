/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand;

/**
 * This class is a collection of helper functions for string handling.
 *
 * @author Arno Haase
 */
public class StringHelper {

    /**
     * replaces special characters that affect formatting with non-formatting character sequences.
     * <ul>
     * <li> \ -> \\
     * <li> &lt;tab&gt; -> \t
     * <li> &lt;CR&gt; -> \r
     * <li> &lt;Newline&gt; -> \n
     * </ul>
     */
    public static String escape (String src) {
        String result = src.replace ("\\", "\\\\");
        result = result.replace("\t", "\\t");
        result = result.replace("\r", "\\r");
        result = result.replace("\n", "\\n");
        result = result.replace("\"", "\\\"");
        return result;
    }


    /**
     * undoes the operations of <code>escape</code>
     */
    public static String unescape (String src) {
        if (src == null) {
			return null;
		}

        final StringBuffer result = new StringBuffer ();
        for (int i = 0; i < src.length (); i++) {
            final char curChar = src.charAt (i);

            if (curChar != '\\') {
                result.append (curChar);
                continue;
            }

            i++;
            if (i >= src.length ()) {
				throw new IllegalArgumentException ("String ends with '\\'");
			}

            result.append (unescapeChar (src.charAt (i)));
        }

        return result.toString ();
    }

    private static char unescapeChar (char escapedChar) {
        switch (escapedChar) {
            case '\\':
                return '\\';
            case 'n':
                return '\n';
            case 'r':
                return '\r';
            case 't':
                return '\t';
            case '"':
                return '"';
        }
        throw new IllegalArgumentException ("unsupported string format: '\\" + escapedChar + "' is not supported.");
    }

    /**
     * removes a number of characters from the beginning and the end of a string
     */
    public static String strip (String s, int numStart, int numEnd) {
        if (s == null) {
			return s;
		}

        return s.substring(numStart, s.length () - numEnd);
    }

    public static String firstUpper (String str) {
        if ((str == null) || (str.length () == 0)) {
			return str;
		}
        char[] arr = str.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }

    public static String firstLower (String str) {
        if ((str == null) || (str.length () == 0)) {
			return str;
		}
        char[] arr = str.toCharArray();
        arr[0] = Character.toLowerCase(arr[0]);
        return new String(arr);
    }
}
