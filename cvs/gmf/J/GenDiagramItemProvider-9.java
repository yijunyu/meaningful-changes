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
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.presentation.EditorPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.codegen.gmfgen.GenDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenDiagramItemProvider
	extends GenCommonBaseItemProvider
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
	public GenDiagramItemProvider(AdapterFactory adapterFactory) {
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

			addDomainMetaModelPropertyDescriptor(object);
			addDomainDiagramElementPropertyDescriptor(object);
			addEditPartsPackageNamePropertyDescriptor(object);
			addPluginNamePropertyDescriptor(object);
			addProviderNamePropertyDescriptor(object);
			addPluginIDPropertyDescriptor(object);
			addPluginClassNamePropertyDescriptor(object);
			addEditorPackageNamePropertyDescriptor(object);
			addProvidersPackageNamePropertyDescriptor(object);
			addEditorClassNamePropertyDescriptor(object);
			addEditPartFactoryClassNamePropertyDescriptor(object);
			addHasDomainModelPropertyDescriptor(object);
			addDiagramFileExtensionPropertyDescriptor(object);
			addSameFileForDiagramAndModelPropertyDescriptor(object);
			addInitDiagramFileActionClassNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Domain Meta Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainMetaModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_domainMetaModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_domainMetaModel_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_DomainMetaModel(),
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Diagram Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainDiagramElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_domainDiagramElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_domainDiagramElement_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_DomainDiagramElement(),
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edit Parts Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditPartsPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_editPartsPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_editPartsPackageName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_EditPartsPackageName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugin Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluginNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_pluginName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_pluginName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_PluginName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provider Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProviderNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_providerName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_providerName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_ProviderName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugin ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluginIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_pluginID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_pluginID_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_PluginID(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugin Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluginClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_pluginClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_pluginClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_PluginClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Editor Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditorPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_editorPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_editorPackageName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_EditorPackageName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Providers Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidersPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_providersPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_providersPackageName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_ProvidersPackageName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Editor Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditorClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_editorClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_editorClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_EditorClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edit Part Factory Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditPartFactoryClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_editPartFactoryClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_editPartFactoryClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_EditPartFactoryClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Domain Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDomainModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_hasDomainModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_hasDomainModel_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_HasDomainModel(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagram File Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramFileExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_diagramFileExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_diagramFileExtension_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_DiagramFileExtension(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Same File For Diagram And Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSameFileForDiagramAndModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_sameFileForDiagramAndModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_sameFileForDiagramAndModel_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_SameFileForDiagramAndModel(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init Diagram File Action Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitDiagramFileActionClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_initDiagramFileActionClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_initDiagramFileActionClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_InitDiagramFileActionClassName(),
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
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenDiagram_Nodes());
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenDiagram_Links());
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenDiagram_Palette());
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
	 * This returns GenDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/GenDiagram");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((GenDiagram)object).getEditPartClassName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenDiagram_type") :
			getString("_UI_GenDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(GenDiagram.class)) {
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID:
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__HAS_DOMAIN_MODEL:
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION:
			case GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGenPackage.GEN_DIAGRAM__NODES:
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
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
				(GMFGenPackage.eINSTANCE.getGenDiagram_Nodes(),
				 GMFGenFactory.eINSTANCE.createGenNode()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_Nodes(),
				 GMFGenFactory.eINSTANCE.createGenChildNode()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_Links(),
				 GMFGenFactory.eINSTANCE.createGenLinkWithClass()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_Links(),
				 GMFGenFactory.eINSTANCE.createGenLinkReferenceOnly()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_Palette(),
				 GMFGenFactory.eINSTANCE.createPalette()));
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
