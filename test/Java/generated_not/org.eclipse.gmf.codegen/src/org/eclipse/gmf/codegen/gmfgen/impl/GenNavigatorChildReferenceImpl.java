/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Navigator Child Reference</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getNavigator <em>Navigator</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getParent <em>Parent</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getChild <em>Child</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getReferenceType <em>Reference Type</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getGroupName <em>Group Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#getGroupIcon <em>Group Icon</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNavigatorChildReferenceImpl#isHideIfEmpty <em>Hide If Empty</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenNavigatorChildReferenceImpl extends EObjectImpl implements GenNavigatorChildReference {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean isInsideGroup () {
        return getGroupName () != null && getGroupName ().length () > 0;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenNavigatorPath > findConnectionPaths () {
        Collection < GenNavigatorPath > result = new ArrayList < GenNavigatorPath > ();

        for (List < GenCommonBase > nextPath : GenModelGraphAnalyzer.getConnectionPaths (this)) {
            GenNavigatorPath navigatorPath = GMFGenFactory.eINSTANCE.createGenNavigatorPath ();

            for (int i = 0;
            i < nextPath.size () - 1;) {
                GenNavigatorPathSegment nextSegment = GMFGenFactory.eINSTANCE.createGenNavigatorPathSegment ();

                nextSegment.setFrom (nextPath.get (i));
                nextSegment.setTo (nextPath.get (++ i));
                navigatorPath.getSegments ().add (nextSegment);
            }

            result.add (navigatorPath);
        }

        return new UnmodifiableEList < GenNavigatorPath > (result.size (), result.toArray ());

    }

}

//GenNavigatorChildReferenceImpl
