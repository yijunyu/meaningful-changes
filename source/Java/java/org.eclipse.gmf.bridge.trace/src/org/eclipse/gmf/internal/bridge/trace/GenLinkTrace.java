/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.internal.bridge.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmf.codegen.gmfgen.GenLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Link Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.internal.bridge.trace.GenLinkTrace#getLinkLabelTraces <em>Link Label Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.internal.bridge.trace.TracePackage#getGenLinkTrace()
 * @model
 * @generated
 */
public interface GenLinkTrace extends MatchingTrace {
	/**
	 * Returns the value of the '<em><b>Link Label Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.internal.bridge.trace.GenLinkLabelTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Label Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Label Traces</em>' containment reference list.
	 * @see org.eclipse.gmf.internal.bridge.trace.TracePackage#getGenLinkTrace_LinkLabelTraces()
	 * @model type="org.eclipse.gmf.internal.bridge.trace.GenLinkLabelTrace" containment="true"
	 * @generated
	 */
	EList<GenLinkLabelTrace> getLinkLabelTraces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setContext(GenLink genLink);

} // GenLinkTrace