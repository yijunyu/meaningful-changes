/*
   *  Copyright (c) 2006, 2007 Borland Software Corporation and others.
   *  All rights reserved. This program and the accompanying materials
   *  are made available under the terms of the Eclipse Public License v1.0
   *  which accompanies this distribution, and is available at
   *  http://www.eclipse.org/legal/epl-v10.html
   * 
   *  Contributors:
   *      Borland Software Corporation - initial API and implementation
   */ package org.eclipse.gmf.graphdef.editor.edit.parts;

/**
   * @generated
   */ public class FigureGalleryEditPart extends ShapeNodeEditPart {
    /**
       * Default implementation treats passed figure as content pane.
       * Respects layout one may have set for generated figure.
       * @param nodeShape instance of generated figure class
       * @generated NOT
       */
    protected IFigure setupContentPane (IFigure nodeShape) {
        FigureGalleryFigure fgFigure = (FigureGalleryFigure) nodeShape;

        IFigure contentPane = fgFigure.getFigureFigureGalleryFigure_ChildContainer ();

        if (contentPane.getLayoutManager () == null) {
            ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout ();

            layout.setSpacing (getMapMode ().DPtoLP (5));
            contentPane.setLayoutManager (layout);
        }

        return contentPane;

    // use nodeShape itself as contentPane}

}

