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
package org.eclipse.gmf.internal.xpand.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class TypeNameUtil {
	// \A((\w+)\[)?((\w+)!)?([\w:]*\w+)(\])?\z
	// XXX hmm, looks like "Set[:y::z" would be 'valid' string?
	private final static Pattern TYPE_PATTERN = Pattern.compile("\\A((\\w+)\\[)?((\\w+)!)?([\\w:]*\\w+)(\\])?\\z");

	public static String getCollectionTypeName(final String name) {
		return getGroup(name, 2);
	}

	public static String getMetaModelName(final String name) {
		return getGroup(name, 4);
	}

	public static String getTypeName(final String name) {
		return getGroup(name, 5);
	}

	private static String getGroup(final String input, final int group) {
		final Matcher m = TYPE_PATTERN.matcher(input);
		if (m.matches()) {
			return m.group(group);
		} else {
			return null;
		}
	}

	/*
	 * public static String getName(final Class class1) { return
	 * class1.getName().replaceAll("\\.", SyntaxConstants.NS_DELIM); }
	 */
	public static String withoutLastSegment(final String fqn) {
		if (fqn.lastIndexOf(SyntaxConstants.NS_DELIM) == -1) {
			return null;
		}
		return fqn.substring(0, fqn.lastIndexOf(SyntaxConstants.NS_DELIM));
	}

	public static String toCanonicalNameFromAlias(String potentialAlias) {
		if ("String".equals(potentialAlias) || "string".equals(potentialAlias)) {
			return "EString";
		}
		if ("boolean".equals(potentialAlias) || "Boolean".equals(potentialAlias)) {
			return "EBoolean";
		}
		if ("Integer".equals(potentialAlias) || "int".equals(potentialAlias)) {
			return "EInt";
		}
		if ("Object".equals(potentialAlias)) {
			return "EJavaObject";
		}
		return potentialAlias;
	}
	public static boolean isQualifiedName(String name) {
		assert name != null;
		return name.indexOf(SyntaxConstants.NS_DELIM) != -1;
	}

	public static String getLastSegment(final String fqn) {
		if (fqn.lastIndexOf(SyntaxConstants.NS_DELIM) == -1) {
			return fqn;
		}
		return fqn.substring(fqn.lastIndexOf(SyntaxConstants.NS_DELIM) + SyntaxConstants.NS_DELIM.length());
	}

	/**
	 * XXX what if type is of COLLECTION_TYPE?
	 */
	public static String getQualifiedName(EClassifier type) {
		if (type.getEPackage() == null) { // though, that's odd and should never happen
			return type.getName();
		}
		return getFullNamespace(type) + SyntaxConstants.NS_DELIM + type.getName();
	}

	/**
	 * XXX what if type is of COLLECTION_TYPE?
	 * @return never <code>null</code>
	 */
	public static String getFullNamespace(EClassifier type) {
		assert type != null;
		StringBuilder sb = new StringBuilder();
		EPackage p = type.getEPackage();
		while (p != null) {
			if (sb.length() > 0) {
				sb.insert(0, SyntaxConstants.NS_DELIM);
			}
			sb.insert(0, p.getName());
			p = p.getESuperPackage();
		}
		return sb.toString();
	}

	public static String getSimpleName(final String fqn) {
		final String ct = getCollectionTypeName(fqn);
		final String mm = getMetaModelName(fqn);
		final String inner = getLastSegment(getTypeName(fqn));
		final StringBuffer sb = new StringBuffer();
		if (ct != null) {
			sb.append(ct).append("[");
		}
		if (mm != null) {
			sb.append(mm).append("!");
		}
		sb.append(inner);
		if (ct != null) {
			sb.append("]");
		}
		return sb.toString();
	}
}
