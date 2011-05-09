/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.LinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;

import org.eclipse.gmf.codegen.gmfgen.Viewmap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDomainMetaModel <em>Domain Meta Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDomainDiagramElement <em>Domain Diagram Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPalette <em>Palette</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditPartsPackageName <em>Edit Parts Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditPoliciesPackageName <em>Edit Policies Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditorPackageName <em>Editor Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getProvidersPackageName <em>Providers Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getNotationViewFactoriesPackageName <em>Notation View Factories Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPluginID <em>Plugin ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#isPrintingEnabled <em>Printing Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#isHasDomainModel <em>Has Domain Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDiagramFileExtension <em>Diagram File Extension</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditPartFactoryClassName <em>Edit Part Factory Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getBaseItemSemanticEditPolicyClassName <em>Base Item Semantic Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getReferenceConnectionEditPolicyClassName <em>Reference Connection Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getElementTypesClassName <em>Element Types Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getSemanticHintsClassName <em>Semantic Hints Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getNotationViewProviderClassName <em>Notation View Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditPartProviderClassName <em>Edit Part Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getMetamodelSupportProviderClassName <em>Metamodel Support Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getModelingAssistantProviderClassName <em>Modeling Assistant Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPropertyProviderClassName <em>Property Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getIconProviderClassName <em>Icon Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getStructuralFeatureParserClassName <em>Structural Feature Parser Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getActionBarContributorClassName <em>Action Bar Contributor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getCreationWizardClassName <em>Creation Wizard Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getCreationWizardPageClassName <em>Creation Wizard Page Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDiagramEditorUtilClassName <em>Diagram Editor Util Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDiagramFileCreatorClassName <em>Diagram File Creator Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDocumentProviderClassName <em>Document Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditorClassName <em>Editor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getInitDiagramFileActionClassName <em>Init Diagram File Action Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getMatchingStrategyClassName <em>Matching Strategy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPluginClassName <em>Plugin Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPreferenceInitializerClassName <em>Preference Initializer Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getVisualIDRegistryClassName <em>Visual ID Registry Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDiagramImpl extends GenCommonBaseImpl implements GenDiagram {

	/**
	 * The cached value of the '{@link #getDomainMetaModel() <em>Domain Meta Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainMetaModel()
	 * @generated
	 * @ordered
	 */
	protected GenPackage domainMetaModel = null;

	/**
	 * The cached value of the '{@link #getDomainDiagramElement() <em>Domain Diagram Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected GenClass domainDiagramElement = null;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList nodes = null;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList links = null;

	/**
	 * The cached value of the '{@link #getPalette() <em>Palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalette()
	 * @generated
	 * @ordered
	 */
	protected Palette palette = null;

	/**
	 * The default value of the '{@link #getEditPartsPackageName() <em>Edit Parts Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartsPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_PARTS_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditPartsPackageName() <em>Edit Parts Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartsPackageName()
	 * @generated
	 * @ordered
	 */
	protected String editPartsPackageName = EDIT_PARTS_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditPoliciesPackageName() <em>Edit Policies Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPoliciesPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_POLICIES_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditPoliciesPackageName() <em>Edit Policies Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPoliciesPackageName()
	 * @generated
	 * @ordered
	 */
	protected String editPoliciesPackageName = EDIT_POLICIES_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditorPackageName() <em>Editor Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITOR_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditorPackageName() <em>Editor Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorPackageName()
	 * @generated
	 * @ordered
	 */
	protected String editorPackageName = EDITOR_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvidersPackageName() <em>Providers Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidersPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDERS_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvidersPackageName() <em>Providers Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidersPackageName()
	 * @generated
	 * @ordered
	 */
	protected String providersPackageName = PROVIDERS_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotationViewFactoriesPackageName() <em>Notation View Factories Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationViewFactoriesPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTATION_VIEW_FACTORIES_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotationViewFactoriesPackageName() <em>Notation View Factories Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationViewFactoriesPackageName()
	 * @generated
	 * @ordered
	 */
	protected String notationViewFactoriesPackageName = NOTATION_VIEW_FACTORIES_PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginID() <em>Plugin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginID()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginID() <em>Plugin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginID()
	 * @generated
	 * @ordered
	 */
	protected String pluginID = PLUGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginName() <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginName() <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginName()
	 * @generated
	 * @ordered
	 */
	protected String pluginName = PLUGIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NAME_EDEFAULT = "Sample Plugin Provider, Inc";

	/**
	 * The cached value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected String providerName = PROVIDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isSameFileForDiagramAndModel() <em>Same File For Diagram And Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameFileForDiagramAndModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAME_FILE_FOR_DIAGRAM_AND_MODEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSameFileForDiagramAndModel() <em>Same File For Diagram And Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameFileForDiagramAndModel()
	 * @generated
	 * @ordered
	 */
	protected boolean sameFileForDiagramAndModel = SAME_FILE_FOR_DIAGRAM_AND_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrintingEnabled() <em>Printing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrintingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRINTING_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrintingEnabled() <em>Printing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrintingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean printingEnabled = PRINTING_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasDomainModel() <em>Has Domain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasDomainModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_DOMAIN_MODEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasDomainModel() <em>Has Domain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasDomainModel()
	 * @generated
	 * @ordered
	 */
	protected boolean hasDomainModel = HAS_DOMAIN_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagramFileExtension() <em>Diagram File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramFileExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_FILE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramFileExtension() <em>Diagram File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramFileExtension()
	 * @generated
	 * @ordered
	 */
	protected String diagramFileExtension = DIAGRAM_FILE_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditPartFactoryClassName() <em>Edit Part Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditPartFactoryClassName() <em>Edit Part Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected String editPartFactoryClassName = EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseItemSemanticEditPolicyClassName() <em>Base Item Semantic Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseItemSemanticEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseItemSemanticEditPolicyClassName() <em>Base Item Semantic Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseItemSemanticEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected String baseItemSemanticEditPolicyClassName = BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceConnectionEditPolicyClassName() <em>Reference Connection Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceConnectionEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceConnectionEditPolicyClassName() <em>Reference Connection Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceConnectionEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected String referenceConnectionEditPolicyClassName = REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementTypesClassName() <em>Element Types Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementTypesClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_TYPES_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementTypesClassName() <em>Element Types Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementTypesClassName()
	 * @generated
	 * @ordered
	 */
	protected String elementTypesClassName = ELEMENT_TYPES_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemanticHintsClassName() <em>Semantic Hints Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticHintsClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_HINTS_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticHintsClassName() <em>Semantic Hints Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticHintsClassName()
	 * @generated
	 * @ordered
	 */
	protected String semanticHintsClassName = SEMANTIC_HINTS_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotationViewProviderClassName() <em>Notation View Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationViewProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTATION_VIEW_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotationViewProviderClassName() <em>Notation View Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationViewProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String notationViewProviderClassName = NOTATION_VIEW_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditPartProviderClassName() <em>Edit Part Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_PART_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditPartProviderClassName() <em>Edit Part Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String editPartProviderClassName = EDIT_PART_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetamodelSupportProviderClassName() <em>Metamodel Support Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelSupportProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_SUPPORT_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodelSupportProviderClassName() <em>Metamodel Support Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelSupportProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String metamodelSupportProviderClassName = METAMODEL_SUPPORT_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelingAssistantProviderClassName() <em>Modeling Assistant Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingAssistantProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODELING_ASSISTANT_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelingAssistantProviderClassName() <em>Modeling Assistant Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingAssistantProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String modelingAssistantProviderClassName = MODELING_ASSISTANT_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyProviderClassName() <em>Property Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyProviderClassName() <em>Property Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String propertyProviderClassName = PROPERTY_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconProviderClassName() <em>Icon Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconProviderClassName() <em>Icon Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String iconProviderClassName = ICON_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStructuralFeatureParserClassName() <em>Structural Feature Parser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralFeatureParserClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String STRUCTURAL_FEATURE_PARSER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructuralFeatureParserClassName() <em>Structural Feature Parser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralFeatureParserClassName()
	 * @generated
	 * @ordered
	 */
	protected String structuralFeatureParserClassName = STRUCTURAL_FEATURE_PARSER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionBarContributorClassName() <em>Action Bar Contributor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionBarContributorClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_BAR_CONTRIBUTOR_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionBarContributorClassName() <em>Action Bar Contributor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionBarContributorClassName()
	 * @generated
	 * @ordered
	 */
	protected String actionBarContributorClassName = ACTION_BAR_CONTRIBUTOR_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationWizardClassName() <em>Creation Wizard Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationWizardClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_WIZARD_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationWizardClassName() <em>Creation Wizard Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationWizardClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationWizardClassName = CREATION_WIZARD_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationWizardPageClassName() <em>Creation Wizard Page Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationWizardPageClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_WIZARD_PAGE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationWizardPageClassName() <em>Creation Wizard Page Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationWizardPageClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationWizardPageClassName = CREATION_WIZARD_PAGE_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagramEditorUtilClassName() <em>Diagram Editor Util Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramEditorUtilClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_EDITOR_UTIL_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramEditorUtilClassName() <em>Diagram Editor Util Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramEditorUtilClassName()
	 * @generated
	 * @ordered
	 */
	protected String diagramEditorUtilClassName = DIAGRAM_EDITOR_UTIL_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagramFileCreatorClassName() <em>Diagram File Creator Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramFileCreatorClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_FILE_CREATOR_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramFileCreatorClassName() <em>Diagram File Creator Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramFileCreatorClassName()
	 * @generated
	 * @ordered
	 */
	protected String diagramFileCreatorClassName = DIAGRAM_FILE_CREATOR_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentProviderClassName() <em>Document Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentProviderClassName() <em>Document Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String documentProviderClassName = DOCUMENT_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditorClassName() <em>Editor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITOR_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditorClassName() <em>Editor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorClassName()
	 * @generated
	 * @ordered
	 */
	protected String editorClassName = EDITOR_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitDiagramFileActionClassName() <em>Init Diagram File Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitDiagramFileActionClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitDiagramFileActionClassName() <em>Init Diagram File Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitDiagramFileActionClassName()
	 * @generated
	 * @ordered
	 */
	protected String initDiagramFileActionClassName = INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchingStrategyClassName() <em>Matching Strategy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingStrategyClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCHING_STRATEGY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchingStrategyClassName() <em>Matching Strategy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingStrategyClassName()
	 * @generated
	 * @ordered
	 */
	protected String matchingStrategyClassName = MATCHING_STRATEGY_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginClassName() <em>Plugin Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginClassName() <em>Plugin Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginClassName()
	 * @generated
	 * @ordered
	 */
	protected String pluginClassName = PLUGIN_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferenceInitializerClassName() <em>Preference Initializer Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferenceInitializerClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERENCE_INITIALIZER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferenceInitializerClassName() <em>Preference Initializer Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferenceInitializerClassName()
	 * @generated
	 * @ordered
	 */
	protected String preferenceInitializerClassName = PREFERENCE_INITIALIZER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisualIDRegistryClassName() <em>Visual ID Registry Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualIDRegistryClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String VISUAL_ID_REGISTRY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisualIDRegistryClassName() <em>Visual ID Registry Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualIDRegistryClassName()
	 * @generated
	 * @ordered
	 */
	protected String visualIDRegistryClassName = VISUAL_ID_REGISTRY_CLASS_NAME_EDEFAULT;

	private static final String DIAGRAM_EDITOR_TOKEN = "gmf.editor";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenDiagram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage getDomainMetaModel() {
		if (domainMetaModel != null && domainMetaModel.eIsProxy()) {
			GenPackage oldDomainMetaModel = domainMetaModel;
			domainMetaModel = (GenPackage)eResolveProxy((InternalEObject)domainMetaModel);
			if (domainMetaModel != oldDomainMetaModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL, oldDomainMetaModel, domainMetaModel));
			}
		}
		return domainMetaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage basicGetDomainMetaModel() {
		return domainMetaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainMetaModel(GenPackage newDomainMetaModel) {
		GenPackage oldDomainMetaModel = domainMetaModel;
		domainMetaModel = newDomainMetaModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL, oldDomainMetaModel, domainMetaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getDomainDiagramElement() {
		if (domainDiagramElement != null && domainDiagramElement.eIsProxy()) {
			GenClass oldDomainDiagramElement = domainDiagramElement;
			domainDiagramElement = (GenClass)eResolveProxy((InternalEObject)domainDiagramElement);
			if (domainDiagramElement != oldDomainDiagramElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT, oldDomainDiagramElement, domainDiagramElement));
			}
		}
		return domainDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass basicGetDomainDiagramElement() {
		return domainDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainDiagramElement(GenClass newDomainDiagramElement) {
		GenClass oldDomainDiagramElement = domainDiagramElement;
		domainDiagramElement = newDomainDiagramElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT, oldDomainDiagramElement, domainDiagramElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList(GenNode.class, this, GMFGenPackage.GEN_DIAGRAM__NODES, GMFGenPackage.GEN_NODE__DIAGRAM);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLinks() {
		if (links == null) {
			links = new EObjectContainmentWithInverseEList(GenLink.class, this, GMFGenPackage.GEN_DIAGRAM__LINKS, GMFGenPackage.GEN_LINK__DIAGRAM);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette getPalette() {
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPalette(Palette newPalette, NotificationChain msgs) {
		Palette oldPalette = palette;
		palette = newPalette;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PALETTE, oldPalette, newPalette);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalette(Palette newPalette) {
		if (newPalette != palette) {
			NotificationChain msgs = null;
			if (palette != null)
				msgs = ((InternalEObject)palette).eInverseRemove(this, GMFGenPackage.PALETTE__DIAGRAM, Palette.class, msgs);
			if (newPalette != null)
				msgs = ((InternalEObject)newPalette).eInverseAdd(this, GMFGenPackage.PALETTE__DIAGRAM, Palette.class, msgs);
			msgs = basicSetPalette(newPalette, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PALETTE, newPalette, newPalette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditPartsPackageNameGen() {
		return editPartsPackageName;
	}

	public String getEditPartsPackageName() {
		String value = getEditPartsPackageNameGen();
		if (value == null || value.length() == 0) {
			return getPackageNamePrefix() + ".edit.parts";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditPartsPackageName(String newEditPartsPackageName) {
		String oldEditPartsPackageName = editPartsPackageName;
		editPartsPackageName = newEditPartsPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME, oldEditPartsPackageName, editPartsPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditPoliciesPackageNameGen() {
		return editPoliciesPackageName;
	}

	public String getEditPoliciesPackageName() {
		String value = getEditPoliciesPackageNameGen();
		if (value == null || value.length() == 0) {
			return getPackageNamePrefix() + ".edit.policies";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditPoliciesPackageName(String newEditPoliciesPackageName) {
		String oldEditPoliciesPackageName = editPoliciesPackageName;
		editPoliciesPackageName = newEditPoliciesPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME, oldEditPoliciesPackageName, editPoliciesPackageName));
	}

	public String getClassNamePrefix() {
		String prefix;
		if (getDomainDiagramElement() != null) {
			prefix = getDomainDiagramElement().getName();
		} else {
			char[] v = getDomainMetaModel().getEcorePackage().getName().toCharArray();
			v[0] = Character.toUpperCase(v[0]);
			prefix = new String(v);
		}
		return prefix;
	}

	public String getClassNameSuffux() {
		return "Diagram";
	}

	public GenDiagram getDiagram() {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginName() {
		return pluginName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginName(String newPluginName) {
		String oldPluginName = pluginName;
		pluginName = newPluginName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME, oldPluginName, pluginName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderName(String newProviderName) {
		String oldProviderName = providerName;
		providerName = newProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME, oldProviderName, providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginIDGen() {
		return pluginID;
	}

	public String getPluginID() {
		String value = getPluginIDGen();
		if (value == null || value.length() == 0) {
			return getEMFGenModel().getModelPluginID() + '.' + DIAGRAM_EDITOR_TOKEN;
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginID(String newPluginID) {
		String oldPluginID = pluginID;
		pluginID = newPluginID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID, oldPluginID, pluginID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginClassNameGen() {
		return pluginClassName;
	}

	public String getPluginClassName() {
		String value = getPluginClassNameGen();
		if (value == null || value.length() == 0) {
			return CodeGenUtil.validJavaIdentifier(getEMFGenModel().getModelName()) + "DiagramEditorPlugin";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginClassName(String newPluginClassName) {
		String oldPluginClassName = pluginClassName;
		pluginClassName = newPluginClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME, oldPluginClassName, pluginClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreferenceInitializerClassNameGen() {
		return preferenceInitializerClassName;
	}

	public String getPreferenceInitializerClassName() {
		String name = getPreferenceInitializerClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "DiagramPreferenceInitializer"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferenceInitializerClassName(String newPreferenceInitializerClassName) {
		String oldPreferenceInitializerClassName = preferenceInitializerClassName;
		preferenceInitializerClassName = newPreferenceInitializerClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME, oldPreferenceInitializerClassName, preferenceInitializerClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisualIDRegistryClassNameGen() {
		return visualIDRegistryClassName;
	}

	public String getVisualIDRegistryClassName() {
		String name = getVisualIDRegistryClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "VisualIDRegistry"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualIDRegistryClassName(String newVisualIDRegistryClassName) {
		String oldVisualIDRegistryClassName = visualIDRegistryClassName;
		visualIDRegistryClassName = newVisualIDRegistryClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME, oldVisualIDRegistryClassName, visualIDRegistryClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditorPackageNameGen() {
		return editorPackageName;
	}

	public String getEditorPackageName() {
		String value = getEditorPackageNameGen();
		if (value == null || value.length() == 0) {
			return getPackageNamePrefix() + ".part";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditorPackageName(String newEditorPackageName) {
		String oldEditorPackageName = editorPackageName;
		editorPackageName = newEditorPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME, oldEditorPackageName, editorPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvidersPackageNameGen() {
		return providersPackageName;
	}

	public String getProvidersPackageName() {
		String value = getProvidersPackageNameGen();
		if (value == null || value.length() == 0) {
			return getPackageNamePrefix() + ".providers";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidersPackageName(String newProvidersPackageName) {
		String oldProvidersPackageName = providersPackageName;
		providersPackageName = newProvidersPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME, oldProvidersPackageName, providersPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotationViewFactoriesPackageNameGen() {
		return notationViewFactoriesPackageName;
	}

	public String getNotationViewFactoriesPackageName() {
		String value = getNotationViewFactoriesPackageNameGen();
		if (value == null || value.length() == 0) {
			return getPackageNamePrefix() + ".view.factories";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotationViewFactoriesPackageName(String newNotationViewFactoriesPackageName) {
		String oldNotationViewFactoriesPackageName = notationViewFactoriesPackageName;
		notationViewFactoriesPackageName = newNotationViewFactoriesPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME, oldNotationViewFactoriesPackageName, notationViewFactoriesPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditorClassNameGen() {
		return editorClassName;
	}

	public String getEditorClassName() {
		String name = getEditorClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "DiagramEditor"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditorClassName(String newEditorClassName) {
		String oldEditorClassName = editorClassName;
		editorClassName = newEditorClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME, oldEditorClassName, editorClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentProviderClassNameGen() {
		return documentProviderClassName;
	}

	public String getDocumentProviderClassName() {
		String name = getDocumentProviderClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "DocumentProvider"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentProviderClassName(String newDocumentProviderClassName) {
		String oldDocumentProviderClassName = documentProviderClassName;
		documentProviderClassName = newDocumentProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME, oldDocumentProviderClassName, documentProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditPartFactoryClassNameGen() {
		return editPartFactoryClassName;
	}

	public String getEditPartFactoryClassName() {
		String name = getEditPartFactoryClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "EditPartFactory"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditPartFactoryClassName(String newEditPartFactoryClassName) {
		String oldEditPartFactoryClassName = editPartFactoryClassName;
		editPartFactoryClassName = newEditPartFactoryClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME, oldEditPartFactoryClassName, editPartFactoryClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseItemSemanticEditPolicyClassNameGen() {
		return baseItemSemanticEditPolicyClassName;
	}

	public String getBaseItemSemanticEditPolicyClassName() {
		String name = getBaseItemSemanticEditPolicyClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "ItemSemanticEditPolicy"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseItemSemanticEditPolicyClassName(String newBaseItemSemanticEditPolicyClassName) {
		String oldBaseItemSemanticEditPolicyClassName = baseItemSemanticEditPolicyClassName;
		baseItemSemanticEditPolicyClassName = newBaseItemSemanticEditPolicyClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME, oldBaseItemSemanticEditPolicyClassName, baseItemSemanticEditPolicyClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceConnectionEditPolicyClassNameGen() {
		return referenceConnectionEditPolicyClassName;
	}

	public String getReferenceConnectionEditPolicyClassName() {
		String name = getReferenceConnectionEditPolicyClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "ReferenceConnectionEditPolicy"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceConnectionEditPolicyClassName(String newReferenceConnectionEditPolicyClassName) {
		String oldReferenceConnectionEditPolicyClassName = referenceConnectionEditPolicyClassName;
		referenceConnectionEditPolicyClassName = newReferenceConnectionEditPolicyClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME, oldReferenceConnectionEditPolicyClassName, referenceConnectionEditPolicyClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementTypesClassNameGen() {
		return elementTypesClassName;
	}

	public String getElementTypesClassName() {
		String name = getElementTypesClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "ElementTypes"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementTypesClassName(String newElementTypesClassName) {
		String oldElementTypesClassName = elementTypesClassName;
		elementTypesClassName = newElementTypesClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME, oldElementTypesClassName, elementTypesClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemanticHintsClassNameGen() {
		return semanticHintsClassName;
	}

	public String getSemanticHintsClassName() {
		String name = getSemanticHintsClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "SemanticHints"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticHintsClassName(String newSemanticHintsClassName) {
		String oldSemanticHintsClassName = semanticHintsClassName;
		semanticHintsClassName = newSemanticHintsClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME, oldSemanticHintsClassName, semanticHintsClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotationViewProviderClassNameGen() {
		return notationViewProviderClassName;
	}

	public String getNotationViewProviderClassName() {
		String name = getNotationViewProviderClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "ViewProvider"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotationViewProviderClassName(String newNotationViewProviderClassName) {
		String oldNotationViewProviderClassName = notationViewProviderClassName;
		notationViewProviderClassName = newNotationViewProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME, oldNotationViewProviderClassName, notationViewProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasDomainModel() {
		return hasDomainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDomainModel(boolean newHasDomainModel) {
		boolean oldHasDomainModel = hasDomainModel;
		hasDomainModel = newHasDomainModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__HAS_DOMAIN_MODEL, oldHasDomainModel, hasDomainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramFileExtensionGen() {
		return diagramFileExtension;
	}

	public String getDiagramFileExtension() {
		String value = getDiagramFileExtensionGen();
		if (value == null || value.trim().length() == 0) {
			return getEMFGenModel().getModelName().toLowerCase() + "_diagram";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramFileExtension(String newDiagramFileExtension) {
		String oldDiagramFileExtension = diagramFileExtension;
		diagramFileExtension = newDiagramFileExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION, oldDiagramFileExtension, diagramFileExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSameFileForDiagramAndModel() {
		return sameFileForDiagramAndModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameFileForDiagramAndModel(boolean newSameFileForDiagramAndModel) {
		boolean oldSameFileForDiagramAndModel = sameFileForDiagramAndModel;
		sameFileForDiagramAndModel = newSameFileForDiagramAndModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL, oldSameFileForDiagramAndModel, sameFileForDiagramAndModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrintingEnabled() {
		return printingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintingEnabled(boolean newPrintingEnabled) {
		boolean oldPrintingEnabled = printingEnabled;
		printingEnabled = newPrintingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PRINTING_ENABLED, oldPrintingEnabled, printingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitDiagramFileActionClassNameGen() {
		return initDiagramFileActionClassName;
	}

	public String getInitDiagramFileActionClassName() {
		String name = getInitDiagramFileActionClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "InitDiagramFileAction"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitDiagramFileActionClassName(String newInitDiagramFileActionClassName) {
		String oldInitDiagramFileActionClassName = initDiagramFileActionClassName;
		initDiagramFileActionClassName = newInitDiagramFileActionClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME, oldInitDiagramFileActionClassName, initDiagramFileActionClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionBarContributorClassNameGen() {
		return actionBarContributorClassName;
	}

	public String getActionBarContributorClassName() {
		String name = getActionBarContributorClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "DiagramActionBarContributor"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionBarContributorClassName(String newActionBarContributorClassName) {
		String oldActionBarContributorClassName = actionBarContributorClassName;
		actionBarContributorClassName = newActionBarContributorClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__ACTION_BAR_CONTRIBUTOR_CLASS_NAME, oldActionBarContributorClassName, actionBarContributorClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationWizardClassNameGen() {
		return creationWizardClassName;
	}

	public String getCreationWizardClassName() {
		String name = getCreationWizardClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "CreationWizard"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationWizardClassName(String newCreationWizardClassName) {
		String oldCreationWizardClassName = creationWizardClassName;
		creationWizardClassName = newCreationWizardClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME, oldCreationWizardClassName, creationWizardClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationWizardPageClassNameGen() {
		return creationWizardPageClassName;
	}

	public String getCreationWizardPageClassName() {
		String name = getCreationWizardPageClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "CreationWizardPage"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationWizardPageClassName(String newCreationWizardPageClassName) {
		String oldCreationWizardPageClassName = creationWizardPageClassName;
		creationWizardPageClassName = newCreationWizardPageClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME, oldCreationWizardPageClassName, creationWizardPageClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramEditorUtilClassNameGen() {
		return diagramEditorUtilClassName;
	}

	public String getDiagramEditorUtilClassName() {
		String name = getDiagramEditorUtilClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "DiagramEditorUtil"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramEditorUtilClassName(String newDiagramEditorUtilClassName) {
		String oldDiagramEditorUtilClassName = diagramEditorUtilClassName;
		diagramEditorUtilClassName = newDiagramEditorUtilClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME, oldDiagramEditorUtilClassName, diagramEditorUtilClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramFileCreatorClassNameGen() {
		return diagramFileCreatorClassName;
	}

	public String getDiagramFileCreatorClassName() {
		String name = getDiagramFileCreatorClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "DiagramFileCreator"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramFileCreatorClassName(String newDiagramFileCreatorClassName) {
		String oldDiagramFileCreatorClassName = diagramFileCreatorClassName;
		diagramFileCreatorClassName = newDiagramFileCreatorClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_CREATOR_CLASS_NAME, oldDiagramFileCreatorClassName, diagramFileCreatorClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatchingStrategyClassNameGen() {
		return matchingStrategyClassName;
	}

	public String getMatchingStrategyClassName() {
		String name = getMatchingStrategyClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "MatchingStrategy"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingStrategyClassName(String newMatchingStrategyClassName) {
		String oldMatchingStrategyClassName = matchingStrategyClassName;
		matchingStrategyClassName = newMatchingStrategyClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME, oldMatchingStrategyClassName, matchingStrategyClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditPartProviderClassNameGen() {
		return editPartProviderClassName;
	}

	public String getEditPartProviderClassName() {
		String name = getEditPartProviderClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "EditPartProvider"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditPartProviderClassName(String newEditPartProviderClassName) {
		String oldEditPartProviderClassName = editPartProviderClassName;
		editPartProviderClassName = newEditPartProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME, oldEditPartProviderClassName, editPartProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodelSupportProviderClassNameGen() {
		return metamodelSupportProviderClassName;
	}

	public String getMetamodelSupportProviderClassName() {
		String name = getMetamodelSupportProviderClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "MetaModelSupportProvider"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelSupportProviderClassName(String newMetamodelSupportProviderClassName) {
		String oldMetamodelSupportProviderClassName = metamodelSupportProviderClassName;
		metamodelSupportProviderClassName = newMetamodelSupportProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME, oldMetamodelSupportProviderClassName, metamodelSupportProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelingAssistantProviderClassNameGen() {
		return modelingAssistantProviderClassName;
	}

	public String getModelingAssistantProviderClassName() {
		String name = getModelingAssistantProviderClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "ModelingAssistantProvider"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelingAssistantProviderClassName(String newModelingAssistantProviderClassName) {
		String oldModelingAssistantProviderClassName = modelingAssistantProviderClassName;
		modelingAssistantProviderClassName = newModelingAssistantProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME, oldModelingAssistantProviderClassName, modelingAssistantProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyProviderClassNameGen() {
		return propertyProviderClassName;
	}

	public String getPropertyProviderClassName() {
		String name = getPropertyProviderClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "PropertyProvider"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyProviderClassName(String newPropertyProviderClassName) {
		String oldPropertyProviderClassName = propertyProviderClassName;
		propertyProviderClassName = newPropertyProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME, oldPropertyProviderClassName, propertyProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIconProviderClassNameGen() {
		return iconProviderClassName;
	}

	public String getIconProviderClassName() {
		String name = getIconProviderClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "IconProvider"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconProviderClassName(String newIconProviderClassName) {
		String oldIconProviderClassName = iconProviderClassName;
		iconProviderClassName = newIconProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME, oldIconProviderClassName, iconProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStructuralFeatureParserClassNameGen() {
		return structuralFeatureParserClassName;
	}

	public String getStructuralFeatureParserClassName() {
		String name = getStructuralFeatureParserClassNameGen();
		if (name == null) {
			return getDomainPackageCapName() + "StructuralFeatureParser"; //$NON-NLS-1$
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuralFeatureParserClassName(String newStructuralFeatureParserClassName) {
		String oldStructuralFeatureParserClassName = structuralFeatureParserClassName;
		structuralFeatureParserClassName = newStructuralFeatureParserClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME, oldStructuralFeatureParserClassName, structuralFeatureParserClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenModel getEMFGenModel() {
		return getDomainMetaModel().getGenModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPluginQualifiedClassName() {
		return getEditorPackageName() + '.' + getPluginClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPreferenceInitializerQualifiedClassName() {
		return getEditorPackageName() + '.' + getPreferenceInitializerClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getVisualIDRegistryQualifiedClassName() {
		return getEditorPackageName() + '.' + getVisualIDRegistryClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEditorQualifiedClassName() {
		return getEditorPackageName() + '.' + getEditorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEditPartFactoryQualifiedClassName() {
		return getEditPartsPackageName() + '.' + getEditPartFactoryClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getBaseItemSemanticEditPolicyQualifiedClassName() {
		return getEditPoliciesPackageName() + '.' + getBaseItemSemanticEditPolicyClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getReferenceConnectionEditPolicyQualifiedClassName() {
		return getEditPoliciesPackageName() + '.' + getReferenceConnectionEditPolicyClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getElementTypesQualifiedClassName() {
		return getProvidersPackageName() + '.' + getElementTypesClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSemanticHintsQualifiedClassName() {
		return getProvidersPackageName() + '.' + getSemanticHintsClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getNotationViewProviderQualifiedClassName() {
		return getProvidersPackageName() + '.' + getNotationViewProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String[] getRequiredPluginIDs() {
		ArrayList requiredPlugins = new ArrayList();
		if (usesSVGShapes()) {
			requiredPlugins.add("org.eclipse.gmf.diagramrt.gefsvg");
		}
		
		requiredPlugins.addAll(getExpressionsRequiredPluginIDs());
		return (String[]) requiredPlugins.toArray(new String[requiredPlugins.size()]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getInitDiagramFileActionQualifiedClassName() {
		return getEditorPackageName() + '.' + getInitDiagramFileActionClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEditPartProviderQualifiedClassName() {
		return getProvidersPackageName() + '.' + getEditPartProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMetamodelSupportProviderQualifiedClassName() {
		return getProvidersPackageName() + '.' + getMetamodelSupportProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getModelingAssistantProviderQualifiedClassName() {
		return getProvidersPackageName() + '.' + getModelingAssistantProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPropertyProviderQualifiedClassName() {
		return getProvidersPackageName() + '.' + getPropertyProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getIconProviderQualifiedClassName() {
		return getProvidersPackageName() + '.' + getIconProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStructuralFeatureParserQualifiedClassName() {
		return getProvidersPackageName() + '.' + getStructuralFeatureParserClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getActionBarContributorQualifiedClassName() {
		return getEditorPackageName() + '.' + getActionBarContributorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCreationWizardQualifiedClassName() {
		return getEditorPackageName() + '.' + getCreationWizardClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCreationWizardPageQualifiedClassName() {
		return getEditorPackageName() + '.' + getCreationWizardPageClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDiagramEditorUtilQualifiedClassName() {
		return getEditorPackageName() + '.' + getDiagramEditorUtilClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDiagramFileCreatorQualifiedClassName() {
		return getEditorPackageName() + '.' + getDiagramFileCreatorClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDocumentProviderQualifiedClassName() {
		return getEditorPackageName() + '.' + getDocumentProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMatchingStrategyQualifiedClassName() {
		return getEditorPackageName() + '.' + getMatchingStrategyClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getElementInitializersClassName() {
		return "ElementInitializers"; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getElementInitializersPackageName() {
		return getProvidersPackageName();
	}
	
	private boolean usesSVGShapes() {
/* couldn't tell now
		for (Iterator it = getNodes().iterator(); it.hasNext();) {
			if (((GenNode) it.next()).getViewmapURI() != null) {
				return true;
			}
		}
*/
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_DIAGRAM__NODES:
					return ((InternalEList)getNodes()).basicAdd(otherEnd, msgs);
				case GMFGenPackage.GEN_DIAGRAM__LINKS:
					return ((InternalEList)getLinks()).basicAdd(otherEnd, msgs);
				case GMFGenPackage.GEN_DIAGRAM__PALETTE:
					if (palette != null)
						msgs = ((InternalEObject)palette).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM__PALETTE, null, msgs);
					return basicSetPalette((Palette)otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_DIAGRAM__VIEWMAP:
					return basicSetViewmap(null, msgs);
				case GMFGenPackage.GEN_DIAGRAM__NODES:
					return ((InternalEList)getNodes()).basicRemove(otherEnd, msgs);
				case GMFGenPackage.GEN_DIAGRAM__LINKS:
					return ((InternalEList)getLinks()).basicRemove(otherEnd, msgs);
				case GMFGenPackage.GEN_DIAGRAM__PALETTE:
					return basicSetPalette(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_RUN_TIME_CLASS:
				if (resolve) return getDiagramRunTimeClass();
				return basicGetDiagramRunTimeClass();
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID:
				return new Integer(getVisualID());
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_CLASS_NAME:
				return getEditPartClassName();
			case GMFGenPackage.GEN_DIAGRAM__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return getItemSemanticEditPolicyClassName();
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return getNotationViewFactoryClassName();
			case GMFGenPackage.GEN_DIAGRAM__VIEWMAP:
				return getViewmap();
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL:
				if (resolve) return getDomainMetaModel();
				return basicGetDomainMetaModel();
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				if (resolve) return getDomainDiagramElement();
				return basicGetDomainDiagramElement();
			case GMFGenPackage.GEN_DIAGRAM__NODES:
				return getNodes();
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				return getLinks();
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				return getPalette();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				return getEditPartsPackageName();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME:
				return getEditPoliciesPackageName();
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME:
				return getEditorPackageName();
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				return getProvidersPackageName();
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME:
				return getNotationViewFactoriesPackageName();
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID:
				return getPluginID();
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME:
				return getPluginName();
			case GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME:
				return getProviderName();
			case GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				return isSameFileForDiagramAndModel() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM__PRINTING_ENABLED:
				return isPrintingEnabled() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM__HAS_DOMAIN_MODEL:
				return isHasDomainModel() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION:
				return getDiagramFileExtension();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				return getEditPartFactoryClassName();
			case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return getBaseItemSemanticEditPolicyClassName();
			case GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME:
				return getReferenceConnectionEditPolicyClassName();
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME:
				return getElementTypesClassName();
			case GMFGenPackage.GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME:
				return getSemanticHintsClassName();
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME:
				return getNotationViewProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME:
				return getEditPartProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME:
				return getMetamodelSupportProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME:
				return getModelingAssistantProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME:
				return getPropertyProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME:
				return getIconProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME:
				return getStructuralFeatureParserClassName();
			case GMFGenPackage.GEN_DIAGRAM__ACTION_BAR_CONTRIBUTOR_CLASS_NAME:
				return getActionBarContributorClassName();
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME:
				return getCreationWizardClassName();
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME:
				return getCreationWizardPageClassName();
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME:
				return getDiagramEditorUtilClassName();
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_CREATOR_CLASS_NAME:
				return getDiagramFileCreatorClassName();
			case GMFGenPackage.GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME:
				return getDocumentProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME:
				return getEditorClassName();
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				return getInitDiagramFileActionClassName();
			case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME:
				return getMatchingStrategyClassName();
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME:
				return getPluginClassName();
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME:
				return getPreferenceInitializerClassName();
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME:
				return getVisualIDRegistryClassName();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_CLASS_NAME:
				setEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setItemSemanticEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VIEWMAP:
				setViewmap((Viewmap)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL:
				setDomainMetaModel((GenPackage)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				setDomainDiagramElement((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				setPalette((Palette)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				setEditPartsPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME:
				setEditPoliciesPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME:
				setEditorPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				setProvidersPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME:
				setNotationViewFactoriesPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID:
				setPluginID((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME:
				setPluginName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME:
				setProviderName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				setSameFileForDiagramAndModel(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM__PRINTING_ENABLED:
				setPrintingEnabled(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM__HAS_DOMAIN_MODEL:
				setHasDomainModel(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION:
				setDiagramFileExtension((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				setEditPartFactoryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setBaseItemSemanticEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME:
				setReferenceConnectionEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME:
				setElementTypesClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME:
				setSemanticHintsClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME:
				setNotationViewProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME:
				setEditPartProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME:
				setMetamodelSupportProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME:
				setModelingAssistantProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME:
				setPropertyProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME:
				setIconProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME:
				setStructuralFeatureParserClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ACTION_BAR_CONTRIBUTOR_CLASS_NAME:
				setActionBarContributorClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME:
				setCreationWizardClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME:
				setCreationWizardPageClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME:
				setDiagramEditorUtilClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_CREATOR_CLASS_NAME:
				setDiagramFileCreatorClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME:
				setDocumentProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME:
				setEditorClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				setInitDiagramFileActionClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME:
				setMatchingStrategyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME:
				setPluginClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME:
				setPreferenceInitializerClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME:
				setVisualIDRegistryClassName((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_CLASS_NAME:
				setEditPartClassName(EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setItemSemanticEditPolicyClassName(ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName(NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VIEWMAP:
				setViewmap((Viewmap)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL:
				setDomainMetaModel((GenPackage)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				setDomainDiagramElement((GenClass)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NODES:
				getNodes().clear();
				return;
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				getLinks().clear();
				return;
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				setPalette((Palette)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				setEditPartsPackageName(EDIT_PARTS_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME:
				setEditPoliciesPackageName(EDIT_POLICIES_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME:
				setEditorPackageName(EDITOR_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				setProvidersPackageName(PROVIDERS_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME:
				setNotationViewFactoriesPackageName(NOTATION_VIEW_FACTORIES_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID:
				setPluginID(PLUGIN_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME:
				setPluginName(PLUGIN_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME:
				setProviderName(PROVIDER_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				setSameFileForDiagramAndModel(SAME_FILE_FOR_DIAGRAM_AND_MODEL_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PRINTING_ENABLED:
				setPrintingEnabled(PRINTING_ENABLED_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__HAS_DOMAIN_MODEL:
				setHasDomainModel(HAS_DOMAIN_MODEL_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION:
				setDiagramFileExtension(DIAGRAM_FILE_EXTENSION_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				setEditPartFactoryClassName(EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setBaseItemSemanticEditPolicyClassName(BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME:
				setReferenceConnectionEditPolicyClassName(REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME:
				setElementTypesClassName(ELEMENT_TYPES_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME:
				setSemanticHintsClassName(SEMANTIC_HINTS_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME:
				setNotationViewProviderClassName(NOTATION_VIEW_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME:
				setEditPartProviderClassName(EDIT_PART_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME:
				setMetamodelSupportProviderClassName(METAMODEL_SUPPORT_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME:
				setModelingAssistantProviderClassName(MODELING_ASSISTANT_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME:
				setPropertyProviderClassName(PROPERTY_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME:
				setIconProviderClassName(ICON_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME:
				setStructuralFeatureParserClassName(STRUCTURAL_FEATURE_PARSER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ACTION_BAR_CONTRIBUTOR_CLASS_NAME:
				setActionBarContributorClassName(ACTION_BAR_CONTRIBUTOR_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME:
				setCreationWizardClassName(CREATION_WIZARD_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME:
				setCreationWizardPageClassName(CREATION_WIZARD_PAGE_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME:
				setDiagramEditorUtilClassName(DIAGRAM_EDITOR_UTIL_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_CREATOR_CLASS_NAME:
				setDiagramFileCreatorClassName(DIAGRAM_FILE_CREATOR_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME:
				setDocumentProviderClassName(DOCUMENT_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME:
				setEditorClassName(EDITOR_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				setInitDiagramFileActionClassName(INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME:
				setMatchingStrategyClassName(MATCHING_STRATEGY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME:
				setPluginClassName(PLUGIN_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME:
				setPreferenceInitializerClassName(PREFERENCE_INITIALIZER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME:
				setVisualIDRegistryClassName(VISUAL_ID_REGISTRY_CLASS_NAME_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_RUN_TIME_CLASS:
				return diagramRunTimeClass != null;
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_CLASS_NAME:
				return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : !EDIT_PART_CLASS_NAME_EDEFAULT.equals(editPartClassName);
			case GMFGenPackage.GEN_DIAGRAM__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? itemSemanticEditPolicyClassName != null : !ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(itemSemanticEditPolicyClassName);
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT == null ? notationViewFactoryClassName != null : !NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT.equals(notationViewFactoryClassName);
			case GMFGenPackage.GEN_DIAGRAM__VIEWMAP:
				return viewmap != null;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_META_MODEL:
				return domainMetaModel != null;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				return domainDiagramElement != null;
			case GMFGenPackage.GEN_DIAGRAM__NODES:
				return nodes != null && !nodes.isEmpty();
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				return palette != null;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				return EDIT_PARTS_PACKAGE_NAME_EDEFAULT == null ? editPartsPackageName != null : !EDIT_PARTS_PACKAGE_NAME_EDEFAULT.equals(editPartsPackageName);
			case GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME:
				return EDIT_POLICIES_PACKAGE_NAME_EDEFAULT == null ? editPoliciesPackageName != null : !EDIT_POLICIES_PACKAGE_NAME_EDEFAULT.equals(editPoliciesPackageName);
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_PACKAGE_NAME:
				return EDITOR_PACKAGE_NAME_EDEFAULT == null ? editorPackageName != null : !EDITOR_PACKAGE_NAME_EDEFAULT.equals(editorPackageName);
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				return PROVIDERS_PACKAGE_NAME_EDEFAULT == null ? providersPackageName != null : !PROVIDERS_PACKAGE_NAME_EDEFAULT.equals(providersPackageName);
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME:
				return NOTATION_VIEW_FACTORIES_PACKAGE_NAME_EDEFAULT == null ? notationViewFactoriesPackageName != null : !NOTATION_VIEW_FACTORIES_PACKAGE_NAME_EDEFAULT.equals(notationViewFactoriesPackageName);
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_ID:
				return PLUGIN_ID_EDEFAULT == null ? pluginID != null : !PLUGIN_ID_EDEFAULT.equals(pluginID);
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_NAME:
				return PLUGIN_NAME_EDEFAULT == null ? pluginName != null : !PLUGIN_NAME_EDEFAULT.equals(pluginName);
			case GMFGenPackage.GEN_DIAGRAM__PROVIDER_NAME:
				return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
			case GMFGenPackage.GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL:
				return sameFileForDiagramAndModel != SAME_FILE_FOR_DIAGRAM_AND_MODEL_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__PRINTING_ENABLED:
				return printingEnabled != PRINTING_ENABLED_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__HAS_DOMAIN_MODEL:
				return hasDomainModel != HAS_DOMAIN_MODEL_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION:
				return DIAGRAM_FILE_EXTENSION_EDEFAULT == null ? diagramFileExtension != null : !DIAGRAM_FILE_EXTENSION_EDEFAULT.equals(diagramFileExtension);
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				return EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT == null ? editPartFactoryClassName != null : !EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT.equals(editPartFactoryClassName);
			case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? baseItemSemanticEditPolicyClassName != null : !BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(baseItemSemanticEditPolicyClassName);
			case GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME:
				return REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? referenceConnectionEditPolicyClassName != null : !REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(referenceConnectionEditPolicyClassName);
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME:
				return ELEMENT_TYPES_CLASS_NAME_EDEFAULT == null ? elementTypesClassName != null : !ELEMENT_TYPES_CLASS_NAME_EDEFAULT.equals(elementTypesClassName);
			case GMFGenPackage.GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME:
				return SEMANTIC_HINTS_CLASS_NAME_EDEFAULT == null ? semanticHintsClassName != null : !SEMANTIC_HINTS_CLASS_NAME_EDEFAULT.equals(semanticHintsClassName);
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME:
				return NOTATION_VIEW_PROVIDER_CLASS_NAME_EDEFAULT == null ? notationViewProviderClassName != null : !NOTATION_VIEW_PROVIDER_CLASS_NAME_EDEFAULT.equals(notationViewProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME:
				return EDIT_PART_PROVIDER_CLASS_NAME_EDEFAULT == null ? editPartProviderClassName != null : !EDIT_PART_PROVIDER_CLASS_NAME_EDEFAULT.equals(editPartProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME:
				return METAMODEL_SUPPORT_PROVIDER_CLASS_NAME_EDEFAULT == null ? metamodelSupportProviderClassName != null : !METAMODEL_SUPPORT_PROVIDER_CLASS_NAME_EDEFAULT.equals(metamodelSupportProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME:
				return MODELING_ASSISTANT_PROVIDER_CLASS_NAME_EDEFAULT == null ? modelingAssistantProviderClassName != null : !MODELING_ASSISTANT_PROVIDER_CLASS_NAME_EDEFAULT.equals(modelingAssistantProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME:
				return PROPERTY_PROVIDER_CLASS_NAME_EDEFAULT == null ? propertyProviderClassName != null : !PROPERTY_PROVIDER_CLASS_NAME_EDEFAULT.equals(propertyProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME:
				return ICON_PROVIDER_CLASS_NAME_EDEFAULT == null ? iconProviderClassName != null : !ICON_PROVIDER_CLASS_NAME_EDEFAULT.equals(iconProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME:
				return STRUCTURAL_FEATURE_PARSER_CLASS_NAME_EDEFAULT == null ? structuralFeatureParserClassName != null : !STRUCTURAL_FEATURE_PARSER_CLASS_NAME_EDEFAULT.equals(structuralFeatureParserClassName);
			case GMFGenPackage.GEN_DIAGRAM__ACTION_BAR_CONTRIBUTOR_CLASS_NAME:
				return ACTION_BAR_CONTRIBUTOR_CLASS_NAME_EDEFAULT == null ? actionBarContributorClassName != null : !ACTION_BAR_CONTRIBUTOR_CLASS_NAME_EDEFAULT.equals(actionBarContributorClassName);
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME:
				return CREATION_WIZARD_CLASS_NAME_EDEFAULT == null ? creationWizardClassName != null : !CREATION_WIZARD_CLASS_NAME_EDEFAULT.equals(creationWizardClassName);
			case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME:
				return CREATION_WIZARD_PAGE_CLASS_NAME_EDEFAULT == null ? creationWizardPageClassName != null : !CREATION_WIZARD_PAGE_CLASS_NAME_EDEFAULT.equals(creationWizardPageClassName);
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME:
				return DIAGRAM_EDITOR_UTIL_CLASS_NAME_EDEFAULT == null ? diagramEditorUtilClassName != null : !DIAGRAM_EDITOR_UTIL_CLASS_NAME_EDEFAULT.equals(diagramEditorUtilClassName);
			case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_CREATOR_CLASS_NAME:
				return DIAGRAM_FILE_CREATOR_CLASS_NAME_EDEFAULT == null ? diagramFileCreatorClassName != null : !DIAGRAM_FILE_CREATOR_CLASS_NAME_EDEFAULT.equals(diagramFileCreatorClassName);
			case GMFGenPackage.GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME:
				return DOCUMENT_PROVIDER_CLASS_NAME_EDEFAULT == null ? documentProviderClassName != null : !DOCUMENT_PROVIDER_CLASS_NAME_EDEFAULT.equals(documentProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_CLASS_NAME:
				return EDITOR_CLASS_NAME_EDEFAULT == null ? editorClassName != null : !EDITOR_CLASS_NAME_EDEFAULT.equals(editorClassName);
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				return INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT == null ? initDiagramFileActionClassName != null : !INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT.equals(initDiagramFileActionClassName);
			case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME:
				return MATCHING_STRATEGY_CLASS_NAME_EDEFAULT == null ? matchingStrategyClassName != null : !MATCHING_STRATEGY_CLASS_NAME_EDEFAULT.equals(matchingStrategyClassName);
			case GMFGenPackage.GEN_DIAGRAM__PLUGIN_CLASS_NAME:
				return PLUGIN_CLASS_NAME_EDEFAULT == null ? pluginClassName != null : !PLUGIN_CLASS_NAME_EDEFAULT.equals(pluginClassName);
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME:
				return PREFERENCE_INITIALIZER_CLASS_NAME_EDEFAULT == null ? preferenceInitializerClassName != null : !PREFERENCE_INITIALIZER_CLASS_NAME_EDEFAULT.equals(preferenceInitializerClassName);
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME:
				return VISUAL_ID_REGISTRY_CLASS_NAME_EDEFAULT == null ? visualIDRegistryClassName != null : !VISUAL_ID_REGISTRY_CLASS_NAME_EDEFAULT.equals(visualIDRegistryClassName);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (editPartsPackageName: ");
		result.append(editPartsPackageName);
		result.append(", editPoliciesPackageName: ");
		result.append(editPoliciesPackageName);
		result.append(", editorPackageName: ");
		result.append(editorPackageName);
		result.append(", providersPackageName: ");
		result.append(providersPackageName);
		result.append(", notationViewFactoriesPackageName: ");
		result.append(notationViewFactoriesPackageName);
		result.append(", pluginID: ");
		result.append(pluginID);
		result.append(", pluginName: ");
		result.append(pluginName);
		result.append(", providerName: ");
		result.append(providerName);
		result.append(", sameFileForDiagramAndModel: ");
		result.append(sameFileForDiagramAndModel);
		result.append(", printingEnabled: ");
		result.append(printingEnabled);
		result.append(", hasDomainModel: ");
		result.append(hasDomainModel);
		result.append(", diagramFileExtension: ");
		result.append(diagramFileExtension);
		result.append(", editPartFactoryClassName: ");
		result.append(editPartFactoryClassName);
		result.append(", baseItemSemanticEditPolicyClassName: ");
		result.append(baseItemSemanticEditPolicyClassName);
		result.append(", referenceConnectionEditPolicyClassName: ");
		result.append(referenceConnectionEditPolicyClassName);
		result.append(", elementTypesClassName: ");
		result.append(elementTypesClassName);
		result.append(", semanticHintsClassName: ");
		result.append(semanticHintsClassName);
		result.append(", notationViewProviderClassName: ");
		result.append(notationViewProviderClassName);
		result.append(", editPartProviderClassName: ");
		result.append(editPartProviderClassName);
		result.append(", metamodelSupportProviderClassName: ");
		result.append(metamodelSupportProviderClassName);
		result.append(", modelingAssistantProviderClassName: ");
		result.append(modelingAssistantProviderClassName);
		result.append(", propertyProviderClassName: ");
		result.append(propertyProviderClassName);
		result.append(", iconProviderClassName: ");
		result.append(iconProviderClassName);
		result.append(", structuralFeatureParserClassName: ");
		result.append(structuralFeatureParserClassName);
		result.append(", actionBarContributorClassName: ");
		result.append(actionBarContributorClassName);
		result.append(", creationWizardClassName: ");
		result.append(creationWizardClassName);
		result.append(", creationWizardPageClassName: ");
		result.append(creationWizardPageClassName);
		result.append(", diagramEditorUtilClassName: ");
		result.append(diagramEditorUtilClassName);
		result.append(", diagramFileCreatorClassName: ");
		result.append(diagramFileCreatorClassName);
		result.append(", documentProviderClassName: ");
		result.append(documentProviderClassName);
		result.append(", editorClassName: ");
		result.append(editorClassName);
		result.append(", initDiagramFileActionClassName: ");
		result.append(initDiagramFileActionClassName);
		result.append(", matchingStrategyClassName: ");
		result.append(matchingStrategyClassName);
		result.append(", pluginClassName: ");
		result.append(pluginClassName);
		result.append(", preferenceInitializerClassName: ");
		result.append(preferenceInitializerClassName);
		result.append(", visualIDRegistryClassName: ");
		result.append(visualIDRegistryClassName);
		result.append(')');
		return result.toString();
	}

	public String getUniqueIdentifier() {
		return getDomainDiagramElement().getInterfaceName() + "_" + getVisualID();
	}

	/**
	 * @see org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl#getQualifiedPackageName()
	 */
	private String getPackageNamePrefix() {
		String prefix = CodeGenUtil.safeName(getDomainMetaModel().getPackageName());
		String basePackage = getDomainMetaModel().getBasePackage();
		if (basePackage != null && basePackage.length() > 0) {
			prefix = basePackage + '.' + prefix;
		}
		return prefix + '.' + DIAGRAM_EDITOR_TOKEN;
	}

	String getDomainPackageCapName() {
		String name = getDomainMetaModel().getEcorePackage().getName();
		if (name.length() < 2) {
			return name.toUpperCase();
		}
		return Character.toUpperCase(name.charAt(0)) + name.substring(1);
	}

	private Set getExpressionsRequiredPluginIDs() {
		Set requiredIDs = new HashSet();
		for (Iterator it = getNodes().iterator(); it.hasNext();) {
			GenNode nextNode = (GenNode) it.next();
			TypeModelFacet modelFacet = nextNode.getModelFacet();
			if(modelFacet.getModelElementInitializer() != null) {
				requiredIDs.addAll(Arrays.asList(modelFacet.getModelElementInitializer().getRequiredPluginIDs()));
			}
			if(modelFacet.getModelElementSelector() != null) {
				requiredIDs.addAll(Arrays.asList(modelFacet.getModelElementSelector().getRequiredPluginIDs()));				
			}
			
			for (Iterator childIt = nextNode.getChildNodes().iterator(); childIt.hasNext();) {
				GenChildNode nextChild = (GenChildNode) childIt.next();
				TypeModelFacet childModelFacet = nextChild.getModelFacet();
				if(childModelFacet.getModelElementInitializer() != null) {
					requiredIDs.addAll(Arrays.asList(childModelFacet.getModelElementInitializer().getRequiredPluginIDs()));
				}
				if(childModelFacet.getModelElementSelector() != null) {
					requiredIDs.addAll(Arrays.asList(childModelFacet.getModelElementSelector().getRequiredPluginIDs()));				
				}				
			}
		}
		
		for (Iterator it = getLinks().iterator(); it.hasNext();) {
			GenLink nextLink = (GenLink) it.next();
			LinkModelFacet modelFacet = nextLink.getModelFacet();
			if(modelFacet instanceof TypeLinkModelFacet) {
				TypeLinkModelFacet  typeModelFacet = (TypeLinkModelFacet)modelFacet;
				if(typeModelFacet.getModelElementInitializer() != null) {
					requiredIDs.addAll(Arrays.asList(typeModelFacet.getModelElementInitializer().getRequiredPluginIDs()));
				}
				if(typeModelFacet.getModelElementSelector() != null) {
					requiredIDs.addAll(Arrays.asList(typeModelFacet.getModelElementSelector().getRequiredPluginIDs()));
				}
			}
		}		
		return requiredIDs;
	}
} //GenDiagramImpl
