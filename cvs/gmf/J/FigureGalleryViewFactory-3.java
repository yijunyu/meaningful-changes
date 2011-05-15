package org.eclipse.gmf.graphdef.editor.view.factories;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;

import org.eclipse.gmf.graphdef.editor.edit.parts.CanvasEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGallery_FiguresEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGallery_nameEditPart;

import org.eclipse.gmf.graphdef.editor.part.GMFGraphVisualIDRegistry;

import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;

import org.eclipse.gmf.runtime.diagram.ui.view.factories.AbstractShapeViewFactory;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FigureGalleryViewFactory extends AbstractShapeViewFactory {

	/**
	 * @generated
	 */
	protected void decorateView(View containerView, View view, IAdaptable semanticAdapter, String semanticHint, int index, boolean persisted) {
		if (semanticHint == null) {
			semanticHint = GMFGraphVisualIDRegistry.getType(org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryEditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint, index, persisted);
		if (!CanvasEditPart.MODEL_ID.equals(GMFGraphVisualIDRegistry.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put("modelID", CanvasEditPart.MODEL_ID);
		}
		getViewService().createNode(semanticAdapter, view, GMFGraphVisualIDRegistry.getType(FigureGallery_nameEditPart.VISUAL_ID), ViewUtil.APPEND, true, getPreferencesHint());
		getViewService().createNode(semanticAdapter, view, GMFGraphVisualIDRegistry.getType(FigureGallery_FiguresEditPart.VISUAL_ID), ViewUtil.APPEND, true, getPreferencesHint());
	}
}