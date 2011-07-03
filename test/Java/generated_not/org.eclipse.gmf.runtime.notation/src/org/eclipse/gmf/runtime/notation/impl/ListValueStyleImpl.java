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
   * An implementation of the model object '<em><b>List Value Style</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListValueStyleImpl#getRawValuesList <em>Raw Values List</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class ListValueStyleImpl extends DataTypeStyleImpl implements ListValueStyle {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList getRawValuesList () {
        if (rawValuesList == null) {
            rawValuesList = new EDataTypeEList (String.class, this, NotationPackage.LIST_VALUE_STYLE__RAW_VALUES_LIST) {
                final private static long serialVersionUID = - 7769354624338385073L;

                protected Object validate (int index, Object object) {
                    Object validated = super.validate (index, object);

                    if (validated != null && ! isInstance (validated)) throw new ArrayStoreException ();

                    try {
                        getObjectFromString ((String) validated);
                    }
                    catch (Exception e) {
                        throw new IllegalArgumentException ("Value <" + validated //$NON-NLS-1$ +
                          "> cannot be associated with Data type <" //$NON-NLS-1$ + getInstanceType ().toString () + ">: " + e.
                          getMessage ());

                    //$NON-NLS-1$}

                    return validated;

                }

            }

            ;
        }

        return rawValuesList;

    }

}

//ListValueStyleImpl
