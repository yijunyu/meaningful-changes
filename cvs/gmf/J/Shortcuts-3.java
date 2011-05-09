/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shortcuts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getShortcutsDecoratorProviderClassName <em>Shortcuts Decorator Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getShortcutsDecoratorProviderPriority <em>Shortcuts Decorator Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getCreateShortcutActionClassName <em>Create Shortcut Action Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getContainsShortcutsTo <em>Contains Shortcuts To</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getShortcutsProvidedFor <em>Shortcuts Provided For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getShortcuts()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Shortcuts extends EObject {
	/**
	 * Returns the value of the '<em><b>Shortcuts Decorator Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shortcuts Decorator Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortcuts Decorator Provider Class Name</em>' attribute.
	 * @see #setShortcutsDecoratorProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getShortcuts_ShortcutsDecoratorProviderClassName()
	 * @model
	 * @generated
	 */
	String getShortcutsDecoratorProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getShortcutsDecoratorProviderClassName <em>Shortcuts Decorator Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortcuts Decorator Provider Class Name</em>' attribute.
	 * @see #getShortcutsDecoratorProviderClassName()
	 * @generated
	 */
	void setShortcutsDecoratorProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Shortcuts Decorator Provider Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.ProviderPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shortcuts Decorator Provider Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortcuts Decorator Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #setShortcutsDecoratorProviderPriority(ProviderPriority)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getShortcuts_ShortcutsDecoratorProviderPriority()
	 * @model
	 * @generated
	 */
	ProviderPriority getShortcutsDecoratorProviderPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getShortcutsDecoratorProviderPriority <em>Shortcuts Decorator Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortcuts Decorator Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #getShortcutsDecoratorProviderPriority()
	 * @generated
	 */
	void setShortcutsDecoratorProviderPriority(ProviderPriority value);

	/**
	 * Returns the value of the '<em><b>Create Shortcut Action Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Shortcut Action Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Shortcut Action Class Name</em>' attribute.
	 * @see #setCreateShortcutActionClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getShortcuts_CreateShortcutActionClassName()
	 * @model
	 * @generated
	 */
	String getCreateShortcutActionClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.Shortcuts#getCreateShortcutActionClassName <em>Create Shortcut Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Shortcut Action Class Name</em>' attribute.
	 * @see #getCreateShortcutActionClassName()
	 * @generated
	 */
	void setCreateShortcutActionClassName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Shortcuts To</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of domain meta-model file extensions. Elements of the corresponding models could be shortcutted on this diagram.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contains Shortcuts To</em>' attribute list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getShortcuts_ContainsShortcutsTo()
	 * @model type="java.lang.String"
	 * @generated
	 */
	EList getContainsShortcutsTo();

	/**
	 * Returns the value of the '<em><b>Shortcuts Provided For</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of domain meta-model names. Elements of this diagram domain model could be added as a shortcuts to the diagrams of the specified domains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shortcuts Provided For</em>' attribute list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getShortcuts_ShortcutsProvidedFor()
	 * @model type="java.lang.String"
	 * @generated
	 */
	EList getShortcutsProvidedFor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getShortcutsDecoratorProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCreateShortcutActionQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateCreateShortcutAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateShortcutIcon();

} // Shortcuts
