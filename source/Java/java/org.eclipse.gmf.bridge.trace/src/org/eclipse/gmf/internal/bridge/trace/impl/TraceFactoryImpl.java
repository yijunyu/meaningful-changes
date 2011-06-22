/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.internal.bridge.trace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmf.internal.bridge.trace.*;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceFactoryImpl extends EFactoryImpl implements TraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceFactory init() {
		try {
			TraceFactory theTraceFactory = (TraceFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/gmf/2006/Trace"); 
			if (theTraceFactory != null) {
				return theTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TracePackage.TRACE_MODEL: return createTraceModel();
			case TracePackage.GEN_NODE_TRACE: return createGenNodeTrace();
			case TracePackage.GEN_CHILD_NODE_TRACE: return createGenChildNodeTrace();
			case TracePackage.GEN_NODE_LABEL_TRACE: return createGenNodeLabelTrace();
			case TracePackage.GEN_LINK_TRACE: return createGenLinkTrace();
			case TracePackage.GEN_COMPARTMENT_TRACE: return createGenCompartmentTrace();
			case TracePackage.GEN_LINK_LABEL_TRACE: return createGenLinkLabelTrace();
			case TracePackage.TOOL_GROUP_TRACE: return createToolGroupTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel createTraceModel() {
		TraceModelImpl traceModel = new TraceModelImpl();
		return traceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNodeTrace createGenNodeTrace() {
		GenNodeTraceImpl genNodeTrace = new GenNodeTraceImpl();
		return genNodeTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenChildNodeTrace createGenChildNodeTrace() {
		GenChildNodeTraceImpl genChildNodeTrace = new GenChildNodeTraceImpl();
		return genChildNodeTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNodeLabelTrace createGenNodeLabelTrace() {
		GenNodeLabelTraceImpl genNodeLabelTrace = new GenNodeLabelTraceImpl();
		return genNodeLabelTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLinkTrace createGenLinkTrace() {
		GenLinkTraceImpl genLinkTrace = new GenLinkTraceImpl();
		return genLinkTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCompartmentTrace createGenCompartmentTrace() {
		GenCompartmentTraceImpl genCompartmentTrace = new GenCompartmentTraceImpl();
		return genCompartmentTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLinkLabelTrace createGenLinkLabelTrace() {
		GenLinkLabelTraceImpl genLinkLabelTrace = new GenLinkLabelTraceImpl();
		return genLinkLabelTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolGroupTrace createToolGroupTrace() {
		ToolGroupTraceImpl toolGroupTrace = new ToolGroupTraceImpl();
		return toolGroupTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracePackage getTracePackage() {
		return (TracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TracePackage getPackage() {
		return TracePackage.eINSTANCE;
	}

} //TraceFactoryImpl
