/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.mappings.GMFMapPackage
 * @generated
 */
public interface GMFMapFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFMapFactory eINSTANCE = org.eclipse.gmf.mappings.impl.GMFMapFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Node Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Mapping</em>'.
	 * @generated
	 */
	NodeMapping createNodeMapping();

	/**
	 * Returns a new object of class '<em>Child Node Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Node Mapping</em>'.
	 * @generated
	 */
	ChildNodeMapping createChildNodeMapping();

	/**
	 * Returns a new object of class '<em>Compartment Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment Mapping</em>'.
	 * @generated
	 */
	CompartmentMapping createCompartmentMapping();

	/**
	 * Returns a new object of class '<em>Link Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Mapping</em>'.
	 * @generated
	 */
	LinkMapping createLinkMapping();

	/**
	 * Returns a new object of class '<em>Canvas Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas Mapping</em>'.
	 * @generated
	 */
	CanvasMapping createCanvasMapping();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Tool Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Group</em>'.
	 * @generated
	 */
	ToolGroup createToolGroup();

	/**
	 * Returns a new object of class '<em>Creation Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation Tool</em>'.
	 * @generated
	 */
	CreationTool createCreationTool();

	/**
	 * Returns a new object of class '<em>New Action Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Action Tool</em>'.
	 * @generated
	 */
	NewActionTool createNewActionTool();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Link Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Constraints</em>'.
	 * @generated
	 */
	LinkConstraints createLinkConstraints();

	/**
	 * Returns a new object of class '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Expression</em>'.
	 * @generated
	 */
	ValueExpression createValueExpression();

	/**
	 * Returns a new object of class '<em>Feature Seq Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Seq Initializer</em>'.
	 * @generated
	 */
	FeatureSeqInitializer createFeatureSeqInitializer();

	/**
	 * Returns a new object of class '<em>Feature Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Value Spec</em>'.
	 * @generated
	 */
	FeatureValueSpec createFeatureValueSpec();

	/**
	 * Returns a new object of class '<em>Audit Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Container</em>'.
	 * @generated
	 */
	AuditContainer createAuditContainer();

	/**
	 * Returns a new object of class '<em>Audit Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Rule</em>'.
	 * @generated
	 */
	AuditRule createAuditRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GMFMapPackage getGMFMapPackage();

} //GMFMapFactory
