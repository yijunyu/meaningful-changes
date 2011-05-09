/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.gmf.mappings.GMFMapFactory
 * @model kind="package"
 * @generated
 */
public interface GMFMapPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mappings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmf/2005/mappings";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gmfmap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFMapPackage eINSTANCE = org.eclipse.gmf.mappings.impl.GMFMapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.AbstractNodeMappingImpl <em>Abstract Node Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.AbstractNodeMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getAbstractNodeMapping()
	 * @generated
	 */
	int ABSTRACT_NODE_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MAPPING__DOMAIN_META_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Domain Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MAPPING__DOMAIN_SPECIALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Domain Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MAPPING__DOMAIN_INITIALIZER = 2;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MAPPING__CONTAINMENT_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Edit Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MAPPING__EDIT_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Child Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MAPPING__CHILD_MAPPINGS = 5;

	/**
	 * The feature id for the '<em><b>Compartment Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MAPPING__COMPARTMENT_MAPPINGS = 6;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MAPPING__TOOL = 7;

	/**
	 * The number of structural features of the the '<em>Abstract Node Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MAPPING_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.MappingEntryImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getMappingEntry()
	 * @generated
	 */
	int MAPPING_ENTRY = 1;

	/**
	 * The number of structural features of the the '<em>Mapping Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.NodeMappingImpl <em>Node Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.NodeMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getNodeMapping()
	 * @generated
	 */
	int NODE_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DOMAIN_META_ELEMENT = ABSTRACT_NODE_MAPPING__DOMAIN_META_ELEMENT;

	/**
	 * The feature id for the '<em><b>Domain Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DOMAIN_SPECIALIZATION = ABSTRACT_NODE_MAPPING__DOMAIN_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Domain Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DOMAIN_INITIALIZER = ABSTRACT_NODE_MAPPING__DOMAIN_INITIALIZER;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__CONTAINMENT_FEATURE = ABSTRACT_NODE_MAPPING__CONTAINMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Edit Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__EDIT_FEATURE = ABSTRACT_NODE_MAPPING__EDIT_FEATURE;

	/**
	 * The feature id for the '<em><b>Child Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__CHILD_MAPPINGS = ABSTRACT_NODE_MAPPING__CHILD_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Compartment Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__COMPARTMENT_MAPPINGS = ABSTRACT_NODE_MAPPING__COMPARTMENT_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__TOOL = ABSTRACT_NODE_MAPPING__TOOL;

	/**
	 * The feature id for the '<em><b>Diagram Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DIAGRAM_NODE = ABSTRACT_NODE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Node Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_FEATURE_COUNT = ABSTRACT_NODE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.ChildNodeMappingImpl <em>Child Node Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.ChildNodeMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getChildNodeMapping()
	 * @generated
	 */
	int CHILD_NODE_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__DOMAIN_META_ELEMENT = ABSTRACT_NODE_MAPPING__DOMAIN_META_ELEMENT;

	/**
	 * The feature id for the '<em><b>Domain Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__DOMAIN_SPECIALIZATION = ABSTRACT_NODE_MAPPING__DOMAIN_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Domain Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__DOMAIN_INITIALIZER = ABSTRACT_NODE_MAPPING__DOMAIN_INITIALIZER;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__CONTAINMENT_FEATURE = ABSTRACT_NODE_MAPPING__CONTAINMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Edit Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__EDIT_FEATURE = ABSTRACT_NODE_MAPPING__EDIT_FEATURE;

	/**
	 * The feature id for the '<em><b>Child Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__CHILD_MAPPINGS = ABSTRACT_NODE_MAPPING__CHILD_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Compartment Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__COMPARTMENT_MAPPINGS = ABSTRACT_NODE_MAPPING__COMPARTMENT_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__TOOL = ABSTRACT_NODE_MAPPING__TOOL;

	/**
	 * The feature id for the '<em><b>Diagram Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__DIAGRAM_NODE = ABSTRACT_NODE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__COMPARTMENT = ABSTRACT_NODE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__PARENT_NODE = ABSTRACT_NODE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Child Node Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING_FEATURE_COUNT = ABSTRACT_NODE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.CompartmentMappingImpl <em>Compartment Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.CompartmentMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getCompartmentMapping()
	 * @generated
	 */
	int COMPARTMENT_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Parent Node Mapping</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_MAPPING__PARENT_NODE_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_MAPPING__COMPARTMENT = 1;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_MAPPING__CHILD_NODES = 2;

	/**
	 * The number of structural features of the the '<em>Compartment Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl <em>Link Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.LinkMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getLinkMapping()
	 * @generated
	 */
	int LINK_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Diagram Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__DIAGRAM_LINK = MAPPING_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__DOMAIN_META_ELEMENT = MAPPING_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__DOMAIN_SPECIALIZATION = MAPPING_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domain Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__DOMAIN_INITIALIZER = MAPPING_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__CONTAINMENT_FEATURE = MAPPING_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label Edit Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__LABEL_EDIT_FEATURE = MAPPING_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Label Display Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__LABEL_DISPLAY_FEATURE = MAPPING_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Link Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__LINK_META_FEATURE = MAPPING_ENTRY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Creation Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__CREATION_CONSTRAINTS = MAPPING_ENTRY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__TOOL = MAPPING_ENTRY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the the '<em>Link Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING_FEATURE_COUNT = MAPPING_ENTRY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.CanvasMappingImpl <em>Canvas Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.CanvasMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getCanvasMapping()
	 * @generated
	 */
	int CANVAS_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Diagram Canvas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_MAPPING__DIAGRAM_CANVAS = MAPPING_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_MAPPING__DOMAIN_MODEL = MAPPING_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_MAPPING__DOMAIN_META_ELEMENT = MAPPING_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Canvas Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_MAPPING_FEATURE_COUNT = MAPPING_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.MappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NODES = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__LINKS = 1;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Tool Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TOOL_GROUPS = 3;

	/**
	 * The number of structural features of the the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.ToolGroupImpl <em>Tool Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.ToolGroupImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getToolGroup()
	 * @generated
	 */
	int TOOL_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__TOOLS = 1;

	/**
	 * The number of structural features of the the '<em>Tool Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.Tool <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.Tool
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__GROUP = 0;

	/**
	 * The number of structural features of the the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.CreationToolImpl <em>Creation Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.CreationToolImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getCreationTool()
	 * @generated
	 */
	int CREATION_TOOL = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_TOOL__GROUP = TOOL__GROUP;

	/**
	 * The number of structural features of the the '<em>Creation Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_TOOL_FEATURE_COUNT = TOOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.NewActionToolImpl <em>New Action Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.NewActionToolImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getNewActionTool()
	 * @generated
	 */
	int NEW_ACTION_TOOL = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ACTION_TOOL__GROUP = TOOL__GROUP;

	/**
	 * The number of structural features of the the '<em>New Action Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ACTION_TOOL_FEATURE_COUNT = TOOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.ValueExpressionImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 14;

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
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.ConstraintImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BODY = VALUE_EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LANGUAGE = VALUE_EXPRESSION__LANGUAGE;

	/**
	 * The number of structural features of the the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.LinkConstraintsImpl <em>Link Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.LinkConstraintsImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getLinkConstraints()
	 * @generated
	 */
	int LINK_CONSTRAINTS = 13;

	/**
	 * The feature id for the '<em><b>Link Mapping</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINTS__LINK_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Source End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINTS__SOURCE_END = 1;

	/**
	 * The feature id for the '<em><b>Target End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINTS__TARGET_END = 2;

	/**
	 * The number of structural features of the the '<em>Link Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONSTRAINTS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.ElementInitializer <em>Element Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.ElementInitializer
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getElementInitializer()
	 * @generated
	 */
	int ELEMENT_INITIALIZER = 15;

	/**
	 * The number of structural features of the the '<em>Element Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INITIALIZER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl <em>Feature Seq Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getFeatureSeqInitializer()
	 * @generated
	 */
	int FEATURE_SEQ_INITIALIZER = 16;

	/**
	 * The feature id for the '<em><b>Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEQ_INITIALIZER__INITIALIZERS = ELEMENT_INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Feature Seq Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEQ_INITIALIZER_FEATURE_COUNT = ELEMENT_INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.FeatureValueSpecImpl <em>Feature Value Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.FeatureValueSpecImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getFeatureValueSpec()
	 * @generated
	 */
	int FEATURE_VALUE_SPEC = 17;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_SPEC__BODY = VALUE_EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_SPEC__LANGUAGE = VALUE_EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_SPEC__FEATURE = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Feature Value Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_SPEC_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.AbstractNodeMapping <em>Abstract Node Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.AbstractNodeMapping
	 * @generated
	 */
	EClass getAbstractNodeMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.AbstractNodeMapping#getDomainMetaElement <em>Domain Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Meta Element</em>'.
	 * @see org.eclipse.gmf.mappings.AbstractNodeMapping#getDomainMetaElement()
	 * @see #getAbstractNodeMapping()
	 * @generated
	 */
	EReference getAbstractNodeMapping_DomainMetaElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.AbstractNodeMapping#getDomainSpecialization <em>Domain Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Specialization</em>'.
	 * @see org.eclipse.gmf.mappings.AbstractNodeMapping#getDomainSpecialization()
	 * @see #getAbstractNodeMapping()
	 * @generated
	 */
	EReference getAbstractNodeMapping_DomainSpecialization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.AbstractNodeMapping#getDomainInitializer <em>Domain Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Initializer</em>'.
	 * @see org.eclipse.gmf.mappings.AbstractNodeMapping#getDomainInitializer()
	 * @see #getAbstractNodeMapping()
	 * @generated
	 */
	EReference getAbstractNodeMapping_DomainInitializer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.AbstractNodeMapping#getContainmentFeature <em>Containment Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containment Feature</em>'.
	 * @see org.eclipse.gmf.mappings.AbstractNodeMapping#getContainmentFeature()
	 * @see #getAbstractNodeMapping()
	 * @generated
	 */
	EReference getAbstractNodeMapping_ContainmentFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.AbstractNodeMapping#getEditFeature <em>Edit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edit Feature</em>'.
	 * @see org.eclipse.gmf.mappings.AbstractNodeMapping#getEditFeature()
	 * @see #getAbstractNodeMapping()
	 * @generated
	 */
	EReference getAbstractNodeMapping_EditFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.AbstractNodeMapping#getChildMappings <em>Child Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Mappings</em>'.
	 * @see org.eclipse.gmf.mappings.AbstractNodeMapping#getChildMappings()
	 * @see #getAbstractNodeMapping()
	 * @generated
	 */
	EReference getAbstractNodeMapping_ChildMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.AbstractNodeMapping#getCompartmentMappings <em>Compartment Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartment Mappings</em>'.
	 * @see org.eclipse.gmf.mappings.AbstractNodeMapping#getCompartmentMappings()
	 * @see #getAbstractNodeMapping()
	 * @generated
	 */
	EReference getAbstractNodeMapping_CompartmentMappings();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.AbstractNodeMapping#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tool</em>'.
	 * @see org.eclipse.gmf.mappings.AbstractNodeMapping#getTool()
	 * @see #getAbstractNodeMapping()
	 * @generated
	 */
	EReference getAbstractNodeMapping_Tool();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.MappingEntry <em>Mapping Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Entry</em>'.
	 * @see org.eclipse.gmf.mappings.MappingEntry
	 * @generated
	 */
	EClass getMappingEntry();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.NodeMapping <em>Node Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.NodeMapping
	 * @generated
	 */
	EClass getNodeMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.NodeMapping#getDiagramNode <em>Diagram Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Node</em>'.
	 * @see org.eclipse.gmf.mappings.NodeMapping#getDiagramNode()
	 * @see #getNodeMapping()
	 * @generated
	 */
	EReference getNodeMapping_DiagramNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.ChildNodeMapping <em>Child Node Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Node Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.ChildNodeMapping
	 * @generated
	 */
	EClass getChildNodeMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.ChildNodeMapping#getDiagramNode <em>Diagram Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Node</em>'.
	 * @see org.eclipse.gmf.mappings.ChildNodeMapping#getDiagramNode()
	 * @see #getChildNodeMapping()
	 * @generated
	 */
	EReference getChildNodeMapping_DiagramNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.ChildNodeMapping#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compartment</em>'.
	 * @see org.eclipse.gmf.mappings.ChildNodeMapping#getCompartment()
	 * @see #getChildNodeMapping()
	 * @generated
	 */
	EReference getChildNodeMapping_Compartment();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.mappings.ChildNodeMapping#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Node</em>'.
	 * @see org.eclipse.gmf.mappings.ChildNodeMapping#getParentNode()
	 * @see #getChildNodeMapping()
	 * @generated
	 */
	EReference getChildNodeMapping_ParentNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.CompartmentMapping <em>Compartment Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.CompartmentMapping
	 * @generated
	 */
	EClass getCompartmentMapping();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.mappings.CompartmentMapping#getParentNodeMapping <em>Parent Node Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Node Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.CompartmentMapping#getParentNodeMapping()
	 * @see #getCompartmentMapping()
	 * @generated
	 */
	EReference getCompartmentMapping_ParentNodeMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.CompartmentMapping#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compartment</em>'.
	 * @see org.eclipse.gmf.mappings.CompartmentMapping#getCompartment()
	 * @see #getCompartmentMapping()
	 * @generated
	 */
	EReference getCompartmentMapping_Compartment();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.mappings.CompartmentMapping#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Nodes</em>'.
	 * @see org.eclipse.gmf.mappings.CompartmentMapping#getChildNodes()
	 * @see #getCompartmentMapping()
	 * @generated
	 */
	EReference getCompartmentMapping_ChildNodes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.LinkMapping <em>Link Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping
	 * @generated
	 */
	EClass getLinkMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.LinkMapping#getDiagramLink <em>Diagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Link</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping#getDiagramLink()
	 * @see #getLinkMapping()
	 * @generated
	 */
	EReference getLinkMapping_DiagramLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.LinkMapping#getDomainMetaElement <em>Domain Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Meta Element</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping#getDomainMetaElement()
	 * @see #getLinkMapping()
	 * @generated
	 */
	EReference getLinkMapping_DomainMetaElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.LinkMapping#getDomainSpecialization <em>Domain Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Specialization</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping#getDomainSpecialization()
	 * @see #getLinkMapping()
	 * @generated
	 */
	EReference getLinkMapping_DomainSpecialization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.LinkMapping#getDomainInitializer <em>Domain Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Initializer</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping#getDomainInitializer()
	 * @see #getLinkMapping()
	 * @generated
	 */
	EReference getLinkMapping_DomainInitializer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.LinkMapping#getContainmentFeature <em>Containment Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containment Feature</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping#getContainmentFeature()
	 * @see #getLinkMapping()
	 * @generated
	 */
	EReference getLinkMapping_ContainmentFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.LinkMapping#getLabelEditFeature <em>Label Edit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label Edit Feature</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping#getLabelEditFeature()
	 * @see #getLinkMapping()
	 * @generated
	 */
	EReference getLinkMapping_LabelEditFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.LinkMapping#getLabelDisplayFeature <em>Label Display Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label Display Feature</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping#getLabelDisplayFeature()
	 * @see #getLinkMapping()
	 * @generated
	 */
	EReference getLinkMapping_LabelDisplayFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.LinkMapping#getLinkMetaFeature <em>Link Meta Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Meta Feature</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping#getLinkMetaFeature()
	 * @see #getLinkMapping()
	 * @generated
	 */
	EReference getLinkMapping_LinkMetaFeature();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.LinkMapping#getCreationConstraints <em>Creation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Constraints</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping#getCreationConstraints()
	 * @see #getLinkMapping()
	 * @generated
	 */
	EReference getLinkMapping_CreationConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.LinkMapping#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tool</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping#getTool()
	 * @see #getLinkMapping()
	 * @generated
	 */
	EReference getLinkMapping_Tool();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.CanvasMapping <em>Canvas Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.CanvasMapping
	 * @generated
	 */
	EClass getCanvasMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.CanvasMapping#getDiagramCanvas <em>Diagram Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Canvas</em>'.
	 * @see org.eclipse.gmf.mappings.CanvasMapping#getDiagramCanvas()
	 * @see #getCanvasMapping()
	 * @generated
	 */
	EReference getCanvasMapping_DiagramCanvas();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.CanvasMapping#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Model</em>'.
	 * @see org.eclipse.gmf.mappings.CanvasMapping#getDomainModel()
	 * @see #getCanvasMapping()
	 * @generated
	 */
	EReference getCanvasMapping_DomainModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.CanvasMapping#getDomainMetaElement <em>Domain Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Meta Element</em>'.
	 * @see org.eclipse.gmf.mappings.CanvasMapping#getDomainMetaElement()
	 * @see #getCanvasMapping()
	 * @generated
	 */
	EReference getCanvasMapping_DomainMetaElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.Mapping#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.eclipse.gmf.mappings.Mapping#getNodes()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.Mapping#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.eclipse.gmf.mappings.Mapping#getLinks()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Links();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.Mapping#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.mappings.Mapping#getDiagram()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Diagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.Mapping#getToolGroups <em>Tool Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool Groups</em>'.
	 * @see org.eclipse.gmf.mappings.Mapping#getToolGroups()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_ToolGroups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.ToolGroup <em>Tool Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Group</em>'.
	 * @see org.eclipse.gmf.mappings.ToolGroup
	 * @generated
	 */
	EClass getToolGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.ToolGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.mappings.ToolGroup#getName()
	 * @see #getToolGroup()
	 * @generated
	 */
	EAttribute getToolGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.mappings.ToolGroup#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tools</em>'.
	 * @see org.eclipse.gmf.mappings.ToolGroup#getTools()
	 * @see #getToolGroup()
	 * @generated
	 */
	EReference getToolGroup_Tools();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see org.eclipse.gmf.mappings.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.Tool#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see org.eclipse.gmf.mappings.Tool#getGroup()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Group();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.CreationTool <em>Creation Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Tool</em>'.
	 * @see org.eclipse.gmf.mappings.CreationTool
	 * @generated
	 */
	EClass getCreationTool();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.NewActionTool <em>New Action Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Action Tool</em>'.
	 * @see org.eclipse.gmf.mappings.NewActionTool
	 * @generated
	 */
	EClass getNewActionTool();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.eclipse.gmf.mappings.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.LinkConstraints <em>Link Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Constraints</em>'.
	 * @see org.eclipse.gmf.mappings.LinkConstraints
	 * @generated
	 */
	EClass getLinkConstraints();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.mappings.LinkConstraints#getLinkMapping <em>Link Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Link Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.LinkConstraints#getLinkMapping()
	 * @see #getLinkConstraints()
	 * @generated
	 */
	EReference getLinkConstraints_LinkMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.LinkConstraints#getSourceEnd <em>Source End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source End</em>'.
	 * @see org.eclipse.gmf.mappings.LinkConstraints#getSourceEnd()
	 * @see #getLinkConstraints()
	 * @generated
	 */
	EReference getLinkConstraints_SourceEnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.LinkConstraints#getTargetEnd <em>Target End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target End</em>'.
	 * @see org.eclipse.gmf.mappings.LinkConstraints#getTargetEnd()
	 * @see #getLinkConstraints()
	 * @generated
	 */
	EReference getLinkConstraints_TargetEnd();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.ValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Expression</em>'.
	 * @see org.eclipse.gmf.mappings.ValueExpression
	 * @generated
	 */
	EClass getValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.ValueExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.gmf.mappings.ValueExpression#getBody()
	 * @see #getValueExpression()
	 * @generated
	 */
	EAttribute getValueExpression_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.ValueExpression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.gmf.mappings.ValueExpression#getLanguage()
	 * @see #getValueExpression()
	 * @generated
	 */
	EAttribute getValueExpression_Language();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.ElementInitializer <em>Element Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Initializer</em>'.
	 * @see org.eclipse.gmf.mappings.ElementInitializer
	 * @generated
	 */
	EClass getElementInitializer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.FeatureSeqInitializer <em>Feature Seq Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Seq Initializer</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureSeqInitializer
	 * @generated
	 */
	EClass getFeatureSeqInitializer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.FeatureSeqInitializer#getInitializers <em>Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initializers</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureSeqInitializer#getInitializers()
	 * @see #getFeatureSeqInitializer()
	 * @generated
	 */
	EReference getFeatureSeqInitializer_Initializers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.FeatureValueSpec <em>Feature Value Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value Spec</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureValueSpec
	 * @generated
	 */
	EClass getFeatureValueSpec();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.FeatureValueSpec#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureValueSpec#getFeature()
	 * @see #getFeatureValueSpec()
	 * @generated
	 */
	EReference getFeatureValueSpec_Feature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GMFMapFactory getGMFMapFactory();

} //GMFMapPackage
