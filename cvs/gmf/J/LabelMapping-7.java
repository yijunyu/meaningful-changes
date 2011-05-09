/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Label on diagram; either features or text should be specified
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#getMapEntry <em>Map Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping()
 * @model
 * @generated
 */
public interface LabelMapping extends LabelFlavour {
	/**
	 * Returns the value of the '<em><b>Map Entry</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.MappingEntry#getLabelMappings <em>Label Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Entry</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Entry</em>' container reference.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping_MapEntry()
	 * @see org.eclipse.gmf.mappings.MappingEntry#getLabelMappings
	 * @model opposite="labelMappings" required="true" changeable="false"
	 * @generated
	 */
	MappingEntry getMapEntry();

} // LabelMapping
