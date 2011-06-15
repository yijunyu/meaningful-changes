/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.internal.bridge.trace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.internal.bridge.trace.GenCompartmentTrace;
import org.eclipse.gmf.internal.bridge.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Compartment Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GenCompartmentTraceImpl extends MatchingTraceImpl implements GenCompartmentTrace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCompartmentTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.GEN_COMPARTMENT_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setContext(GenCompartment genCompartment) {
		setQueryText("true");
	}
	
	public EClass getQueryContext() {
		return GMFGenPackage.eINSTANCE.getGenCompartment();
	}
	
} //GenCompartmentTraceImpl