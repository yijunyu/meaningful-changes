/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.gmfgraph.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.Dimension} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class DimensionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IItemLabelProvider,
  IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getText (Object object) {
        Dimension dimension = (Dimension) object;

        String prefix = "";

        if (dimension.eContainer () instanceof Figure) {
            Figure f = (Figure) dimension.eContainer ();

            if (f.getMaximumSize () == dimension) {
                prefix = "Maximum Size: ";
            }
            else if (f.getMinimumSize () == dimension) {
                prefix = "Minimum Size: ";
            }
            else if (f.getPreferredSize () == dimension) {
                prefix = "Preferred Size: ";
            }

        }

        return prefix + '[' + dimension.getDx () + ',' + dimension.getDy () + ']';

    }

}

