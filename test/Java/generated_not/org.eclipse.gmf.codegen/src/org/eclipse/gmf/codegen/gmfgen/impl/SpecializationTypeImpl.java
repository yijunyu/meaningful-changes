/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Specialization Type</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.SpecializationTypeImpl#getMetamodelType <em>Metamodel Type</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.SpecializationTypeImpl#getEditHelperAdviceClassName <em>Edit Helper Advice Class Name</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ public class SpecializationTypeImpl extends ElementTypeImpl implements SpecializationType {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getMetamodelClass () {
        GenClass metaClass = null;

        if (getMetamodelType () != null) {
            metaClass = getMetamodelType ().getMetaClass ();
        }

        if (getDiagramElement () instanceof GenLink) {
            LinkModelFacet modelFacet = ((GenLink) getDiagramElement ()).getModelFacet ();

            if (modelFacet instanceof FeatureLinkModelFacet) {
                GenFeature metaFeature = ((FeatureLinkModelFacet) modelFacet).getMetaFeature ();

                metaClass = metaFeature.getGenClass ();
            }

        }

        return metaClass;

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getEditHelperAdviceQualifiedClassName () {
        return getDiagramElement ().getDiagram ().getEditHelpersPackageName () + '.' + getEditHelperAdviceClassName ();

    }

}

//SpecializationTypeImpl
