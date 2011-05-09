/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#isDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getGenNodes <em>Gen Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getGenLinks <em>Gen Links</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getQualifiedToolName <em>Qualified Tool Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolEntry()
 * @model
 * @generated
 */
public interface ToolEntry extends EntryBase, ToolGroupItem {
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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolEntry_Default()
	 * @model default="false"
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Gen Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Nodes</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolEntry_GenNodes()
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenNode"
	 * @generated
	 */
	EList getGenNodes();

	/**
	 * Returns the value of the '<em><b>Gen Links</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Links</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolEntry_GenLinks()
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenLink"
	 * @generated
	 */
	EList getGenLinks();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enforces 'tool for either node or link' - if there are values in genNodes list, returns it (no respect to values in genLinks); returns value of genLinks otherwise
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolEntry_Elements()
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenCommonBase" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getElements();

	/**
	 * Returns the value of the '<em><b>Qualified Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Tool Name</em>' attribute.
	 * @see #setQualifiedToolName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolEntry_QualifiedToolName()
	 * @model
	 * @generated
	 */
	String getQualifiedToolName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry#getQualifiedToolName <em>Qualified Tool Name</em>}' attribute.
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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getToolEntry_Properties()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String"
	 * @generated
	 */
	EMap getProperties();

} // ToolEntry
