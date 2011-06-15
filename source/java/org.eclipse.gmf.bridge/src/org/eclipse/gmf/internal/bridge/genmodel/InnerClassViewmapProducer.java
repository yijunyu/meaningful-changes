/*
 * Copyright (c) 2005, 2008 Borland Software Corporation
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
import java.util.LinkedHashSet;
import java.util.LinkedList;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap;
import org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;
import org.eclipse.gmf.gmfgraph.Border;
import org.eclipse.gmf.gmfgraph.BorderRef;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.CompoundBorder;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.CustomBorder;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.CustomLayout;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.FigureRef;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.LayoutRef;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.gmfgraph.RealFigure;
import org.eclipse.gmf.gmfgraph.util.FigureQualifiedNameSwitch;
import org.eclipse.gmf.gmfgraph.util.RuntimeFQNSwitch;
import org.eclipse.gmf.gmfgraph.util.RuntimeLiteFQNSwitch;
import org.eclipse.gmf.graphdef.codegen.FigureGenerator;
import org.eclipse.gmf.graphdef.codegen.MapModeCodeGenStrategy;

/**
 * @author artem
 */
public class InnerClassViewmapProducer extends DefaultViewmapProducer {

	private final FigureGenerator figureGenerator;
	private final FigureQualifiedNameSwitch fqnSwitch;

	public InnerClassViewmapProducer() {
		this(null, MapModeCodeGenStrategy.DYNAMIC, null);
	}

	public InnerClassViewmapProducer(String runtimeToken, MapModeCodeGenStrategy mapModeCodeGenStrategy, URL[] dynamicFigureTemplates) {
		// FIXME get rid of fqnSwitch altogether
		this.fqnSwitch = "lite".equalsIgnoreCase(runtimeToken) ? new RuntimeLiteFQNSwitch() : new RuntimeFQNSwitch();
		figureGenerator = new FigureGenerator(runtimeToken, null, mapModeCodeGenStrategy, null, true, dynamicFigureTemplates);
	}

	@Override
	public Viewmap create(Node node) {
		if (node.getFigure() == null) {
			return super.create(node);
		}
		final Viewmap viewmap = createViewmap(node.getFigure());
		setupResizeConstraints(viewmap, node);
		setupLayoutType(viewmap, node);
		setupDefaultSize(viewmap, node);
		return viewmap;
	}
	
	@Override
	public Viewmap create(Connection link) {
		if (link.getFigure() == null) {
			return super.create(link);
		}
		return createViewmap(link.getFigure());
	}

	@Override
	public Viewmap create(DiagramLabel diagramLabel) {
		if (diagramLabel.getFigure() == null) {
			return super.create(diagramLabel);
		}
		if (diagramLabel.getAccessor() == null) {
			return createViewmap(diagramLabel.getFigure());
		} else {
			return createViewmap(diagramLabel.getFigure(), diagramLabel.getAccessor());
		}
	}
	
	@Override
	public Viewmap create(Compartment compartment) {
		if (compartment.getFigure() == null){
			return super.create(compartment);
		}
		if (compartment.getAccessor() == null) {
			return createViewmap(compartment.getFigure());
		} else {
			return createViewmap(compartment.getFigure(), compartment.getAccessor());
		}
	}

	private Viewmap createViewmap(FigureDescriptor figureDescriptor) {
		Viewmap result;
		if (figureDescriptor.getActualFigure() == null) {
			throw new NullPointerException();
		}
		final Figure figure = figureDescriptor.getActualFigure();
		if (figure instanceof RealFigure && isBareInstance((RealFigure) figure)) {
			FigureViewmap v = GMFGenFactory.eINSTANCE.createFigureViewmap();
			v.setFigureQualifiedClassName(figureGenerator.fqnSwitch(figure));
			result = v;
			// XXX perhaps, create SnippetViewmap when there are no children but some props
		} else {
			InnerClassViewmap v = GMFGenFactory.eINSTANCE.createInnerClassViewmap();
			v.setClassBody(figureGenerator.go(figureDescriptor));
			v.setClassName(getCompilationUnitName(figureDescriptor));
			result = v;
		}
		setupPluginDependencies(result, figureDescriptor.getActualFigure());
		setupStyleAttributes(result, figureDescriptor.getActualFigure());
		return result;
	}

	private Viewmap createViewmap(FigureDescriptor owner, ChildAccess labelAccess) {
		ParentAssignedViewmap v = GMFGenFactory.eINSTANCE.createParentAssignedViewmap();
		v.setGetterName(labelAccess.getAccessor());
		v.setFigureQualifiedClassName(figureGenerator.fqnSwitch(labelAccess.getFigure()));
		setupStyleAttributes(v, labelAccess.getFigure());
		return v;
	}

	// XXX shouldn't that reside in superclass - 
	// use of fqnSwitch is questionable anyway, for all but first gallery
	// we don't need to delegate to switch, and should rather use 
	// implementationBundle field directly (though that's true only
	// if borders and layouts are from another FG, if there are FigureRefs,
	// delegating to fqnSwitch to find out dependencies may be reasonable)
	private void setupPluginDependencies(Viewmap viewmap, Figure figure){
		LinkedHashSet<String> allRequired = new LinkedHashSet<String>();
		for (FigureGallery gallery : findAllGalleriesForImport(figure)) {
			allRequired.addAll(Arrays.asList(fqnSwitch.getDependencies(gallery)));
		}
		viewmap.getRequiredPluginIDs().addAll(allRequired);
	}

	// public to have access from tests. FIXME may need extra check for endless
	// recursion (like CompoundBorder.outer = BorderRef which points to same CompoundBorder)
	public static Collection<FigureGallery> findAllGalleriesForImport(Figure figure) {
		LinkedHashSet<FigureGallery> rv = new LinkedHashSet<FigureGallery>();
		rv.add(findAncestorFigureGallery(figure));
		LinkedList<Figure> queue = new LinkedList<Figure>();
		queue.add(figure);
		do {
			final RealFigure fig;
			if (queue.peek() instanceof RealFigure) {
				fig = (RealFigure) queue.removeFirst();
			} else if (queue.peek() instanceof FigureRef) {
				fig = ((FigureRef) queue.removeFirst()).getFigure();
			} else {
				assert false; // no more known subclasses of Figure at the time.
				queue.removeFirst();
				continue;
			}
			if (fig.getLayout() instanceof LayoutRef && ((LayoutRef) fig.getLayout()).getActual() instanceof CustomLayout) {
				rv.add(findAncestorFigureGallery(((LayoutRef) fig.getLayout()).getActual()));
			}
			if (fig.getBorder() != null) {
				LinkedList<Border> borderQueue = new LinkedList<Border>();
				borderQueue.add(fig.getBorder());
				do {
					if (borderQueue.peek() instanceof BorderRef) {
						borderQueue.add(((BorderRef) borderQueue.peek()).getActual());
					} else if (borderQueue.peek() instanceof CompoundBorder) {
						CompoundBorder b = (CompoundBorder) borderQueue.peek();
						borderQueue.addLast(b.getInner());
						borderQueue.addLast(b.getOuter());
					} else if (borderQueue.peek() instanceof CustomBorder) {
						rv.add(findAncestorFigureGallery(borderQueue.peek()));
					}
					borderQueue.removeFirst(); // effectively removes any null value as well
				} while (!borderQueue.isEmpty());
			}
			queue.addAll(fig.getChildren());
		} while (!queue.isEmpty());
		rv.remove(null);
		return rv;
	}

	public static FigureGallery findAncestorFigureGallery(EObject figure){
		EObject current = figure;
		while (true){
			EObject next = current.eContainer();
			if (next == null){
				return null;
			} else if (next instanceof FigureGallery){
				return (FigureGallery)next;
			} else {
				current = next;
			}
		}
	}

	private static String getCompilationUnitName(FigureDescriptor fd) {
		// XXX either use Util.ext or have some template to invoke
		return CodeGenUtil.validJavaIdentifier(CodeGenUtil.capName(fd.getName()));
	}

	private static boolean isBareInstance(RealFigure figure) {
		if (!figure.getChildren().isEmpty()) {
			return false;
		}
		final Collection<EStructuralFeature> featuresToCheck = new LinkedList<EStructuralFeature>(figure.eClass().getEAllStructuralFeatures());
		featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getRealFigure_Name());
		featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getRealFigure_Children());
		if (figure instanceof CustomFigure) {
			featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getCustomClass_QualifiedClassName());
			featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getCustomFigure_CustomChildren());
		}
		for (EStructuralFeature next : featuresToCheck) {
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
