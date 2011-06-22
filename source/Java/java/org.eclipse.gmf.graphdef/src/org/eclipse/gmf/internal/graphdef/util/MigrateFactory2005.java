/*
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.graphdef.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.DiagramElement;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureAccessor;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.RealFigure;
import org.eclipse.gmf.internal.common.ToolingResourceFactory;
import org.eclipse.gmf.internal.common.migrate.FilteringCopier;
import org.eclipse.gmf.internal.common.migrate.Messages;
import org.eclipse.gmf.internal.common.migrate.MigrationResource;

/**
 * This is a complete rework of old XML-based MigrationDelegate,
 * to handle migration of gmfgraph resources of year 2005 to the
 * version of year 2007, using dynamic meta-model for old one. 
 * @author artem
 */
public class MigrateFactory2005 extends ToolingResourceFactory {
	private static final Object MIGRATION_IN_PROGRESS = "gmf.migration";
	private static final Object MIGRATION_PARTICIPANTS = "gmf.migration.resources";
	private static final String OLD_NS_URI = "http://www.eclipse.org/gmf/2005/GraphicalDefinition";

	@Override
	public Resource createResource(URI uri) {
		ToolResource r = (ToolResource) super.createResource(uri);
		r.getDefaultLoadOptions().put(XMLResource.OPTION_RESOURCE_HANDLER, new BasicResourceHandler() {
			
			@Override
			public void postLoad(XMLResource resource, InputStream inputStream, Map<?, ?> options) {
				// when modifying, can't use passed options as they represent merged value of rs options and default resource options
				if (Boolean.TRUE.equals(options.get(MIGRATION_IN_PROGRESS))) {
					@SuppressWarnings("unchecked") 
					List<XMLResource> participants = (List<XMLResource>) resource.getResourceSet().getLoadOptions().get(MIGRATION_PARTICIPANTS);
					participants.add(resource);
					return;
				}
				try {
					resource.getResourceSet().getLoadOptions().put(MIGRATION_IN_PROGRESS, Boolean.TRUE);
					final LinkedList<XMLResource> participants = new LinkedList<XMLResource>();
					participants.add(resource);
					resource.getResourceSet().getLoadOptions().put(MIGRATION_PARTICIPANTS, participants);
					for (EObject o : resource.getContents()) {
						if (isOfInterest(o)) {
							// trigger load of all resorces while migration-in-progress flag is set
							// and no actual migration happens 
							EcoreUtil.resolveAll(o);
						}
					}
					// collect all objects for migration
					Map<EObject, EObject> wholeMigration = new HashMap<EObject, EObject>();
					for (XMLResource r : participants) {
						for (EObject o : r.getContents()) {
							if (isOfInterest(o)) {
								wholeMigration.put(o, null);
							}
						}
					}
					migrate2005to2006(wholeMigration);
					// update migrated elements in their respective resources
					for (XMLResource r : participants) {
						LinkedList<EObject> migrated = new LinkedList<EObject>();
						for (EObject o : r.getContents()) {
							EObject m = wholeMigration.get(o);
							if (m != null) {
								migrated.add(m);
								r.getWarnings().add(0, MigrationResource.createMessageDiagnostic(r, Messages.oldModelVersionLoadedMigrationRequired));
							} else {
								migrated.add(o);
							}
						} 
						r.getContents().clear();
						r.getContents().addAll(migrated);
					}
				} finally {
					resource.getResourceSet().getLoadOptions().remove(MIGRATION_IN_PROGRESS);
					resource.getResourceSet().getLoadOptions().remove(MIGRATION_PARTICIPANTS);
				}
			}

			private boolean isOfInterest(EObject o) {
				return o != null && OLD_NS_URI.equals(o.eClass().getEPackage().getNsURI());
			}
		});
		return r;
	}

	private void migrate2005to2006(Map<EObject, EObject> original2migrated) {
		final EPackage oldModel = EPackage.Registry.INSTANCE.getEPackage(OLD_NS_URI);
		final EClass oldFigureClass = (EClass) oldModel.getEClassifier("Figure");
		final EClass oldFigureAccessorClass = (EClass) oldModel.getEClassifier("FigureAccessor");
		final EStructuralFeature deFigure = ((EClass) oldModel.getEClassifier("DiagramElement")).getEStructuralFeature("figure");
		final EStructuralFeature fhReferencingElements = ((EClass) oldModel.getEClassifier("FigureHandle")).getEStructuralFeature("referencingElements");
		final EStructuralFeature identityName = ((EClass) oldModel.getEClassifier("Identity")).getEStructuralFeature("name");
		final EStructuralFeature figureChildren = oldFigureClass.getEStructuralFeature("children");
		final EStructuralFeature faTypedFigure = oldFigureAccessorClass.getEStructuralFeature("typedFigure");

		FilteringCopier cc = new FilteringCopier(false, false, GMFGraphPackage.eINSTANCE);
		cc.ignore(((EClass) oldModel.getEClassifier("CustomClass")).getEStructuralFeature("bundleName"));
		cc.ignore(deFigure);
		cc.ignore(fhReferencingElements);
		cc.ignoreIn(identityName, oldFigureClass);
		cc.ignore(faTypedFigure);
		cc.substitute(figureChildren, GMFGraphPackage.eINSTANCE.getRealFigure_Children());

		cc.copyAll(original2migrated.keySet());
		cc.copyReferences();

		for (EObject fa : cc.getIgnoredOwners(faTypedFigure)) {
			EObject oldReferencedFigure = (EObject) fa.eGet(faTypedFigure);
			if (oldReferencedFigure == null) {
				// typedFigure reference was optional, became mandatory,
				// need to create a bare figure to hold value  
				// @see MigrationDelegate#getOrCreateTypedFigure
				CustomFigure custom = GMFGraphFactory.eINSTANCE.createCustomFigure();
				custom.setQualifiedClassName("org.eclipse.draw2d.IFigure"); //$NON-NLS-1$
				((FigureAccessor) cc.get(fa)).setTypedFigure(custom);
				continue;
			}
			if (oldReferencedFigure.eIsProxy()) {
				oldReferencedFigure = EcoreUtil.resolve(oldReferencedFigure, fa);
			}
			EObject newFigure = cc.get(oldReferencedFigure);
			if (newFigure == null) {
				continue;
			}
			assert !newFigure.eIsProxy(); // how come freshly copied newFigure may be a proxy? 
			EObject copy = EcoreUtil.copy(newFigure);
			if (copy instanceof RealFigure) { // sanity, typedFigure can't be anything but CustomFigure
				((FigureAccessor) cc.get(fa)).setTypedFigure((RealFigure) copy);
			}
		}
		final EClass oldFigureGalleryClass = (EClass) oldModel.getEClassifier("FigureGallery");
		final Map<EObject, FigureDescriptor> oldFigure2newDescriptor = new HashMap<EObject, FigureDescriptor>();
		final Map<EObject, ChildAccess> oldFigureAccessor2newChildAccess = new HashMap<EObject, ChildAccess>();
		for (EObject fh : cc.getIgnoredOwners(fhReferencingElements)) {
			List<?> de = (List<?>) fh.eGet(fhReferencingElements);
			if (de.isEmpty()) {
				// in original migration code, similar effect (not-referenced 
				// figures are not migrated to FigureDescriptor) was achieved
				// as there happen to be no 'referencedElement' tag in a gmfgraph
				// file, and hence, migrateFigureStructureToDescriptor() wasn't invoked
				continue;
			}
			if (!oldFigureClass.isInstance(fh) && !oldFigureAccessorClass.isInstance(fh)) {
				// no more known subclasses of FigureHandle
				assert false;
				continue;
			}
			EObject topLevel = fh;
			while (topLevel != null && !oldFigureGalleryClass.isInstance(topLevel.eContainer())) {
				topLevel = topLevel.eContainer();
			}
			if (topLevel == null) {
				assert false; // can't happen
				continue;
			}
			initFigureDescriptor(cc, topLevel, fh, oldFigure2newDescriptor, oldFigureAccessor2newChildAccess);
		}
		for (EObject de : cc.getIgnoredOwners(deFigure)) {
			final Object fh = de.eGet(deFigure); 
			if (false == fh instanceof EObject) {
				continue;
			}
			EObject oldFigure = (EObject) fh;
			if (oldFigure.eIsProxy()) {
				oldFigure = EcoreUtil.resolve(oldFigure, de);
				if (oldFigure.eIsProxy()) { // failed to resolve proxy
					continue;
				}
			}
			// oldFigure is either subclass of Figure or FigureAccessor
			if (!oldFigureClass.isInstance(oldFigure) && !oldFigureAccessorClass.isInstance(oldFigure)) {
				assert false;
				continue;
			}
			EObject topLevel = oldFigure;
			while (topLevel != null && !oldFigureGalleryClass.isInstance(topLevel.eContainer())) {
				topLevel = topLevel.eContainer();
			}
			if (topLevel == null) {
				assert false;
				continue;
			}
			if (!oldFigure2newDescriptor.containsKey(topLevel)) {
				// though all *correct* figures should already be migrated,
				// there might be a figure without referencedElements set, 
				// hence, may need to migrate it anyway
				initFigureDescriptor(cc, topLevel, oldFigure, oldFigure2newDescriptor, oldFigureAccessor2newChildAccess);
			}
			FigureDescriptor fd = oldFigure2newDescriptor.get(topLevel);
			final DiagramElement newDE = (DiagramElement) cc.get(de);
			newDE.setFigure(fd);
			if (topLevel != oldFigure) {
				// child access, MigrationDelegate#setNestedFigureAccessFor
				ChildAccess access = oldFigureAccessor2newChildAccess.get(oldFigure);
				if (access == null) {
					// assert false; // XXX create new one?
					continue;
				}
				if (newDE instanceof DiagramLabel) {
					((DiagramLabel) newDE).setAccessor(access);
				} else if (newDE instanceof Compartment) {
					((Compartment) newDE).setAccessor(access);
				}
			}
		}
		for (EObject i : cc.getIgnoredOwners(identityName)) {
			if (cc.get(i) instanceof RealFigure && i.eIsSet(identityName)) {
				// in old model, name feature came from Identity class,
				// while in the new model, name feature is RealFigure's attribute.
				// Copier#getTarget(EStructuralFeature) logic is not suited to 
				// find new feature owners yet, using feature.getEContainingClass()
				// for simplicity now, hence can't get appropriate new EStrFea.
				((RealFigure) cc.get(i)).setName((String) i.eGet(identityName));
			}
		}
		// map original elements to their respective copies
		for (EObject o : new LinkedList<EObject>(original2migrated.keySet())) {
			original2migrated.put(o, cc.get(o));
		}
	}

	private void initFigureDescriptor(FilteringCopier cc, EObject topLevel, EObject fh, Map<EObject, FigureDescriptor> oldFigure2newDescriptor, Map<EObject, ChildAccess> oldFigureAccessor2newChildAccess) {
		FigureDescriptor fd = oldFigure2newDescriptor.get(topLevel);
		if (fd == null) {
			fd = GMFGraphFactory.eINSTANCE.createFigureDescriptor();
			fd.setActualFigure((RealFigure) cc.get(topLevel));
			fd.setName((String) topLevel.eGet(topLevel.eClass().getEStructuralFeature("name")));
			oldFigure2newDescriptor.put(topLevel, fd);
			EObject figureGallery = topLevel.eContainer();
			((FigureGallery) cc.get(figureGallery)).getDescriptors().add(fd);
		}
		if (topLevel != fh && !oldFigureAccessor2newChildAccess.containsKey(fh)) {
			ChildAccess a = GMFGraphFactory.eINSTANCE.createChildAccess();
			final EClass oldFigureAccessorClass = (EClass) topLevel.eClass().getEPackage().getEClassifier("FigureAccessor");
			if (oldFigureAccessorClass.isInstance(fh)) {
				FigureAccessor fa = (FigureAccessor) cc.get(fh);
				if (fa != null) {
					a.setFigure(fa.getTypedFigure());
				}
			} else {
				a.setFigure((Figure) cc.get(fh));
			}
			oldFigureAccessor2newChildAccess.put(fh, a);
			fd.getAccessors().add(a);
		}
	}
}
