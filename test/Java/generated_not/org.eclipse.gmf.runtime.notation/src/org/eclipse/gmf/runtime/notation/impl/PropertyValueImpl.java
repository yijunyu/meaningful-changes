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
   * An implementation of the model object '<em><b>Property Value</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PropertyValueImpl#getRawValue <em>Raw Value</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PropertyValueImpl#getInstanceType <em>Instance Type</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class PropertyValueImpl extends NotationEObjectImpl implements PropertyValue {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void setRawValue (String newRawValue) {
        if (getInstanceType () != null) {
            try {
                getObjectFromString (newRawValue);
            }
            catch (Exception e) {
                throw new IllegalArgumentException ("Value <" + newRawValue //$NON-NLS-1$ +
                  "> cannot be associated with Data type <" //$NON-NLS-1$ + getInstanceType ().toString () + ">: " + e.
                  getMessage ());

            //$NON-NLS-1$}

        }

        String oldRawValue = rawValue;

        rawValue = newRawValue;
        if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.SET, NotationPackage.
          PROPERTY_VALUE__RAW_VALUE, oldRawValue, rawValue));

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public Object getValue () {
        return getObjectFromString (getRawValue ());

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void setValue (Object newValue) {
        setRawValue (getStringFromObject (newValue));
    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getStringFromObject (Object objectValue) {
        if (getInstanceType () == null && objectValue instanceof String) return (String) objectValue;

        return EcoreUtil.convertToString (getInstanceType (), objectValue);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public Object getObjectFromString (String stringValue) {
        if (getInstanceType () == null) return stringValue;

        return EcoreUtil.createFromString (getInstanceType (), stringValue);

    }

}

//PropertyValueImpl
