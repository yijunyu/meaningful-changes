package org.eclipse.gmf.internal.xpand.build;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

class EcoreModelResourceVisitor implements IResourceVisitor, IResourceDeltaVisitor {
	private static String ECORE_FILE_EXT = "ecore";

	private final IProgressMonitor monitor;
	private final Set<IFile> newEcoreModelFiles = new HashSet<IFile>();
	private final Set<IFile> changedEcoreModelFiles = new HashSet<IFile>();
	private final Set<IFile> removedEcoreModelFiles = new HashSet<IFile>();

	public EcoreModelResourceVisitor(IProgressMonitor progress) {
		monitor = progress;
	}

	public Set<IFile> getNewModelFiles() {
		return Collections.unmodifiableSet(newEcoreModelFiles);
	}

	public Set<IFile> getChangedModelFiles() {
		return Collections.unmodifiableSet(changedEcoreModelFiles);
	}

	public Set<IFile> getRemovedModelFiles() {
		return Collections.unmodifiableSet(removedEcoreModelFiles);
	}

	private void handleNewResource(IFile file) {
		newEcoreModelFiles.add(file);
	}

	private void handleChangedResource(IFile file) {
		changedEcoreModelFiles.add(file);
	}

	private void handleRemoved(IFile file) {
		removedEcoreModelFiles.add(file);
	}

	public boolean visit(IResource resource) throws CoreException {
		if (resource.isDerived()) {
			return false;
		}
		if (resource.getType() == IResource.FILE && isEcoreModel(resource)) {
			handleNewResource((IFile) resource);
			monitor.worked(1);
			return false;
		}
		return true;
	}

	public boolean visit(IResourceDelta delta) throws CoreException {
		final IResource resource = delta.getResource();
		if (resource.isDerived()) {
			return false;
		}
		if (resource.getType() == IResource.FILE && isEcoreModel(resource)) {
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				handleNewResource((IFile) resource);
				break;
			case IResourceDelta.REMOVED:
				handleRemoved((IFile) resource);
				break;
			case IResourceDelta.CHANGED:
				handleChangedResource((IFile) resource);
				break;
			}
			monitor.worked(1);
			return false;
		}
		return true;
	}

	private static boolean isEcoreModel(IResource file) {
		return ECORE_FILE_EXT.equals(file.getFileExtension());
	}
}
