/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Model Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model facets that may support links should extends this interface
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getLinkModelFacet()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LinkModelFacet extends ModelFacet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.emf.codegen.ecore.genmodel.GenClass"
	 * @generated
	 */
	EList getSourceTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.emf.codegen.ecore.genmodel.GenClass"
	 * @generated
	 */
	EList getTargetTypes();

} // LinkModelFacet
