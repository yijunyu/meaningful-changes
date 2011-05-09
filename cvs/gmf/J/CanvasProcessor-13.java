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
 */
package org.eclipse.gmf.internal.graphdef.codegen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.gmfgraph.util.FigureQualifiedNameSwitch;
import org.eclipse.gmf.graphdef.codegen.StandaloneGenerator.Config;
import org.eclipse.gmf.graphdef.codegen.StandaloneGenerator.Processor;
import org.eclipse.gmf.graphdef.codegen.StandaloneGenerator.ProcessorCallback;

public class CanvasProcessor extends Processor {
	private final DiagramElementsCopier myElementCopier;
	private ProcessorCallback myCallback;
	final Canvas myInput;
	private Canvas myOutcome;
	private FigureGallery myOutcomeGallery; 

	public CanvasProcessor(Canvas input) {
		assert input != null;
		myInput = input;
		myElementCopier = new DiagramElementsCopier();
	}

	public Canvas getOutcome() {
		return myOutcome;
	}

	public void go(ProcessorCallback callback, Config config) throws InterruptedException {
		myCallback = callback;
		myOutcomeGallery = GMFGraphFactory.eINSTANCE.createFigureGallery();
		myOutcomeGallery.setName(myInput.getFigures().size() == 1 ? myInput.getFigures().get(0).getName() : "GeneratedGallery");
		// TODO respect implementation from original FigureGallery, see (#x#) 
		myOutcomeGallery.setImplementationBundle(config.getPluginID());
		handleNodes();
		handleLinks();
		handleCompartments();
		handleLabels();
		// can't use 
		// = (Canvas) diagramElementCopier.copy(myInput);
		// here because Copier.copy doesn't respect already copied elements
		myOutcome = GMFGraphFactory.eINSTANCE.createCanvas();
		myOutcome.setName(myInput.getName());
		myOutcome.getFigures().add(myOutcomeGallery);

		myOutcome.getCompartments().addAll(myElementCopier.copyAll(myInput.getCompartments()));
		myOutcome.getLabels().addAll(myElementCopier.copyAll(myInput.getLabels()));
		myOutcome.getNodes().addAll(myElementCopier.copyAll(myInput.getNodes()));
		myOutcome.getConnections().addAll(myElementCopier.copyAll(myInput.getConnections()));

		if (!myOutcome.eContents().isEmpty()) {
			myElementCopier.copyReferences();
		}
		myCallback = null;
	}

	public String[] getRequiredBundles(FigureQualifiedNameSwitch fqnSwitch) {
		HashSet<String> rv = new HashSet<String>();
		for (FigureGallery next : myInput.getFigures()) {
			if (next.getImplementationBundle() != null && next.getImplementationBundle().trim().length() > 0) {
				// need this for a while, though this should be done in the fqnswitch. But as I'm trying to get rid of the
				// switch, that's a temp hack to pass through
				rv.add(next.getImplementationBundle());
			}
			if (fqnSwitch != null) {
				rv.addAll(Arrays.asList(fqnSwitch.getDependencies(next)));
			}
		}
		return rv.toArray(new String[rv.size()]);
	}

	private void handleNodes() throws InterruptedException {
		for (Node next : myInput.getNodes()) {
			handleFigure(next.getFigure());
		}
	}

	private void handleLinks() throws InterruptedException {
		for (Connection next : myInput.getConnections()) {
			handleFigure(next.getFigure());
		}
	}

	private void handleCompartments() throws InterruptedException {
		for (Compartment next : myInput.getCompartments()) {
			FigureDescriptor nextFigure = next.getFigure();
			if (nextFigure == null){
				throw new NullPointerException("Compartment without figure : " + next);
			}
			handleFigure(nextFigure);
		}
	}

	private void handleLabels() throws InterruptedException {
		for (DiagramLabel next : myInput.getLabels()) {
			if (next.getAccessor() != null) {
				// accessor
				ChildAccess labelAccess = next.getAccessor();
				// XXX nothing to do?
			} else {
				handleFigure(next.getFigure());
			}
		}
	}

	private void handleFigure(FigureDescriptor fd) throws InterruptedException {
		if (myElementCopier.isSubstituted(fd)) {
			// already processed, nothing to do
			return;
			// XXX originally CustomFigures do not get into history of elementCopier, 
			// hence may still get copied more than once. Perhaps, makes sense to have separate 'History'
			// to keep track of processed figures?
		}
		if (fd.getActualFigure() instanceof CustomFigure && isPlainBareCustomFigure((CustomFigure) fd.getActualFigure())) {
			// XXX an implementationBundle might be an issue here (#x#),
			// since myOutcomeGallery gonna get one we generate, while the original CustomFigure
			// may have one specified in the ownining FigureGallery.
			final CustomFigure f = (CustomFigure) fd.getActualFigure();
			myOutcomeGallery.getFigures().add(myElementCopier.xcopy(f));
		} else {
			String fqn = myCallback.visitFigure(fd);
			myElementCopier.registerSubstitution(fd, createCustomFigure(fd, fqn));
		}
	}

	/**
	 * FIXME diplicates {@link org.eclipse.gmf.bridge.genmodel.InnerClassViewmapProducer#isBareInstance}
	 * Should be merged somehow.
	 */
	private static boolean isPlainBareCustomFigure(CustomFigure figure) {
		if (!figure.getChildren().isEmpty()) {
			return false;
		}
		final LinkedList<EStructuralFeature> featuresToCheck = new LinkedList<EStructuralFeature>(figure.eClass().getEAllStructuralFeatures());
		featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getRealFigure_Name());
		featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getRealFigure_Children());

		featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getCustomClass_QualifiedClassName());
		featuresToCheck.remove(GMFGraphPackage.eINSTANCE.getCustomFigure_CustomChildren());

		for(EStructuralFeature next : featuresToCheck) {
			if (next.isDerived()) {
				continue;
			}
			if (figure.eIsSet(next)) {
				return false;
			}
		}
		return true;
	}

	private FigureDescriptor createCustomFigure(FigureDescriptor original, String fqn) {
		CustomFigure cf = GalleryMirrorProcessor.createCustomFigure(original.getActualFigure());
		cf.setQualifiedClassName(fqn);
		FigureDescriptor fd = GMFGraphFactory.eINSTANCE.createFigureDescriptor();
		fd.setName(original.getName());
		fd.setActualFigure(cf);
		myOutcomeGallery.getDescriptors().add(fd);
		return fd;
	}
}