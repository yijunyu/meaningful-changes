/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.gmfgraph.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Abstract Figure</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getLayoutData <em>Layout Data</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getLayout <em>Layout</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getDescriptor <em>Descriptor</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getForegroundColor <em>Foreground Color</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getBackgroundColor <em>Background Color</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getMaximumSize <em>Maximum Size</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getMinimumSize <em>Minimum Size</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getPreferredSize <em>Preferred Size</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getFont <em>Font</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getInsets <em>Insets</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getBorder <em>Border</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getLocation <em>Location</em>}</li>
   *   <li>{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl#getSize <em>Size</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ abstract public class AbstractFigureImpl extends EObjectImpl implements AbstractFigure {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public FigureDescriptor getDescriptor () {
        if (eContainer () instanceof FigureDescriptor) {
            return (FigureDescriptor) eContainer ();

        }

        if (eContainer () instanceof Figure) {
            return ((Figure) eContainer ()).getDescriptor ();

        }

        return null;

    }

}

//AbstractFigureImpl
