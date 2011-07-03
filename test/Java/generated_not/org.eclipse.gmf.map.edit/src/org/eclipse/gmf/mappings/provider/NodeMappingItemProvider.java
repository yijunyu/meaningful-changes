/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.NodeMapping} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class NodeMappingItemProvider extends MappingEntryItemProvider implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This adds a property descriptor for the Tool feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addToolPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_ToolOwner_tool_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_ToolOwner_tool_feature", "_UI_ToolOwner_type"), GMFMapPackage.eINSTANCE.
          getToolOwner_Tool (), true, null, getString ("_UI_VisualrepresentationPropertyCategory"), null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                return FilterUtil.filterBySuperClasses (super.getComboBoxObjects (object), new Class [] {CreationTool.class,
                  GenericTool.class});

            }

        }

        );
    }

    /**
       * This adds a property descriptor for the Diagram Node feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addDiagramNodePropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_NodeMapping_diagramNode_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_NodeMapping_diagramNode_feature", "_UI_NodeMapping_type"), GMFMapPackage.
          eINSTANCE.getNodeMapping_DiagramNode (), true, null, getString ("_UI_VisualrepresentationPropertyCategory"), null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                return FilterUtil.sort (super.getComboBoxObjects (object));

            }

        }

        );
    }

    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getText (Object object) {
        if (object instanceof NodeMapping) {
            NodeMapping mapping = (NodeMapping) object;

            String result = " <";

            if (mapping.getDomainMetaElement () != null) {
                result += mapping.getDomainMetaElement ().getName ();
            }

            result += "/";
            if (mapping.getDiagramNode () != null) {
                result += mapping.getDiagramNode ().getName ();
            }

            result += ">";
            return getString ("_UI_NodeMapping_type") + result;

        }

        return getString ("_UI_NodeMapping_type");

    }

}

