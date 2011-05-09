/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.expression.SyntaxConstants;
import org.eclipse.gmf.internal.xpand.model.XpandResource;
import org.eclipse.gmf.internal.xpand.xtend.ast.XtendResource;

// FIXME it's not a good idea to parse file on every proposal computation
public class ResourceManagerImpl implements ResourceManager {

	private final IProject contextProject;

	public ResourceManagerImpl(IProject context) {
		this.contextProject = context;
	}

	public XtendResource loadXtendResource(String fullyQualifiedName) {
		return loadXtendResource(resolve(fullyQualifiedName, XtendResource.FILE_EXTENSION));
	}

	public XtendResource loadXtendResource(IFile file) {
		assert file.getProject() == contextProject;
		return new XtendResourceParser().parse(file);
	}

	public XpandResource loadXpandResource(String fullyQualifiedName) {
		return loadXpandResource(resolve(fullyQualifiedName, XpandResource.TEMPLATE_EXTENSION));
	}

	public XpandResource loadXpandResource(IFile file) {
		if (file == null) {
			return null;
		}
		assert file.getProject() == contextProject;
		return new XpandResourceParser().parse(file);
	}

	public void forget(IFile resource) {
		// TODO Auto-generated method stub
		// implement when caching
	}

	private IFile resolve(String fqn, String ext) {
		IPath p = new Path(fqn.replaceAll(SyntaxConstants.NS_DELIM, "/")).addFileExtension(ext);
		// FIXME handle CCE
		return (IFile) contextProject.findMember(p);
	}
}
