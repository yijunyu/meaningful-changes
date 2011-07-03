/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.gmfgraph.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.Canvas} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class CanvasItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IItemLabelProvider,
  IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected EStructuralFeature getChildFeature (Object object, Object child) {
        // Modifications for https://bugs.eclipse.org/bugs/show_bug.cgi?id=169310 if (object instanceof Canvas && child
          instanceof DiagramLabel) {
            return GMFGraphPackage.eINSTANCE.getCanvas_Labels ();

        }

        // Check the type of the specified child object and return the proper feature to use for
          // adding (see {@link AddCommand}) it as a child.return super.getChildFeature (object, child);

    }

}

