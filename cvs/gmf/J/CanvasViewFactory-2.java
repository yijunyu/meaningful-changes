package org.eclipse.gmf.graphdef.editor.view.factories;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.gmf.runtime.diagram.ui.view.factories.DiagramViewFactory;

import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CanvasViewFactory extends DiagramViewFactory {

	/**
	 * @generated
	 */
	protected void decorateView(View view, IAdaptable semanticAdapter, String diagramKind) {
		super.decorateView(view, semanticAdapter, diagramKind);
	}

	/**
	 * @generated
	 */
	protected MeasurementUnit getMeasurementUnit() {
		return MeasurementUnit.PIXEL_LITERAL;
	}
}
