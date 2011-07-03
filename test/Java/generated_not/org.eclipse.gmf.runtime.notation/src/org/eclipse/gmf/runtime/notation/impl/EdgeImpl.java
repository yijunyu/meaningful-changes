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
   * An implementation of the model object '<em><b>Edge</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getSource <em>Source</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getTarget <em>Target</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getBendpoints <em>Bendpoints</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getSourceAnchor <em>Source Anchor</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getTargetAnchor <em>Target Anchor</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ /*
   * @canBeSeenBy %partners
   */ public class EdgeImpl extends ViewImpl implements Edge {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public Bendpoints createBendpoints (EClass eClass) {
        Bendpoints newBendpoints = (Bendpoints) eClass.getEPackage ().getEFactoryInstance ().create (eClass);

        setBendpoints (newBendpoints);
        return newBendpoints;

    }

}

//EdgeImpl
