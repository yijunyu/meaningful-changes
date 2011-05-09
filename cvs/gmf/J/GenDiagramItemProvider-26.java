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
			addEditCommandsPackageNamePropertyDescriptor(object);
			addEditPartsPackageNamePropertyDescriptor(object);
			addEditPoliciesPackageNamePropertyDescriptor(object);
			addEditorPackageNamePropertyDescriptor(object);
			addProvidersPackageNamePropertyDescriptor(object);
			addNotationViewFactoriesPackageNamePropertyDescriptor(object);
			addPluginIDPropertyDescriptor(object);
			addPluginNamePropertyDescriptor(object);
			addProviderNamePropertyDescriptor(object);
			addSameFileForDiagramAndModelPropertyDescriptor(object);
			addPrintingEnabledPropertyDescriptor(object);
			addDiagramFileExtensionPropertyDescriptor(object);
			addReorientConnectionViewCommandClassNamePropertyDescriptor(object);
			addEditPartFactoryClassNamePropertyDescriptor(object);
			addBaseExternalNodeLabelEditPartClassNamePropertyDescriptor(object);
			addBaseItemSemanticEditPolicyClassNamePropertyDescriptor(object);
			addBaseGraphicalNodeEditPolicyClassNamePropertyDescriptor(object);
			addReferenceConnectionEditPolicyClassNamePropertyDescriptor(object);
			addCanonicalEditPolicyClassNamePropertyDescriptor(object);
			addElementTypesClassNamePropertyDescriptor(object);
			addSemanticHintsClassNamePropertyDescriptor(object);
			addNotationViewProviderClassNamePropertyDescriptor(object);
			addEditPartProviderClassNamePropertyDescriptor(object);
			addMetamodelSupportProviderClassNamePropertyDescriptor(object);
			addModelingAssistantProviderClassNamePropertyDescriptor(object);
			addPropertyProviderClassNamePropertyDescriptor(object);
			addIconProviderClassNamePropertyDescriptor(object);
			addStructuralFeatureParserClassNamePropertyDescriptor(object);
			addActionBarContributorClassNamePropertyDescriptor(object);
			addCreationWizardClassNamePropertyDescriptor(object);
			addCreationWizardPageClassNamePropertyDescriptor(object);
			addDiagramEditorUtilClassNamePropertyDescriptor(object);
			addDiagramFileCreatorClassNamePropertyDescriptor(object);
			addDocumentProviderClassNamePropertyDescriptor(object);
			addEditorClassNamePropertyDescriptor(object);
			addInitDiagramFileActionClassNamePropertyDescriptor(object);
			addMatchingStrategyClassNamePropertyDescriptor(object);
			addPluginClassNamePropertyDescriptor(object);
			addPreferenceInitializerClassNamePropertyDescriptor(object);
			addVisualIDRegistryClassNamePropertyDescriptor(object);
			addCreateShortcutActionClassNamePropertyDescriptor(object);
			addElementChooserClassNamePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Edit Commands Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditCommandsPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_editCommandsPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_editCommandsPackageName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_EditCommandsPackageName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	 * This adds a property descriptor for the Edit Policies Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditPoliciesPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_editPoliciesPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_editPoliciesPackageName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_EditPoliciesPackageName(),
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
	 * This adds a property descriptor for the Preference Initializer Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreferenceInitializerClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_preferenceInitializerClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_preferenceInitializerClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_PreferenceInitializerClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visual ID Registry Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisualIDRegistryClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_visualIDRegistryClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_visualIDRegistryClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_VisualIDRegistryClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Shortcut Action Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateShortcutActionClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_createShortcutActionClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_createShortcutActionClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_CreateShortcutActionClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Chooser Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementChooserClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_elementChooserClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_elementChooserClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_ElementChooserClassName(),
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
	 * This adds a property descriptor for the Notation View Factories Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotationViewFactoriesPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_notationViewFactoriesPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_notationViewFactoriesPackageName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_NotationViewFactoriesPackageName(),
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
	 * This adds a property descriptor for the Document Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_documentProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_documentProviderClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_DocumentProviderClassName(),
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
	 * This adds a property descriptor for the Base External Node Label Edit Part Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseExternalNodeLabelEditPartClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_baseExternalNodeLabelEditPartClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_baseExternalNodeLabelEditPartClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_BaseExternalNodeLabelEditPartClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Item Semantic Edit Policy Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseItemSemanticEditPolicyClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_baseItemSemanticEditPolicyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_baseItemSemanticEditPolicyClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_BaseItemSemanticEditPolicyClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Graphical Node Edit Policy Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseGraphicalNodeEditPolicyClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_baseGraphicalNodeEditPolicyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_baseGraphicalNodeEditPolicyClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_BaseGraphicalNodeEditPolicyClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference Connection Edit Policy Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferenceConnectionEditPolicyClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_referenceConnectionEditPolicyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_referenceConnectionEditPolicyClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_ReferenceConnectionEditPolicyClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Canonical Edit Policy Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanonicalEditPolicyClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_canonicalEditPolicyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_canonicalEditPolicyClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_CanonicalEditPolicyClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Types Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementTypesClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_elementTypesClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_elementTypesClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_ElementTypesClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semantic Hints Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticHintsClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_semanticHintsClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_semanticHintsClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_SemanticHintsClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notation View Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotationViewProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_notationViewProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_notationViewProviderClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_NotationViewProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	 * This adds a property descriptor for the Reorient Connection View Command Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReorientConnectionViewCommandClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_reorientConnectionViewCommandClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_reorientConnectionViewCommandClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_ReorientConnectionViewCommandClassName(),
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
	 * This adds a property descriptor for the Printing Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrintingEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_printingEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_printingEnabled_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_PrintingEnabled(),
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
	 * This adds a property descriptor for the Action Bar Contributor Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionBarContributorClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_actionBarContributorClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_actionBarContributorClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_ActionBarContributorClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Wizard Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationWizardClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_creationWizardClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_creationWizardClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_CreationWizardClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Wizard Page Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationWizardPageClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_creationWizardPageClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_creationWizardPageClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_CreationWizardPageClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagram Editor Util Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramEditorUtilClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_diagramEditorUtilClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_diagramEditorUtilClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_DiagramEditorUtilClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagram File Creator Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramFileCreatorClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_diagramFileCreatorClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_diagramFileCreatorClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_DiagramFileCreatorClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Matching Strategy Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMatchingStrategyClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_matchingStrategyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_matchingStrategyClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_MatchingStrategyClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edit Part Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditPartProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_editPartProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_editPartProviderClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_EditPartProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Metamodel Support Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetamodelSupportProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_metamodelSupportProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_metamodelSupportProviderClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_MetamodelSupportProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modeling Assistant Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelingAssistantProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_modelingAssistantProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_modelingAssistantProviderClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_ModelingAssistantProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_propertyProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_propertyProviderClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_PropertyProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Icon Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_iconProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_iconProviderClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_IconProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Structural Feature Parser Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStructuralFeatureParserClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_structuralFeatureParserClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_structuralFeatureParserClassName_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_StructuralFeatureParserClassName(),
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
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenDiagram_Audits());
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
			case GMFGenPackage.GEN_DIAGRAM__EDIT_COMMANDS_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID:
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME:
			case GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
			case GMFGenPackage.GEN_DIAGRAM__PRINTING_ENABLED:
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION:
			case GMFGenPackage.GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__ACTION_BAR_CONTRIBUTOR_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_CREATOR_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGenPackage.GEN_DIAGRAM__NODES:
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
			case GMFGenPackage.GEN_DIAGRAM__AUDITS:
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
				 GMFGenFactory.eINSTANCE.createGenLink()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_Audits(),
				 GMFGenFactory.eINSTANCE.createGenAuditContainer()));

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
