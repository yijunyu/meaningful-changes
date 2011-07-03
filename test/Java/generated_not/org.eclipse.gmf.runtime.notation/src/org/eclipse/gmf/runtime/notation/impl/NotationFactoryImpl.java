/******************************************************************************
   * Copyright (c) 2004, 2008 IBM Corporation and others.
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
   * An implementation of the model <b>Factory</b>.
   * <!-- end-user-doc -->
   * @generated
   */ /*
   * @canBeSeenBy %partners
   */ public class NotationFactoryImpl extends EFactoryImpl implements NotationFactory {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public List createRelativeBendpointListFromString (EDataType eDataType, String initialValue) {
        StringTokenizer st = new StringTokenizer (initialValue, "$");

        //$NON-NLS-1$ List newList = new ArrayList (st.countTokens ());

        while (st.hasMoreTokens ()) newList.add (new RelativeBendpoint (st.nextToken ().trim ()));

        return newList;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String convertRelativeBendpointListToString (EDataType eDataType, Object instanceValue) {
        StringBuffer sb = new StringBuffer ();

        for (Iterator i = ((List) instanceValue).iterator ();
        i.hasNext ();) {
            RelativeBendpoint point = (RelativeBendpoint) i.next ();

            if (sb.length () != 0) sb.append ('$');

            sb.append (point.convertToString ());
        }

        return sb.toString ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public List createFilterKeyListFromString (EDataType eDataType, String initialValue) {
        StringTokenizer st = new StringTokenizer (initialValue, ",");

        //$NON-NLS-1$ List newList = new ArrayList (st.countTokens ());

        while (st.hasMoreTokens ()) newList.add (st.nextToken ().trim ());

        return newList;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String convertFilterKeyListToString (EDataType eDataType, Object instanceValue) {
        StringBuffer sb = new StringBuffer ();

        for (Iterator i = ((List) instanceValue).iterator ();
        i.hasNext ();) {
            String key = (String) i.next ();

            if (sb.length () != 0) sb.append (',');

            sb.append (key);
        }

        return sb.toString ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public Map createSortKeyMapFromString (EDataType eDataType, String initialValue) {
        StringTokenizer st = new StringTokenizer (initialValue, ",");

        //$NON-NLS-1$ Map newMap = new LinkedHashMap (st.countTokens ());

        String s;

        int i;

        while (st.hasMoreTokens ()) {
            s = st.nextToken ().trim ();
            i = s.indexOf (':');
            newMap.put (s.substring (0, i).trim (), SortingDirection.get (s.substring (i + 1).trim ()));
        }

        return newMap;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String convertSortKeyMapToString (EDataType eDataType, Object instanceValue) {
        StringBuffer sb = new StringBuffer ();

        Map keyMap = (Map) instanceValue;

        for (Iterator i = keyMap.keySet ().iterator ();
        i.hasNext ();) {
            String key = (String) i.next ();

            SortingDirection direction = (SortingDirection) keyMap.get (key);

            if (sb.length () != 0) sb.append (',');

            sb.append (key + ":" + direction.getName ());
        //$NON-NLS-1$}

        return sb.toString ();

    }

}

//NotationFactoryImpl
