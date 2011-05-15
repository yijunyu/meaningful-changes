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

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap;
import org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;
import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureAccessor;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.FigureHandle;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.gmfgraph.util.FigureQualifiedNameSwitch;
import org.eclipse.gmf.gmfgraph.util.RuntimeFQNSwitch;
import org.eclipse.gmf.graphdef.codegen.FigureGenerator;
import org.eclipse.gmf.graphdef.codegen.MapModeCodeGenStrategy;
import org.eclipse.gmf.graphdef.codegen.NamingStrategy;
import org.eclipse.gmf.internal.common.codegen.NullImportAssistant;

/**
 * Stateful. Don't reuse.
 * @author artem
 */
public class InnerClassViewmapProducer extends DefaultViewmapProducer {

	private final FigureGenerator figureGenerator;
	private final FigureQualifiedNameSwitch fqnSwitch;
	private final Set<Figure> processedFigures;

	public InnerClassViewmapProducer() {
		this(new RuntimeFQNSwitch(), MapModeCodeGenStrategy.DYNAMIC, null);
	}

	public InnerClassViewmapProducer(FigureQualifiedNameSwitch figureNameSwitch, MapModeCodeGenStrategy mapModeCodeGenStrategy, URL[] dynamicFigureTemplates) {
		assert figureNameSwitch != null;
		fqnSwitch = figureNameSwitch;
		processedFigures = new HashSet<Figure>();
		figureGenerator = new FigureGenerator(fqnSwitch, mapModeCodeGenStrategy, null, true, dynamicFigureTemplates);
	}

	public Viewmap create(Node node) {
		if (node.getFigure() == null) {
			return super.create(node);
		}
		final Viewmap viewmap = createViewmap(node.getNodeFigure());
		setupResizeConstraints(viewmap, node);
		setupLayoutType(viewmap, node);
		setupDefaultSize(viewmap, node);
		return viewmap;
	}
	
	public Viewmap create(Connection link) {
		if (link.getFigure() == null) {
			return super.create(link);
		}
		return createViewmap(link.getConnectionFigure());
	}

	public Viewmap create(DiagramLabel label) {
		if (label.getFigure() == null) {
			return super.create(label);
		}
		return createViewmap(label.getFigure());
	}
	
	public Viewmap create(Compartment compartment) {
		FigureHandle handle = compartment.getFigure();
		if (handle == null){
			return super.create(compartment);
		}
		return createViewmap(compartment.getFigure());
	}
	
	private Viewmap createFigureViewmap(Figure figure) {
		Viewmap result;
		if (EcoreUtil.isAncestor(processedFigures, figure.getParent())) {
			// we generated code for parent, thus (if figure generation logic not changed)
			// all inner figures were generated as well (with accessors), thus, everything
			// we need here is just reference one
			ParentAssignedViewmap v = GMFGenFactory.eINSTANCE.createParentAssignedViewmap();
			// XXX yet another assumption - getter name
			// FIXME introduce feedback to FigureGenerator to let us know exact names
			v.setGetterName(NamingStrategy.INSTANCE.getChildFigureGetterName(figure));
			v.setFigureQualifiedClassName(fqnSwitch.get(figure));
			result = v;
		} else {
			if (isBareInstance(figure)) {
				FigureViewmap v = GMFGenFactory.eINSTANCE.createFigureViewmap();
				v.setFigureQualifiedClassName(fqnSwitch.get(figure));
				result = v;
				// XXX perhaps, create SnippetViewmap when there are no children but some props
			} else {
				InnerClassViewmap v = GMFGenFactory.eINSTANCE.createInnerClassViewmap();
				ImportAssistant importManager = new NullImportAssistant(null, CodeGenUtil.validJavaIdentifier(figure.getName())); 
				v.setClassBody(figureGenerator.go(figure, importManager));
				v.setClassName(importManager.getCompilationUnitName());
				result = v;
			}
		}
		if (false == result instanceof ParentAssignedViewmap) {
			setupPluginDependencies(result, figure);
		} // otherwise, dependencies are already there
		processedFigures.add(figure);
		return result;
	}

	private Viewmap createViewmap(FigureHandle figure) {
		Viewmap result;
		if (figure instanceof Figure) {
			result = createFigureViewmap((Figure) figure);
		} else if (figure instanceof FigureAccessor) {
			result = createFigureAccessorViewmap((FigureAccessor) figure);
		} else {
			throw new IllegalStateException();
		}
		setupStyleAttributes(result, figure);
		return result;
	}

	private Viewmap createFigureAccessorViewmap(FigureAccessor figureAccess) {
		ParentAssignedViewmap v = GMFGenFactory.eINSTANCE.createParentAssignedViewmap();
		v.setGetterName(figureAccess.getAccessor());
		if (figureAccess.getTypedFigure() != null) {
			v.setFigureQualifiedClassName(figureAccess.getTypedFigure().getQualifiedClassName());
		}
		return v;
	}
	
	@SuppressWarnings("unchecked")
	private void setupPluginDependencies(Viewmap viewmap, Figure figure){
		FigureGallery gallery = findAncestorFigureGallery(figure);
		if (gallery != null){
			viewmap.getRequiredPluginIDs().addAll(Arrays.asList(fqnSwitch.getDependencies(gallery)));
		}
	}
	
	public static FigureGallery findAncestorFigureGallery(Figure figure){
		EObject current = figure;
		while (true){
			EObject next = current.eContainer();
			if (next instanceof Figure){
				current = next;
			} else if (next instanceof FigureGallery){
				return (FigureGallery)next;
			} else {
				return null;
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static boolean isBareInstance(Figure figure){
		if (!figure.getChildren().isEmpty()) {
			return false;
		}
		final Collection<EStructuralFeature> featuresToCheck = new LinkedList<EStructuralFeature>(figure.eClass().getEAllStructuralFeatures());
		featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getIdentity_Name());
		featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getFigure_Children());
		featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getFigureMarker_Parent());
		featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getFigureHandle_ReferencingElements());
		if (figure instanceof CustomFigure) {
			featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getCustomClass_BundleName());
			featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getCustomClass_QualifiedClassName());
			featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getCustomFigure_CustomChildren());
		}
		for(Iterator it = featuresToCheck.iterator(); it.hasNext();) {
			final EStructuralFeature next = (EStructuralFeature) it.next();
			if (next.isDerived()) {
				continue;
			}
			if (figure.eIsSet(next)) {
				return false;
			}
		}
		return true;
	}
}