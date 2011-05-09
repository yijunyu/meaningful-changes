/*******************************************************************************
 * Copyright (c) 2006, 2007 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.gmf.internal.xpand.Activator;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.expression.SyntaxConstants;
import org.eclipse.gmf.internal.xpand.model.XpandResource;
import org.eclipse.gmf.internal.xpand.xtend.ast.XtendResource;

// FIXME it's not a good idea to parse file on every proposal computation
public abstract class ResourceManagerImpl implements ResourceManager {
	private final Map<String, XtendResource> cachedXtend = new TreeMap<String, XtendResource>();
	private final Map<String, XpandResource> cachedXpand = new TreeMap<String, XpandResource>();

	public XtendResource loadXtendResource(String fullyQualifiedName) {
		if (hasCachedXtend(fullyQualifiedName)) {
			return cachedXtend.get(fullyQualifiedName);
		}
		try {
			final XtendResource loaded = doLoadXtendResource(fullyQualifiedName);
			assert loaded != null; // this is the contract of loadXtendResource
			if (shouldCache()) {
				cachedXtend.put(fullyQualifiedName, loaded);
			}
			return loaded;
		} catch (FileNotFoundException ex) {
			return null;	//Missing resource is an anticipated situation, not a error that should be handled
		} catch (IOException ex) {
			Activator.logError(ex);
		} catch (ParserException ex) {
			handleParserException(fullyQualifiedName, ex);
		}
		return null;
	}

	private XtendResource doLoadXtendResource(String fullyQualifiedName) throws IOException, ParserException {
		Reader[] rs = resolveMultiple(fullyQualifiedName, XtendResource.FILE_EXTENSION);
		assert rs != null && rs.length > 0;
		XtendResource[] result = new XtendResource[rs.length];
		for (int i = 0; i < rs.length; i++) {
			Reader r = rs[i];
			assert r != null;
			try {
				result[i] = loadXtendResource(r, fullyQualifiedName);
				assert result[i] != null; // this is the contract of loadXpandResource
			} finally {
				try {
					r.close();
				} catch (Exception ex) {/*IGNORE*/}
			}
		}
		if (result.length == 1) {
			return result[0];
		}
		return new CompositeXtendResource(this, result);
	}

	public XpandResource loadXpandResource(String fullyQualifiedName) {
		if (hasCachedXpand(fullyQualifiedName)) {
			return cachedXpand.get(fullyQualifiedName);
		}
		try {
			final XpandResource loaded = doLoadXpandResource(fullyQualifiedName);
			if (shouldCache()) {
				cachedXpand.put(fullyQualifiedName, loaded);
			}
			return loaded;
		} catch (FileNotFoundException ex) {
			return null;	//Missing resource is an anticipated situation, not a error that should be handled
		} catch (IOException ex) {
			// XXX come up with better handling
			Activator.logWarn(ex.getMessage());
		} catch (ParserException ex) {
			handleParserException(fullyQualifiedName, ex);
		}
		return null;
	}

	private XpandResource doLoadXpandResource(String fullyQualifiedName) throws IOException, ParserException {
		XpandResource[] unadvised = internalLoadXpandResources(fullyQualifiedName);
		XpandResource[] advices = null;
		try {
	    	String aspectsTemplateName = getAspectsTemplateName(fullyQualifiedName);
	    	advices = internalLoadXpandResources(aspectsTemplateName);
		} catch (FileNotFoundException e) {
		} catch (IOException ex) {
			// XXX come up with better handling
			Activator.logWarn(ex.getMessage());
		} catch (ParserException ex) {
			handleParserException(fullyQualifiedName, ex);
		}
		if (advices == null && unadvised.length == 1) {
			return unadvised[0];
		}
		return new CompositeXpandResource(this, unadvised, advices);
	}

	/**
	 * XXX: only to simplify tests, should be private or inlined
	 */
	protected String getAspectsTemplateName(String fullyQualifiedName) {
		return ASPECT_PREFIX + fullyQualifiedName;
	}

	/**
	 * If the given fully-qualified name is an aspect, transforms it to its "host" fully-qualified name. Otherwise,
	 * returns the given fully-qualified name.
	 */
	protected String getNonAspectsTemplateName(String possiblyAspectedFullyQualifiedName) {
		if (possiblyAspectedFullyQualifiedName == null) {
			return null;
		}
		if (possiblyAspectedFullyQualifiedName.startsWith(ASPECT_PREFIX)) {
			return possiblyAspectedFullyQualifiedName.substring(ASPECT_PREFIX.length());
		}
		return possiblyAspectedFullyQualifiedName;
	}

	private XpandResource[] internalLoadXpandResources(String fullyQualifiedName) throws IOException, ParserException {
		Reader[] rs = resolveMultiple(fullyQualifiedName, XpandResource.TEMPLATE_EXTENSION);
		assert rs != null && rs.length > 0; // exception should be thrown to indicate issues with resolve
		XpandResource[] result = new XpandResource[rs.length];
		for (int i = 0; i < rs.length; i++) {
			Reader r = rs[i];
			assert r != null;
			try {
				result[i] = loadXpandResource(r, fullyQualifiedName);
				assert result[i] != null; // this is the contract of loadXpandResource
			} finally {
				try {
					r.close();
				} catch (Exception ex) {/*IGNORE*/}
			}
		}
		return result;
	}

	protected void handleParserException(String name, ParserException ex) {
		Activator.logWarn(name + ":" + ex.getClass().getName());
	}

	/**
	 * @return never return <code>null</code>, throw exception instead
	 * @throws IOException in case resource can't be read. Throw {@link java.io.FileNotFoundException} to indicate resource was not found. 
	 * @deprecated use {@link #resolveMultiple(String, String)} instead.
	 */
	@Deprecated
	protected abstract Reader resolve(String fullyQualifiedName, String extension) throws IOException;

	/**
	 * Returns an array of resolutions, in the order from newest to oldest. 
	 * This is to enable one template to partially override only a subset of parent templates. 
	 * By default, returns an array consisting of one Reader, the one that {@link #resolve(String, String)} returns.
	 * Subclasses should override.
	 * @return never return <code>null</code> or an empty array, throw exception instead
	 * @throws IOException in case resource can't be read. Throw {@link java.io.FileNotFoundException} to indicate resource was not found. 
	 */
	protected Reader[] resolveMultiple(String fullyQualifiedName, String extension) throws IOException {
		return new Reader[] {resolve(fullyQualifiedName, extension)};
	}

	protected XtendResource loadXtendResource(Reader reader, String fullyQualifiedName) throws IOException, ParserException {
		return new XtendResourceParser().parse(reader, fullyQualifiedName);
	}

	protected XpandResource loadXpandResource(Reader reader, String fullyQualifiedName) throws IOException, ParserException {
		return new XpandResourceParser().parse(reader, fullyQualifiedName);
	}

	protected abstract boolean shouldCache();

	protected final boolean hasCachedXpand(String fullyQualifiedName) {
		return shouldCache() && cachedXpand.containsKey(fullyQualifiedName);
	}
	protected final boolean hasCachedXtend(String fullyQualifiedName) {
		return shouldCache() && cachedXtend.containsKey(fullyQualifiedName);
	}
	protected final void forgetCachedXpand(String fullyQualifiedName) {
		cachedXpand.remove(fullyQualifiedName);
	}
	protected final void forgetCachedXtend(String fullyQualifiedName) {
		cachedXtend.remove(fullyQualifiedName);
	}
	protected final void forgetAll() {
		cachedXpand.clear();
		cachedXtend.clear();
	}

	private static final String ASPECT_PREFIX = "aspects" + SyntaxConstants.NS_DELIM;	//$NON-NLS-1$
}
