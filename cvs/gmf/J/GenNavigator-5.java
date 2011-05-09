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
 * A representation of the model object '<em><b>Gen Navigator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionID <em>Content Extension ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionName <em>Content Extension Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionPriority <em>Content Extension Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getLinkHelperExtensionID <em>Link Helper Extension ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentProviderClassName <em>Content Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getLabelProviderClassName <em>Label Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getLinkHelperClassName <em>Link Helper Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getAbstractNavigatorItemClassName <em>Abstract Navigator Item Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getNavigatorGroupClassName <em>Navigator Group Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getNavigatorItemClassName <em>Navigator Item Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getChildReferences <em>Child References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator()
 * @model
 * @generated
 */
public interface GenNavigator extends EObject {
	/**
	 * Returns the value of the '<em><b>Editor Gen</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getNavigator <em>Navigator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Gen</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Gen</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_EditorGen()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getNavigator
	 * @model opposite="navigator" changeable="false"
	 * @generated
	 */
	GenEditorGenerator getEditorGen();

	/**
	 * Returns the value of the '<em><b>Content Extension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Extension ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Extension ID</em>' attribute.
	 * @see #setContentExtensionID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ContentExtensionID()
	 * @model
	 * @generated
	 */
	String getContentExtensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionID <em>Content Extension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Extension ID</em>' attribute.
	 * @see #getContentExtensionID()
	 * @generated
	 */
	void setContentExtensionID(String value);

	/**
	 * Returns the value of the '<em><b>Content Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Extension Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Extension Name</em>' attribute.
	 * @see #setContentExtensionName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ContentExtensionName()
	 * @model
	 * @generated
	 */
	String getContentExtensionName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionName <em>Content Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Extension Name</em>' attribute.
	 * @see #getContentExtensionName()
	 * @generated
	 */
	void setContentExtensionName(String value);

	/**
	 * Returns the value of the '<em><b>Content Extension Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Extension Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Extension Priority</em>' attribute.
	 * @see #setContentExtensionPriority(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ContentExtensionPriority()
	 * @model
	 * @generated
	 */
	String getContentExtensionPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionPriority <em>Content Extension Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Extension Priority</em>' attribute.
	 * @see #getContentExtensionPriority()
	 * @generated
	 */
	void setContentExtensionPriority(String value);

	/**
	 * Returns the value of the '<em><b>Link Helper Extension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Helper Extension ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Helper Extension ID</em>' attribute.
	 * @see #setLinkHelperExtensionID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_LinkHelperExtensionID()
	 * @model
	 * @generated
	 */
	String getLinkHelperExtensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getLinkHelperExtensionID <em>Link Helper Extension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Helper Extension ID</em>' attribute.
	 * @see #getLinkHelperExtensionID()
	 * @generated
	 */
	void setLinkHelperExtensionID(String value);

	/**
	 * Returns the value of the '<em><b>Content Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Provider Class Name</em>' attribute.
	 * @see #setContentProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ContentProviderClassName()
	 * @model
	 * @generated
	 */
	String getContentProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentProviderClassName <em>Content Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Provider Class Name</em>' attribute.
	 * @see #getContentProviderClassName()
	 * @generated
	 */
	void setContentProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Label Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Provider Class Name</em>' attribute.
	 * @see #setLabelProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_LabelProviderClassName()
	 * @model
	 * @generated
	 */
	String getLabelProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getLabelProviderClassName <em>Label Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Provider Class Name</em>' attribute.
	 * @see #getLabelProviderClassName()
	 * @generated
	 */
	void setLabelProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Link Helper Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Helper Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Helper Class Name</em>' attribute.
	 * @see #setLinkHelperClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_LinkHelperClassName()
	 * @model
	 * @generated
	 */
	String getLinkHelperClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getLinkHelperClassName <em>Link Helper Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Helper Class Name</em>' attribute.
	 * @see #getLinkHelperClassName()
	 * @generated
	 */
	void setLinkHelperClassName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract Navigator Item Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Navigator Item Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Navigator Item Class Name</em>' attribute.
	 * @see #setAbstractNavigatorItemClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_AbstractNavigatorItemClassName()
	 * @model
	 * @generated
	 */
	String getAbstractNavigatorItemClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getAbstractNavigatorItemClassName <em>Abstract Navigator Item Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Navigator Item Class Name</em>' attribute.
	 * @see #getAbstractNavigatorItemClassName()
	 * @generated
	 */
	void setAbstractNavigatorItemClassName(String value);

	/**
	 * Returns the value of the '<em><b>Navigator Group Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigator Group Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigator Group Class Name</em>' attribute.
	 * @see #setNavigatorGroupClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_NavigatorGroupClassName()
	 * @model
	 * @generated
	 */
	String getNavigatorGroupClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getNavigatorGroupClassName <em>Navigator Group Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigator Group Class Name</em>' attribute.
	 * @see #getNavigatorGroupClassName()
	 * @generated
	 */
	void setNavigatorGroupClassName(String value);

	/**
	 * Returns the value of the '<em><b>Navigator Item Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigator Item Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigator Item Class Name</em>' attribute.
	 * @see #setNavigatorItemClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_NavigatorItemClassName()
	 * @model
	 * @generated
	 */
	String getNavigatorItemClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getNavigatorItemClassName <em>Navigator Item Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigator Item Class Name</em>' attribute.
	 * @see #getNavigatorItemClassName()
	 * @generated
	 */
	void setNavigatorItemClassName(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Child References</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child References</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ChildReferences()
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference" containment="true"
	 * @generated
	 */
	EList getChildReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getContentProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLabelProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLinkHelperQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getAbstractNavigatorItemQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getNavigatorGroupQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getNavigatorItemQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference"
	 * @generated
	 */
	EList getChildReferencesFrom(GenCommonBase parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference"
	 * @generated
	 */
	EList getChildReferencesTo(GenCommonBase child);

} // GenNavigator