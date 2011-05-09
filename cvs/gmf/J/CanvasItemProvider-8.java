/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.provider;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.Canvas} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CanvasItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Identity_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Identity_name_feature", "_UI_Identity_type"),
				 GMFGraphPackage.eINSTANCE.getIdentity_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getCanvas_Figures());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getCanvas_Nodes());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getCanvas_Connections());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getCanvas_Compartments());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getCanvas_Children());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getCanvas_Labels());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Canvas.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Canvas"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Canvas)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Canvas_type") :
			getString("_UI_Canvas_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Canvas.class)) {
			case GMFGraphPackage.CANVAS__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGraphPackage.CANVAS__FIGURES:
			case GMFGraphPackage.CANVAS__NODES:
			case GMFGraphPackage.CANVAS__CONNECTIONS:
			case GMFGraphPackage.CANVAS__COMPARTMENTS:
			case GMFGraphPackage.CANVAS__CHILDREN:
			case GMFGraphPackage.CANVAS__LABELS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptorsGen(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getCanvas_Figures(),
				 GMFGraphFactory.eINSTANCE.createFigureGallery()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getCanvas_Nodes(),
				 GMFGraphFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getCanvas_Nodes(),
				 GMFGraphFactory.eINSTANCE.createDiagramLabel()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getCanvas_Connections(),
				 GMFGraphFactory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getCanvas_Compartments(),
				 GMFGraphFactory.eINSTANCE.createCompartment()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getCanvas_Children(),
				 GMFGraphFactory.eINSTANCE.createChild()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getCanvas_Labels(),
				 GMFGraphFactory.eINSTANCE.createDiagramLabel()));
	}

	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		LinkedList allGenerated = new LinkedList();
		collectNewChildDescriptorsGen(allGenerated, object);
		
		CommandParameter toRemove = createChildParameter(
				GMFGraphPackage.eINSTANCE.getCanvas_Nodes(),
				GMFGraphFactory.eINSTANCE.createDiagramLabel());

		for (Iterator generated = allGenerated.iterator(); generated.hasNext();){
			CommandParameter next = (CommandParameter)generated.next();
			if (equalsChildParameters(toRemove, next)){
				generated.remove();
				break;
			}
		}
		
		newChildDescriptors.addAll(allGenerated);
	}

	private static boolean equalsChildParameters(CommandParameter first, CommandParameter second){
		return first.getFeature().equals(second.getFeature()) && first.getValue().equals(second.getValue());
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * This method now is useful only for Labels in canvas.nodes feature, and while we remove 
	 * possibility to create them with overrided collectNewChildDescriptors, the method left
	 * here as it brings more problems overriding it than a bit different 
	 * (although semantically legal) label (_UI_CreateChild_text2 vs _UI_CreateChild_text3).
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == GMFGraphPackage.eINSTANCE.getCanvas_Nodes() ||
			childFeature == GMFGraphPackage.eINSTANCE.getCanvas_Labels();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return GMFGraphEditPlugin.INSTANCE;
	}

}
