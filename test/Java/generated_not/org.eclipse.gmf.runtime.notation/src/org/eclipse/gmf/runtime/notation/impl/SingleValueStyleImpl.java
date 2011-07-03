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
   * An implementation of the model object '<em><b>Single Value Style</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.SingleValueStyleImpl#getRawValue <em>Raw Value</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class SingleValueStyleImpl extends DataTypeStyleImpl implements SingleValueStyle {
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
          SINGLE_VALUE_STYLE__RAW_VALUE, oldRawValue, rawValue));

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

}

//SingleValueStyleImpl
