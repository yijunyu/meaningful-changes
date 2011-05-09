/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.gmfgraph.DiagramLabel;

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
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#getDiagramLabel <em>Diagram Label</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#getDefaultText <em>Default Text</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#getViewPattern <em>View Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#getEditPattern <em>Edit Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.LabelMapping#getMapEntry <em>Map Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping()
 * @model
 * @generated
 */
public interface LabelMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagram Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Label</em>' reference.
	 * @see #setDiagramLabel(DiagramLabel)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping_DiagramLabel()
	 * @model required="true"
	 * @generated
	 */
	DiagramLabel getDiagramLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LabelMapping#getDiagramLabel <em>Diagram Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Label</em>' reference.
	 * @see #getDiagramLabel()
	 * @generated
	 */
	void setDiagramLabel(DiagramLabel value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping_Features()
	 * @model type="org.eclipse.emf.ecore.EAttribute"
	 * @generated
	 */
	EList getFeatures();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LabelMapping#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping_ReadOnly()
	 * @model
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LabelMapping#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default text that should be displayed when produced text is an empty string
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Text</em>' attribute.
	 * @see #setDefaultText(String)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping_DefaultText()
	 * @model
	 * @generated
	 */
	String getDefaultText();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LabelMapping#getDefaultText <em>Default Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Text</em>' attribute.
	 * @see #getDefaultText()
	 * @generated
	 */
	void setDefaultText(String value);

	/**
	 * Returns the value of the '<em><b>View Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pattern for java.text.MessageFormat to produce label on diagram
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Pattern</em>' attribute.
	 * @see #setViewPattern(String)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping_ViewPattern()
	 * @model
	 * @generated
	 */
	String getViewPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LabelMapping#getViewPattern <em>View Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Pattern</em>' attribute.
	 * @see #getViewPattern()
	 * @generated
	 */
	void setViewPattern(String value);

	/**
	 * Returns the value of the '<em><b>Edit Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pattern for java.text.MessageFormat to produce text for inplace editor; if not specified then viewPattern should be used
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edit Pattern</em>' attribute.
	 * @see #setEditPattern(String)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getLabelMapping_EditPattern()
	 * @model
	 * @generated
	 */
	String getEditPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.LabelMapping#getEditPattern <em>Edit Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Pattern</em>' attribute.
	 * @see #getEditPattern()
	 * @generated
	 */
	void setEditPattern(String value);

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
