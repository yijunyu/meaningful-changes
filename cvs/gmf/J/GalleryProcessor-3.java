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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.gmf.gmfgraph.Figure;
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
			for (Iterator it = myInput[i].getFigures().iterator(); it.hasNext();) {
				Figure next = (Figure) it.next();
				String fqn = callback.visitFigure(next);
				handle(next, fqn);
			}
		}
	}

	/**
	 * does nothing by default, override to do smth usable
	 */
	protected void handle(Figure next, String fqn) {
	}

	public String[] getRequiredBundles(FigureQualifiedNameSwitch fqnSwitch) {
		HashSet rv = new HashSet();
		for (int i = 0; i < myInput.length; i++) {
			if (myInput[i].getImplementationBundle() != null && myInput[i].getImplementationBundle().trim().length() > 0) {
				rv.add(myInput[i].getImplementationBundle());
			}
			String[] additional = fqnSwitch.getDependencies(myInput[i]);
			rv.addAll(Arrays.asList(additional));
		}
		return (String[]) rv.toArray(new String[rv.size()]);
	}
}
