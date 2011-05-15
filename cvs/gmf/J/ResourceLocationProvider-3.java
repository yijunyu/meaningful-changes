package org.eclipse.gmf.internal.common.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * @author dstadnik
 */
public class ResourceLocationProvider {

	private final List<IResource> selectedResources;

	private final List<URI> selectedURIs;

	public ResourceLocationProvider(ISelection selection) {
		selectedResources = new ArrayList<IResource>();
		selectedURIs = new ArrayList<URI>();
		if (selection instanceof IStructuredSelection) {
			for (Object element : ((IStructuredSelection) selection).toList()) {
				if (element instanceof IResource) {
					selectedResources.add((IResource) element);
				} else if (element instanceof URI) {
					selectedURIs.add((URI) element);
				}
			}
		}
	}

	public List<IFile> getSelectedFiles(String extension) {
		if (extension == null) {
			return Collections.emptyList();
		}
		List<IFile> files = new ArrayList<IFile>();
		addFiles(files, selectedResources, extension);
		// add files from containers; they are at the end since directly selected files are more important
		addContainers(files, selectedResources, extension);
		return files;
	}

	protected void addFiles(List<IFile> files, List<? extends IResource> resources, String extension) {
		for (IResource resource : resources) {
			if (resource instanceof IFile && extension.equals(((IFile) resource).getFileExtension())) {
				files.add((IFile) resource);
			}
		}
	}

	protected void addContainers(List<IFile> files, List<? extends IResource> resources, String extension) {
		for (IResource resource : resources) {
			if (resource instanceof IContainer) {
				try {
					List<IResource> members = Arrays.asList(((IContainer) resource).members());
					addFiles(files, members, extension);
				} catch (CoreException ce) {
					// ignore
				}
			}
		}
	}

	public List<URI> getSelectedURIs(String extension) {
		if (extension == null) {
			return Collections.emptyList();
		}
		List<URI> uris = new ArrayList<URI>();
		for (URI uri : selectedURIs) {
			if (extension.equals(uri.fileExtension())) {
				uris.add(uri);
			}
		}
		// files follow uris since uris are more specific
		List<IFile> files = getSelectedFiles(extension);
		for (IFile file : files) {
			uris.add(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
		}
		return uris;
	}
}