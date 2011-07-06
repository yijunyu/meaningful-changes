/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Tool Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.AbstractToolEntry#isDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.AbstractToolEntry#getQualifiedToolName <em>Qualified Tool Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.AbstractToolEntry#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getAbstractToolEntry()
 * @model abstract="true"
 * @generated
 */
public interface AbstractToolEntry extends EntryBase, ToolGroupItem {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getAbstractToolEntry_Default()
	 * @model default="false"
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.AbstractToolEntry#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Qualified Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Tool Name</em>' attribute.
	 * @see #setQualifiedToolName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getAbstractToolEntry_QualifiedToolName()
	 * @model
	 * @generated
	 */
	String getQualifiedToolName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.AbstractToolEntry#getQualifiedToolName <em>Qualified Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Tool Name</em>' attribute.
	 * @see #getQualifiedToolName()
	 * @generated
	 */
	void setQualifiedToolName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' map.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getAbstractToolEntry_Properties()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getProperties();

} // AbstractToolEntry