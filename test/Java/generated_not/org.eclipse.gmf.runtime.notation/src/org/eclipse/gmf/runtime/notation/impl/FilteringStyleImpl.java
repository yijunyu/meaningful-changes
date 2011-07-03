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
   * An implementation of the model object '<em><b>Filtering Style</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FilteringStyleImpl#getFiltering <em>Filtering</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FilteringStyleImpl#getFilteringKeys <em>Filtering Keys</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FilteringStyleImpl#getFilteredObjects <em>Filtered Objects</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ /*
   * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
   */ public class FilteringStyleImpl extends NotationEObjectImpl implements FilteringStyle {
    /**
       * The default value of the '{@link #getFilteringKeys() <em>Filtering Keys</em>}' attribute.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #getFilteringKeys()
       * @generated NOT
       * @ordered
       */ /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public List getFilteringKeys () {
        return Collections.unmodifiableList (filteringKeys);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void setFilteringKeys (List newFilteringKeys) {
        List oldFilteringKeys = filteringKeys;

        if (newFilteringKeys == null) throw new NullPointerException ("the 'newFilteringKeys' parameter is null");
        //$NON-NLS-1$ else if (newFilteringKeys.isEmpty ()) filteringKeys = FILTERING_KEYS_EDEFAULT; else {
            List tempList = new ArrayList (newFilteringKeys.size ());

            for (Iterator i = newFilteringKeys.iterator ();
            i.hasNext ();) {
                Object key = i.next ();

                if (! (key instanceof String)) throw new IllegalArgumentException (
                  "One or more objects in the list is not of type java.lang.String");

                //$NON-NLS-1$ tempList.add (key);
            }

            filteringKeys = tempList;
        }

        if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.SET, NotationPackage.
          FILTERING_STYLE__FILTERING_KEYS, oldFilteringKeys, filteringKeys));

    }

}

//FilteringStyleImpl
