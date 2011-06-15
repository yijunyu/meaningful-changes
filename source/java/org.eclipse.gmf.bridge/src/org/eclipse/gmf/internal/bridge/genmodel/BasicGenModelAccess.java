/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.genmodel;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @author artem
 */
public class BasicGenModelAccess implements GenModelAccess {
	private final EPackage model;

	private GenModel genModel;

	private final List<URI> locations = new LinkedList<URI>();

	private boolean needUnload;

	public BasicGenModelAccess(EPackage aModel) {
		this.model = aModel;
	}

	public void initDefault() {
		registerLocation(constructDefaultFromModel());
		registerLocation(fromExtpoint());
	}

	protected final URI fromExtpoint() {
		return fromExtpoint(model.getNsURI());
	}

	/**
	 * Useful when nsURI changed over time to reference old URI of the model.
	 * Otherwise {@link #fromExtpoint()} is enough.
	 * 
	 * @param nsURI
	 * @return uri registered in ecore's extpoint, if any
	 */
	protected final URI fromExtpoint(String nsURI) {
		return EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(nsURI);
	}

	protected final URI constructDefaultFromModel() {
		if (model.eResource() == null || model.getNsURI() == null) {
			return null;
		}
		URI domainModelURI = model.eResource().getURI();
		if (model.getNsURI().equals(domainModelURI.toString())) {
			return null;
		}
		URI genModelURI = domainModelURI.trimFileExtension().appendFileExtension("genmodel");
		if (genModelURI.equals(domainModelURI)) {
			return null;
		}
		// XXX should keep distinct resourceSet with URI to use different rs
		// while loading?
		/*
		 * //
		 * 
		 * @see org.eclipse.emf.importer.ModelImporter.getExternalGenModels()
		 *      Resource genModelResource = rs.getResource(genModelURI, false);
		 *      if (genModelResource == null) { genModelResource =
		 *      rs.getResource(genModelURI, true); if (genModelResource != null) {
		 *      return (GenModel) genModelResource.getContents().get(0); } }
		 */
		return genModelURI;
	}

	protected final EPackage original() {
		return model;
	}

	public GenModel model() {
		// if genModel == null load()?
		return genModel;
	}

	public IStatus ensure() {
		IStatus loadStatus = load();
		if (loadStatus.isOK()) {
			return loadStatus;
		}
		return createDummy();
	}

	public IStatus load() {
		ResourceSet rs = model.eResource() == null || model.eResource().getResourceSet() == null ? new ResourceSetImpl() : model.eResource().getResourceSet();
		return load(rs);
	}

	public IStatus load(ResourceSet rs) {
		assert !locations.isEmpty(); // XXX if isEmpty() initDefault?

		List<IStatus> exceptions = new LinkedList<IStatus>();
		final String id = "org.eclipse.gmf.bridge"; //$NON-NLS-1$
		for (URI uri : locations) {
			try {
				Resource r = rs.getResource(uri, false);
				needUnload = r == null || !r.isLoaded();
				r = rs.getResource(uri, true);
				if (r != null) {
					genModel = (GenModel) r.getContents().get(0);
					return Status.OK_STATUS;
				}
			} catch (WrappedException ex) {
				exceptions.add(new Status(IStatus.ERROR, id, ex.getMessage(), ex.getCause()));
			}
		}
		needUnload = false;
		if (exceptions.isEmpty()) {
			return Status.CANCEL_STATUS;
		}
		IStatus[] sa = exceptions.toArray(new IStatus[exceptions.size()]);
		return new MultiStatus(id, 0, sa, "Problems while loading GenModel", null); //$NON-NLS-1$
	}

	/**
	 * Use with care, model elements obtained earlier will become proxies.
	 */
	public void unload() {
		if (needUnload && genModel != null) {
			genModel.eResource().unload();
			genModel = null;
		}
		needUnload = false;
	}

	public IStatus createDummy() {
		return createDummy(null);
	}

	public IStatus createDummy(Collection<EPackage> additionalPackages) {
		genModel = new DummyGenModel(model, additionalPackages).create();
		confineInResource();
		return Status.OK_STATUS;
	}

	private void confineInResource() {
		Resource r = new ResourceSetImpl().createResource(URI.createGenericURI("uri", genModel.getModelPluginID(), null));
		r.getContents().add(genModel);
	}

	public boolean hasLocations() {
		return locations != null && !locations.isEmpty();
	}

	protected void registerLocation(URI location) {
		if (location != null) {
			locations.add(location);
		}
	}

	protected void unregsiterLocation(URI location) {
		locations.remove(location);
	}
}
