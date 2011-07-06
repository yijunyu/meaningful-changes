/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.internal.bridge.trace;

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
 * @see org.eclipse.gmf.internal.bridge.trace.TraceFactory
 * @model kind="package"
 * @generated
 */
public interface TracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmf/2006/Trace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracePackage eINSTANCE = org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.TraceModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.TraceModelImpl
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getTraceModel()
	 * @generated
	 */
	int TRACE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Node Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL__NODE_TRACES = 0;

	/**
	 * The feature id for the '<em><b>Child Node Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL__CHILD_NODE_TRACES = 1;

	/**
	 * The feature id for the '<em><b>Link Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL__LINK_TRACES = 2;

	/**
	 * The feature id for the '<em><b>Tool Group Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL__TOOL_GROUP_TRACES = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.AbstractTraceImpl <em>Abstract Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.AbstractTraceImpl
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getAbstractTrace()
	 * @generated
	 */
	int ABSTRACT_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRACE__VISUAL_ID = 0;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRACE__PROCESSED = 1;

	/**
	 * The number of structural features of the '<em>Abstract Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.MatchingTraceImpl <em>Matching Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.MatchingTraceImpl
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getMatchingTrace()
	 * @generated
	 */
	int MATCHING_TRACE = 2;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_TRACE__VISUAL_ID = ABSTRACT_TRACE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_TRACE__PROCESSED = ABSTRACT_TRACE__PROCESSED;

	/**
	 * The feature id for the '<em><b>Query Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_TRACE__QUERY_TEXT = ABSTRACT_TRACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Matching Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_TRACE_FEATURE_COUNT = ABSTRACT_TRACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenNodeTraceImpl <em>Gen Node Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenNodeTraceImpl
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenNodeTrace()
	 * @generated
	 */
	int GEN_NODE_TRACE = 3;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_TRACE__VISUAL_ID = MATCHING_TRACE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_TRACE__PROCESSED = MATCHING_TRACE__PROCESSED;

	/**
	 * The feature id for the '<em><b>Query Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_TRACE__QUERY_TEXT = MATCHING_TRACE__QUERY_TEXT;

	/**
	 * The feature id for the '<em><b>Node Label Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_TRACE__NODE_LABEL_TRACES = MATCHING_TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compartment Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_TRACE__COMPARTMENT_TRACES = MATCHING_TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Node Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_TRACE_FEATURE_COUNT = MATCHING_TRACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenChildNodeTraceImpl <em>Gen Child Node Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenChildNodeTraceImpl
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenChildNodeTrace()
	 * @generated
	 */
	int GEN_CHILD_NODE_TRACE = 4;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE_TRACE__VISUAL_ID = GEN_NODE_TRACE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE_TRACE__PROCESSED = GEN_NODE_TRACE__PROCESSED;

	/**
	 * The feature id for the '<em><b>Query Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE_TRACE__QUERY_TEXT = GEN_NODE_TRACE__QUERY_TEXT;

	/**
	 * The feature id for the '<em><b>Node Label Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE_TRACE__NODE_LABEL_TRACES = GEN_NODE_TRACE__NODE_LABEL_TRACES;

	/**
	 * The feature id for the '<em><b>Compartment Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE_TRACE__COMPARTMENT_TRACES = GEN_NODE_TRACE__COMPARTMENT_TRACES;

	/**
	 * The number of structural features of the '<em>Gen Child Node Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CHILD_NODE_TRACE_FEATURE_COUNT = GEN_NODE_TRACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenNodeLabelTraceImpl <em>Gen Node Label Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenNodeLabelTraceImpl
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenNodeLabelTrace()
	 * @generated
	 */
	int GEN_NODE_LABEL_TRACE = 5;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL_TRACE__VISUAL_ID = MATCHING_TRACE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL_TRACE__PROCESSED = MATCHING_TRACE__PROCESSED;

	/**
	 * The feature id for the '<em><b>Query Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL_TRACE__QUERY_TEXT = MATCHING_TRACE__QUERY_TEXT;

	/**
	 * The number of structural features of the '<em>Gen Node Label Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NODE_LABEL_TRACE_FEATURE_COUNT = MATCHING_TRACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenLinkTraceImpl <em>Gen Link Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenLinkTraceImpl
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenLinkTrace()
	 * @generated
	 */
	int GEN_LINK_TRACE = 6;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_TRACE__VISUAL_ID = MATCHING_TRACE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_TRACE__PROCESSED = MATCHING_TRACE__PROCESSED;

	/**
	 * The feature id for the '<em><b>Query Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_TRACE__QUERY_TEXT = MATCHING_TRACE__QUERY_TEXT;

	/**
	 * The feature id for the '<em><b>Link Label Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_TRACE__LINK_LABEL_TRACES = MATCHING_TRACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Link Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_TRACE_FEATURE_COUNT = MATCHING_TRACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenCompartmentTraceImpl <em>Gen Compartment Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenCompartmentTraceImpl
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenCompartmentTrace()
	 * @generated
	 */
	int GEN_COMPARTMENT_TRACE = 7;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT_TRACE__VISUAL_ID = MATCHING_TRACE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT_TRACE__PROCESSED = MATCHING_TRACE__PROCESSED;

	/**
	 * The feature id for the '<em><b>Query Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT_TRACE__QUERY_TEXT = MATCHING_TRACE__QUERY_TEXT;

	/**
	 * The number of structural features of the '<em>Gen Compartment Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPARTMENT_TRACE_FEATURE_COUNT = MATCHING_TRACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenLinkLabelTraceImpl <em>Gen Link Label Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenLinkLabelTraceImpl
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenLinkLabelTrace()
	 * @generated
	 */
	int GEN_LINK_LABEL_TRACE = 8;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL_TRACE__VISUAL_ID = MATCHING_TRACE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL_TRACE__PROCESSED = MATCHING_TRACE__PROCESSED;

	/**
	 * The feature id for the '<em><b>Query Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL_TRACE__QUERY_TEXT = MATCHING_TRACE__QUERY_TEXT;

	/**
	 * The number of structural features of the '<em>Gen Link Label Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LINK_LABEL_TRACE_FEATURE_COUNT = MATCHING_TRACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.ToolGroupTraceImpl <em>Tool Group Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.ToolGroupTraceImpl
	 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getToolGroupTrace()
	 * @generated
	 */
	int TOOL_GROUP_TRACE = 9;

	/**
	 * The feature id for the '<em><b>Visual ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP_TRACE__VISUAL_ID = MATCHING_TRACE__VISUAL_ID;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP_TRACE__PROCESSED = MATCHING_TRACE__PROCESSED;

	/**
	 * The feature id for the '<em><b>Query Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP_TRACE__QUERY_TEXT = MATCHING_TRACE__QUERY_TEXT;

	/**
	 * The number of structural features of the '<em>Tool Group Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP_TRACE_FEATURE_COUNT = MATCHING_TRACE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.internal.bridge.trace.TraceModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.TraceModel
	 * @generated
	 */
	EClass getTraceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.internal.bridge.trace.TraceModel#getNodeTraces <em>Node Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Traces</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.TraceModel#getNodeTraces()
	 * @see #getTraceModel()
	 * @generated
	 */
	EReference getTraceModel_NodeTraces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.internal.bridge.trace.TraceModel#getChildNodeTraces <em>Child Node Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Node Traces</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.TraceModel#getChildNodeTraces()
	 * @see #getTraceModel()
	 * @generated
	 */
	EReference getTraceModel_ChildNodeTraces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.internal.bridge.trace.TraceModel#getLinkTraces <em>Link Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Traces</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.TraceModel#getLinkTraces()
	 * @see #getTraceModel()
	 * @generated
	 */
	EReference getTraceModel_LinkTraces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.internal.bridge.trace.TraceModel#getToolGroupTraces <em>Tool Group Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool Group Traces</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.TraceModel#getToolGroupTraces()
	 * @see #getTraceModel()
	 * @generated
	 */
	EReference getTraceModel_ToolGroupTraces();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.internal.bridge.trace.AbstractTrace <em>Abstract Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Trace</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.AbstractTrace
	 * @generated
	 */
	EClass getAbstractTrace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.internal.bridge.trace.AbstractTrace#getVisualID <em>Visual ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual ID</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.AbstractTrace#getVisualID()
	 * @see #getAbstractTrace()
	 * @generated
	 */
	EAttribute getAbstractTrace_VisualID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.internal.bridge.trace.AbstractTrace#isProcessed <em>Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processed</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.AbstractTrace#isProcessed()
	 * @see #getAbstractTrace()
	 * @generated
	 */
	EAttribute getAbstractTrace_Processed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.internal.bridge.trace.MatchingTrace <em>Matching Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Trace</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.MatchingTrace
	 * @generated
	 */
	EClass getMatchingTrace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.internal.bridge.trace.MatchingTrace#getQueryText <em>Query Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Text</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.MatchingTrace#getQueryText()
	 * @see #getMatchingTrace()
	 * @generated
	 */
	EAttribute getMatchingTrace_QueryText();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.internal.bridge.trace.GenNodeTrace <em>Gen Node Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Node Trace</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.GenNodeTrace
	 * @generated
	 */
	EClass getGenNodeTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.internal.bridge.trace.GenNodeTrace#getNodeLabelTraces <em>Node Label Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Label Traces</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.GenNodeTrace#getNodeLabelTraces()
	 * @see #getGenNodeTrace()
	 * @generated
	 */
	EReference getGenNodeTrace_NodeLabelTraces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.internal.bridge.trace.GenNodeTrace#getCompartmentTraces <em>Compartment Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartment Traces</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.GenNodeTrace#getCompartmentTraces()
	 * @see #getGenNodeTrace()
	 * @generated
	 */
	EReference getGenNodeTrace_CompartmentTraces();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.internal.bridge.trace.GenChildNodeTrace <em>Gen Child Node Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Child Node Trace</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.GenChildNodeTrace
	 * @generated
	 */
	EClass getGenChildNodeTrace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.internal.bridge.trace.GenNodeLabelTrace <em>Gen Node Label Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Node Label Trace</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.GenNodeLabelTrace
	 * @generated
	 */
	EClass getGenNodeLabelTrace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.internal.bridge.trace.GenLinkTrace <em>Gen Link Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Link Trace</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.GenLinkTrace
	 * @generated
	 */
	EClass getGenLinkTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.internal.bridge.trace.GenLinkTrace#getLinkLabelTraces <em>Link Label Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Label Traces</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.GenLinkTrace#getLinkLabelTraces()
	 * @see #getGenLinkTrace()
	 * @generated
	 */
	EReference getGenLinkTrace_LinkLabelTraces();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.internal.bridge.trace.GenCompartmentTrace <em>Gen Compartment Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Compartment Trace</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.GenCompartmentTrace
	 * @generated
	 */
	EClass getGenCompartmentTrace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.internal.bridge.trace.GenLinkLabelTrace <em>Gen Link Label Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Link Label Trace</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.GenLinkLabelTrace
	 * @generated
	 */
	EClass getGenLinkLabelTrace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.internal.bridge.trace.ToolGroupTrace <em>Tool Group Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Group Trace</em>'.
	 * @see org.eclipse.gmf.internal.bridge.trace.ToolGroupTrace
	 * @generated
	 */
	EClass getToolGroupTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceFactory getTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.TraceModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.TraceModelImpl
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getTraceModel()
		 * @generated
		 */
		EClass TRACE_MODEL = eINSTANCE.getTraceModel();

		/**
		 * The meta object literal for the '<em><b>Node Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_MODEL__NODE_TRACES = eINSTANCE.getTraceModel_NodeTraces();

		/**
		 * The meta object literal for the '<em><b>Child Node Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_MODEL__CHILD_NODE_TRACES = eINSTANCE.getTraceModel_ChildNodeTraces();

		/**
		 * The meta object literal for the '<em><b>Link Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_MODEL__LINK_TRACES = eINSTANCE.getTraceModel_LinkTraces();

		/**
		 * The meta object literal for the '<em><b>Tool Group Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_MODEL__TOOL_GROUP_TRACES = eINSTANCE.getTraceModel_ToolGroupTraces();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.AbstractTraceImpl <em>Abstract Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.AbstractTraceImpl
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getAbstractTrace()
		 * @generated
		 */
		EClass ABSTRACT_TRACE = eINSTANCE.getAbstractTrace();

		/**
		 * The meta object literal for the '<em><b>Visual ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TRACE__VISUAL_ID = eINSTANCE.getAbstractTrace_VisualID();

		/**
		 * The meta object literal for the '<em><b>Processed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TRACE__PROCESSED = eINSTANCE.getAbstractTrace_Processed();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.MatchingTraceImpl <em>Matching Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.MatchingTraceImpl
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getMatchingTrace()
		 * @generated
		 */
		EClass MATCHING_TRACE = eINSTANCE.getMatchingTrace();

		/**
		 * The meta object literal for the '<em><b>Query Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHING_TRACE__QUERY_TEXT = eINSTANCE.getMatchingTrace_QueryText();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenNodeTraceImpl <em>Gen Node Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenNodeTraceImpl
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenNodeTrace()
		 * @generated
		 */
		EClass GEN_NODE_TRACE = eINSTANCE.getGenNodeTrace();

		/**
		 * The meta object literal for the '<em><b>Node Label Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_NODE_TRACE__NODE_LABEL_TRACES = eINSTANCE.getGenNodeTrace_NodeLabelTraces();

		/**
		 * The meta object literal for the '<em><b>Compartment Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_NODE_TRACE__COMPARTMENT_TRACES = eINSTANCE.getGenNodeTrace_CompartmentTraces();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenChildNodeTraceImpl <em>Gen Child Node Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenChildNodeTraceImpl
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenChildNodeTrace()
		 * @generated
		 */
		EClass GEN_CHILD_NODE_TRACE = eINSTANCE.getGenChildNodeTrace();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenNodeLabelTraceImpl <em>Gen Node Label Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenNodeLabelTraceImpl
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenNodeLabelTrace()
		 * @generated
		 */
		EClass GEN_NODE_LABEL_TRACE = eINSTANCE.getGenNodeLabelTrace();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenLinkTraceImpl <em>Gen Link Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenLinkTraceImpl
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenLinkTrace()
		 * @generated
		 */
		EClass GEN_LINK_TRACE = eINSTANCE.getGenLinkTrace();

		/**
		 * The meta object literal for the '<em><b>Link Label Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LINK_TRACE__LINK_LABEL_TRACES = eINSTANCE.getGenLinkTrace_LinkLabelTraces();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenCompartmentTraceImpl <em>Gen Compartment Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenCompartmentTraceImpl
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenCompartmentTrace()
		 * @generated
		 */
		EClass GEN_COMPARTMENT_TRACE = eINSTANCE.getGenCompartmentTrace();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.GenLinkLabelTraceImpl <em>Gen Link Label Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.GenLinkLabelTraceImpl
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getGenLinkLabelTrace()
		 * @generated
		 */
		EClass GEN_LINK_LABEL_TRACE = eINSTANCE.getGenLinkLabelTrace();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmf.internal.bridge.trace.impl.ToolGroupTraceImpl <em>Tool Group Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.ToolGroupTraceImpl
		 * @see org.eclipse.gmf.internal.bridge.trace.impl.TracePackageImpl#getToolGroupTrace()
		 * @generated
		 */
		EClass TOOL_GROUP_TRACE = eINSTANCE.getToolGroupTrace();

	}

} //TracePackage
