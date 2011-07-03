/*
   * Copyright (c) 2006 Borland Software Corporation
   * 
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the Eclipse Public License v1.0
   * which accompanies this distribution, and is available at
   * http://www.eclipse.org/legal/epl-v10.html
   *
   * Contributors:
   *    Dmitry Stadnik (Borland) - initial API and implementation
   */ package org.eclipse.gmf.map.editor.edit.policies;

/**
   * @generated
   */ public class CanvasMappingItemSemanticEditPolicy extends GMFMapBaseItemSemanticEditPolicy {
    /**
       * @generated NOT
       */
    protected Command getDestroyElementCommand (DestroyElementRequest req) {
        return UnexecutableCommand.INSTANCE;

    //		return getMSLWrapper(new DestroyElementCommand(req) {// //			protected EObject getElementToDestroy() {
      //				View view = (View) getHost().getModel();
      //				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$ //				if (annotation != null) {
      //					return view; //				} //				return super.getElementToDestroy(); //			} // //		});}

}

