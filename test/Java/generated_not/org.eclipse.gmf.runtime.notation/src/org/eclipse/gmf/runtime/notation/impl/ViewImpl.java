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
   * <!-- begin-user-doc --> An implementation of the model object '<em><b>View</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#isVisible <em>Visible</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getType <em>Type</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#isMutable <em>Mutable</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getSourceEdges <em>Source Edges</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getTargetEdges <em>Target Edges</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getPersistedChildren <em>Persisted Children</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getStyles <em>Styles</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getElement <em>Element</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getDiagram <em>Diagram</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getTransientChildren <em>Transient Children</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ /*
   * @canBeSeenBy org.eclipse.gmf.runtime.notation.*
   */ abstract public class ViewImpl extends EModelElementImpl implements View {
    /**
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated NOT
       */
    public void setType (String newType) {
        String oldType = type;

        type = (newType == null) ? null : newType.intern ();
        if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.SET, NotationPackage.VIEW__TYPE,
          oldType, type));

    }

    /**
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated NOT
       */
    public EObject getElement () {
        if (! isSetElement ()) {
            EObject container = eContainer ();

            if (container instanceof View) {
                View view = (View) container;

                element = view.getElement ();
            }

        }

        if (element != null && element.eIsProxy ()) {
            EObject oldElement = element;

            element = eResolveProxy ((InternalEObject) element);
            if (element != oldElement) {
                if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.RESOLVE, NotationPackage.
                  VIEW__ELEMENT, oldElement, element));

            }

        }

        return element;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public NamedStyle getNamedStyle (EClass eClass, String name) {
        if (eClass != null && eIsSet (NotationPackage.Literals.VIEW__STYLES) && NotationPackage.eINSTANCE.getNamedStyle ().
          isSuperTypeOf (eClass)) {
            for (Iterator i = getStyles ().iterator ();
            i.hasNext ();) {
                Style style = (Style) i.next ();

                if (style.eClass () == eClass || eClass.isInstance (style)) if (style.eGet (NotationPackage.eINSTANCE.
                  getNamedStyle_Name ()).equals (name)) return (NamedStyle) style;

            }

        }

        return null;

    }

}

// ViewImpl
