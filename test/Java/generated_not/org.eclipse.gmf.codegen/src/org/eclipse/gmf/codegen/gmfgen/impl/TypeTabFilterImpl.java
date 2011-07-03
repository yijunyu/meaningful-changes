/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Type Tab Filter</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeTabFilterImpl#getTab <em>Tab</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeTabFilterImpl#getTypes <em>Types</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.TypeTabFilterImpl#getGeneratedTypes <em>Generated Types</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class TypeTabFilterImpl extends EObjectImpl implements TypeTabFilter {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < String > getAllTypes () {
        ArrayList < String > result = new ArrayList < String > ();

        result.addAll (getTypes ());
        if (getGeneratedTypes ().size () > 0) {
            for (GeneratedType nextGeneratedType : getGeneratedTypes ()) {
                if (nextGeneratedType == GeneratedType.ABSTRACT_NAVIGATOR_ITEM_LITERAL) {
                    GenNavigator navigator = getTab ().getSheet ().getEditorGen ().getNavigator ();

                    if (navigator != null) {
                        result.add (navigator.getAbstractNavigatorItemQualifiedClassName ());
                    }

                }

            }

        }

        return new BasicEList.UnmodifiableEList < String > (result.size (), result.toArray ());

    }

}

//TypeTabFilterImpl
