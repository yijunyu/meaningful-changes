/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EObject;
/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Gen Editor View</b></em>'.
   * <!-- end-user-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getEditorGen <em>Editor Gen</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getPackageName <em>Package Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getActionBarContributorClassName <em>Action Bar Contributor Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getClassName <em>Class Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getIconPath <em>Icon Path</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getIconPathX <em>Icon Path X</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getID <em>ID</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#isEclipseEditor <em>Eclipse Editor</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenEditorView#getContextID <em>Context ID</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorView()
   * @model
   * @generated
   */
public interface GenEditorView extends EObject {
    /**
       * Returns the value of the '<em><b>Editor Gen</b></em>' container reference.
    
   * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getEditor <em>Editor</em>}'.

       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Editor Gen</em>' container reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Editor Gen</em>' container reference.
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorView_EditorGen()
       * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getEditor
       * @model opposite="editor" resolveProxies="false" transient="false" changeable="false"
       * @generated
       */
    GenEditorGenerator getEditorGen ();

    /**
       * Returns the value of the '<em><b>Package Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Package Name</em>' attribute.
       * @see #setPackageName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorView_PackageName()
       * @model
       * @generated
       */
    String getPackageName ();

    /**
       * Returns the value of the '<em><b>Action Bar Contributor Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Action Bar Contributor Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Action Bar Contributor Class Name</em>' attribute.
       * @see #setActionBarContributorClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorView_ActionBarContributorClassName()
       * @model
       * @generated
       */
    String getActionBarContributorClassName ();

    /**
       * Returns the value of the '<em><b>Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Class Name</em>' attribute.
       * @see #setClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorView_ClassName()
       * @model
       * @generated
       */
    String getClassName ();

    /**
       * Returns the value of the '<em><b>Icon Path</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Icon Path</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Icon Path</em>' attribute.
       * @see #setIconPath(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorView_IconPath()
       * @model required="true"
       * @generated
       */
    String getIconPath ();

    /**
       * Returns the value of the '<em><b>ID</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>ID</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>ID</em>' attribute.
       * @see #setID(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorView_ID()
       * @model
       * @generated
       */
    String getID ();

    /**
       * Returns the value of the '<em><b>Eclipse Editor</b></em>' attribute.
       * The default value is <code>"true"</code>.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Eclipse Editor</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Eclipse Editor</em>' attribute.
       * @see #setEclipseEditor(boolean)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorView_EclipseEditor()
       * @model default="true"
       * @generated
       */
    boolean isEclipseEditor ();

    /**
       * Returns the value of the '<em><b>Context ID</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Context ID</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Context ID</em>' attribute.
       * @see #setContextID(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenEditorView_ContextID()
       * @model
       * @generated
       */
    String getContextID ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getActionBarContributorQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getQualifiedClassName ();

}

// GenEditorView
