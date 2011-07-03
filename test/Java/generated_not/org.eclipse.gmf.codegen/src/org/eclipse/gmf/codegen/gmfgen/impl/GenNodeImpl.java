/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Node</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getGenOutgoingLinks <em>Gen Outgoing Links</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getGenIncomingLinks <em>Gen Incoming Links</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getModelFacet <em>Model Facet</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getLabels <em>Labels</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getCompartments <em>Compartments</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getPrimaryDragEditPolicyQualifiedClassName <em>Primary Drag Edit Policy Qualified Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getGraphicalNodeEditPolicyClassName <em>Graphical Node Edit Policy Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getCreateCommandClassName <em>Create Command Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenNodeImpl#getReorientedIncomingLinks <em>Reoriented Incoming Links</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ abstract public class GenNodeImpl extends GenChildContainerImpl implements GenNode {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenLink > getGenOutgoingLinks () {
        return GenLinkEndOperations.getGenOutgoingLinks (this);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenLink > getGenIncomingLinks () {
        return GenLinkEndOperations.getGenIncomingLinks (this);

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getDomainMetaClass () {
        return getModelFacet () == null ? null : getModelFacet ().getMetaClass ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getGraphicalNodeEditPolicyQualifiedClassName () {
        return getDiagram ().getEditPoliciesPackageName () + '.' + getGraphicalNodeEditPolicyClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getCreateCommandQualifiedClassName () {
        return getDiagram ().getEditCommandsPackageName () + '.' + getCreateCommandClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenLink > getReorientedIncomingLinks () {
        if (getModelFacet () == null || getModelFacet ().getMetaClass () == null || getModelFacet ().getMetaClass ().
          getEcoreClass () == null) {
            return ECollections.emptyEList ();

        }

        // [artem] XXX not sure there might be two equal links in the genDiagram.links
          // but 'set' was there in the original template. legacy is the only reason i kept it, Set < GenLink > reorientedLinks
          = new HashSet < GenLink > ();

        for (GenLink genLink : getDiagram ().getLinks ()) {
            if (! genLink.isViewDirectionAlignedWithModel () || genLink.getModelFacet () == null) {
                continue;

            }

            GenClass incomingClass;

            GenClass outgoingClass;

            if (genLink.getModelFacet () instanceof TypeLinkModelFacet) {
                TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) genLink.getModelFacet ();

                outgoingClass = modelFacet.getSourceMetaFeature () == null ? modelFacet.getContainmentMetaFeature ().
                  getGenClass () : modelFacet.getSourceMetaFeature ().getTypeGenClass ();
                incomingClass = modelFacet.getTargetMetaFeature ().getTypeGenClass ();
            }
            else if (genLink.getModelFacet () instanceof FeatureLinkModelFacet) {
                GenFeature metaFeature = ((FeatureLinkModelFacet) genLink.getModelFacet ()).getMetaFeature ();

                outgoingClass = metaFeature.getGenClass ();
                incomingClass = metaFeature.getTypeGenClass ();
            }
            else {
                continue;

            }

            if (incomingClass == null || incomingClass.getEcoreClass () == null || outgoingClass == null || outgoingClass.
              getEcoreClass () == null) {
                continue;

            }

            GenClass nodeMetaClass = getModelFacet ().getMetaClass ();

            boolean canBeSource = outgoingClass.getEcoreClass ().isSuperTypeOf (nodeMetaClass.getEcoreClass ());

            boolean canBeTarget = incomingClass.getEcoreClass ().isSuperTypeOf (nodeMetaClass.getEcoreClass ());

            /*
               * This logic is currently alligned with the logic in NodeItemSemanticEditPolicy.javajet i.e.:
               *
               * - we do not perform link rotation if this link could be drawn from instance of this EP 
               *   to the instance of this EP.
               *
               * - if link could be created in "opposite" direction (genLink.isIncomingCreationAllowed() == true)
               *   and this EP could be only a source of the link then we should reverse link at the end of link 
               *   creation
               *
               */ if (canBeSource && canBeTarget) {
                continue;

            }

            if (genLink.isIncomingCreationAllowed () && canBeSource) {
                reorientedLinks.add (genLink);
            }

        }

        return new EcoreEList.UnmodifiableEList < GenLink > (this, GMFGenPackage.eINSTANCE.getGenNode_ReorientedIncomingLinks (
          ), reorientedLinks.size (), reorientedLinks.toArray ());

    }

}

//GenNodeImpl
