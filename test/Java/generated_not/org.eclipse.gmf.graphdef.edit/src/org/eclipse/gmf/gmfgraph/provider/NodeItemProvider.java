/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.gmfgraph.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.Node} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class NodeItemProvider extends AbstractNodeItemProvider implements IEditingDomainItemProvider, IItemLabelProvider,
  IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    @Override
    public String getText (Object object) {
        FigureDescriptor fd = ((Node) object).getFigure ();

        if (fd != null && fd.getName () != null) {
            return getTextGen (object) + ' ' + '(' + fd.getName () + ')';

        }

        return getTextGen (object);

    }

}

