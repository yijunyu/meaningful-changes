/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.gmfgraph.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.Compartment} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class CompartmentItemProvider extends DiagramElementItemProvider implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getText (Object object) {
        String textGen = getTextGen (object);

        FigureDescriptor figureDescriptor = ((Compartment) object).getFigure ();

        if (figureDescriptor != null && figureDescriptor.getName () != null) {
            textGen += " (" + figureDescriptor.getName () + ")";
        }

        return textGen;

    }

}

