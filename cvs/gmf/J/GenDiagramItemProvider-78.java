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

			addCanonicalEditPolicyClassNamePropertyDescriptor(object);
			addEditCommandsPackageNamePropertyDescriptor(object);
			addEditHelpersPackageNamePropertyDescriptor(object);
			addEditPartsPackageNamePropertyDescriptor(object);
			addEditPoliciesPackageNamePropertyDescriptor(object);
			addPreferencesPackageNamePropertyDescriptor(object);
			addProvidersPackageNamePropertyDescriptor(object);
			addNotationViewFactoriesPackageNamePropertyDescriptor(object);
			addElementTypesClassNamePropertyDescriptor(object);
			addNotationViewProviderClassNamePropertyDescriptor(object);
			addNotationViewProviderPriorityPropertyDescriptor(object);
			addEditPartProviderClassNamePropertyDescriptor(object);
			addEditPartProviderPriorityPropertyDescriptor(object);
			addModelingAssistantProviderClassNamePropertyDescriptor(object);
			addModelingAssistantProviderPriorityPropertyDescriptor(object);
			addIconProviderClassNamePropertyDescriptor(object);
			addIconProviderPriorityPropertyDescriptor(object);
			addParserProviderClassNamePropertyDescriptor(object);
			addParserProviderPriorityPropertyDescriptor(object);
			addAbstractParserClassNamePropertyDescriptor(object);
			addStructuralFeatureParserClassNamePropertyDescriptor(object);
			addStructuralFeaturesParserClassNamePropertyDescriptor(object);
			addContributionItemProviderClassNamePropertyDescriptor(object);
			addReorientConnectionViewCommandClassNamePropertyDescriptor(object);
			addBaseEditHelperClassNamePropertyDescriptor(object);
			addEditPartFactoryClassNamePropertyDescriptor(object);
			addBaseExternalNodeLabelEditPartClassNamePropertyDescriptor(object);
			addBaseItemSemanticEditPolicyClassNamePropertyDescriptor(object);
			addBaseGraphicalNodeEditPolicyClassNamePropertyDescriptor(object);
			addTextSelectionEditPolicyClassNamePropertyDescriptor(object);
			addTextNonResizableEditPolicyClassNamePropertyDescriptor(object);
			addCreationWizardClassNamePropertyDescriptor(object);
			addCreationWizardPageClassNamePropertyDescriptor(object);
			addCreationWizardIconPathPropertyDescriptor(object);
			addCreationWizardCategoryIDPropertyDescriptor(object);
			addDiagramEditorUtilClassNamePropertyDescriptor(object);
			addDocumentProviderClassNamePropertyDescriptor(object);
			addInitDiagramFileActionClassNamePropertyDescriptor(object);
			addNewDiagramFileWizardClassNamePropertyDescriptor(object);
			addMatchingStrategyClassNamePropertyDescriptor(object);
			addVisualIDRegistryClassNamePropertyDescriptor(object);
			addElementChooserClassNamePropertyDescriptor(object);
			addLoadResourceActionClassNamePropertyDescriptor(object);
			addEditingDomainIDPropertyDescriptor(object);
			addShortcutsDecoratorProviderClassNamePropertyDescriptor(object);
			addShortcutsDecoratorProviderPriorityPropertyDescriptor(object);
			addCreateShortcutActionClassNamePropertyDescriptor(object);
			addCreateShortcutDecorationsCommandClassNamePropertyDescriptor(object);
			addShortcutPropertyTesterClassNamePropertyDescriptor(object);
			addContainsShortcutsToPropertyDescriptor(object);
			addShortcutsProvidedForPropertyDescriptor(object);
			addValidationProviderClassNamePropertyDescriptor(object);
			addValidationProviderPriorityPropertyDescriptor(object);
			addMarkerNavigationProviderClassNamePropertyDescriptor(object);
			addMarkerNavigationProviderPriorityPropertyDescriptor(object);
			addValidationEnabledPropertyDescriptor(object);
			addMetricProviderClassNamePropertyDescriptor(object);
			addMetricProviderPriorityPropertyDescriptor(object);
			addValidationDecoratorProviderClassNamePropertyDescriptor(object);
			addValidationDecoratorsPropertyDescriptor(object);
			addValidationDecoratorProviderPriorityPropertyDescriptor(object);
			addLiveValidationUIFeedbackPropertyDescriptor(object);
			addUnitsPropertyDescriptor(object);
			addDomainDiagramElementPropertyDescriptor(object);
			addSynchronizedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 false,
				 false,
				 null,
				 getString("_UI_DiagramElementPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Synchronized feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSynchronizedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDiagram_synchronized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDiagram_synchronized_feature", "_UI_GenDiagram_type"),
				 GMFGenPackage.eINSTANCE.getGenDiagram_Synchronized(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DiagramPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditCommandsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Edit Helpers Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditHelpersPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PackageNames_editHelpersPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageNames_editHelpersPackageName_feature", "_UI_PackageNames_type"),
				 GMFGenPackage.eINSTANCE.getPackageNames_EditHelpersPackageName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditHelpersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditPartsPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditPoliciesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Preferences Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreferencesPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PackageNames_preferencesPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageNames_preferencesPackageName_feature", "_UI_PackageNames_type"),
				 GMFGenPackage.eINSTANCE.getPackageNames_PreferencesPackageName(),
				 true,
				 false,
				 false,
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Shortcut Decorations Command Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateShortcutDecorationsCommandClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shortcuts_createShortcutDecorationsCommandClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shortcuts_createShortcutDecorationsCommandClassName_feature", "_UI_Shortcuts_type"),
				 GMFGenPackage.eINSTANCE.getShortcuts_CreateShortcutDecorationsCommandClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shortcut Property Tester Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortcutPropertyTesterClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shortcuts_shortcutPropertyTesterClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shortcuts_shortcutPropertyTesterClassName_feature", "_UI_Shortcuts_type"),
				 GMFGenPackage.eINSTANCE.getShortcuts_ShortcutPropertyTesterClassName(),
				 true,
				 false,
				 false,
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Editing Domain ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditingDomainIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditorCandies_editingDomainID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_editingDomainID_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_EditingDomainID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Shortcuts Decorator Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortcutsDecoratorProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shortcuts_shortcutsDecoratorProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shortcuts_shortcutsDecoratorProviderClassName_feature", "_UI_Shortcuts_type"),
				 GMFGenPackage.eINSTANCE.getShortcuts_ShortcutsDecoratorProviderClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Shortcuts Decorator Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortcutsDecoratorProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shortcuts_shortcutsDecoratorProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shortcuts_shortcutsDecoratorProviderPriority_feature", "_UI_Shortcuts_type"),
				 GMFGenPackage.eINSTANCE.getShortcuts_ShortcutsDecoratorProviderPriority(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DiagramPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DiagramPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DiagramPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Metric Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetricProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchValidation_metricProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchValidation_metricProviderClassName_feature", "_UI_BatchValidation_type"),
				 GMFGenPackage.eINSTANCE.getBatchValidation_MetricProviderClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Metric Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetricProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchValidation_metricProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchValidation_metricProviderPriority_feature", "_UI_BatchValidation_type"),
				 GMFGenPackage.eINSTANCE.getBatchValidation_MetricProviderPriority(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Decorator Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationDecoratorProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchValidation_validationDecoratorProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchValidation_validationDecoratorProviderClassName_feature", "_UI_BatchValidation_type"),
				 GMFGenPackage.eINSTANCE.getBatchValidation_ValidationDecoratorProviderClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Decorators feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationDecoratorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchValidation_validationDecorators_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchValidation_validationDecorators_feature", "_UI_BatchValidation_type"),
				 GMFGenPackage.eINSTANCE.getBatchValidation_ValidationDecorators(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DiagramPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Decorator Provider Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationDecoratorProviderPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchValidation_validationDecoratorProviderPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchValidation_validationDecoratorProviderPriority_feature", "_UI_BatchValidation_type"),
				 GMFGenPackage.eINSTANCE.getBatchValidation_ValidationDecoratorProviderPriority(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Live Validation UI Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLiveValidationUIFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchValidation_liveValidationUIFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchValidation_liveValidationUIFeedback_feature", "_UI_BatchValidation_type"),
				 GMFGenPackage.eINSTANCE.getBatchValidation_LiveValidationUIFeedback(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DiagramPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MeasurementUnit_units_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MeasurementUnit_units_feature", "_UI_MeasurementUnit_type"),
				 GMFGenPackage.eINSTANCE.getMeasurementUnit_Units(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DiagramPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ViewFactoriesPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditPartsPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditPartsPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditPoliciesPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditPoliciesPropertyCategory"),
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
				 getString("_UI_GenContainerBase_canonicalEditPolicyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenContainerBase_canonicalEditPolicyClassName_feature", "_UI_GenContainerBase_type"),
				 GMFGenPackage.eINSTANCE.getGenContainerBase_CanonicalEditPolicyClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditPoliciesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Selection Edit Policy Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextSelectionEditPolicyClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditPartCandies_textSelectionEditPolicyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditPartCandies_textSelectionEditPolicyClassName_feature", "_UI_EditPartCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditPartCandies_TextSelectionEditPolicyClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditPoliciesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Non Resizable Edit Policy Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextNonResizableEditPolicyClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditPartCandies_textNonResizableEditPolicyClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditPartCandies_textNonResizableEditPolicyClassName_feature", "_UI_EditPartCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditPartCandies_TextNonResizableEditPolicyClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditPoliciesPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditCommandsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Edit Helper Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseEditHelperClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditPartCandies_baseEditHelperClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditPartCandies_baseEditHelperClassName_feature", "_UI_EditPartCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditPartCandies_BaseEditHelperClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditHelpersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the New Diagram File Wizard Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewDiagramFileWizardClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditorCandies_newDiagramFileWizardClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_newDiagramFileWizardClassName_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_NewDiagramFileWizardClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Wizard Icon Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationWizardIconPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditorCandies_creationWizardIconPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_creationWizardIconPath_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_CreationWizardIconPath(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Wizard Category ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationWizardCategoryIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditorCandies_creationWizardCategoryID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditorCandies_creationWizardCategoryID_feature", "_UI_EditorCandies_type"),
				 GMFGenPackage.eINSTANCE.getEditorCandies_CreationWizardCategoryID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditorPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Contribution Item Provider Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContributionItemProviderClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProviderClassNames_contributionItemProviderClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProviderClassNames_contributionItemProviderClassName_feature", "_UI_ProviderClassNames_type"),
				 GMFGenPackage.eINSTANCE.getProviderClassNames_ContributionItemProviderClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ProvidersPropertyCategory"),
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
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenDiagram_Preferences());
			childrenFeatures.add(GMFGenPackage.eINSTANCE.getGenDiagram_PreferencePages());
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
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenDiagram"));
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
			case GMFGenPackage.GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_COMMANDS_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_HELPERS_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCES_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME:
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__ABSTRACT_PARSER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURES_PARSER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CONTRIBUTION_ITEM_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__BASE_EDIT_HELPER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__TEXT_SELECTION_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__TEXT_NON_RESIZABLE_EDIT_POLICY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_ICON_PATH:
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_CATEGORY_ID:
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__NEW_DIAGRAM_FILE_WIZARD_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__LOAD_RESOURCE_ACTION_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__EDITING_DOMAIN_ID:
			case GMFGenPackage.GEN_DIAGRAM__SHORTCUTS_DECORATOR_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__SHORTCUTS_DECORATOR_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CREATE_SHORTCUT_DECORATIONS_COMMAND_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__SHORTCUT_PROPERTY_TESTER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__CONTAINS_SHORTCUTS_TO:
			case GMFGenPackage.GEN_DIAGRAM__SHORTCUTS_PROVIDED_FOR:
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_ENABLED:
			case GMFGenPackage.GEN_DIAGRAM__METRIC_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__METRIC_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_DECORATOR_PROVIDER_CLASS_NAME:
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_DECORATORS:
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_DECORATOR_PROVIDER_PRIORITY:
			case GMFGenPackage.GEN_DIAGRAM__LIVE_VALIDATION_UI_FEEDBACK:
			case GMFGenPackage.GEN_DIAGRAM__UNITS:
			case GMFGenPackage.GEN_DIAGRAM__SYNCHRONIZED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGenPackage.GEN_DIAGRAM__CHILD_NODES:
			case GMFGenPackage.GEN_DIAGRAM__TOP_LEVEL_NODES:
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
			case GMFGenPackage.GEN_DIAGRAM__COMPARTMENTS:
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCES:
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_PAGES:
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
				(GMFGenPackage.eINSTANCE.getGenDiagram_ChildNodes(),
				 GMFGenFactory.eINSTANCE.createGenChildSideAffixedNode()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_ChildNodes(),
				 GMFGenFactory.eINSTANCE.createGenChildLabelNode()));

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

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_Preferences(),
				 GMFGenFactory.eINSTANCE.createGenDiagramPreferences()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_PreferencePages(),
				 GMFGenFactory.eINSTANCE.createGenCustomPreferencePage()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGenPackage.eINSTANCE.getGenDiagram_PreferencePages(),
				 GMFGenFactory.eINSTANCE.createGenStandardPreferencePage()));
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
