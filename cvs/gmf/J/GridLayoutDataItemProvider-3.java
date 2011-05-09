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
import org.eclipse.gmf.gmfgraph.GridLayoutData;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.GridLayoutData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GridLayoutDataItemProvider
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
	public GridLayoutDataItemProvider(AdapterFactory adapterFactory) {
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

			addOwnerPropertyDescriptor(object);
			addGrabExcessHorizontalSpacePropertyDescriptor(object);
			addGrabExcessVerticalSpacePropertyDescriptor(object);
			addVerticalAlignmentPropertyDescriptor(object);
			addHorizontalAlignmentPropertyDescriptor(object);
			addVerticalSpanPropertyDescriptor(object);
			addHorizontalSpanPropertyDescriptor(object);
			addHorizontalIndentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutData_owner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutData_owner_feature", "_UI_LayoutData_type"),
				 GMFGraphPackage.eINSTANCE.getLayoutData_Owner(),
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grab Excess Horizontal Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGrabExcessHorizontalSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GridLayoutData_grabExcessHorizontalSpace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GridLayoutData_grabExcessHorizontalSpace_feature", "_UI_GridLayoutData_type"),
				 GMFGraphPackage.eINSTANCE.getGridLayoutData_GrabExcessHorizontalSpace(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grab Excess Vertical Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGrabExcessVerticalSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GridLayoutData_grabExcessVerticalSpace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GridLayoutData_grabExcessVerticalSpace_feature", "_UI_GridLayoutData_type"),
				 GMFGraphPackage.eINSTANCE.getGridLayoutData_GrabExcessVerticalSpace(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GridLayoutData_verticalAlignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GridLayoutData_verticalAlignment_feature", "_UI_GridLayoutData_type"),
				 GMFGraphPackage.eINSTANCE.getGridLayoutData_VerticalAlignment(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GridLayoutData_horizontalAlignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GridLayoutData_horizontalAlignment_feature", "_UI_GridLayoutData_type"),
				 GMFGraphPackage.eINSTANCE.getGridLayoutData_HorizontalAlignment(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical Span feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalSpanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GridLayoutData_verticalSpan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GridLayoutData_verticalSpan_feature", "_UI_GridLayoutData_type"),
				 GMFGraphPackage.eINSTANCE.getGridLayoutData_VerticalSpan(),
				 true,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Span feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalSpanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GridLayoutData_horizontalSpan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GridLayoutData_horizontalSpan_feature", "_UI_GridLayoutData_type"),
				 GMFGraphPackage.eINSTANCE.getGridLayoutData_HorizontalSpan(),
				 true,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Indent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalIndentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GridLayoutData_horizontalIndent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GridLayoutData_horizontalIndent_feature", "_UI_GridLayoutData_type"),
				 GMFGraphPackage.eINSTANCE.getGridLayoutData_HorizontalIndent(),
				 true,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getGridLayoutData_SizeHint());
		}
		return childrenFeatures;
	}

	/**
	 * This returns GridLayoutData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GridLayoutData"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		GridLayoutData gridLayoutData = (GridLayoutData)object;
		return getString("_UI_GridLayoutData_type") + " " + gridLayoutData.isGrabExcessHorizontalSpace();
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

		switch (notification.getFeatureID(GridLayoutData.class)) {
			case GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
			case GMFGraphPackage.GRID_LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE:
			case GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_ALIGNMENT:
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_ALIGNMENT:
			case GMFGraphPackage.GRID_LAYOUT_DATA__VERTICAL_SPAN:
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_SPAN:
			case GMFGraphPackage.GRID_LAYOUT_DATA__HORIZONTAL_INDENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGraphPackage.GRID_LAYOUT_DATA__SIZE_HINT:
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
				(GMFGraphPackage.eINSTANCE.getGridLayoutData_SizeHint(),
				 GMFGraphFactory.eINSTANCE.createDimension()));
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
