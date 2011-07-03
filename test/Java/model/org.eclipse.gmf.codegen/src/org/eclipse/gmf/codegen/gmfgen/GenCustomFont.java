/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.codegen.gmfgen;

/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Gen Custom Font</b></em>'.
   * <!-- end-user-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCustomFont#getName <em>Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCustomFont#getHeight <em>Height</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCustomFont#getStyle <em>Style</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomFont()
   * @model
   * @generated
   */
public interface GenCustomFont extends GenFont {
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
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomFont_Name()
       * @model
       * @generated
       */
    String getName ();

    /**
       * Returns the value of the '<em><b>Height</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Height</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Height</em>' attribute.
       * @see #setHeight(int)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomFont_Height()
       * @model
       * @generated
       */
    int getHeight ();

    /**
       * Returns the value of the '<em><b>Style</b></em>' attribute.
       * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.FontStyle}.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Style</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Style</em>' attribute.
       * @see org.eclipse.gmf.codegen.gmfgen.FontStyle
       * @see #setStyle(FontStyle)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCustomFont_Style()
       * @model
       * @generated
       */
    FontStyle getStyle ();

}

// GenCustomFont
