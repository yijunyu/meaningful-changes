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
package org.eclipse.gmf.internal.xpand.codeassist;

public class XpandTokens {
    public final static String LT = "\u00ab";

    public static final char LT_CHAR = '\u00ab';

    public final static String RT = "\u00bb";

    public static final char RT_CHAR = '\u00bb';

    public final static String AS = "AS";

    public final static String CEND = "CEND";

    public final static String CSTART = "CSTART";

    public final static String DEFINE = "DEFINE";

    public final static String DISABLE = "DISABLE";

    public final static String ELSE = "ELSE";

    public final static String ELSEIF = "ELSEIF";

    public final static String ENDDEFINE = "ENDDEFINE";

    public final static String ENDFILE = "ENDFILE";

    public final static String ENDFOREACH = "ENDFOREACH";

    public final static String ENDIF = "ENDIF";

    public final static String ENDLET = "ENDLET";

    public final static String ENDPROTECT = "ENDPROTECT";

    public final static String ERROR = "ERROR";

    public final static String EXPAND = "EXPAND";

    public final static String EXTENSION = "EXTENSION";

    public final static String FILE = "FILE";

    public final static String FOR = "FOR";

    public final static String FOREACH = "FOREACH";

    public final static String ID = "ID";

    public final static String IF = "IF";

    public final static String IMPORT = "IMPORT";

    public final static String ITERATOR = "ITERATOR";

    public final static String LET = "LET";

    public final static String NEW = "new";

    public final static String PROTECT = "PROTECT";

    public final static String SEPARATOR = "SEPARATOR";

    public final static String REM = "REM";

    public final static String ENDREM = "ENDREM";

    public final static String TRUE_CONST = "true";

    public final static String FALSE_CONST = "false";

    public final static String NULL_CONST = "null";

    public final static String THIS = "this";

    public final static String LET_EXPR = "let";

    public final static String SWITCH = "switch";

    public final static String CASE = "case";

    public final static String DEFAULT = "default";

    public static final String ENDAROUND = "ENDAROUND";

    public static final String AROUND = "AROUND";

    public final static String[] allKeywords() { // XXX REM and ENDREM are not included, why? (code completion misses)
        return new String[] { AROUND, ENDAROUND, AS, CEND, CSTART, DEFINE, DISABLE, ELSE, ELSEIF, ENDDEFINE, ENDFILE,
                ENDFOREACH, ENDIF, ENDLET, ENDPROTECT, ERROR, EXPAND, EXTENSION, FILE, FOR, FOREACH, ID, IF, IMPORT,
                ITERATOR, LET, NEW, PROTECT, SEPARATOR, TRUE_CONST, FALSE_CONST, NULL_CONST, THIS, LET_EXPR, SWITCH,
                CASE, DEFAULT };
    }
}
