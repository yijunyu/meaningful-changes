package org.eclipse.gmf.internal.common.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * @author dstadnik
 */
public class ResourceLocationProvider {

	private final List<IResource> selection;

	public ResourceLocationProvider(ISelection selection) {
		this.selection = new ArrayList<IResource>();
		if (selection instanceof IStructuredSelection) {
			for (Object element : ((IStructuredSelection) selection).toList()) {
				if (element instanceof IResource) {
					this.selection.add((IResource) element);
				}
			}
		}
	}

	public List<IFile> getSelectedFiles(String extension) {
		List<IFile> files = new ArrayList<IFile>();
		for (IResource resource : selection) {
			if (resource instanceof IFile && extension.equals(((IFile) resource).getFileExtension())) {
				files.add((IFile) resource);
			}
		}
		// add files from containers; they are at the end since directly selected files are more important
		for (IResource resource : selection) {
			if (resource instanceof IContainer) {
				try {
					for (IResource member : ((IContainer) resource).members()) {
						if (member instanceof IFile && extension.equals(((IFile) member).getFileExtension())) {
							files.add((IFile) member);
						}
					}
				} catch (CoreException ce) {
					// ignore
				}
			}
		}
		return files;
	}
}
