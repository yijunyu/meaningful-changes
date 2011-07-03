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
   * An implementation of the model object '<em><b>Sorting Style</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.SortingStyleImpl#getSorting <em>Sorting</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.SortingStyleImpl#getSortingKeys <em>Sorting Keys</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.SortingStyleImpl#getSortedObjects <em>Sorted Objects</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ /*
   * @canBeSeenBy %partners
   */ public class SortingStyleImpl extends NotationEObjectImpl implements SortingStyle {
    /**
       * The default value of the '{@link #getSortingKeys() <em>Sorting Keys</em>}' attribute.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #getSortingKeys()
       * @generated NOT
       * @ordered
       */ /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public Map getSortingKeys () {
        return Collections.unmodifiableMap (sortingKeys);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void setSortingKeys (Map newSortingKeys) {
        Map oldSortingKeys = sortingKeys;

        if (newSortingKeys == null) throw new NullPointerException ("the 'newSortingKeys' parameter is null");
        //$NON-NLS-1$ else if (newSortingKeys.isEmpty ()) sortingKeys = SORTING_KEYS_EDEFAULT; else {
            Map tempMap = new LinkedHashMap (newSortingKeys.size ());

            for (Iterator i = newSortingKeys.keySet ().iterator ();
            i.hasNext ();) {
                Object key = i.next ();

                if (! (key instanceof String)) throw new IllegalArgumentException (
                  "One or more keys in the map is not of type java.lang.String");

                //$NON-NLS-1$ Object value = newSortingKeys.get (key);

                if (! (value instanceof SortingDirection)) throw new IllegalArgumentException (
                  "One or more values in the map is not of type org.eclipse.gmf.runtime.notation.SortingDirection");

                //$NON-NLS-1$ tempMap.put (key, value);
            }

            sortingKeys = tempMap;
        }

        if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.SET, NotationPackage.
          SORTING_STYLE__SORTING_KEYS, oldSortingKeys, sortingKeys));

    }

}

//SortingStyleImpl
