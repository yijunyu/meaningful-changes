/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.gmfgraph.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.Point} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class PointItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IItemLabelProvider,
  IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getText (Object object) {
        Point point = (Point) object;

        String prefix = "";

        if (point.eContainer () instanceof Figure) {
            Figure f = (Figure) point.eContainer ();

            if (f.getSize () == point) {
                prefix = "Size: ";
            }
            else if (f.getLocation () == point) {
                prefix = "Location: ";
            }

        }

        return prefix + '(' + point.getX () + ',' + point.getY () + ')';

    }

}

