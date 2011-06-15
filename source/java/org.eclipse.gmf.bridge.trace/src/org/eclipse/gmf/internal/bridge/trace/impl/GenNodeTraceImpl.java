/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.internal.bridge.trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;
import org.eclipse.gmf.internal.bridge.trace.GenCompartmentTrace;
import org.eclipse.gmf.internal.bridge.trace.GenNodeLabelTrace;
import org.eclipse.gmf.internal.bridge.trace.GenNodeTrace;
import org.eclipse.gmf.internal.bridge.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Node Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.GenNodeTraceImpl#getNodeLabelTraces <em>Node Label Traces</em>}</li>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.impl.GenNodeTraceImpl#getCompartmentTraces <em>Compartment Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenNodeTraceImpl extends MatchingTraceImpl implements GenNodeTrace {
	/**
	 * The cached value of the '{@link #getNodeLabelTraces() <em>Node Label Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeLabelTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<GenNodeLabelTrace> nodeLabelTraces;

	/**
	 * The cached value of the '{@link #getCompartmentTraces() <em>Compartment Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<GenCompartmentTrace> compartmentTraces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenNodeTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.GEN_NODE_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenNodeLabelTrace> getNodeLabelTraces() {
		if (nodeLabelTraces == null) {
			nodeLabelTraces = new EObjectContainmentEList<GenNodeLabelTrace>(GenNodeLabelTrace.class, this, TracePackage.GEN_NODE_TRACE__NODE_LABEL_TRACES);
		}
		return nodeLabelTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenCompartmentTrace> getCompartmentTraces() {
		if (compartmentTraces == null) {
			compartmentTraces = new EObjectContainmentEList<GenCompartmentTrace>(GenCompartmentTrace.class, this, TracePackage.GEN_NODE_TRACE__COMPARTMENT_TRACES);
		}
		return compartmentTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setContext(GenNode genNode) {
		StringBuffer query = new StringBuffer();
		if (genNode.getModelFacet() != null) {
			TypeModelFacet modelFacet = genNode.getModelFacet();
			query.append("let _eClass_:ecore::EClass = modelFacet.metaClass.ecoreClass in ");
			query.append(getEClassComparision("_eClass_", modelFacet.getMetaClass().getEcoreClass()));
			if (modelFacet.getContainmentMetaFeature() != null) {
				query.insert(0, "(");
				query.append(") and (let _containmentMF_:ecore::EStructuralFeature = modelFacet.containmentMetaFeature.ecoreFeature in ");
				query.append(getEStructuralFeatureComparison("_containmentMF_", modelFacet.getContainmentMetaFeature().getEcoreFeature()));
				query.append(")");
				if (modelFacet.getContainmentMetaFeature() != modelFacet.getChildMetaFeature()) {
					query.append(" and ( let _childMF_:ecore::EStructuralFeature = modelFacet.childMetaFeature.ecoreFeature in ");
					query.append(getEStructuralFeatureComparison("_childMF_", modelFacet.getChildMetaFeature().getEcoreFeature()));
					query.append(")");
				}
			}
		} else {
			query.append("modelFacet = null");
		}
		setQueryText(query.toString());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.GEN_NODE_TRACE__NODE_LABEL_TRACES:
				return ((InternalEList<?>)getNodeLabelTraces()).basicRemove(otherEnd, msgs);
			case TracePackage.GEN_NODE_TRACE__COMPARTMENT_TRACES:
				return ((InternalEList<?>)getCompartmentTraces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.GEN_NODE_TRACE__NODE_LABEL_TRACES:
				return getNodeLabelTraces();
			case TracePackage.GEN_NODE_TRACE__COMPARTMENT_TRACES:
				return getCompartmentTraces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracePackage.GEN_NODE_TRACE__NODE_LABEL_TRACES:
				getNodeLabelTraces().clear();
				getNodeLabelTraces().addAll((Collection<? extends GenNodeLabelTrace>)newValue);
				return;
			case TracePackage.GEN_NODE_TRACE__COMPARTMENT_TRACES:
				getCompartmentTraces().clear();
				getCompartmentTraces().addAll((Collection<? extends GenCompartmentTrace>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracePackage.GEN_NODE_TRACE__NODE_LABEL_TRACES:
				getNodeLabelTraces().clear();
				return;
			case TracePackage.GEN_NODE_TRACE__COMPARTMENT_TRACES:
				getCompartmentTraces().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TracePackage.GEN_NODE_TRACE__NODE_LABEL_TRACES:
				return nodeLabelTraces != null && !nodeLabelTraces.isEmpty();
			case TracePackage.GEN_NODE_TRACE__COMPARTMENT_TRACES:
				return compartmentTraces != null && !compartmentTraces.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	public EClass getQueryContext() {
		return GMFGenPackage.eINSTANCE.getGenTopLevelNode();
	}
	
} //GenNodeTraceImpl