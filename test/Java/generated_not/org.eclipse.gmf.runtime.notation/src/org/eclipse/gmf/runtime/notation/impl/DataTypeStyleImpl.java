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
   * An implementation of the model object '<em><b>Data Type Style</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DataTypeStyleImpl#getInstanceType <em>Instance Type</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class DataTypeStyleImpl extends NamedStyleImpl implements DataTypeStyle {
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

//DataTypeStyleImpl
