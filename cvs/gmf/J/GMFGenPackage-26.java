/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @generated
 */
public interface GMFGenPackage extends EPackage{
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
	int GEN_COMMON_BASE = 1;

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
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE__VIEWMAP = 4;

	/**
	 * The number of structural features of the the '<em>Gen Common Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMON_BASE_FEATURE_COUNT = 5;

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
	int GEN_DIAGRAM__DIAGRAM_RUN_TIME_CLASS = GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VISUAL_ID = GEN_COMMON_BASE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PART_CLASS_NAME = GEN_COMMON_BASE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VIEWMAP = GEN_COMMON_BASE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Domain Meta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DOMAIN_META_MODEL = GEN_COMMON_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DOMAIN_DIAGRAM_ELEMENT = GEN_COMMON_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__NODES = GEN_COMMON_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__LINKS = GEN_COMMON_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PALETTE = GEN_COMMON_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Edit Parts Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PARTS_PACKAGE_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Editor Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDITOR_PACKAGE_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Providers Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PROVIDERS_PACKAGE_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Plugin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PLUGIN_ID = GEN_COMMON_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PLUGIN_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PROVIDER_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Same File For Diagram And Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__SAME_FILE_FOR_DIAGRAM_AND_MODEL = GEN_COMMON_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Printing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PRINTING_ENABLED = GEN_COMMON_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Has Domain Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__HAS_DOMAIN_MODEL = GEN_COMMON_BASE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Diagram File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DIAGRAM_FILE_EXTENSION = GEN_COMMON_BASE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Edit Part Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PART_FACTORY_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>View Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__VIEW_PROVIDER_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Edit Part Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDIT_PART_PROVIDER_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Metamodel Support Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__METAMODEL_SUPPORT_PROVIDER_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Modeling Assistant Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__MODELING_ASSISTANT_PROVIDER_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Icon Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ICON_PROVIDER_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Init Diagram File Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__INIT_DIAGRAM_FILE_ACTION_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Editor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__EDITOR_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Document Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__DOCUMENT_PROVIDER_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Action Bar Contributor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__ACTION_BAR_CONTRIBUTOR_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Matching Strategy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__MATCHING_STRATEGY_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Plugin Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM__PLUGIN_CLASS_NAME = GEN_COMMON_BASE_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the the '<em>Gen Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DIAGRAM_FEATURE_COUNT = GEN_COMMON_BASE_FEATURE_COUNT + 27;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl <em>Gen Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenNode()
	 * @generated
	 */
	int GEN_NODE = 2;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__DIAGRAM_RUN_TIME_CLASS = GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__VISUAL_ID = GEN_COMMON_BASE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__EDIT_PART_CLASS_NAME = GEN_COMMON_BASE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__VIEWMAP = GEN_COMMON_BASE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__DIAGRAM = GEN_COMMON_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__MODEL_FACET = GEN_COMMON_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__LABELS = GEN_COMMON_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__CHILD_CONTAINERS = GEN_COMMON_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__CHILD_NODES = GEN_COMMON_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Child Containers Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE__CHILD_CONTAINERS_PLACEMENT = GEN_COMMON_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the the '<em>Gen Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_FEATURE_COUNT = GEN_COMMON_BASE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildNodeImpl <em>Gen Child Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenChildNodeImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenChildNode()
	 * @generated
	 */
	int GEN_CHILD_NODE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl <em>Gen Child Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenChildContainerImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenChildContainer()
	 * @generated
	 */
	int GEN_CHILD_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Diagram Run Time Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__DIAGRAM_RUN_TIME_CLASS = GEN_COMMON_BASE__DIAGRAM_RUN_TIME_CLASS;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__VISUAL_ID = GEN_COMMON_BASE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Edit Part Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__EDIT_PART_CLASS_NAME = GEN_COMMON_BASE__EDIT_PART_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Notation View Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__NOTATION_VIEW_FACTORY_CLASS_NAME = GEN_COMMON_BASE__NOTATION_VIEW_FACTORY_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Viewmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__VIEWMAP = GEN_COMMON_BASE__VIEWMAP;

	/**
	 * The feature id for the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__GROUP_ID = GEN_COMMON_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__TITLE_KEY = GEN_COMMON_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Can Collapse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__CAN_COLLAPSE = GEN_COMMON_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hide If Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__HIDE_IF_EMPTY = GEN_COMMON_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Needs Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__NEEDS_TITLE = GEN_COMMON_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Layout Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__LAYOUT_KIND = GEN_COMMON_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER__PARENT_NODE = GEN_COMMON_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the the '<em>Gen Child Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_CONTAINER_FEATURE_COUNT = GEN_COMMON_BASE_FEATURE_COUNT + 7;

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
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__DIAGRAM = GEN_NODE__DIAGRAM;

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
	 * The feature id for the '<em><b>Child Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__CHILD_CONTAINERS = GEN_NODE__CHILD_CONTAINERS;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__CHILD_NODES = GEN_NODE__CHILD_NODES;

	/**
	 * The feature id for the '<em><b>Child Containers Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__CHILD_CONTAINERS_PLACEMENT = GEN_NODE__CHILD_CONTAINERS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__GROUP_ID = GEN_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE__PARENT_NODE = GEN_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Gen Child Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE_FEATURE_COUNT = GEN_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl <em>Gen Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenLink()
	 * @generated
	 */
	int GEN_LINK = 5;

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
	 * The number of structural features of the the '<em>Gen Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_FEATURE_COUNT = GEN_COMMON_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLabelImpl <em>Gen Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenLabelImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenLabel()
	 * @generated
	 */
	int GEN_LABEL = 6;

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
	 * The number of structural features of the the '<em>Gen Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL_FEATURE_COUNT = GEN_COMMON_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeLabelImpl <em>Gen Node Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenNodeLabelImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenNodeLabel()
	 * @generated
	 */
	int GEN_NODE_LABEL = 7;

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
	 * The number of structural features of the the '<em>Gen Node Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL_FEATURE_COUNT = GEN_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkLabelImpl <em>Gen Link Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GenLinkLabelImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getGenLinkLabel()
	 * @generated
	 */
	int GEN_LINK_LABEL = 8;

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
	 * The number of structural features of the the '<em>Gen Link Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL_FEATURE_COUNT = GEN_LABEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.ModelFacet <em>Model Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.ModelFacet
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getModelFacet()
	 * @generated
	 */
	int MODEL_FACET = 9;

	/**
	 * The number of structural features of the the '<em>Model Facet</em>' class.
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
	int LINK_MODEL_FACET = 10;

	/**
	 * The number of structural features of the the '<em>Link Model Facet</em>' class.
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
	int TYPE_MODEL_FACET = 11;

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
	 * The number of structural features of the the '<em>Type Model Facet</em>' class.
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
	int FEATURE_MODEL_FACET = 12;

	/**
	 * The feature id for the '<em><b>Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FACET__META_FEATURE = MODEL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Feature Model Facet</em>' class.
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
	int TYPE_LINK_MODEL_FACET = 13;

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
	 * The number of structural features of the the '<em>Type Link Model Facet</em>' class.
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
	int VIEWMAP = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.Attributes <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.Attributes
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 14;

	/**
	 * The number of structural features of the the '<em>Attributes</em>' class.
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
	int COLOR_ATTRIBUTES = 15;

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
	 * The number of structural features of the the '<em>Color Attributes</em>' class.
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
	int SHAPE_ATTRIBUTES = 16;

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
	 * The number of structural features of the the '<em>Shape Attributes</em>' class.
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
	int DEFAULT_SIZE_ATTRIBUTES = 17;

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
	 * The number of structural features of the the '<em>Default Size Attributes</em>' class.
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
	 * The number of structural features of the the '<em>Viewmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWMAP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.FigureViewmap <em>Figure Viewmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.FigureViewmap
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getFigureViewmap()
	 * @generated
	 */
	int FIGURE_VIEWMAP = 19;

	/**
	 * The number of structural features of the the '<em>Figure Viewmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_VIEWMAP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.BasicNodeViewmapImpl <em>Basic Node Viewmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.BasicNodeViewmapImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getBasicNodeViewmap()
	 * @generated
	 */
	int BASIC_NODE_VIEWMAP = 20;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE_VIEWMAP__ATTRIBUTES = VIEWMAP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Figure Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME = VIEWMAP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Basic Node Viewmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE_VIEWMAP_FEATURE_COUNT = VIEWMAP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.DecoratedConnectionViewmapImpl <em>Decorated Connection Viewmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.DecoratedConnectionViewmapImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getDecoratedConnectionViewmap()
	 * @generated
	 */
	int DECORATED_CONNECTION_VIEWMAP = 21;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED_CONNECTION_VIEWMAP__ATTRIBUTES = VIEWMAP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Figure Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED_CONNECTION_VIEWMAP__FIGURE_QUALIFIED_CLASS_NAME = VIEWMAP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED_CONNECTION_VIEWMAP__SOURCE = VIEWMAP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED_CONNECTION_VIEWMAP__TARGET = VIEWMAP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Decorated Connection Viewmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED_CONNECTION_VIEWMAP_FEATURE_COUNT = VIEWMAP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.LinkDecorationImpl <em>Link Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.LinkDecorationImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getLinkDecoration()
	 * @generated
	 */
	int LINK_DECORATION = 22;

	/**
	 * The feature id for the '<em><b>Figure Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DECORATION__FIGURE_QUALIFIED_CLASS_NAME = 0;

	/**
	 * The number of structural features of the the '<em>Link Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DECORATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl <em>Palette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.PaletteImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getPalette()
	 * @generated
	 */
	int PALETTE = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl <em>Entry Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.EntryBaseImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getEntryBase()
	 * @generated
	 */
	int ENTRY_BASE = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl <em>Tool Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ToolEntryImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getToolEntry()
	 * @generated
	 */
	int TOOL_ENTRY = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.NodeEntryImpl <em>Node Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.NodeEntryImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getNodeEntry()
	 * @generated
	 */
	int NODE_ENTRY = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.LinkEntryImpl <em>Link Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.LinkEntryImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getLinkEntry()
	 * @generated
	 */
	int LINK_ENTRY = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl <em>Tool Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ToolGroupImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getToolGroup()
	 * @generated
	 */
	int TOOL_GROUP = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.ValueExpressionImpl
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 23;

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
	 * The number of structural features of the the '<em>Value Expression</em>' class.
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
	int MODEL_ELEMENT_SELECTOR = 24;

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
	 * The number of structural features of the the '<em>Model Element Selector</em>' class.
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
	 * The number of structural features of the the '<em>Palette</em>' class.
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
	 * The number of structural features of the the '<em>Entry Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_BASE_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ENTRY__DEFAULT = ENTRY_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Tool Entry</em>' class.
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
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTRY__DEFAULT = TOOL_ENTRY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Gen Node</b></em>' reference.
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
	 * The number of structural features of the the '<em>Node Entry</em>' class.
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
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__DEFAULT = TOOL_ENTRY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Gen Link</b></em>' reference.
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
	 * The number of structural features of the the '<em>Link Entry</em>' class.
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
	 * The number of structural features of the the '<em>Tool Group</em>' class.
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
	int GEN_ELEMENT_INITIALIZER = 31;

	/**
	 * The feature id for the '<em><b>Type Model Facet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT_INITIALIZER__TYPE_MODEL_FACET = 0;

	/**
	 * The number of structural features of the the '<em>Gen Element Initializer</em>' class.
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
	int GEN_FEATURE_SEQ_INITIALIZER = 32;

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
	 * The number of structural features of the the '<em>Gen Feature Seq Initializer</em>' class.
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
	int GEN_FEATURE_VALUE_SPEC = 33;

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
	 * The number of structural features of the the '<em>Gen Feature Value Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_VALUE_SPEC_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind <em>Compartment Placement Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getCompartmentPlacementKind()
	 * @generated
	 */
	int COMPARTMENT_PLACEMENT_KIND = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind <em>Compartment Layout Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getCompartmentLayoutKind()
	 * @generated
	 */
	int COMPARTMENT_LAYOUT_KIND = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment <em>Link Label Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getLinkLabelAlignment()
	 * @generated
	 */
	int LINK_LABEL_ALIGNMENT = 36;

	/**
	 * The meta object id for the '<em>String Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.codegen.gmfgen.impl.GMFGenPackageImpl#getStringArray()
	 * @generated
	 */
	int STRING_ARRAY = 37;


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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getNodes()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EReference getGenDiagram_Nodes();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartsPackageName <em>Edit Parts Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Parts Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartsPackageName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_EditPartsPackageName();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginClassName <em>Plugin Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_PluginClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorPackageName <em>Editor Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorPackageName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_EditorPackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProvidersPackageName <em>Providers Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Providers Package Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProvidersPackageName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_ProvidersPackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorClassName <em>Editor Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_EditorClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDocumentProviderClassName <em>Document Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDocumentProviderClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_DocumentProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartFactoryClassName <em>Edit Part Factory Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Part Factory Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartFactoryClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_EditPartFactoryClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isHasDomainModel <em>Has Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Domain Model</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#isHasDomainModel()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_HasDomainModel();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getInitDiagramFileActionClassName <em>Init Diagram File Action Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Diagram File Action Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getInitDiagramFileActionClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_InitDiagramFileActionClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getActionBarContributorClassName <em>Action Bar Contributor Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Bar Contributor Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getActionBarContributorClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_ActionBarContributorClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMatchingStrategyClassName <em>Matching Strategy Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Strategy Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMatchingStrategyClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_MatchingStrategyClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getViewProviderClassName <em>View Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getViewProviderClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_ViewProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartProviderClassName <em>Edit Part Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Part Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartProviderClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_EditPartProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMetamodelSupportProviderClassName <em>Metamodel Support Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Support Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMetamodelSupportProviderClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_MetamodelSupportProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getModelingAssistantProviderClassName <em>Modeling Assistant Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modeling Assistant Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getModelingAssistantProviderClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_ModelingAssistantProviderClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getIconProviderClassName <em>Icon Provider Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Provider Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getIconProviderClassName()
	 * @see #getGenDiagram()
	 * @generated
	 */
	EAttribute getGenDiagram_IconProviderClassName();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenNode <em>Gen Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode
	 * @generated
	 */
	EClass getGenNode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getDiagram()
	 * @see #getGenNode()
	 * @generated
	 */
	EReference getGenNode_Diagram();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getChildContainers <em>Child Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Containers</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getChildContainers()
	 * @see #getGenNode()
	 * @generated
	 */
	EReference getGenNode_ChildContainers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Nodes</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getChildNodes()
	 * @see #getGenNode()
	 * @generated
	 */
	EReference getGenNode_ChildNodes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getChildContainersPlacement <em>Child Containers Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Child Containers Placement</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getChildContainersPlacement()
	 * @see #getGenNode()
	 * @generated
	 */
	EAttribute getGenNode_ChildContainersPlacement();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode <em>Gen Child Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Child Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildNode
	 * @generated
	 */
	EClass getGenChildNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getGroupID <em>Group ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildNode#getGroupID()
	 * @see #getGenChildNode()
	 * @generated
	 */
	EAttribute getGenChildNode_GroupID();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildNode#getParentNode()
	 * @see #getGenChildNode()
	 * @generated
	 */
	EReference getGenChildNode_ParentNode();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getGroupID <em>Group ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group ID</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getGroupID()
	 * @see #getGenChildContainer()
	 * @generated
	 */
	EAttribute getGenChildContainer_GroupID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getTitleKey <em>Title Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Key</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getTitleKey()
	 * @see #getGenChildContainer()
	 * @generated
	 */
	EAttribute getGenChildContainer_TitleKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isCanCollapse <em>Can Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Collapse</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isCanCollapse()
	 * @see #getGenChildContainer()
	 * @generated
	 */
	EAttribute getGenChildContainer_CanCollapse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isHideIfEmpty <em>Hide If Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide If Empty</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isHideIfEmpty()
	 * @see #getGenChildContainer()
	 * @generated
	 */
	EAttribute getGenChildContainer_HideIfEmpty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isNeedsTitle <em>Needs Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Title</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer#isNeedsTitle()
	 * @see #getGenChildContainer()
	 * @generated
	 */
	EAttribute getGenChildContainer_NeedsTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getLayoutKind <em>Layout Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Kind</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getLayoutKind()
	 * @see #getGenChildContainer()
	 * @generated
	 */
	EAttribute getGenChildContainer_LayoutKind();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Node</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer#getParentNode()
	 * @see #getGenChildContainer()
	 * @generated
	 */
	EReference getGenChildContainer_ParentNode();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap <em>Basic Node Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Node Viewmap</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap
	 * @generated
	 */
	EClass getBasicNodeViewmap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Figure Qualified Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap#getFigureQualifiedClassName()
	 * @see #getBasicNodeViewmap()
	 * @generated
	 */
	EAttribute getBasicNodeViewmap_FigureQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap <em>Decorated Connection Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decorated Connection Viewmap</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap
	 * @generated
	 */
	EClass getDecoratedConnectionViewmap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Figure Qualified Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap#getFigureQualifiedClassName()
	 * @see #getDecoratedConnectionViewmap()
	 * @generated
	 */
	EAttribute getDecoratedConnectionViewmap_FigureQualifiedClassName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap#getSource()
	 * @see #getDecoratedConnectionViewmap()
	 * @generated
	 */
	EReference getDecoratedConnectionViewmap_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap#getTarget()
	 * @see #getDecoratedConnectionViewmap()
	 * @generated
	 */
	EReference getDecoratedConnectionViewmap_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.codegen.gmfgen.LinkDecoration <em>Link Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Decoration</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkDecoration
	 * @generated
	 */
	EClass getLinkDecoration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.codegen.gmfgen.LinkDecoration#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Figure Qualified Class Name</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkDecoration#getFigureQualifiedClassName()
	 * @see #getLinkDecoration()
	 * @generated
	 */
	EAttribute getLinkDecoration_FigureQualifiedClassName();

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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.NodeEntry#getGenNode <em>Gen Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Node</em>'.
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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.codegen.gmfgen.LinkEntry#getGenLink <em>Gen Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Link</em>'.
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
	 * Returns the meta object for enum '{@link org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind <em>Compartment Placement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compartment Placement Kind</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CompartmentPlacementKind
	 * @generated
	 */
	EEnum getCompartmentPlacementKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind <em>Compartment Layout Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compartment Layout Kind</em>'.
	 * @see org.eclipse.gmf.codegen.gmfgen.CompartmentLayoutKind
	 * @generated
	 */
	EEnum getCompartmentLayoutKind();

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
	 * Returns the meta object for data type '<em>String Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Array</em>'.
	 * @model instanceClass="String[]"
	 * @generated
	 */
	EDataType getStringArray();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GMFGenFactory getGMFGenFactory();

} //GMFGenPackage