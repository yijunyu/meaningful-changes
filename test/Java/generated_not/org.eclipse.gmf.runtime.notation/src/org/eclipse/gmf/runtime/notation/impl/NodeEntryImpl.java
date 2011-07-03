/******************************************************************************
   * Copyright (c) 2004, 2006 IBM Corporation and others.
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
   * An implementation of the model object '<em><b>Node Entry</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.NodeEntryImpl#getTypedValue <em>Value</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.NodeEntryImpl#getTypedKey <em>Key</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ /*
   * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
   */ public class NodeEntryImpl extends NotationEObjectImpl implements BasicEMap.Entry {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public Node getTypedKey () {
        if (key != null && key.eIsProxy ()) {
            EObject oldKey = key;

            key = (Node) eResolveProxy ((InternalEObject) key);
            if (key != oldKey) {
                if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.RESOLVE, NotationPackage.
                  NODE_ENTRY__KEY, oldKey, key));

            }

        }

        return key;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void setTypedKey (Node newKey) {
        Node oldKey = key;

        key = newKey;
        if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.SET, NotationPackage.NODE_ENTRY__KEY,
          oldKey, key));

    }

}

//NodeEntryImpl
