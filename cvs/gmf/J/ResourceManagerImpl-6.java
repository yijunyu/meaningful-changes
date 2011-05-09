/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
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

import org.eclipse.gmf.internal.xpand.Activator;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.model.XpandResource;
import org.eclipse.gmf.internal.xpand.xtend.ast.XtendResource;

// FIXME it's not a good idea to parse file on every proposal computation
public abstract class ResourceManagerImpl implements ResourceManager {

	public XtendResource loadXtendResource(String fullyQualifiedName) {
		Reader r = null;
		try {
			r = resolve(fullyQualifiedName, XtendResource.FILE_EXTENSION);
			assert r != null;
			return loadXtendResource(r, fullyQualifiedName);
		} catch (FileNotFoundException ex) {
			return delegateLoadXtendResource(fullyQualifiedName);
		} catch (IOException ex) {
			Activator.logError(ex);
		} catch (ParserException ex) {
			handleParserException(fullyQualifiedName, ex);
		} finally {
			if (r != null) {
				try {
					r.close();
				} catch (Exception ex) {/*IGNORE*/}
			}
		}
		return null;
	}

	public XpandResource loadXpandResource(String fullyQualifiedName) {
		Reader r = null;
		try {
			r = resolve(fullyQualifiedName, XpandResource.TEMPLATE_EXTENSION);
			assert r != null; // exception should be thrown to indicate issues with resolve
			return loadXpandResource(r, fullyQualifiedName);
		} catch (FileNotFoundException ex) {
			return delegateLoadXpandResource(fullyQualifiedName);
		} catch (IOException ex) {
			// XXX come up with better handling
			Activator.logWarn(ex.getMessage());
		} catch (ParserException ex) {
			handleParserException(fullyQualifiedName, ex);
		} finally {
			if (r != null) {
				try {
					r.close();
				} catch (Exception ex) {/*IGNORE*/}
			}
		}
		return null;
	}

	protected XtendResource delegateLoadXtendResource(String fullyQualifiedName) {
		for (ResourceManager next : getDependenies()) {
			XtendResource r = next.loadXtendResource(fullyQualifiedName);
			if (r != null) {
				return r;
			}
		}
		return null;
	}

	protected XpandResource delegateLoadXpandResource(String fullyQualifiedName) {
		for (ResourceManager next : getDependenies()) {
			XpandResource r = next.loadXpandResource(fullyQualifiedName);
			if (r != null) {
				return r;
			}
		}
		return null;
	}

	protected void handleParserException(String name, ParserException ex) {
		Activator.logWarn(name + ":" + ex.getClass().getName());
	}

	/**
	 * @return never return <code>null</code>, throw exception instead
	 * @throws IOException in case resource can't be read. Throw {@link java.io.FileNotFoundException} to indicate resource was not found. 
	 */
	protected abstract Reader resolve(String fullyQualifiedName, String extension) throws IOException;

	/**
	 * Override if your implementation supports dependenices
	 * @return never null
	 */
	protected ResourceManager[] getDependenies() {
		return new ResourceManager[0];
	}

	protected XtendResource loadXtendResource(Reader reader, String fullyQualifiedName) throws IOException, ParserException {
		return new XtendResourceParser().parse(reader, fullyQualifiedName);
	}

	protected XpandResource loadXpandResource(Reader reader, String fullyQualifiedName) throws IOException, ParserException {
		return new XpandResourceParser().parse(reader, fullyQualifiedName);
	}
}
