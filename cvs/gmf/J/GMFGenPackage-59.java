/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2004/EmfaticAnnotationMap constraints='http://www.eclipse.org/gmf/2005/constraints' meta='http://www.eclipse.org/gmf/2005/constraints/meta' deprecated='http://www.eclipse.org/gmf/2006/deprecated'"
 *        annotation="http://www.eclipse.org/gmf/2005/constraints import='platform:/resource/org.eclipse.gmf.runtime.notation/model/notation.ecore'"
 * @generated
 */
public interface GMFGenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gmfgen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmf/2005/GenModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gmfgen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFGenPackage eINSTANCE = org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl <em>Gen Common Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenCommonBase()
	 * @generated
	 */
	int GEN_COMMON_BASE = 8;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__VISUAL_ID = 1;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__EDIT_PART_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__VIEWMAP = 5;

	/**
	 * The number of structural features of the '<em>Gen Common Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GenContainerBase <em>Gen Container Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GenContainerBase
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenContainerBase()
	 * @generated
	 */
	int GEN_CONTAINER_BASE = 9;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_BASE__DIAGRAM_RUN_TIME_CLASS = GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_BASE__VISUAL_ID = GEN_COMMON_BASE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_BASE__EDIT_PART_CLASS_NAME = GEN_COMMON_BASE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_BASE__VIEWMAP = GEN_COMMON_BASE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_BASE__CONTAINED_NODES = GEN_COMMON_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Container Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_BASE_FEATURE_COUNT = GEN_COMMON_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl <em>Gen Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenDiagram()
	 * @generated
	 */
	int GEN_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DIAGRAM_RUN_TIME_CLASS = GEN_CONTAINER_BASE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VISUAL_ID = GEN_CONTAINER_BASE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PART_CLASS_NAME = GEN_CONTAINER_BASE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_CONTAINER_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VIEWMAP = GEN_CONTAINER_BASE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CONTAINED_NODES = GEN_CONTAINER_BASE__CONTAINED_NODES;

	/**
	 * The feature id for the '<em><b>Edit Commands Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_COMMANDS_PACKAGE_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Parts Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edit Policies Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Editor Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDITOR_PACKAGE_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Providers Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Notation View Factories Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__NOTATION_VIEW_FACTORIES_PACKAGE_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Element Types Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ELEMENT_TYPES_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Semantic Hints Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__SEMANTIC_HINTS_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Notation View Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Edit Part Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Metamodel Support Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Modeling Assistant Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Property Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Icon Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Structural Feature Parser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Reorient Connection View Command Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Edit Part Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Base External Node Label Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Base Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Base Graphical Node Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Reference Connection Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Action Bar Contributor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ACTION_BAR_CONTRIBUTOR_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Creation Wizard Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Creation Wizard Page Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Diagram Editor Util Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Diagram File Creator Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DIAGRAM_FILE_CREATOR_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Document Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Editor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDITOR_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Init Diagram File Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Matching Strategy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Plugin Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PLUGIN_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Preference Initializer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Visual ID Registry Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Element Chooser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Create Shortcut Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Contains Shortcuts To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CONTAINS_SHORTCUTS_TO = GEN_CONTAINER_BASE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Shortcuts Provided For</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__SHORTCUTS_PROVIDED_FOR = GEN_CONTAINER_BASE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Validation Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VALIDATION_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Marker Navigation Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Validation Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VALIDATION_ENABLED = GEN_CONTAINER_BASE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Domain Meta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DOMAIN_META_MODEL = GEN_CONTAINER_BASE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Domain Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT = GEN_CONTAINER_BASE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CHILD_NODES = GEN_CONTAINER_BASE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Top Level Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__TOP_LEVEL_NODES = GEN_CONTAINER_BASE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__LINKS = GEN_CONTAINER_BASE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__COMPARTMENTS = GEN_CONTAINER_BASE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Audits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__AUDITS = GEN_CONTAINER_BASE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PALETTE = GEN_CONTAINER_BASE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Plugin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PLUGIN_ID = GEN_CONTAINER_BASE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PLUGIN_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PROVIDER_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Same File For Diagram And Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL = GEN_CONTAINER_BASE_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Printing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PRINTING_ENABLED = GEN_CONTAINER_BASE_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Diagram File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION = GEN_CONTAINER_BASE_FEATURE_COUNT + 54;

	/**
	 * The number of structural features of the '<em>Gen Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM_FEATURE_COUNT = GEN_CONTAINER_BASE_FEATURE_COUNT + 55;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation <em>Batch Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getBatchValidation()
	 * @generated
	 */
	int BATCH_VALIDATION = 1;

	/**
	 * The feature id for the '<em><b>Validation Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__VALIDATION_PROVIDER_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Marker Navigation Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__MARKER_NAVIGATION_PROVIDER_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Validation Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__VALIDATION_ENABLED = 2;

	/**
	 * The number of structural features of the '<em>Batch Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames <em>Provider Class Names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getProviderClassNames()
	 * @generated
	 */
	int PROVIDER_CLASS_NAMES = 2;

	/**
	 * The feature id for the '<em><b>Element Types Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__ELEMENT_TYPES_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Semantic Hints Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__SEMANTIC_HINTS_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Notation View Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__NOTATION_VIEW_PROVIDER_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Edit Part Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__EDIT_PART_PROVIDER_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Metamodel Support Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Modeling Assistant Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__MODELING_ASSISTANT_PROVIDER_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Property Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__PROPERTY_PROVIDER_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Icon Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__ICON_PROVIDER_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Structural Feature Parser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__STRUCTURAL_FEATURE_PARSER_CLASS_NAME = 8;

	/**
	 * The number of structural features of the '<em>Provider Class Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts <em>Shortcuts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.Shortcuts
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getShortcuts()
	 * @generated
	 */
	int SHORTCUTS = 3;

	/**
	 * The feature id for the '<em><b>Create Shortcut Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUTS__CREATE_SHORTCUT_ACTION_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains Shortcuts To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUTS__CONTAINS_SHORTCUTS_TO = 1;

	/**
	 * The feature id for the '<em><b>Shortcuts Provided For</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUTS__SHORTCUTS_PROVIDED_FOR = 2;

	/**
	 * The number of structural features of the '<em>Shortcuts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUTS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.PackageNames <em>Package Names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.PackageNames
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getPackageNames()
	 * @generated
	 */
	int PACKAGE_NAMES = 4;

	/**
	 * The feature id for the '<em><b>Edit Commands Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAMES__EDIT_COMMANDS_PACKAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Edit Parts Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAMES__EDIT_PARTS_PACKAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Edit Policies Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAMES__EDIT_POLICIES_PACKAGE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Editor Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAMES__EDITOR_PACKAGE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Providers Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAMES__PROVIDERS_PACKAGE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Notation View Factories Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAMES__NOTATION_VIEW_FACTORIES_PACKAGE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Package Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAMES_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.LinkConstraints <em>Link Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkConstraints
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getLinkConstraints()
	 * @generated
	 */
	int LINK_CONSTRAINTS = 5;

	/**
	 * The number of structural features of the '<em>Link Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINTS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies <em>Editor Candies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getEditorCandies()
	 * @generated
	 */
	int EDITOR_CANDIES = 6;

	/**
	 * The feature id for the '<em><b>Action Bar Contributor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__ACTION_BAR_CONTRIBUTOR_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Creation Wizard Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__CREATION_WIZARD_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Creation Wizard Page Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__CREATION_WIZARD_PAGE_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Diagram Editor Util Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__DIAGRAM_EDITOR_UTIL_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Diagram File Creator Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__DIAGRAM_FILE_CREATOR_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Document Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__DOCUMENT_PROVIDER_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Editor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__EDITOR_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Init Diagram File Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Matching Strategy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__MATCHING_STRATEGY_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Plugin Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__PLUGIN_CLASS_NAME = 9;

	/**
	 * The feature id for the '<em><b>Preference Initializer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__PREFERENCE_INITIALIZER_CLASS_NAME = 10;

	/**
	 * The feature id for the '<em><b>Visual ID Registry Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__VISUAL_ID_REGISTRY_CLASS_NAME = 11;

	/**
	 * The feature id for the '<em><b>Element Chooser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__ELEMENT_CHOOSER_CLASS_NAME = 12;

	/**
	 * The number of structural features of the '<em>Editor Candies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies <em>Edit Part Candies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getEditPartCandies()
	 * @generated
	 */
	int EDIT_PART_CANDIES = 7;

	/**
	 * The feature id for the '<em><b>Reorient Connection View Command Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Edit Part Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__EDIT_PART_FACTORY_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base External Node Label Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Base Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Base Graphical Node Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Reference Connection Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__CANONICAL_EDIT_POLICY_CLASS_NAME = 6;

	/**
	 * The number of structural features of the '<em>Edit Part Candies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl <em>Gen Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenNode()
	 * @generated
	 */
	int GEN_NODE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl <em>Gen Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenCompartment()
	 * @generated
	 */
	int GEN_COMPARTMENT = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl <em>Gen Child Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenChildContainer()
	 * @generated
	 */
	int GEN_CHILD_CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__DIAGRAM_RUN_TIME_CLASS = GEN_CONTAINER_BASE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__VISUAL_ID = GEN_CONTAINER_BASE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__EDIT_PART_CLASS_NAME = GEN_CONTAINER_BASE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_CONTAINER_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__VIEWMAP = GEN_CONTAINER_BASE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__CONTAINED_NODES = GEN_CONTAINER_BASE__CONTAINED_NODES;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__CHILD_NODES = GEN_CONTAINER_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__CANONICAL_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__LIST_LAYOUT = GEN_CONTAINER_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Child Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER_FEATURE_COUNT = GEN_CONTAINER_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__DIAGRAM_RUN_TIME_CLASS = GEN_CHILD_CONTAINER__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__VISUAL_ID = GEN_CHILD_CONTAINER__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__EDIT_PART_CLASS_NAME = GEN_CHILD_CONTAINER__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_CHILD_CONTAINER__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_CHILD_CONTAINER__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__VIEWMAP = GEN_CHILD_CONTAINER__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__CONTAINED_NODES = GEN_CHILD_CONTAINER__CONTAINED_NODES;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__CHILD_NODES = GEN_CHILD_CONTAINER__CHILD_NODES;

	/**
	 * The feature id for the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__CANONICAL_EDIT_POLICY_CLASS_NAME = GEN_CHILD_CONTAINER__CANONICAL_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>List Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__LIST_LAYOUT = GEN_CHILD_CONTAINER__LIST_LAYOUT;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__MODEL_FACET = GEN_CHILD_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__LABELS = GEN_CHILD_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__COMPARTMENTS = GEN_CHILD_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graphical Node Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME = GEN_CHILD_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gen Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_FEATURE_COUNT = GEN_CHILD_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenTopLevelNodeImpl <em>Gen Top Level Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenTopLevelNodeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenTopLevelNode()
	 * @generated
	 */
	int GEN_TOP_LEVEL_NODE = 12;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__DIAGRAM_RUN_TIME_CLASS = GEN_NODE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__VISUAL_ID = GEN_NODE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__EDIT_PART_CLASS_NAME = GEN_NODE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_NODE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__VIEWMAP = GEN_NODE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__CONTAINED_NODES = GEN_NODE__CONTAINED_NODES;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__CHILD_NODES = GEN_NODE__CHILD_NODES;

	/**
	 * The feature id for the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__CANONICAL_EDIT_POLICY_CLASS_NAME = GEN_NODE__CANONICAL_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>List Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__LIST_LAYOUT = GEN_NODE__LIST_LAYOUT;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__MODEL_FACET = GEN_NODE__MODEL_FACET;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__LABELS = GEN_NODE__LABELS;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__COMPARTMENTS = GEN_NODE__COMPARTMENTS;

	/**
	 * The feature id for the '<em><b>Graphical Node Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME = GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__DIAGRAM = GEN_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Top Level Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE_FEATURE_COUNT = GEN_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildNodeImpl <em>Gen Child Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenChildNodeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenChildNode()
	 * @generated
	 */
	int GEN_CHILD_NODE = 13;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__DIAGRAM_RUN_TIME_CLASS = GEN_NODE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__VISUAL_ID = GEN_NODE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__EDIT_PART_CLASS_NAME = GEN_NODE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_NODE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__VIEWMAP = GEN_NODE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__CONTAINED_NODES = GEN_NODE__CONTAINED_NODES;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__CHILD_NODES = GEN_NODE__CHILD_NODES;

	/**
	 * The feature id for the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__CANONICAL_EDIT_POLICY_CLASS_NAME = GEN_NODE__CANONICAL_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>List Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__LIST_LAYOUT = GEN_NODE__LIST_LAYOUT;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__MODEL_FACET = GEN_NODE__MODEL_FACET;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__LABELS = GEN_NODE__LABELS;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__COMPARTMENTS = GEN_NODE__COMPARTMENTS;

	/**
	 * The feature id for the '<em><b>Graphical Node Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME = GEN_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__DIAGRAM = GEN_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__CONTAINERS = GEN_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Child Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE_FEATURE_COUNT = GEN_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__DIAGRAM_RUN_TIME_CLASS = GEN_CHILD_CONTAINER__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__VISUAL_ID = GEN_CHILD_CONTAINER__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__EDIT_PART_CLASS_NAME = GEN_CHILD_CONTAINER__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_CHILD_CONTAINER__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_CHILD_CONTAINER__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__VIEWMAP = GEN_CHILD_CONTAINER__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__CONTAINED_NODES = GEN_CHILD_CONTAINER__CONTAINED_NODES;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__CHILD_NODES = GEN_CHILD_CONTAINER__CHILD_NODES;

	/**
	 * The feature id for the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__CANONICAL_EDIT_POLICY_CLASS_NAME = GEN_CHILD_CONTAINER__CANONICAL_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>List Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__LIST_LAYOUT = GEN_CHILD_CONTAINER__LIST_LAYOUT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__TITLE = GEN_CHILD_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Can Collapse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__CAN_COLLAPSE = GEN_CHILD_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hide If Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__HIDE_IF_EMPTY = GEN_CHILD_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Needs Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__NEEDS_TITLE = GEN_CHILD_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__DIAGRAM = GEN_CHILD_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__NODE = GEN_CHILD_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gen Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT_FEATURE_COUNT = GEN_CHILD_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl <em>Gen Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenLink()
	 * @generated
	 */
	int GEN_LINK = 15;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__DIAGRAM_RUN_TIME_CLASS = GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__VISUAL_ID = GEN_COMMON_BASE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__EDIT_PART_CLASS_NAME = GEN_COMMON_BASE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__VIEWMAP = GEN_COMMON_BASE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__DIAGRAM = GEN_COMMON_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__MODEL_FACET = GEN_COMMON_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__LABELS = GEN_COMMON_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing Creation Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__OUTGOING_CREATION_ALLOWED = GEN_COMMON_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming Creation Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__INCOMING_CREATION_ALLOWED = GEN_COMMON_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Direction Aligned With Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__VIEW_DIRECTION_ALIGNED_WITH_MODEL = GEN_COMMON_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Creation Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__CREATION_CONSTRAINTS = GEN_COMMON_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Gen Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_FEATURE_COUNT = GEN_COMMON_BASE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLabelImpl <em>Gen Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenLabelImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenLabel()
	 * @generated
	 */
	int GEN_LABEL = 16;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__DIAGRAM_RUN_TIME_CLASS = GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__VISUAL_ID = GEN_COMMON_BASE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__EDIT_PART_CLASS_NAME = GEN_COMMON_BASE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__VIEWMAP = GEN_COMMON_BASE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__READ_ONLY = GEN_COMMON_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__MODEL_FACET = GEN_COMMON_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL_FEATURE_COUNT = GEN_COMMON_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.ExternalLabel <em>External Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.ExternalLabel
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getExternalLabel()
	 * @generated
	 */
	int EXTERNAL_LABEL = 17;

	/**
	 * The feature id for the '<em><b>Text Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LABEL__TEXT_EDIT_PART_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Text Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LABEL__TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME = 1;

	/**
	 * The number of structural features of the '<em>External Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LABEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeLabelImpl <em>Gen Node Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenNodeLabelImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenNodeLabel()
	 * @generated
	 */
	int GEN_NODE_LABEL = 18;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__DIAGRAM_RUN_TIME_CLASS = GEN_LABEL__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__VISUAL_ID = GEN_LABEL__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__EDIT_PART_CLASS_NAME = GEN_LABEL__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_LABEL__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_LABEL__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__VIEWMAP = GEN_LABEL__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__READ_ONLY = GEN_LABEL__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__MODEL_FACET = GEN_LABEL__MODEL_FACET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__NODE = GEN_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Node Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL_FEATURE_COUNT = GEN_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExternalNodeLabelImpl <em>Gen External Node Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenExternalNodeLabelImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenExternalNodeLabel()
	 * @generated
	 */
	int GEN_EXTERNAL_NODE_LABEL = 19;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__DIAGRAM_RUN_TIME_CLASS = GEN_NODE_LABEL__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__VISUAL_ID = GEN_NODE_LABEL__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__EDIT_PART_CLASS_NAME = GEN_NODE_LABEL__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_NODE_LABEL__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_NODE_LABEL__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__VIEWMAP = GEN_NODE_LABEL__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__READ_ONLY = GEN_NODE_LABEL__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__MODEL_FACET = GEN_NODE_LABEL__MODEL_FACET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__NODE = GEN_NODE_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Text Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__TEXT_EDIT_PART_CLASS_NAME = GEN_NODE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_NODE_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen External Node Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL_FEATURE_COUNT = GEN_NODE_LABEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkLabelImpl <em>Gen Link Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenLinkLabelImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenLinkLabel()
	 * @generated
	 */
	int GEN_LINK_LABEL = 20;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__DIAGRAM_RUN_TIME_CLASS = GEN_LABEL__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__VISUAL_ID = GEN_LABEL__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__EDIT_PART_CLASS_NAME = GEN_LABEL__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_LABEL__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_LABEL__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__VIEWMAP = GEN_LABEL__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__READ_ONLY = GEN_LABEL__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__MODEL_FACET = GEN_LABEL__MODEL_FACET;

	/**
	 * The feature id for the '<em><b>Text Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__TEXT_EDIT_PART_CLASS_NAME = GEN_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__TEXT_NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__LINK = GEN_LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__ALIGNMENT = GEN_LABEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gen Link Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL_FEATURE_COUNT = GEN_LABEL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.ModelFacet <em>Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.ModelFacet
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getModelFacet()
	 * @generated
	 */
	int MODEL_FACET = 21;

	/**
	 * The number of structural features of the '<em>Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.LinkModelFacet <em>Link Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkModelFacet
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getLinkModelFacet()
	 * @generated
	 */
	int LINK_MODEL_FACET = 22;

	/**
	 * The number of structural features of the '<em>Link Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MODEL_FACET_FEATURE_COUNT = MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeModelFacetImpl <em>Type Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.TypeModelFacetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getTypeModelFacet()
	 * @generated
	 */
	int TYPE_MODEL_FACET = 23;

	/**
	 * The feature id for the '<em><b>Meta Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_FACET__META_CLASS = MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containment Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_FACET__CONTAINMENT_META_FEATURE = MODEL_FACET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_FACET__CHILD_META_FEATURE = MODEL_FACET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Element Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR = MODEL_FACET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Element Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER = MODEL_FACET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_FACET_FEATURE_COUNT = MODEL_FACET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureModelFacetImpl <em>Feature Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.FeatureModelFacetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getFeatureModelFacet()
	 * @generated
	 */
	int FEATURE_MODEL_FACET = 24;

	/**
	 * The feature id for the '<em><b>Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FACET__META_FEATURE = MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FACET_FEATURE_COUNT = MODEL_FACET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeLinkModelFacetImpl <em>Type Link Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.TypeLinkModelFacetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getTypeLinkModelFacet()
	 * @generated
	 */
	int TYPE_LINK_MODEL_FACET = 25;

	/**
	 * The feature id for the '<em><b>Meta Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LINK_MODEL_FACET__META_CLASS = TYPE_MODEL_FACET__META_CLASS;

	/**
	 * The feature id for the '<em><b>Containment Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LINK_MODEL_FACET__CONTAINMENT_META_FEATURE = TYPE_MODEL_FACET__CONTAINMENT_META_FEATURE;

	/**
	 * The feature id for the '<em><b>Child Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LINK_MODEL_FACET__CHILD_META_FEATURE = TYPE_MODEL_FACET__CHILD_META_FEATURE;

	/**
	 * The feature id for the '<em><b>Model Element Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_SELECTOR = TYPE_MODEL_FACET__MODEL_ELEMENT_SELECTOR;

	/**
	 * The feature id for the '<em><b>Model Element Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LINK_MODEL_FACET__MODEL_ELEMENT_INITIALIZER = TYPE_MODEL_FACET__MODEL_ELEMENT_INITIALIZER;

	/**
	 * The feature id for the '<em><b>Source Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LINK_MODEL_FACET__SOURCE_META_FEATURE = TYPE_MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LINK_MODEL_FACET__TARGET_META_FEATURE = TYPE_MODEL_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Link Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LINK_MODEL_FACET_FEATURE_COUNT = TYPE_MODEL_FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl <em>Viewmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getViewmap()
	 * @generated
	 */
	int VIEWMAP = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.Attributes <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.Attributes
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 26;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ColorAttributesImpl <em>Color Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ColorAttributesImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getColorAttributes()
	 * @generated
	 */
	int COLOR_ATTRIBUTES = 27;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ATTRIBUTES__FOREGROUND_COLOR = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ATTRIBUTES__BACKGROUND_COLOR = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Color Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ATTRIBUTES_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ShapeAttributesImpl <em>Shape Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ShapeAttributesImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getShapeAttributes()
	 * @generated
	 */
	int SHAPE_ATTRIBUTES = 28;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_ATTRIBUTES__LINE_WIDTH = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_ATTRIBUTES__LINE_STYLE = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shape Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_ATTRIBUTES_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.DefaultSizeAttributesImpl <em>Default Size Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.DefaultSizeAttributesImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getDefaultSizeAttributes()
	 * @generated
	 */
	int DEFAULT_SIZE_ATTRIBUTES = 29;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SIZE_ATTRIBUTES__WIDTH = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SIZE_ATTRIBUTES__HEIGHT = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default Size Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SIZE_ATTRIBUTES_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWMAP__ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Viewmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWMAP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.FigureViewmapImpl <em>Figure Viewmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.FigureViewmapImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getFigureViewmap()
	 * @generated
	 */
	int FIGURE_VIEWMAP = 31;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_VIEWMAP__ATTRIBUTES = VIEWMAP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Figure Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME = VIEWMAP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Figure Viewmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_VIEWMAP_FEATURE_COUNT = VIEWMAP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.SnippetViewmapImpl <em>Snippet Viewmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.SnippetViewmapImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getSnippetViewmap()
	 * @generated
	 */
	int SNIPPET_VIEWMAP = 32;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_VIEWMAP__ATTRIBUTES = VIEWMAP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_VIEWMAP__BODY = VIEWMAP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Snippet Viewmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_VIEWMAP_FEATURE_COUNT = VIEWMAP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.InnerClassViewmapImpl <em>Inner Class Viewmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.InnerClassViewmapImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getInnerClassViewmap()
	 * @generated
	 */
	int INNER_CLASS_VIEWMAP = 33;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_CLASS_VIEWMAP__ATTRIBUTES = VIEWMAP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_CLASS_VIEWMAP__CLASS_NAME = VIEWMAP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_CLASS_VIEWMAP__CLASS_BODY = VIEWMAP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inner Class Viewmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_CLASS_VIEWMAP_FEATURE_COUNT = VIEWMAP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl <em>Palette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getPalette()
	 * @generated
	 */
	int PALETTE = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl <em>Entry Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getEntryBase()
	 * @generated
	 */
	int ENTRY_BASE = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl <em>Tool Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getToolEntry()
	 * @generated
	 */
	int TOOL_ENTRY = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.NodeEntryImpl <em>Node Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.NodeEntryImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getNodeEntry()
	 * @generated
	 */
	int NODE_ENTRY = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.LinkEntryImpl <em>Link Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.LinkEntryImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getLinkEntry()
	 * @generated
	 */
	int LINK_ENTRY = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl <em>Tool Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getToolGroup()
	 * @generated
	 */
	int TOOL_GROUP = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ValueExpressionImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION__BODY = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ModelElementSelectorImpl <em>Model Element Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ModelElementSelectorImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getModelElementSelector()
	 * @generated
	 */
	int MODEL_ELEMENT_SELECTOR = 35;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_SELECTOR__BODY = VALUE_EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_SELECTOR__LANGUAGE = VALUE_EXPRESSION__LANGUAGE;

	/**
	 * The number of structural features of the '<em>Model Element Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_SELECTOR_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Flyout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__FLYOUT = 2;

	/**
	 * The feature id for the '<em><b>Need Zoom Tools</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__NEED_ZOOM_TOOLS = 3;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__PACKAGE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__FACTORY_CLASS_NAME = 5;

	/**
	 * The number of structural features of the '<em>Palette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__ORDER = 0;

	/**
	 * The feature id for the '<em><b>Title Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__TITLE_KEY = 1;

	/**
	 * The feature id for the '<em><b>Description Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__DESCRIPTION_KEY = 2;

	/**
	 * The feature id for the '<em><b>Large Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__LARGE_ICON_PATH = 3;

	/**
	 * The feature id for the '<em><b>Small Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__SMALL_ICON_PATH = 4;

	/**
	 * The feature id for the '<em><b>Create Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__CREATE_METHOD_NAME = 5;

	/**
	 * The feature id for the '<em><b>Entry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__ENTRY_ID = 6;

	/**
	 * The number of structural features of the '<em>Entry Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE_FEATURE_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__ORDER = ENTRY_BASE__ORDER;

	/**
	 * The feature id for the '<em><b>Title Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__TITLE_KEY = ENTRY_BASE__TITLE_KEY;

	/**
	 * The feature id for the '<em><b>Description Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__DESCRIPTION_KEY = ENTRY_BASE__DESCRIPTION_KEY;

	/**
	 * The feature id for the '<em><b>Large Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__LARGE_ICON_PATH = ENTRY_BASE__LARGE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Small Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__SMALL_ICON_PATH = ENTRY_BASE__SMALL_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Create Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__CREATE_METHOD_NAME = ENTRY_BASE__CREATE_METHOD_NAME;

	/**
	 * The feature id for the '<em><b>Entry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__ENTRY_ID = ENTRY_BASE__ENTRY_ID;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__DEFAULT = ENTRY_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tool Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY_FEATURE_COUNT = ENTRY_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__ORDER = TOOL_ENTRY__ORDER;

	/**
	 * The feature id for the '<em><b>Title Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__TITLE_KEY = TOOL_ENTRY__TITLE_KEY;

	/**
	 * The feature id for the '<em><b>Description Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__DESCRIPTION_KEY = TOOL_ENTRY__DESCRIPTION_KEY;

	/**
	 * The feature id for the '<em><b>Large Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__LARGE_ICON_PATH = TOOL_ENTRY__LARGE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Small Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__SMALL_ICON_PATH = TOOL_ENTRY__SMALL_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Create Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__CREATE_METHOD_NAME = TOOL_ENTRY__CREATE_METHOD_NAME;

	/**
	 * The feature id for the '<em><b>Entry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__ENTRY_ID = TOOL_ENTRY__ENTRY_ID;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__DEFAULT = TOOL_ENTRY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Gen Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__GEN_NODE = TOOL_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__GROUP = TOOL_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY_FEATURE_COUNT = TOOL_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__ORDER = TOOL_ENTRY__ORDER;

	/**
	 * The feature id for the '<em><b>Title Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__TITLE_KEY = TOOL_ENTRY__TITLE_KEY;

	/**
	 * The feature id for the '<em><b>Description Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__DESCRIPTION_KEY = TOOL_ENTRY__DESCRIPTION_KEY;

	/**
	 * The feature id for the '<em><b>Large Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__LARGE_ICON_PATH = TOOL_ENTRY__LARGE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Small Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__SMALL_ICON_PATH = TOOL_ENTRY__SMALL_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Create Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__CREATE_METHOD_NAME = TOOL_ENTRY__CREATE_METHOD_NAME;

	/**
	 * The feature id for the '<em><b>Entry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__ENTRY_ID = TOOL_ENTRY__ENTRY_ID;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__DEFAULT = TOOL_ENTRY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Gen Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__GEN_LINK = TOOL_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__GROUP = TOOL_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY_FEATURE_COUNT = TOOL_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__ORDER = ENTRY_BASE__ORDER;

	/**
	 * The feature id for the '<em><b>Title Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__TITLE_KEY = ENTRY_BASE__TITLE_KEY;

	/**
	 * The feature id for the '<em><b>Description Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__DESCRIPTION_KEY = ENTRY_BASE__DESCRIPTION_KEY;

	/**
	 * The feature id for the '<em><b>Large Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__LARGE_ICON_PATH = ENTRY_BASE__LARGE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Small Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__SMALL_ICON_PATH = ENTRY_BASE__SMALL_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Create Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__CREATE_METHOD_NAME = ENTRY_BASE__CREATE_METHOD_NAME;

	/**
	 * The feature id for the '<em><b>Entry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__ENTRY_ID = ENTRY_BASE__ENTRY_ID;

	/**
	 * The feature id for the '<em><b>Node Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__NODE_TOOLS = ENTRY_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__LINK_TOOLS = ENTRY_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Palette</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__PALETTE = ENTRY_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tool Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP_FEATURE_COUNT = ENTRY_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenElementInitializerImpl <em>Gen Element Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenElementInitializerImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenElementInitializer()
	 * @generated
	 */
	int GEN_ELEMENT_INITIALIZER = 42;

	/**
	 * The feature id for the '<em><b>Type Model Facet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT_INITIALIZER__TYPE_MODEL_FACET = 0;

	/**
	 * The number of structural features of the '<em>Gen Element Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT_INITIALIZER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureSeqInitializerImpl <em>Gen Feature Seq Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureSeqInitializerImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenFeatureSeqInitializer()
	 * @generated
	 */
	int GEN_FEATURE_SEQ_INITIALIZER = 43;

	/**
	 * The feature id for the '<em><b>Type Model Facet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_SEQ_INITIALIZER__TYPE_MODEL_FACET = GEN_ELEMENT_INITIALIZER__TYPE_MODEL_FACET;

	/**
	 * The feature id for the '<em><b>Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_SEQ_INITIALIZER__INITIALIZERS = GEN_ELEMENT_INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Feature Seq Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_SEQ_INITIALIZER_FEATURE_COUNT = GEN_ELEMENT_INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureValueSpecImpl <em>Gen Feature Value Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureValueSpecImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenFeatureValueSpec()
	 * @generated
	 */
	int GEN_FEATURE_VALUE_SPEC = 44;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_VALUE_SPEC__BODY = VALUE_EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_VALUE_SPEC__LANGUAGE = VALUE_EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_VALUE_SPEC__FEATURE = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Feature Value Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_VALUE_SPEC_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkConstraintsImpl <em>Gen Link Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenLinkConstraintsImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenLinkConstraints()
	 * @generated
	 */
	int GEN_LINK_CONSTRAINTS = 45;

	/**
	 * The feature id for the '<em><b>Link</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_CONSTRAINTS__LINK = 0;

	/**
	 * The feature id for the '<em><b>Source End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_CONSTRAINTS__SOURCE_END = 1;

	/**
	 * The feature id for the '<em><b>Target End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_CONSTRAINTS__TARGET_END = 2;

	/**
	 * The number of structural features of the '<em>Gen Link Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_CONSTRAINTS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl <em>Gen Audit Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenAuditContainer()
	 * @generated
	 */
	int GEN_AUDIT_CONTAINER = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Parent Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__PARENT_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Audits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__AUDITS = 4;

	/**
	 * The feature id for the '<em><b>Child Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__CHILD_CONTAINERS = 5;

	/**
	 * The number of structural features of the '<em>Gen Audit Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl <em>Gen Audit Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenAuditRule()
	 * @generated
	 */
	int GEN_AUDIT_RULE = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__RULE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__SEVERITY = 6;

	/**
	 * The feature id for the '<em><b>Use In Live Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__USE_IN_LIVE_MODE = 7;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__CONTAINER = 8;

	/**
	 * The number of structural features of the '<em>Gen Audit Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment <em>Link Label Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getLinkLabelAlignment()
	 * @generated
	 */
	int LINK_LABEL_ALIGNMENT = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GenSeverity <em>Gen Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GenSeverity
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenSeverity()
	 * @generated
	 */
	int GEN_SEVERITY = 49;

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram <em>Gen Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Diagram</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram
	 * @generated
	 */
	EClass getGenDiagram();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainMetaModel <em>Domain Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Meta Model</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainMetaModel()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EReference getGenDiagram_DomainMetaModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainDiagramElement <em>Domain Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Diagram Element</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainDiagramElement()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EReference getGenDiagram_DomainDiagramElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Nodes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getChildNodes()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EReference getGenDiagram_ChildNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getTopLevelNodes <em>Top Level Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Top Level Nodes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getTopLevelNodes()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EReference getGenDiagram_TopLevelNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getLinks()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EReference getGenDiagram_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartments</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getCompartments()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EReference getGenDiagram_Compartments();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getAudits <em>Audits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audits</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getAudits()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EReference getGenDiagram_Audits();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPalette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Palette</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPalette()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EReference getGenDiagram_Palette();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginName <em>Plugin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_PluginName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProviderName <em>Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProviderName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_ProviderName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginID <em>Plugin ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginID()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_PluginID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDiagramFileExtension <em>Diagram File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram File Extension</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDiagramFileExtension()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_DiagramFileExtension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation <em>Batch Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batch Validation</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation
	 * @generated
	 */
	EClass getBatchValidation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationProviderClassName <em>Validation Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationProviderClassName()
	 * @see #getBatchValidation()
	 * @generated
	 */
	EAttribute getBatchValidation_ValidationProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMarkerNavigationProviderClassName <em>Marker Navigation Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Navigation Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMarkerNavigationProviderClassName()
	 * @see #getBatchValidation()
	 * @generated
	 */
	EAttribute getBatchValidation_MarkerNavigationProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#isValidationEnabled <em>Validation Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Enabled</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation#isValidationEnabled()
	 * @see #getBatchValidation()
	 * @generated
	 */
	EAttribute getBatchValidation_ValidationEnabled();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames <em>Provider Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider Class Names</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames
	 * @generated
	 */
	EClass getProviderClassNames();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getElementTypesClassName <em>Element Types Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Types Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getElementTypesClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_ElementTypesClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getSemanticHintsClassName <em>Semantic Hints Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Hints Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getSemanticHintsClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_SemanticHintsClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getNotationViewProviderClassName <em>Notation View Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notation View Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getNotationViewProviderClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_NotationViewProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getEditPartProviderClassName <em>Edit Part Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Part Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getEditPartProviderClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_EditPartProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getMetamodelSupportProviderClassName <em>Metamodel Support Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Support Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getMetamodelSupportProviderClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_MetamodelSupportProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getModelingAssistantProviderClassName <em>Modeling Assistant Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modeling Assistant Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getModelingAssistantProviderClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_ModelingAssistantProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getPropertyProviderClassName <em>Property Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getPropertyProviderClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_PropertyProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getIconProviderClassName <em>Icon Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getIconProviderClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_IconProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getStructuralFeatureParserClassName <em>Structural Feature Parser Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structural Feature Parser Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getStructuralFeatureParserClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_StructuralFeatureParserClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts <em>Shortcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shortcuts</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Shortcuts
	 * @generated
	 */
	EClass getShortcuts();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getCreateShortcutActionClassName <em>Create Shortcut Action Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Shortcut Action Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Shortcuts#getCreateShortcutActionClassName()
	 * @see #getShortcuts()
	 * @generated
	 */
	EAttribute getShortcuts_CreateShortcutActionClassName();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getContainsShortcutsTo <em>Contains Shortcuts To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contains Shortcuts To</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Shortcuts#getContainsShortcutsTo()
	 * @see #getShortcuts()
	 * @generated
	 */
	EAttribute getShortcuts_ContainsShortcutsTo();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getShortcutsProvidedFor <em>Shortcuts Provided For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shortcuts Provided For</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Shortcuts#getShortcutsProvidedFor()
	 * @see #getShortcuts()
	 * @generated
	 */
	EAttribute getShortcuts_ShortcutsProvidedFor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.PackageNames <em>Package Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Names</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.PackageNames
	 * @generated
	 */
	EClass getPackageNames();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.PackageNames#getEditCommandsPackageName <em>Edit Commands Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Commands Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.PackageNames#getEditCommandsPackageName()
	 * @see #getPackageNames()
	 * @generated
	 */
	EAttribute getPackageNames_EditCommandsPackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.PackageNames#getEditPartsPackageName <em>Edit Parts Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Parts Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.PackageNames#getEditPartsPackageName()
	 * @see #getPackageNames()
	 * @generated
	 */
	EAttribute getPackageNames_EditPartsPackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.PackageNames#getEditPoliciesPackageName <em>Edit Policies Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Policies Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.PackageNames#getEditPoliciesPackageName()
	 * @see #getPackageNames()
	 * @generated
	 */
	EAttribute getPackageNames_EditPoliciesPackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.PackageNames#getEditorPackageName <em>Editor Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.PackageNames#getEditorPackageName()
	 * @see #getPackageNames()
	 * @generated
	 */
	EAttribute getPackageNames_EditorPackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.PackageNames#getProvidersPackageName <em>Providers Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Providers Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.PackageNames#getProvidersPackageName()
	 * @see #getPackageNames()
	 * @generated
	 */
	EAttribute getPackageNames_ProvidersPackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.PackageNames#getNotationViewFactoriesPackageName <em>Notation View Factories Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notation View Factories Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.PackageNames#getNotationViewFactoriesPackageName()
	 * @see #getPackageNames()
	 * @generated
	 */
	EAttribute getPackageNames_NotationViewFactoriesPackageName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.LinkConstraints <em>Link Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Constraints</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkConstraints
	 * @generated
	 */
	EClass getLinkConstraints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies <em>Editor Candies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor Candies</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies
	 * @generated
	 */
	EClass getEditorCandies();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getActionBarContributorClassName <em>Action Bar Contributor Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Bar Contributor Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getActionBarContributorClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_ActionBarContributorClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardClassName <em>Creation Wizard Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Wizard Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_CreationWizardClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardPageClassName <em>Creation Wizard Page Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Wizard Page Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardPageClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_CreationWizardPageClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDiagramEditorUtilClassName <em>Diagram Editor Util Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram Editor Util Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDiagramEditorUtilClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_DiagramEditorUtilClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDiagramFileCreatorClassName <em>Diagram File Creator Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram File Creator Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDiagramFileCreatorClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_DiagramFileCreatorClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDocumentProviderClassName <em>Document Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getDocumentProviderClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_DocumentProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getEditorClassName <em>Editor Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getEditorClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_EditorClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getInitDiagramFileActionClassName <em>Init Diagram File Action Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Diagram File Action Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getInitDiagramFileActionClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_InitDiagramFileActionClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getMatchingStrategyClassName <em>Matching Strategy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Strategy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getMatchingStrategyClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_MatchingStrategyClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getPluginClassName <em>Plugin Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getPluginClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_PluginClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getPreferenceInitializerClassName <em>Preference Initializer Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preference Initializer Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getPreferenceInitializerClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_PreferenceInitializerClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getVisualIDRegistryClassName <em>Visual ID Registry Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual ID Registry Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getVisualIDRegistryClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_VisualIDRegistryClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getElementChooserClassName <em>Element Chooser Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Chooser Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getElementChooserClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_ElementChooserClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies <em>Edit Part Candies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Part Candies</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies
	 * @generated
	 */
	EClass getEditPartCandies();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getReorientConnectionViewCommandClassName <em>Reorient Connection View Command Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reorient Connection View Command Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getReorientConnectionViewCommandClassName()
	 * @see #getEditPartCandies()
	 * @generated
	 */
	EAttribute getEditPartCandies_ReorientConnectionViewCommandClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getEditPartFactoryClassName <em>Edit Part Factory Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Part Factory Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getEditPartFactoryClassName()
	 * @see #getEditPartCandies()
	 * @generated
	 */
	EAttribute getEditPartCandies_EditPartFactoryClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getBaseExternalNodeLabelEditPartClassName <em>Base External Node Label Edit Part Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base External Node Label Edit Part Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getBaseExternalNodeLabelEditPartClassName()
	 * @see #getEditPartCandies()
	 * @generated
	 */
	EAttribute getEditPartCandies_BaseExternalNodeLabelEditPartClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getBaseItemSemanticEditPolicyClassName <em>Base Item Semantic Edit Policy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Item Semantic Edit Policy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getBaseItemSemanticEditPolicyClassName()
	 * @see #getEditPartCandies()
	 * @generated
	 */
	EAttribute getEditPartCandies_BaseItemSemanticEditPolicyClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getBaseGraphicalNodeEditPolicyClassName <em>Base Graphical Node Edit Policy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Graphical Node Edit Policy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getBaseGraphicalNodeEditPolicyClassName()
	 * @see #getEditPartCandies()
	 * @generated
	 */
	EAttribute getEditPartCandies_BaseGraphicalNodeEditPolicyClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getReferenceConnectionEditPolicyClassName <em>Reference Connection Edit Policy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Connection Edit Policy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getReferenceConnectionEditPolicyClassName()
	 * @see #getEditPartCandies()
	 * @generated
	 */
	EAttribute getEditPartCandies_ReferenceConnectionEditPolicyClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getCanonicalEditPolicyClassName <em>Canonical Edit Policy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canonical Edit Policy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getCanonicalEditPolicyClassName()
	 * @see #getEditPartCandies()
	 * @generated
	 */
	EAttribute getEditPartCandies_CanonicalEditPolicyClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Same File For Diagram And Model</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#isSameFileForDiagramAndModel()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_SameFileForDiagramAndModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isPrintingEnabled <em>Printing Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printing Enabled</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#isPrintingEnabled()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_PrintingEnabled();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase <em>Gen Common Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Common Base</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCommonBase
	 * @generated
	 */
	EClass getGenCommonBase();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getDiagramRunTimeClass <em>Diagram Run Time Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Run Time Class</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getDiagramRunTimeClass()
	 * @see #getGenCommonBase()
	 * @generated
	 */
	EReference getGenCommonBase_DiagramRunTimeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getVisualID <em>Visual ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getVisualID()
	 * @see #getGenCommonBase()
	 * @generated
	 */
	EAttribute getGenCommonBase_VisualID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getEditPartClassName <em>Edit Part Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Part Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getEditPartClassName()
	 * @see #getGenCommonBase()
	 * @generated
	 */
	EAttribute getGenCommonBase_EditPartClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getItemSemanticEditPolicyClassName <em>Item Semantic Edit Policy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Semantic Edit Policy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getItemSemanticEditPolicyClassName()
	 * @see #getGenCommonBase()
	 * @generated
	 */
	EAttribute getGenCommonBase_ItemSemanticEditPolicyClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getNotationViewFactoryClassName <em>Notation View Factory Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notation View Factory Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getNotationViewFactoryClassName()
	 * @see #getGenCommonBase()
	 * @generated
	 */
	EAttribute getGenCommonBase_NotationViewFactoryClassName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getViewmap <em>Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Viewmap</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getViewmap()
	 * @see #getGenCommonBase()
	 * @generated
	 */
	EReference getGenCommonBase_Viewmap();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenContainerBase <em>Gen Container Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Container Base</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenContainerBase
	 * @generated
	 */
	EClass getGenContainerBase();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenContainerBase#getContainedNodes <em>Contained Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Nodes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenContainerBase#getContainedNodes()
	 * @see #getGenContainerBase()
	 * @generated
	 */
	EReference getGenContainerBase_ContainedNodes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenNode <em>Gen Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode
	 * @generated
	 */
	EClass getGenNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getLabels()
	 * @see #getGenNode()
	 * @generated
	 */
	EReference getGenNode_Labels();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compartments</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getCompartments()
	 * @see #getGenNode()
	 * @generated
	 */
	EReference getGenNode_Compartments();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getGraphicalNodeEditPolicyClassName <em>Graphical Node Edit Policy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graphical Node Edit Policy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getGraphicalNodeEditPolicyClassName()
	 * @see #getGenNode()
	 * @generated
	 */
	EAttribute getGenNode_GraphicalNodeEditPolicyClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode <em>Gen Top Level Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Top Level Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode
	 * @generated
	 */
	EClass getGenTopLevelNode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode#getDiagram()
	 * @see #getGenTopLevelNode()
	 * @generated
	 */
	EReference getGenTopLevelNode_Diagram();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode <em>Gen Child Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Child Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildNode
	 * @generated
	 */
	EClass getGenChildNode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildNode#getDiagram()
	 * @see #getGenChildNode()
	 * @generated
	 */
	EReference getGenChildNode_Diagram();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containers</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildNode#getContainers()
	 * @see #getGenChildNode()
	 * @generated
	 */
	EReference getGenChildNode_Containers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment <em>Gen Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Compartment</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCompartment
	 * @generated
	 */
	EClass getGenCompartment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCompartment#getTitle()
	 * @see #getGenCompartment()
	 * @generated
	 */
	EAttribute getGenCompartment_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isCanCollapse <em>Can Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Collapse</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCompartment#isCanCollapse()
	 * @see #getGenCompartment()
	 * @generated
	 */
	EAttribute getGenCompartment_CanCollapse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isHideIfEmpty <em>Hide If Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide If Empty</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCompartment#isHideIfEmpty()
	 * @see #getGenCompartment()
	 * @generated
	 */
	EAttribute getGenCompartment_HideIfEmpty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isNeedsTitle <em>Needs Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Title</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCompartment#isNeedsTitle()
	 * @see #getGenCompartment()
	 * @generated
	 */
	EAttribute getGenCompartment_NeedsTitle();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCompartment#getDiagram()
	 * @see #getGenCompartment()
	 * @generated
	 */
	EReference getGenCompartment_Diagram();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCompartment#getNode()
	 * @see #getGenCompartment()
	 * @generated
	 */
	EReference getGenCompartment_Node();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getModelFacet <em>Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getModelFacet()
	 * @see #getGenNode()
	 * @generated
	 */
	EReference getGenNode_ModelFacet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer <em>Gen Child Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Child Container</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer
	 * @generated
	 */
	EClass getGenChildContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Nodes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getChildNodes()
	 * @see #getGenChildContainer()
	 * @generated
	 */
	EReference getGenChildContainer_ChildNodes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getCanonicalEditPolicyClassName <em>Canonical Edit Policy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canonical Edit Policy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getCanonicalEditPolicyClassName()
	 * @see #getGenChildContainer()
	 * @generated
	 */
	EAttribute getGenChildContainer_CanonicalEditPolicyClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isListLayout <em>List Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Layout</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isListLayout()
	 * @see #getGenChildContainer()
	 * @generated
	 */
	EAttribute getGenChildContainer_ListLayout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenLink <em>Gen Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Link</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink
	 * @generated
	 */
	EClass getGenLink();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink#getDiagram()
	 * @see #getGenLink()
	 * @generated
	 */
	EReference getGenLink_Diagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getModelFacet <em>Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink#getModelFacet()
	 * @see #getGenLink()
	 * @generated
	 */
	EReference getGenLink_ModelFacet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink#getLabels()
	 * @see #getGenLink()
	 * @generated
	 */
	EReference getGenLink_Labels();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#isOutgoingCreationAllowed <em>Outgoing Creation Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outgoing Creation Allowed</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink#isOutgoingCreationAllowed()
	 * @see #getGenLink()
	 * @generated
	 */
	EAttribute getGenLink_OutgoingCreationAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#isIncomingCreationAllowed <em>Incoming Creation Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incoming Creation Allowed</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink#isIncomingCreationAllowed()
	 * @see #getGenLink()
	 * @generated
	 */
	EAttribute getGenLink_IncomingCreationAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#isViewDirectionAlignedWithModel <em>View Direction Aligned With Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Direction Aligned With Model</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink#isViewDirectionAlignedWithModel()
	 * @see #getGenLink()
	 * @generated
	 */
	EAttribute getGenLink_ViewDirectionAlignedWithModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getCreationConstraints <em>Creation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Constraints</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink#getCreationConstraints()
	 * @see #getGenLink()
	 * @generated
	 */
	EReference getGenLink_CreationConstraints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenLabel <em>Gen Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Label</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLabel
	 * @generated
	 */
	EClass getGenLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenLabel#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLabel#isReadOnly()
	 * @see #getGenLabel()
	 * @generated
	 */
	EAttribute getGenLabel_ReadOnly();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenLabel#getModelFacet <em>Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLabel#getModelFacet()
	 * @see #getGenLabel()
	 * @generated
	 */
	EReference getGenLabel_ModelFacet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ExternalLabel <em>External Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Label</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ExternalLabel
	 * @generated
	 */
	EClass getExternalLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ExternalLabel#getTextEditPartClassName <em>Text Edit Part Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Edit Part Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ExternalLabel#getTextEditPartClassName()
	 * @see #getExternalLabel()
	 * @generated
	 */
	EAttribute getExternalLabel_TextEditPartClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ExternalLabel#getTextNotationViewFactoryClassName <em>Text Notation View Factory Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Notation View Factory Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ExternalLabel#getTextNotationViewFactoryClassName()
	 * @see #getExternalLabel()
	 * @generated
	 */
	EAttribute getExternalLabel_TextNotationViewFactoryClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenNodeLabel <em>Gen Node Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Node Label</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNodeLabel
	 * @generated
	 */
	EClass getGenNodeLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenNodeLabel#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNodeLabel#getNode()
	 * @see #getGenNodeLabel()
	 * @generated
	 */
	EReference getGenNodeLabel_Node();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel <em>Gen External Node Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen External Node Label</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel
	 * @generated
	 */
	EClass getGenExternalNodeLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkLabel <em>Gen Link Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Link Label</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLinkLabel
	 * @generated
	 */
	EClass getGenLinkLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkLabel#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Link</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLinkLabel#getLink()
	 * @see #getGenLinkLabel()
	 * @generated
	 */
	EReference getGenLinkLabel_Link();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkLabel#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLinkLabel#getAlignment()
	 * @see #getGenLinkLabel()
	 * @generated
	 */
	EAttribute getGenLinkLabel_Alignment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ModelFacet <em>Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ModelFacet
	 * @generated
	 */
	EClass getModelFacet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.LinkModelFacet <em>Link Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkModelFacet
	 * @generated
	 */
	EClass getLinkModelFacet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet <em>Type Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeModelFacet
	 * @generated
	 */
	EClass getTypeModelFacet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getMetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Class</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getMetaClass()
	 * @see #getTypeModelFacet()
	 * @generated
	 */
	EReference getTypeModelFacet_MetaClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getContainmentMetaFeature <em>Containment Meta Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containment Meta Feature</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getContainmentMetaFeature()
	 * @see #getTypeModelFacet()
	 * @generated
	 */
	EReference getTypeModelFacet_ContainmentMetaFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getChildMetaFeature <em>Child Meta Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child Meta Feature</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getChildMetaFeature()
	 * @see #getTypeModelFacet()
	 * @generated
	 */
	EReference getTypeModelFacet_ChildMetaFeature();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getModelElementSelector <em>Model Element Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Element Selector</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getModelElementSelector()
	 * @see #getTypeModelFacet()
	 * @generated
	 */
	EReference getTypeModelFacet_ModelElementSelector();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getModelElementInitializer <em>Model Element Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Element Initializer</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getModelElementInitializer()
	 * @see #getTypeModelFacet()
	 * @generated
	 */
	EReference getTypeModelFacet_ModelElementInitializer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet <em>Feature Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet
	 * @generated
	 */
	EClass getFeatureModelFacet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet#getMetaFeature <em>Meta Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Feature</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.FeatureModelFacet#getMetaFeature()
	 * @see #getFeatureModelFacet()
	 * @generated
	 */
	EReference getFeatureModelFacet_MetaFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet <em>Type Link Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Link Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet
	 * @generated
	 */
	EClass getTypeLinkModelFacet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet#getSourceMetaFeature <em>Source Meta Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Meta Feature</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet#getSourceMetaFeature()
	 * @see #getTypeLinkModelFacet()
	 * @generated
	 */
	EReference getTypeLinkModelFacet_SourceMetaFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet#getTargetMetaFeature <em>Target Meta Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Meta Feature</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet#getTargetMetaFeature()
	 * @see #getTypeLinkModelFacet()
	 * @generated
	 */
	EReference getTypeLinkModelFacet_TargetMetaFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.Viewmap <em>Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewmap</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Viewmap
	 * @generated
	 */
	EClass getViewmap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.Viewmap#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Viewmap#getAttributes()
	 * @see #getViewmap()
	 * @generated
	 */
	EReference getViewmap_Attributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Attributes
	 * @generated
	 */
	EClass getAttributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ColorAttributes <em>Color Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Attributes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ColorAttributes
	 * @generated
	 */
	EClass getColorAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ColorAttributes#getForegroundColor <em>Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ColorAttributes#getForegroundColor()
	 * @see #getColorAttributes()
	 * @generated
	 */
	EAttribute getColorAttributes_ForegroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ColorAttributes#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ColorAttributes#getBackgroundColor()
	 * @see #getColorAttributes()
	 * @generated
	 */
	EAttribute getColorAttributes_BackgroundColor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ShapeAttributes <em>Shape Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Attributes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ShapeAttributes
	 * @generated
	 */
	EClass getShapeAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ShapeAttributes#getLineWidth <em>Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ShapeAttributes#getLineWidth()
	 * @see #getShapeAttributes()
	 * @generated
	 */
	EAttribute getShapeAttributes_LineWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ShapeAttributes#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ShapeAttributes#getLineStyle()
	 * @see #getShapeAttributes()
	 * @generated
	 */
	EAttribute getShapeAttributes_LineStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes <em>Default Size Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Size Attributes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes
	 * @generated
	 */
	EClass getDefaultSizeAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes#getWidth()
	 * @see #getDefaultSizeAttributes()
	 * @generated
	 */
	EAttribute getDefaultSizeAttributes_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes#getHeight()
	 * @see #getDefaultSizeAttributes()
	 * @generated
	 */
	EAttribute getDefaultSizeAttributes_Height();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.FigureViewmap <em>Figure Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Viewmap</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.FigureViewmap
	 * @generated
	 */
	EClass getFigureViewmap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.FigureViewmap#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Figure Qualified Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.FigureViewmap#getFigureQualifiedClassName()
	 * @see #getFigureViewmap()
	 * @generated
	 */
	EAttribute getFigureViewmap_FigureQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.SnippetViewmap <em>Snippet Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snippet Viewmap</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.SnippetViewmap
	 * @generated
	 */
	EClass getSnippetViewmap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.SnippetViewmap#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.SnippetViewmap#getBody()
	 * @see #getSnippetViewmap()
	 * @generated
	 */
	EAttribute getSnippetViewmap_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap <em>Inner Class Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inner Class Viewmap</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap
	 * @generated
	 */
	EClass getInnerClassViewmap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap#getClassName()
	 * @see #getInnerClassViewmap()
	 * @generated
	 */
	EAttribute getInnerClassViewmap_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap#getClassBody <em>Class Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Body</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap#getClassBody()
	 * @see #getInnerClassViewmap()
	 * @generated
	 */
	EAttribute getInnerClassViewmap_ClassBody();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Expression</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ValueExpression
	 * @generated
	 */
	EClass getValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ValueExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ValueExpression#getBody()
	 * @see #getValueExpression()
	 * @generated
	 */
	EAttribute getValueExpression_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ValueExpression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ValueExpression#getLanguage()
	 * @see #getValueExpression()
	 * @generated
	 */
	EAttribute getValueExpression_Language();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ModelElementSelector <em>Model Element Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Selector</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ModelElementSelector
	 * @generated
	 */
	EClass getModelElementSelector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.Palette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Palette</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Palette
	 * @generated
	 */
	EClass getPalette();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.Palette#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Palette#getDiagram()
	 * @see #getPalette()
	 * @generated
	 */
	EReference getPalette_Diagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.Palette#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Palette#getGroups()
	 * @see #getPalette()
	 * @generated
	 */
	EReference getPalette_Groups();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.Palette#isFlyout <em>Flyout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flyout</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Palette#isFlyout()
	 * @see #getPalette()
	 * @generated
	 */
	EAttribute getPalette_Flyout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.Palette#isNeedZoomTools <em>Need Zoom Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Zoom Tools</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Palette#isNeedZoomTools()
	 * @see #getPalette()
	 * @generated
	 */
	EAttribute getPalette_NeedZoomTools();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.Palette#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Palette#getPackageName()
	 * @see #getPalette()
	 * @generated
	 */
	EAttribute getPalette_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.Palette#getFactoryClassName <em>Factory Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Palette#getFactoryClassName()
	 * @see #getPalette()
	 * @generated
	 */
	EAttribute getPalette_FactoryClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase <em>Entry Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Base</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EntryBase
	 * @generated
	 */
	EClass getEntryBase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EntryBase#getOrder()
	 * @see #getEntryBase()
	 * @generated
	 */
	EAttribute getEntryBase_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getTitleKey <em>Title Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Key</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EntryBase#getTitleKey()
	 * @see #getEntryBase()
	 * @generated
	 */
	EAttribute getEntryBase_TitleKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getDescriptionKey <em>Description Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description Key</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EntryBase#getDescriptionKey()
	 * @see #getEntryBase()
	 * @generated
	 */
	EAttribute getEntryBase_DescriptionKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getLargeIconPath <em>Large Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Icon Path</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EntryBase#getLargeIconPath()
	 * @see #getEntryBase()
	 * @generated
	 */
	EAttribute getEntryBase_LargeIconPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getSmallIconPath <em>Small Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Icon Path</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EntryBase#getSmallIconPath()
	 * @see #getEntryBase()
	 * @generated
	 */
	EAttribute getEntryBase_SmallIconPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getCreateMethodName <em>Create Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Method Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EntryBase#getCreateMethodName()
	 * @see #getEntryBase()
	 * @generated
	 */
	EAttribute getEntryBase_CreateMethodName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getEntryID <em>Entry ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EntryBase#getEntryID()
	 * @see #getEntryBase()
	 * @generated
	 */
	EAttribute getEntryBase_EntryID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry <em>Tool Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Entry</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolEntry
	 * @generated
	 */
	EClass getToolEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolEntry#isDefault()
	 * @see #getToolEntry()
	 * @generated
	 */
	EAttribute getToolEntry_Default();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.NodeEntry <em>Node Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Entry</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.NodeEntry
	 * @generated
	 */
	EClass getNodeEntry();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.NodeEntry#getGenNode <em>Gen Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.NodeEntry#getGenNode()
	 * @see #getNodeEntry()
	 * @generated
	 */
	EReference getNodeEntry_GenNode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.NodeEntry#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.NodeEntry#getGroup()
	 * @see #getNodeEntry()
	 * @generated
	 */
	EReference getNodeEntry_Group();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.LinkEntry <em>Link Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Entry</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkEntry
	 * @generated
	 */
	EClass getLinkEntry();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.LinkEntry#getGenLink <em>Gen Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Link</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkEntry#getGenLink()
	 * @see #getLinkEntry()
	 * @generated
	 */
	EReference getLinkEntry_GenLink();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.LinkEntry#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkEntry#getGroup()
	 * @see #getLinkEntry()
	 * @generated
	 */
	EReference getLinkEntry_Group();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup <em>Tool Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Group</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolGroup
	 * @generated
	 */
	EClass getToolGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#getNodeTools <em>Node Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Tools</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolGroup#getNodeTools()
	 * @see #getToolGroup()
	 * @generated
	 */
	EReference getToolGroup_NodeTools();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#getLinkTools <em>Link Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Tools</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolGroup#getLinkTools()
	 * @see #getToolGroup()
	 * @generated
	 */
	EReference getToolGroup_LinkTools();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#getPalette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Palette</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolGroup#getPalette()
	 * @see #getToolGroup()
	 * @generated
	 */
	EReference getToolGroup_Palette();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenElementInitializer <em>Gen Element Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Element Initializer</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenElementInitializer
	 * @generated
	 */
	EClass getGenElementInitializer();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenElementInitializer#getTypeModelFacet <em>Type Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenElementInitializer#getTypeModelFacet()
	 * @see #getGenElementInitializer()
	 * @generated
	 */
	EReference getGenElementInitializer_TypeModelFacet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer <em>Gen Feature Seq Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Feature Seq Initializer</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer
	 * @generated
	 */
	EClass getGenFeatureSeqInitializer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getInitializers <em>Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initializers</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getInitializers()
	 * @see #getGenFeatureSeqInitializer()
	 * @generated
	 */
	EReference getGenFeatureSeqInitializer_Initializers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec <em>Gen Feature Value Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Feature Value Spec</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec
	 * @generated
	 */
	EClass getGenFeatureValueSpec();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec#getFeature()
	 * @see #getGenFeatureValueSpec()
	 * @generated
	 */
	EReference getGenFeatureValueSpec_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints <em>Gen Link Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Link Constraints</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints
	 * @generated
	 */
	EClass getGenLinkConstraints();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Link</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getLink()
	 * @see #getGenLinkConstraints()
	 * @generated
	 */
	EReference getGenLinkConstraints_Link();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getSourceEnd <em>Source End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source End</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getSourceEnd()
	 * @see #getGenLinkConstraints()
	 * @generated
	 */
	EReference getGenLinkConstraints_SourceEnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getTargetEnd <em>Target End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target End</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints#getTargetEnd()
	 * @see #getGenLinkConstraints()
	 * @generated
	 */
	EReference getGenLinkConstraints_TargetEnd();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer <em>Gen Audit Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Audit Container</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditContainer
	 * @generated
	 */
	EClass getGenAuditContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getAudits <em>Audits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audits</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getAudits()
	 * @see #getGenAuditContainer()
	 * @generated
	 */
	EReference getGenAuditContainer_Audits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getChildContainers <em>Child Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Containers</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getChildContainers()
	 * @see #getGenAuditContainer()
	 * @generated
	 */
	EReference getGenAuditContainer_ChildContainers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getId()
	 * @see #getGenAuditContainer()
	 * @generated
	 */
	EAttribute getGenAuditContainer_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getName()
	 * @see #getGenAuditContainer()
	 * @generated
	 */
	EAttribute getGenAuditContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getDescription()
	 * @see #getGenAuditContainer()
	 * @generated
	 */
	EAttribute getGenAuditContainer_Description();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getParentContainer <em>Parent Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Container</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditContainer#getParentContainer()
	 * @see #getGenAuditContainer()
	 * @generated
	 */
	EReference getGenAuditContainer_ParentContainer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule <em>Gen Audit Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Audit Rule</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule
	 * @generated
	 */
	EClass getGenAuditRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getId()
	 * @see #getGenAuditRule()
	 * @generated
	 */
	EAttribute getGenAuditRule_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getRule()
	 * @see #getGenAuditRule()
	 * @generated
	 */
	EReference getGenAuditRule_Rule();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getTarget()
	 * @see #getGenAuditRule()
	 * @generated
	 */
	EReference getGenAuditRule_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getName()
	 * @see #getGenAuditRule()
	 * @generated
	 */
	EAttribute getGenAuditRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getMessage()
	 * @see #getGenAuditRule()
	 * @generated
	 */
	EAttribute getGenAuditRule_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getDescription()
	 * @see #getGenAuditRule()
	 * @generated
	 */
	EAttribute getGenAuditRule_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getSeverity()
	 * @see #getGenAuditRule()
	 * @generated
	 */
	EAttribute getGenAuditRule_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#isUseInLiveMode <em>Use In Live Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use In Live Mode</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#isUseInLiveMode()
	 * @see #getGenAuditRule()
	 * @generated
	 */
	EAttribute getGenAuditRule_UseInLiveMode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getContainer()
	 * @see #getGenAuditRule()
	 * @generated
	 */
	EReference getGenAuditRule_Container();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment <em>Link Label Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Label Alignment</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment
	 * @generated
	 */
	EEnum getLinkLabelAlignment();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.codegen.gmfgen.GenSeverity <em>Gen Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gen Severity</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenSeverity
	 * @generated
	 */
	EEnum getGenSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GMFGenFactory getGMFGenFactory();

} //GMFGenPackage