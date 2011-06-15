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
 * A representation of the model object '<em><b>Provider Class Names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getElementTypesClassName <em>Element Types Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getNotationViewProviderClassName <em>Notation View Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getNotationViewProviderPriority <em>Notation View Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getEditPartProviderClassName <em>Edit Part Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getEditPartProviderPriority <em>Edit Part Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getModelingAssistantProviderClassName <em>Modeling Assistant Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getModelingAssistantProviderPriority <em>Modeling Assistant Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getIconProviderClassName <em>Icon Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getIconProviderPriority <em>Icon Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getParserProviderClassName <em>Parser Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getParserProviderPriority <em>Parser Provider Priority</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getContributionItemProviderClassName <em>Contribution Item Provider Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ProviderClassNames extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Types Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Types Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Types Class Name</em>' attribute.
	 * @see #setElementTypesClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_ElementTypesClassName()
	 * @model
	 * @generated
	 */
	String getElementTypesClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getElementTypesClassName <em>Element Types Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Types Class Name</em>' attribute.
	 * @see #getElementTypesClassName()
	 * @generated
	 */
	void setElementTypesClassName(String value);

	/**
	 * Returns the value of the '<em><b>Notation View Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation View Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation View Provider Class Name</em>' attribute.
	 * @see #setNotationViewProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_NotationViewProviderClassName()
	 * @model
	 * @generated
	 */
	String getNotationViewProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getNotationViewProviderClassName <em>Notation View Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation View Provider Class Name</em>' attribute.
	 * @see #getNotationViewProviderClassName()
	 * @generated
	 */
	void setNotationViewProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Notation View Provider Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.ProviderPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation View Provider Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation View Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #setNotationViewProviderPriority(ProviderPriority)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_NotationViewProviderPriority()
	 * @model
	 * @generated
	 */
	ProviderPriority getNotationViewProviderPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getNotationViewProviderPriority <em>Notation View Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation View Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #getNotationViewProviderPriority()
	 * @generated
	 */
	void setNotationViewProviderPriority(ProviderPriority value);

	/**
	 * Returns the value of the '<em><b>Edit Part Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Part Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Part Provider Class Name</em>' attribute.
	 * @see #setEditPartProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_EditPartProviderClassName()
	 * @model
	 * @generated
	 */
	String getEditPartProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getEditPartProviderClassName <em>Edit Part Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Part Provider Class Name</em>' attribute.
	 * @see #getEditPartProviderClassName()
	 * @generated
	 */
	void setEditPartProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Edit Part Provider Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.ProviderPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Part Provider Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Part Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #setEditPartProviderPriority(ProviderPriority)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_EditPartProviderPriority()
	 * @model
	 * @generated
	 */
	ProviderPriority getEditPartProviderPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getEditPartProviderPriority <em>Edit Part Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Part Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #getEditPartProviderPriority()
	 * @generated
	 */
	void setEditPartProviderPriority(ProviderPriority value);

	/**
	 * Returns the value of the '<em><b>Modeling Assistant Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Assistant Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Assistant Provider Class Name</em>' attribute.
	 * @see #setModelingAssistantProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_ModelingAssistantProviderClassName()
	 * @model
	 * @generated
	 */
	String getModelingAssistantProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getModelingAssistantProviderClassName <em>Modeling Assistant Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Assistant Provider Class Name</em>' attribute.
	 * @see #getModelingAssistantProviderClassName()
	 * @generated
	 */
	void setModelingAssistantProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Modeling Assistant Provider Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.ProviderPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Assistant Provider Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Assistant Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #setModelingAssistantProviderPriority(ProviderPriority)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_ModelingAssistantProviderPriority()
	 * @model
	 * @generated
	 */
	ProviderPriority getModelingAssistantProviderPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getModelingAssistantProviderPriority <em>Modeling Assistant Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Assistant Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #getModelingAssistantProviderPriority()
	 * @generated
	 */
	void setModelingAssistantProviderPriority(ProviderPriority value);

	/**
	 * Returns the value of the '<em><b>Icon Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Provider Class Name</em>' attribute.
	 * @see #setIconProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_IconProviderClassName()
	 * @model
	 * @generated
	 */
	String getIconProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getIconProviderClassName <em>Icon Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Provider Class Name</em>' attribute.
	 * @see #getIconProviderClassName()
	 * @generated
	 */
	void setIconProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Icon Provider Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.ProviderPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Provider Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #setIconProviderPriority(ProviderPriority)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_IconProviderPriority()
	 * @model
	 * @generated
	 */
	ProviderPriority getIconProviderPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getIconProviderPriority <em>Icon Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #getIconProviderPriority()
	 * @generated
	 */
	void setIconProviderPriority(ProviderPriority value);

	/**
	 * Returns the value of the '<em><b>Parser Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parser Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parser Provider Class Name</em>' attribute.
	 * @see #setParserProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_ParserProviderClassName()
	 * @model annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Replaced with GenParsers'"
	 * @generated
	 */
	String getParserProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getParserProviderClassName <em>Parser Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser Provider Class Name</em>' attribute.
	 * @see #getParserProviderClassName()
	 * @generated
	 */
	void setParserProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Parser Provider Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.ProviderPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parser Provider Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parser Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #setParserProviderPriority(ProviderPriority)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_ParserProviderPriority()
	 * @model annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Replaced with GenParsers'"
	 * @generated
	 */
	ProviderPriority getParserProviderPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getParserProviderPriority <em>Parser Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser Provider Priority</em>' attribute.
	 * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
	 * @see #getParserProviderPriority()
	 * @generated
	 */
	void setParserProviderPriority(ProviderPriority value);

	/**
	 * Returns the value of the '<em><b>Contribution Item Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contribution Item Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribution Item Provider Class Name</em>' attribute.
	 * @see #setContributionItemProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getProviderClassNames_ContributionItemProviderClassName()
	 * @model annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Actions are no longer contributed using ContributionItemService'"
	 * @generated
	 */
	String getContributionItemProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.ProviderClassNames#getContributionItemProviderClassName <em>Contribution Item Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contribution Item Provider Class Name</em>' attribute.
	 * @see #getContributionItemProviderClassName()
	 * @generated
	 */
	void setContributionItemProviderClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getElementTypesQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getNotationViewProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEditPartProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getModelingAssistantProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getIconProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Replaced with GenParsers'"
	 * @generated
	 */
	String getParserProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/gmf/2006/deprecated documentation='Actions are no longer contributed using ContributionItemService'"
	 * @generated
	 */
	String getContributionItemProviderQualifiedClassName();

} // ProviderClassNames
