/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Shared Contribution Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to the shared contribution item
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenSharedContributionItem#getActualItem <em>Actual Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenSharedContributionItem()
 * @model
 * @generated
 */
public interface GenSharedContributionItem extends GenContributionItem {
	/**
	 * Returns the value of the '<em><b>Actual Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Item</em>' reference.
	 * @see #setActualItem(GenContributionItem)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenSharedContributionItem_ActualItem()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not actualItem.oclIsKindOf(gmfgen::GenSharedContributionItem)' description='Actual contribution item can\'t be a reference'"
	 * @generated
	 */
	GenContributionItem getActualItem();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenSharedContributionItem#getActualItem <em>Actual Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Item</em>' reference.
	 * @see #getActualItem()
	 * @generated
	 */
	void setActualItem(GenContributionItem value);

} // GenSharedContributionItem
