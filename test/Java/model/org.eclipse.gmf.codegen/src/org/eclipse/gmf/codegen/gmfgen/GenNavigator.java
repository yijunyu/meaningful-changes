/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;
/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Gen Navigator</b></em>'.
   * <!-- end-user-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getEditorGen <em>Editor Gen</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionID <em>Content Extension ID</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionName <em>Content Extension Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentExtensionPriority <em>Content Extension Priority</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getLinkHelperExtensionID <em>Link Helper Extension ID</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getSorterExtensionID <em>Sorter Extension ID</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getActionProviderID <em>Action Provider ID</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getContentProviderClassName <em>Content Provider Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getLabelProviderClassName <em>Label Provider Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getLinkHelperClassName <em>Link Helper Class Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getSorterClassName <em>Sorter Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getActionProviderClassName <em>Action Provider Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getAbstractNavigatorItemClassName <em>Abstract Navigator Item Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getNavigatorGroupClassName <em>Navigator Group Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getNavigatorItemClassName <em>Navigator Item Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getUriInputTesterClassName <em>Uri Input Tester Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getPackageName <em>Package Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNavigator#getChildReferences <em>Child References</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator()
   * @model
   * @generated
   */
public interface GenNavigator extends GenDomainModelNavigator {
    /**
       * Returns the value of the '<em><b>Editor Gen</b></em>' container reference.
    
   * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getNavigator <em>Navigator</em>}'.

       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Editor Gen</em>' container reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Editor Gen</em>' container reference.
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_EditorGen()
       * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getNavigator
       * @model opposite="navigator" resolveProxies="false" transient="false" changeable="false"
       * @generated
       */
    GenEditorGenerator getEditorGen ();

    /**
       * Returns the value of the '<em><b>Content Extension ID</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Content Extension ID</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Content Extension ID</em>' attribute.
       * @see #setContentExtensionID(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ContentExtensionID()
       * @model
       * @generated
       */
    String getContentExtensionID ();

    /**
       * Returns the value of the '<em><b>Content Extension Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Content Extension Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Content Extension Name</em>' attribute.
       * @see #setContentExtensionName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ContentExtensionName()
       * @model
       * @generated
       */
    String getContentExtensionName ();

    /**
       * Returns the value of the '<em><b>Content Extension Priority</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Content Extension Priority</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Content Extension Priority</em>' attribute.
       * @see #setContentExtensionPriority(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ContentExtensionPriority()
       * @model
       * @generated
       */
    String getContentExtensionPriority ();

    /**
       * Returns the value of the '<em><b>Link Helper Extension ID</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Link Helper Extension ID</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Link Helper Extension ID</em>' attribute.
       * @see #setLinkHelperExtensionID(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_LinkHelperExtensionID()
       * @model
       * @generated
       */
    String getLinkHelperExtensionID ();

    /**
       * Returns the value of the '<em><b>Sorter Extension ID</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Sorter Extension ID</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Sorter Extension ID</em>' attribute.
       * @see #setSorterExtensionID(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_SorterExtensionID()
       * @model
       * @generated
       */
    String getSorterExtensionID ();

    /**
       * Returns the value of the '<em><b>Action Provider ID</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Action Provider ID</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Action Provider ID</em>' attribute.
       * @see #setActionProviderID(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ActionProviderID()
       * @model
       * @generated
       */
    String getActionProviderID ();

    /**
       * Returns the value of the '<em><b>Content Provider Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Content Provider Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Content Provider Class Name</em>' attribute.
       * @see #setContentProviderClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ContentProviderClassName()
       * @model
       * @generated
       */
    String getContentProviderClassName ();

    /**
       * Returns the value of the '<em><b>Label Provider Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Label Provider Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Label Provider Class Name</em>' attribute.
       * @see #setLabelProviderClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_LabelProviderClassName()
       * @model
       * @generated
       */
    String getLabelProviderClassName ();

    /**
       * Returns the value of the '<em><b>Link Helper Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Link Helper Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Link Helper Class Name</em>' attribute.
       * @see #setLinkHelperClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_LinkHelperClassName()
       * @model
       * @generated
       */
    String getLinkHelperClassName ();

    /**
       * Returns the value of the '<em><b>Sorter Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Sorter Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Sorter Class Name</em>' attribute.
       * @see #setSorterClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_SorterClassName()
       * @model
       * @generated
       */
    String getSorterClassName ();

    /**
       * Returns the value of the '<em><b>Action Provider Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Action Provider Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Action Provider Class Name</em>' attribute.
       * @see #setActionProviderClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ActionProviderClassName()
       * @model
       * @generated
       */
    String getActionProviderClassName ();

    /**
       * Returns the value of the '<em><b>Abstract Navigator Item Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Abstract Navigator Item Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Abstract Navigator Item Class Name</em>' attribute.
       * @see #setAbstractNavigatorItemClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_AbstractNavigatorItemClassName()
       * @model
       * @generated
       */
    String getAbstractNavigatorItemClassName ();

    /**
       * Returns the value of the '<em><b>Navigator Group Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Navigator Group Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Navigator Group Class Name</em>' attribute.
       * @see #setNavigatorGroupClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_NavigatorGroupClassName()
       * @model
       * @generated
       */
    String getNavigatorGroupClassName ();

    /**
       * Returns the value of the '<em><b>Navigator Item Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Navigator Item Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Navigator Item Class Name</em>' attribute.
       * @see #setNavigatorItemClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_NavigatorItemClassName()
       * @model
       * @generated
       */
    String getNavigatorItemClassName ();

    /**
       * Returns the value of the '<em><b>Uri Input Tester Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Uri Input Tester Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Uri Input Tester Class Name</em>' attribute.
       * @see #setUriInputTesterClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_UriInputTesterClassName()
       * @model
       * @generated
       */
    String getUriInputTesterClassName ();

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
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_PackageName()
       * @model
       * @generated
       */
    String getPackageName ();

    /**
       * Returns the value of the '<em><b>Child References</b></em>' containment reference list.
       * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference}.
    
   * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getNavigator <em>Navigator</em>}'.

       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Child References</em>' containment reference list isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Child References</em>' containment reference list.
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNavigator_ChildReferences()
       * @see org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference#getNavigator
       * @model opposite="navigator" containment="true"
       * @generated
       */
    EList < GenNavigatorChildReference > getChildReferences ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getContentProviderQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getLabelProviderQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getLinkHelperQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getSorterQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getActionProviderQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getAbstractNavigatorItemQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getNavigatorGroupQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getNavigatorItemQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getUriInputTesterQualifiedClassName ();

}

// GenNavigator
