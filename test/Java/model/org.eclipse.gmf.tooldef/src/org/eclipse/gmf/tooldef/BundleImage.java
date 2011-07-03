/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.tooldef;

/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Bundle Image</b></em>'.
   * <!-- end-user-doc -->
   *
   * <!-- begin-model-doc -->
   * Image bundled as part of distribution
   * <!-- end-model-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.tooldef.BundleImage#getPath <em>Path</em>}</li>
   *   <li>{@link org.eclipse.gmf.tooldef.BundleImage#getBundle <em>Bundle</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.tooldef.GMFToolPackage#getBundleImage()
   * @model
   * @generated
   */
public interface BundleImage extends Image {
    /**
       * Returns the value of the '<em><b>Path</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Path</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * <!-- begin-model-doc -->
       * Relative path to image
       * <!-- end-model-doc -->
       * @return the value of the '<em>Path</em>' attribute.
       * @see #setPath(String)
       * @see org.eclipse.gmf.tooldef.GMFToolPackage#getBundleImage_Path()
       * @model
       * @generated
       */
    String getPath ();

    /**
       * Returns the value of the '<em><b>Bundle</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Bundle</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * <!-- begin-model-doc -->
       * Empty value means image path is relative to generated bundle
       * <!-- end-model-doc -->
       * @return the value of the '<em>Bundle</em>' attribute.
       * @see #setBundle(String)
       * @see org.eclipse.gmf.tooldef.GMFToolPackage#getBundleImage_Bundle()
       * @model
       * @generated
       */
    String getBundle ();

}

// BundleImage
