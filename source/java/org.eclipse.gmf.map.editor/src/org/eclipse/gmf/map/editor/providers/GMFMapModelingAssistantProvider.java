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
package org.eclipse.gmf.map.editor.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.map.editor.edit.parts.CanvasMappingContentsEditPart;
import org.eclipse.gmf.map.editor.edit.parts.ChildReferenceEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CompartmentMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.LinkMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.MappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.NodeMappingContentsEditPart;
import org.eclipse.gmf.map.editor.edit.parts.NodeMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.TopNodeReferenceEditPart;

import org.eclipse.gmf.map.editor.part.GMFMapDiagramEditorPlugin;

/**
 * @generated
 */
public class GMFMapModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof NodeMappingEditPart) {
			List types = new ArrayList();
			types.add(GMFMapElementTypes.FeatureLabelMapping_3006);
			types.add(GMFMapElementTypes.DesignLabelMapping_3007);
			types.add(GMFMapElementTypes.LabelMapping_3002);
			return types;
		}
		if (editPart instanceof LinkMappingEditPart) {
			List types = new ArrayList();
			types.add(GMFMapElementTypes.FeatureLabelMapping_3008);
			types.add(GMFMapElementTypes.DesignLabelMapping_3009);
			types.add(GMFMapElementTypes.LabelMapping_3003);
			return types;
		}
		if (editPart instanceof CanvasMappingContentsEditPart) {
			List types = new ArrayList();
			types.add(GMFMapElementTypes.TopNodeReference_3001);
			return types;
		}
		if (editPart instanceof NodeMappingContentsEditPart) {
			List types = new ArrayList();
			types.add(GMFMapElementTypes.ChildReference_3004);
			types.add(GMFMapElementTypes.CompartmentMapping_3005);
			return types;
		}
		if (editPart instanceof MappingEditPart) {
			List types = new ArrayList();
			types.add(GMFMapElementTypes.CanvasMapping_2001);
			types.add(GMFMapElementTypes.NodeMapping_2003);
			types.add(GMFMapElementTypes.LinkMapping_2002);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof TopNodeReferenceEditPart) {
			List types = new ArrayList();
			types.add(GMFMapElementTypes.TopNodeReferenceOwnedChild_4001);
			return types;
		}
		if (sourceEditPart instanceof ChildReferenceEditPart) {
			List types = new ArrayList();
			types.add(GMFMapElementTypes.ChildReferenceOwnedChild_4004);
			types.add(GMFMapElementTypes.ChildReferenceReferencedChild_4002);
			return types;
		}
		if (sourceEditPart instanceof CompartmentMappingEditPart) {
			List types = new ArrayList();
			types.add(GMFMapElementTypes.CompartmentMappingChildren_4003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof NodeMappingEditPart) {
			List types = new ArrayList();
			types.add(GMFMapElementTypes.TopNodeReferenceOwnedChild_4001);
			types.add(GMFMapElementTypes.ChildReferenceOwnedChild_4004);
			types.add(GMFMapElementTypes.ChildReferenceReferencedChild_4002);
			return types;
		}
		if (targetEditPart instanceof ChildReferenceEditPart) {
			List types = new ArrayList();
			types.add(GMFMapElementTypes.CompartmentMappingChildren_4003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof TopNodeReferenceEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof NodeMappingEditPart) {
				types.add(GMFMapElementTypes.TopNodeReferenceOwnedChild_4001);
			}
			return types;
		}
		if (sourceEditPart instanceof ChildReferenceEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof NodeMappingEditPart) {
				types.add(GMFMapElementTypes.ChildReferenceOwnedChild_4004);
			}
			if (targetEditPart instanceof NodeMappingEditPart) {
				types.add(GMFMapElementTypes.ChildReferenceReferencedChild_4002);
			}
			return types;
		}
		if (sourceEditPart instanceof CompartmentMappingEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ChildReferenceEditPart) {
				types.add(GMFMapElementTypes.CompartmentMappingChildren_4003);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof NodeMappingEditPart) {
			List types = new ArrayList();
			if (relationshipType == GMFMapElementTypes.TopNodeReferenceOwnedChild_4001) {
				types.add(GMFMapElementTypes.TopNodeReference_3001);
			}
			if (relationshipType == GMFMapElementTypes.ChildReferenceOwnedChild_4004) {
				types.add(GMFMapElementTypes.ChildReference_3004);
			}
			if (relationshipType == GMFMapElementTypes.ChildReferenceReferencedChild_4002) {
				types.add(GMFMapElementTypes.ChildReference_3004);
			}
			return types;
		}
		if (targetEditPart instanceof ChildReferenceEditPart) {
			List types = new ArrayList();
			if (relationshipType == GMFMapElementTypes.CompartmentMappingChildren_4003) {
				types.add(GMFMapElementTypes.CompartmentMapping_3005);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof TopNodeReferenceEditPart) {
			List types = new ArrayList();
			if (relationshipType == GMFMapElementTypes.TopNodeReferenceOwnedChild_4001) {
				types.add(GMFMapElementTypes.NodeMapping_2003);
			}
			return types;
		}
		if (sourceEditPart instanceof ChildReferenceEditPart) {
			List types = new ArrayList();
			if (relationshipType == GMFMapElementTypes.ChildReferenceOwnedChild_4004) {
				types.add(GMFMapElementTypes.NodeMapping_2003);
			}
			if (relationshipType == GMFMapElementTypes.ChildReferenceReferencedChild_4002) {
				types.add(GMFMapElementTypes.NodeMapping_2003);
			}
			return types;
		}
		if (sourceEditPart instanceof CompartmentMappingEditPart) {
			List types = new ArrayList();
			if (relationshipType == GMFMapElementTypes.CompartmentMappingChildren_4003) {
				types.add(GMFMapElementTypes.ChildReference_3004);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(GMFMapDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage("Available domain model elements:");
		dialog.setTitle("Select domain model element");
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
