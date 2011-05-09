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
 * A representation of the model object '<em><b>Batch Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationProviderClassName <em>Validation Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationProviderPriority <em>Validation Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMarkerNavigationProviderClassName <em>Marker Navigation Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMarkerNavigationProviderPriority <em>Marker Navigation Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#isValidationEnabled <em>Validation Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getBatchValidation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BatchValidation extends EObject {
	/**
	 * Returns the value of the '<em><b>Validation Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Provider Class Name</em>' attribute.
	 * @see #setValidationProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getBatchValidation_ValidationProviderClassName()
	 * @model
	 * @generated
	 */
	String getValidationProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationProviderClassName <em>Validation Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Provider Class Name</em>' attribute.
	 * @see #getValidationProviderClassName()
	 * @generated
	 */
	void setValidationProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Validation Provider Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.ProviderPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Provider Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #setValidationProviderPriority(ProviderPriority)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getBatchValidation_ValidationProviderPriority()
	 * @model
	 * @generated
	 */
	ProviderPriority getValidationProviderPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getValidationProviderPriority <em>Validation Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #getValidationProviderPriority()
	 * @generated
	 */
	void setValidationProviderPriority(ProviderPriority value);

	/**
	 * Returns the value of the '<em><b>Marker Navigation Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker Navigation Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Navigation Provider Class Name</em>' attribute.
	 * @see #setMarkerNavigationProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getBatchValidation_MarkerNavigationProviderClassName()
	 * @model
	 * @generated
	 */
	String getMarkerNavigationProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMarkerNavigationProviderClassName <em>Marker Navigation Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Navigation Provider Class Name</em>' attribute.
	 * @see #getMarkerNavigationProviderClassName()
	 * @generated
	 */
	void setMarkerNavigationProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Marker Navigation Provider Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.ProviderPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker Navigation Provider Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Navigation Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #setMarkerNavigationProviderPriority(ProviderPriority)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getBatchValidation_MarkerNavigationProviderPriority()
	 * @model
	 * @generated
	 */
	ProviderPriority getMarkerNavigationProviderPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#getMarkerNavigationProviderPriority <em>Marker Navigation Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Navigation Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #getMarkerNavigationProviderPriority()
	 * @generated
	 */
	void setMarkerNavigationProviderPriority(ProviderPriority value);

	/**
	 * Returns the value of the '<em><b>Validation Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If enabled, ValidationAction is contributed by the editor plugin
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Enabled</em>' attribute.
	 * @see #setValidationEnabled(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getBatchValidation_ValidationEnabled()
	 * @model
	 * @generated
	 */
	boolean isValidationEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.BatchValidation#isValidationEnabled <em>Validation Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Enabled</em>' attribute.
	 * @see #isValidationEnabled()
	 * @generated
	 */
	void setValidationEnabled(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getValidationProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets diagnostic marker type ID local to the editor plugin. The editor pluginID should be used to fully-qualify this ID.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getValidationDiagnosticMarkerType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMarkerNavigationProviderQualifiedClassName();

} // BatchValidation
