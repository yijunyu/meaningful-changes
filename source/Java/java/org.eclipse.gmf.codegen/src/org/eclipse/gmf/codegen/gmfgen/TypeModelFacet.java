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
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getModelElementSelector <em>Model Element Selector</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getModelElementInitializer <em>Model Element Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeModelFacet()
 * @model
 * @generated
 */
public interface TypeModelFacet extends ModelFacet {
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
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='let r: ecore::EReference=containmentMetaFeature.ecoreFeature.oclAsType(ecore::EReference) in not containmentMetaFeature.oclIsUndefined() implies r.containment or r.eReferenceType.isSuperTypeOf(metaClass.ecoreClass)' description='\'Containment Meta Feature\' must reference \'Meta Class\' or its super-classes'"
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
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not childMetaFeature.oclIsUndefined() implies childMetaFeature.ecoreFeature.oclAsType(ecore::EReference).eReferenceType.isSuperTypeOf(metaClass.ecoreClass)' description='\'Child Meta Feature\' must reference \'Meta Class\' or its sub-classes'"
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

	/**
	 * Returns the value of the '<em><b>Model Element Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selection criterion for domain model elements associated with this type model facet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Element Selector</em>' reference.
	 * @see #setModelElementSelector(GenConstraint)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeModelFacet_ModelElementSelector()
	 * @model annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='metaClass.ecoreClass'"
	 * @generated
	 */
	GenConstraint getModelElementSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getModelElementSelector <em>Model Element Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element Selector</em>' reference.
	 * @see #getModelElementSelector()
	 * @generated
	 */
	void setModelElementSelector(GenConstraint value);

	/**
	 * Returns the value of the '<em><b>Model Element Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * State initializer for domain model elements associated with this type model facet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Element Initializer</em>' containment reference.
	 * @see #setModelElementInitializer(GenElementInitializer)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getTypeModelFacet_ModelElementInitializer()
	 * @model containment="true"
	 * @generated
	 */
	GenElementInitializer getModelElementInitializer();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.TypeModelFacet#getModelElementInitializer <em>Model Element Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element Initializer</em>' containment reference.
	 * @see #getModelElementInitializer()
	 * @generated
	 */
	void setModelElementInitializer(GenElementInitializer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPhantomElement();

} // TypeModelFacet
