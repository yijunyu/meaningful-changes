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

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

import org.eclipse.gmf.gmfgraph.ConnectionFigure;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.DecorationFigure;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.graphdef.codegen.StandaloneGenerator.Config;
import org.eclipse.gmf.graphdef.codegen.StandaloneGenerator.ProcessorCallback;

/**
 * In addition to {@link GalleryProcessor} activities, collects names of transformed figures and 
 * allows to create {@link FigureGallery} full of them. 
 * @author artem
 */
public class GalleryMirrorProcessor extends GalleryProcessor {
	private final Map<FigureDescriptor, String> myFigure2FQN = new IdentityHashMap<FigureDescriptor, String>();
	private String myGeneratedBundle;

	public GalleryMirrorProcessor(FigureGallery[] input) {
		super(input);
	}

	public void go(ProcessorCallback callback, Config config) throws InterruptedException {
		super.go(callback, config);
		myGeneratedBundle = config.getPluginID();
	}

	public FigureGallery convertFigureGallery(){
		FigureGallery result = GMFGraphFactory.eINSTANCE.createFigureGallery();
		result.setName("GeneratedGallery"); // FIXME smth reasonable
		result.setImplementationBundle(myGeneratedBundle);
		
		for (FigureDescriptor fd : myFigure2FQN.keySet()) {
			Figure nextOriginal = fd.getActualFigure();
			String nextConvertedFqn = myFigure2FQN.get(fd);
			CustomFigure custom = createCustomFigure(nextOriginal);
			custom.setName(fd.getName());
			custom.setQualifiedClassName(nextConvertedFqn);

			result.getFigures().add(custom);
		}
		return result;
	}

	public Map<FigureDescriptor, String> getGenerationInfo() {
		return Collections.unmodifiableMap(myFigure2FQN);
	}

	protected void handle(FigureDescriptor next, String fqn) {
		myFigure2FQN.put(next, fqn);
	}

	static CustomFigure createCustomFigure(Figure original){
		GMFGraphFactory factory = GMFGraphFactory.eINSTANCE;
		if (original instanceof DecorationFigure){
			return factory.createCustomDecoration();
		} 
		if (original instanceof ConnectionFigure){
			return factory.createCustomConnection();
		}
		return factory.createCustomFigure();
	}
}
