/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.gmfgraph.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Shape</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isOutline <em>Outline</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isFill <em>Fill</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getLineWidth <em>Line Width</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getLineKind <em>Line Kind</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isXorFill <em>Xor Fill</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#isXorOutline <em>Xor Outline</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl#getResolvedChildren <em>Resolved Children</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ abstract public class ShapeImpl extends RealFigureImpl implements Shape {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < Figure > getResolvedChildren () {
        ArrayList < Figure > r = new ArrayList < Figure > (getChildren ().size ());

        for (Figure next : getChildren ()) {
            if (next instanceof FigureRef) {
                r.add (((FigureRef) next).getFigure ());
            }
            else {
                r.add (next);
            }

        }

        return new EcoreEList.UnmodifiableEList < Figure > (this, GMFGraphPackage.eINSTANCE.getShape_ResolvedChildren (), r.
          size (), r.toArray ());

    }

}

//ShapeImpl
