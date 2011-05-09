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
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Shape;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.Shape} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapeItemProvider
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
	public ShapeItemProvider(AdapterFactory adapterFactory) {
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
			addOutlinePropertyDescriptor(object);
			addFillPropertyDescriptor(object);
			addLineWidthPropertyDescriptor(object);
			addLineKindPropertyDescriptor(object);
			addXorFillPropertyDescriptor(object);
			addXorOutlinePropertyDescriptor(object);
			addResolvedChildrenPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Outline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutlinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shape_outline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shape_outline_feature", "_UI_Shape_type"),
				 GMFGraphPackage.eINSTANCE.getShape_Outline(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fill feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shape_fill_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shape_fill_feature", "_UI_Shape_type"),
				 GMFGraphPackage.eINSTANCE.getShape_Fill(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shape_lineWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shape_lineWidth_feature", "_UI_Shape_type"),
				 GMFGraphPackage.eINSTANCE.getShape_LineWidth(),
				 true,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shape_lineKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shape_lineKind_feature", "_UI_Shape_type"),
				 GMFGraphPackage.eINSTANCE.getShape_LineKind(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xor Fill feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXorFillPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shape_xorFill_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shape_xorFill_feature", "_UI_Shape_type"),
				 GMFGraphPackage.eINSTANCE.getShape_XorFill(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xor Outline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXorOutlinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shape_xorOutline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shape_xorOutline_feature", "_UI_Shape_type"),
				 GMFGraphPackage.eINSTANCE.getShape_XorOutline(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolved Children feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolvedChildrenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shape_resolvedChildren_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shape_resolvedChildren_feature", "_UI_Shape_type"),
				 GMFGraphPackage.eINSTANCE.getShape_ResolvedChildren(),
				 false,
				 null,
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Shape)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Shape_type") :
			getString("_UI_Shape_type") + " " + label;
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

		switch (notification.getFeatureID(Shape.class)) {
			case GMFGraphPackage.SHAPE__NAME:
			case GMFGraphPackage.SHAPE__LAYOUT_MANAGER:
			case GMFGraphPackage.SHAPE__OUTLINE:
			case GMFGraphPackage.SHAPE__FILL:
			case GMFGraphPackage.SHAPE__LINE_WIDTH:
			case GMFGraphPackage.SHAPE__LINE_KIND:
			case GMFGraphPackage.SHAPE__XOR_FILL:
			case GMFGraphPackage.SHAPE__XOR_OUTLINE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGraphPackage.SHAPE__CHILDREN:
			case GMFGraphPackage.SHAPE__FOREGROUND_COLOR:
			case GMFGraphPackage.SHAPE__BACKGROUND_COLOR:
			case GMFGraphPackage.SHAPE__MAXIMUM_SIZE:
			case GMFGraphPackage.SHAPE__MINIMUM_SIZE:
			case GMFGraphPackage.SHAPE__PREFERRED_SIZE:
			case GMFGraphPackage.SHAPE__FONT:
			case GMFGraphPackage.SHAPE__INSETS:
			case GMFGraphPackage.SHAPE__BORDER:
			case GMFGraphPackage.SHAPE__LOCATION:
			case GMFGraphPackage.SHAPE__SIZE:
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
