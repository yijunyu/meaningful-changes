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

import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.util.FigureQualifiedNameSwitch;
import org.eclipse.gmf.graphdef.codegen.StandaloneGenerator.Config;
import org.eclipse.gmf.graphdef.codegen.StandaloneGenerator.Processor;
import org.eclipse.gmf.graphdef.codegen.StandaloneGenerator.ProcessorCallback;

/**
 * Straighforwardly transforms all top-level figures from supplied galleries
 * @author artem
 */
public class GalleryProcessor extends Processor {
	private final FigureGallery[] myInput;

	public GalleryProcessor(FigureGallery input) {
		this(new FigureGallery[] { input });
	}

	public GalleryProcessor(FigureGallery[] input) {
		assert !Arrays.asList(input).contains(null);
		myInput = input;
	}
	
	public void go(ProcessorCallback callback, Config config) throws InterruptedException {
		for (int i = 0; i < myInput.length; i++) {
			for (FigureDescriptor next : myInput[i].getDescriptors()) {
				String fqn = callback.visitFigure(next);
				handle(next, fqn);
			}
		}
	}

	/**
	 * does nothing by default, override to do smth usable
	 */
	protected void handle(FigureDescriptor next, String fqn) {
	}

	public String[] getRequiredBundles(FigureQualifiedNameSwitch fqnSwitch) {
		HashSet<String> rv = new HashSet<String>();
		for (int i = 0; i < myInput.length; i++) {
			if (myInput[i].getImplementationBundle() != null && myInput[i].getImplementationBundle().trim().length() > 0) {
				rv.add(myInput[i].getImplementationBundle());
			}
			if (fqnSwitch != null) {
				rv.addAll(Arrays.asList(fqnSwitch.getDependencies(myInput[i])));
			}
		}
		return rv.toArray(new String[rv.size()]);
	}
}
