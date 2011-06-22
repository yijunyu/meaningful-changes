/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 *    Alexander Fedorov (Borland) - #148836 - transform action as wizard
 */
package org.eclipse.gmf.internal.bridge.transform;

import java.text.MessageFormat;
import java.util.Date;
import java.util.HashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.internal.bridge.ui.Plugin;

/**
 * @author artem
 */
public class StaleGenModelDetector {

	private final GenModel myGenModel;

	public StaleGenModelDetector(GenModel genModel) {
		if (genModel == null) {
			throw new IllegalArgumentException("Could not detect with null GenModel");
		}
		myGenModel = genModel;
	}

	/**
	 * Uses local time stamp to detect staleness, though would be better to use IResource#modificationStamp 
	 * to tell whether resource has changed or not  
	 * @return warning status if staleness detected, ok otherwise.
	 */
	public IStatus detect() {
		if (myGenModel.eResource() == null) {
			return Status.OK_STATUS;
		}
		URI genModelURI = myGenModel.eResource().getURI();
		if (!isFileURI(genModelURI)) {
			return Status.OK_STATUS;
		}
		HashSet<URI> ecoreURIs = new HashSet<URI>(); 
		for (GenPackage next : myGenModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
			if (next.getEcorePackage().eResource() != null) {
				final URI uri = next.getEcorePackage().eResource().getURI();
				if (isFileURI(uri)) {
					// check only file uris
					// though we don't check non-file uris, it's not bad to make sure at least  
					// files are up to date
					ecoreURIs.add(uri);
				}
			}
		}
		Date genModelTimeStamp = timestamp(genModelURI);
		for (URI uri : ecoreURIs) {
			Date ts = timestamp(uri);
			/* HACK
			 * @see ModelImporter#saveGenModelAndEPackages
			 * saves both ecore and genmodel files regardless of the fact .ecore was not modified,
			 * hence, we adjust the timestamp to avoid false stale detection
			 */
			if (new Date(genModelTimeStamp.getTime() + 3000).before(ts)) {
				String format = Messages.StaleGenModelDetector_stale;
				String msg = MessageFormat.format(format, uri, ts, genModelTimeStamp);
				return Plugin.createWarning(msg);
			}
		}
		return Status.OK_STATUS;
	}

	private static boolean isFileURI(URI uri) {
		return "platform".equals(uri.scheme()) && "resource".equals(uri.segment(0)); //$NON-NLS-1$ //$NON-NLS-2$
	}

	private static Date timestamp(URI uri) {
		IFile f = getFile(uri);
		if (!f.exists()) {
			return new Date(0);
		}
		return new Date(f.getLocalTimeStamp());
	}

	private static IFile getFile(URI platformFileUri) {
		IPath p = new Path(platformFileUri.path()).removeFirstSegments(1);
		return ResourcesPlugin.getWorkspace().getRoot().getFile(p);
	}
	
}
