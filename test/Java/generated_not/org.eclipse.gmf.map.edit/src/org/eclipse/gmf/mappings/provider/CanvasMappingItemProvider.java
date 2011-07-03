/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.CanvasMapping} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class CanvasMappingItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This adds a property descriptor for the Diagram Canvas feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addDiagramCanvasPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_CanvasMapping_diagramCanvas_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_CanvasMapping_diagramCanvas_feature", "_UI_CanvasMapping_type"),
          GMFMapPackage.eINSTANCE.getCanvasMapping_DiagramCanvas (), true, null, getString (
          "_UI_VisualrepresentationPropertyCategory"), null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                return FilterUtil.sort (super.getComboBoxObjects (object));

            }

        }

        );
    }

    /**
       * This adds a property descriptor for the Domain Model feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addDomainModelPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_CanvasMapping_domainModel_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_CanvasMapping_domainModel_feature", "_UI_CanvasMapping_type"),
          GMFMapPackage.eINSTANCE.getCanvasMapping_DomainModel (), true, null, getString (
          "_UI_DomainmetainformationPropertyCategory"), null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                return FilterUtil.sort (super.getComboBoxObjects (object));

            }

        }

        );
    }

    /**
       * This adds a property descriptor for the Domain Meta Element feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addDomainMetaElementPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_CanvasMapping_domainMetaElement_feature"), getString
          ("_UI_PropertyDescriptor_description", "_UI_CanvasMapping_domainMetaElement_feature", "_UI_CanvasMapping_type"),
          GMFMapPackage.eINSTANCE.getCanvasMapping_DomainMetaElement (), true, null, getString (
          "_UI_DomainmetainformationPropertyCategory"), null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                @SuppressWarnings("unchecked")
                Collection < EClass > original = (Collection < EClass >) super.getComboBoxObjects (object);

                return FilterUtil.filterByResourceSet (original, ((CanvasMapping) object).eResource ().getResourceSet ());

            }

        }

        );
    }

    /**
       * This adds a property descriptor for the Palette feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addPalettePropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_CanvasMapping_palette_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_CanvasMapping_palette_feature", "_UI_CanvasMapping_type"), GMFMapPackage.
          eINSTANCE.getCanvasMapping_Palette (), true, null, null, null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                return FilterUtil.sort (super.getComboBoxObjects (object));

            }

        }

        );
    }

}

