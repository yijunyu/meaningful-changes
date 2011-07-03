/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.LinkMapping} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class LinkMappingItemProvider extends MappingEntryItemProvider implements IEditingDomainItemProvider,
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
       * This adds a property descriptor for the Diagram Link feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addDiagramLinkPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_LinkMapping_diagramLink_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_LinkMapping_diagramLink_feature", "_UI_LinkMapping_type"), GMFMapPackage.
          eINSTANCE.getLinkMapping_DiagramLink (), true, null, getString ("_UI_VisualrepresentationPropertyCategory"), null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                return FilterUtil.sort (super.getComboBoxObjects (object));

            }

        }

        );
    }

    /**
       * This adds a property descriptor for the Containment Feature feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addContainmentFeaturePropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_NeedsContainment_containmentFeature_feature"),
          getString ("_UI_PropertyDescriptor_description", "_UI_NeedsContainment_containmentFeature_feature",
          "_UI_NeedsContainment_type"), GMFMapPackage.eINSTANCE.getNeedsContainment_ContainmentFeature (), true, null, getString
          ("_UI_DomainmetainformationPropertyCategory"), null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                @SuppressWarnings("unchecked")
                Collection < EReference > original = (Collection < EReference >) super.getComboBoxObjects (object);

                return FilterUtil.filterByReferenceType (original, (LinkMapping) object);

            }

        }

        );
    }

    /**
       * This adds a property descriptor for the Source Meta Feature feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addSourceMetaFeaturePropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_LinkMapping_sourceMetaFeature_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_LinkMapping_sourceMetaFeature_feature", "_UI_LinkMapping_type"),
          GMFMapPackage.eINSTANCE.getLinkMapping_SourceMetaFeature (), true, null, getString (
          "_UI_DomainmetainformationPropertyCategory"), null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                @SuppressWarnings("unchecked")
                Collection < EStructuralFeature > original = (Collection < EStructuralFeature >) super.getComboBoxObjects (
                  object);

                return FilterUtil.filterByContainerMetaclass (original, (LinkMapping) object);

            }

        }

        );
    }

    /**
       * This adds a property descriptor for the Link Meta Feature feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addLinkMetaFeaturePropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_LinkMapping_linkMetaFeature_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_LinkMapping_linkMetaFeature_feature", "_UI_LinkMapping_type"),
          GMFMapPackage.eINSTANCE.getLinkMapping_LinkMetaFeature (), true, null, getString (
          "_UI_DomainmetainformationPropertyCategory"), null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                @SuppressWarnings("unchecked")
                Collection < EStructuralFeature > original = (Collection < EStructuralFeature >) super.getComboBoxObjects (
                  object);

                return FilterUtil.filterByContainerMetaclass (original, (LinkMapping) object);

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
        StringBuffer sb = new StringBuffer ();

        LinkMapping mapping = (LinkMapping) object;

        sb.append ('<');
        if (mapping.getDomainMetaElement () != null) {
            sb.append (mapping.getDomainMetaElement ().getName ());
        }

        sb.append ('{');
        if (mapping.getSourceMetaFeature () != null) {
            sb.append (GMFMapEditPlugin.getFeatureLabel (mapping.getSourceMetaFeature ()));
            sb.append ('-');
            sb.append ('>');
        }

        if (mapping.getLinkMetaFeature () != null) {
            sb.append (GMFMapEditPlugin.getFeatureLabel (mapping.getLinkMetaFeature ()));
        }

        sb.append ('}');
        sb.append ('/');
        if (mapping.getDiagramLink () != null) {
            sb.append (mapping.getDiagramLink ().getName ());
        }

        sb.append ('>');
        return getString ("_UI_LinkMapping_type") + ' ' + sb;

    }

}

