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
package org.eclipse.gmf.internal.graphdef.codegen.ui;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.graphdef.codegen.StandaloneGenerator.Processor;
import org.eclipse.gmf.internal.graphdef.codegen.CanvasProcessor;
import org.eclipse.gmf.internal.graphdef.codegen.GalleryMirrorProcessor;
import org.eclipse.gmf.internal.graphdef.codegen.GalleryProcessor;


/**
 * @author artem
 */
class ConverterOutcome {

	private final ConverterOptions myOptions;
	private Processor myProcessor;
	private final Resource[] myInput;

	public ConverterOutcome(ConverterOptions options, Resource[] input) {
		myOptions = options;
		myInput = input;
	}

	public IStatus checkInputAgainstOptions() {
		if (myOptions.needMirroredCanvas) {
			Canvas[] c = findCanvases(myInput);
			if (c.length == 0) {
				return newError("Need canvas instance", null);
			} else if (c.length > 1) {
				return newError("Need exactly one canvas instance", null);
			}
		} else if (myOptions.needMirroredGalleries) {
			FigureGallery[] figures = findFigures(myInput);
			if (figures.length == 0) {
				return newError("Need at least one figure gallery", null);
			}
		}
		return Status.OK_STATUS;
	}

	public Processor getProcessor() {
		if (myProcessor == null) {
			myProcessor = createProcessor();
		}
		return myProcessor;
	}

	private Processor createProcessor() {
		if (myOptions.needMirroredCanvas) {
			return new CanvasProcessor(inputAsCanvas());
		} else if (myOptions.needMirroredGalleries) {
			return new GalleryMirrorProcessor(inputAsGalleries());
		} else {
			return new GalleryProcessor(inputAsGalleries());
		}
	}

	private FigureGallery[] inputAsGalleries() {
		return findFigures(myInput);
	}

	private Canvas inputAsCanvas() {
		return findCanvases(myInput)[0];
	}

	public IStatus createResources(ResourceSet rs, URI galleryResourceURI, URI mirroredCanvasURI) {
		assert rs != null && galleryResourceURI != null && mirroredCanvasURI != null;
		Resource canvasResource = null;
		Resource galleryResource = null;
		if (myOptions.needMirroredCanvas) {
			// need mirroredCanvas enforces mirrored galleries.
			// the only difference with galleries in this case is where to put them - either 
			// separate resource or not. 
			Canvas mirror = ((CanvasProcessor) getProcessor()).getOutcome();
			canvasResource = rs.createResource(mirroredCanvasURI, ContentHandler.UNSPECIFIED_CONTENT_TYPE);
			canvasResource.getContents().add(mirror);
			if (myOptions.needMirroredGalleries && myOptions.separateMirrorFiles) {
				// sic! - respect separate mirror files only if explicitly asked to mirror galleries
				// because separateMirrorFiles could be true when value for galleryOutputPath not set
				galleryResource = rs.createResource(galleryResourceURI, ContentHandler.UNSPECIFIED_CONTENT_TYPE);
				// XXX make sure we support containments in different resources
				galleryResource.getContents().addAll(mirror.getFigures());
			}
			
		} else if (myOptions.needMirroredGalleries) {
			galleryResource = rs.createResource(galleryResourceURI, ContentHandler.UNSPECIFIED_CONTENT_TYPE);
			GalleryMirrorProcessor processor = (GalleryMirrorProcessor) getProcessor();
			galleryResource.getContents().add(processor.convertFigureGallery());
		}
		try {
			if (galleryResource != null) {
				galleryResource.save(null);
			}
			if (canvasResource != null) {
				canvasResource.save(null);
			}
		} catch (IOException ex) {
			return newError(ex.getMessage(), ex);
		}
		return Status.OK_STATUS;
	}

	private static Status newError(String message, Exception ex) {
		return new Status(IStatus.ERROR, "org.eclipse.gmf.graphdef.codegen.ui", 0, message, ex);
	}

	private static FigureGallery[] findFigures(Resource[] resources) {
		ArrayList<FigureGallery> rv = new ArrayList<FigureGallery>();
		for (int i = 0; i < resources.length; i++) {
			for(TreeIterator<EObject> it = resources[i].getAllContents(); it.hasNext();) {
				EObject next = it.next();
				// FigureGallery could be either top element or as a child of canvas
				if (next.eClass().getClassifierID() == GMFGraphPackage.FIGURE_GALLERY) {
					rv.add((FigureGallery) next);
					it.prune();
				} else if (next.eClass().getClassifierID() != GMFGraphPackage.CANVAS) {
					it.prune();
				}
			}
		}
		return rv.toArray(new FigureGallery[rv.size()]);
	}

	private static Canvas[] findCanvases(Resource[] resources) {
		ArrayList<Canvas> rv = new ArrayList<Canvas>();
		for (int i = 0; i < resources.length; i++) {
			for(EObject next : resources[i].getContents()) {
				if (next.eClass().getClassifierID() == GMFGraphPackage.CANVAS) {
					rv.add((Canvas) next);
				}
			}
		}
		return rv.toArray(new Canvas[rv.size()]);
	}
}
