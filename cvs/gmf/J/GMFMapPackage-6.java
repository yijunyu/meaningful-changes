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
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.MappingEntryImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getMappingEntry()
	 * @generated
	 */
	int MAPPING_ENTRY = 0;

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
	int NODE_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Diagram Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DIAGRAM_NODE = MAPPING_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DOMAIN_META_ELEMENT = MAPPING_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DOMAIN_SPECIALIZATION = MAPPING_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domain Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__DOMAIN_INITIALIZER = MAPPING_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__CONTAINMENT_FEATURE = MAPPING_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Edit Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__EDIT_FEATURE = MAPPING_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Child Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__CHILD_MAPPINGS = MAPPING_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the the '<em>Node Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_FEATURE_COUNT = MAPPING_ENTRY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.ChildNodeMappingImpl <em>Child Node Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.ChildNodeMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getChildNodeMapping()
	 * @generated
	 */
	int CHILD_NODE_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__COMPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Diagram Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__DIAGRAM_NODE = 1;

	/**
	 * The feature id for the '<em><b>Domain Children Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__DOMAIN_CHILDREN_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Edit Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__EDIT_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__DOMAIN_META_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Domain Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__DOMAIN_SPECIALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Domain Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__DOMAIN_INITIALIZER = 6;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING__PARENT_NODE = 7;

	/**
	 * The number of structural features of the the '<em>Child Node Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_NODE_MAPPING_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.LinkMappingImpl <em>Link Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.LinkMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getLinkMapping()
	 * @generated
	 */
	int LINK_MAPPING = 3;

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
	 * The number of structural features of the the '<em>Link Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MAPPING_FEATURE_COUNT = MAPPING_ENTRY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.CanvasMappingImpl <em>Canvas Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.CanvasMappingImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getCanvasMapping()
	 * @generated
	 */
	int CANVAS_MAPPING = 4;

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
	int MAPPING = 5;

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
	 * The number of structural features of the the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.impl.ValueExpressionImpl
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 7;

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
	int CONSTRAINT = 6;

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
	 * The meta object id for the '{@link org.eclipse.gmf.mappings.ElementInitializer <em>Element Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.mappings.ElementInitializer
	 * @see org.eclipse.gmf.mappings.impl.GMFMapPackageImpl#getElementInitializer()
	 * @generated
	 */
	int ELEMENT_INITIALIZER = 8;

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
	int FEATURE_SEQ_INITIALIZER = 9;

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
	int FEATURE_VALUE_SPEC = 10;

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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.NodeMapping#getDomainMetaElement <em>Domain Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Meta Element</em>'.
	 * @see org.eclipse.gmf.mappings.NodeMapping#getDomainMetaElement()
	 * @see #getNodeMapping()
	 * @generated
	 */
	EReference getNodeMapping_DomainMetaElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.NodeMapping#getDomainSpecialization <em>Domain Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Specialization</em>'.
	 * @see org.eclipse.gmf.mappings.NodeMapping#getDomainSpecialization()
	 * @see #getNodeMapping()
	 * @generated
	 */
	EReference getNodeMapping_DomainSpecialization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.NodeMapping#getDomainInitializer <em>Domain Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Initializer</em>'.
	 * @see org.eclipse.gmf.mappings.NodeMapping#getDomainInitializer()
	 * @see #getNodeMapping()
	 * @generated
	 */
	EReference getNodeMapping_DomainInitializer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.NodeMapping#getContainmentFeature <em>Containment Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containment Feature</em>'.
	 * @see org.eclipse.gmf.mappings.NodeMapping#getContainmentFeature()
	 * @see #getNodeMapping()
	 * @generated
	 */
	EReference getNodeMapping_ContainmentFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.NodeMapping#getEditFeature <em>Edit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edit Feature</em>'.
	 * @see org.eclipse.gmf.mappings.NodeMapping#getEditFeature()
	 * @see #getNodeMapping()
	 * @generated
	 */
	EReference getNodeMapping_EditFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.mappings.NodeMapping#getChildMappings <em>Child Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Mappings</em>'.
	 * @see org.eclipse.gmf.mappings.NodeMapping#getChildMappings()
	 * @see #getNodeMapping()
	 * @generated
	 */
	EReference getNodeMapping_ChildMappings();

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
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.ChildNodeMapping#getDomainChildrenFeature <em>Domain Children Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Children Feature</em>'.
	 * @see org.eclipse.gmf.mappings.ChildNodeMapping#getDomainChildrenFeature()
	 * @see #getChildNodeMapping()
	 * @generated
	 */
	EReference getChildNodeMapping_DomainChildrenFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.ChildNodeMapping#getEditFeature <em>Edit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edit Feature</em>'.
	 * @see org.eclipse.gmf.mappings.ChildNodeMapping#getEditFeature()
	 * @see #getChildNodeMapping()
	 * @generated
	 */
	EReference getChildNodeMapping_EditFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.mappings.ChildNodeMapping#getDomainMetaElement <em>Domain Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Meta Element</em>'.
	 * @see org.eclipse.gmf.mappings.ChildNodeMapping#getDomainMetaElement()
	 * @see #getChildNodeMapping()
	 * @generated
	 */
	EReference getChildNodeMapping_DomainMetaElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.ChildNodeMapping#getDomainSpecialization <em>Domain Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Specialization</em>'.
	 * @see org.eclipse.gmf.mappings.ChildNodeMapping#getDomainSpecialization()
	 * @see #getChildNodeMapping()
	 * @generated
	 */
	EReference getChildNodeMapping_DomainSpecialization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.mappings.ChildNodeMapping#getDomainInitializer <em>Domain Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Initializer</em>'.
	 * @see org.eclipse.gmf.mappings.ChildNodeMapping#getDomainInitializer()
	 * @see #getChildNodeMapping()
	 * @generated
	 */
	EReference getChildNodeMapping_DomainInitializer();

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
	 * Returns the meta object for class '{@link org.eclipse.gmf.mappings.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.eclipse.gmf.mappings.Constraint
	 * @generated
	 */
	EClass getConstraint();

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
