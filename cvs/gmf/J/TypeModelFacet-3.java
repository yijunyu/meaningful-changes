/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Model Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model facet of an EClass
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getContainmentMetaFeature <em>Containment Meta Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getChildMetaFeature <em>Child Meta Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeModelFacet()
 * @model
 * @generated
 */
public interface TypeModelFacet extends ModelFacet{
	/**
	 * Returns the value of the '<em><b>Meta Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Class</em>' reference.
	 * @see #setMetaClass(GenClass)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeModelFacet_MetaClass()
	 * @model required="true"
	 * @generated
	 */
	GenClass getMetaClass();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getMetaClass <em>Meta Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Class</em>' reference.
	 * @see #getMetaClass()
	 * @generated
	 */
	void setMetaClass(GenClass value);

	/**
	 * Returns the value of the '<em><b>Containment Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Meta Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Meta Feature</em>' reference.
	 * @see #setContainmentMetaFeature(GenFeature)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeModelFacet_ContainmentMetaFeature()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='containmentMetaFeature.isContainment'"
	 * @generated
	 */
	GenFeature getContainmentMetaFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getContainmentMetaFeature <em>Containment Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment Meta Feature</em>' reference.
	 * @see #getContainmentMetaFeature()
	 * @generated
	 */
	void setContainmentMetaFeature(GenFeature value);

	/**
	 * Returns the value of the '<em><b>Child Meta Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Usually the same as containmentMetaFeature, unless you need to distinguish where to put and where to get from
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Meta Feature</em>' reference.
	 * @see #setChildMetaFeature(GenFeature)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeModelFacet_ChildMetaFeature()
	 * @model required="true"
	 * @generated
	 */
	GenFeature getChildMetaFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getChildMetaFeature <em>Child Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Meta Feature</em>' reference.
	 * @see #getChildMetaFeature()
	 * @generated
	 */
	void setChildMetaFeature(GenFeature value);

} // TypeModelFacet
