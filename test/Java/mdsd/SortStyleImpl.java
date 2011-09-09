/******************************************************************************
   * Copyright (c) 2004 IBM Corporation and others.
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the Eclipse Public License v1.0
   * which accompanies this distribution, and is available at
   * http://www.eclipse.org/legal/epl-v10.html
   *
   * Contributors:
   *    IBM Corporation - initial API and implementation 
   ****************************************************************************/
package org.eclipse.gmf.runtime.notation.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Sorting;
import org.eclipse.gmf.runtime.notation.SortingDirection;
import org.eclipse.gmf.runtime.notation.SortingStyle;
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
   */
public class SortingStyleImpl extends EObjectImpl implements SortingStyle {
    /**
       * The default value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #getSorting()
       * @generated
       * @ordered
       */
    final protected static Sorting SORTING_EDEFAULT = Sorting.NONE_LITERAL;
    /**
       * The cached value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #getSorting()
       * @generated
       * @ordered
       */
    protected Sorting sorting = SORTING_EDEFAULT;
    /**
       * <!-- begin-user-doc -->
       protected static final Map SORTING_KEYS_EDEFAULT = Collections.EMPTY_MAP;
       * <!-- end-user-doc -->
       * @generated 
       */
    final protected static Map SORTING_KEYS_EDEFAULT = Collections.EMPTY_MAP;
    /**
       * The cached value of the '{@link #getSortingKeys() <em>Sorting Keys</em>}' attribute.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #getSortingKeys()
       * @generated
       * @ordered
       */
    protected Map sortingKeys = SORTING_KEYS_EDEFAULT;
    /**
       * The cached value of the '{@link #getSortedObjects() <em>Sorted Objects</em>}' reference list.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #getSortedObjects()
       * @generated
       * @ordered
       */
    protected EList sortedObjects = null;
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    protected SortingStyleImpl () {

        super ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    protected EClass eStaticClass () {

        return NotationPackage.eINSTANCE.getSortingStyle ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public Sorting getSorting () {

        return sorting;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public void setSorting (Sorting newSorting) {

        Sorting oldSorting = sorting;

        sorting = newSorting == null ? SORTING_EDEFAULT : newSorting;

        if (eNotificationRequired ())
        eNotify (new ENotificationImpl (this, Notification.SET, NotationPackage.SORTING_STYLE__SORTING, oldSorting, sorting));

    }

    /**
       * <!-- begin-user-doc -->
       public Map getSortingKeys () {return Collections.unmodifiableMap (sortingKeys);}
       * <!-- end-user-doc -->
       * @generated 
       */
    public Map getSortingKeys () {

        return Collections.unmodifiableMap (sortingKeys);

    }

    /**
       * <!-- begin-user-doc -->
    public void setSortingKeys (Map newSortingKeys) {Map oldSortingKeys = sortingKeys; if (newSortingKeys == null) throw new NullPointerException ("the 'newSortingKeys' parameter is null"); else if (newSortingKeys.isEmpty ()) sortingKeys = SORTING_KEYS_EDEFAULT; else {Map tempMap = new LinkedHashMap (newSortingKeys.size ()); for (Iterator i = newSortingKeys.keySet ().iterator (); i.hasNext ();) {Object key = i.next (); if (! (key instanceof String)) throw new IllegalArgumentException ("One or more keys in the map is not of type java.lang.String"); Object value = newSortingKeys.get (key); if (! (value instanceof SortingDirection)) throw new IllegalArgumentException ("One or more values in the map is not of type org.eclipse.gmf.runtime.notation.SortingDirection"); tempMap.put (key, value);} sortingKeys = tempMap;} if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.SET, NotationPackage.SORTING_STYLE__SORTING_KEYS, oldSortingKeys, sortingKeys));}
       * <!-- end-user-doc -->
       * @generated 
       */
    public void setSortingKeys (Map newSortingKeys) {

        Map oldSortingKeys = sortingKeys;

        if (newSortingKeys == null)
        throw new NullPointerException ("the 'newSortingKeys' parameter is null");

        else
        if (newSortingKeys.isEmpty ())
        sortingKeys = SORTING_KEYS_EDEFAULT;
        else
        {

            Map tempMap = new LinkedHashMap (newSortingKeys.size ());

            for (Iterator i = newSortingKeys.keySet ().iterator ();
            i.hasNext ();)
            {

                Object key = i.next ();

                if (! (key instanceof String))
                throw new IllegalArgumentException ("One or more keys in the map is not of type java.lang.String");

                Object value = newSortingKeys.get (key);

                if (! (value instanceof SortingDirection))
                throw new IllegalArgumentException ("One or more values in the map is not of type org.eclipse.gmf.runtime.notation.SortingDirection");

                tempMap.put (key, value);

            }

            sortingKeys = tempMap;

        }

        if (eNotificationRequired ())
        eNotify (new ENotificationImpl (this, Notification.SET, NotationPackage.SORTING_STYLE__SORTING_KEYS, oldSortingKeys, sortingKeys));

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public EList getSortedObjects () {

        if (sortedObjects == null)
        {

            sortedObjects = new EObjectResolvingEList (EObject.class, this, NotationPackage.SORTING_STYLE__SORTED_OBJECTS);

        }

        return sortedObjects;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public Object eGet (EStructuralFeature eFeature, boolean resolve) {

        switch (eDerivedStructuralFeatureID (eFeature)) {
            case NotationPackage.SORTING_STYLE__SORTING :

                return getSorting ();

            case NotationPackage.SORTING_STYLE__SORTING_KEYS :

                return getSortingKeys ();

            case NotationPackage.SORTING_STYLE__SORTED_OBJECTS :

                return getSortedObjects ();

        }

        return eDynamicGet (eFeature, resolve);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public void eSet (EStructuralFeature eFeature, Object newValue) {

        switch (eDerivedStructuralFeatureID (eFeature)) {
            case NotationPackage.SORTING_STYLE__SORTING :

                setSorting ((Sorting) newValue);

                return;

            case NotationPackage.SORTING_STYLE__SORTING_KEYS :

                setSortingKeys ((Map) newValue);

                return;

            case NotationPackage.SORTING_STYLE__SORTED_OBJECTS :

                getSortedObjects ().clear ();

                getSortedObjects ().addAll ((Collection) newValue);

                return;

        }

        eDynamicSet (eFeature, newValue);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public void eUnset (EStructuralFeature eFeature) {

        switch (eDerivedStructuralFeatureID (eFeature)) {
            case NotationPackage.SORTING_STYLE__SORTING :

                setSorting (SORTING_EDEFAULT);

                return;

            case NotationPackage.SORTING_STYLE__SORTING_KEYS :

                setSortingKeys (SORTING_KEYS_EDEFAULT);

                return;

            case NotationPackage.SORTING_STYLE__SORTED_OBJECTS :

                getSortedObjects ().clear ();

                return;

        }

        eDynamicUnset (eFeature);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public boolean eIsSet (EStructuralFeature eFeature) {

        switch (eDerivedStructuralFeatureID (eFeature)) {
            case NotationPackage.SORTING_STYLE__SORTING :

                return sorting != SORTING_EDEFAULT;

            case NotationPackage.SORTING_STYLE__SORTING_KEYS :

                return SORTING_KEYS_EDEFAULT == null ? sortingKeys != null : ! SORTING_KEYS_EDEFAULT.equals (sortingKeys);

            case NotationPackage.SORTING_STYLE__SORTED_OBJECTS :

                return sortedObjects != null && ! sortedObjects.isEmpty ();

        }

        return eDynamicIsSet (eFeature);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
    public String toString () {

        if (eIsProxy ())
        return super.toString ();

        StringBuffer result = new StringBuffer (super.toString ());

        result.append (" (sorting: ");

        //$NON-NLS-1$ result.append (sorting);

        result.append (", sortingKeys: ");

        //$NON-NLS-1$ result.append (sortingKeys);

        result.append (')');

        return result.toString ();

    }

}

//SortingStyleImpl
