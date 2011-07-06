/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.map.editor.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.gmf.map.editor.part.GMFMapVisualIDRegistry;

/**
 * @generated
 */
public class GMFMapEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public static final String EXTERNAL_NODE_LABELS_LAYER = "External Node Labels"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			int viewVisualID = GMFMapVisualIDRegistry.getVisualID(view);
			switch (viewVisualID) {
			case CanvasMappingEditPart.VISUAL_ID:
				return new CanvasMappingEditPart(view);
			case CanvasMappingInfoEditPart.VISUAL_ID:
				return new CanvasMappingInfoEditPart(view);
			case NodeMappingEditPart.VISUAL_ID:
				return new NodeMappingEditPart(view);
			case NodeMappingInfoEditPart.VISUAL_ID:
				return new NodeMappingInfoEditPart(view);
			case LinkMappingEditPart.VISUAL_ID:
				return new LinkMappingEditPart(view);
			case LinkMappingInfoEditPart.VISUAL_ID:
				return new LinkMappingInfoEditPart(view);
			case TopNodeReferenceEditPart.VISUAL_ID:
				return new TopNodeReferenceEditPart(view);
			case ReferenceInfoEditPart.VISUAL_ID:
				return new ReferenceInfoEditPart(view);
			case FeatureLabelMappingEditPart.VISUAL_ID:
				return new FeatureLabelMappingEditPart(view);
			case DesignLabelMappingEditPart.VISUAL_ID:
				return new DesignLabelMappingEditPart(view);
			case LabelMappingEditPart.VISUAL_ID:
				return new LabelMappingEditPart(view);
			case ChildReferenceEditPart.VISUAL_ID:
				return new ChildReferenceEditPart(view);
			case ReferenceInfo2EditPart.VISUAL_ID:
				return new ReferenceInfo2EditPart(view);
			case CompartmentMappingEditPart.VISUAL_ID:
				return new CompartmentMappingEditPart(view);
			case CompartmentMappingInfoEditPart.VISUAL_ID:
				return new CompartmentMappingInfoEditPart(view);
			case FeatureLabelMapping2EditPart.VISUAL_ID:
				return new FeatureLabelMapping2EditPart(view);
			case DesignLabelMapping2EditPart.VISUAL_ID:
				return new DesignLabelMapping2EditPart(view);
			case LabelMapping2EditPart.VISUAL_ID:
				return new LabelMapping2EditPart(view);
			case CanvasMappingContentsEditPart.VISUAL_ID:
				return new CanvasMappingContentsEditPart(view);
			case NodeMappingLabelsEditPart.VISUAL_ID:
				return new NodeMappingLabelsEditPart(view);
			case NodeMappingContentsEditPart.VISUAL_ID:
				return new NodeMappingContentsEditPart(view);
			case LinkMappingLabelsEditPart.VISUAL_ID:
				return new LinkMappingLabelsEditPart(view);
			case MappingEditPart.VISUAL_ID:
				return new MappingEditPart(view);
			case TopNodeReferenceOwnedChildEditPart.VISUAL_ID:
				return new TopNodeReferenceOwnedChildEditPart(view);
			case ChildReferenceOwnedChildEditPart.VISUAL_ID:
				return new ChildReferenceOwnedChildEditPart(view);
			case ChildReferenceReferencedChildEditPart.VISUAL_ID:
				return new ChildReferenceReferencedChildEditPart(view);
			case CompartmentMappingChildrenEditPart.VISUAL_ID:
				return new CompartmentMappingChildrenEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrapLabel)
			return new TextCellEditorLocator((WrapLabel) source.getFigure());
		else {
			IFigure figure = source.getFigure();
			return new LabelCellEditorLocator((Label) figure);
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrapLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrapLabel wrapLabel) {
			super();
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrapLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);

			if (getWrapLabel().isTextWrapped() && getWrapLabel().getText().length() > 0)
				rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
			else {
				int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			}

			if (!rect.equals(new Rectangle(text.getBounds())))
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
		}

	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);

			int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));

			if (!rect.equals(new Rectangle(text.getBounds())))
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
		}
	}
}
