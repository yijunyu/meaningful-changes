/*
 * Copyright (c) 2005 Borland Software Corporation
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
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author artem
 */
public class BasicGenModelAccess implements GenModelAccess {
	private final EPackage model;

	private GenModel genModel;

	private final List/* <URI> */locations = new LinkedList();

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
		return (URI) EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(nsURI);
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
		for (Iterator/* <URI> */it = locations.iterator(); it.hasNext();) {
			try {
				URI uri = (URI) it.next();
				Resource r = rs.getResource(uri, false);
				needUnload = r == null || !r.isLoaded();
				r = rs.getResource(uri, true);
				if (r != null) {
					genModel = (GenModel) r.getContents().get(0);
					return Status.OK_STATUS;
				}
			} catch (WrappedException ex) {
				// FIXME collect into status
				System.err.println(ex.getMessage());
			}
		}
		needUnload = false;
		return Status.CANCEL_STATUS; // FIXME
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
		return createDummy(false, Collections.EMPTY_LIST);
	}

	public IStatus createDummy(boolean includeAllReferencedPackages, Collection/*<EPackage>*/ additionalPackages) {
		String pluginID = "org.sample." + model.getName();
		genModel = GenModelFactory.eINSTANCE.createGenModel();
		if (includeAllReferencedPackages) {
			HashSet allPacks = new HashSet();
			allPacks.add(model);
			allPacks.addAll(additionalPackages);
			// TODO override method in crossReferencer to get only EClasses
			Map m = EcoreUtil.ExternalCrossReferencer.find(model);
			for (Iterator it = m.keySet().iterator(); it.hasNext(); ) {
				Object next = it.next();
				if (next instanceof EClass) {
					allPacks.add(((EClass) next).getEPackage());
				}
			}
			genModel.initialize(allPacks);
		} else {
			genModel.initialize(Collections.singleton(model));
		}
		genModel.setModelName(model.getName() + "Gen");
		genModel.setModelPluginID(pluginID);
		genModel.setModelDirectory("/" + pluginID + "/src/");
		genModel.setEditDirectory(genModel.getModelDirectory());
		Resource r = new ResourceSetImpl().createResource(URI.createGenericURI("uri", pluginID, null));
		r.getContents().add(genModel);

		// need different prefix to avoid name collisions with code generated
		// for domain model
		
		for (Iterator it = genModel.getGenPackages().iterator(); it.hasNext();) {
			GenPackage genPackage = (GenPackage) it.next();
			genPackage.setPrefix(genPackage.getEcorePackage().getName() + "Gen");
		}
		return Status.OK_STATUS;
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
