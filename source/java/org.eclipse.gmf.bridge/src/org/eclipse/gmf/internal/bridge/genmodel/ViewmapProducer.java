/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
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

import org.eclipse.gmf.codegen.gmfgen.Viewmap;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Node;

/**
 * @author artem
 * XXX rename 'create' to 'get'? 
 */
public abstract class ViewmapProducer {

	public abstract Viewmap create(Canvas canvasElement);

	// XXX with Node split to AbstractNode, may need to reconsider this API
	public abstract Viewmap create(Node node);

	public abstract Viewmap create(Connection link);

	public abstract Viewmap create(Compartment compartment);

	public abstract Viewmap create(DiagramLabel label);

}
