/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Viewmap</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl#getAttributes <em>Attributes</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl#getRequiredPluginIDs <em>Required Plugin IDs</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.ViewmapImpl#getLayoutType <em>Layout Type</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ abstract public class ViewmapImpl extends EObjectImpl implements Viewmap {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public Attributes find (Class attributesClass) {
        for (Attributes next : getAttributes ()) {
            if (attributesClass.isInstance (next)) {
                return next;

            }

        }

        return null;

    }

}

//ViewmapImpl
