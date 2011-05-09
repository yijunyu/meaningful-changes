/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.BatchValidation;
import org.eclipse.gmf.codegen.gmfgen.EditPartCandies;
import org.eclipse.gmf.codegen.gmfgen.EditorCandies;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.codegen.gmfgen.LinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.PackageNames;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ProviderClassNames;
import org.eclipse.gmf.codegen.gmfgen.ProviderPriority;
import org.eclipse.gmf.codegen.gmfgen.Shortcuts;
import org.eclipse.gmf.common.codegen.ImportAssistant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getContainedNodes <em>Contained Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditCommandsPackageName <em>Edit Commands Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditPartsPackageName <em>Edit Parts Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditPoliciesPackageName <em>Edit Policies Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getProvidersPackageName <em>Providers Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getNotationViewFactoriesPackageName <em>Notation View Factories Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getElementTypesClassName <em>Element Types Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getSemanticHintsClassName <em>Semantic Hints Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getNotationViewProviderClassName <em>Notation View Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getNotationViewProviderPriority <em>Notation View Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditPartProviderClassName <em>Edit Part Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditPartProviderPriority <em>Edit Part Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPaletteProviderClassName <em>Palette Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPaletteProviderPriority <em>Palette Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getModelingAssistantProviderClassName <em>Modeling Assistant Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getModelingAssistantProviderPriority <em>Modeling Assistant Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPropertyProviderClassName <em>Property Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPropertyProviderPriority <em>Property Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getIconProviderClassName <em>Icon Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getIconProviderPriority <em>Icon Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getParserProviderClassName <em>Parser Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getParserProviderPriority <em>Parser Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getAbstractParserClassName <em>Abstract Parser Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getStructuralFeatureParserClassName <em>Structural Feature Parser Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getStructuralFeaturesParserClassName <em>Structural Features Parser Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getReorientConnectionViewCommandClassName <em>Reorient Connection View Command Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditPartFactoryClassName <em>Edit Part Factory Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getBaseExternalNodeLabelEditPartClassName <em>Base External Node Label Edit Part Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getBaseItemSemanticEditPolicyClassName <em>Base Item Semantic Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getBaseGraphicalNodeEditPolicyClassName <em>Base Graphical Node Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getReferenceConnectionEditPolicyClassName <em>Reference Connection Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getCanonicalEditPolicyClassName <em>Canonical Edit Policy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getCreationWizardClassName <em>Creation Wizard Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getCreationWizardPageClassName <em>Creation Wizard Page Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDiagramEditorUtilClassName <em>Diagram Editor Util Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDiagramFileCreatorClassName <em>Diagram File Creator Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDocumentProviderClassName <em>Document Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getInitDiagramFileActionClassName <em>Init Diagram File Action Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getMatchingStrategyClassName <em>Matching Strategy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPreferenceInitializerClassName <em>Preference Initializer Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getVisualIDRegistryClassName <em>Visual ID Registry Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getElementChooserClassName <em>Element Chooser Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getLoadResourceActionClassName <em>Load Resource Action Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getCreateShortcutActionClassName <em>Create Shortcut Action Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getContainsShortcutsTo <em>Contains Shortcuts To</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getShortcutsProvidedFor <em>Shortcuts Provided For</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getValidationProviderClassName <em>Validation Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getValidationProviderPriority <em>Validation Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getMarkerNavigationProviderClassName <em>Marker Navigation Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getMarkerNavigationProviderPriority <em>Marker Navigation Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#isValidationEnabled <em>Validation Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getDomainDiagramElement <em>Domain Diagram Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getTopLevelNodes <em>Top Level Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl#getPalette <em>Palette</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDiagramImpl extends GenCommonBaseImpl implements GenDiagram {

	/**
	 * The default value of the '{@link #getEditCommandsPackageName() <em>Edit Commands Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditCommandsPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_COMMANDS_PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditCommandsPackageName() <em>Edit Commands Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditCommandsPackageName()
	 * @generated
	 * @ordered
	 */
	protected String editCommandsPackageName = EDIT_COMMANDS_PACKAGE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getNotationViewProviderPriority() <em>Notation View Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationViewProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderPriority NOTATION_VIEW_PROVIDER_PRIORITY_EDEFAULT = ProviderPriority.LOWEST_LITERAL;

	/**
	 * The cached value of the '{@link #getNotationViewProviderPriority() <em>Notation View Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationViewProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected ProviderPriority notationViewProviderPriority = NOTATION_VIEW_PROVIDER_PRIORITY_EDEFAULT;

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
	 * The default value of the '{@link #getEditPartProviderPriority() <em>Edit Part Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderPriority EDIT_PART_PROVIDER_PRIORITY_EDEFAULT = ProviderPriority.LOWEST_LITERAL;

	/**
	 * The cached value of the '{@link #getEditPartProviderPriority() <em>Edit Part Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditPartProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected ProviderPriority editPartProviderPriority = EDIT_PART_PROVIDER_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaletteProviderClassName() <em>Palette Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PALETTE_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaletteProviderClassName() <em>Palette Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String paletteProviderClassName = PALETTE_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaletteProviderPriority() <em>Palette Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderPriority PALETTE_PROVIDER_PRIORITY_EDEFAULT = ProviderPriority.LOWEST_LITERAL;

	/**
	 * The cached value of the '{@link #getPaletteProviderPriority() <em>Palette Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected ProviderPriority paletteProviderPriority = PALETTE_PROVIDER_PRIORITY_EDEFAULT;

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
	 * The default value of the '{@link #getModelingAssistantProviderPriority() <em>Modeling Assistant Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingAssistantProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderPriority MODELING_ASSISTANT_PROVIDER_PRIORITY_EDEFAULT = ProviderPriority.LOWEST_LITERAL;

	/**
	 * The cached value of the '{@link #getModelingAssistantProviderPriority() <em>Modeling Assistant Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingAssistantProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected ProviderPriority modelingAssistantProviderPriority = MODELING_ASSISTANT_PROVIDER_PRIORITY_EDEFAULT;

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
	 * The default value of the '{@link #getPropertyProviderPriority() <em>Property Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderPriority PROPERTY_PROVIDER_PRIORITY_EDEFAULT = ProviderPriority.LOWEST_LITERAL;

	/**
	 * The cached value of the '{@link #getPropertyProviderPriority() <em>Property Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected ProviderPriority propertyProviderPriority = PROPERTY_PROVIDER_PRIORITY_EDEFAULT;

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
	 * The default value of the '{@link #getIconProviderPriority() <em>Icon Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderPriority ICON_PROVIDER_PRIORITY_EDEFAULT = ProviderPriority.LOWEST_LITERAL;

	/**
	 * The cached value of the '{@link #getIconProviderPriority() <em>Icon Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected ProviderPriority iconProviderPriority = ICON_PROVIDER_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getParserProviderClassName() <em>Parser Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARSER_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParserProviderClassName() <em>Parser Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String parserProviderClassName = PARSER_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParserProviderPriority() <em>Parser Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderPriority PARSER_PROVIDER_PRIORITY_EDEFAULT = ProviderPriority.LOWEST_LITERAL;

	/**
	 * The cached value of the '{@link #getParserProviderPriority() <em>Parser Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected ProviderPriority parserProviderPriority = PARSER_PROVIDER_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstractParserClassName() <em>Abstract Parser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractParserClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_PARSER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractParserClassName() <em>Abstract Parser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractParserClassName()
	 * @generated
	 * @ordered
	 */
	protected String abstractParserClassName = ABSTRACT_PARSER_CLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getStructuralFeaturesParserClassName() <em>Structural Features Parser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralFeaturesParserClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String STRUCTURAL_FEATURES_PARSER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructuralFeaturesParserClassName() <em>Structural Features Parser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralFeaturesParserClassName()
	 * @generated
	 * @ordered
	 */
	protected String structuralFeaturesParserClassName = STRUCTURAL_FEATURES_PARSER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReorientConnectionViewCommandClassName() <em>Reorient Connection View Command Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReorientConnectionViewCommandClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReorientConnectionViewCommandClassName() <em>Reorient Connection View Command Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReorientConnectionViewCommandClassName()
	 * @generated
	 * @ordered
	 */
	protected String reorientConnectionViewCommandClassName = REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getBaseExternalNodeLabelEditPartClassName() <em>Base External Node Label Edit Part Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseExternalNodeLabelEditPartClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseExternalNodeLabelEditPartClassName() <em>Base External Node Label Edit Part Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseExternalNodeLabelEditPartClassName()
	 * @generated
	 * @ordered
	 */
	protected String baseExternalNodeLabelEditPartClassName = BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getBaseGraphicalNodeEditPolicyClassName() <em>Base Graphical Node Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseGraphicalNodeEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseGraphicalNodeEditPolicyClassName() <em>Base Graphical Node Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseGraphicalNodeEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected String baseGraphicalNodeEditPolicyClassName = BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getCanonicalEditPolicyClassName() <em>Canonical Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CANONICAL_EDIT_POLICY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanonicalEditPolicyClassName() <em>Canonical Edit Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalEditPolicyClassName()
	 * @generated
	 * @ordered
	 */
	protected String canonicalEditPolicyClassName = CANONICAL_EDIT_POLICY_CLASS_NAME_EDEFAULT;

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

	/**
	 * The default value of the '{@link #getElementChooserClassName() <em>Element Chooser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementChooserClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_CHOOSER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementChooserClassName() <em>Element Chooser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementChooserClassName()
	 * @generated
	 * @ordered
	 */
	protected String elementChooserClassName = ELEMENT_CHOOSER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadResourceActionClassName() <em>Load Resource Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadResourceActionClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_RESOURCE_ACTION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadResourceActionClassName() <em>Load Resource Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadResourceActionClassName()
	 * @generated
	 * @ordered
	 */
	protected String loadResourceActionClassName = LOAD_RESOURCE_ACTION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateShortcutActionClassName() <em>Create Shortcut Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateShortcutActionClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_SHORTCUT_ACTION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateShortcutActionClassName() <em>Create Shortcut Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateShortcutActionClassName()
	 * @generated
	 * @ordered
	 */
	protected String createShortcutActionClassName = CREATE_SHORTCUT_ACTION_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsShortcutsTo() <em>Contains Shortcuts To</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsShortcutsTo()
	 * @generated
	 * @ordered
	 */
	protected EList containsShortcutsTo = null;

	/**
	 * The cached value of the '{@link #getShortcutsProvidedFor() <em>Shortcuts Provided For</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortcutsProvidedFor()
	 * @generated
	 * @ordered
	 */
	protected EList shortcutsProvidedFor = null;

	/**
	 * The default value of the '{@link #getValidationProviderClassName() <em>Validation Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidationProviderClassName() <em>Validation Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String validationProviderClassName = VALIDATION_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidationProviderPriority() <em>Validation Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderPriority VALIDATION_PROVIDER_PRIORITY_EDEFAULT = ProviderPriority.LOWEST_LITERAL;

	/**
	 * The cached value of the '{@link #getValidationProviderPriority() <em>Validation Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected ProviderPriority validationProviderPriority = VALIDATION_PROVIDER_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarkerNavigationProviderClassName() <em>Marker Navigation Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerNavigationProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_NAVIGATION_PROVIDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkerNavigationProviderClassName() <em>Marker Navigation Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerNavigationProviderClassName()
	 * @generated
	 * @ordered
	 */
	protected String markerNavigationProviderClassName = MARKER_NAVIGATION_PROVIDER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarkerNavigationProviderPriority() <em>Marker Navigation Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerNavigationProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected static final ProviderPriority MARKER_NAVIGATION_PROVIDER_PRIORITY_EDEFAULT = ProviderPriority.LOWEST_LITERAL;

	/**
	 * The cached value of the '{@link #getMarkerNavigationProviderPriority() <em>Marker Navigation Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerNavigationProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected ProviderPriority markerNavigationProviderPriority = MARKER_NAVIGATION_PROVIDER_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isValidationEnabled() <em>Validation Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidationEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATION_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidationEnabled() <em>Validation Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidationEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean validationEnabled = VALIDATION_ENABLED_EDEFAULT;

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
	 * The cached value of the '{@link #getChildNodes() <em>Child Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildNodes()
	 * @generated
	 * @ordered
	 */
	protected EList childNodes = null;

	/**
	 * The cached value of the '{@link #getTopLevelNodes() <em>Top Level Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelNodes()
	 * @generated
	 * @ordered
	 */
	protected EList topLevelNodes = null;

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
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList compartments = null;

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
	 * @generated NOT
	 */
	public EList getContainedNodes() {
		return getTopLevelNodes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getDomainDiagramElement() {
		if (domainDiagramElement != null && domainDiagramElement.eIsProxy()) {
			InternalEObject oldDomainDiagramElement = (InternalEObject)domainDiagramElement;
			domainDiagramElement = (GenClass)eResolveProxy(oldDomainDiagramElement);
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
	public EList getChildNodes() {
		if (childNodes == null) {
			childNodes = new EObjectContainmentWithInverseEList(GenChildNode.class, this, GMFGenPackage.GEN_DIAGRAM__CHILD_NODES, GMFGenPackage.GEN_CHILD_NODE__DIAGRAM);
		}
		return childNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTopLevelNodes() {
		if (topLevelNodes == null) {
			topLevelNodes = new EObjectContainmentWithInverseEList(GenTopLevelNode.class, this, GMFGenPackage.GEN_DIAGRAM__TOP_LEVEL_NODES, GMFGenPackage.GEN_TOP_LEVEL_NODE__DIAGRAM);
		}
		return topLevelNodes;
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
	public EList getCompartments() {
		if (compartments == null) {
			compartments = new EObjectContainmentWithInverseEList(GenCompartment.class, this, GMFGenPackage.GEN_DIAGRAM__COMPARTMENTS, GMFGenPackage.GEN_COMPARTMENT__DIAGRAM);
		}
		return compartments;
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
	public String getEditCommandsPackageNameGen() {
		return editCommandsPackageName;
	}

	public String getEditCommandsPackageName() {
		String value = getEditCommandsPackageNameGen();
		if (isEmpty(value)) {
			value = getEditorGen().getPackageNamePrefix() + ".edit.commands";
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditCommandsPackageName(String newEditCommandsPackageName) {
		String oldEditCommandsPackageName = editCommandsPackageName;
		editCommandsPackageName = newEditCommandsPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDIT_COMMANDS_PACKAGE_NAME, oldEditCommandsPackageName, editCommandsPackageName));
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
		if (isEmpty(value)) {
			value = getEditorGen().getPackageNamePrefix() + ".edit.parts";
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
		if (isEmpty(value)) {
			value = getEditorGen().getPackageNamePrefix() + ".edit.policies";
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
		if (getDomainDiagramElement() != null) {
			return  getDomainDiagramElement().getName();
		} else {
			return getEditorGen().getDomainGenModel().getModelName();
		}
		// XXX NPE in gmfgen editor when neither domainGenModel nor domainDiagramElement has been set?
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
	public String getPreferenceInitializerClassNameGen() {
		return preferenceInitializerClassName;
	}

	public String getPreferenceInitializerClassName() {
		String value = getPreferenceInitializerClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "DiagramPreferenceInitializer"; //$NON-NLS-1$
		}
		return value;
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
		String value = getVisualIDRegistryClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "VisualIDRegistry"; //$NON-NLS-1$
		}
		return value;
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
	public String getCreateShortcutActionClassNameGen() {
		return createShortcutActionClassName;
	}

	public String getCreateShortcutActionClassName() {
		String value = getCreateShortcutActionClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "CreateShortcutAction"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateShortcutActionClassName(String newCreateShortcutActionClassName) {
		String oldCreateShortcutActionClassName = createShortcutActionClassName;
		createShortcutActionClassName = newCreateShortcutActionClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME, oldCreateShortcutActionClassName, createShortcutActionClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementChooserClassNameGen() {
		return elementChooserClassName;
	}

	public String getElementChooserClassName() {
		String value = getElementChooserClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "ElementChooserDialog"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementChooserClassName(String newElementChooserClassName) {
		String oldElementChooserClassName = elementChooserClassName;
		elementChooserClassName = newElementChooserClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME, oldElementChooserClassName, elementChooserClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoadResourceActionClassNameGen() {
		return loadResourceActionClassName;
	}

	public String getLoadResourceActionClassName() {
		String value = getLoadResourceActionClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "LoadResourceAction"; //$NON-NLS-1$
		}
		return value;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadResourceActionClassName(String newLoadResourceActionClassName) {
		String oldLoadResourceActionClassName = loadResourceActionClassName;
		loadResourceActionClassName = newLoadResourceActionClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__LOAD_RESOURCE_ACTION_CLASS_NAME, oldLoadResourceActionClassName, loadResourceActionClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidationProviderClassNameGen() {
		return validationProviderClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getValidationProviderClassName() {
		String value = getValidationProviderClassNameGen();
		if(isEmpty(value)) {
			value = getDomainPackageCapName() + "ValidationProvider"; //$NON-NLS-1$						
		}
		return value;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationProviderClassName(String newValidationProviderClassName) {
		String oldValidationProviderClassName = validationProviderClassName;
		validationProviderClassName = newValidationProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_CLASS_NAME, oldValidationProviderClassName, validationProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderPriority getValidationProviderPriority() {
		return validationProviderPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationProviderPriority(ProviderPriority newValidationProviderPriority) {
		ProviderPriority oldValidationProviderPriority = validationProviderPriority;
		validationProviderPriority = newValidationProviderPriority == null ? VALIDATION_PROVIDER_PRIORITY_EDEFAULT : newValidationProviderPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_PRIORITY, oldValidationProviderPriority, validationProviderPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerNavigationProviderClassNameGen() {
		return markerNavigationProviderClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMarkerNavigationProviderClassName() {
		String value = getMarkerNavigationProviderClassNameGen();
		if(isEmpty(value)) {
			value = getDomainPackageCapName() + "MarkerNavigationProvider"; //$NON-NLS-1$						
		}
		return value;
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMarkerNavigationProviderQualifiedClassName() {
		return getProvidersPackageName() + "." + getMarkerNavigationProviderClassName(); //$NON-NLS-1$
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainsShortcutsTo() {
		if (containsShortcutsTo == null) {
			containsShortcutsTo = new EDataTypeUniqueEList(String.class, this, GMFGenPackage.GEN_DIAGRAM__CONTAINS_SHORTCUTS_TO);
		}
		return containsShortcutsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getShortcutsProvidedFor() {
		if (shortcutsProvidedFor == null) {
			shortcutsProvidedFor = new EDataTypeUniqueEList(String.class, this, GMFGenPackage.GEN_DIAGRAM__SHORTCUTS_PROVIDED_FOR);
		}
		return shortcutsProvidedFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidationEnabled() {
		return validationEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationEnabled(boolean newValidationEnabled) {
		boolean oldValidationEnabled = validationEnabled;
		validationEnabled = newValidationEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__VALIDATION_ENABLED, oldValidationEnabled, validationEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorGenerator getEditorGen() {
		if (eContainerFeatureID != GMFGenPackage.GEN_DIAGRAM__EDITOR_GEN) return null;
		return (GenEditorGenerator)eContainer();
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
		if (isEmpty(value)) {
			value = getEditorGen().getPackageNamePrefix() + ".providers";
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
		if (isEmpty(value)) {
			value = getEditorGen().getPackageNamePrefix() + ".view.factories";
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
	public String getDocumentProviderClassNameGen() {
		return documentProviderClassName;
	}

	public String getDocumentProviderClassName() {
		String value = getDocumentProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "DocumentProvider"; //$NON-NLS-1$
		}
		return value;
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
		String value = getEditPartFactoryClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "EditPartFactory"; //$NON-NLS-1$
		}
		return value;
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
	public String getBaseExternalNodeLabelEditPartClassNameGen() {
		return baseExternalNodeLabelEditPartClassName;
	}

	public String getBaseExternalNodeLabelEditPartClassName() {
		String value = getBaseExternalNodeLabelEditPartClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "ExternalNodeLabelEditPart"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseExternalNodeLabelEditPartClassName(String newBaseExternalNodeLabelEditPartClassName) {
		String oldBaseExternalNodeLabelEditPartClassName = baseExternalNodeLabelEditPartClassName;
		baseExternalNodeLabelEditPartClassName = newBaseExternalNodeLabelEditPartClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME, oldBaseExternalNodeLabelEditPartClassName, baseExternalNodeLabelEditPartClassName));
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
		String value = getBaseItemSemanticEditPolicyClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "BaseItemSemanticEditPolicy"; //$NON-NLS-1$
		}
		return value;
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
	public String getBaseGraphicalNodeEditPolicyClassNameGen() {
		return baseGraphicalNodeEditPolicyClassName;
	}

	public String getBaseGraphicalNodeEditPolicyClassName() {
		String value = getBaseGraphicalNodeEditPolicyClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "GraphicalNodeEditPolicy"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseGraphicalNodeEditPolicyClassName(String newBaseGraphicalNodeEditPolicyClassName) {
		String oldBaseGraphicalNodeEditPolicyClassName = baseGraphicalNodeEditPolicyClassName;
		baseGraphicalNodeEditPolicyClassName = newBaseGraphicalNodeEditPolicyClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME, oldBaseGraphicalNodeEditPolicyClassName, baseGraphicalNodeEditPolicyClassName));
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
		String value = getReferenceConnectionEditPolicyClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "ReferenceConnectionEditPolicy"; //$NON-NLS-1$
		}
		return value;
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
	public String getCanonicalEditPolicyClassNameGen() {
		return canonicalEditPolicyClassName;
	}

	public String getCanonicalEditPolicyClassName() {
		String value = getCanonicalEditPolicyClassNameGen();
		if (isEmpty(value)) {
			value = getClassNamePart() + GenChildContainer.CANONICAL_EDIT_POLICY_SUFFIX;
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanonicalEditPolicyClassName(String newCanonicalEditPolicyClassName) {
		String oldCanonicalEditPolicyClassName = canonicalEditPolicyClassName;
		canonicalEditPolicyClassName = newCanonicalEditPolicyClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME, oldCanonicalEditPolicyClassName, canonicalEditPolicyClassName));
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
		String value = getElementTypesClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "ElementTypes"; //$NON-NLS-1$
		}
		return value;
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
		String value = getSemanticHintsClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "SemanticHints"; //$NON-NLS-1$
		}
		return value;
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
		String value = getNotationViewProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "ViewProvider"; //$NON-NLS-1$
		}
		return value;
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
	public ProviderPriority getNotationViewProviderPriority() {
		return notationViewProviderPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotationViewProviderPriority(ProviderPriority newNotationViewProviderPriority) {
		ProviderPriority oldNotationViewProviderPriority = notationViewProviderPriority;
		notationViewProviderPriority = newNotationViewProviderPriority == null ? NOTATION_VIEW_PROVIDER_PRIORITY_EDEFAULT : newNotationViewProviderPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_PRIORITY, oldNotationViewProviderPriority, notationViewProviderPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReorientConnectionViewCommandClassNameGen() {
		return reorientConnectionViewCommandClassName;
	}

	public String getReorientConnectionViewCommandClassName() {
		String value = getReorientConnectionViewCommandClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "ReorientConnectionViewCommand"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReorientConnectionViewCommandClassName(String newReorientConnectionViewCommandClassName) {
		String oldReorientConnectionViewCommandClassName = reorientConnectionViewCommandClassName;
		reorientConnectionViewCommandClassName = newReorientConnectionViewCommandClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME, oldReorientConnectionViewCommandClassName, reorientConnectionViewCommandClassName));
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
		String value = getInitDiagramFileActionClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "InitDiagramFileAction"; //$NON-NLS-1$
		}
		return value;
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
	public String getCreationWizardClassNameGen() {
		return creationWizardClassName;
	}

	public String getCreationWizardClassName() {
		String value = getCreationWizardClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "CreationWizard"; //$NON-NLS-1$
		}
		return value;
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
		String value = getCreationWizardPageClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "CreationWizardPage"; //$NON-NLS-1$
		}
		return value;
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
		String value = getDiagramEditorUtilClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "DiagramEditorUtil"; //$NON-NLS-1$
		}
		return value;
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
		String value = getDiagramFileCreatorClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "DiagramFileCreator"; //$NON-NLS-1$
		}
		return value;
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
		String value = getMatchingStrategyClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "MatchingStrategy"; //$NON-NLS-1$
		}
		return value;
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
		String value = getEditPartProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "EditPartProvider"; //$NON-NLS-1$
		}
		return value;
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
	public ProviderPriority getEditPartProviderPriority() {
		return editPartProviderPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditPartProviderPriority(ProviderPriority newEditPartProviderPriority) {
		ProviderPriority oldEditPartProviderPriority = editPartProviderPriority;
		editPartProviderPriority = newEditPartProviderPriority == null ? EDIT_PART_PROVIDER_PRIORITY_EDEFAULT : newEditPartProviderPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_PRIORITY, oldEditPartProviderPriority, editPartProviderPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaletteProviderClassNameGen() {
		return paletteProviderClassName;
	}

	public String getPaletteProviderClassName() {
		String value = getPaletteProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "PaletteProvider"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaletteProviderClassName(String newPaletteProviderClassName) {
		String oldPaletteProviderClassName = paletteProviderClassName;
		paletteProviderClassName = newPaletteProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_CLASS_NAME, oldPaletteProviderClassName, paletteProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderPriority getPaletteProviderPriority() {
		return paletteProviderPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaletteProviderPriority(ProviderPriority newPaletteProviderPriority) {
		ProviderPriority oldPaletteProviderPriority = paletteProviderPriority;
		paletteProviderPriority = newPaletteProviderPriority == null ? PALETTE_PROVIDER_PRIORITY_EDEFAULT : newPaletteProviderPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_PRIORITY, oldPaletteProviderPriority, paletteProviderPriority));
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
		String value = getModelingAssistantProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "ModelingAssistantProvider"; //$NON-NLS-1$
		}
		return value;
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
	public ProviderPriority getModelingAssistantProviderPriority() {
		return modelingAssistantProviderPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelingAssistantProviderPriority(ProviderPriority newModelingAssistantProviderPriority) {
		ProviderPriority oldModelingAssistantProviderPriority = modelingAssistantProviderPriority;
		modelingAssistantProviderPriority = newModelingAssistantProviderPriority == null ? MODELING_ASSISTANT_PROVIDER_PRIORITY_EDEFAULT : newModelingAssistantProviderPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_PRIORITY, oldModelingAssistantProviderPriority, modelingAssistantProviderPriority));
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
		String value = getPropertyProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "PropertyProvider"; //$NON-NLS-1$
		}
		return value;
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
	public ProviderPriority getPropertyProviderPriority() {
		return propertyProviderPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyProviderPriority(ProviderPriority newPropertyProviderPriority) {
		ProviderPriority oldPropertyProviderPriority = propertyProviderPriority;
		propertyProviderPriority = newPropertyProviderPriority == null ? PROPERTY_PROVIDER_PRIORITY_EDEFAULT : newPropertyProviderPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_PRIORITY, oldPropertyProviderPriority, propertyProviderPriority));
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
		String value = getIconProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "IconProvider"; //$NON-NLS-1$
		}
		return value;
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
	public ProviderPriority getIconProviderPriority() {
		return iconProviderPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconProviderPriority(ProviderPriority newIconProviderPriority) {
		ProviderPriority oldIconProviderPriority = iconProviderPriority;
		iconProviderPriority = newIconProviderPriority == null ? ICON_PROVIDER_PRIORITY_EDEFAULT : newIconProviderPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_PRIORITY, oldIconProviderPriority, iconProviderPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParserProviderClassNameGen() {
		return parserProviderClassName;
	}

	public String getParserProviderClassName() {
		String value = getParserProviderClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "ParserProvider"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParserProviderClassName(String newParserProviderClassName) {
		String oldParserProviderClassName = parserProviderClassName;
		parserProviderClassName = newParserProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_CLASS_NAME, oldParserProviderClassName, parserProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderPriority getParserProviderPriority() {
		return parserProviderPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParserProviderPriority(ProviderPriority newParserProviderPriority) {
		ProviderPriority oldParserProviderPriority = parserProviderPriority;
		parserProviderPriority = newParserProviderPriority == null ? PARSER_PROVIDER_PRIORITY_EDEFAULT : newParserProviderPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_PRIORITY, oldParserProviderPriority, parserProviderPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstractParserClassNameGen() {
		return abstractParserClassName;
	}

	public String getAbstractParserClassName() {
		String value = getAbstractParserClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "AbstractParser"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractParserClassName(String newAbstractParserClassName) {
		String oldAbstractParserClassName = abstractParserClassName;
		abstractParserClassName = newAbstractParserClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__ABSTRACT_PARSER_CLASS_NAME, oldAbstractParserClassName, abstractParserClassName));
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
		String value = getStructuralFeatureParserClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "StructuralFeatureParser"; //$NON-NLS-1$
		}
		return value;
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
	 * @generated
	 */
	public String getStructuralFeaturesParserClassNameGen() {
		return structuralFeaturesParserClassName;
	}

	public String getStructuralFeaturesParserClassName() {
		String value = getStructuralFeaturesParserClassNameGen();
		if (isEmpty(value)) {
			value = getDomainPackageCapName() + "StructuralFeaturesParser"; //$NON-NLS-1$
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuralFeaturesParserClassName(String newStructuralFeaturesParserClassName) {
		String oldStructuralFeaturesParserClassName = structuralFeaturesParserClassName;
		structuralFeaturesParserClassName = newStructuralFeaturesParserClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURES_PARSER_CLASS_NAME, oldStructuralFeaturesParserClassName, structuralFeaturesParserClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getAllNodes() {
		EList result = new BasicEList();
		result.addAll(getTopLevelNodes());
		result.addAll(getChildNodes());
		return new BasicEList.UnmodifiableEList(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getAllChildContainers() {
		EList result = new BasicEList();
		result.addAll(getAllNodes());
		result.addAll(getCompartments());
		return new BasicEList.UnmodifiableEList(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getAllContainers() {
		EList result = new BasicEList();
		result.addAll(getAllChildContainers());
		result.add(this);
		return new BasicEList.UnmodifiableEList(result.size(), result.toArray());
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
	public String getCreateShortcutActionQualifiedClassName() {
		return getEditorPackageName() + '.' + getCreateShortcutActionClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getElementChooserQualifiedClassName() {
		return getEditorPackageName() + '.' + getElementChooserClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLoadResourceActionQualifiedClassName() {
		return getEditorPackageName() + '.' + getLoadResourceActionClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getValidationProviderQualifiedClassName() {
		return getProvidersPackageName() + "." + getValidationProviderClassName(); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getValidationDiagnosticMarkerType() {
		return "diagnostic"; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerNavigationProviderClassName(String newMarkerNavigationProviderClassName) {
		String oldMarkerNavigationProviderClassName = markerNavigationProviderClassName;
		markerNavigationProviderClassName = newMarkerNavigationProviderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_CLASS_NAME, oldMarkerNavigationProviderClassName, markerNavigationProviderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderPriority getMarkerNavigationProviderPriority() {
		return markerNavigationProviderPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerNavigationProviderPriority(ProviderPriority newMarkerNavigationProviderPriority) {
		ProviderPriority oldMarkerNavigationProviderPriority = markerNavigationProviderPriority;
		markerNavigationProviderPriority = newMarkerNavigationProviderPriority == null ? MARKER_NAVIGATION_PROVIDER_PRIORITY_EDEFAULT : newMarkerNavigationProviderPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_PRIORITY, oldMarkerNavigationProviderPriority, markerNavigationProviderPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean generateCreateShortcutAction() {
		return getContainsShortcutsTo().size() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean generateShortcutIcon() {
		return getShortcutsProvidedFor().size() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_GEN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_DIAGRAM__EDITOR_GEN, msgs);
			case GMFGenPackage.GEN_DIAGRAM__CHILD_NODES:
				return ((InternalEList)getChildNodes()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.GEN_DIAGRAM__TOP_LEVEL_NODES:
				return ((InternalEList)getTopLevelNodes()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				return ((InternalEList)getLinks()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.GEN_DIAGRAM__COMPARTMENTS:
				return ((InternalEList)getCompartments()).basicAdd(otherEnd, msgs);
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				if (palette != null)
					msgs = ((InternalEObject)palette).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGenPackage.GEN_DIAGRAM__PALETTE, null, msgs);
				return basicSetPalette((Palette)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_GEN:
				return eBasicSetContainer(null, GMFGenPackage.GEN_DIAGRAM__EDITOR_GEN, msgs);
			case GMFGenPackage.GEN_DIAGRAM__CHILD_NODES:
				return ((InternalEList)getChildNodes()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.GEN_DIAGRAM__TOP_LEVEL_NODES:
				return ((InternalEList)getTopLevelNodes()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				return ((InternalEList)getLinks()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.GEN_DIAGRAM__COMPARTMENTS:
				return ((InternalEList)getCompartments()).basicRemove(otherEnd, msgs);
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				return basicSetPalette(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_GEN:
				return eInternalContainer().eInverseRemove(this, GMFGenPackage.GEN_EDITOR_GENERATOR__DIAGRAM, GenEditorGenerator.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.GEN_DIAGRAM__CONTAINED_NODES:
				return getContainedNodes();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_COMMANDS_PACKAGE_NAME:
				return getEditCommandsPackageName();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				return getEditPartsPackageName();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME:
				return getEditPoliciesPackageName();
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				return getProvidersPackageName();
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME:
				return getNotationViewFactoriesPackageName();
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME:
				return getElementTypesClassName();
			case GMFGenPackage.GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME:
				return getSemanticHintsClassName();
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME:
				return getNotationViewProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_PRIORITY:
				return getNotationViewProviderPriority();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME:
				return getEditPartProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_PRIORITY:
				return getEditPartProviderPriority();
			case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_CLASS_NAME:
				return getPaletteProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_PRIORITY:
				return getPaletteProviderPriority();
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME:
				return getModelingAssistantProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_PRIORITY:
				return getModelingAssistantProviderPriority();
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME:
				return getPropertyProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_PRIORITY:
				return getPropertyProviderPriority();
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME:
				return getIconProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_PRIORITY:
				return getIconProviderPriority();
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_CLASS_NAME:
				return getParserProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_PRIORITY:
				return getParserProviderPriority();
			case GMFGenPackage.GEN_DIAGRAM__ABSTRACT_PARSER_CLASS_NAME:
				return getAbstractParserClassName();
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME:
				return getStructuralFeatureParserClassName();
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURES_PARSER_CLASS_NAME:
				return getStructuralFeaturesParserClassName();
			case GMFGenPackage.GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME:
				return getReorientConnectionViewCommandClassName();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				return getEditPartFactoryClassName();
			case GMFGenPackage.GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME:
				return getBaseExternalNodeLabelEditPartClassName();
			case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return getBaseItemSemanticEditPolicyClassName();
			case GMFGenPackage.GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				return getBaseGraphicalNodeEditPolicyClassName();
			case GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME:
				return getReferenceConnectionEditPolicyClassName();
			case GMFGenPackage.GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME:
				return getCanonicalEditPolicyClassName();
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
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				return getInitDiagramFileActionClassName();
			case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME:
				return getMatchingStrategyClassName();
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME:
				return getPreferenceInitializerClassName();
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME:
				return getVisualIDRegistryClassName();
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME:
				return getElementChooserClassName();
			case GMFGenPackage.GEN_DIAGRAM__LOAD_RESOURCE_ACTION_CLASS_NAME:
				return getLoadResourceActionClassName();
			case GMFGenPackage.GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME:
				return getCreateShortcutActionClassName();
			case GMFGenPackage.GEN_DIAGRAM__CONTAINS_SHORTCUTS_TO:
				return getContainsShortcutsTo();
			case GMFGenPackage.GEN_DIAGRAM__SHORTCUTS_PROVIDED_FOR:
				return getShortcutsProvidedFor();
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_CLASS_NAME:
				return getValidationProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_PRIORITY:
				return getValidationProviderPriority();
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_CLASS_NAME:
				return getMarkerNavigationProviderClassName();
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_PRIORITY:
				return getMarkerNavigationProviderPriority();
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_ENABLED:
				return isValidationEnabled() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_GEN:
				return getEditorGen();
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				if (resolve) return getDomainDiagramElement();
				return basicGetDomainDiagramElement();
			case GMFGenPackage.GEN_DIAGRAM__CHILD_NODES:
				return getChildNodes();
			case GMFGenPackage.GEN_DIAGRAM__TOP_LEVEL_NODES:
				return getTopLevelNodes();
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				return getLinks();
			case GMFGenPackage.GEN_DIAGRAM__COMPARTMENTS:
				return getCompartments();
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				return getPalette();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.GEN_DIAGRAM__CONTAINED_NODES:
				getContainedNodes().clear();
				getContainedNodes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_COMMANDS_PACKAGE_NAME:
				setEditCommandsPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				setEditPartsPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME:
				setEditPoliciesPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				setProvidersPackageName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME:
				setNotationViewFactoriesPackageName((String)newValue);
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
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_PRIORITY:
				setNotationViewProviderPriority((ProviderPriority)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME:
				setEditPartProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_PRIORITY:
				setEditPartProviderPriority((ProviderPriority)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_CLASS_NAME:
				setPaletteProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_PRIORITY:
				setPaletteProviderPriority((ProviderPriority)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME:
				setModelingAssistantProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_PRIORITY:
				setModelingAssistantProviderPriority((ProviderPriority)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME:
				setPropertyProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_PRIORITY:
				setPropertyProviderPriority((ProviderPriority)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME:
				setIconProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_PRIORITY:
				setIconProviderPriority((ProviderPriority)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_CLASS_NAME:
				setParserProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_PRIORITY:
				setParserProviderPriority((ProviderPriority)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ABSTRACT_PARSER_CLASS_NAME:
				setAbstractParserClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME:
				setStructuralFeatureParserClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURES_PARSER_CLASS_NAME:
				setStructuralFeaturesParserClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME:
				setReorientConnectionViewCommandClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				setEditPartFactoryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME:
				setBaseExternalNodeLabelEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setBaseItemSemanticEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				setBaseGraphicalNodeEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME:
				setReferenceConnectionEditPolicyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME:
				setCanonicalEditPolicyClassName((String)newValue);
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
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				setInitDiagramFileActionClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME:
				setMatchingStrategyClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME:
				setPreferenceInitializerClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME:
				setVisualIDRegistryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME:
				setElementChooserClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__LOAD_RESOURCE_ACTION_CLASS_NAME:
				setLoadResourceActionClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME:
				setCreateShortcutActionClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CONTAINS_SHORTCUTS_TO:
				getContainsShortcutsTo().clear();
				getContainsShortcutsTo().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__SHORTCUTS_PROVIDED_FOR:
				getShortcutsProvidedFor().clear();
				getShortcutsProvidedFor().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_CLASS_NAME:
				setValidationProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_PRIORITY:
				setValidationProviderPriority((ProviderPriority)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_CLASS_NAME:
				setMarkerNavigationProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_PRIORITY:
				setMarkerNavigationProviderPriority((ProviderPriority)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_ENABLED:
				setValidationEnabled(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				setDomainDiagramElement((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CHILD_NODES:
				getChildNodes().clear();
				getChildNodes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__TOP_LEVEL_NODES:
				getTopLevelNodes().clear();
				getTopLevelNodes().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__COMPARTMENTS:
				getCompartments().clear();
				getCompartments().addAll((Collection)newValue);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				setPalette((Palette)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_DIAGRAM__CONTAINED_NODES:
				getContainedNodes().clear();
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_COMMANDS_PACKAGE_NAME:
				setEditCommandsPackageName(EDIT_COMMANDS_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				setEditPartsPackageName(EDIT_PARTS_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME:
				setEditPoliciesPackageName(EDIT_POLICIES_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				setProvidersPackageName(PROVIDERS_PACKAGE_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME:
				setNotationViewFactoriesPackageName(NOTATION_VIEW_FACTORIES_PACKAGE_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_PRIORITY:
				setNotationViewProviderPriority(NOTATION_VIEW_PROVIDER_PRIORITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME:
				setEditPartProviderClassName(EDIT_PART_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_PRIORITY:
				setEditPartProviderPriority(EDIT_PART_PROVIDER_PRIORITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_CLASS_NAME:
				setPaletteProviderClassName(PALETTE_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_PRIORITY:
				setPaletteProviderPriority(PALETTE_PROVIDER_PRIORITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME:
				setModelingAssistantProviderClassName(MODELING_ASSISTANT_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_PRIORITY:
				setModelingAssistantProviderPriority(MODELING_ASSISTANT_PROVIDER_PRIORITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME:
				setPropertyProviderClassName(PROPERTY_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_PRIORITY:
				setPropertyProviderPriority(PROPERTY_PROVIDER_PRIORITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME:
				setIconProviderClassName(ICON_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_PRIORITY:
				setIconProviderPriority(ICON_PROVIDER_PRIORITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_CLASS_NAME:
				setParserProviderClassName(PARSER_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_PRIORITY:
				setParserProviderPriority(PARSER_PROVIDER_PRIORITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ABSTRACT_PARSER_CLASS_NAME:
				setAbstractParserClassName(ABSTRACT_PARSER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME:
				setStructuralFeatureParserClassName(STRUCTURAL_FEATURE_PARSER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURES_PARSER_CLASS_NAME:
				setStructuralFeaturesParserClassName(STRUCTURAL_FEATURES_PARSER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME:
				setReorientConnectionViewCommandClassName(REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				setEditPartFactoryClassName(EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME:
				setBaseExternalNodeLabelEditPartClassName(BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				setBaseItemSemanticEditPolicyClassName(BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				setBaseGraphicalNodeEditPolicyClassName(BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME:
				setReferenceConnectionEditPolicyClassName(REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME:
				setCanonicalEditPolicyClassName(CANONICAL_EDIT_POLICY_CLASS_NAME_EDEFAULT);
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
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				setInitDiagramFileActionClassName(INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME:
				setMatchingStrategyClassName(MATCHING_STRATEGY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME:
				setPreferenceInitializerClassName(PREFERENCE_INITIALIZER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME:
				setVisualIDRegistryClassName(VISUAL_ID_REGISTRY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME:
				setElementChooserClassName(ELEMENT_CHOOSER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__LOAD_RESOURCE_ACTION_CLASS_NAME:
				setLoadResourceActionClassName(LOAD_RESOURCE_ACTION_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME:
				setCreateShortcutActionClassName(CREATE_SHORTCUT_ACTION_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CONTAINS_SHORTCUTS_TO:
				getContainsShortcutsTo().clear();
				return;
			case GMFGenPackage.GEN_DIAGRAM__SHORTCUTS_PROVIDED_FOR:
				getShortcutsProvidedFor().clear();
				return;
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_CLASS_NAME:
				setValidationProviderClassName(VALIDATION_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_PRIORITY:
				setValidationProviderPriority(VALIDATION_PROVIDER_PRIORITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_CLASS_NAME:
				setMarkerNavigationProviderClassName(MARKER_NAVIGATION_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_PRIORITY:
				setMarkerNavigationProviderPriority(MARKER_NAVIGATION_PROVIDER_PRIORITY_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_ENABLED:
				setValidationEnabled(VALIDATION_ENABLED_EDEFAULT);
				return;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				setDomainDiagramElement((GenClass)null);
				return;
			case GMFGenPackage.GEN_DIAGRAM__CHILD_NODES:
				getChildNodes().clear();
				return;
			case GMFGenPackage.GEN_DIAGRAM__TOP_LEVEL_NODES:
				getTopLevelNodes().clear();
				return;
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				getLinks().clear();
				return;
			case GMFGenPackage.GEN_DIAGRAM__COMPARTMENTS:
				getCompartments().clear();
				return;
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				setPalette((Palette)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGenPackage.GEN_DIAGRAM__CONTAINED_NODES:
				return !getContainedNodes().isEmpty();
			case GMFGenPackage.GEN_DIAGRAM__EDIT_COMMANDS_PACKAGE_NAME:
				return EDIT_COMMANDS_PACKAGE_NAME_EDEFAULT == null ? editCommandsPackageName != null : !EDIT_COMMANDS_PACKAGE_NAME_EDEFAULT.equals(editCommandsPackageName);
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME:
				return EDIT_PARTS_PACKAGE_NAME_EDEFAULT == null ? editPartsPackageName != null : !EDIT_PARTS_PACKAGE_NAME_EDEFAULT.equals(editPartsPackageName);
			case GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME:
				return EDIT_POLICIES_PACKAGE_NAME_EDEFAULT == null ? editPoliciesPackageName != null : !EDIT_POLICIES_PACKAGE_NAME_EDEFAULT.equals(editPoliciesPackageName);
			case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME:
				return PROVIDERS_PACKAGE_NAME_EDEFAULT == null ? providersPackageName != null : !PROVIDERS_PACKAGE_NAME_EDEFAULT.equals(providersPackageName);
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME:
				return NOTATION_VIEW_FACTORIES_PACKAGE_NAME_EDEFAULT == null ? notationViewFactoriesPackageName != null : !NOTATION_VIEW_FACTORIES_PACKAGE_NAME_EDEFAULT.equals(notationViewFactoriesPackageName);
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME:
				return ELEMENT_TYPES_CLASS_NAME_EDEFAULT == null ? elementTypesClassName != null : !ELEMENT_TYPES_CLASS_NAME_EDEFAULT.equals(elementTypesClassName);
			case GMFGenPackage.GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME:
				return SEMANTIC_HINTS_CLASS_NAME_EDEFAULT == null ? semanticHintsClassName != null : !SEMANTIC_HINTS_CLASS_NAME_EDEFAULT.equals(semanticHintsClassName);
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME:
				return NOTATION_VIEW_PROVIDER_CLASS_NAME_EDEFAULT == null ? notationViewProviderClassName != null : !NOTATION_VIEW_PROVIDER_CLASS_NAME_EDEFAULT.equals(notationViewProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_PRIORITY:
				return notationViewProviderPriority != NOTATION_VIEW_PROVIDER_PRIORITY_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME:
				return EDIT_PART_PROVIDER_CLASS_NAME_EDEFAULT == null ? editPartProviderClassName != null : !EDIT_PART_PROVIDER_CLASS_NAME_EDEFAULT.equals(editPartProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_PRIORITY:
				return editPartProviderPriority != EDIT_PART_PROVIDER_PRIORITY_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_CLASS_NAME:
				return PALETTE_PROVIDER_CLASS_NAME_EDEFAULT == null ? paletteProviderClassName != null : !PALETTE_PROVIDER_CLASS_NAME_EDEFAULT.equals(paletteProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_PRIORITY:
				return paletteProviderPriority != PALETTE_PROVIDER_PRIORITY_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME:
				return MODELING_ASSISTANT_PROVIDER_CLASS_NAME_EDEFAULT == null ? modelingAssistantProviderClassName != null : !MODELING_ASSISTANT_PROVIDER_CLASS_NAME_EDEFAULT.equals(modelingAssistantProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_PRIORITY:
				return modelingAssistantProviderPriority != MODELING_ASSISTANT_PROVIDER_PRIORITY_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME:
				return PROPERTY_PROVIDER_CLASS_NAME_EDEFAULT == null ? propertyProviderClassName != null : !PROPERTY_PROVIDER_CLASS_NAME_EDEFAULT.equals(propertyProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_PRIORITY:
				return propertyProviderPriority != PROPERTY_PROVIDER_PRIORITY_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME:
				return ICON_PROVIDER_CLASS_NAME_EDEFAULT == null ? iconProviderClassName != null : !ICON_PROVIDER_CLASS_NAME_EDEFAULT.equals(iconProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_PRIORITY:
				return iconProviderPriority != ICON_PROVIDER_PRIORITY_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_CLASS_NAME:
				return PARSER_PROVIDER_CLASS_NAME_EDEFAULT == null ? parserProviderClassName != null : !PARSER_PROVIDER_CLASS_NAME_EDEFAULT.equals(parserProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_PRIORITY:
				return parserProviderPriority != PARSER_PROVIDER_PRIORITY_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__ABSTRACT_PARSER_CLASS_NAME:
				return ABSTRACT_PARSER_CLASS_NAME_EDEFAULT == null ? abstractParserClassName != null : !ABSTRACT_PARSER_CLASS_NAME_EDEFAULT.equals(abstractParserClassName);
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME:
				return STRUCTURAL_FEATURE_PARSER_CLASS_NAME_EDEFAULT == null ? structuralFeatureParserClassName != null : !STRUCTURAL_FEATURE_PARSER_CLASS_NAME_EDEFAULT.equals(structuralFeatureParserClassName);
			case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURES_PARSER_CLASS_NAME:
				return STRUCTURAL_FEATURES_PARSER_CLASS_NAME_EDEFAULT == null ? structuralFeaturesParserClassName != null : !STRUCTURAL_FEATURES_PARSER_CLASS_NAME_EDEFAULT.equals(structuralFeaturesParserClassName);
			case GMFGenPackage.GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME:
				return REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME_EDEFAULT == null ? reorientConnectionViewCommandClassName != null : !REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME_EDEFAULT.equals(reorientConnectionViewCommandClassName);
			case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME:
				return EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT == null ? editPartFactoryClassName != null : !EDIT_PART_FACTORY_CLASS_NAME_EDEFAULT.equals(editPartFactoryClassName);
			case GMFGenPackage.GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME:
				return BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME_EDEFAULT == null ? baseExternalNodeLabelEditPartClassName != null : !BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME_EDEFAULT.equals(baseExternalNodeLabelEditPartClassName);
			case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME:
				return BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? baseItemSemanticEditPolicyClassName != null : !BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(baseItemSemanticEditPolicyClassName);
			case GMFGenPackage.GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME:
				return BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? baseGraphicalNodeEditPolicyClassName != null : !BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(baseGraphicalNodeEditPolicyClassName);
			case GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME:
				return REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? referenceConnectionEditPolicyClassName != null : !REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(referenceConnectionEditPolicyClassName);
			case GMFGenPackage.GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME:
				return CANONICAL_EDIT_POLICY_CLASS_NAME_EDEFAULT == null ? canonicalEditPolicyClassName != null : !CANONICAL_EDIT_POLICY_CLASS_NAME_EDEFAULT.equals(canonicalEditPolicyClassName);
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
			case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME:
				return INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT == null ? initDiagramFileActionClassName != null : !INIT_DIAGRAM_FILE_ACTION_CLASS_NAME_EDEFAULT.equals(initDiagramFileActionClassName);
			case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME:
				return MATCHING_STRATEGY_CLASS_NAME_EDEFAULT == null ? matchingStrategyClassName != null : !MATCHING_STRATEGY_CLASS_NAME_EDEFAULT.equals(matchingStrategyClassName);
			case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME:
				return PREFERENCE_INITIALIZER_CLASS_NAME_EDEFAULT == null ? preferenceInitializerClassName != null : !PREFERENCE_INITIALIZER_CLASS_NAME_EDEFAULT.equals(preferenceInitializerClassName);
			case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME:
				return VISUAL_ID_REGISTRY_CLASS_NAME_EDEFAULT == null ? visualIDRegistryClassName != null : !VISUAL_ID_REGISTRY_CLASS_NAME_EDEFAULT.equals(visualIDRegistryClassName);
			case GMFGenPackage.GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME:
				return ELEMENT_CHOOSER_CLASS_NAME_EDEFAULT == null ? elementChooserClassName != null : !ELEMENT_CHOOSER_CLASS_NAME_EDEFAULT.equals(elementChooserClassName);
			case GMFGenPackage.GEN_DIAGRAM__LOAD_RESOURCE_ACTION_CLASS_NAME:
				return LOAD_RESOURCE_ACTION_CLASS_NAME_EDEFAULT == null ? loadResourceActionClassName != null : !LOAD_RESOURCE_ACTION_CLASS_NAME_EDEFAULT.equals(loadResourceActionClassName);
			case GMFGenPackage.GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME:
				return CREATE_SHORTCUT_ACTION_CLASS_NAME_EDEFAULT == null ? createShortcutActionClassName != null : !CREATE_SHORTCUT_ACTION_CLASS_NAME_EDEFAULT.equals(createShortcutActionClassName);
			case GMFGenPackage.GEN_DIAGRAM__CONTAINS_SHORTCUTS_TO:
				return containsShortcutsTo != null && !containsShortcutsTo.isEmpty();
			case GMFGenPackage.GEN_DIAGRAM__SHORTCUTS_PROVIDED_FOR:
				return shortcutsProvidedFor != null && !shortcutsProvidedFor.isEmpty();
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_CLASS_NAME:
				return VALIDATION_PROVIDER_CLASS_NAME_EDEFAULT == null ? validationProviderClassName != null : !VALIDATION_PROVIDER_CLASS_NAME_EDEFAULT.equals(validationProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_PRIORITY:
				return validationProviderPriority != VALIDATION_PROVIDER_PRIORITY_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_CLASS_NAME:
				return MARKER_NAVIGATION_PROVIDER_CLASS_NAME_EDEFAULT == null ? markerNavigationProviderClassName != null : !MARKER_NAVIGATION_PROVIDER_CLASS_NAME_EDEFAULT.equals(markerNavigationProviderClassName);
			case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_PRIORITY:
				return markerNavigationProviderPriority != MARKER_NAVIGATION_PROVIDER_PRIORITY_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__VALIDATION_ENABLED:
				return validationEnabled != VALIDATION_ENABLED_EDEFAULT;
			case GMFGenPackage.GEN_DIAGRAM__EDITOR_GEN:
				return getEditorGen() != null;
			case GMFGenPackage.GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT:
				return domainDiagramElement != null;
			case GMFGenPackage.GEN_DIAGRAM__CHILD_NODES:
				return childNodes != null && !childNodes.isEmpty();
			case GMFGenPackage.GEN_DIAGRAM__TOP_LEVEL_NODES:
				return topLevelNodes != null && !topLevelNodes.isEmpty();
			case GMFGenPackage.GEN_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
			case GMFGenPackage.GEN_DIAGRAM__COMPARTMENTS:
				return compartments != null && !compartments.isEmpty();
			case GMFGenPackage.GEN_DIAGRAM__PALETTE:
				return palette != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == PackageNames.class) {
			switch (derivedFeatureID) {
				case GMFGenPackage.GEN_DIAGRAM__EDIT_COMMANDS_PACKAGE_NAME: return GMFGenPackage.PACKAGE_NAMES__EDIT_COMMANDS_PACKAGE_NAME;
				case GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME: return GMFGenPackage.PACKAGE_NAMES__EDIT_PARTS_PACKAGE_NAME;
				case GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME: return GMFGenPackage.PACKAGE_NAMES__EDIT_POLICIES_PACKAGE_NAME;
				case GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME: return GMFGenPackage.PACKAGE_NAMES__PROVIDERS_PACKAGE_NAME;
				case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME: return GMFGenPackage.PACKAGE_NAMES__NOTATION_VIEW_FACTORIES_PACKAGE_NAME;
				default: return -1;
			}
		}
		if (baseClass == ProviderClassNames.class) {
			switch (derivedFeatureID) {
				case GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__ELEMENT_TYPES_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__SEMANTIC_HINTS_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__NOTATION_VIEW_PROVIDER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_PRIORITY: return GMFGenPackage.PROVIDER_CLASS_NAMES__NOTATION_VIEW_PROVIDER_PRIORITY;
				case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__EDIT_PART_PROVIDER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_PRIORITY: return GMFGenPackage.PROVIDER_CLASS_NAMES__EDIT_PART_PROVIDER_PRIORITY;
				case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__PALETTE_PROVIDER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_PRIORITY: return GMFGenPackage.PROVIDER_CLASS_NAMES__PALETTE_PROVIDER_PRIORITY;
				case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__MODELING_ASSISTANT_PROVIDER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_PRIORITY: return GMFGenPackage.PROVIDER_CLASS_NAMES__MODELING_ASSISTANT_PROVIDER_PRIORITY;
				case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__PROPERTY_PROVIDER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_PRIORITY: return GMFGenPackage.PROVIDER_CLASS_NAMES__PROPERTY_PROVIDER_PRIORITY;
				case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__ICON_PROVIDER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_PRIORITY: return GMFGenPackage.PROVIDER_CLASS_NAMES__ICON_PROVIDER_PRIORITY;
				case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__PARSER_PROVIDER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_PRIORITY: return GMFGenPackage.PROVIDER_CLASS_NAMES__PARSER_PROVIDER_PRIORITY;
				case GMFGenPackage.GEN_DIAGRAM__ABSTRACT_PARSER_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__ABSTRACT_PARSER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__STRUCTURAL_FEATURE_PARSER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURES_PARSER_CLASS_NAME: return GMFGenPackage.PROVIDER_CLASS_NAMES__STRUCTURAL_FEATURES_PARSER_CLASS_NAME;
				default: return -1;
			}
		}
		if (baseClass == LinkConstraints.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EditPartCandies.class) {
			switch (derivedFeatureID) {
				case GMFGenPackage.GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME: return GMFGenPackage.EDIT_PART_CANDIES__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME: return GMFGenPackage.EDIT_PART_CANDIES__EDIT_PART_FACTORY_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME: return GMFGenPackage.EDIT_PART_CANDIES__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME: return GMFGenPackage.EDIT_PART_CANDIES__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME: return GMFGenPackage.EDIT_PART_CANDIES__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME: return GMFGenPackage.EDIT_PART_CANDIES__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME: return GMFGenPackage.EDIT_PART_CANDIES__CANONICAL_EDIT_POLICY_CLASS_NAME;
				default: return -1;
			}
		}
		if (baseClass == EditorCandies.class) {
			switch (derivedFeatureID) {
				case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME: return GMFGenPackage.EDITOR_CANDIES__CREATION_WIZARD_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME: return GMFGenPackage.EDITOR_CANDIES__CREATION_WIZARD_PAGE_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME: return GMFGenPackage.EDITOR_CANDIES__DIAGRAM_EDITOR_UTIL_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_CREATOR_CLASS_NAME: return GMFGenPackage.EDITOR_CANDIES__DIAGRAM_FILE_CREATOR_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME: return GMFGenPackage.EDITOR_CANDIES__DOCUMENT_PROVIDER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME: return GMFGenPackage.EDITOR_CANDIES__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME: return GMFGenPackage.EDITOR_CANDIES__MATCHING_STRATEGY_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME: return GMFGenPackage.EDITOR_CANDIES__PREFERENCE_INITIALIZER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME: return GMFGenPackage.EDITOR_CANDIES__VISUAL_ID_REGISTRY_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME: return GMFGenPackage.EDITOR_CANDIES__ELEMENT_CHOOSER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__LOAD_RESOURCE_ACTION_CLASS_NAME: return GMFGenPackage.EDITOR_CANDIES__LOAD_RESOURCE_ACTION_CLASS_NAME;
				default: return -1;
			}
		}
		if (baseClass == Shortcuts.class) {
			switch (derivedFeatureID) {
				case GMFGenPackage.GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME: return GMFGenPackage.SHORTCUTS__CREATE_SHORTCUT_ACTION_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__CONTAINS_SHORTCUTS_TO: return GMFGenPackage.SHORTCUTS__CONTAINS_SHORTCUTS_TO;
				case GMFGenPackage.GEN_DIAGRAM__SHORTCUTS_PROVIDED_FOR: return GMFGenPackage.SHORTCUTS__SHORTCUTS_PROVIDED_FOR;
				default: return -1;
			}
		}
		if (baseClass == BatchValidation.class) {
			switch (derivedFeatureID) {
				case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_CLASS_NAME: return GMFGenPackage.BATCH_VALIDATION__VALIDATION_PROVIDER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_PRIORITY: return GMFGenPackage.BATCH_VALIDATION__VALIDATION_PROVIDER_PRIORITY;
				case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_CLASS_NAME: return GMFGenPackage.BATCH_VALIDATION__MARKER_NAVIGATION_PROVIDER_CLASS_NAME;
				case GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_PRIORITY: return GMFGenPackage.BATCH_VALIDATION__MARKER_NAVIGATION_PROVIDER_PRIORITY;
				case GMFGenPackage.GEN_DIAGRAM__VALIDATION_ENABLED: return GMFGenPackage.BATCH_VALIDATION__VALIDATION_ENABLED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == PackageNames.class) {
			switch (baseFeatureID) {
				case GMFGenPackage.PACKAGE_NAMES__EDIT_COMMANDS_PACKAGE_NAME: return GMFGenPackage.GEN_DIAGRAM__EDIT_COMMANDS_PACKAGE_NAME;
				case GMFGenPackage.PACKAGE_NAMES__EDIT_PARTS_PACKAGE_NAME: return GMFGenPackage.GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME;
				case GMFGenPackage.PACKAGE_NAMES__EDIT_POLICIES_PACKAGE_NAME: return GMFGenPackage.GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME;
				case GMFGenPackage.PACKAGE_NAMES__PROVIDERS_PACKAGE_NAME: return GMFGenPackage.GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME;
				case GMFGenPackage.PACKAGE_NAMES__NOTATION_VIEW_FACTORIES_PACKAGE_NAME: return GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME;
				default: return -1;
			}
		}
		if (baseClass == ProviderClassNames.class) {
			switch (baseFeatureID) {
				case GMFGenPackage.PROVIDER_CLASS_NAMES__ELEMENT_TYPES_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__SEMANTIC_HINTS_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__NOTATION_VIEW_PROVIDER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__NOTATION_VIEW_PROVIDER_PRIORITY: return GMFGenPackage.GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_PRIORITY;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__EDIT_PART_PROVIDER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__EDIT_PART_PROVIDER_PRIORITY: return GMFGenPackage.GEN_DIAGRAM__EDIT_PART_PROVIDER_PRIORITY;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__PALETTE_PROVIDER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_CLASS_NAME;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__PALETTE_PROVIDER_PRIORITY: return GMFGenPackage.GEN_DIAGRAM__PALETTE_PROVIDER_PRIORITY;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__MODELING_ASSISTANT_PROVIDER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__MODELING_ASSISTANT_PROVIDER_PRIORITY: return GMFGenPackage.GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_PRIORITY;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__PROPERTY_PROVIDER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__PROPERTY_PROVIDER_PRIORITY: return GMFGenPackage.GEN_DIAGRAM__PROPERTY_PROVIDER_PRIORITY;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__ICON_PROVIDER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__ICON_PROVIDER_PRIORITY: return GMFGenPackage.GEN_DIAGRAM__ICON_PROVIDER_PRIORITY;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__PARSER_PROVIDER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_CLASS_NAME;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__PARSER_PROVIDER_PRIORITY: return GMFGenPackage.GEN_DIAGRAM__PARSER_PROVIDER_PRIORITY;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__ABSTRACT_PARSER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__ABSTRACT_PARSER_CLASS_NAME;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__STRUCTURAL_FEATURE_PARSER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME;
				case GMFGenPackage.PROVIDER_CLASS_NAMES__STRUCTURAL_FEATURES_PARSER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__STRUCTURAL_FEATURES_PARSER_CLASS_NAME;
				default: return -1;
			}
		}
		if (baseClass == LinkConstraints.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EditPartCandies.class) {
			switch (baseFeatureID) {
				case GMFGenPackage.EDIT_PART_CANDIES__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME;
				case GMFGenPackage.EDIT_PART_CANDIES__EDIT_PART_FACTORY_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME;
				case GMFGenPackage.EDIT_PART_CANDIES__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME;
				case GMFGenPackage.EDIT_PART_CANDIES__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;
				case GMFGenPackage.EDIT_PART_CANDIES__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME;
				case GMFGenPackage.EDIT_PART_CANDIES__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME;
				case GMFGenPackage.EDIT_PART_CANDIES__CANONICAL_EDIT_POLICY_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME;
				default: return -1;
			}
		}
		if (baseClass == EditorCandies.class) {
			switch (baseFeatureID) {
				case GMFGenPackage.EDITOR_CANDIES__CREATION_WIZARD_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME;
				case GMFGenPackage.EDITOR_CANDIES__CREATION_WIZARD_PAGE_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME;
				case GMFGenPackage.EDITOR_CANDIES__DIAGRAM_EDITOR_UTIL_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME;
				case GMFGenPackage.EDITOR_CANDIES__DIAGRAM_FILE_CREATOR_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__DIAGRAM_FILE_CREATOR_CLASS_NAME;
				case GMFGenPackage.EDITOR_CANDIES__DOCUMENT_PROVIDER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME;
				case GMFGenPackage.EDITOR_CANDIES__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME;
				case GMFGenPackage.EDITOR_CANDIES__MATCHING_STRATEGY_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME;
				case GMFGenPackage.EDITOR_CANDIES__PREFERENCE_INITIALIZER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME;
				case GMFGenPackage.EDITOR_CANDIES__VISUAL_ID_REGISTRY_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME;
				case GMFGenPackage.EDITOR_CANDIES__ELEMENT_CHOOSER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME;
				case GMFGenPackage.EDITOR_CANDIES__LOAD_RESOURCE_ACTION_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__LOAD_RESOURCE_ACTION_CLASS_NAME;
				default: return -1;
			}
		}
		if (baseClass == Shortcuts.class) {
			switch (baseFeatureID) {
				case GMFGenPackage.SHORTCUTS__CREATE_SHORTCUT_ACTION_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME;
				case GMFGenPackage.SHORTCUTS__CONTAINS_SHORTCUTS_TO: return GMFGenPackage.GEN_DIAGRAM__CONTAINS_SHORTCUTS_TO;
				case GMFGenPackage.SHORTCUTS__SHORTCUTS_PROVIDED_FOR: return GMFGenPackage.GEN_DIAGRAM__SHORTCUTS_PROVIDED_FOR;
				default: return -1;
			}
		}
		if (baseClass == BatchValidation.class) {
			switch (baseFeatureID) {
				case GMFGenPackage.BATCH_VALIDATION__VALIDATION_PROVIDER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_CLASS_NAME;
				case GMFGenPackage.BATCH_VALIDATION__VALIDATION_PROVIDER_PRIORITY: return GMFGenPackage.GEN_DIAGRAM__VALIDATION_PROVIDER_PRIORITY;
				case GMFGenPackage.BATCH_VALIDATION__MARKER_NAVIGATION_PROVIDER_CLASS_NAME: return GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_CLASS_NAME;
				case GMFGenPackage.BATCH_VALIDATION__MARKER_NAVIGATION_PROVIDER_PRIORITY: return GMFGenPackage.GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_PRIORITY;
				case GMFGenPackage.BATCH_VALIDATION__VALIDATION_ENABLED: return GMFGenPackage.GEN_DIAGRAM__VALIDATION_ENABLED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasLinkCreationConstraints() {
		for (Iterator it = getLinks().iterator(); it.hasNext();) {
			GenLink nextLink = (GenLink) it.next();
			if(nextLink.getCreationConstraints() != null) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLinkCreationConstraintsClassName() {
		return "LinkConstraints"; //$NON-NLS-1$		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLinkCreationConstraintsQualifiedClassName() {
		String owningClass = getBaseItemSemanticEditPolicyQualifiedClassName();
		if(owningClass != null) {
			return owningClass + "." + getLinkCreationConstraintsClassName(); //$NON-NLS-1$
		}
		return getLinkCreationConstraintsClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getReorientConnectionViewCommandQualifiedClassName() {
		return getEditCommandsPackageName() + '.' + getReorientConnectionViewCommandClassName();
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
	public String getBaseExternalNodeLabelEditPartQualifiedClassName() {
		return getEditPartsPackageName() + '.' + getBaseExternalNodeLabelEditPartClassName();
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
	public String getBaseGraphicalNodeEditPolicyQualifiedClassName() {
		return getEditPoliciesPackageName() + '.' + getBaseGraphicalNodeEditPolicyClassName();
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
	public String getCanonicalEditPolicyQualifiedClassName() {
		return getEditPoliciesPackageName() + '.' + getCanonicalEditPolicyClassName();
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
	public String getPaletteProviderQualifiedClassName() {
		return getProvidersPackageName() + '.' + getPaletteProviderClassName();
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
	public String getParserProviderQualifiedClassName() {
		return getProvidersPackageName() + '.' + getParserProviderClassName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAbstractParserQualifiedClassName() {
		return getProvidersPackageName() + '.' + getAbstractParserClassName();
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
	public String getStructuralFeaturesParserQualifiedClassName() {
		return getProvidersPackageName() + '.' + getStructuralFeaturesParserClassName();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (editCommandsPackageName: ");
		result.append(editCommandsPackageName);
		result.append(", editPartsPackageName: ");
		result.append(editPartsPackageName);
		result.append(", editPoliciesPackageName: ");
		result.append(editPoliciesPackageName);
		result.append(", providersPackageName: ");
		result.append(providersPackageName);
		result.append(", notationViewFactoriesPackageName: ");
		result.append(notationViewFactoriesPackageName);
		result.append(", elementTypesClassName: ");
		result.append(elementTypesClassName);
		result.append(", semanticHintsClassName: ");
		result.append(semanticHintsClassName);
		result.append(", notationViewProviderClassName: ");
		result.append(notationViewProviderClassName);
		result.append(", notationViewProviderPriority: ");
		result.append(notationViewProviderPriority);
		result.append(", editPartProviderClassName: ");
		result.append(editPartProviderClassName);
		result.append(", editPartProviderPriority: ");
		result.append(editPartProviderPriority);
		result.append(", paletteProviderClassName: ");
		result.append(paletteProviderClassName);
		result.append(", paletteProviderPriority: ");
		result.append(paletteProviderPriority);
		result.append(", modelingAssistantProviderClassName: ");
		result.append(modelingAssistantProviderClassName);
		result.append(", modelingAssistantProviderPriority: ");
		result.append(modelingAssistantProviderPriority);
		result.append(", propertyProviderClassName: ");
		result.append(propertyProviderClassName);
		result.append(", propertyProviderPriority: ");
		result.append(propertyProviderPriority);
		result.append(", iconProviderClassName: ");
		result.append(iconProviderClassName);
		result.append(", iconProviderPriority: ");
		result.append(iconProviderPriority);
		result.append(", parserProviderClassName: ");
		result.append(parserProviderClassName);
		result.append(", parserProviderPriority: ");
		result.append(parserProviderPriority);
		result.append(", abstractParserClassName: ");
		result.append(abstractParserClassName);
		result.append(", structuralFeatureParserClassName: ");
		result.append(structuralFeatureParserClassName);
		result.append(", structuralFeaturesParserClassName: ");
		result.append(structuralFeaturesParserClassName);
		result.append(", reorientConnectionViewCommandClassName: ");
		result.append(reorientConnectionViewCommandClassName);
		result.append(", editPartFactoryClassName: ");
		result.append(editPartFactoryClassName);
		result.append(", baseExternalNodeLabelEditPartClassName: ");
		result.append(baseExternalNodeLabelEditPartClassName);
		result.append(", baseItemSemanticEditPolicyClassName: ");
		result.append(baseItemSemanticEditPolicyClassName);
		result.append(", baseGraphicalNodeEditPolicyClassName: ");
		result.append(baseGraphicalNodeEditPolicyClassName);
		result.append(", referenceConnectionEditPolicyClassName: ");
		result.append(referenceConnectionEditPolicyClassName);
		result.append(", canonicalEditPolicyClassName: ");
		result.append(canonicalEditPolicyClassName);
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
		result.append(", initDiagramFileActionClassName: ");
		result.append(initDiagramFileActionClassName);
		result.append(", matchingStrategyClassName: ");
		result.append(matchingStrategyClassName);
		result.append(", preferenceInitializerClassName: ");
		result.append(preferenceInitializerClassName);
		result.append(", visualIDRegistryClassName: ");
		result.append(visualIDRegistryClassName);
		result.append(", elementChooserClassName: ");
		result.append(elementChooserClassName);
		result.append(", loadResourceActionClassName: ");
		result.append(loadResourceActionClassName);
		result.append(", createShortcutActionClassName: ");
		result.append(createShortcutActionClassName);
		result.append(", containsShortcutsTo: ");
		result.append(containsShortcutsTo);
		result.append(", shortcutsProvidedFor: ");
		result.append(shortcutsProvidedFor);
		result.append(", validationProviderClassName: ");
		result.append(validationProviderClassName);
		result.append(", validationProviderPriority: ");
		result.append(validationProviderPriority);
		result.append(", markerNavigationProviderClassName: ");
		result.append(markerNavigationProviderClassName);
		result.append(", markerNavigationProviderPriority: ");
		result.append(markerNavigationProviderPriority);
		result.append(", validationEnabled: ");
		result.append(validationEnabled);
		result.append(')');
		return result.toString();
	}

	public String getUniqueIdentifier() {
		return getDomainDiagramElement().getInterfaceName() + "_" + getVisualID();
	}

	String getDomainPackageCapName() {
		return ((GenEditorGeneratorImpl) getEditorGen()).getDomainModelCapName();
	}

	private String getEditorPackageName() {
		return getEditorGen().getEditor().getPackageName();
	}

	public String getMetaPackageName(ImportAssistant importManager) {
		return importManager.getImportedName(getDomainDiagramElement().getGenPackage().getQualifiedPackageInterfaceName());
	}
} //GenDiagramImpl
