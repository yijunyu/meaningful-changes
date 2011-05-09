/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.CustomFigure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomFigureItemProvider
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
	public CustomFigureItemProvider(AdapterFactory adapterFactory) {
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
			addLayoutManagerPropertyDescriptor(object);
			addQualifiedClassNamePropertyDescriptor(object);
			addBundleNamePropertyDescriptor(object);
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
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout Manager feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayoutManagerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Figure_layoutManager_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Figure_layoutManager_feature", "_UI_Figure_type"),
				 GMFGraphPackage.eINSTANCE.getFigure_LayoutManager(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qualified Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualifiedClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomClass_qualifiedClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomClass_qualifiedClassName_feature", "_UI_CustomClass_type"),
				 GMFGraphPackage.eINSTANCE.getCustomClass_QualifiedClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bundle Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBundleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomClass_bundleName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomClass_bundleName_feature", "_UI_CustomClass_type"),
				 GMFGraphPackage.eINSTANCE.getCustomClass_BundleName(),
				 true,
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
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_Children());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_ForegroundColor());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_BackgroundColor());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_MaximumSize());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_MinimumSize());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_PreferredSize());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_Font());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_Insets());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_Border());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_Location());
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigure_Size());
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
	 * This returns CustomFigure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/CustomFigure");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CustomFigure)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CustomFigure_type") :
			getString("_UI_CustomFigure_type") + " " + label;
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

		switch (notification.getFeatureID(CustomFigure.class)) {
			case GMFGraphPackage.CUSTOM_FIGURE__NAME:
			case GMFGraphPackage.CUSTOM_FIGURE__LAYOUT_MANAGER:
			case GMFGraphPackage.CUSTOM_FIGURE__QUALIFIED_CLASS_NAME:
			case GMFGraphPackage.CUSTOM_FIGURE__BUNDLE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGraphPackage.CUSTOM_FIGURE__CHILDREN:
			case GMFGraphPackage.CUSTOM_FIGURE__FOREGROUND_COLOR:
			case GMFGraphPackage.CUSTOM_FIGURE__BACKGROUND_COLOR:
			case GMFGraphPackage.CUSTOM_FIGURE__MAXIMUM_SIZE:
			case GMFGraphPackage.CUSTOM_FIGURE__MINIMUM_SIZE:
			case GMFGraphPackage.CUSTOM_FIGURE__PREFERRED_SIZE:
			case GMFGraphPackage.CUSTOM_FIGURE__FONT:
			case GMFGraphPackage.CUSTOM_FIGURE__INSETS:
			case GMFGraphPackage.CUSTOM_FIGURE__BORDER:
			case GMFGraphPackage.CUSTOM_FIGURE__LOCATION:
			case GMFGraphPackage.CUSTOM_FIGURE__SIZE:
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createFigureRef()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createLabeledContainer()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createRectangle()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createRoundedRectangle()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createEllipse()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createPolyline()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createPolygon()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createPolylineConnection()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createPolylineDecoration()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createPolygonDecoration()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createCustomFigure()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createCustomDecoration()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Children(),
				 GMFGraphFactory.eINSTANCE.createCustomConnection()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_ForegroundColor(),
				 GMFGraphFactory.eINSTANCE.createRGBColor()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_ForegroundColor(),
				 GMFGraphFactory.eINSTANCE.createConstantColor()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_BackgroundColor(),
				 GMFGraphFactory.eINSTANCE.createRGBColor()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_BackgroundColor(),
				 GMFGraphFactory.eINSTANCE.createConstantColor()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_MaximumSize(),
				 GMFGraphFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_MinimumSize(),
				 GMFGraphFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_PreferredSize(),
				 GMFGraphFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Insets(),
				 GMFGraphFactory.eINSTANCE.createInsets()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Border(),
				 GMFGraphFactory.eINSTANCE.createLineBorder()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Border(),
				 GMFGraphFactory.eINSTANCE.createMarginBorder()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Border(),
				 GMFGraphFactory.eINSTANCE.createCompoundBorder()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Border(),
				 GMFGraphFactory.eINSTANCE.createCustomBorder()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Location(),
				 GMFGraphFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigure_Size(),
				 GMFGraphFactory.eINSTANCE.createPoint()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_ForegroundColor() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_BackgroundColor() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_MaximumSize() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_MinimumSize() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_PreferredSize() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_Location() ||
			childFeature == GMFGraphPackage.eINSTANCE.getFigure_Size();

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
