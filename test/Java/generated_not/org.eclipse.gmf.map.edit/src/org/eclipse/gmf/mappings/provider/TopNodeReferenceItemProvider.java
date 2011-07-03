/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.TopNodeReference} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class TopNodeReferenceItemProvider extends NodeReferenceItemProvider implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getText (Object object) {
        if (object instanceof NodeReference) {
            NodeReference reference = (NodeReference) object;

            String result = " <";

            if (reference.getContainmentFeature () != null) {
                result += reference.getContainmentFeature ().getName ();
            }

            if (reference.getChildrenFeature () != null) {
                result += "|";
                result += reference.getChildrenFeature ().getName ();
            }

            if (reference.isSetChild ()) {
                NodeMapping mapping = reference.getChild ();

                if (mapping.getDomainMetaElement () != null) {
                    result += ":";
                    result += mapping.getDomainMetaElement ().getName ();
                }

                result += "/";
                if (mapping.getDiagramNode () != null) {
                    result += reference.getChild ().getDiagramNode ().getName ();
                }

            }

            result += ">";
            return getString ("_UI_TopNodeReference_type") + result;

        }

        return getString ("_UI_TopNodeReference_type");

    }

}

