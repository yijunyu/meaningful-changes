/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.tooldef.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Generic Style Selector</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.tooldef.impl.GenericStyleSelectorImpl#getValues <em>Values</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenericStyleSelectorImpl extends EObjectImpl implements GenericStyleSelector {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean isOk (Object style) {
        if (false == style instanceof EObject) {
            return false;

        }

        final String styleName = ((EObject) style).eClass ().getName ();

        for (AppearanceStyle s : getValues ()) {
            if (styleName.equals (s.getName () + "Style")) {
                return true;

            }

        }

        return false;

    }

}

//GenericStyleSelectorImpl
