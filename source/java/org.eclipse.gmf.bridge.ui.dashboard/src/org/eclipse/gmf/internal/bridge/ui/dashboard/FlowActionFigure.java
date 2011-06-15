/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.ui.dashboard;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;

/**
 * @author dstadnik
 */
public class FlowActionFigure extends RectangleFigure implements ActionContainer {

	public FlowActionFigure() {
		setLayoutManager(new ToolbarLayout());
	}

	public void addAction(IFigure actionFigure) {
		add(actionFigure);
	}

	public void addAction(IFigure actionFigure, boolean std) {
		add(actionFigure);
	}

	public void removeAction(IFigure actionFigure, boolean std) {
		remove(actionFigure);
	}
}
