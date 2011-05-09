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
 * A representation of the model object '<em><b>Gen Domain Model Navigator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#isGenerateDomainModelNavigator <em>Generate Domain Model Navigator</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainContentExtensionID <em>Domain Content Extension ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainContentExtensionName <em>Domain Content Extension Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainContentExtensionPriority <em>Domain Content Extension Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainContentProviderClassName <em>Domain Content Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainLabelProviderClassName <em>Domain Label Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainModelElementTesterClassName <em>Domain Model Element Tester Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDomainModelNavigator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenDomainModelNavigator extends EObject {
	/**
	 * Returns the value of the '<em><b>Generate Domain Model Navigator</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Domain Model Navigator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Domain Model Navigator</em>' attribute.
	 * @see #setGenerateDomainModelNavigator(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDomainModelNavigator_GenerateDomainModelNavigator()
	 * @model default="true"
	 * @generated
	 */
	boolean isGenerateDomainModelNavigator();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#isGenerateDomainModelNavigator <em>Generate Domain Model Navigator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Domain Model Navigator</em>' attribute.
	 * @see #isGenerateDomainModelNavigator()
	 * @generated
	 */
	void setGenerateDomainModelNavigator(boolean value);

	/**
	 * Returns the value of the '<em><b>Domain Content Extension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Content Extension ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Content Extension ID</em>' attribute.
	 * @see #setDomainContentExtensionID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDomainModelNavigator_DomainContentExtensionID()
	 * @model
	 * @generated
	 */
	String getDomainContentExtensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainContentExtensionID <em>Domain Content Extension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Content Extension ID</em>' attribute.
	 * @see #getDomainContentExtensionID()
	 * @generated
	 */
	void setDomainContentExtensionID(String value);

	/**
	 * Returns the value of the '<em><b>Domain Content Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Content Extension Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Content Extension Name</em>' attribute.
	 * @see #setDomainContentExtensionName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDomainModelNavigator_DomainContentExtensionName()
	 * @model
	 * @generated
	 */
	String getDomainContentExtensionName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainContentExtensionName <em>Domain Content Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Content Extension Name</em>' attribute.
	 * @see #getDomainContentExtensionName()
	 * @generated
	 */
	void setDomainContentExtensionName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Content Extension Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Content Extension Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Content Extension Priority</em>' attribute.
	 * @see #setDomainContentExtensionPriority(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDomainModelNavigator_DomainContentExtensionPriority()
	 * @model
	 * @generated
	 */
	String getDomainContentExtensionPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainContentExtensionPriority <em>Domain Content Extension Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Content Extension Priority</em>' attribute.
	 * @see #getDomainContentExtensionPriority()
	 * @generated
	 */
	void setDomainContentExtensionPriority(String value);

	/**
	 * Returns the value of the '<em><b>Domain Content Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Content Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Content Provider Class Name</em>' attribute.
	 * @see #setDomainContentProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDomainModelNavigator_DomainContentProviderClassName()
	 * @model
	 * @generated
	 */
	String getDomainContentProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainContentProviderClassName <em>Domain Content Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Content Provider Class Name</em>' attribute.
	 * @see #getDomainContentProviderClassName()
	 * @generated
	 */
	void setDomainContentProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Label Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Label Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Label Provider Class Name</em>' attribute.
	 * @see #setDomainLabelProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDomainModelNavigator_DomainLabelProviderClassName()
	 * @model
	 * @generated
	 */
	String getDomainLabelProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainLabelProviderClassName <em>Domain Label Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Label Provider Class Name</em>' attribute.
	 * @see #getDomainLabelProviderClassName()
	 * @generated
	 */
	void setDomainLabelProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Model Element Tester Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model Element Tester Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model Element Tester Class Name</em>' attribute.
	 * @see #setDomainModelElementTesterClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDomainModelNavigator_DomainModelElementTesterClassName()
	 * @model
	 * @generated
	 */
	String getDomainModelElementTesterClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDomainModelNavigator#getDomainModelElementTesterClassName <em>Domain Model Element Tester Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model Element Tester Class Name</em>' attribute.
	 * @see #getDomainModelElementTesterClassName()
	 * @generated
	 */
	void setDomainModelElementTesterClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDomainContentProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDomainLabelProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDomainModelElementTesterQualifiedClassName();

} // GenDomainModelNavigator
