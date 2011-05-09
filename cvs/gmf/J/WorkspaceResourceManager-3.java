/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.build;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmf.internal.xpand.ResourceMarker;
import org.eclipse.gmf.internal.xpand.expression.SyntaxConstants;
import org.eclipse.gmf.internal.xpand.model.XpandResource;
import org.eclipse.gmf.internal.xpand.util.ParserException;
import org.eclipse.gmf.internal.xpand.util.ResourceManagerImpl;
import org.eclipse.gmf.internal.xpand.util.StreamConverter;
import org.eclipse.gmf.internal.xpand.xtend.ast.XtendResource;

// FIXME package-local?, refactor Activator.getResourceManager uses
public class WorkspaceResourceManager extends ResourceManagerImpl {
	private final IProject contextProject;

	public WorkspaceResourceManager(IProject context) {
		this.contextProject = context;
	}

	public XtendResource loadXtendResource(IFile file) throws CoreException, IOException, ParserException {
		if (file == null) {
			return null;
		}
		assert file.getProject() == contextProject;
		Reader r = null;
		try {
			r = new StreamConverter().toContentsReader(file);
			return remember(file, super.loadXtendResource(r, toFullyQualifiedName(file)));
		} finally {
			if (r != null) {
				r.close();
			}
		}
	}

	public XpandResource loadXpandResource(IFile file) throws CoreException, IOException, ParserException {
		if (file == null) {
			return null;
		}
		assert file.getProject() == contextProject;
		Reader r = null;
		try {
			r = new StreamConverter().toContentsReader(file);
			return remember(file, super.loadXpandResource(r, toFullyQualifiedName(file)));
		} finally {
			if (r != null) {
				r.close();
			}
		}
	}

	protected <T extends ResourceMarker> T remember(IFile resource, T loadedResource) {
		// TODO cache.
		// TODO move to superclass - odd if caching will happen to templates accessed via IFile only
		// XXX Do I need cache?
		return loadedResource;
	}

	public void forget(IFile resource) {
		// TODO Auto-generated method stub
		// implement when caching
	}

	protected Reader resolve(String fqn, String ext) throws IOException {
		IPath p = new Path(fqn.replaceAll(SyntaxConstants.NS_DELIM, "/")).addFileExtension(ext);
		IResource r = contextProject.findMember(p);
		if (r == null) {
			// XXX confiugre manager with path defined as preference/resource variable
			r = contextProject.findMember(new Path("templates/").append(p));
		}
		if (false == r instanceof IFile) {
			throw new FileNotFoundException(p.toString());
		}
		try {
			return new StreamConverter().toContentsReader((IFile) r);
		} catch (CoreException ex) {
			IOException wrap = new IOException(ex.getStatus().getMessage());
			wrap.initCause(ex);
			throw wrap;
		}
	}

	private String toFullyQualifiedName(IFile file) {
		return file.getProjectRelativePath().toString().replaceAll("/", SyntaxConstants.NS_DELIM);
	}
}