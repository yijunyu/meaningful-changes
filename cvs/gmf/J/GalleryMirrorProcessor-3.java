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
package org.eclipse.gmf.internal.graphdef.codegen;

import java.util.Collections;
import java.util.Enumeration;
import java.util.IdentityHashMap;
import java.util.Map;

import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.Figure;
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
	private final GenerationInfoImpl myGenerationInfo;
	private String myGeneratedBundle;

	public GalleryMirrorProcessor(FigureGallery[] input) {
		super(input);
		myGenerationInfo = new GenerationInfoImpl();
	}

	public void go(ProcessorCallback callback, Config config) throws InterruptedException {
		super.go(callback, config);
		myGeneratedBundle = config.getPluginID();
	}

	public FigureGallery convertFigureGallery(){
		FigureGallery result = GMFGraphFactory.eINSTANCE.createFigureGallery();
		result.setName("GeneratedGallery"); // FIXME smth reasonable
		result.setImplementationBundle(myGeneratedBundle);
		
		for (Enumeration originalFigures = myGenerationInfo.getProcessedFigures(); originalFigures.hasMoreElements();){
			Figure nextOriginal = (Figure) originalFigures.nextElement();
			String nextConvertedFqn = myGenerationInfo.getGeneratedClassFQN(nextOriginal);
			CustomFigure custom = DiagramElementsCopier.createCustomFigure(nextOriginal);
			custom.setName(nextOriginal.getName());
			custom.setBundleName(myGeneratedBundle);
			custom.setQualifiedClassName(nextConvertedFqn);
			
			result.getFigures().add(custom);
		}
		return result;
	}

	public GenerationInfo getGenerationInfo() {
		return myGenerationInfo;
	}

	protected void handle(Figure next, String fqn) {
		myGenerationInfo.registerFQN(next, fqn);
	}

	public interface GenerationInfo {
		public Enumeration/*<Figure>*/ getProcessedFigures();
		public String getGeneratedClassFQN(Figure figure);
	}

	private static class GenerationInfoImpl implements GenerationInfo {
		private final Map myFigure2FQN = new IdentityHashMap();
		
		public GenerationInfoImpl(){
		}
		
		public void registerFQN(Figure figure, String fqn){
			myFigure2FQN.put(figure, fqn);
		}
		
		public String getGeneratedClassFQN(Figure figure) {
			return (String)myFigure2FQN.get(figure);
		}
		
		public Enumeration getProcessedFigures() {
			return Collections.enumeration(myFigure2FQN.keySet());
		}	
	}
}