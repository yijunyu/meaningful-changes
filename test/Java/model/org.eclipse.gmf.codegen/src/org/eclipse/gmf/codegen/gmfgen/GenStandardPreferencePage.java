/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.codegen.gmfgen;

/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Gen Standard Preference Page</b></em>'.
   * <!-- end-user-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenStandardPreferencePage#getKind <em>Kind</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenStandardPreferencePage#getClassName <em>Class Name</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenStandardPreferencePage()
   * @model
   * @generated
   */
public interface GenStandardPreferencePage extends GenPreferencePage {
    /**
       * Returns the value of the '<em><b>Kind</b></em>' attribute.
       * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.StandardPreferencePages}.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Kind</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Kind</em>' attribute.
       * @see org.eclipse.gmf.codegen.gmfgen.StandardPreferencePages
       * @see #setKind(StandardPreferencePages)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenStandardPreferencePage_Kind()
       * @model required="true"
       * @generated
       */
    StandardPreferencePages getKind ();

    /**
       * Returns the value of the '<em><b>Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Class Name</em>' attribute.
       * @see #setClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenStandardPreferencePage_ClassName()
       * @model
       * @generated
       */
    String getClassName ();

}

// GenStandardPreferencePage
