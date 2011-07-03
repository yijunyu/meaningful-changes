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
   * An implementation of the model object '<em><b>Font Style</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#getFontColor <em>Font Color</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#getFontName <em>Font Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#getFontHeight <em>Font Height</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#isBold <em>Bold</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#isItalic <em>Italic</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#isUnderline <em>Underline</em>}</li>
   *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#isStrikeThrough <em>Strike Through</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ /*
   * @canBeSeenBy %partners
   */ public class FontStyleImpl extends NotationEObjectImpl implements FontStyle {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void setFontName (String newFontName) {
        String oldFontName = fontName;

        fontName = (newFontName == null) ? null : newFontName;
        if (eNotificationRequired ()) eNotify (new ENotificationImpl (this, Notification.SET, NotationPackage.
          FONT_STYLE__FONT_NAME, oldFontName, fontName));

    }

}

//FontStyleImpl
