/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Property Tab Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenPropertyTabFilter#getTab <em>Tab</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenPropertyTabFilter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenPropertyTabFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Tab</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenPropertyTabFilter_Tab()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab#getFilter
	 * @model opposite="filter" resolveProxies="false" required="true" transient="false" changeable="false"
	 * @generated
	 */
	GenCustomPropertyTab getTab();

} // GenPropertyTabFilter