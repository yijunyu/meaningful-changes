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
   */ public class CanvasMappingContentsCanonicalEditPolicy extends CanonicalEditPolicy {
    /**
       * @generated NOT
       */
    protected List getSemanticChildrenList () {
        List result = new LinkedList ();

        EObject modelObject = ((View) getHost ().getModel ()).getElement ();

        View viewObject = (View) getHost ().getModel ();

        EObject nextValue;

        int nodeVID;

        for (Iterator values = ((Mapping) getNodesContainer ()).getNodes ().iterator ();
        values.hasNext ();) {
            nextValue = (EObject) values.next ();
            nodeVID = GMFMapVisualIDRegistry.getNodeVisualID (viewObject, nextValue);
            if (TopNodeReferenceEditPart.VISUAL_ID == nodeVID) {
                result.add (nextValue);
            }

        }

        return result;

    }

}

