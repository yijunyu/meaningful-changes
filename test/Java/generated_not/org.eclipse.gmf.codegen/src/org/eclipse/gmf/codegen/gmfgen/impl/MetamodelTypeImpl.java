/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Metamodel Type</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.MetamodelTypeImpl#getEditHelperClassName <em>Edit Helper Class Name</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ public class MetamodelTypeImpl extends ElementTypeImpl implements MetamodelType {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getEditHelperQualifiedClassName () {
        return getDiagramElement ().getDiagram ().getEditHelpersPackageName () + '.' + getEditHelperClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public GenClass getMetaClass () {
        if (getDiagramElement () instanceof GenNode) {
            return ((GenNode) getDiagramElement ()).getModelFacet ().getMetaClass ();

        }
        else if (getDiagramElement () instanceof GenLink) {
            LinkModelFacet modelFacet = ((GenLink) getDiagramElement ()).getModelFacet ();

            if (modelFacet instanceof TypeModelFacet) {
                return ((TypeModelFacet) modelFacet).getMetaClass ();

            }

        }
        else if (getDiagramElement () instanceof GenDiagram) {
            return ((GenDiagram) getDiagramElement ()).getDomainDiagramElement ();

        }

        return null;

    }

}

//MetamodelTypeImpl
