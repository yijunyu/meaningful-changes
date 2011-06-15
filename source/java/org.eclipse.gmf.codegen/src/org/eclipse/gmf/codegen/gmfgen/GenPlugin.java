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
 * A representation of the model object '<em><b>Gen Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#isPrintingEnabled <em>Printing Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getRequiredPlugins <em>Required Plugins</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getActivatorClassName <em>Activator Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenPlugin()
 * @model
 * @generated
 */
public interface GenPlugin extends EObject {
	/**
	 * Returns the value of the '<em><b>Editor Gen</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Gen</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Gen</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenPlugin_EditorGen()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getPlugin
	 * @model opposite="plugin" resolveProxies="false" transient="false" changeable="false"
	 * @generated
	 */
	GenEditorGenerator getEditorGen();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenPlugin_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenPlugin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * The default value is <code>"Sample Plugin Provider, Inc"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenPlugin_Provider()
	 * @model default="Sample Plugin Provider, Inc"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0.0.qualifier"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenPlugin_Version()
	 * @model default="1.0.0.qualifier"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Printing Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printing Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printing Enabled</em>' attribute.
	 * @see #setPrintingEnabled(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenPlugin_PrintingEnabled()
	 * @model
	 * @generated
	 */
	boolean isPrintingEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#isPrintingEnabled <em>Printing Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printing Enabled</em>' attribute.
	 * @see #isPrintingEnabled()
	 * @generated
	 */
	void setPrintingEnabled(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computed additional dependencies (in form of plug-in identifiers), including those explicitly specified by user and those derived from referenced genmodels
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getAllRequiredPlugins();

	/**
	 * Returns the value of the '<em><b>Required Plugins</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Plugins</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Plugins</em>' attribute list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenPlugin_RequiredPlugins()
	 * @model
	 * @generated
	 */
	EList<String> getRequiredPlugins();

	/**
	 * Returns the value of the '<em><b>Activator Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activator Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activator Class Name</em>' attribute.
	 * @see #setActivatorClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenPlugin_ActivatorClassName()
	 * @model
	 * @generated
	 */
	String getActivatorClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenPlugin#getActivatorClassName <em>Activator Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activator Class Name</em>' attribute.
	 * @see #getActivatorClassName()
	 * @generated
	 */
	void setActivatorClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getActivatorQualifiedClassName();

} // GenPlugin
