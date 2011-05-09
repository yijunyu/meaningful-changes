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
 *        annotation="http://www.eclipse.org/gmf/2005/constraints import='http://www.eclipse.org/gmf/runtime/1.0.0/notation'"
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
	String eNS_URI = "http://www.eclipse.org/gmf/2005/GenModel/2.0";

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
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl <em>Gen Editor Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenEditorGeneratorImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenEditorGenerator()
	 * @generated
	 */
	int GEN_EDITOR_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Audits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__AUDITS = 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__METRICS = 1;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__PLUGIN = 3;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__EDITOR = 4;

	/**
	 * The feature id for the '<em><b>Navigator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__NAVIGATOR = 5;

	/**
	 * The feature id for the '<em><b>Property Sheet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__PROPERTY_SHEET = 6;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__APPLICATION = 7;

	/**
	 * The feature id for the '<em><b>Domain Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__DOMAIN_GEN_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Package Name Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__PACKAGE_NAME_PREFIX = 9;

	/**
	 * The feature id for the '<em><b>Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__MODEL_ID = 10;

	/**
	 * The feature id for the '<em><b>Same File For Diagram And Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__SAME_FILE_FOR_DIAGRAM_AND_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Diagram File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__DIAGRAM_FILE_EXTENSION = 12;

	/**
	 * The feature id for the '<em><b>Domain File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__DOMAIN_FILE_EXTENSION = 13;

	/**
	 * The feature id for the '<em><b>Dynamic Templates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__DYNAMIC_TEMPLATES = 14;

	/**
	 * The feature id for the '<em><b>Template Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__TEMPLATE_DIRECTORY = 15;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__COPYRIGHT_TEXT = 16;

	/**
	 * The feature id for the '<em><b>Expression Providers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR__EXPRESSION_PROVIDERS = 17;

	/**
	 * The number of structural features of the '<em>Gen Editor Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_GENERATOR_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl <em>Gen Common Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenCommonBaseImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenCommonBase()
	 * @generated
	 */
	int GEN_COMMON_BASE = 12;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__ELEMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__EDIT_PART_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__VIEWMAP = 6;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__BEHAVIOUR = 7;

	/**
	 * The number of structural features of the '<em>Gen Common Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GenContainerBase <em>Gen Container Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GenContainerBase
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenContainerBase()
	 * @generated
	 */
	int GEN_CONTAINER_BASE = 17;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_BASE__ELEMENT_TYPE = GEN_COMMON_BASE__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_BASE__BEHAVIOUR = GEN_COMMON_BASE__BEHAVIOUR;

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
	int GEN_DIAGRAM = 1;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ELEMENT_TYPE = GEN_CONTAINER_BASE__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__BEHAVIOUR = GEN_CONTAINER_BASE__BEHAVIOUR;

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
	 * The feature id for the '<em><b>Edit Helpers Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_HELPERS_PACKAGE_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edit Parts Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Edit Policies Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_POLICIES_PACKAGE_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Notation View Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Notation View Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__NOTATION_VIEW_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Edit Part Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Edit Part Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PART_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Palette Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PALETTE_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Palette Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PALETTE_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Modeling Assistant Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Modeling Assistant Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Property Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PROPERTY_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Property Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PROPERTY_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Icon Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Icon Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ICON_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Parser Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PARSER_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Parser Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PARSER_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Abstract Parser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ABSTRACT_PARSER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Structural Feature Parser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__STRUCTURAL_FEATURE_PARSER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Structural Features Parser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__STRUCTURAL_FEATURES_PARSER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Contribution Item Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CONTRIBUTION_ITEM_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Reorient Connection View Command Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Base Edit Helper Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__BASE_EDIT_HELPER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Edit Part Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Base External Node Label Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Base Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Base Graphical Node Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Reference Connection Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CANONICAL_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Text Selection Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__TEXT_SELECTION_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Text Non Resizable Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__TEXT_NON_RESIZABLE_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>External Node Label Host Layout Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EXTERNAL_NODE_LABEL_HOST_LAYOUT_EDIT_POLICY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Creation Wizard Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CREATION_WIZARD_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Creation Wizard Page Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CREATION_WIZARD_PAGE_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Creation Wizard Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CREATION_WIZARD_ICON_PATH = GEN_CONTAINER_BASE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Creation Wizard Category ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CREATION_WIZARD_CATEGORY_ID = GEN_CONTAINER_BASE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Diagram Editor Util Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DIAGRAM_EDITOR_UTIL_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Diagram File Creator Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DIAGRAM_FILE_CREATOR_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Document Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Init Diagram File Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>New Diagram File Wizard Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__NEW_DIAGRAM_FILE_WIZARD_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Matching Strategy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Preference Initializer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PREFERENCE_INITIALIZER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Visual ID Registry Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VISUAL_ID_REGISTRY_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Element Chooser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ELEMENT_CHOOSER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Load Resource Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__LOAD_RESOURCE_ACTION_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Editing Domain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDITING_DOMAIN_ID = GEN_CONTAINER_BASE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Shortcuts Decorator Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__SHORTCUTS_DECORATOR_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Shortcuts Decorator Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__SHORTCUTS_DECORATOR_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Create Shortcut Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CREATE_SHORTCUT_ACTION_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Contains Shortcuts To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CONTAINS_SHORTCUTS_TO = GEN_CONTAINER_BASE_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Shortcuts Provided For</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__SHORTCUTS_PROVIDED_FOR = GEN_CONTAINER_BASE_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Validation Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VALIDATION_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Validation Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VALIDATION_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Marker Navigation Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Marker Navigation Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__MARKER_NAVIGATION_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Validation Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VALIDATION_ENABLED = GEN_CONTAINER_BASE_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>Metric Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__METRIC_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>Metric Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__METRIC_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>Validation Decorator Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VALIDATION_DECORATOR_PROVIDER_CLASS_NAME = GEN_CONTAINER_BASE_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>Validation Decorators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VALIDATION_DECORATORS = GEN_CONTAINER_BASE_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>Validation Decorator Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VALIDATION_DECORATOR_PROVIDER_PRIORITY = GEN_CONTAINER_BASE_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__UNITS = GEN_CONTAINER_BASE_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>Editor Gen</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDITOR_GEN = GEN_CONTAINER_BASE_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>Domain Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT = GEN_CONTAINER_BASE_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__CHILD_NODES = GEN_CONTAINER_BASE_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>Top Level Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__TOP_LEVEL_NODES = GEN_CONTAINER_BASE_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__LINKS = GEN_CONTAINER_BASE_FEATURE_COUNT + 71;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__COMPARTMENTS = GEN_CONTAINER_BASE_FEATURE_COUNT + 72;

	/**
	 * The feature id for the '<em><b>Palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PALETTE = GEN_CONTAINER_BASE_FEATURE_COUNT + 73;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__SYNCHRONIZED = GEN_CONTAINER_BASE_FEATURE_COUNT + 74;

	/**
	 * The number of structural features of the '<em>Gen Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM_FEATURE_COUNT = GEN_CONTAINER_BASE_FEATURE_COUNT + 75;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenEditorViewImpl <em>Gen Editor View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenEditorViewImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenEditorView()
	 * @generated
	 */
	int GEN_EDITOR_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Editor Gen</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_VIEW__EDITOR_GEN = 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_VIEW__PACKAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Action Bar Contributor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_VIEW__ACTION_BAR_CONTRIBUTOR_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_VIEW__CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_VIEW__ICON_PATH = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_VIEW__ID = 5;

	/**
	 * The number of structural features of the '<em>Gen Editor View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDITOR_VIEW_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation <em>Batch Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getBatchValidation()
	 * @generated
	 */
	int BATCH_VALIDATION = 3;

	/**
	 * The feature id for the '<em><b>Validation Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__VALIDATION_PROVIDER_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Validation Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__VALIDATION_PROVIDER_PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Marker Navigation Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__MARKER_NAVIGATION_PROVIDER_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Marker Navigation Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__MARKER_NAVIGATION_PROVIDER_PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Validation Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__VALIDATION_ENABLED = 4;

	/**
	 * The feature id for the '<em><b>Metric Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__METRIC_PROVIDER_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Metric Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__METRIC_PROVIDER_PRIORITY = 6;

	/**
	 * The feature id for the '<em><b>Validation Decorator Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__VALIDATION_DECORATOR_PROVIDER_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Validation Decorators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__VALIDATION_DECORATORS = 8;

	/**
	 * The feature id for the '<em><b>Validation Decorator Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION__VALIDATION_DECORATOR_PROVIDER_PRIORITY = 9;

	/**
	 * The number of structural features of the '<em>Batch Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_VALIDATION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames <em>Provider Class Names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getProviderClassNames()
	 * @generated
	 */
	int PROVIDER_CLASS_NAMES = 4;

	/**
	 * The feature id for the '<em><b>Element Types Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__ELEMENT_TYPES_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Notation View Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__NOTATION_VIEW_PROVIDER_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Notation View Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__NOTATION_VIEW_PROVIDER_PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Edit Part Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__EDIT_PART_PROVIDER_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Edit Part Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__EDIT_PART_PROVIDER_PRIORITY = 4;

	/**
	 * The feature id for the '<em><b>Palette Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__PALETTE_PROVIDER_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Palette Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__PALETTE_PROVIDER_PRIORITY = 6;

	/**
	 * The feature id for the '<em><b>Modeling Assistant Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__MODELING_ASSISTANT_PROVIDER_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Modeling Assistant Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__MODELING_ASSISTANT_PROVIDER_PRIORITY = 8;

	/**
	 * The feature id for the '<em><b>Property Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__PROPERTY_PROVIDER_CLASS_NAME = 9;

	/**
	 * The feature id for the '<em><b>Property Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__PROPERTY_PROVIDER_PRIORITY = 10;

	/**
	 * The feature id for the '<em><b>Icon Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__ICON_PROVIDER_CLASS_NAME = 11;

	/**
	 * The feature id for the '<em><b>Icon Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__ICON_PROVIDER_PRIORITY = 12;

	/**
	 * The feature id for the '<em><b>Parser Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__PARSER_PROVIDER_CLASS_NAME = 13;

	/**
	 * The feature id for the '<em><b>Parser Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__PARSER_PROVIDER_PRIORITY = 14;

	/**
	 * The feature id for the '<em><b>Abstract Parser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__ABSTRACT_PARSER_CLASS_NAME = 15;

	/**
	 * The feature id for the '<em><b>Structural Feature Parser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__STRUCTURAL_FEATURE_PARSER_CLASS_NAME = 16;

	/**
	 * The feature id for the '<em><b>Structural Features Parser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__STRUCTURAL_FEATURES_PARSER_CLASS_NAME = 17;

	/**
	 * The feature id for the '<em><b>Contribution Item Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES__CONTRIBUTION_ITEM_PROVIDER_CLASS_NAME = 18;

	/**
	 * The number of structural features of the '<em>Provider Class Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CLASS_NAMES_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts <em>Shortcuts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.Shortcuts
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getShortcuts()
	 * @generated
	 */
	int SHORTCUTS = 5;

	/**
	 * The feature id for the '<em><b>Shortcuts Decorator Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUTS__SHORTCUTS_DECORATOR_PROVIDER_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Shortcuts Decorator Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUTS__SHORTCUTS_DECORATOR_PROVIDER_PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Create Shortcut Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUTS__CREATE_SHORTCUT_ACTION_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Contains Shortcuts To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUTS__CONTAINS_SHORTCUTS_TO = 3;

	/**
	 * The feature id for the '<em><b>Shortcuts Provided For</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUTS__SHORTCUTS_PROVIDED_FOR = 4;

	/**
	 * The number of structural features of the '<em>Shortcuts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUTS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.PackageNames <em>Package Names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.PackageNames
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getPackageNames()
	 * @generated
	 */
	int PACKAGE_NAMES = 6;

	/**
	 * The feature id for the '<em><b>Edit Commands Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAMES__EDIT_COMMANDS_PACKAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Edit Helpers Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAMES__EDIT_HELPERS_PACKAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Edit Parts Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAMES__EDIT_PARTS_PACKAGE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Edit Policies Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAMES__EDIT_POLICIES_PACKAGE_NAME = 3;

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
	int LINK_CONSTRAINTS = 7;

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
	int EDITOR_CANDIES = 8;

	/**
	 * The feature id for the '<em><b>Creation Wizard Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__CREATION_WIZARD_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Creation Wizard Page Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__CREATION_WIZARD_PAGE_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Creation Wizard Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__CREATION_WIZARD_ICON_PATH = 2;

	/**
	 * The feature id for the '<em><b>Creation Wizard Category ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__CREATION_WIZARD_CATEGORY_ID = 3;

	/**
	 * The feature id for the '<em><b>Diagram Editor Util Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__DIAGRAM_EDITOR_UTIL_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Diagram File Creator Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__DIAGRAM_FILE_CREATOR_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Document Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__DOCUMENT_PROVIDER_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Init Diagram File Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>New Diagram File Wizard Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__NEW_DIAGRAM_FILE_WIZARD_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Matching Strategy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__MATCHING_STRATEGY_CLASS_NAME = 9;

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
	 * The feature id for the '<em><b>Load Resource Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__LOAD_RESOURCE_ACTION_CLASS_NAME = 13;

	/**
	 * The feature id for the '<em><b>Editing Domain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES__EDITING_DOMAIN_ID = 14;

	/**
	 * The number of structural features of the '<em>Editor Candies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_CANDIES_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies <em>Edit Part Candies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getEditPartCandies()
	 * @generated
	 */
	int EDIT_PART_CANDIES = 9;

	/**
	 * The feature id for the '<em><b>Reorient Connection View Command Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__REORIENT_CONNECTION_VIEW_COMMAND_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Edit Helper Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__BASE_EDIT_HELPER_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Edit Part Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__EDIT_PART_FACTORY_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Base External Node Label Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__BASE_EXTERNAL_NODE_LABEL_EDIT_PART_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Base Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__BASE_ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Base Graphical Node Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__BASE_GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Reference Connection Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__REFERENCE_CONNECTION_EDIT_POLICY_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__CANONICAL_EDIT_POLICY_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Text Selection Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__TEXT_SELECTION_EDIT_POLICY_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Text Non Resizable Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__TEXT_NON_RESIZABLE_EDIT_POLICY_CLASS_NAME = 9;

	/**
	 * The feature id for the '<em><b>External Node Label Host Layout Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES__EXTERNAL_NODE_LABEL_HOST_LAYOUT_EDIT_POLICY_CLASS_NAME = 10;

	/**
	 * The number of structural features of the '<em>Edit Part Candies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PART_CANDIES_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.MeasurementUnit <em>Measurement Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.MeasurementUnit
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getMeasurementUnit()
	 * @generated
	 */
	int MEASUREMENT_UNIT = 10;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__UNITS = 0;

	/**
	 * The number of structural features of the '<em>Measurement Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl <em>Gen Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenPluginImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenPlugin()
	 * @generated
	 */
	int GEN_PLUGIN = 11;

	/**
	 * The feature id for the '<em><b>Editor Gen</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PLUGIN__EDITOR_GEN = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PLUGIN__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PLUGIN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PLUGIN__PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PLUGIN__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Printing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PLUGIN__PRINTING_ENABLED = 5;

	/**
	 * The feature id for the '<em><b>Activator Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PLUGIN__ACTIVATOR_CLASS_NAME = 6;

	/**
	 * The number of structural features of the '<em>Gen Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PLUGIN_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.Behaviour <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.Behaviour
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 13;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__SUBJECT = 0;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.CustomBehaviourImpl <em>Custom Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.CustomBehaviourImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getCustomBehaviour()
	 * @generated
	 */
	int CUSTOM_BEHAVIOUR = 14;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOUR__SUBJECT = BEHAVIOUR__SUBJECT;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOUR__KEY = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Policy Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOUR__EDIT_POLICY_QUALIFIED_CLASS_NAME = BEHAVIOUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOUR_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.SharedBehaviourImpl <em>Shared Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.SharedBehaviourImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getSharedBehaviour()
	 * @generated
	 */
	int SHARED_BEHAVIOUR = 15;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_BEHAVIOUR__SUBJECT = BEHAVIOUR__SUBJECT;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_BEHAVIOUR__DELEGATE = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shared Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_BEHAVIOUR_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl <em>Open Diagram Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getOpenDiagramBehaviour()
	 * @generated
	 */
	int OPEN_DIAGRAM_BEHAVIOUR = 16;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DIAGRAM_BEHAVIOUR__SUBJECT = BEHAVIOUR__SUBJECT;

	/**
	 * The feature id for the '<em><b>Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DIAGRAM_BEHAVIOUR__EDIT_POLICY_CLASS_NAME = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open Diagram Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DIAGRAM_BEHAVIOUR_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ElementTypeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.MetamodelTypeImpl <em>Metamodel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.MetamodelTypeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getMetamodelType()
	 * @generated
	 */
	int METAMODEL_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.SpecializationTypeImpl <em>Specialization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.SpecializationTypeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getSpecializationType()
	 * @generated
	 */
	int SPECIALIZATION_TYPE = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl <em>Gen Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenNode()
	 * @generated
	 */
	int GEN_NODE = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl <em>Gen Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenCompartmentImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenCompartment()
	 * @generated
	 */
	int GEN_COMPARTMENT = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl <em>Gen Child Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenChildContainer()
	 * @generated
	 */
	int GEN_CHILD_CONTAINER = 18;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__ELEMENT_TYPE = GEN_CONTAINER_BASE__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__BEHAVIOUR = GEN_CONTAINER_BASE__BEHAVIOUR;

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
	 * The number of structural features of the '<em>Gen Child Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER_FEATURE_COUNT = GEN_CONTAINER_BASE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__ELEMENT_TYPE = GEN_CHILD_CONTAINER__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__BEHAVIOUR = GEN_CHILD_CONTAINER__BEHAVIOUR;

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
	int GEN_TOP_LEVEL_NODE = 20;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__ELEMENT_TYPE = GEN_NODE__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TOP_LEVEL_NODE__BEHAVIOUR = GEN_NODE__BEHAVIOUR;

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
	int GEN_CHILD_NODE = 21;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__ELEMENT_TYPE = GEN_NODE__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__BEHAVIOUR = GEN_NODE__BEHAVIOUR;

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
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildSideAffixedNodeImpl <em>Gen Child Side Affixed Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenChildSideAffixedNodeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenChildSideAffixedNode()
	 * @generated
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE = 22;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__DIAGRAM_RUN_TIME_CLASS = GEN_CHILD_NODE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__VISUAL_ID = GEN_CHILD_NODE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__ELEMENT_TYPE = GEN_CHILD_NODE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__EDIT_PART_CLASS_NAME = GEN_CHILD_NODE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_CHILD_NODE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_CHILD_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__VIEWMAP = GEN_CHILD_NODE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__BEHAVIOUR = GEN_CHILD_NODE__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__CONTAINED_NODES = GEN_CHILD_NODE__CONTAINED_NODES;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__CHILD_NODES = GEN_CHILD_NODE__CHILD_NODES;

	/**
	 * The feature id for the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__CANONICAL_EDIT_POLICY_CLASS_NAME = GEN_CHILD_NODE__CANONICAL_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__MODEL_FACET = GEN_CHILD_NODE__MODEL_FACET;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__LABELS = GEN_CHILD_NODE__LABELS;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__COMPARTMENTS = GEN_CHILD_NODE__COMPARTMENTS;

	/**
	 * The feature id for the '<em><b>Graphical Node Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME = GEN_CHILD_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__DIAGRAM = GEN_CHILD_NODE__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__CONTAINERS = GEN_CHILD_NODE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Preferred Side Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE__PREFERRED_SIDE_NAME = GEN_CHILD_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Child Side Affixed Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_SIDE_AFFIXED_NODE_FEATURE_COUNT = GEN_CHILD_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildLabelNodeImpl <em>Gen Child Label Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenChildLabelNodeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenChildLabelNode()
	 * @generated
	 */
	int GEN_CHILD_LABEL_NODE = 23;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__DIAGRAM_RUN_TIME_CLASS = GEN_CHILD_NODE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__VISUAL_ID = GEN_CHILD_NODE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__ELEMENT_TYPE = GEN_CHILD_NODE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__EDIT_PART_CLASS_NAME = GEN_CHILD_NODE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME = GEN_CHILD_NODE__ITEM_SEMANTIC_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_CHILD_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__VIEWMAP = GEN_CHILD_NODE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__BEHAVIOUR = GEN_CHILD_NODE__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__CONTAINED_NODES = GEN_CHILD_NODE__CONTAINED_NODES;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__CHILD_NODES = GEN_CHILD_NODE__CHILD_NODES;

	/**
	 * The feature id for the '<em><b>Canonical Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__CANONICAL_EDIT_POLICY_CLASS_NAME = GEN_CHILD_NODE__CANONICAL_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__MODEL_FACET = GEN_CHILD_NODE__MODEL_FACET;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__LABELS = GEN_CHILD_NODE__LABELS;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__COMPARTMENTS = GEN_CHILD_NODE__COMPARTMENTS;

	/**
	 * The feature id for the '<em><b>Graphical Node Edit Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME = GEN_CHILD_NODE__GRAPHICAL_NODE_EDIT_POLICY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__DIAGRAM = GEN_CHILD_NODE__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__CONTAINERS = GEN_CHILD_NODE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Label Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__LABEL_READ_ONLY = GEN_CHILD_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Element Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__LABEL_ELEMENT_ICON = GEN_CHILD_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE__LABEL_MODEL_FACET = GEN_CHILD_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Child Label Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_LABEL_NODE_FEATURE_COUNT = GEN_CHILD_NODE_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__ELEMENT_TYPE = GEN_CHILD_CONTAINER__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__BEHAVIOUR = GEN_CHILD_CONTAINER__BEHAVIOUR;

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
	 * The feature id for the '<em><b>List Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT__LIST_LAYOUT = GEN_CHILD_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Gen Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT_FEATURE_COUNT = GEN_CHILD_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl <em>Gen Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenLink()
	 * @generated
	 */
	int GEN_LINK = 25;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__ELEMENT_TYPE = GEN_COMMON_BASE__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK__BEHAVIOUR = GEN_COMMON_BASE__BEHAVIOUR;

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
	int GEN_LABEL = 26;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__ELEMENT_TYPE = GEN_COMMON_BASE__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__BEHAVIOUR = GEN_COMMON_BASE__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__READ_ONLY = GEN_COMMON_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__ELEMENT_ICON = GEN_COMMON_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__MODEL_FACET = GEN_COMMON_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL_FEATURE_COUNT = GEN_COMMON_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeLabelImpl <em>Gen Node Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenNodeLabelImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenNodeLabel()
	 * @generated
	 */
	int GEN_NODE_LABEL = 27;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__ELEMENT_TYPE = GEN_LABEL__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__BEHAVIOUR = GEN_LABEL__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__READ_ONLY = GEN_LABEL__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Element Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL__ELEMENT_ICON = GEN_LABEL__ELEMENT_ICON;

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
	int GEN_EXTERNAL_NODE_LABEL = 28;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__ELEMENT_TYPE = GEN_NODE_LABEL__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__BEHAVIOUR = GEN_NODE_LABEL__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__READ_ONLY = GEN_NODE_LABEL__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Element Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL__ELEMENT_ICON = GEN_NODE_LABEL__ELEMENT_ICON;

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
	 * The number of structural features of the '<em>Gen External Node Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXTERNAL_NODE_LABEL_FEATURE_COUNT = GEN_NODE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkLabelImpl <em>Gen Link Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenLinkLabelImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenLinkLabel()
	 * @generated
	 */
	int GEN_LINK_LABEL = 29;

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
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__ELEMENT_TYPE = GEN_LABEL__ELEMENT_TYPE;

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
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__BEHAVIOUR = GEN_LABEL__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__READ_ONLY = GEN_LABEL__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Element Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__ELEMENT_ICON = GEN_LABEL__ELEMENT_ICON;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__MODEL_FACET = GEN_LABEL__MODEL_FACET;

	/**
	 * The feature id for the '<em><b>Link</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__LINK = GEN_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL__ALIGNMENT = GEN_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Link Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL_FEATURE_COUNT = GEN_LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diagram Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__DIAGRAM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__UNIQUE_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__DISPLAY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Defined Externally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__DEFINED_EXTERNALLY = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.ModelFacet <em>Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.ModelFacet
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getModelFacet()
	 * @generated
	 */
	int MODEL_FACET = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.LinkModelFacet <em>Link Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkModelFacet
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getLinkModelFacet()
	 * @generated
	 */
	int LINK_MODEL_FACET = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.LabelModelFacet <em>Label Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelModelFacet
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getLabelModelFacet()
	 * @generated
	 */
	int LABEL_MODEL_FACET = 36;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Diagram Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_TYPE__DIAGRAM_ELEMENT = ELEMENT_TYPE__DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_TYPE__UNIQUE_IDENTIFIER = ELEMENT_TYPE__UNIQUE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_TYPE__DISPLAY_NAME = ELEMENT_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Defined Externally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_TYPE__DEFINED_EXTERNALLY = ELEMENT_TYPE__DEFINED_EXTERNALLY;

	/**
	 * The feature id for the '<em><b>Edit Helper Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_TYPE__EDIT_HELPER_CLASS_NAME = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metamodel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagram Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_TYPE__DIAGRAM_ELEMENT = ELEMENT_TYPE__DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_TYPE__UNIQUE_IDENTIFIER = ELEMENT_TYPE__UNIQUE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_TYPE__DISPLAY_NAME = ELEMENT_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Defined Externally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_TYPE__DEFINED_EXTERNALLY = ELEMENT_TYPE__DEFINED_EXTERNALLY;

	/**
	 * The feature id for the '<em><b>Metamodel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_TYPE__METAMODEL_TYPE = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Helper Advice Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_TYPE__EDIT_HELPER_ADVICE_CLASS_NAME = ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specialization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.NotationTypeImpl <em>Notation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.NotationTypeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getNotationType()
	 * @generated
	 */
	int NOTATION_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Diagram Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE__DIAGRAM_ELEMENT = ELEMENT_TYPE__DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE__UNIQUE_IDENTIFIER = ELEMENT_TYPE__UNIQUE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE__DISPLAY_NAME = ELEMENT_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Defined Externally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE__DEFINED_EXTERNALLY = ELEMENT_TYPE__DEFINED_EXTERNALLY;

	/**
	 * The number of structural features of the '<em>Notation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACET_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Link Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MODEL_FACET_FEATURE_COUNT = MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MODEL_FACET_FEATURE_COUNT = MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeModelFacetImpl <em>Type Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.TypeModelFacetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getTypeModelFacet()
	 * @generated
	 */
	int TYPE_MODEL_FACET = 37;

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
	int FEATURE_MODEL_FACET = 38;

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
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLabelModelFacetImpl <em>Feature Label Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.FeatureLabelModelFacetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getFeatureLabelModelFacet()
	 * @generated
	 */
	int FEATURE_LABEL_MODEL_FACET = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.CompositeFeatureModelFacetImpl <em>Composite Feature Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.CompositeFeatureModelFacetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getCompositeFeatureModelFacet()
	 * @generated
	 */
	int COMPOSITE_FEATURE_MODEL_FACET = 39;

	/**
	 * The feature id for the '<em><b>Meta Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_MODEL_FACET__META_FEATURES = MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Feature Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_MODEL_FACET_FEATURE_COUNT = MODEL_FACET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.CompositeFeatureLabelModelFacetImpl <em>Composite Feature Label Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.CompositeFeatureLabelModelFacetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getCompositeFeatureLabelModelFacet()
	 * @generated
	 */
	int COMPOSITE_FEATURE_LABEL_MODEL_FACET = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeLinkModelFacetImpl <em>Type Link Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.TypeLinkModelFacetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getTypeLinkModelFacet()
	 * @generated
	 */
	int TYPE_LINK_MODEL_FACET = 40;

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
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLinkModelFacetImpl <em>Feature Link Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.FeatureLinkModelFacetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getFeatureLinkModelFacet()
	 * @generated
	 */
	int FEATURE_LINK_MODEL_FACET = 41;

	/**
	 * The feature id for the '<em><b>Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK_MODEL_FACET__META_FEATURE = FEATURE_MODEL_FACET__META_FEATURE;

	/**
	 * The number of structural features of the '<em>Feature Link Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK_MODEL_FACET_FEATURE_COUNT = FEATURE_MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MODEL_FACET__META_FEATURE = FEATURE_MODEL_FACET__META_FEATURE;

	/**
	 * The feature id for the '<em><b>View Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN = FEATURE_MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN = FEATURE_MODEL_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Label Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MODEL_FACET_FEATURE_COUNT = FEATURE_MODEL_FACET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Meta Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_LABEL_MODEL_FACET__META_FEATURES = COMPOSITE_FEATURE_MODEL_FACET__META_FEATURES;

	/**
	 * The feature id for the '<em><b>View Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_LABEL_MODEL_FACET__VIEW_PATTERN = COMPOSITE_FEATURE_MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_LABEL_MODEL_FACET__EDIT_PATTERN = COMPOSITE_FEATURE_MODEL_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Feature Label Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_LABEL_MODEL_FACET_FEATURE_COUNT = COMPOSITE_FEATURE_MODEL_FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.DesignLabelModelFacetImpl <em>Design Label Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.DesignLabelModelFacetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getDesignLabelModelFacet()
	 * @generated
	 */
	int DESIGN_LABEL_MODEL_FACET = 44;

	/**
	 * The number of structural features of the '<em>Design Label Model Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LABEL_MODEL_FACET_FEATURE_COUNT = LABEL_MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl <em>Viewmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getViewmap()
	 * @generated
	 */
	int VIEWMAP = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.Attributes <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.Attributes
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 45;

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
	int COLOR_ATTRIBUTES = 46;

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
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.StyleAttributesImpl <em>Style Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.StyleAttributesImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getStyleAttributes()
	 * @generated
	 */
	int STYLE_ATTRIBUTES = 47;

	/**
	 * The feature id for the '<em><b>Fixed Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ATTRIBUTES__FIXED_FONT = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ATTRIBUTES__FIXED_FOREGROUND = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fixed Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ATTRIBUTES__FIXED_BACKGROUND = ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Style Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ATTRIBUTES_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ResizeConstraintsImpl <em>Resize Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ResizeConstraintsImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getResizeConstraints()
	 * @generated
	 */
	int RESIZE_CONSTRAINTS = 48;

	/**
	 * The feature id for the '<em><b>Resize Handles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_CONSTRAINTS__RESIZE_HANDLES = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Non Resize Handles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_CONSTRAINTS__NON_RESIZE_HANDLES = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resize Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIZE_CONSTRAINTS_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.DefaultSizeAttributesImpl <em>Default Size Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.DefaultSizeAttributesImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getDefaultSizeAttributes()
	 * @generated
	 */
	int DEFAULT_SIZE_ATTRIBUTES = 49;

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
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.LabelOffsetAttributesImpl <em>Label Offset Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.LabelOffsetAttributesImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getLabelOffsetAttributes()
	 * @generated
	 */
	int LABEL_OFFSET_ATTRIBUTES = 50;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OFFSET_ATTRIBUTES__X = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OFFSET_ATTRIBUTES__Y = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Offset Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OFFSET_ATTRIBUTES_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWMAP__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Required Plugin IDs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWMAP__REQUIRED_PLUGIN_IDS = 1;

	/**
	 * The feature id for the '<em><b>Layout Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWMAP__LAYOUT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Viewmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWMAP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.FigureViewmapImpl <em>Figure Viewmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.FigureViewmapImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getFigureViewmap()
	 * @generated
	 */
	int FIGURE_VIEWMAP = 52;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_VIEWMAP__ATTRIBUTES = VIEWMAP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Required Plugin IDs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_VIEWMAP__REQUIRED_PLUGIN_IDS = VIEWMAP__REQUIRED_PLUGIN_IDS;

	/**
	 * The feature id for the '<em><b>Layout Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_VIEWMAP__LAYOUT_TYPE = VIEWMAP__LAYOUT_TYPE;

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
	int SNIPPET_VIEWMAP = 53;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_VIEWMAP__ATTRIBUTES = VIEWMAP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Required Plugin IDs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_VIEWMAP__REQUIRED_PLUGIN_IDS = VIEWMAP__REQUIRED_PLUGIN_IDS;

	/**
	 * The feature id for the '<em><b>Layout Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_VIEWMAP__LAYOUT_TYPE = VIEWMAP__LAYOUT_TYPE;

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
	int INNER_CLASS_VIEWMAP = 54;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_CLASS_VIEWMAP__ATTRIBUTES = VIEWMAP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Required Plugin IDs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_CLASS_VIEWMAP__REQUIRED_PLUGIN_IDS = VIEWMAP__REQUIRED_PLUGIN_IDS;

	/**
	 * The feature id for the '<em><b>Layout Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_CLASS_VIEWMAP__LAYOUT_TYPE = VIEWMAP__LAYOUT_TYPE;

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
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ParentAssignedViewmapImpl <em>Parent Assigned Viewmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ParentAssignedViewmapImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getParentAssignedViewmap()
	 * @generated
	 */
	int PARENT_ASSIGNED_VIEWMAP = 55;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_ASSIGNED_VIEWMAP__ATTRIBUTES = VIEWMAP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Required Plugin IDs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_ASSIGNED_VIEWMAP__REQUIRED_PLUGIN_IDS = VIEWMAP__REQUIRED_PLUGIN_IDS;

	/**
	 * The feature id for the '<em><b>Layout Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_ASSIGNED_VIEWMAP__LAYOUT_TYPE = VIEWMAP__LAYOUT_TYPE;

	/**
	 * The feature id for the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_ASSIGNED_VIEWMAP__GETTER_NAME = VIEWMAP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Setter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_ASSIGNED_VIEWMAP__SETTER_NAME = VIEWMAP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Figure Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_ASSIGNED_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME = VIEWMAP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parent Assigned Viewmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_ASSIGNED_VIEWMAP_FEATURE_COUNT = VIEWMAP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl <em>Palette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getPalette()
	 * @generated
	 */
	int PALETTE = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl <em>Entry Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getEntryBase()
	 * @generated
	 */
	int ENTRY_BASE = 59;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl <em>Tool Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getToolEntry()
	 * @generated
	 */
	int TOOL_ENTRY = 60;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl <em>Tool Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getToolGroup()
	 * @generated
	 */
	int TOOL_GROUP = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ValueExpressionImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 56;

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
	 * The feature id for the '<em><b>Lang Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION__LANG_NAME = 2;

	/**
	 * The number of structural features of the '<em>Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenConstraintImpl <em>Gen Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenConstraintImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenConstraint()
	 * @generated
	 */
	int GEN_CONSTRAINT = 57;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONSTRAINT__BODY = VALUE_EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONSTRAINT__LANGUAGE = VALUE_EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Lang Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONSTRAINT__LANG_NAME = VALUE_EXPRESSION__LANG_NAME;

	/**
	 * The number of structural features of the '<em>Gen Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONSTRAINT_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Flyout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__FLYOUT = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__PACKAGE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__FACTORY_CLASS_NAME = 4;

	/**
	 * The number of structural features of the '<em>Palette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Large Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__LARGE_ICON_PATH = 2;

	/**
	 * The feature id for the '<em><b>Small Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__SMALL_ICON_PATH = 3;

	/**
	 * The feature id for the '<em><b>Create Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE__CREATE_METHOD_NAME = 4;

	/**
	 * The number of structural features of the '<em>Entry Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__TITLE = ENTRY_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__DESCRIPTION = ENTRY_BASE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__DEFAULT = ENTRY_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__GEN_NODES = ENTRY_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__GEN_LINKS = ENTRY_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__ELEMENTS = ENTRY_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Qualified Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__QUALIFIED_TOOL_NAME = ENTRY_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__PROPERTIES = ENTRY_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tool Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY_FEATURE_COUNT = ENTRY_BASE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroupItem <em>Tool Group Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolGroupItem
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getToolGroupItem()
	 * @generated
	 */
	int TOOL_GROUP_ITEM = 61;

	/**
	 * The number of structural features of the '<em>Tool Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP_ITEM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.SeparatorImpl <em>Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.SeparatorImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getSeparator()
	 * @generated
	 */
	int SEPARATOR = 62;

	/**
	 * The number of structural features of the '<em>Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR_FEATURE_COUNT = TOOL_GROUP_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__TITLE = ENTRY_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__DESCRIPTION = ENTRY_BASE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__STACK = ENTRY_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collapse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__COLLAPSE = ENTRY_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__ENTRIES = ENTRY_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tools Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__TOOLS_ONLY = ENTRY_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tool Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP_FEATURE_COUNT = ENTRY_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GenElementInitializer <em>Gen Element Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GenElementInitializer
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenElementInitializer()
	 * @generated
	 */
	int GEN_ELEMENT_INITIALIZER = 64;

	/**
	 * The feature id for the '<em><b>Type Model Facet</b></em>' reference.
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
	int GEN_FEATURE_SEQ_INITIALIZER = 65;

	/**
	 * The feature id for the '<em><b>Type Model Facet</b></em>' reference.
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
	 * The feature id for the '<em><b>Element Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS = GEN_ELEMENT_INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creating Initializer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER = GEN_ELEMENT_INITIALIZER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Feature Seq Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_SEQ_INITIALIZER_FEATURE_COUNT = GEN_ELEMENT_INITIALIZER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureValueSpecImpl <em>Gen Feature Value Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenFeatureValueSpecImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenFeatureValueSpec()
	 * @generated
	 */
	int GEN_FEATURE_VALUE_SPEC = 66;

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
	 * The feature id for the '<em><b>Lang Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_VALUE_SPEC__LANG_NAME = VALUE_EXPRESSION__LANG_NAME;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_VALUE_SPEC__FEATURE = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Seq Initializer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_VALUE_SPEC__FEATURE_SEQ_INITIALIZER = VALUE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Feature Value Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_VALUE_SPEC_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer <em>Gen Feature Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenFeatureInitializer()
	 * @generated
	 */
	int GEN_FEATURE_INITIALIZER = 68;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_INITIALIZER__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Feature Seq Initializer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_INITIALIZER__FEATURE_SEQ_INITIALIZER = 1;

	/**
	 * The number of structural features of the '<em>Gen Feature Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_INITIALIZER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenReferenceNewElementSpecImpl <em>Gen Reference New Element Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenReferenceNewElementSpecImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenReferenceNewElementSpec()
	 * @generated
	 */
	int GEN_REFERENCE_NEW_ELEMENT_SPEC = 67;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE_NEW_ELEMENT_SPEC__FEATURE = GEN_FEATURE_INITIALIZER__FEATURE;

	/**
	 * The feature id for the '<em><b>Feature Seq Initializer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE_NEW_ELEMENT_SPEC__FEATURE_SEQ_INITIALIZER = GEN_FEATURE_INITIALIZER__FEATURE_SEQ_INITIALIZER;

	/**
	 * The feature id for the '<em><b>New Element Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS = GEN_FEATURE_INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Reference New Element Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REFERENCE_NEW_ELEMENT_SPEC_FEATURE_COUNT = GEN_FEATURE_INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkConstraintsImpl <em>Gen Link Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenLinkConstraintsImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenLinkConstraints()
	 * @generated
	 */
	int GEN_LINK_CONSTRAINTS = 69;

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
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenRuleContainerBaseImpl <em>Gen Rule Container Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenRuleContainerBaseImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenRuleContainerBase()
	 * @generated
	 */
	int GEN_RULE_CONTAINER_BASE = 70;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_RULE_CONTAINER_BASE__EDITOR = 0;

	/**
	 * The number of structural features of the '<em>Gen Rule Container Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_RULE_CONTAINER_BASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl <em>Gen Audit Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenAuditContainerImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenAuditContainer()
	 * @generated
	 */
	int GEN_AUDIT_CONTAINER = 71;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__EDITOR = GEN_RULE_CONTAINER_BASE__EDITOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__ID = GEN_RULE_CONTAINER_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__NAME = GEN_RULE_CONTAINER_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__DESCRIPTION = GEN_RULE_CONTAINER_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__PARENT_CONTAINER = GEN_RULE_CONTAINER_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Audits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__AUDITS = GEN_RULE_CONTAINER_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Child Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER__CHILD_CONTAINERS = GEN_RULE_CONTAINER_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gen Audit Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_CONTAINER_FEATURE_COUNT = GEN_RULE_CONTAINER_BASE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenRuleBaseImpl <em>Gen Rule Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenRuleBaseImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenRuleBase()
	 * @generated
	 */
	int GEN_RULE_BASE = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_RULE_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_RULE_BASE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Gen Rule Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_RULE_BASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl <em>Gen Audit Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenAuditRuleImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenAuditRule()
	 * @generated
	 */
	int GEN_AUDIT_RULE = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__NAME = GEN_RULE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__DESCRIPTION = GEN_RULE_BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__ID = GEN_RULE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__RULE = GEN_RULE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__TARGET = GEN_RULE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__MESSAGE = GEN_RULE_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__SEVERITY = GEN_RULE_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Use In Live Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__USE_IN_LIVE_MODE = GEN_RULE_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE__CONTAINER = GEN_RULE_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Gen Audit Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDIT_RULE_FEATURE_COUNT = GEN_RULE_BASE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GenRuleTarget <em>Gen Rule Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GenRuleTarget
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenRuleTarget()
	 * @generated
	 */
	int GEN_RULE_TARGET = 74;

	/**
	 * The number of structural features of the '<em>Gen Rule Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_RULE_TARGET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditableImpl <em>Gen Auditable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenAuditableImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenAuditable()
	 * @generated
	 */
	int GEN_AUDITABLE = 82;

	/**
	 * The number of structural features of the '<em>Gen Auditable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDITABLE_FEATURE_COUNT = GEN_RULE_TARGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDomainElementTargetImpl <em>Gen Domain Element Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenDomainElementTargetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenDomainElementTarget()
	 * @generated
	 */
	int GEN_DOMAIN_ELEMENT_TARGET = 75;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DOMAIN_ELEMENT_TARGET__ELEMENT = GEN_AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Domain Element Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DOMAIN_ELEMENT_TARGET_FEATURE_COUNT = GEN_AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramElementTargetImpl <em>Gen Diagram Element Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramElementTargetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenDiagramElementTarget()
	 * @generated
	 */
	int GEN_DIAGRAM_ELEMENT_TARGET = 76;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM_ELEMENT_TARGET__ELEMENT = GEN_AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Diagram Element Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM_ELEMENT_TARGET_FEATURE_COUNT = GEN_AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDomainAttributeTargetImpl <em>Gen Domain Attribute Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenDomainAttributeTargetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenDomainAttributeTarget()
	 * @generated
	 */
	int GEN_DOMAIN_ATTRIBUTE_TARGET = 77;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE = GEN_AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Null As Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR = GEN_AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Domain Attribute Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DOMAIN_ATTRIBUTE_TARGET_FEATURE_COUNT = GEN_AUDITABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNotationElementTargetImpl <em>Gen Notation Element Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenNotationElementTargetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenNotationElementTarget()
	 * @generated
	 */
	int GEN_NOTATION_ELEMENT_TARGET = 78;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NOTATION_ELEMENT_TARGET__ELEMENT = GEN_AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Notation Element Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NOTATION_ELEMENT_TARGET_FEATURE_COUNT = GEN_AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenMetricContainerImpl <em>Gen Metric Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenMetricContainerImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenMetricContainer()
	 * @generated
	 */
	int GEN_METRIC_CONTAINER = 79;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_CONTAINER__EDITOR = GEN_RULE_CONTAINER_BASE__EDITOR;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_CONTAINER__METRICS = GEN_RULE_CONTAINER_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Metric Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_CONTAINER_FEATURE_COUNT = GEN_RULE_CONTAINER_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenMetricRuleImpl <em>Gen Metric Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenMetricRuleImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenMetricRule()
	 * @generated
	 */
	int GEN_METRIC_RULE = 80;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_RULE__NAME = GEN_RULE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_RULE__DESCRIPTION = GEN_RULE_BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_RULE__KEY = GEN_RULE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_RULE__RULE = GEN_RULE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_RULE__TARGET = GEN_RULE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_RULE__LOW_LIMIT = GEN_RULE_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>High Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_RULE__HIGH_LIMIT = GEN_RULE_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_RULE__CONTAINER = GEN_RULE_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gen Metric Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_METRIC_RULE_FEATURE_COUNT = GEN_RULE_BASE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenAuditedMetricTargetImpl <em>Gen Audited Metric Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenAuditedMetricTargetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenAuditedMetricTarget()
	 * @generated
	 */
	int GEN_AUDITED_METRIC_TARGET = 81;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDITED_METRIC_TARGET__METRIC = GEN_AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric Value Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDITED_METRIC_TARGET__METRIC_VALUE_CONTEXT = GEN_AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Audited Metric Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUDITED_METRIC_TARGET_FEATURE_COUNT = GEN_AUDITABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GenMeasurable <em>Gen Measurable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMeasurable
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenMeasurable()
	 * @generated
	 */
	int GEN_MEASURABLE = 83;

	/**
	 * The number of structural features of the '<em>Gen Measurable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MEASURABLE_FEATURE_COUNT = GEN_RULE_TARGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderContainerImpl <em>Gen Expression Provider Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderContainerImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenExpressionProviderContainer()
	 * @generated
	 */
	int GEN_EXPRESSION_PROVIDER_CONTAINER = 84;

	/**
	 * The feature id for the '<em><b>Expressions Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_PROVIDER_CONTAINER__EXPRESSIONS_PACKAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Abstract Expression Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_PROVIDER_CONTAINER__ABSTRACT_EXPRESSION_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_PROVIDER_CONTAINER__PROVIDERS = 2;

	/**
	 * The feature id for the '<em><b>Editor Gen</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_PROVIDER_CONTAINER__EDITOR_GEN = 3;

	/**
	 * The number of structural features of the '<em>Gen Expression Provider Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_PROVIDER_CONTAINER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderBaseImpl <em>Gen Expression Provider Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionProviderBaseImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenExpressionProviderBase()
	 * @generated
	 */
	int GEN_EXPRESSION_PROVIDER_BASE = 85;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_PROVIDER_BASE__EXPRESSIONS = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_PROVIDER_BASE__CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Gen Expression Provider Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_PROVIDER_BASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenJavaExpressionProviderImpl <em>Gen Java Expression Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenJavaExpressionProviderImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenJavaExpressionProvider()
	 * @generated
	 */
	int GEN_JAVA_EXPRESSION_PROVIDER = 86;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JAVA_EXPRESSION_PROVIDER__EXPRESSIONS = GEN_EXPRESSION_PROVIDER_BASE__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JAVA_EXPRESSION_PROVIDER__CONTAINER = GEN_EXPRESSION_PROVIDER_BASE__CONTAINER;

	/**
	 * The number of structural features of the '<em>Gen Java Expression Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JAVA_EXPRESSION_PROVIDER_FEATURE_COUNT = GEN_EXPRESSION_PROVIDER_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionInterpreterImpl <em>Gen Expression Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenExpressionInterpreterImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenExpressionInterpreter()
	 * @generated
	 */
	int GEN_EXPRESSION_INTERPRETER = 87;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_INTERPRETER__EXPRESSIONS = GEN_EXPRESSION_PROVIDER_BASE__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_INTERPRETER__CONTAINER = GEN_EXPRESSION_PROVIDER_BASE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_INTERPRETER__LANGUAGE = GEN_EXPRESSION_PROVIDER_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_INTERPRETER__CLASS_NAME = GEN_EXPRESSION_PROVIDER_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Plugin IDs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_INTERPRETER__REQUIRED_PLUGIN_IDS = GEN_EXPRESSION_PROVIDER_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Expression Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_INTERPRETER_FEATURE_COUNT = GEN_EXPRESSION_PROVIDER_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl <em>Gen Navigator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenNavigator()
	 * @generated
	 */
	int GEN_NAVIGATOR = 88;

	/**
	 * The feature id for the '<em><b>Editor Gen</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR__EDITOR_GEN = 0;

	/**
	 * The feature id for the '<em><b>Content Extension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR__CONTENT_EXTENSION_ID = 1;

	/**
	 * The feature id for the '<em><b>Content Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR__CONTENT_EXTENSION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Content Extension Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR__CONTENT_EXTENSION_PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Content Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR__CONTENT_PROVIDER_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Label Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR__LABEL_PROVIDER_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Abstract Navigator Item Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR__ABSTRACT_NAVIGATOR_ITEM_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Navigator Group Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR__NAVIGATOR_GROUP_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Navigator Item Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR__NAVIGATOR_ITEM_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR__PACKAGE_NAME = 9;

	/**
	 * The feature id for the '<em><b>Child References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR__CHILD_REFERENCES = 10;

	/**
	 * The number of structural features of the '<em>Gen Navigator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl <em>Gen Navigator Child Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenNavigatorChildReference()
	 * @generated
	 */
	int GEN_NAVIGATOR_CHILD_REFERENCE = 89;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR_CHILD_REFERENCE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR_CHILD_REFERENCE__CHILD = 1;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR_CHILD_REFERENCE__REFERENCE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_NAME = 3;

	/**
	 * The feature id for the '<em><b>Group Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR_CHILD_REFERENCE__GROUP_ICON = 4;

	/**
	 * The feature id for the '<em><b>Hide If Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR_CHILD_REFERENCE__HIDE_IF_EMPTY = 5;

	/**
	 * The number of structural features of the '<em>Gen Navigator Child Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NAVIGATOR_CHILD_REFERENCE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl <em>Gen Property Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenPropertySheetImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenPropertySheet()
	 * @generated
	 */
	int GEN_PROPERTY_SHEET = 90;

	/**
	 * The feature id for the '<em><b>Editor Gen</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_SHEET__EDITOR_GEN = 0;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_SHEET__TABS = 1;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_SHEET__PACKAGE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_SHEET__READ_ONLY = 3;

	/**
	 * The feature id for the '<em><b>Needs Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_SHEET__NEEDS_CAPTION = 4;

	/**
	 * The feature id for the '<em><b>Label Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_SHEET__LABEL_PROVIDER_CLASS_NAME = 5;

	/**
	 * The number of structural features of the '<em>Gen Property Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_SHEET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenPropertyTabImpl <em>Gen Property Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenPropertyTabImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenPropertyTab()
	 * @generated
	 */
	int GEN_PROPERTY_TAB = 91;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_TAB__SHEET = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_TAB__ID = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_TAB__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Gen Property Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_TAB_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenStandardPropertyTabImpl <em>Gen Standard Property Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenStandardPropertyTabImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenStandardPropertyTab()
	 * @generated
	 */
	int GEN_STANDARD_PROPERTY_TAB = 92;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STANDARD_PROPERTY_TAB__SHEET = GEN_PROPERTY_TAB__SHEET;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STANDARD_PROPERTY_TAB__ID = GEN_PROPERTY_TAB__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STANDARD_PROPERTY_TAB__LABEL = GEN_PROPERTY_TAB__LABEL;

	/**
	 * The number of structural features of the '<em>Gen Standard Property Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STANDARD_PROPERTY_TAB_FEATURE_COUNT = GEN_PROPERTY_TAB_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenCustomPropertyTabImpl <em>Gen Custom Property Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenCustomPropertyTabImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenCustomPropertyTab()
	 * @generated
	 */
	int GEN_CUSTOM_PROPERTY_TAB = 93;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CUSTOM_PROPERTY_TAB__SHEET = GEN_PROPERTY_TAB__SHEET;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CUSTOM_PROPERTY_TAB__ID = GEN_PROPERTY_TAB__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CUSTOM_PROPERTY_TAB__LABEL = GEN_PROPERTY_TAB__LABEL;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CUSTOM_PROPERTY_TAB__CLASS_NAME = GEN_PROPERTY_TAB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CUSTOM_PROPERTY_TAB__FILTER = GEN_PROPERTY_TAB_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Custom Property Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CUSTOM_PROPERTY_TAB_FEATURE_COUNT = GEN_PROPERTY_TAB_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertyTabFilter <em>Gen Property Tab Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertyTabFilter
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenPropertyTabFilter()
	 * @generated
	 */
	int GEN_PROPERTY_TAB_FILTER = 94;

	/**
	 * The feature id for the '<em><b>Tab</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_TAB_FILTER__TAB = 0;

	/**
	 * The number of structural features of the '<em>Gen Property Tab Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PROPERTY_TAB_FILTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeTabFilterImpl <em>Type Tab Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.TypeTabFilterImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getTypeTabFilter()
	 * @generated
	 */
	int TYPE_TAB_FILTER = 95;

	/**
	 * The feature id for the '<em><b>Tab</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TAB_FILTER__TAB = GEN_PROPERTY_TAB_FILTER__TAB;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TAB_FILTER__TYPES = GEN_PROPERTY_TAB_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generated Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TAB_FILTER__GENERATED_TYPES = GEN_PROPERTY_TAB_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Tab Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TAB_FILTER_FEATURE_COUNT = GEN_PROPERTY_TAB_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.CustomTabFilterImpl <em>Custom Tab Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.CustomTabFilterImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getCustomTabFilter()
	 * @generated
	 */
	int CUSTOM_TAB_FILTER = 96;

	/**
	 * The feature id for the '<em><b>Tab</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TAB_FILTER__TAB = GEN_PROPERTY_TAB_FILTER__TAB;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TAB_FILTER__CLASS_NAME = GEN_PROPERTY_TAB_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Tab Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TAB_FILTER_FEATURE_COUNT = GEN_PROPERTY_TAB_FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl <em>Gen Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenApplicationImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenApplication()
	 * @generated
	 */
	int GEN_APPLICATION = 97;

	/**
	 * The feature id for the '<em><b>Editor Gen</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_APPLICATION__EDITOR_GEN = 0;

	/**
	 * The feature id for the '<em><b>Application Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_APPLICATION__APPLICATION_PACKAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Application Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_APPLICATION__APPLICATION_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Workbench Advisor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_APPLICATION__WORKBENCH_ADVISOR_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Workbench Window Advisor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_APPLICATION__WORKBENCH_WINDOW_ADVISOR_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Action Bar Advisor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_APPLICATION__ACTION_BAR_ADVISOR_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Perspective Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_APPLICATION__PERSPECTIVE_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Perspective Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_APPLICATION__PERSPECTIVE_ID = 7;

	/**
	 * The number of structural features of the '<em>Gen Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_APPLICATION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderPriority <em>Provider Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getProviderPriority()
	 * @generated
	 */
	int PROVIDER_PRIORITY = 98;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment <em>Link Label Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getLinkLabelAlignment()
	 * @generated
	 */
	int LINK_LABEL_ALIGNMENT = 99;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.ViewmapLayoutType <em>Viewmap Layout Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.ViewmapLayoutType
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getViewmapLayoutType()
	 * @generated
	 */
	int VIEWMAP_LAYOUT_TYPE = 100;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GenSeverity <em>Gen Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GenSeverity
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenSeverity()
	 * @generated
	 */
	int GEN_SEVERITY = 101;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GenLanguage <em>Gen Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLanguage
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenLanguage()
	 * @generated
	 */
	int GEN_LANGUAGE = 102;


	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorReferenceType <em>Gen Navigator Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorReferenceType
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenNavigatorReferenceType()
	 * @generated
	 */
	int GEN_NAVIGATOR_REFERENCE_TYPE = 103;


	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.GeneratedType <em>Generated Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.GeneratedType
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGeneratedType()
	 * @generated
	 */
	int GENERATED_TYPE = 104;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator <em>Gen Editor Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Editor Generator</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator
	 * @generated
	 */
	EClass getGenEditorGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getAudits <em>Audits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audits</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getAudits()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EReference getGenEditorGenerator_Audits();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metrics</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getMetrics()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EReference getGenEditorGenerator_Metrics();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDiagram()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EReference getGenEditorGenerator_Diagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPlugin()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EReference getGenEditorGenerator_Plugin();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editor</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getEditor()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EReference getGenEditorGenerator_Editor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getNavigator <em>Navigator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Navigator</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getNavigator()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EReference getGenEditorGenerator_Navigator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPropertySheet <em>Property Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Sheet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPropertySheet()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EReference getGenEditorGenerator_PropertySheet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getApplication()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EReference getGenEditorGenerator_Application();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDomainGenModel <em>Domain Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Gen Model</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDomainGenModel()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EReference getGenEditorGenerator_DomainGenModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPackageNamePrefix <em>Package Name Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name Prefix</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPackageNamePrefix()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EAttribute getGenEditorGenerator_PackageNamePrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getModelID <em>Model ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getModelID()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EAttribute getGenEditorGenerator_ModelID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Same File For Diagram And Model</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#isSameFileForDiagramAndModel()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EAttribute getGenEditorGenerator_SameFileForDiagramAndModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDiagramFileExtension <em>Diagram File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram File Extension</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDiagramFileExtension()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EAttribute getGenEditorGenerator_DiagramFileExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDomainFileExtension <em>Domain File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain File Extension</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDomainFileExtension()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EAttribute getGenEditorGenerator_DomainFileExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#isDynamicTemplates <em>Dynamic Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Templates</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#isDynamicTemplates()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EAttribute getGenEditorGenerator_DynamicTemplates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getTemplateDirectory <em>Template Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Directory</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getTemplateDirectory()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EAttribute getGenEditorGenerator_TemplateDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getCopyrightText <em>Copyright Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright Text</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getCopyrightText()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EAttribute getGenEditorGenerator_CopyrightText();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getExpressionProviders <em>Expression Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression Providers</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getExpressionProviders()
	 * @see #getGenEditorGenerator()
	 * @generated
	 */
	EReference getGenEditorGenerator_ExpressionProviders();

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
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorGen <em>Editor Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Editor Gen</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorGen()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EReference getGenDiagram_EditorGen();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isSynchronized <em>Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronized</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#isSynchronized()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_Synchronized();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView <em>Gen Editor View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Editor View</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorView
	 * @generated
	 */
	EClass getGenEditorView();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getEditorGen <em>Editor Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Editor Gen</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorView#getEditorGen()
	 * @see #getGenEditorView()
	 * @generated
	 */
	EReference getGenEditorView_EditorGen();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorView#getPackageName()
	 * @see #getGenEditorView()
	 * @generated
	 */
	EAttribute getGenEditorView_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getActionBarContributorClassName <em>Action Bar Contributor Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Bar Contributor Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorView#getActionBarContributorClassName()
	 * @see #getGenEditorView()
	 * @generated
	 */
	EAttribute getGenEditorView_ActionBarContributorClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorView#getClassName()
	 * @see #getGenEditorView()
	 * @generated
	 */
	EAttribute getGenEditorView_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getIconPath <em>Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Path</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorView#getIconPath()
	 * @see #getGenEditorView()
	 * @generated
	 */
	EAttribute getGenEditorView_IconPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorView#getID()
	 * @see #getGenEditorView()
	 * @generated
	 */
	EAttribute getGenEditorView_ID();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationProviderPriority <em>Validation Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationProviderPriority()
	 * @see #getBatchValidation()
	 * @generated
	 */
	EAttribute getBatchValidation_ValidationProviderPriority();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMarkerNavigationProviderPriority <em>Marker Navigation Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Navigation Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMarkerNavigationProviderPriority()
	 * @see #getBatchValidation()
	 * @generated
	 */
	EAttribute getBatchValidation_MarkerNavigationProviderPriority();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMetricProviderClassName <em>Metric Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMetricProviderClassName()
	 * @see #getBatchValidation()
	 * @generated
	 */
	EAttribute getBatchValidation_MetricProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMetricProviderPriority <em>Metric Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMetricProviderPriority()
	 * @see #getBatchValidation()
	 * @generated
	 */
	EAttribute getBatchValidation_MetricProviderPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationDecoratorProviderClassName <em>Validation Decorator Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Decorator Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationDecoratorProviderClassName()
	 * @see #getBatchValidation()
	 * @generated
	 */
	EAttribute getBatchValidation_ValidationDecoratorProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#isValidationDecorators <em>Validation Decorators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Decorators</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation#isValidationDecorators()
	 * @see #getBatchValidation()
	 * @generated
	 */
	EAttribute getBatchValidation_ValidationDecorators();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationDecoratorProviderPriority <em>Validation Decorator Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Decorator Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationDecoratorProviderPriority()
	 * @see #getBatchValidation()
	 * @generated
	 */
	EAttribute getBatchValidation_ValidationDecoratorProviderPriority();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getNotationViewProviderPriority <em>Notation View Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notation View Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getNotationViewProviderPriority()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_NotationViewProviderPriority();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getEditPartProviderPriority <em>Edit Part Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Part Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getEditPartProviderPriority()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_EditPartProviderPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getPaletteProviderClassName <em>Palette Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Palette Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getPaletteProviderClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_PaletteProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getPaletteProviderPriority <em>Palette Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Palette Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getPaletteProviderPriority()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_PaletteProviderPriority();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getModelingAssistantProviderPriority <em>Modeling Assistant Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modeling Assistant Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getModelingAssistantProviderPriority()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_ModelingAssistantProviderPriority();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getPropertyProviderPriority <em>Property Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getPropertyProviderPriority()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_PropertyProviderPriority();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getIconProviderPriority <em>Icon Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getIconProviderPriority()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_IconProviderPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getParserProviderClassName <em>Parser Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parser Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getParserProviderClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_ParserProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getParserProviderPriority <em>Parser Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parser Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getParserProviderPriority()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_ParserProviderPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getAbstractParserClassName <em>Abstract Parser Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Parser Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getAbstractParserClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_AbstractParserClassName();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getStructuralFeaturesParserClassName <em>Structural Features Parser Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structural Features Parser Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getStructuralFeaturesParserClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_StructuralFeaturesParserClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getContributionItemProviderClassName <em>Contribution Item Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contribution Item Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getContributionItemProviderClassName()
	 * @see #getProviderClassNames()
	 * @generated
	 */
	EAttribute getProviderClassNames_ContributionItemProviderClassName();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getShortcutsDecoratorProviderClassName <em>Shortcuts Decorator Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shortcuts Decorator Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Shortcuts#getShortcutsDecoratorProviderClassName()
	 * @see #getShortcuts()
	 * @generated
	 */
	EAttribute getShortcuts_ShortcutsDecoratorProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getShortcutsDecoratorProviderPriority <em>Shortcuts Decorator Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shortcuts Decorator Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Shortcuts#getShortcutsDecoratorProviderPriority()
	 * @see #getShortcuts()
	 * @generated
	 */
	EAttribute getShortcuts_ShortcutsDecoratorProviderPriority();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.PackageNames#getEditHelpersPackageName <em>Edit Helpers Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Helpers Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.PackageNames#getEditHelpersPackageName()
	 * @see #getPackageNames()
	 * @generated
	 */
	EAttribute getPackageNames_EditHelpersPackageName();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardIconPath <em>Creation Wizard Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Wizard Icon Path</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardIconPath()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_CreationWizardIconPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardCategoryID <em>Creation Wizard Category ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Wizard Category ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getCreationWizardCategoryID()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_CreationWizardCategoryID();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getNewDiagramFileWizardClassName <em>New Diagram File Wizard Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Diagram File Wizard Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getNewDiagramFileWizardClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_NewDiagramFileWizardClassName();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getLoadResourceActionClassName <em>Load Resource Action Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Resource Action Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getLoadResourceActionClassName()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_LoadResourceActionClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditorCandies#getEditingDomainID <em>Editing Domain ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editing Domain ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditorCandies#getEditingDomainID()
	 * @see #getEditorCandies()
	 * @generated
	 */
	EAttribute getEditorCandies_EditingDomainID();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getBaseEditHelperClassName <em>Base Edit Helper Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Edit Helper Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getBaseEditHelperClassName()
	 * @see #getEditPartCandies()
	 * @generated
	 */
	EAttribute getEditPartCandies_BaseEditHelperClassName();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getTextSelectionEditPolicyClassName <em>Text Selection Edit Policy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Selection Edit Policy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getTextSelectionEditPolicyClassName()
	 * @see #getEditPartCandies()
	 * @generated
	 */
	EAttribute getEditPartCandies_TextSelectionEditPolicyClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getTextNonResizableEditPolicyClassName <em>Text Non Resizable Edit Policy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Non Resizable Edit Policy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getTextNonResizableEditPolicyClassName()
	 * @see #getEditPartCandies()
	 * @generated
	 */
	EAttribute getEditPartCandies_TextNonResizableEditPolicyClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getExternalNodeLabelHostLayoutEditPolicyClassName <em>External Node Label Host Layout Edit Policy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Node Label Host Layout Edit Policy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EditPartCandies#getExternalNodeLabelHostLayoutEditPolicyClassName()
	 * @see #getEditPartCandies()
	 * @generated
	 */
	EAttribute getEditPartCandies_ExternalNodeLabelHostLayoutEditPolicyClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.MeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Unit</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.MeasurementUnit
	 * @generated
	 */
	EClass getMeasurementUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.MeasurementUnit#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.MeasurementUnit#getUnits()
	 * @see #getMeasurementUnit()
	 * @generated
	 */
	EAttribute getMeasurementUnit_Units();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin <em>Gen Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Plugin</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPlugin
	 * @generated
	 */
	EClass getGenPlugin();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getEditorGen <em>Editor Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Editor Gen</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPlugin#getEditorGen()
	 * @see #getGenPlugin()
	 * @generated
	 */
	EReference getGenPlugin_EditorGen();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPlugin#getID()
	 * @see #getGenPlugin()
	 * @generated
	 */
	EAttribute getGenPlugin_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPlugin#getName()
	 * @see #getGenPlugin()
	 * @generated
	 */
	EAttribute getGenPlugin_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPlugin#getProvider()
	 * @see #getGenPlugin()
	 * @generated
	 */
	EAttribute getGenPlugin_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPlugin#getVersion()
	 * @see #getGenPlugin()
	 * @generated
	 */
	EAttribute getGenPlugin_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#isPrintingEnabled <em>Printing Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printing Enabled</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPlugin#isPrintingEnabled()
	 * @see #getGenPlugin()
	 * @generated
	 */
	EAttribute getGenPlugin_PrintingEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getActivatorClassName <em>Activator Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activator Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPlugin#getActivatorClassName()
	 * @see #getGenPlugin()
	 * @generated
	 */
	EAttribute getGenPlugin_ActivatorClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.ElementType#getDiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram Element</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ElementType#getDiagramElement()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_DiagramElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ElementType#getUniqueIdentifier <em>Unique Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Identifier</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ElementType#getUniqueIdentifier()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_UniqueIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ElementType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ElementType#getDisplayName()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ElementType#isDefinedExternally <em>Defined Externally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defined Externally</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ElementType#isDefinedExternally()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_DefinedExternally();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.MetamodelType <em>Metamodel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Type</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.MetamodelType
	 * @generated
	 */
	EClass getMetamodelType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.MetamodelType#getEditHelperClassName <em>Edit Helper Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Helper Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.MetamodelType#getEditHelperClassName()
	 * @see #getMetamodelType()
	 * @generated
	 */
	EAttribute getMetamodelType_EditHelperClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.SpecializationType <em>Specialization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization Type</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.SpecializationType
	 * @generated
	 */
	EClass getSpecializationType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.SpecializationType#getMetamodelType <em>Metamodel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel Type</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.SpecializationType#getMetamodelType()
	 * @see #getSpecializationType()
	 * @generated
	 */
	EReference getSpecializationType_MetamodelType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.SpecializationType#getEditHelperAdviceClassName <em>Edit Helper Advice Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Helper Advice Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.SpecializationType#getEditHelperAdviceClassName()
	 * @see #getSpecializationType()
	 * @generated
	 */
	EAttribute getSpecializationType_EditHelperAdviceClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.NotationType <em>Notation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notation Type</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.NotationType
	 * @generated
	 */
	EClass getNotationType();

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
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Type</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getElementType()
	 * @see #getGenCommonBase()
	 * @generated
	 */
	EReference getGenCommonBase_ElementType();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviour</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getBehaviour()
	 * @see #getGenCommonBase()
	 * @generated
	 */
	EReference getGenCommonBase_Behaviour();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.Behaviour#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Subject</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Behaviour#getSubject()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_Subject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.CustomBehaviour <em>Custom Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Behaviour</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CustomBehaviour
	 * @generated
	 */
	EClass getCustomBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.CustomBehaviour#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CustomBehaviour#getKey()
	 * @see #getCustomBehaviour()
	 * @generated
	 */
	EAttribute getCustomBehaviour_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.CustomBehaviour#getEditPolicyQualifiedClassName <em>Edit Policy Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Policy Qualified Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CustomBehaviour#getEditPolicyQualifiedClassName()
	 * @see #getCustomBehaviour()
	 * @generated
	 */
	EAttribute getCustomBehaviour_EditPolicyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.SharedBehaviour <em>Shared Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Behaviour</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.SharedBehaviour
	 * @generated
	 */
	EClass getSharedBehaviour();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.SharedBehaviour#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.SharedBehaviour#getDelegate()
	 * @see #getSharedBehaviour()
	 * @generated
	 */
	EReference getSharedBehaviour_Delegate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.OpenDiagramBehaviour <em>Open Diagram Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Diagram Behaviour</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.OpenDiagramBehaviour
	 * @generated
	 */
	EClass getOpenDiagramBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.OpenDiagramBehaviour#getEditPolicyClassName <em>Edit Policy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Policy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.OpenDiagramBehaviour#getEditPolicyClassName()
	 * @see #getOpenDiagramBehaviour()
	 * @generated
	 */
	EAttribute getOpenDiagramBehaviour_EditPolicyClassName();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenChildSideAffixedNode <em>Gen Child Side Affixed Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Child Side Affixed Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildSideAffixedNode
	 * @generated
	 */
	EClass getGenChildSideAffixedNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildSideAffixedNode#getPreferredSideName <em>Preferred Side Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Side Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildSideAffixedNode#getPreferredSideName()
	 * @see #getGenChildSideAffixedNode()
	 * @generated
	 */
	EAttribute getGenChildSideAffixedNode_PreferredSideName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode <em>Gen Child Label Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Child Label Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode
	 * @generated
	 */
	EClass getGenChildLabelNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#isLabelReadOnly <em>Label Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Read Only</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#isLabelReadOnly()
	 * @see #getGenChildLabelNode()
	 * @generated
	 */
	EAttribute getGenChildLabelNode_LabelReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#isLabelElementIcon <em>Label Element Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Element Icon</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#isLabelElementIcon()
	 * @see #getGenChildLabelNode()
	 * @generated
	 */
	EAttribute getGenChildLabelNode_LabelElementIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#getLabelModelFacet <em>Label Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode#getLabelModelFacet()
	 * @see #getGenChildLabelNode()
	 * @generated
	 */
	EReference getGenChildLabelNode_LabelModelFacet();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenCompartment#isListLayout <em>List Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Layout</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCompartment#isListLayout()
	 * @see #getGenCompartment()
	 * @generated
	 */
	EAttribute getGenCompartment_ListLayout();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenLabel#isElementIcon <em>Element Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Icon</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLabel#isElementIcon()
	 * @see #getGenLabel()
	 * @generated
	 */
	EAttribute getGenLabel_ElementIcon();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.LabelModelFacet <em>Label Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelModelFacet
	 * @generated
	 */
	EClass getLabelModelFacet();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet <em>Feature Label Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Label Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet
	 * @generated
	 */
	EClass getFeatureLabelModelFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getViewPattern <em>View Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Pattern</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getViewPattern()
	 * @see #getFeatureLabelModelFacet()
	 * @generated
	 */
	EAttribute getFeatureLabelModelFacet_ViewPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getEditPattern <em>Edit Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Pattern</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet#getEditPattern()
	 * @see #getFeatureLabelModelFacet()
	 * @generated
	 */
	EAttribute getFeatureLabelModelFacet_EditPattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.CompositeFeatureModelFacet <em>Composite Feature Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Feature Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CompositeFeatureModelFacet
	 * @generated
	 */
	EClass getCompositeFeatureModelFacet();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.CompositeFeatureModelFacet#getMetaFeatures <em>Meta Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Features</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CompositeFeatureModelFacet#getMetaFeatures()
	 * @see #getCompositeFeatureModelFacet()
	 * @generated
	 */
	EReference getCompositeFeatureModelFacet_MetaFeatures();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.CompositeFeatureLabelModelFacet <em>Composite Feature Label Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Feature Label Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CompositeFeatureLabelModelFacet
	 * @generated
	 */
	EClass getCompositeFeatureLabelModelFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.CompositeFeatureLabelModelFacet#getViewPattern <em>View Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Pattern</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CompositeFeatureLabelModelFacet#getViewPattern()
	 * @see #getCompositeFeatureLabelModelFacet()
	 * @generated
	 */
	EAttribute getCompositeFeatureLabelModelFacet_ViewPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.CompositeFeatureLabelModelFacet#getEditPattern <em>Edit Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Pattern</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CompositeFeatureLabelModelFacet#getEditPattern()
	 * @see #getCompositeFeatureLabelModelFacet()
	 * @generated
	 */
	EAttribute getCompositeFeatureLabelModelFacet_EditPattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.DesignLabelModelFacet <em>Design Label Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Label Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.DesignLabelModelFacet
	 * @generated
	 */
	EClass getDesignLabelModelFacet();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet <em>Feature Link Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Link Model Facet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet
	 * @generated
	 */
	EClass getFeatureLinkModelFacet();

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
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmf.codegen.gmfgen.Viewmap#getRequiredPluginIDs <em>Required Plugin IDs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Plugin IDs</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Viewmap#getRequiredPluginIDs()
	 * @see #getViewmap()
	 * @generated
	 */
	EAttribute getViewmap_RequiredPluginIDs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.Viewmap#getLayoutType <em>Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Type</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Viewmap#getLayoutType()
	 * @see #getViewmap()
	 * @generated
	 */
	EAttribute getViewmap_LayoutType();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.StyleAttributes <em>Style Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Attributes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.StyleAttributes
	 * @generated
	 */
	EClass getStyleAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.StyleAttributes#isFixedFont <em>Fixed Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Font</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.StyleAttributes#isFixedFont()
	 * @see #getStyleAttributes()
	 * @generated
	 */
	EAttribute getStyleAttributes_FixedFont();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.StyleAttributes#isFixedForeground <em>Fixed Foreground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Foreground</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.StyleAttributes#isFixedForeground()
	 * @see #getStyleAttributes()
	 * @generated
	 */
	EAttribute getStyleAttributes_FixedForeground();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.StyleAttributes#isFixedBackground <em>Fixed Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Background</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.StyleAttributes#isFixedBackground()
	 * @see #getStyleAttributes()
	 * @generated
	 */
	EAttribute getStyleAttributes_FixedBackground();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ResizeConstraints <em>Resize Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resize Constraints</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ResizeConstraints
	 * @generated
	 */
	EClass getResizeConstraints();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ResizeConstraints#getResizeHandles <em>Resize Handles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resize Handles</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ResizeConstraints#getResizeHandles()
	 * @see #getResizeConstraints()
	 * @generated
	 */
	EAttribute getResizeConstraints_ResizeHandles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ResizeConstraints#getNonResizeHandles <em>Non Resize Handles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Resize Handles</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ResizeConstraints#getNonResizeHandles()
	 * @see #getResizeConstraints()
	 * @generated
	 */
	EAttribute getResizeConstraints_NonResizeHandles();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.LabelOffsetAttributes <em>Label Offset Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Offset Attributes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelOffsetAttributes
	 * @generated
	 */
	EClass getLabelOffsetAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.LabelOffsetAttributes#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelOffsetAttributes#getX()
	 * @see #getLabelOffsetAttributes()
	 * @generated
	 */
	EAttribute getLabelOffsetAttributes_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.LabelOffsetAttributes#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LabelOffsetAttributes#getY()
	 * @see #getLabelOffsetAttributes()
	 * @generated
	 */
	EAttribute getLabelOffsetAttributes_Y();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap <em>Parent Assigned Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Assigned Viewmap</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap
	 * @generated
	 */
	EClass getParentAssignedViewmap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getGetterName <em>Getter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getter Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getGetterName()
	 * @see #getParentAssignedViewmap()
	 * @generated
	 */
	EAttribute getParentAssignedViewmap_GetterName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getSetterName <em>Setter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setter Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getSetterName()
	 * @see #getParentAssignedViewmap()
	 * @generated
	 */
	EAttribute getParentAssignedViewmap_SetterName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Figure Qualified Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap#getFigureQualifiedClassName()
	 * @see #getParentAssignedViewmap()
	 * @generated
	 */
	EAttribute getParentAssignedViewmap_FigureQualifiedClassName();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ValueExpression#getLangName <em>Lang Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ValueExpression#getLangName()
	 * @see #getValueExpression()
	 * @generated
	 */
	EAttribute getValueExpression_LangName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenConstraint <em>Gen Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Constraint</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenConstraint
	 * @generated
	 */
	EClass getGenConstraint();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EntryBase#getTitle()
	 * @see #getEntryBase()
	 * @generated
	 */
	EAttribute getEntryBase_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.EntryBase#getDescription()
	 * @see #getEntryBase()
	 * @generated
	 */
	EAttribute getEntryBase_Description();

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
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getGenNodes <em>Gen Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Nodes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolEntry#getGenNodes()
	 * @see #getToolEntry()
	 * @generated
	 */
	EReference getToolEntry_GenNodes();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getGenLinks <em>Gen Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Links</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolEntry#getGenLinks()
	 * @see #getToolEntry()
	 * @generated
	 */
	EReference getToolEntry_GenLinks();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolEntry#getElements()
	 * @see #getToolEntry()
	 * @generated
	 */
	EReference getToolEntry_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getQualifiedToolName <em>Qualified Tool Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Tool Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolEntry#getQualifiedToolName()
	 * @see #getToolEntry()
	 * @generated
	 */
	EAttribute getToolEntry_QualifiedToolName();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolEntry#getProperties()
	 * @see #getToolEntry()
	 * @generated
	 */
	EReference getToolEntry_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroupItem <em>Tool Group Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Group Item</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolGroupItem
	 * @generated
	 */
	EClass getToolGroupItem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.Separator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separator</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.Separator
	 * @generated
	 */
	EClass getSeparator();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#isStack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolGroup#isStack()
	 * @see #getToolGroup()
	 * @generated
	 */
	EAttribute getToolGroup_Stack();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#isCollapse <em>Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapse</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolGroup#isCollapse()
	 * @see #getToolGroup()
	 * @generated
	 */
	EAttribute getToolGroup_Collapse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolGroup#getEntries()
	 * @see #getToolGroup()
	 * @generated
	 */
	EReference getToolGroup_Entries();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup#isToolsOnly <em>Tools Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tools Only</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolGroup#isToolsOnly()
	 * @see #getToolGroup()
	 * @generated
	 */
	EAttribute getToolGroup_ToolsOnly();

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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenElementInitializer#getTypeModelFacet <em>Type Model Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Model Facet</em>'.
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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getElementClass <em>Element Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Class</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getElementClass()
	 * @see #getGenFeatureSeqInitializer()
	 * @generated
	 */
	EReference getGenFeatureSeqInitializer_ElementClass();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getCreatingInitializer <em>Creating Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Creating Initializer</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer#getCreatingInitializer()
	 * @see #getGenFeatureSeqInitializer()
	 * @generated
	 */
	EReference getGenFeatureSeqInitializer_CreatingInitializer();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenReferenceNewElementSpec <em>Gen Reference New Element Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Reference New Element Spec</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenReferenceNewElementSpec
	 * @generated
	 */
	EClass getGenReferenceNewElementSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenReferenceNewElementSpec#getNewElementInitializers <em>New Element Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Element Initializers</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenReferenceNewElementSpec#getNewElementInitializers()
	 * @see #getGenReferenceNewElementSpec()
	 * @generated
	 */
	EReference getGenReferenceNewElementSpec_NewElementInitializers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer <em>Gen Feature Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Feature Initializer</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer
	 * @generated
	 */
	EClass getGenFeatureInitializer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer#getFeature()
	 * @see #getGenFeatureInitializer()
	 * @generated
	 */
	EReference getGenFeatureInitializer_Feature();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer#getFeatureSeqInitializer <em>Feature Seq Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature Seq Initializer</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenFeatureInitializer#getFeatureSeqInitializer()
	 * @see #getGenFeatureInitializer()
	 * @generated
	 */
	EReference getGenFeatureInitializer_FeatureSeqInitializer();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenRuleContainerBase <em>Gen Rule Container Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Rule Container Base</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenRuleContainerBase
	 * @generated
	 */
	EClass getGenRuleContainerBase();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenRuleContainerBase#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Editor</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenRuleContainerBase#getEditor()
	 * @see #getGenRuleContainerBase()
	 * @generated
	 */
	EReference getGenRuleContainerBase_Editor();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenRuleBase <em>Gen Rule Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Rule Base</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenRuleBase
	 * @generated
	 */
	EClass getGenRuleBase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenRuleBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenRuleBase#getName()
	 * @see #getGenRuleBase()
	 * @generated
	 */
	EAttribute getGenRuleBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenRuleBase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenRuleBase#getDescription()
	 * @see #getGenRuleBase()
	 * @generated
	 */
	EAttribute getGenRuleBase_Description();

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
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditRule#getTarget()
	 * @see #getGenAuditRule()
	 * @generated
	 */
	EReference getGenAuditRule_Target();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenRuleTarget <em>Gen Rule Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Rule Target</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenRuleTarget
	 * @generated
	 */
	EClass getGenRuleTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainElementTarget <em>Gen Domain Element Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Domain Element Target</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDomainElementTarget
	 * @generated
	 */
	EClass getGenDomainElementTarget();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainElementTarget#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDomainElementTarget#getElement()
	 * @see #getGenDomainElementTarget()
	 * @generated
	 */
	EReference getGenDomainElementTarget_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramElementTarget <em>Gen Diagram Element Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Diagram Element Target</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagramElementTarget
	 * @generated
	 */
	EClass getGenDiagramElementTarget();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramElementTarget#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagramElementTarget#getElement()
	 * @see #getGenDiagramElementTarget()
	 * @generated
	 */
	EReference getGenDiagramElementTarget_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainAttributeTarget <em>Gen Domain Attribute Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Domain Attribute Target</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDomainAttributeTarget
	 * @generated
	 */
	EClass getGenDomainAttributeTarget();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainAttributeTarget#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDomainAttributeTarget#getAttribute()
	 * @see #getGenDomainAttributeTarget()
	 * @generated
	 */
	EReference getGenDomainAttributeTarget_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainAttributeTarget#isNullAsError <em>Null As Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null As Error</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDomainAttributeTarget#isNullAsError()
	 * @see #getGenDomainAttributeTarget()
	 * @generated
	 */
	EAttribute getGenDomainAttributeTarget_NullAsError();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenNotationElementTarget <em>Gen Notation Element Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Notation Element Target</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNotationElementTarget
	 * @generated
	 */
	EClass getGenNotationElementTarget();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenNotationElementTarget#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNotationElementTarget#getElement()
	 * @see #getGenNotationElementTarget()
	 * @generated
	 */
	EReference getGenNotationElementTarget_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenMetricContainer <em>Gen Metric Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Metric Container</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMetricContainer
	 * @generated
	 */
	EClass getGenMetricContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenMetricContainer#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMetricContainer#getMetrics()
	 * @see #getGenMetricContainer()
	 * @generated
	 */
	EReference getGenMetricContainer_Metrics();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenMetricRule <em>Gen Metric Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Metric Rule</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMetricRule
	 * @generated
	 */
	EClass getGenMetricRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getKey()
	 * @see #getGenMetricRule()
	 * @generated
	 */
	EAttribute getGenMetricRule_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getRule()
	 * @see #getGenMetricRule()
	 * @generated
	 */
	EReference getGenMetricRule_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getTarget()
	 * @see #getGenMetricRule()
	 * @generated
	 */
	EReference getGenMetricRule_Target();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getContainer()
	 * @see #getGenMetricRule()
	 * @generated
	 */
	EReference getGenMetricRule_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getLowLimit <em>Low Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Limit</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getLowLimit()
	 * @see #getGenMetricRule()
	 * @generated
	 */
	EAttribute getGenMetricRule_LowLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getHighLimit <em>High Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Limit</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMetricRule#getHighLimit()
	 * @see #getGenMetricRule()
	 * @generated
	 */
	EAttribute getGenMetricRule_HighLimit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget <em>Gen Audited Metric Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Audited Metric Target</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget
	 * @generated
	 */
	EClass getGenAuditedMetricTarget();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget#getMetric()
	 * @see #getGenAuditedMetricTarget()
	 * @generated
	 */
	EReference getGenAuditedMetricTarget_Metric();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget#getMetricValueContext <em>Metric Value Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric Value Context</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget#getMetricValueContext()
	 * @see #getGenAuditedMetricTarget()
	 * @generated
	 */
	EReference getGenAuditedMetricTarget_MetricValueContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenAuditable <em>Gen Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Auditable</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenAuditable
	 * @generated
	 */
	EClass getGenAuditable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenMeasurable <em>Gen Measurable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Measurable</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenMeasurable
	 * @generated
	 */
	EClass getGenMeasurable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer <em>Gen Expression Provider Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Expression Provider Container</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer
	 * @generated
	 */
	EClass getGenExpressionProviderContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getExpressionsPackageName <em>Expressions Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expressions Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getExpressionsPackageName()
	 * @see #getGenExpressionProviderContainer()
	 * @generated
	 */
	EAttribute getGenExpressionProviderContainer_ExpressionsPackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getAbstractExpressionClassName <em>Abstract Expression Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Expression Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getAbstractExpressionClassName()
	 * @see #getGenExpressionProviderContainer()
	 * @generated
	 */
	EAttribute getGenExpressionProviderContainer_AbstractExpressionClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getProviders()
	 * @see #getGenExpressionProviderContainer()
	 * @generated
	 */
	EReference getGenExpressionProviderContainer_Providers();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getEditorGen <em>Editor Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Editor Gen</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer#getEditorGen()
	 * @see #getGenExpressionProviderContainer()
	 * @generated
	 */
	EReference getGenExpressionProviderContainer_EditorGen();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase <em>Gen Expression Provider Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Expression Provider Base</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase
	 * @generated
	 */
	EClass getGenExpressionProviderBase();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expressions</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase#getExpressions()
	 * @see #getGenExpressionProviderBase()
	 * @generated
	 */
	EReference getGenExpressionProviderBase_Expressions();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase#getContainer()
	 * @see #getGenExpressionProviderBase()
	 * @generated
	 */
	EReference getGenExpressionProviderBase_Container();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider <em>Gen Java Expression Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Java Expression Provider</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider
	 * @generated
	 */
	EClass getGenJavaExpressionProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter <em>Gen Expression Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Expression Interpreter</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter
	 * @generated
	 */
	EClass getGenExpressionInterpreter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter#getLanguage()
	 * @see #getGenExpressionInterpreter()
	 * @generated
	 */
	EAttribute getGenExpressionInterpreter_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter#getClassName()
	 * @see #getGenExpressionInterpreter()
	 * @generated
	 */
	EAttribute getGenExpressionInterpreter_ClassName();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter#getRequiredPluginIDs <em>Required Plugin IDs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Plugin IDs</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter#getRequiredPluginIDs()
	 * @see #getGenExpressionInterpreter()
	 * @generated
	 */
	EAttribute getGenExpressionInterpreter_RequiredPluginIDs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator <em>Gen Navigator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Navigator</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator
	 * @generated
	 */
	EClass getGenNavigator();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getEditorGen <em>Editor Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Editor Gen</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getEditorGen()
	 * @see #getGenNavigator()
	 * @generated
	 */
	EReference getGenNavigator_EditorGen();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionID <em>Content Extension ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Extension ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionID()
	 * @see #getGenNavigator()
	 * @generated
	 */
	EAttribute getGenNavigator_ContentExtensionID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionName <em>Content Extension Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Extension Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionName()
	 * @see #getGenNavigator()
	 * @generated
	 */
	EAttribute getGenNavigator_ContentExtensionName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionPriority <em>Content Extension Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Extension Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionPriority()
	 * @see #getGenNavigator()
	 * @generated
	 */
	EAttribute getGenNavigator_ContentExtensionPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentProviderClassName <em>Content Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentProviderClassName()
	 * @see #getGenNavigator()
	 * @generated
	 */
	EAttribute getGenNavigator_ContentProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getLabelProviderClassName <em>Label Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getLabelProviderClassName()
	 * @see #getGenNavigator()
	 * @generated
	 */
	EAttribute getGenNavigator_LabelProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getAbstractNavigatorItemClassName <em>Abstract Navigator Item Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Navigator Item Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getAbstractNavigatorItemClassName()
	 * @see #getGenNavigator()
	 * @generated
	 */
	EAttribute getGenNavigator_AbstractNavigatorItemClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getNavigatorGroupClassName <em>Navigator Group Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigator Group Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getNavigatorGroupClassName()
	 * @see #getGenNavigator()
	 * @generated
	 */
	EAttribute getGenNavigator_NavigatorGroupClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getNavigatorItemClassName <em>Navigator Item Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigator Item Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getNavigatorItemClassName()
	 * @see #getGenNavigator()
	 * @generated
	 */
	EAttribute getGenNavigator_NavigatorItemClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getPackageName()
	 * @see #getGenNavigator()
	 * @generated
	 */
	EAttribute getGenNavigator_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getChildReferences <em>Child References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child References</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigator#getChildReferences()
	 * @see #getGenNavigator()
	 * @generated
	 */
	EReference getGenNavigator_ChildReferences();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference <em>Gen Navigator Child Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Navigator Child Reference</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference
	 * @generated
	 */
	EClass getGenNavigatorChildReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getParent()
	 * @see #getGenNavigatorChildReference()
	 * @generated
	 */
	EReference getGenNavigatorChildReference_Parent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getChild()
	 * @see #getGenNavigatorChildReference()
	 * @generated
	 */
	EReference getGenNavigatorChildReference_Child();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Type</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getReferenceType()
	 * @see #getGenNavigatorChildReference()
	 * @generated
	 */
	EAttribute getGenNavigatorChildReference_ReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getGroupName()
	 * @see #getGenNavigatorChildReference()
	 * @generated
	 */
	EAttribute getGenNavigatorChildReference_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getGroupIcon <em>Group Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Icon</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getGroupIcon()
	 * @see #getGenNavigatorChildReference()
	 * @generated
	 */
	EAttribute getGenNavigatorChildReference_GroupIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#isHideIfEmpty <em>Hide If Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide If Empty</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#isHideIfEmpty()
	 * @see #getGenNavigatorChildReference()
	 * @generated
	 */
	EAttribute getGenNavigatorChildReference_HideIfEmpty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertySheet <em>Gen Property Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Property Sheet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertySheet
	 * @generated
	 */
	EClass getGenPropertySheet();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#getEditorGen <em>Editor Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Editor Gen</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#getEditorGen()
	 * @see #getGenPropertySheet()
	 * @generated
	 */
	EReference getGenPropertySheet_EditorGen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#getTabs()
	 * @see #getGenPropertySheet()
	 * @generated
	 */
	EReference getGenPropertySheet_Tabs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#getPackageName()
	 * @see #getGenPropertySheet()
	 * @generated
	 */
	EAttribute getGenPropertySheet_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#isReadOnly()
	 * @see #getGenPropertySheet()
	 * @generated
	 */
	EAttribute getGenPropertySheet_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#isNeedsCaption <em>Needs Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Caption</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#isNeedsCaption()
	 * @see #getGenPropertySheet()
	 * @generated
	 */
	EAttribute getGenPropertySheet_NeedsCaption();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#getLabelProviderClassName <em>Label Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertySheet#getLabelProviderClassName()
	 * @see #getGenPropertySheet()
	 * @generated
	 */
	EAttribute getGenPropertySheet_LabelProviderClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertyTab <em>Gen Property Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Property Tab</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertyTab
	 * @generated
	 */
	EClass getGenPropertyTab();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertyTab#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sheet</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertyTab#getSheet()
	 * @see #getGenPropertyTab()
	 * @generated
	 */
	EReference getGenPropertyTab_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertyTab#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertyTab#getID()
	 * @see #getGenPropertyTab()
	 * @generated
	 */
	EAttribute getGenPropertyTab_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertyTab#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertyTab#getLabel()
	 * @see #getGenPropertyTab()
	 * @generated
	 */
	EAttribute getGenPropertyTab_Label();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenStandardPropertyTab <em>Gen Standard Property Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Standard Property Tab</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenStandardPropertyTab
	 * @generated
	 */
	EClass getGenStandardPropertyTab();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab <em>Gen Custom Property Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Custom Property Tab</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab
	 * @generated
	 */
	EClass getGenCustomPropertyTab();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab#getClassName()
	 * @see #getGenCustomPropertyTab()
	 * @generated
	 */
	EAttribute getGenCustomPropertyTab_ClassName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab#getFilter()
	 * @see #getGenCustomPropertyTab()
	 * @generated
	 */
	EReference getGenCustomPropertyTab_Filter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertyTabFilter <em>Gen Property Tab Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Property Tab Filter</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertyTabFilter
	 * @generated
	 */
	EClass getGenPropertyTabFilter();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenPropertyTabFilter#getTab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tab</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenPropertyTabFilter#getTab()
	 * @see #getGenPropertyTabFilter()
	 * @generated
	 */
	EReference getGenPropertyTabFilter_Tab();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.TypeTabFilter <em>Type Tab Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Tab Filter</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeTabFilter
	 * @generated
	 */
	EClass getTypeTabFilter();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmf.codegen.gmfgen.TypeTabFilter#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeTabFilter#getTypes()
	 * @see #getTypeTabFilter()
	 * @generated
	 */
	EAttribute getTypeTabFilter_Types();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmf.codegen.gmfgen.TypeTabFilter#getGeneratedTypes <em>Generated Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generated Types</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.TypeTabFilter#getGeneratedTypes()
	 * @see #getTypeTabFilter()
	 * @generated
	 */
	EAttribute getTypeTabFilter_GeneratedTypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.CustomTabFilter <em>Custom Tab Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Tab Filter</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CustomTabFilter
	 * @generated
	 */
	EClass getCustomTabFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.CustomTabFilter#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CustomTabFilter#getClassName()
	 * @see #getCustomTabFilter()
	 * @generated
	 */
	EAttribute getCustomTabFilter_ClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication <em>Gen Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Application</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenApplication
	 * @generated
	 */
	EClass getGenApplication();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getEditorGen <em>Editor Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Editor Gen</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenApplication#getEditorGen()
	 * @see #getGenApplication()
	 * @generated
	 */
	EReference getGenApplication_EditorGen();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getApplicationPackageName <em>Application Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenApplication#getApplicationPackageName()
	 * @see #getGenApplication()
	 * @generated
	 */
	EAttribute getGenApplication_ApplicationPackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getApplicationClassName <em>Application Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenApplication#getApplicationClassName()
	 * @see #getGenApplication()
	 * @generated
	 */
	EAttribute getGenApplication_ApplicationClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getWorkbenchAdvisorClassName <em>Workbench Advisor Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workbench Advisor Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenApplication#getWorkbenchAdvisorClassName()
	 * @see #getGenApplication()
	 * @generated
	 */
	EAttribute getGenApplication_WorkbenchAdvisorClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getWorkbenchWindowAdvisorClassName <em>Workbench Window Advisor Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workbench Window Advisor Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenApplication#getWorkbenchWindowAdvisorClassName()
	 * @see #getGenApplication()
	 * @generated
	 */
	EAttribute getGenApplication_WorkbenchWindowAdvisorClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getActionBarAdvisorClassName <em>Action Bar Advisor Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Bar Advisor Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenApplication#getActionBarAdvisorClassName()
	 * @see #getGenApplication()
	 * @generated
	 */
	EAttribute getGenApplication_ActionBarAdvisorClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getPerspectiveClassName <em>Perspective Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perspective Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenApplication#getPerspectiveClassName()
	 * @see #getGenApplication()
	 * @generated
	 */
	EAttribute getGenApplication_PerspectiveClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenApplication#getPerspectiveId <em>Perspective Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perspective Id</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenApplication#getPerspectiveId()
	 * @see #getGenApplication()
	 * @generated
	 */
	EAttribute getGenApplication_PerspectiveId();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.codegen.gmfgen.ProviderPriority <em>Provider Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provider Priority</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @generated
	 */
	EEnum getProviderPriority();

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
	 * Returns the meta object for enum '{@link org.eclipse.gmf.codegen.gmfgen.ViewmapLayoutType <em>Viewmap Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Viewmap Layout Type</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.ViewmapLayoutType
	 * @generated
	 */
	EEnum getViewmapLayoutType();

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
	 * Returns the meta object for enum '{@link org.eclipse.gmf.codegen.gmfgen.GenLanguage <em>Gen Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gen Language</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLanguage
	 * @generated
	 */
	EEnum getGenLanguage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorReferenceType <em>Gen Navigator Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gen Navigator Reference Type</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorReferenceType
	 * @generated
	 */
	EEnum getGenNavigatorReferenceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.codegen.gmfgen.GeneratedType <em>Generated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generated Type</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GeneratedType
	 * @generated
	 */
	EEnum getGeneratedType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GMFGenFactory getGMFGenFactory();

} //GMFGenPackage