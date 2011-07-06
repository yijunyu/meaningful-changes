/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards.pages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.provider.GMFGraphItemProviderAdapterFactory;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.NodeReference;
import org.eclipse.gmf.mappings.provider.GMFMapItemProviderAdapterFactory;
import org.eclipse.gmf.tooldef.ToolRegistry;
import org.eclipse.gmf.tooldef.provider.GMFToolItemProviderAdapterFactory;

/**
 * @author artem
 */
public abstract class WizardInput {

	public static final String TOOLDEF_FILE_EXT = "gmftool"; //$NON-NLS-1$
	public static final String GRAPHDEF_FILE_EXT = "gmfgraph"; //$NON-NLS-1$
	public static final String ECORE_FILE_EXT = "ecore"; //$NON-NLS-1$

	private Mapping mapInstance;
	private EditingDomain myEditingDomain;
	private AdapterFactory myAdapterFactory;
	private IFile myResultFile;
	private MapDefFeeder myFeeder;

	public AdapterFactory getAdapterFactory() {
		if (myAdapterFactory == null) {
			List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
			factories.add(new ResourceItemProviderAdapterFactory());
			factories.add(new GMFMapItemProviderAdapterFactory());
			factories.add(new GMFGraphItemProviderAdapterFactory());
			factories.add(new GMFToolItemProviderAdapterFactory());
			factories.add(new ReflectiveItemProviderAdapterFactory());
			myAdapterFactory = new ComposedAdapterFactory(factories);
		}
		return myAdapterFactory;
	}
	
	public EditingDomain getEditingDomain() {
		if (myEditingDomain == null) {
			myEditingDomain = new AdapterFactoryEditingDomain(getAdapterFactory(), new BasicCommandStack());
		}
		return myEditingDomain;
	}

	public ResourceSet getResourceSet() {
		return getEditingDomain().getResourceSet();
	}

	public abstract EPackage getDomainModel();

	public abstract Canvas getCanvasDef();

	public abstract ToolRegistry getToolDef();

	public abstract boolean isNewBlankToolDef();

	public void setMappingFile(IFile resultFile) {
//		if (myResultFile != null && resultFile != myResultFile) {
//			// perhaps, no reason to allow even 'touch'?
//			throw new IllegalStateException("Did't expect file to be chosen more than once");
//		}
		myResultFile = resultFile;
	}

	public IFile getMappingFile() {
		return myResultFile;
	}

	@SuppressWarnings("unchecked")
	public Mapping getMapping() {
		if (mapInstance == null) {
			mapInstance = GMFMapFactory.eINSTANCE.createMapping();
			URI res = URI.createPlatformResourceURI(getMappingFile().getFullPath().toString(), true);
			getResourceSet().createResource(res, ContentHandler.UNSPECIFIED_CONTENT_TYPE).getContents().add(mapInstance);
			CanvasMapping cm = GMFMapFactory.eINSTANCE.createCanvasMapping();
			mapInstance.setDiagram(cm);
		}
		return mapInstance;
	}

	public void selectCanvasElement(EClass eClass) {
		assert eClass.getEPackage() == getDomainModel();
		CanvasMapping cm = getMapping().getDiagram();
		cm.setDiagramCanvas(getCanvasDef());
		cm.setDomainMetaElement(eClass);
		cm.setDomainModel(eClass.getEPackage());
	}

	public void feedDefaultMapping() {
		myFeeder = new MapDefFeeder(this, createToolDefSupplier());
		myFeeder.feedDefaultMapping();
	}

	private ToolDefSupplier createToolDefSupplier() {
		if (isNewBlankToolDef()) {
			return new CreateToolDef(getToolDef());
		} else {
			return new ToolDefLookup(getToolDef());
		}
	}

	public NodeReference[] nodeCandidates() {
		return myFeeder.getInitialNodes();
	}

	public LinkMapping[] linkCandidates() {
		return myFeeder.getInitialLinks();
	}
}
