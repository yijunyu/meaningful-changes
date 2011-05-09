/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.internal.xpand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmf.internal.xpand.build.WorkspaceResourceManager;

/**
 * Tracks template roots for a given project.
 */
public class RootManager {
	static final IPath PROJECT_RELATIVE_PATH_TO_CONFIG_FILE = new Path(".xpand-root");	//$NON-NLS-1$
	private final IFile myConfig;
	private List<RootDescription> myRoots;
	private List<IRootChangeListener> myListeners = new ArrayList<IRootChangeListener>(2);

	public RootManager(IProject project) {
		myConfig = project.getFile(PROJECT_RELATIVE_PATH_TO_CONFIG_FILE);
	}

	public void addRootChangeListener(IRootChangeListener l) {
		if (l != null && !myListeners.contains(l)) {
			myListeners.add(l);
		}
	}

	public void removeRootChangeListener(IRootChangeListener l) {
		myListeners.remove(l);
	}

	void rootsChanged() {
		myRoots = null;
		for (IRootChangeListener next : myListeners) {
			next.rootsChanged(this);
		}
	}

	protected IProject getProject() {
		return myConfig.getProject();
	}

	public WorkspaceResourceManager getResourceManager(IFile file) {
		for (IRootDescription nextDescription : getRoots()) {
			if (nextDescription.contains(file)) {
				return nextDescription.getManager();
			}
		}
		return null;
	}

	public List<? extends IRootDescription> getRoots() {
		if (myRoots == null) {
			reloadRoots();
		}
		return myRoots;
	}

	private void reloadRoots() {
		if (!myConfig.exists()) {
			myRoots = Collections.singletonList(new RootDescription(DEFAULT_ROOTS));
			return;
		}
		final ArrayList<RootDescription> read = new ArrayList<RootDescription>();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(myConfig.getContents(), myConfig.getCharset()));
			String line;
			while((line = in.readLine()) != null) {
				line = line.trim();
				if (line.length() > 0 && line.charAt(0) != '#') {
					String[] split = line.split(",");
					ArrayList<IPath> nextPaths = new ArrayList<IPath>(split.length);
					for (String nextPath : split) {
						nextPath = nextPath.trim();
						if (nextPath.length() > 0) {
							IPath toAdd = new Path(nextPath);
							//Absolute paths specify resources relative to workbench and/or 
							if (toAdd.isAbsolute() && toAdd.segmentCount() < 2) {
								continue;
							}
							nextPaths.add(toAdd);
						}
					}
					read.add(new RootDescription(nextPaths));
				}
			}
		} catch (CoreException ex) {
			// IGNORE
		} catch (IOException ex) {
			// IGNORE
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					/* IGNORE */
				}
			}
		}
		myRoots = read;
	}

	public Set<IProject> getReferencedProjects() {
		Set<IProject> result = new LinkedHashSet<IProject>();
		for (IRootDescription nextDescription : getRoots()) {
			for (IPath next : nextDescription.getRoots()) {
				if (next.isAbsolute() && next.segmentCount() > 1) {
					IProject candidate = ResourcesPlugin.getWorkspace().getRoot().getProject(next.segment(0));
					if (candidate.isAccessible()) {
						result.add(candidate);
					}
				}
			}
		}
		return result;
	}

	boolean containsProject(IPath projectPath) {
		if (myRoots == null) {
			return false;
		}
		for (RootDescription nextRoots : myRoots) {
			for (IPath next : nextRoots.getRoots()) {
				if (next.isAbsolute() && projectPath.isPrefixOf(next)) {
					return true;
				}
			}
		}
		return false;
	}

	private static final List<IPath> DEFAULT_ROOTS = Collections.<IPath>singletonList(new Path("templates"));	//$NON-NLS-1$

	public interface IRootChangeListener {
		public void rootsChanged(RootManager rootManager);
	}

	public interface IRootDescription {
		public List<IPath> getRoots();
		public boolean contains(IResource resource);
		public WorkspaceResourceManager getManager();
	}

	private class RootDescription implements IRootDescription {
		private final List<IPath> myRoots;
		private WorkspaceResourceManager myManager;
		public RootDescription(List<IPath> roots) {
			myRoots = roots;
		}
		public List<IPath> getRoots() {
			return myRoots;
		}
		public WorkspaceResourceManager getManager() {
			if (myManager == null) {
				myManager = new WorkspaceResourceManager(getProject(), myRoots.toArray(new IPath[myRoots.size()]));
			}
			return myManager;
		}
		public boolean contains(IResource resource) {
			if (resource == null) {
				return false;
			}
			for (IPath nextRoot : myRoots) {
				if (nextRoot.isAbsolute()) {
					if (nextRoot.isPrefixOf(resource.getFullPath())) {
						return true;
					}
				} else {
					if (resource.getProject().equals(getProject()) && nextRoot.isPrefixOf(resource.getProjectRelativePath())) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
