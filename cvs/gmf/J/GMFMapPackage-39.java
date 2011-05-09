/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

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
 * @see org.eclipse.gmf.mappings.GMFMapFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2004/EmfaticAnnotationMap constraints='http://www.eclipse.org/gmf/2005/constraints' constraintsMeta='http://www.eclipse.org/gmf/2005/constraints/meta'"
 *        annotation="http://www.eclipse.org/gmf/2005/constraints import='http://www.eclipse.org/gmf/runtime/1.0.0/notation'"
 * @generated
 */
public interface GMFMapPackage extends EPackage {
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
	String eNS_URI = "http://www.eclipse.org/gmf/2006/mappings";

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
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.MappingEntryImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getMappingEntry()
	 * @generated
	 */
	int MAPPING_ENTRY = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.NodeMappingImpl <em>Node Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.NodeMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getNodeMapping()
	 * @generated
	 */
	int NODE_MAPPING = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.CompartmentMappingImpl <em>Compartment Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.CompartmentMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getCompartmentMapping()
	 * @generated
	 */
	int COMPARTMENT_MAPPING = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl <em>Link Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.LinkMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getLinkMapping()
	 * @generated
	 */
	int LINK_MAPPING = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.CanvasMappingImpl <em>Canvas Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.CanvasMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getCanvasMapping()
	 * @generated
	 */
	int CANVAS_MAPPING = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.MappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 0;

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
	 * The feature id for the '<em><b>Appearance Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__APPEARANCE_STYLES = 3;

	/**
	 * The feature id for the '<em><b>Audits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__AUDITS = 4;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__METRICS = 5;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 6;


	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__DOMAIN_META_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Domain Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__DOMAIN_SPECIALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Domain Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__DOMAIN_INITIALIZER = 2;

	/**
	 * The feature id for the '<em><b>Label Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__LABEL_MAPPINGS = 3;

	/**
	 * The feature id for the '<em><b>Related Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__RELATED_DIAGRAMS = 4;

	/**
	 * The number of structural features of the '<em>Mapping Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.NeedsContainment <em>Needs Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.NeedsContainment
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getNeedsContainment()
	 * @generated
	 */
	int NEEDS_CONTAINMENT = 2;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEEDS_CONTAINMENT__CONTAINMENT_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Needs Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEEDS_CONTAINMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.NodeReferenceImpl <em>Node Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.NodeReferenceImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getNodeReference()
	 * @generated
	 */
	int NODE_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REFERENCE__CONTAINMENT_FEATURE = NEEDS_CONTAINMENT__CONTAINMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Children Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REFERENCE__CHILDREN_FEATURE = NEEDS_CONTAINMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REFERENCE__CHILD = NEEDS_CONTAINMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REFERENCE_FEATURE_COUNT = NEEDS_CONTAINMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.ChildReferenceImpl <em>Child Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.ChildReferenceImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getChildReference()
	 * @generated
	 */
	int CHILD_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_REFERENCE__CONTAINMENT_FEATURE = NODE_REFERENCE__CONTAINMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Children Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_REFERENCE__CHILDREN_FEATURE = NODE_REFERENCE__CHILDREN_FEATURE;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_REFERENCE__CHILD = NODE_REFERENCE__CHILD;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_REFERENCE__PARENT_NODE = NODE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_REFERENCE__COMPARTMENT = NODE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_REFERENCE__OWNED_CHILD = NODE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referenced Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_REFERENCE__REFERENCED_CHILD = NODE_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Child Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_REFERENCE_FEATURE_COUNT = NODE_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.TopNodeReferenceImpl <em>Top Node Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.TopNodeReferenceImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getTopNodeReference()
	 * @generated
	 */
	int TOP_NODE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_NODE_REFERENCE__CONTAINMENT_FEATURE = NODE_REFERENCE__CONTAINMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Children Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_NODE_REFERENCE__CHILDREN_FEATURE = NODE_REFERENCE__CHILDREN_FEATURE;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_NODE_REFERENCE__CHILD = NODE_REFERENCE__CHILD;

	/**
	 * The feature id for the '<em><b>Owned Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_NODE_REFERENCE__OWNED_CHILD = NODE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Top Node Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_NODE_REFERENCE_FEATURE_COUNT = NODE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DOMAIN_META_ELEMENT = MAPPING_ENTRY__DOMAIN_META_ELEMENT;

	/**
	 * The feature id for the '<em><b>Domain Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DOMAIN_SPECIALIZATION = MAPPING_ENTRY__DOMAIN_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Domain Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DOMAIN_INITIALIZER = MAPPING_ENTRY__DOMAIN_INITIALIZER;

	/**
	 * The feature id for the '<em><b>Label Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__LABEL_MAPPINGS = MAPPING_ENTRY__LABEL_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Related Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__RELATED_DIAGRAMS = MAPPING_ENTRY__RELATED_DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Context Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__CONTEXT_MENU = MAPPING_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__TOOL = MAPPING_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Appearance Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__APPEARANCE_STYLE = MAPPING_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diagram Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DIAGRAM_NODE = MAPPING_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__CHILDREN = MAPPING_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__COMPARTMENTS = MAPPING_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Node Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_FEATURE_COUNT = MAPPING_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_MAPPING__COMPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_MAPPING__PARENT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_MAPPING__CHILDREN = 2;

	/**
	 * The number of structural features of the '<em>Compartment Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__DOMAIN_META_ELEMENT = MAPPING_ENTRY__DOMAIN_META_ELEMENT;

	/**
	 * The feature id for the '<em><b>Domain Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__DOMAIN_SPECIALIZATION = MAPPING_ENTRY__DOMAIN_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Domain Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__DOMAIN_INITIALIZER = MAPPING_ENTRY__DOMAIN_INITIALIZER;

	/**
	 * The feature id for the '<em><b>Label Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__LABEL_MAPPINGS = MAPPING_ENTRY__LABEL_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Related Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__RELATED_DIAGRAMS = MAPPING_ENTRY__RELATED_DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__CONTAINMENT_FEATURE = MAPPING_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__CONTEXT_MENU = MAPPING_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__TOOL = MAPPING_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Appearance Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__APPEARANCE_STYLE = MAPPING_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diagram Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__DIAGRAM_LINK = MAPPING_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__SOURCE_META_FEATURE = MAPPING_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Link Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__LINK_META_FEATURE = MAPPING_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Creation Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING__CREATION_CONSTRAINTS = MAPPING_ENTRY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Link Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING_FEATURE_COUNT = MAPPING_ENTRY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Diagram Canvas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_MAPPING__DIAGRAM_CANVAS = 0;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_MAPPING__DOMAIN_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_MAPPING__DOMAIN_META_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Palette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_MAPPING__PALETTE = 3;

	/**
	 * The feature id for the '<em><b>Menu Contributions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_MAPPING__MENU_CONTRIBUTIONS = 4;

	/**
	 * The feature id for the '<em><b>Toolbar Contributions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_MAPPING__TOOLBAR_CONTRIBUTIONS = 5;

	/**
	 * The number of structural features of the '<em>Canvas Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_MAPPING_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.LabelMappingImpl <em>Label Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.LabelMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getLabelMapping()
	 * @generated
	 */
	int LABEL_MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Diagram Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__DIAGRAM_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__READ_ONLY = 1;

	/**
	 * The feature id for the '<em><b>Map Entry</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__MAP_ENTRY = 2;

	/**
	 * The number of structural features of the '<em>Label Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.FeatureLabelMappingImpl <em>Feature Label Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.FeatureLabelMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getFeatureLabelMapping()
	 * @generated
	 */
	int FEATURE_LABEL_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Diagram Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MAPPING__DIAGRAM_LABEL = LABEL_MAPPING__DIAGRAM_LABEL;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MAPPING__READ_ONLY = LABEL_MAPPING__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Map Entry</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MAPPING__MAP_ENTRY = LABEL_MAPPING__MAP_ENTRY;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MAPPING__FEATURES = LABEL_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MAPPING__VIEW_PATTERN = LABEL_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Editor Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MAPPING__EDITOR_PATTERN = LABEL_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Edit Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MAPPING__EDIT_PATTERN = LABEL_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MAPPING__VIEW_METHOD = LABEL_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Edit Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MAPPING__EDIT_METHOD = LABEL_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Feature Label Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LABEL_MAPPING_FEATURE_COUNT = LABEL_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.DesignLabelMappingImpl <em>Design Label Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.DesignLabelMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getDesignLabelMapping()
	 * @generated
	 */
	int DESIGN_LABEL_MAPPING = 12;

	/**
	 * The feature id for the '<em><b>Diagram Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LABEL_MAPPING__DIAGRAM_LABEL = LABEL_MAPPING__DIAGRAM_LABEL;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LABEL_MAPPING__READ_ONLY = LABEL_MAPPING__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Map Entry</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LABEL_MAPPING__MAP_ENTRY = LABEL_MAPPING__MAP_ENTRY;

	/**
	 * The number of structural features of the '<em>Design Label Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LABEL_MAPPING_FEATURE_COUNT = LABEL_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.ValueExpressionImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 15;

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
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.ConstraintImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 13;

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
	 * The feature id for the '<em><b>Lang Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LANG_NAME = VALUE_EXPRESSION__LANG_NAME;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
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
	int LINK_CONSTRAINTS = 14;

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
	 * The number of structural features of the '<em>Link Constraints</em>' class.
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
	int ELEMENT_INITIALIZER = 16;

	/**
	 * The feature id for the '<em><b>Mapping Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INITIALIZER__MAPPING_ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Element Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INITIALIZER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl <em>Feature Seq Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.FeatureSeqInitializerImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getFeatureSeqInitializer()
	 * @generated
	 */
	int FEATURE_SEQ_INITIALIZER = 17;

	/**
	 * The feature id for the '<em><b>Mapping Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEQ_INITIALIZER__MAPPING_ENTRY = ELEMENT_INITIALIZER__MAPPING_ENTRY;

	/**
	 * The feature id for the '<em><b>Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEQ_INITIALIZER__INITIALIZERS = ELEMENT_INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEQ_INITIALIZER__ELEMENT_CLASS = ELEMENT_INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creating Initializer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEQ_INITIALIZER__CREATING_INITIALIZER = ELEMENT_INITIALIZER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Seq Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEQ_INITIALIZER_FEATURE_COUNT = ELEMENT_INITIALIZER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.FeatureInitializerImpl <em>Feature Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.FeatureInitializerImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getFeatureInitializer()
	 * @generated
	 */
	int FEATURE_INITIALIZER = 18;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INITIALIZER__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Feature Seq Initializer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INITIALIZER__FEATURE_SEQ_INITIALIZER = 1;

	/**
	 * The number of structural features of the '<em>Feature Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INITIALIZER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.FeatureValueSpecImpl <em>Feature Value Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.FeatureValueSpecImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getFeatureValueSpec()
	 * @generated
	 */
	int FEATURE_VALUE_SPEC = 19;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_SPEC__FEATURE = FEATURE_INITIALIZER__FEATURE;

	/**
	 * The feature id for the '<em><b>Feature Seq Initializer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_SPEC__FEATURE_SEQ_INITIALIZER = FEATURE_INITIALIZER__FEATURE_SEQ_INITIALIZER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_SPEC__VALUE = FEATURE_INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Value Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_SPEC_FEATURE_COUNT = FEATURE_INITIALIZER_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.ReferenceNewElementSpecImpl <em>Reference New Element Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.ReferenceNewElementSpecImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getReferenceNewElementSpec()
	 * @generated
	 */
	int REFERENCE_NEW_ELEMENT_SPEC = 20;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_NEW_ELEMENT_SPEC__FEATURE = FEATURE_INITIALIZER__FEATURE;

	/**
	 * The feature id for the '<em><b>Feature Seq Initializer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_NEW_ELEMENT_SPEC__FEATURE_SEQ_INITIALIZER = FEATURE_INITIALIZER__FEATURE_SEQ_INITIALIZER;

	/**
	 * The feature id for the '<em><b>New Element Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_NEW_ELEMENT_SPEC__NEW_ELEMENT_INITIALIZERS = FEATURE_INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference New Element Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_NEW_ELEMENT_SPEC_FEATURE_COUNT = FEATURE_INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.MenuOwner <em>Menu Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.MenuOwner
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getMenuOwner()
	 * @generated
	 */
	int MENU_OWNER = 21;

	/**
	 * The feature id for the '<em><b>Context Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OWNER__CONTEXT_MENU = 0;

	/**
	 * The number of structural features of the '<em>Menu Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OWNER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.ToolOwner <em>Tool Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.ToolOwner
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getToolOwner()
	 * @generated
	 */
	int TOOL_OWNER = 22;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OWNER__TOOL = 0;

	/**
	 * The number of structural features of the '<em>Tool Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OWNER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.AppearanceSteward <em>Appearance Steward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.AppearanceSteward
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getAppearanceSteward()
	 * @generated
	 */
	int APPEARANCE_STEWARD = 23;

	/**
	 * The feature id for the '<em><b>Appearance Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_STEWARD__APPEARANCE_STYLE = 0;

	/**
	 * The number of structural features of the '<em>Appearance Steward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_STEWARD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.AuditContainerImpl <em>Audit Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.AuditContainerImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getAuditContainer()
	 * @generated
	 */
	int AUDIT_CONTAINER = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_CONTAINER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_CONTAINER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_CONTAINER__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Parent Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_CONTAINER__PARENT_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Audits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_CONTAINER__AUDITS = 4;

	/**
	 * The feature id for the '<em><b>Child Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_CONTAINER__CHILD_CONTAINERS = 5;

	/**
	 * The number of structural features of the '<em>Audit Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_CONTAINER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.RuleBase <em>Rule Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.RuleBase
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getRuleBase()
	 * @generated
	 */
	int RULE_BASE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Rule Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.AuditRuleImpl <em>Audit Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.AuditRuleImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getAuditRule()
	 * @generated
	 */
	int AUDIT_RULE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_RULE__NAME = RULE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_RULE__DESCRIPTION = RULE_BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_RULE__ID = RULE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_RULE__RULE = RULE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_RULE__TARGET = RULE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_RULE__SEVERITY = RULE_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Use In Live Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_RULE__USE_IN_LIVE_MODE = RULE_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_RULE__MESSAGE = RULE_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_RULE__CONTAINER = RULE_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Audit Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_RULE_FEATURE_COUNT = RULE_BASE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.Auditable <em>Auditable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.Auditable
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getAuditable()
	 * @generated
	 */
	int AUDITABLE = 34;

	/**
	 * The number of structural features of the '<em>Auditable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.DomainElementTargetImpl <em>Domain Element Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.DomainElementTargetImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getDomainElementTarget()
	 * @generated
	 */
	int DOMAIN_ELEMENT_TARGET = 27;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_TARGET__ELEMENT = AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Element Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_TARGET_FEATURE_COUNT = AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.DomainAttributeTargetImpl <em>Domain Attribute Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.DomainAttributeTargetImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getDomainAttributeTarget()
	 * @generated
	 */
	int DOMAIN_ATTRIBUTE_TARGET = 28;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTRIBUTE_TARGET__ATTRIBUTE = AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Null As Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTRIBUTE_TARGET__NULL_AS_ERROR = AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Attribute Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ATTRIBUTE_TARGET_FEATURE_COUNT = AUDITABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.DiagramElementTargetImpl <em>Diagram Element Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.DiagramElementTargetImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getDiagramElementTarget()
	 * @generated
	 */
	int DIAGRAM_ELEMENT_TARGET = 29;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_TARGET__ELEMENT = AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Element Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_TARGET_FEATURE_COUNT = AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.NotationElementTargetImpl <em>Notation Element Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.NotationElementTargetImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getNotationElementTarget()
	 * @generated
	 */
	int NOTATION_ELEMENT_TARGET = 30;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_ELEMENT_TARGET__ELEMENT = AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Notation Element Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_ELEMENT_TARGET_FEATURE_COUNT = AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.MetricContainerImpl <em>Metric Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.MetricContainerImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getMetricContainer()
	 * @generated
	 */
	int METRIC_CONTAINER = 31;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTAINER__METRICS = 0;

	/**
	 * The number of structural features of the '<em>Metric Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.MetricRuleImpl <em>Metric Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.MetricRuleImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getMetricRule()
	 * @generated
	 */
	int METRIC_RULE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_RULE__NAME = RULE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_RULE__DESCRIPTION = RULE_BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_RULE__KEY = RULE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_RULE__RULE = RULE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_RULE__TARGET = RULE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_RULE__LOW_LIMIT = RULE_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>High Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_RULE__HIGH_LIMIT = RULE_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_RULE__CONTAINER = RULE_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Metric Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_RULE_FEATURE_COUNT = RULE_BASE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.AuditedMetricTargetImpl <em>Audited Metric Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.AuditedMetricTargetImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getAuditedMetricTarget()
	 * @generated
	 */
	int AUDITED_METRIC_TARGET = 33;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITED_METRIC_TARGET__METRIC = AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Audited Metric Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITED_METRIC_TARGET_FEATURE_COUNT = AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.Measurable <em>Measurable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.Measurable
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getMeasurable()
	 * @generated
	 */
	int MEASURABLE = 35;

	/**
	 * The number of structural features of the '<em>Measurable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.LabelTextAccessMethod <em>Label Text Access Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.LabelTextAccessMethod
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getLabelTextAccessMethod()
	 * @generated
	 */
	int LABEL_TEXT_ACCESS_METHOD = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.Severity
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 37;


	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.Language
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 38;


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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.MappingEntry#getDomainMetaElement <em>Domain Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Meta Element</em>'.
	 * @see org.eclipse.gmf.mappings.MappingEntry#getDomainMetaElement()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EReference getMappingEntry_DomainMetaElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.MappingEntry#getDomainSpecialization <em>Domain Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Specialization</em>'.
	 * @see org.eclipse.gmf.mappings.MappingEntry#getDomainSpecialization()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EReference getMappingEntry_DomainSpecialization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.MappingEntry#getDomainInitializer <em>Domain Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Initializer</em>'.
	 * @see org.eclipse.gmf.mappings.MappingEntry#getDomainInitializer()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EReference getMappingEntry_DomainInitializer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.MappingEntry#getLabelMappings <em>Label Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Mappings</em>'.
	 * @see org.eclipse.gmf.mappings.MappingEntry#getLabelMappings()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EReference getMappingEntry_LabelMappings();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.mappings.MappingEntry#getRelatedDiagrams <em>Related Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Diagrams</em>'.
	 * @see org.eclipse.gmf.mappings.MappingEntry#getRelatedDiagrams()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EReference getMappingEntry_RelatedDiagrams();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.NeedsContainment <em>Needs Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Needs Containment</em>'.
	 * @see org.eclipse.gmf.mappings.NeedsContainment
	 * @generated
	 */
	EClass getNeedsContainment();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.NeedsContainment#getContainmentFeature <em>Containment Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containment Feature</em>'.
	 * @see org.eclipse.gmf.mappings.NeedsContainment#getContainmentFeature()
	 * @see #getNeedsContainment()
	 * @generated
	 */
	EReference getNeedsContainment_ContainmentFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.NodeReference <em>Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Reference</em>'.
	 * @see org.eclipse.gmf.mappings.NodeReference
	 * @generated
	 */
	EClass getNodeReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.NodeReference#getChildrenFeature <em>Children Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Children Feature</em>'.
	 * @see org.eclipse.gmf.mappings.NodeReference#getChildrenFeature()
	 * @see #getNodeReference()
	 * @generated
	 */
	EReference getNodeReference_ChildrenFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.NodeReference#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see org.eclipse.gmf.mappings.NodeReference#getChild()
	 * @see #getNodeReference()
	 * @generated
	 */
	EReference getNodeReference_Child();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.ChildReference <em>Child Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Reference</em>'.
	 * @see org.eclipse.gmf.mappings.ChildReference
	 * @generated
	 */
	EClass getChildReference();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.mappings.ChildReference#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Node</em>'.
	 * @see org.eclipse.gmf.mappings.ChildReference#getParentNode()
	 * @see #getChildReference()
	 * @generated
	 */
	EReference getChildReference_ParentNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.ChildReference#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compartment</em>'.
	 * @see org.eclipse.gmf.mappings.ChildReference#getCompartment()
	 * @see #getChildReference()
	 * @generated
	 */
	EReference getChildReference_Compartment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.ChildReference#getOwnedChild <em>Owned Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Child</em>'.
	 * @see org.eclipse.gmf.mappings.ChildReference#getOwnedChild()
	 * @see #getChildReference()
	 * @generated
	 */
	EReference getChildReference_OwnedChild();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.ChildReference#getReferencedChild <em>Referenced Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Child</em>'.
	 * @see org.eclipse.gmf.mappings.ChildReference#getReferencedChild()
	 * @see #getChildReference()
	 * @generated
	 */
	EReference getChildReference_ReferencedChild();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.TopNodeReference <em>Top Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Node Reference</em>'.
	 * @see org.eclipse.gmf.mappings.TopNodeReference
	 * @generated
	 */
	EClass getTopNodeReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.TopNodeReference#getOwnedChild <em>Owned Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Child</em>'.
	 * @see org.eclipse.gmf.mappings.TopNodeReference#getOwnedChild()
	 * @see #getTopNodeReference()
	 * @generated
	 */
	EReference getTopNodeReference_OwnedChild();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.NodeMapping#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.gmf.mappings.NodeMapping#getChildren()
	 * @see #getNodeMapping()
	 * @generated
	 */
	EReference getNodeMapping_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.NodeMapping#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartments</em>'.
	 * @see org.eclipse.gmf.mappings.NodeMapping#getCompartments()
	 * @see #getNodeMapping()
	 * @generated
	 */
	EReference getNodeMapping_Compartments();

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
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.mappings.CompartmentMapping#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Node</em>'.
	 * @see org.eclipse.gmf.mappings.CompartmentMapping#getParentNode()
	 * @see #getCompartmentMapping()
	 * @generated
	 */
	EReference getCompartmentMapping_ParentNode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.mappings.CompartmentMapping#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.eclipse.gmf.mappings.CompartmentMapping#getChildren()
	 * @see #getCompartmentMapping()
	 * @generated
	 */
	EReference getCompartmentMapping_Children();

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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.LinkMapping#getSourceMetaFeature <em>Source Meta Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Meta Feature</em>'.
	 * @see org.eclipse.gmf.mappings.LinkMapping#getSourceMetaFeature()
	 * @see #getLinkMapping()
	 * @generated
	 */
	EReference getLinkMapping_SourceMetaFeature();

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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.CanvasMapping#getPalette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palette</em>'.
	 * @see org.eclipse.gmf.mappings.CanvasMapping#getPalette()
	 * @see #getCanvasMapping()
	 * @generated
	 */
	EReference getCanvasMapping_Palette();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.mappings.CanvasMapping#getMenuContributions <em>Menu Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Menu Contributions</em>'.
	 * @see org.eclipse.gmf.mappings.CanvasMapping#getMenuContributions()
	 * @see #getCanvasMapping()
	 * @generated
	 */
	EReference getCanvasMapping_MenuContributions();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.mappings.CanvasMapping#getToolbarContributions <em>Toolbar Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Toolbar Contributions</em>'.
	 * @see org.eclipse.gmf.mappings.CanvasMapping#getToolbarContributions()
	 * @see #getCanvasMapping()
	 * @generated
	 */
	EReference getCanvasMapping_ToolbarContributions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.LabelMapping <em>Label Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.LabelMapping
	 * @generated
	 */
	EClass getLabelMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.LabelMapping#getDiagramLabel <em>Diagram Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Label</em>'.
	 * @see org.eclipse.gmf.mappings.LabelMapping#getDiagramLabel()
	 * @see #getLabelMapping()
	 * @generated
	 */
	EReference getLabelMapping_DiagramLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.LabelMapping#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.eclipse.gmf.mappings.LabelMapping#isReadOnly()
	 * @see #getLabelMapping()
	 * @generated
	 */
	EAttribute getLabelMapping_ReadOnly();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.mappings.LabelMapping#getMapEntry <em>Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Map Entry</em>'.
	 * @see org.eclipse.gmf.mappings.LabelMapping#getMapEntry()
	 * @see #getLabelMapping()
	 * @generated
	 */
	EReference getLabelMapping_MapEntry();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.FeatureLabelMapping <em>Feature Label Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Label Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureLabelMapping
	 * @generated
	 */
	EClass getFeatureLabelMapping();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.mappings.FeatureLabelMapping#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureLabelMapping#getFeatures()
	 * @see #getFeatureLabelMapping()
	 * @generated
	 */
	EReference getFeatureLabelMapping_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.FeatureLabelMapping#getViewPattern <em>View Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Pattern</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureLabelMapping#getViewPattern()
	 * @see #getFeatureLabelMapping()
	 * @generated
	 */
	EAttribute getFeatureLabelMapping_ViewPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.FeatureLabelMapping#getEditorPattern <em>Editor Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor Pattern</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureLabelMapping#getEditorPattern()
	 * @see #getFeatureLabelMapping()
	 * @generated
	 */
	EAttribute getFeatureLabelMapping_EditorPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.FeatureLabelMapping#getViewMethod <em>View Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Method</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureLabelMapping#getViewMethod()
	 * @see #getFeatureLabelMapping()
	 * @generated
	 */
	EAttribute getFeatureLabelMapping_ViewMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.FeatureLabelMapping#getEditPattern <em>Edit Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Pattern</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureLabelMapping#getEditPattern()
	 * @see #getFeatureLabelMapping()
	 * @generated
	 */
	EAttribute getFeatureLabelMapping_EditPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.FeatureLabelMapping#getEditMethod <em>Edit Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Method</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureLabelMapping#getEditMethod()
	 * @see #getFeatureLabelMapping()
	 * @generated
	 */
	EAttribute getFeatureLabelMapping_EditMethod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.DesignLabelMapping <em>Design Label Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Label Mapping</em>'.
	 * @see org.eclipse.gmf.mappings.DesignLabelMapping
	 * @generated
	 */
	EClass getDesignLabelMapping();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.Mapping#getAppearanceStyles <em>Appearance Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appearance Styles</em>'.
	 * @see org.eclipse.gmf.mappings.Mapping#getAppearanceStyles()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_AppearanceStyles();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.Mapping#getAudits <em>Audits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audits</em>'.
	 * @see org.eclipse.gmf.mappings.Mapping#getAudits()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Audits();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.Mapping#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metrics</em>'.
	 * @see org.eclipse.gmf.mappings.Mapping#getMetrics()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Metrics();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.ValueExpression#getLangName <em>Lang Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Name</em>'.
	 * @see org.eclipse.gmf.mappings.ValueExpression#getLangName()
	 * @see #getValueExpression()
	 * @generated
	 */
	EAttribute getValueExpression_LangName();

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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.ElementInitializer#getMappingEntry <em>Mapping Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping Entry</em>'.
	 * @see org.eclipse.gmf.mappings.ElementInitializer#getMappingEntry()
	 * @see #getElementInitializer()
	 * @generated
	 */
	EReference getElementInitializer_MappingEntry();

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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.FeatureSeqInitializer#getElementClass <em>Element Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Class</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureSeqInitializer#getElementClass()
	 * @see #getFeatureSeqInitializer()
	 * @generated
	 */
	EReference getFeatureSeqInitializer_ElementClass();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.mappings.FeatureSeqInitializer#getCreatingInitializer <em>Creating Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Creating Initializer</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureSeqInitializer#getCreatingInitializer()
	 * @see #getFeatureSeqInitializer()
	 * @generated
	 */
	EReference getFeatureSeqInitializer_CreatingInitializer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.FeatureInitializer <em>Feature Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Initializer</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureInitializer
	 * @generated
	 */
	EClass getFeatureInitializer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.FeatureInitializer#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureInitializer#getFeature()
	 * @see #getFeatureInitializer()
	 * @generated
	 */
	EReference getFeatureInitializer_Feature();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.mappings.FeatureInitializer#getFeatureSeqInitializer <em>Feature Seq Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature Seq Initializer</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureInitializer#getFeatureSeqInitializer()
	 * @see #getFeatureInitializer()
	 * @generated
	 */
	EReference getFeatureInitializer_FeatureSeqInitializer();

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
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.FeatureValueSpec#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.gmf.mappings.FeatureValueSpec#getValue()
	 * @see #getFeatureValueSpec()
	 * @generated
	 */
	EReference getFeatureValueSpec_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.ReferenceNewElementSpec <em>Reference New Element Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference New Element Spec</em>'.
	 * @see org.eclipse.gmf.mappings.ReferenceNewElementSpec
	 * @generated
	 */
	EClass getReferenceNewElementSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.ReferenceNewElementSpec#getNewElementInitializers <em>New Element Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Element Initializers</em>'.
	 * @see org.eclipse.gmf.mappings.ReferenceNewElementSpec#getNewElementInitializers()
	 * @see #getReferenceNewElementSpec()
	 * @generated
	 */
	EReference getReferenceNewElementSpec_NewElementInitializers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.MenuOwner <em>Menu Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Owner</em>'.
	 * @see org.eclipse.gmf.mappings.MenuOwner
	 * @generated
	 */
	EClass getMenuOwner();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.MenuOwner#getContextMenu <em>Context Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Menu</em>'.
	 * @see org.eclipse.gmf.mappings.MenuOwner#getContextMenu()
	 * @see #getMenuOwner()
	 * @generated
	 */
	EReference getMenuOwner_ContextMenu();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.ToolOwner <em>Tool Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Owner</em>'.
	 * @see org.eclipse.gmf.mappings.ToolOwner
	 * @generated
	 */
	EClass getToolOwner();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.ToolOwner#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool</em>'.
	 * @see org.eclipse.gmf.mappings.ToolOwner#getTool()
	 * @see #getToolOwner()
	 * @generated
	 */
	EReference getToolOwner_Tool();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.AppearanceSteward <em>Appearance Steward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appearance Steward</em>'.
	 * @see org.eclipse.gmf.mappings.AppearanceSteward
	 * @generated
	 */
	EClass getAppearanceSteward();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.AppearanceSteward#getAppearanceStyle <em>Appearance Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Appearance Style</em>'.
	 * @see org.eclipse.gmf.mappings.AppearanceSteward#getAppearanceStyle()
	 * @see #getAppearanceSteward()
	 * @generated
	 */
	EReference getAppearanceSteward_AppearanceStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.AuditContainer <em>Audit Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audit Container</em>'.
	 * @see org.eclipse.gmf.mappings.AuditContainer
	 * @generated
	 */
	EClass getAuditContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.AuditContainer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.gmf.mappings.AuditContainer#getId()
	 * @see #getAuditContainer()
	 * @generated
	 */
	EAttribute getAuditContainer_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.AuditContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.mappings.AuditContainer#getName()
	 * @see #getAuditContainer()
	 * @generated
	 */
	EAttribute getAuditContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.AuditContainer#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.gmf.mappings.AuditContainer#getDescription()
	 * @see #getAuditContainer()
	 * @generated
	 */
	EAttribute getAuditContainer_Description();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.mappings.AuditContainer#getParentContainer <em>Parent Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Container</em>'.
	 * @see org.eclipse.gmf.mappings.AuditContainer#getParentContainer()
	 * @see #getAuditContainer()
	 * @generated
	 */
	EReference getAuditContainer_ParentContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.AuditContainer#getAudits <em>Audits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audits</em>'.
	 * @see org.eclipse.gmf.mappings.AuditContainer#getAudits()
	 * @see #getAuditContainer()
	 * @generated
	 */
	EReference getAuditContainer_Audits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.AuditContainer#getChildContainers <em>Child Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Containers</em>'.
	 * @see org.eclipse.gmf.mappings.AuditContainer#getChildContainers()
	 * @see #getAuditContainer()
	 * @generated
	 */
	EReference getAuditContainer_ChildContainers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.AuditRule <em>Audit Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audit Rule</em>'.
	 * @see org.eclipse.gmf.mappings.AuditRule
	 * @generated
	 */
	EClass getAuditRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.AuditRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.gmf.mappings.AuditRule#getId()
	 * @see #getAuditRule()
	 * @generated
	 */
	EAttribute getAuditRule_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.AuditRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.eclipse.gmf.mappings.AuditRule#getRule()
	 * @see #getAuditRule()
	 * @generated
	 */
	EReference getAuditRule_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.AuditRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.gmf.mappings.AuditRule#getTarget()
	 * @see #getAuditRule()
	 * @generated
	 */
	EReference getAuditRule_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.AuditRule#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.gmf.mappings.AuditRule#getSeverity()
	 * @see #getAuditRule()
	 * @generated
	 */
	EAttribute getAuditRule_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.AuditRule#isUseInLiveMode <em>Use In Live Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use In Live Mode</em>'.
	 * @see org.eclipse.gmf.mappings.AuditRule#isUseInLiveMode()
	 * @see #getAuditRule()
	 * @generated
	 */
	EAttribute getAuditRule_UseInLiveMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.AuditRule#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.gmf.mappings.AuditRule#getMessage()
	 * @see #getAuditRule()
	 * @generated
	 */
	EAttribute getAuditRule_Message();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.mappings.AuditRule#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.gmf.mappings.AuditRule#getContainer()
	 * @see #getAuditRule()
	 * @generated
	 */
	EReference getAuditRule_Container();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.RuleBase <em>Rule Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Base</em>'.
	 * @see org.eclipse.gmf.mappings.RuleBase
	 * @generated
	 */
	EClass getRuleBase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.RuleBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.mappings.RuleBase#getName()
	 * @see #getRuleBase()
	 * @generated
	 */
	EAttribute getRuleBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.RuleBase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.gmf.mappings.RuleBase#getDescription()
	 * @see #getRuleBase()
	 * @generated
	 */
	EAttribute getRuleBase_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.DomainElementTarget <em>Domain Element Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Element Target</em>'.
	 * @see org.eclipse.gmf.mappings.DomainElementTarget
	 * @generated
	 */
	EClass getDomainElementTarget();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.DomainElementTarget#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.gmf.mappings.DomainElementTarget#getElement()
	 * @see #getDomainElementTarget()
	 * @generated
	 */
	EReference getDomainElementTarget_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.DomainAttributeTarget <em>Domain Attribute Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Attribute Target</em>'.
	 * @see org.eclipse.gmf.mappings.DomainAttributeTarget
	 * @generated
	 */
	EClass getDomainAttributeTarget();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.DomainAttributeTarget#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.eclipse.gmf.mappings.DomainAttributeTarget#getAttribute()
	 * @see #getDomainAttributeTarget()
	 * @generated
	 */
	EReference getDomainAttributeTarget_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.DomainAttributeTarget#isNullAsError <em>Null As Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null As Error</em>'.
	 * @see org.eclipse.gmf.mappings.DomainAttributeTarget#isNullAsError()
	 * @see #getDomainAttributeTarget()
	 * @generated
	 */
	EAttribute getDomainAttributeTarget_NullAsError();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.DiagramElementTarget <em>Diagram Element Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element Target</em>'.
	 * @see org.eclipse.gmf.mappings.DiagramElementTarget
	 * @generated
	 */
	EClass getDiagramElementTarget();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.DiagramElementTarget#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.gmf.mappings.DiagramElementTarget#getElement()
	 * @see #getDiagramElementTarget()
	 * @generated
	 */
	EReference getDiagramElementTarget_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.NotationElementTarget <em>Notation Element Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notation Element Target</em>'.
	 * @see org.eclipse.gmf.mappings.NotationElementTarget
	 * @generated
	 */
	EClass getNotationElementTarget();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.NotationElementTarget#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.gmf.mappings.NotationElementTarget#getElement()
	 * @see #getNotationElementTarget()
	 * @generated
	 */
	EReference getNotationElementTarget_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.MetricContainer <em>Metric Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Container</em>'.
	 * @see org.eclipse.gmf.mappings.MetricContainer
	 * @generated
	 */
	EClass getMetricContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.MetricContainer#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see org.eclipse.gmf.mappings.MetricContainer#getMetrics()
	 * @see #getMetricContainer()
	 * @generated
	 */
	EReference getMetricContainer_Metrics();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.MetricRule <em>Metric Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Rule</em>'.
	 * @see org.eclipse.gmf.mappings.MetricRule
	 * @generated
	 */
	EClass getMetricRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.MetricRule#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.gmf.mappings.MetricRule#getKey()
	 * @see #getMetricRule()
	 * @generated
	 */
	EAttribute getMetricRule_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.MetricRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.eclipse.gmf.mappings.MetricRule#getRule()
	 * @see #getMetricRule()
	 * @generated
	 */
	EReference getMetricRule_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.MetricRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.gmf.mappings.MetricRule#getTarget()
	 * @see #getMetricRule()
	 * @generated
	 */
	EReference getMetricRule_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.MetricRule#getLowLimit <em>Low Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Limit</em>'.
	 * @see org.eclipse.gmf.mappings.MetricRule#getLowLimit()
	 * @see #getMetricRule()
	 * @generated
	 */
	EAttribute getMetricRule_LowLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.mappings.MetricRule#getHighLimit <em>High Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Limit</em>'.
	 * @see org.eclipse.gmf.mappings.MetricRule#getHighLimit()
	 * @see #getMetricRule()
	 * @generated
	 */
	EAttribute getMetricRule_HighLimit();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.mappings.MetricRule#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.gmf.mappings.MetricRule#getContainer()
	 * @see #getMetricRule()
	 * @generated
	 */
	EReference getMetricRule_Container();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.AuditedMetricTarget <em>Audited Metric Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audited Metric Target</em>'.
	 * @see org.eclipse.gmf.mappings.AuditedMetricTarget
	 * @generated
	 */
	EClass getAuditedMetricTarget();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.AuditedMetricTarget#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see org.eclipse.gmf.mappings.AuditedMetricTarget#getMetric()
	 * @see #getAuditedMetricTarget()
	 * @generated
	 */
	EReference getAuditedMetricTarget_Metric();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.Auditable <em>Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditable</em>'.
	 * @see org.eclipse.gmf.mappings.Auditable
	 * @generated
	 */
	EClass getAuditable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.Measurable <em>Measurable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurable</em>'.
	 * @see org.eclipse.gmf.mappings.Measurable
	 * @generated
	 */
	EClass getMeasurable();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.mappings.LabelTextAccessMethod <em>Label Text Access Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Text Access Method</em>'.
	 * @see org.eclipse.gmf.mappings.LabelTextAccessMethod
	 * @generated
	 */
	EEnum getLabelTextAccessMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.mappings.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see org.eclipse.gmf.mappings.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.mappings.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see org.eclipse.gmf.mappings.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GMFMapFactory getGMFMapFactory();

} //GMFMapPackage
