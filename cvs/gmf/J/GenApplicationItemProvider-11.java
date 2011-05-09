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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenApplication;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.codegen.gmfgen.GenApplication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenApplicationItemProvider
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
	public GenApplicationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIDPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addPackageNamePropertyDescriptor(object);
			addClassNamePropertyDescriptor(object);
			addWorkbenchAdvisorClassNamePropertyDescriptor(object);
			addWorkbenchWindowAdvisorClassNamePropertyDescriptor(object);
			addActionBarAdvisorClassNamePropertyDescriptor(object);
			addPerspectiveClassNamePropertyDescriptor(object);
			addPerspectiveIdPropertyDescriptor(object);
			addSupportFilesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenApplication_iD_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenApplication_iD_feature", "_UI_GenApplication_type"),
				 GMFGenPackage.eINSTANCE.getGenApplication_ID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenApplication_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenApplication_title_feature", "_UI_GenApplication_type"),
				 GMFGenPackage.eINSTANCE.getGenApplication_Title(),
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
				 getString("_UI_GenApplication_packageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenApplication_packageName_feature", "_UI_GenApplication_type"),
				 GMFGenPackage.eINSTANCE.getGenApplication_PackageName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenApplication_className_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenApplication_className_feature", "_UI_GenApplication_type"),
				 GMFGenPackage.eINSTANCE.getGenApplication_ClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Workbench Advisor Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkbenchAdvisorClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenApplication_workbenchAdvisorClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenApplication_workbenchAdvisorClassName_feature", "_UI_GenApplication_type"),
				 GMFGenPackage.eINSTANCE.getGenApplication_WorkbenchAdvisorClassName(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Workbench Window Advisor Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkbenchWindowAdvisorClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenApplication_workbenchWindowAdvisorClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenApplication_workbenchWindowAdvisorClassName_feature", "_UI_GenApplication_type"),
				 GMFGenPackage.eINSTANCE.getGenApplication_WorkbenchWindowAdvisorClassName(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action Bar Advisor Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionBarAdvisorClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenApplication_actionBarAdvisorClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenApplication_actionBarAdvisorClassName_feature", "_UI_GenApplication_type"),
				 GMFGenPackage.eINSTANCE.getGenApplication_ActionBarAdvisorClassName(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perspective Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerspectiveClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenApplication_perspectiveClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenApplication_perspectiveClassName_feature", "_UI_GenApplication_type"),
				 GMFGenPackage.eINSTANCE.getGenApplication_PerspectiveClassName(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perspective Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerspectiveIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenApplication_perspectiveId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenApplication_perspectiveId_feature", "_UI_GenApplication_type"),
				 GMFGenPackage.eINSTANCE.getGenApplication_PerspectiveId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Support Files feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportFilesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenApplication_supportFiles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenApplication_supportFiles_feature", "_UI_GenApplication_type"),
				 GMFGenPackage.eINSTANCE.getGenApplication_SupportFiles(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenApplication_SharedContributionItems());
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenApplication_MainMenu());
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenApplication_MainToolBar());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GenApplication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenApplication"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GenApplication)object).getID();
		return label == null || label.length() == 0 ?
			getString("_UI_GenApplication_type") :
			getString("_UI_GenApplication_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GenApplication.class)) {
			case GMFGenPackage.GEN_APPLICATION__ID:
			case GMFGenPackage.GEN_APPLICATION__TITLE:
			case GMFGenPackage.GEN_APPLICATION__PACKAGE_NAME:
			case GMFGenPackage.GEN_APPLICATION__CLASS_NAME:
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_ADVISOR_CLASS_NAME:
			case GMFGenPackage.GEN_APPLICATION__WORKBENCH_WINDOW_ADVISOR_CLASS_NAME:
			case GMFGenPackage.GEN_APPLICATION__ACTION_BAR_ADVISOR_CLASS_NAME:
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_CLASS_NAME:
			case GMFGenPackage.GEN_APPLICATION__PERSPECTIVE_ID:
			case GMFGenPackage.GEN_APPLICATION__SUPPORT_FILES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGenPackage.GEN_APPLICATION__SHARED_CONTRIBUTION_ITEMS:
			case GMFGenPackage.GEN_APPLICATION__MAIN_MENU:
			case GMFGenPackage.GEN_APPLICATION__MAIN_TOOL_BAR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenApplication_SharedContributionItems(),
				 GMFGenFactory.eINSTANCE.createGenSharedContributionItem()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenApplication_SharedContributionItems(),
				 GMFGenFactory.eINSTANCE.createGenGroupMarker()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenApplication_SharedContributionItems(),
				 GMFGenFactory.eINSTANCE.createGenSeparator()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenApplication_SharedContributionItems(),
				 GMFGenFactory.eINSTANCE.createGenActionFactoryContributionItem()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenApplication_SharedContributionItems(),
				 GMFGenFactory.eINSTANCE.createGenMenuManager()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenApplication_SharedContributionItems(),
				 GMFGenFactory.eINSTANCE.createGenToolBarManager()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenApplication_MainMenu(),
				 GMFGenFactory.eINSTANCE.createGenMenuManager()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenApplication_MainToolBar(),
				 GMFGenFactory.eINSTANCE.createGenToolBarManager()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == GMFGenPackage.eINSTANCE.getGenApplication_SharedContributionItems() ||
			childFeature == GMFGenPackage.eINSTANCE.getGenApplication_MainMenu() ||
			childFeature == GMFGenPackage.eINSTANCE.getGenApplication_MainToolBar();

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
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
