/******************************************************************************
   * Copyright (c) 2007 IBM Corporation and others.
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the Eclipse Public License v1.0
   * which accompanies this distribution, and is available at
   * http://www.eclipse.org/legal/epl-v10.html
   *
   * Contributors:
   *    IBM Corporation - initial API and implementation 
   ****************************************************************************/
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.ecore.EObject;
/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>String To Property Value Map Entry</b></em>'.
   * <!-- end-user-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.StringToPropertyValueMapEntry#getKey <em>Key</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.StringToPropertyValueMapEntry#getValue <em>Value</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.runtime.notation.NotationPackage#getStringToPropertyValueMapEntry()
   * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML MapEntry='null'"
   * @generated
   */
public interface StringToPropertyValueMapEntry extends EObject {
    /**
       * Returns the value of the '<em><b>Key</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Key</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Key</em>' attribute.
       * @see #setKey(String)
       * @see org.eclipse.gmf.runtime.notation.NotationPackage#getStringToPropertyValueMapEntry_Key()
       * @model required="true" ordered="false"
       * @generated
       */
    String getKey ();

    /**
       * Returns the value of the '<em><b>Value</b></em>' reference.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Value</em>' reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Value</em>' reference.
       * @see #setValue(PropertyValue)
       * @see org.eclipse.gmf.runtime.notation.NotationPackage#getStringToPropertyValueMapEntry_Value()
       * @model required="true" ordered="false"
       * @generated
       */
    PropertyValue getValue ();

}

// StringToPropertyValueMapEntry