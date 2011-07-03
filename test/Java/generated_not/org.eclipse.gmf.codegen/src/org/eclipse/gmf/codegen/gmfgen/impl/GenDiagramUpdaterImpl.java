/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Gen Diagram Updater</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramUpdaterImpl#getEditorGen <em>Editor Gen</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramUpdaterImpl#getDiagramUpdaterClassName <em>Diagram Updater Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramUpdaterImpl#getNodeDescriptorClassName <em>Node Descriptor Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramUpdaterImpl#getLinkDescriptorClassName <em>Link Descriptor Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramUpdaterImpl#getUpdateCommandClassName <em>Update Command Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.GenDiagramUpdaterImpl#getUpdateCommandID <em>Update Command ID</em>}</li>
   * </ul>
   * </p>
   *
   * @generated
   */ public class GenDiagramUpdaterImpl extends EObjectImpl implements GenDiagramUpdater {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getDiagramUpdaterQualifiedClassName () {
        return getEditorPackageName () + '.' + getDiagramUpdaterClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getNodeDescriptorQualifiedClassName () {
        return getEditorPackageName () + '.' + getNodeDescriptorClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getLinkDescriptorQualifiedClassName () {
        return getEditorPackageName () + '.' + getLinkDescriptorClassName ();

    }

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getUpdateCommandQualifiedClassName () {
        return getEditorPackageName () + '.' + getUpdateCommandClassName ();

    }

}

//GenDiagramUpdaterImpl
