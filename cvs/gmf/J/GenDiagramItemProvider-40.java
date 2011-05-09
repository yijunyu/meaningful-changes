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

			addContainedNodesPropertyDescriptor(object);
			addEditCommandsPackageNamePropertyDescriptor(object);
			addEditPartsPackageNamePropertyDescriptor(object);
			addEditPoliciesPackageNamePropertyDescriptor(object);
			addProvidersPackageNamePropertyDescriptor(object);
			addNotationViewFactoriesPackageNamePropertyDescriptor(object);
			addElementTypesClassNamePropertyDescriptor(object);
			addSemanticHintsClassNamePropertyDescriptor(object);
			addNotationViewProviderClassNamePropertyDescriptor(object);
			addNotationViewProviderPriorityPropertyDescriptor(object);
			addEditPartProviderClassNamePropertyDescriptor(object);
			addEditPartProviderPriorityPropertyDescriptor(object);
			addPaletteProviderClassNamePropertyDescriptor(object);
			addPaletteProviderPriorityPropertyDescriptor(object);
			addMetamodelSupportProviderClassNamePropertyDescriptor(object);
			addMetamodelSupportProviderPriorityPropertyDescriptor(object);
			addModelingAssistantProviderClassNamePropertyDescriptor(object);
			addModelingAssistantProviderPriorityPropertyDescriptor(object);
			addPropertyProviderClassNamePropertyDescriptor(object);
			addPropertyProviderPriorityPropertyDescriptor(object);
			addIconProviderClassNamePropertyDescriptor(object);
			addIconProviderPriorityPropertyDescriptor(object);
			addParserProviderClassNamePropertyDescriptor(object);
			addParserProviderPriorityPropertyDescriptor(object);
			addAbstractParserClassNamePropertyDescriptor(object);
			addStructuralFeatureParserClassNamePropertyDescriptor(object);
			addStructuralFeaturesParserClassNamePropertyDescriptor(object);
			addReorientConnectionViewCommandClassNamePropertyDescriptor(object);
			addEditPartFactoryClassNamePropertyDescriptor(object);
			addBaseExternalNodeLabelEditPartClassNamePropertyDescriptor(object);
			addBaseItemSemanticEditPolicyClassNamePropertyDescriptor(object);
			addBaseGraphicalNodeEditPolicyClassNamePropertyDescriptor(object);
			addReferenceConnectionEditPolicyClassNamePropertyDescriptor(object);
			addCanonicalEditPolicyClassNamePropertyDescriptor(object);
			addCreationWizardClassNamePropertyDescriptor(object);
			addCreationWizardPageClassNamePropertyDescriptor(object);
			addDiagramEditorUtilClassNamePropertyDescriptor(object);
			addDiagramFileCreatorClassNamePropertyDescriptor(object);
			addDocumentProviderClassNamePropertyDescriptor(object);
			addInitDiagramFileActionClassNamePropertyDescriptor(object);
			addMatchingStrategyClassNamePropertyDescriptor(object);
			addPreferenceInitializerClassNamePropertyDescriptor(object);
			addVisualIDRegistryClassNamePropertyDescriptor(object);
			addElementChooserClassNamePropertyDescriptor(object);
			addLoadResourceActionClassNamePropertyDescriptor(object);
			addCreateShortcutActionClassNamePropertyDescriptor(object);
			addContainsShortcutsToPropertyDescriptor(object);
			addShortcutsProvidedForPropertyDescriptor(object);
			addValidationProviderClassNamePropertyDescriptor(object);
			addValidationProviderPriorityPropertyDescriptor(object);
			addMarkerNavigationProviderClassNamePropertyDescriptor(object);
			addMarkerNavigationProviderPriorityPropertyDescriptor(object);
			addValidationEnabledPropertyDescriptor(object);
			addDomainDiagramElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Contained Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenContainerBase_containedNodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenContainerBase_containedNodes_feature", "_UI_GenContainerBase_type"),
				 GMFGenPackage.eINSTANCE.getGenContainerBase_ContainedNodes(),
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
				 getString("_UI_PackageNames_editCommandsPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageNames_editCommandsPackageName_feature", "_UI_PackageNames_type"),
				 GMFGenPackage.eINSTANCE.getPackageNames_EditCommandsPackageName(),
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
				 getString("_UI_PackageNames_editPartsPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageNames_editPartsPackageName_feature", "_UI_PackageNames_type"),
				 GMFGenPackage.eINSTANCE.getPackageNames_EditPartsPackageName(),
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
				 getString("_UI_PackageNames_editPoliciesPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageNames_editPoliciesPackageName_feature", "_UI_PackageNames_type"),
				 GMFGenPackage.eINSTANCE.getPackageNames_EditPoliciesPackageName(),
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
				 getString("_UI_EditorCandies_preferenceInitializerClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_preferenceInitializerClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_PreferenceInitializerClassName(),
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
				 getString("_UI_EditorCandies_visualIDRegistryClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_visualIDRegistryClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_VisualIDRegistryClassName(),
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
				 getString("_UI_Shortcuts_createShortcutActionClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shortcuts_createShortcutActionClassName_feature", "_UI_Shortcuts_type"),
				 GMFGenPackage.eINSTANCE.getShortcuts_CreateShortcutActionClassName(),
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
				 getString("_UI_EditorCandies_elementChooserClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_elementChooserClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_ElementChooserClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Load Resource Action Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadResourceActionClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditorCandies_loadResourceActionClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_loadResourceActionClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_LoadResourceActionClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contains Shortcuts To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainsShortcutsToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shortcuts_containsShortcutsTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shortcuts_containsShortcutsTo_feature", "_UI_Shortcuts_type"),
				 GMFGenPackage.eINSTANCE.getShortcuts_ContainsShortcutsTo(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shortcuts Provided For feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortcutsProvidedForPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shortcuts_shortcutsProvidedFor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shortcuts_shortcutsProvidedFor_feature", "_UI_Shortcuts_type"),
				 GMFGenPackage.eINSTANCE.getShortcuts_ShortcutsProvidedFor(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchValidation_validationProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchValidation_validationProviderClassName_feature", "_UI_BatchValidation_type"),
				 GMFGenPackage.eINSTANCE.getBatchValidation_ValidationProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchValidation_validationProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchValidation_validationProviderPriority_feature", "_UI_BatchValidation_type"),
				 GMFGenPackage.eINSTANCE.getBatchValidation_ValidationProviderPriority(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Marker Navigation Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMarkerNavigationProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchValidation_markerNavigationProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchValidation_markerNavigationProviderClassName_feature", "_UI_BatchValidation_type"),
				 GMFGenPackage.eINSTANCE.getBatchValidation_MarkerNavigationProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Marker Navigation Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMarkerNavigationProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchValidation_markerNavigationProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchValidation_markerNavigationProviderPriority_feature", "_UI_BatchValidation_type"),
				 GMFGenPackage.eINSTANCE.getBatchValidation_MarkerNavigationProviderPriority(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchValidation_validationEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchValidation_validationEnabled_feature", "_UI_BatchValidation_type"),
				 GMFGenPackage.eINSTANCE.getBatchValidation_ValidationEnabled(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_PackageNames_providersPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageNames_providersPackageName_feature", "_UI_PackageNames_type"),
				 GMFGenPackage.eINSTANCE.getPackageNames_ProvidersPackageName(),
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
				 getString("_UI_PackageNames_notationViewFactoriesPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageNames_notationViewFactoriesPackageName_feature", "_UI_PackageNames_type"),
				 GMFGenPackage.eINSTANCE.getPackageNames_NotationViewFactoriesPackageName(),
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
				 getString("_UI_EditorCandies_documentProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_documentProviderClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_DocumentProviderClassName(),
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
				 getString("_UI_EditPartCandies_editPartFactoryClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditPartCandies_editPartFactoryClassName_feature", "_UI_EditPartCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditPartCandies_EditPartFactoryClassName(),
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
				 getString("_UI_EditPartCandies_baseExternalNodeLabelEditPartClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditPartCandies_baseExternalNodeLabelEditPartClassName_feature", "_UI_EditPartCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditPartCandies_BaseExternalNodeLabelEditPartClassName(),
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
				 getString("_UI_EditPartCandies_baseItemSemanticEditPolicyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditPartCandies_baseItemSemanticEditPolicyClassName_feature", "_UI_EditPartCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditPartCandies_BaseItemSemanticEditPolicyClassName(),
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
				 getString("_UI_EditPartCandies_baseGraphicalNodeEditPolicyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditPartCandies_baseGraphicalNodeEditPolicyClassName_feature", "_UI_EditPartCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditPartCandies_BaseGraphicalNodeEditPolicyClassName(),
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
				 getString("_UI_EditPartCandies_referenceConnectionEditPolicyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditPartCandies_referenceConnectionEditPolicyClassName_feature", "_UI_EditPartCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditPartCandies_ReferenceConnectionEditPolicyClassName(),
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
				 getString("_UI_EditPartCandies_canonicalEditPolicyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditPartCandies_canonicalEditPolicyClassName_feature", "_UI_EditPartCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditPartCandies_CanonicalEditPolicyClassName(),
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
				 getString("_UI_ProviderClassNames_elementTypesClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_elementTypesClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_ElementTypesClassName(),
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
				 getString("_UI_ProviderClassNames_semanticHintsClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_semanticHintsClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_SemanticHintsClassName(),
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
				 getString("_UI_ProviderClassNames_notationViewProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_notationViewProviderClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_NotationViewProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notation View Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotationViewProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_notationViewProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_notationViewProviderPriority_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_NotationViewProviderPriority(),
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
				 getString("_UI_EditPartCandies_reorientConnectionViewCommandClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditPartCandies_reorientConnectionViewCommandClassName_feature", "_UI_EditPartCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditPartCandies_ReorientConnectionViewCommandClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_EditorCandies_initDiagramFileActionClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_initDiagramFileActionClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_InitDiagramFileActionClassName(),
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
				 getString("_UI_EditorCandies_creationWizardClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_creationWizardClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_CreationWizardClassName(),
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
				 getString("_UI_EditorCandies_creationWizardPageClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_creationWizardPageClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_CreationWizardPageClassName(),
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
				 getString("_UI_EditorCandies_diagramEditorUtilClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_diagramEditorUtilClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_DiagramEditorUtilClassName(),
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
				 getString("_UI_EditorCandies_diagramFileCreatorClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_diagramFileCreatorClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_DiagramFileCreatorClassName(),
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
				 getString("_UI_EditorCandies_matchingStrategyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_matchingStrategyClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_MatchingStrategyClassName(),
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
				 getString("_UI_ProviderClassNames_editPartProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_editPartProviderClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_EditPartProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edit Part Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditPartProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_editPartProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_editPartProviderPriority_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_EditPartProviderPriority(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Palette Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaletteProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_paletteProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_paletteProviderClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_PaletteProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Palette Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaletteProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_paletteProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_paletteProviderPriority_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_PaletteProviderPriority(),
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
				 getString("_UI_ProviderClassNames_metamodelSupportProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_metamodelSupportProviderClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_MetamodelSupportProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Metamodel Support Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetamodelSupportProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_metamodelSupportProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_metamodelSupportProviderPriority_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_MetamodelSupportProviderPriority(),
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
				 getString("_UI_ProviderClassNames_modelingAssistantProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_modelingAssistantProviderClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_ModelingAssistantProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modeling Assistant Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelingAssistantProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_modelingAssistantProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_modelingAssistantProviderPriority_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_ModelingAssistantProviderPriority(),
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
				 getString("_UI_ProviderClassNames_propertyProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_propertyProviderClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_PropertyProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_propertyProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_propertyProviderPriority_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_PropertyProviderPriority(),
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
				 getString("_UI_ProviderClassNames_iconProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_iconProviderClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_IconProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Icon Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_iconProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_iconProviderPriority_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_IconProviderPriority(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parser Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParserProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_parserProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_parserProviderClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_ParserProviderClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parser Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParserProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_parserProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_parserProviderPriority_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_ParserProviderPriority(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract Parser Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractParserClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_abstractParserClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_abstractParserClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_AbstractParserClassName(),
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
				 getString("_UI_ProviderClassNames_structuralFeatureParserClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_structuralFeatureParserClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_StructuralFeatureParserClassName(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Structural Features Parser Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStructuralFeaturesParserClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_structuralFeaturesParserClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_structuralFeaturesParserClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_StructuralFeaturesParserClassName(),
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
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenDiagram_ChildNodes());
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenDiagram_TopLevelNodes());
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenDiagram_Links());
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenDiagram_Compartments());
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
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__METAMODEL_SUPPORT_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__ABSTRACT_PARSER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURES_PARSER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_CREATOR_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__LOAD_RESOURCE_ACTION_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CONTAINS_SHORTCUTS_TO:
			case GMFGenPackage.GEN_DIAGRAM__SHORTCUTS_PROVIDED_FOR:
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_ENABLED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGenPackage.GEN_DIAGRAM__CHILD_NODES:
			case GMFGenPackage.GEN_DIAGRAM__TOP_LEVEL_NODES:
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
			case GMFGenPackage.GEN_DIAGRAM__COMPARTMENTS:
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
				(GMFGenPackage.eINSTANCE.getGenDiagram_ChildNodes(),
				 GMFGenFactory.eINSTANCE.createGenChildNode()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_TopLevelNodes(),
				 GMFGenFactory.eINSTANCE.createGenTopLevelNode()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_Links(),
				 GMFGenFactory.eINSTANCE.createGenLink()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_Compartments(),
				 GMFGenFactory.eINSTANCE.createGenCompartment()));

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
