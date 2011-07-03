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
   * An implementation of the model object '<em><b>Relative Bendpoints</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RelativeBendpointsImpl#getPoints <em>Points</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ /*
   * @canBeSeenBy %partners
   */ public class RelativeBendpointsImpl extends NotationEObjectImpl implements RelativeBendpoints {
    /**
       * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see #getPoints()
       * @generated NOT
       * @ordered
       */ /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public List getPoints () {
        return Collections.unmodifiableList (points);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void setPoints (List newPoints) {
        List oldPoints = points;

        if (newPoints == null) throw new NullPointerException ("the 'newPoints' parameter is null");
        //$NON-NLS-1$ else if (newPoints.isEmpty ()) points = POINTS_EDEFAULT; else {
            List tempList = new ArrayList (newPoints.size ());

            for (Iterator i = newPoints.iterator ();
            i.hasNext ();) {
                Object point = i.next ();

                if (! (point instanceof RelativeBendpoint)) throw new IllegalArgumentException (
                  "One or more objects in the list is not of type org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint")
                  ;

                //$NON-NLS-1$ tempList.add (point);
            }

            points = tempList;
        }

        if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.SET, NotationPackage.
          RELATIVE_BENDPOINTS__POINTS, Collections.unmodifiableList (oldPoints), Collections.unmodifiableList (points)));

    }

}

//RelativeBendpointsImpl
