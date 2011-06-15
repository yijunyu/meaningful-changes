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

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.internal.bridge.genmodel.BasicGenModelAccess;
import org.eclipse.gmf.internal.bridge.genmodel.DummyGenModel;
import org.eclipse.gmf.internal.bridge.genmodel.FileGenModelAccess;
import org.eclipse.gmf.internal.bridge.genmodel.GenModelAccess;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.gmf.mappings.Mapping;

/**
 * Interact with user to retrieve genmodel for the domain model. XXX detect
 * stale genmodels and reconcile them based on user's decision
 * 
 * @author artem
 */
public class GenModelDetector {
	private final Mapping myMapping;
	private GenModelAccess myGMAccess;
	private Collection<EPackage> myPackages;

	public GenModelDetector(Mapping mapping) {
		if (mapping == null) {
			throw new IllegalArgumentException("Could not detect with null Mapping");
		}
		myMapping = mapping;
	}
	
	public IStatus detect() {
		myPackages = findEPackages(myMapping);
		if (myPackages.isEmpty()) {
			myGMAccess = new GenModelAccess.Adapter(null);
			return Status.OK_STATUS;
		} else if (myPackages.size() == 1) {
			final EPackage solePack = myPackages.iterator().next();
			BasicGenModelAccess gma = new BasicGenModelAccess(solePack);
			gma.initDefault();
			return apply(gma);
		} else {
			return Plugin.createError(Messages.GenModelDetector_e_not_found, null);
		}
	}

	public IStatus advise(URI genModelURI) {
		if (genModelURI == null) {
			throw new IllegalArgumentException("Null GenModel URI");
		}
		GenModelAccess gma = new FileGenModelAccess(genModelURI);
		return apply(gma);
	}

	public IStatus advise(IFile workspaceFile) {
		if (workspaceFile == null) {
			throw new IllegalArgumentException("Null GenModel file");
		}
		GenModelAccess gma = new FileGenModelAccess(workspaceFile);
		return apply(gma);
	}
	
	private Collection<EPackage> findEPackages(Mapping mapping) {
		Collection<EPackage> packages = new HashSet<EPackage>();
		for (EObject next : EcoreUtil.ExternalCrossReferencer.find(mapping).keySet()) {
			if (next instanceof EClass) {
				packages.add(((EClass) next).getEPackage());
			}
		}
		for (Iterator<EPackage> it = packages.iterator(); it.hasNext();) {
			EPackage next = it.next();
			if (next.getESuperPackage() != null && EcoreUtil.isAncestor(packages, next.getESuperPackage())) {
				it.remove();
			}
		}
		return packages;
	}

	private IStatus apply(GenModelAccess gma) {
		IStatus load = gma.load(new ResourceSetImpl());
		if (load.isOK()) {
			gma.unload();
			myGMAccess = gma;
			return Status.OK_STATUS;
		} else {
			return load;
		}
	}
	
	private EPackage getPrimaryPackage() {
		if (myPackages == null || myPackages.size() == 0) {
			return null;
		}
		return myPackages.iterator().next();
	}
	
	public boolean canCreateDefault() {
		return myPackages != null && myPackages.size() == 1;
	}
	
	public URI createDefault(String pluginID, IFile patternResource) throws CoreException {
		DummyGenModel gma = new DummyGenModel(getPrimaryPackage(), null);
		gma.setPluginID(pluginID);
		GenModel model = gma.create();
		IPath path = patternResource.getFullPath().removeFileExtension().addFileExtension("genmodel"); //$NON-NLS-1$
		URI uri = URI.createPlatformResourceURI(path.toString(), true);
		Resource res = new ResourceSetImpl().createResource(uri, ContentHandler.UNSPECIFIED_CONTENT_TYPE);
		res.getContents().add(model);
		try {
			res.save(null);
			return uri;
		} catch (IOException ex) {
			IStatus error = Plugin.createError(Messages.GenModelDetector_e_save, ex);
			throw new CoreException(error);
		}
	}

	public GenModel get(ResourceSet resSet) {
		if (myGMAccess == null) {
			throw new IllegalStateException(Messages.GenModelDetector_e_no_genmodelaccess);
		}
		IStatus s = myGMAccess.load(resSet);
		if (!s.isOK()) {
			throw new IllegalStateException(s.getMessage());
		}
		return myGMAccess.model();
	}
	
}
