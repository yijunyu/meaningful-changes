/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.impl;

/**
   * <!-- begin-user-doc -->
   * An implementation of the model object '<em><b>Open Diagram Behaviour</b></em>'.
   * <!-- end-user-doc -->
   * <p>
   * The following features are implemented:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl#getSubject <em>Subject</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl#getEditPolicyClassName <em>Edit Policy Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl#getDiagramKind <em>Diagram Kind</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl#getEditorID <em>Editor ID</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.OpenDiagramBehaviourImpl#isOpenAsEclipseEditor <em>Open As Eclipse Editor</em>}</li>

   * </ul>
   * </p>
   *
   * @generated
   */ public class OpenDiagramBehaviourImpl extends EObjectImpl implements OpenDiagramBehaviour {
    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getEditPolicyQualifiedClassName () {
        return getSubject ().getDiagram ().getEditPoliciesPackageName () + '.' + getEditPolicyClassName ();

    }

}

//OpenDiagramBehaviourImpl
