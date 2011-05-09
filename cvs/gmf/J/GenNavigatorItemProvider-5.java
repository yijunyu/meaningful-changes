/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.provider;


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

import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenNavigator;

import org.eclipse.gmf.codegen.gmfgen.presentation.EditorPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.codegen.gmfgen.GenNavigator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenNavigatorItemProvider
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
	public GenNavigatorItemProvider(AdapterFactory adapterFactory) {
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

			addContentExtensionIDPropertyDescriptor(object);
			addContentExtensionNamePropertyDescriptor(object);
			addContentExtensionPriorityPropertyDescriptor(object);
			addLinkHelperExtensionIDPropertyDescriptor(object);
			addSorterExtensionIDPropertyDescriptor(object);
			addContentProviderClassNamePropertyDescriptor(object);
			addLabelProviderClassNamePropertyDescriptor(object);
			addLinkHelperClassNamePropertyDescriptor(object);
			addSorterClassNamePropertyDescriptor(object);
			addAbstractNavigatorItemClassNamePropertyDescriptor(object);
			addNavigatorGroupClassNamePropertyDescriptor(object);
			addNavigatorItemClassNamePropertyDescriptor(object);
			addPackageNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Content Extension ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentExtensionIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_contentExtensionID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_contentExtensionID_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_ContentExtensionID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Extension Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentExtensionNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_contentExtensionName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_contentExtensionName_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_ContentExtensionName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Extension Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentExtensionPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_contentExtensionPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_contentExtensionPriority_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_ContentExtensionPriority(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link Helper Extension ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkHelperExtensionIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_linkHelperExtensionID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_linkHelperExtensionID_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_LinkHelperExtensionID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sorter Extension ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSorterExtensionIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_sorterExtensionID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_sorterExtensionID_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_SorterExtensionID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_contentProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_contentProviderClassName_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_ContentProviderClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_labelProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_labelProviderClassName_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_LabelProviderClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link Helper Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkHelperClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_linkHelperClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_linkHelperClassName_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_LinkHelperClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sorter Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSorterClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_sorterClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_sorterClassName_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_SorterClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract Navigator Item Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractNavigatorItemClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_abstractNavigatorItemClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_abstractNavigatorItemClassName_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_AbstractNavigatorItemClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Navigator Group Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNavigatorGroupClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_navigatorGroupClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_navigatorGroupClassName_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_NavigatorGroupClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Navigator Item Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNavigatorItemClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_navigatorItemClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_navigatorItemClassName_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_NavigatorItemClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenNavigator_packageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenNavigator_packageName_feature", "_UI_GenNavigator_type"),
				 GMFGenPackage.eINSTANCE.getGenNavigator_PackageName(),
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
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenNavigator_ChildReferences());
		}
		return childrenFeatures;
	}

	/**
	 * This returns GenNavigator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenNavigator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((GenNavigator)object).getContentProviderClassName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenNavigator_type") :
			getString("_UI_GenNavigator_type") + " " + label;
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

		switch (notification.getFeatureID(GenNavigator.class)) {
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_ID:
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_NAME:
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_EXTENSION_PRIORITY:
			case GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_EXTENSION_ID:
			case GMFGenPackage.GEN_NAVIGATOR__SORTER_EXTENSION_ID:
			case GMFGenPackage.GEN_NAVIGATOR__CONTENT_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_NAVIGATOR__LABEL_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_NAVIGATOR__LINK_HELPER_CLASS_NAME:
			case GMFGenPackage.GEN_NAVIGATOR__SORTER_CLASS_NAME:
			case GMFGenPackage.GEN_NAVIGATOR__ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME:
			case GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_GROUP_CLASS_NAME:
			case GMFGenPackage.GEN_NAVIGATOR__NAVIGATOR_ITEM_CLASS_NAME:
			case GMFGenPackage.GEN_NAVIGATOR__PACKAGE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGenPackage.GEN_NAVIGATOR__CHILD_REFERENCES:
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
				(GMFGenPackage.eINSTANCE.getGenNavigator_ChildReferences(),
				 GMFGenFactory.eINSTANCE.createGenNavigatorChildReference()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return EditorPlugin.INSTANCE;
	}

}
