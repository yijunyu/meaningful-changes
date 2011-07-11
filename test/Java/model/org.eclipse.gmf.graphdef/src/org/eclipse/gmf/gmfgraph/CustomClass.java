/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Custom Class</b></em>'.
   * <!-- end-user-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.gmfgraph.CustomClass#getQualifiedClassName <em>Qualified Class Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.CustomClass#getAttributes <em>Attributes</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomClass()
   * @model interface="true" abstract="true"
   * @generated
   */
public interface CustomClass extends EObject {
    /**
       * Returns the value of the '<em><b>Qualified Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Qualified Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Qualified Class Name</em>' attribute.
       * @see #setQualifiedClassName(String)
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomClass_QualifiedClassName()
       * @model
       * @generated
       */
    String getQualifiedClassName ();

    /**
       * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
       * The list contents are of type {@link org.eclipse.gmf.gmfgraph.CustomAttribute}.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Attributes</em>' containment reference list.
       * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomClass_Attributes()
       * @model containment="true"
       * @generated
       */
    EList < CustomAttribute > getAttributes ();

}

// CustomClass