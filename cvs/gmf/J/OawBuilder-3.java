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
package org.eclipse.gmf.internal.xpand.build;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.internal.xpand.Activator;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.gmf.internal.xpand.model.XpandResource;
import org.eclipse.gmf.internal.xpand.util.ContextFactory;
import org.eclipse.gmf.internal.xpand.util.OawMarkerManager;
import org.eclipse.gmf.internal.xpand.xtend.ast.XtendResource;

public class OawBuilder extends IncrementalProjectBuilder {

	private static boolean firstBuild = true; // XXX odd

	class OawDeltaVisitor implements IResourceDeltaVisitor {
		private IProgressMonitor monitor;

		public OawDeltaVisitor(final IProgressMonitor monitor) {
			this.monitor = monitor;
		}

		public boolean visit(final IResourceDelta delta) throws CoreException {
			final IResource resource = delta.getResource();
			if (resource.isDerived()) {
				return false;
			}
			if ((resource instanceof IFile)) {
				IFile file = (IFile) resource;
				if (!isFileOfInterest(file)) {
					return false;
				}
				switch (delta.getKind()) {
				case IResourceDelta.ADDED:
					reloadResource(file);
					break;
				case IResourceDelta.REMOVED:
					handleRemovement(file);
					break;
				case IResourceDelta.CHANGED:
					reloadResource(file);
					break;
				}
			}
			monitor.worked(1);
			return true;
		}

	}

	private class XpandResourceVisitor implements IResourceVisitor {
		private IProgressMonitor monitor;

		public XpandResourceVisitor(final IProgressMonitor monitor) {
			this.monitor = monitor;
		}

		public boolean visit(final IResource resource) {
			if (!resource.isDerived() && (resource instanceof IFile) && isFileOfInterest((IFile) resource)) {
				reloadResource((IFile) resource);
			}
			monitor.worked(1);
			return true;
		}
	}

	public static final String getBUILDER_ID() {
		return "org.openarchitectureware.base.oawBuilder";
	}

	private static boolean isFileOfInterest(IFile file) {
		return XpandResource.TEMPLATE_EXTENSION.equals(file.getFileExtension()) || XtendResource.FILE_EXTENSION.equals(file.getFileExtension());
	}

	// XXX again, using map as mere pairs
	private final Map<XtendResource, IFile> xtendResourcesToAnalyze = new HashMap<XtendResource, IFile>();
	private final Map<XpandResource, IFile> xpandResourcesToAnalyze = new HashMap<XpandResource, IFile>();

	@Override
	protected IProject[] build(final int kind, final Map args, final IProgressMonitor monitor) throws CoreException {
		try {
			if (firstBuild || (kind == FULL_BUILD)) {
				fullBuild(monitor);
			} else {
				final IResourceDelta delta = getDelta(getProject());
				if (delta == null) {
					fullBuild(monitor);
				} else {
					incrementalBuild(delta, monitor);
				}
			}
		} catch (final Throwable e) {
			e.printStackTrace();
		}
		firstBuild = false;
		// TODO to separate thread
		
		for (XtendResource r : xtendResourcesToAnalyze.keySet()) {
	        final ExecutionContext ctx = ContextFactory.createXtendContext(getResourceManager());
	        final Set<AnalysationIssue> issues = new HashSet<AnalysationIssue>();
	        r.analyze(ctx, issues);
	        updateMarkers(xtendResourcesToAnalyze.get(r), issues);
		}
		for (XpandResource r : xpandResourcesToAnalyze.keySet()) {
	        final XpandExecutionContext ctx = ContextFactory.createXpandContext(getResourceManager());
	        final Set<AnalysationIssue> issues = new HashSet<AnalysationIssue>();
	        r.analyze(ctx, issues);
	        updateMarkers(xpandResourcesToAnalyze.get(r), issues);
		}
		// XXX is builder's instance shared for several projects - if yes, we may get ConcurrentModificationEx here 
		xtendResourcesToAnalyze.clear();
		xpandResourcesToAnalyze.clear();
		return null;
	}

	private static void updateMarkers(IFile resource, Set<AnalysationIssue> issues) {
        OawMarkerManager.deleteMarkers(resource);
        OawMarkerManager.addMarkers(resource, issues.toArray(new AnalysationIssue[issues.size()]));
	}

	void reloadResource(final IFile resource) {
		if (!resource.exists()) {
			return;
		}
		getResourceManager().forget(resource);
		if (XpandResource.TEMPLATE_EXTENSION.equals(resource.getFileExtension())) {
			XpandResource r = getResourceManager().loadXpandResource(resource);
			if (r != null) {
				xpandResourcesToAnalyze.put(r, resource);
			}
		} else if (XtendResource.FILE_EXTENSION.equals(resource.getFileExtension())) {
			XtendResource r = getResourceManager().loadXtendResource(resource);
			if (r != null) {
				xtendResourcesToAnalyze.put(r, resource);
			}
		}
	}

	public void handleRemovement(final IFile resource) {
		OawMarkerManager.deleteMarkers(resource);
		getResourceManager().forget(resource);
	}

	protected void fullBuild(final IProgressMonitor monitor) throws CoreException {
		getProject().accept(new XpandResourceVisitor(monitor));
	}

	protected void incrementalBuild(final IResourceDelta delta, final IProgressMonitor monitor) throws CoreException {
		delta.accept(new OawDeltaVisitor(monitor));
	}

	protected ResourceManager getResourceManager() {
		return Activator.getResourceManager(getProject());
	}
}
