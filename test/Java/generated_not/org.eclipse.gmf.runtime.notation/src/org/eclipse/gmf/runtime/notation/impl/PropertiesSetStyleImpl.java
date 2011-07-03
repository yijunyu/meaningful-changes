/******************************************************************************
   * Copyright (c) 2007 IBM Corporation and others.
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the Eclipse Public License v1.0
   * which accompanies this distribution, and is available at
   * http://www.eclipse.org/legal/epl-v10.html
   *
   * Contributors:
   *    IBM Corporation - initial API and implementation 
   ****************************************************************************/ package org.eclipse.gmf.runtime.notation.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Properties Set Style</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PropertiesSetStyleImpl#getPropertiesMap <em>Properties Map</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class PropertiesSetStyleImpl extends NamedStyleImpl implements PropertiesSetStyle {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public Object getProperty (String propertyName) {
        if (hasProperty (propertyName)) {
            return ((PropertyValue) getPropertiesMap ().get (propertyName)).getValue ();

        }

        return null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean setProperty (String propertyName, Object newValue) {
        if (hasProperty (propertyName)) {
            ((PropertyValue) getPropertiesMap ().get (propertyName)).setValue (newValue);
            return true;

        }

        return false;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean createProperty (String propertyName, EDataType instanceType, Object initialValue) {
        if (propertyName != null && ! hasProperty (propertyName)) {
            PropertyValue value = NotationFactory.eINSTANCE.createPropertyValue ();

            if (instanceType == null) {
                if (initialValue instanceof String) value.setRawValue ((String) initialValue); else return false;

            }
            else {
                value.setInstanceType (instanceType);
                value.setValue (initialValue);
            }

            return getPropertiesMap ().put (propertyName, value) == null;

        }

        return false;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean removeProperty (String propertyName) {
        return getPropertiesMap ().removeKey (propertyName) != null;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean hasProperty (String propertyName) {
        return getPropertiesMap ().containsKey (propertyName);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean createProperty (String propertyName, String initialValue) {
        if (! hasProperty (propertyName)) {
            PropertyValue value = NotationFactory.eINSTANCE.createPropertyValue ();

            value.setRawValue (initialValue);
            return getPropertiesMap ().put (propertyName, value) == null;

        }

        return false;

    }

}

//PropertiesSetStyleImpl
