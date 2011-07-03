/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.codegen.gmfgen;

/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Gen Command Action</b></em>'.
   * <!-- end-user-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommandAction#getCommandIdentifier <em>Command Identifier</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommandAction#getName <em>Name</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommandAction()
   * @model
   * @generated
   */
public interface GenCommandAction extends GenContributionItem {
    /**
       * Returns the value of the '<em><b>Command Identifier</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Command Identifier</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Command Identifier</em>' attribute.
       * @see #setCommandIdentifier(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommandAction_CommandIdentifier()
       * @model required="true"
       * @generated
       */
    String getCommandIdentifier ();

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
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommandAction_Name()
       * @model
       * @generated
       */
    String getName ();

}

// GenCommandAction
