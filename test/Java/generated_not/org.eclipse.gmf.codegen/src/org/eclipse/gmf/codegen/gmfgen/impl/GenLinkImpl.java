/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Link</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getGenOutgoingLinks <em>Gen Outgoing Links</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getGenIncomingLinks <em>Gen Incoming Links</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getDiagram <em>Diagram</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getModelFacet <em>Model Facet</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getLabels <em>Labels</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#isOutgoingCreationAllowed <em>Outgoing Creation Allowed</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#isIncomingCreationAllowed <em>Incoming Creation Allowed</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#isViewDirectionAlignedWithModel <em>View Direction Aligned With Model</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getCreationConstraints <em>Creation Constraints</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#isTargetReorientingAllowed <em>Target Reorienting Allowed</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#isSourceReorientingAllowed <em>Source Reorienting Allowed</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getCreateCommandClassName <em>Create Command Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getReorientCommandClassName <em>Reorient Command Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#isTreeBranch <em>Tree Branch</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getSources <em>Sources</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenLinkImpl#getTargets <em>Targets</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenLinkImpl extends GenCommonBaseImpl implements GenLink {
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
    public EList < GenLinkEnd > getSources () {
        if (getModelFacet () == null) {
            return ECollections.emptyEList ();

        }

        return getCompatibleLinkEnds (getModelFacet ().getSourceType ());

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenLinkEnd > getTargets () {
        if (getModelFacet () == null) {
            return ECollections.emptyEList ();

        }

        return getCompatibleLinkEnds (getModelFacet ().getTargetType ());

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenCommonBase > getAssistantSources () {
        if (getModelFacet () == null) {
            return ECollections.emptyEList ();

        }

        return getParticipants (getModelFacet ().getAssistantSourceTypes ());

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public EList < GenCommonBase > getAssistantTargets () {
        if (getModelFacet () == null) {
            return ECollections.emptyEList ();

        }

        return getParticipants (getModelFacet ().getAssistantTargetTypes ());

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
    public String getReorientCommandQualifiedClassName () {
        return getDiagram ().getEditCommandsPackageName () + '.' + getReorientCommandClassName ();

    }

}

//GenLinkImpl
