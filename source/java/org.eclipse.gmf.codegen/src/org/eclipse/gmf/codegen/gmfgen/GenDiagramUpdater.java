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
 * A representation of the model object '<em><b>Gen Diagram Updater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater#getEditorGen <em>Editor Gen</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater#getDiagramUpdaterClassName <em>Diagram Updater Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater#getNodeDescriptorClassName <em>Node Descriptor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater#getLinkDescriptorClassName <em>Link Descriptor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater#getUpdateCommandClassName <em>Update Command Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater#getUpdateCommandID <em>Update Command ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramUpdater()
 * @model
 * @generated
 */
public interface GenDiagramUpdater extends EObject {
	/**
	 * Returns the value of the '<em><b>Editor Gen</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDiagramUpdater <em>Diagram Updater</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Gen</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Gen</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramUpdater_EditorGen()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getDiagramUpdater
	 * @model opposite="diagramUpdater" resolveProxies="false" transient="false" changeable="false"
	 * @generated
	 */
	GenEditorGenerator getEditorGen();

	/**
	 * Returns the value of the '<em><b>Diagram Updater Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Updater Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Updater Class Name</em>' attribute.
	 * @see #setDiagramUpdaterClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramUpdater_DiagramUpdaterClassName()
	 * @model
	 * @generated
	 */
	String getDiagramUpdaterClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater#getDiagramUpdaterClassName <em>Diagram Updater Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Updater Class Name</em>' attribute.
	 * @see #getDiagramUpdaterClassName()
	 * @generated
	 */
	void setDiagramUpdaterClassName(String value);

	/**
	 * Returns the value of the '<em><b>Node Descriptor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Descriptor Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Descriptor Class Name</em>' attribute.
	 * @see #setNodeDescriptorClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramUpdater_NodeDescriptorClassName()
	 * @model
	 * @generated
	 */
	String getNodeDescriptorClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater#getNodeDescriptorClassName <em>Node Descriptor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Descriptor Class Name</em>' attribute.
	 * @see #getNodeDescriptorClassName()
	 * @generated
	 */
	void setNodeDescriptorClassName(String value);

	/**
	 * Returns the value of the '<em><b>Link Descriptor Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Descriptor Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Descriptor Class Name</em>' attribute.
	 * @see #setLinkDescriptorClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramUpdater_LinkDescriptorClassName()
	 * @model
	 * @generated
	 */
	String getLinkDescriptorClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater#getLinkDescriptorClassName <em>Link Descriptor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Descriptor Class Name</em>' attribute.
	 * @see #getLinkDescriptorClassName()
	 * @generated
	 */
	void setLinkDescriptorClassName(String value);

	/**
	 * Returns the value of the '<em><b>Update Command Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Command Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Command Class Name</em>' attribute.
	 * @see #setUpdateCommandClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramUpdater_UpdateCommandClassName()
	 * @model
	 * @generated
	 */
	String getUpdateCommandClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater#getUpdateCommandClassName <em>Update Command Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Command Class Name</em>' attribute.
	 * @see #getUpdateCommandClassName()
	 * @generated
	 */
	void setUpdateCommandClassName(String value);

	/**
	 * Returns the value of the '<em><b>Update Command ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Command ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Command ID</em>' attribute.
	 * @see #setUpdateCommandID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagramUpdater_UpdateCommandID()
	 * @model
	 * @generated
	 */
	String getUpdateCommandID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater#getUpdateCommandID <em>Update Command ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Command ID</em>' attribute.
	 * @see #getUpdateCommandID()
	 * @generated
	 */
	void setUpdateCommandID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDiagramUpdaterQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getNodeDescriptorQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLinkDescriptorQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getUpdateCommandQualifiedClassName();

} // GenDiagramUpdater
