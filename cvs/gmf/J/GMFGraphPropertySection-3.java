/*
 *  Copyright (c) 2006, 2007 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.sheet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Layoutable;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.Polyline;
import org.eclipse.gmf.gmfgraph.XYLayoutData;
import org.eclipse.gmf.graphdef.editor.part.GMFGraphDiagramEditorPlugin;
import org.eclipse.gmf.runtime.common.ui.services.properties.ICompositePropertySource;
import org.eclipse.gmf.runtime.common.ui.services.properties.descriptors.CompositePropertySource;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AdvancedPropertySection;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositePropertySource;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositeSourcePropertyDescriptor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * @generated
 */
public class GMFGraphPropertySection extends AdvancedPropertySection implements IPropertySourceProvider {

	/**
	 * @generated
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof Layoutable) {
			CompositePropertySource compositeSource = new CompositePropertySource(object);

			compositeSource.addPropertySource(adaptToOldCompositePropertySource(object));

			IItemPropertyDescriptor layoutPropertyDescriptor = new ChildMetaclassItemPropertyDescriptor(GMFGraphDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory(), "Layout Manager",
					"Layout Manager", GMFGraphPackage.eINSTANCE.getLayoutable_Layout(), true, new EObject[] { GMFGraphFactory.eINSTANCE.createBorderLayout(),
							GMFGraphFactory.eINSTANCE.createCustomLayout(), GMFGraphFactory.eINSTANCE.createFlowLayout(), GMFGraphFactory.eINSTANCE.createGridLayout(),
							GMFGraphFactory.eINSTANCE.createStackLayout(), GMFGraphFactory.eINSTANCE.createXYLayout() });
			compositeSource.addPropertySource(new EMFCompositePropertySource(object, new SingleDescriptorPropertySource(layoutPropertyDescriptor), "EMF")); //$NON-NLS-1$

			IItemPropertyDescriptor layoutDataPropertyDescriptor = new ChildMetaclassItemPropertyDescriptor(GMFGraphDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory(), "Layout Data",
					"Layout Data", GMFGraphPackage.eINSTANCE.getLayoutable_LayoutData(), true, new EObject[] { GMFGraphFactory.eINSTANCE.createBorderLayoutData(),
							GMFGraphFactory.eINSTANCE.createCustomLayoutData(), GMFGraphFactory.eINSTANCE.createGridLayoutData(), GMFGraphFactory.eINSTANCE.createXYLayoutData() });
			compositeSource.addPropertySource(new EMFCompositePropertySource(object, new SingleDescriptorPropertySource(layoutDataPropertyDescriptor), "EMF")); //$NON-NLS-1$

			if (object instanceof Polyline) {
				int counter = 1;
				for (Iterator it = ((Polyline) object).getTemplate().iterator(); it.hasNext(); counter++) {
					Point nextPoint = (Point) it.next();
					final String titleX = "Point " + counter + " X";
					IItemPropertyDescriptor nextPointPropertyDescriptorX = new ItemPropertyDescriptor(GMFGraphDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory(), titleX, titleX,
							GMFGraphPackage.eINSTANCE.getPoint_X(), true, "Template");
					compositeSource.addPropertySource(new EMFCompositePropertySource(nextPoint, new SingleDescriptorPropertySource(nextPointPropertyDescriptorX), "EMF") {

						protected IPropertyDescriptor newPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
							return new EMFCompositeSourcePropertyDescriptor(object, itemPropertyDescriptor, getCategory()) {

								public Object getId() {
									return titleX;
								}
							};
						}
					});

					final String titleY = "Point " + counter + " Y";
					IItemPropertyDescriptor nextPointPropertyDescriptorY = new ItemPropertyDescriptor(GMFGraphDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory(), titleY, titleY,
							GMFGraphPackage.eINSTANCE.getPoint_Y(), true, "Template");
					compositeSource.addPropertySource(new EMFCompositePropertySource(nextPoint, new SingleDescriptorPropertySource(nextPointPropertyDescriptorY), "EMF") {

						protected IPropertyDescriptor newPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
							return new EMFCompositeSourcePropertyDescriptor(object, itemPropertyDescriptor, getCategory()) {

								public Object getId() {
									return titleY;
								}
							};
						}
					});
				}
			}

			return compositeSource;
		}
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object, IItemPropertySource.class);
			if (ips != null) {
				return new PropertySource(object, ips);
			}
		}
		if (object instanceof IAdaptable) {
			return (IPropertySource) ((IAdaptable) object).getAdapter(IPropertySource.class);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected IPropertySourceProvider getPropertySourceProvider() {
		return this;
	}

	/**
	 * Modify/unwrap selection.
	 * @generated
	 */
	protected Object transformSelection(Object selected) {
		if (selected instanceof EditPart) {
			Object model = ((EditPart) selected).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (selected instanceof View) {
			return ((View) selected).getElement();
		}
		if (selected instanceof IAdaptable) {
			View view = (View) ((IAdaptable) selected).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return selected;
	}

	/**
	 * @generated
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty() || false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
		ArrayList transformedSelection = new ArrayList(structuredSelection.size());
		for (Iterator it = structuredSelection.iterator(); it.hasNext();) {
			Object r = transformSelection(it.next());
			if (r != null) {
				transformedSelection.add(r);
			}
		}
		super.setInput(part, new StructuredSelection(transformedSelection));
	}

	/**
	 * @generated
	 */
	protected AdapterFactory getAdapterFactory(Object object) {
		if (getEditingDomain() instanceof AdapterFactoryEditingDomain) {
			return ((AdapterFactoryEditingDomain) getEditingDomain()).getAdapterFactory();
		}
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(object);
		if (editingDomain != null) {
			return ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
		}
		return null;
	}

	/**
	 * @generated
	 */
	private ICompositePropertySource adaptToOldCompositePropertySource(Object object) {
		if (object instanceof ICompositePropertySource) {
			return (ICompositePropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object, IItemPropertySource.class);
			if (ips != null) {
				return new EMFCompositePropertySource(object, ips, "EMF");
			}
		}
		if (object instanceof IAdaptable) {
			return (ICompositePropertySource) ((IAdaptable) object).getAdapter(ICompositePropertySource.class);
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static class SingleDescriptorPropertySource implements IItemPropertySource {

		/**
		 * @generated
		 */
		private IItemPropertyDescriptor myPropertyDescriptor;

		/**
		 * @generated
		 */
		private List myDescriptors = new LinkedList();

		/**
		 * @generated
		 */
		SingleDescriptorPropertySource(IItemPropertyDescriptor propertyDescriptor) {
			myPropertyDescriptor = propertyDescriptor;
			myDescriptors.add(myPropertyDescriptor);
		}

		/**
		 * @generated
		 */
		public List getPropertyDescriptors(Object object) {
			return myDescriptors;
		}

		/**
		 * @generated
		 */
		public IItemPropertyDescriptor getPropertyDescriptor(Object object, Object propertyID) {
			return myPropertyDescriptor;
		}

		/**
		 * @generated
		 */
		public Object getEditableValue(Object object) {
			return object;
		}
	}

	/**
	 * @generated
	 */
	public static class ChildMetaclassItemPropertyDescriptor extends ItemPropertyDescriptor {

		/**
		 * @generated
		 */
		private EObject[] myValues;

		/**
		 * @generated
		 */
		ChildMetaclassItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EStructuralFeature feature, boolean isSettable, EObject[] valueInstances) {
			super(adapterFactory, displayName, description, feature, isSettable);
			myValues = valueInstances;
		}

		/**
		 * @generated
		 */
		protected Collection getComboBoxObjects(Object object) {
			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				Object currentValue = getValue(eObject, feature);
				Collection result = new ArrayList();
				result.add(currentValue);
				EClass valueEClass = currentValue instanceof EObject ? ((EObject) currentValue).eClass() : null;
				for (int i = 0; i < myValues.length; i++) {
					if (myValues[i].eClass() == valueEClass) {
						continue;
					}
					result.add(myValues[i]);
				}
				if (currentValue != null) {
					result.add(null);
				}
				return result;
			}
			return null;
		}

		/**
		 * @generated
		 */
		public void setPropertyValue(Object object, Object value) {
			if (value instanceof EObject) {
				EClass eClass = ((EObject) value).eClass();
				value = eClass.getEPackage().getEFactoryInstance().create(eClass);
				if (value instanceof XYLayoutData) {
					XYLayoutData xyLayoutData = (XYLayoutData) value;
					xyLayoutData.setTopLeft(GMFGraphFactory.eINSTANCE.createPoint());
					xyLayoutData.getTopLeft().setX(0);
					xyLayoutData.getTopLeft().setY(0);
					xyLayoutData.setSize(GMFGraphFactory.eINSTANCE.createDimension());
					xyLayoutData.getSize().setDx(40);
					xyLayoutData.getSize().setDy(40);
				}
			}
			super.setPropertyValue(object, value);
		}
	}

}
