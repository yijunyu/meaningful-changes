/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.codegen.gmfgen;

import java.util.List;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Gen Common Base</b></em>'.
   * <!-- end-user-doc -->
   *
   * <!-- begin-model-doc -->
   * One that combines attributes that are essential for diagram elements
   * <!-- end-model-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getDiagramRunTimeClass <em>Diagram Run Time Class</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getVisualID <em>Visual ID</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getElementType <em>Element Type</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getEditPartClassName <em>Edit Part Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getItemSemanticEditPolicyClassName <em>Item Semantic Edit Policy Class Name</em>}</li>


   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getNotationViewFactoryClassName <em>Notation View Factory Class Name</em>}</li>

   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getViewmap <em>Viewmap</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getStyles <em>Styles</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#getBehaviour <em>Behaviour</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase#isSansDomain <em>Sans Domain</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommonBase()
   * @model abstract="true"

*        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='styles->forAll(style|style.ecoreClass.eAllSuperTypes->including(style.ecoreClass)->one(ePackage.name = \'notation\' and name = \'Style\'))' description='Each style must be a notation::Style or sub-class'"

   * @generated
   */
public interface GenCommonBase extends EObject {
    /**
       * Returns the value of the '<em><b>Diagram Run Time Class</b></em>' reference.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Diagram Run Time Class</em>' reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Diagram Run Time Class</em>' reference.
       * @see #setDiagramRunTimeClass(GenClass)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommonBase_DiagramRunTimeClass()
       * @model required="true"
       * @generated
       */
    GenClass getDiagramRunTimeClass ();

    /**
       * Returns the value of the '<em><b>Visual ID</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * <!-- begin-model-doc -->
       * way to decide which editpart to use for specific diagram element. Maps to attribute in DRT.
       * <!-- end-model-doc -->
       * @return the value of the '<em>Visual ID</em>' attribute.
       * @see #setVisualID(int)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommonBase_VisualID()
       * @model required="true"
    
   *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='visualID >= 0' description='Visual ID must be a non-negative integer'"

       * @generated
       */
    int getVisualID ();

    /**
       * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
    
   * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.ElementType#getDiagramElement <em>Diagram Element</em>}'.

       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Element Type</em>' containment reference.
       * @see #setElementType(ElementType)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommonBase_ElementType()
       * @see org.eclipse.gmf.codegen.gmfgen.ElementType#getDiagramElement
       * @model opposite="diagramElement" containment="true"
       * @generated
       */
    ElementType getElementType ();

    /**
       * Returns the value of the '<em><b>Edit Part Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Edit Part Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Edit Part Class Name</em>' attribute.
       * @see #setEditPartClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommonBase_EditPartClassName()
       * @model
       * @generated
       */
    String getEditPartClassName ();

    /**
       * Returns the value of the '<em><b>Item Semantic Edit Policy Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Item Semantic Edit Policy Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Item Semantic Edit Policy Class Name</em>' attribute.
       * @see #setItemSemanticEditPolicyClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommonBase_ItemSemanticEditPolicyClassName()
       * @model
       * @generated
       */
    String getItemSemanticEditPolicyClassName ();

    /**
       * Returns the value of the '<em><b>Notation View Factory Class Name</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Notation View Factory Class Name</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Notation View Factory Class Name</em>' attribute.
       * @see #setNotationViewFactoryClassName(String)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommonBase_NotationViewFactoryClassName()
       * @model
       * @generated
       */
    String getNotationViewFactoryClassName ();

    /**
       * Returns the value of the '<em><b>Viewmap</b></em>' containment reference.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Viewmap</em>' containment reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Viewmap</em>' containment reference.
       * @see #setViewmap(Viewmap)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommonBase_Viewmap()
       * @model containment="true" required="true"
       * @generated
       */
    Viewmap getViewmap ();

    /**
       * Returns the value of the '<em><b>Styles</b></em>' reference list.
       * The list contents are of type {@link org.eclipse.emf.codegen.ecore.genmodel.GenClass}.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Styles</em>' reference list isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Styles</em>' reference list.
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommonBase_Styles()
       * @model
       * @generated
       */
    EList < GenClass > getStyles ();

    /**
       * Returns the value of the '<em><b>Behaviour</b></em>' containment reference list.
       * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.Behaviour}.
    
      * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.Behaviour#getSubject <em>Subject</em>}'.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Behaviour</em>' containment reference list isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Behaviour</em>' containment reference list.
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommonBase_Behaviour()
       * @see org.eclipse.gmf.codegen.gmfgen.Behaviour#getSubject
       * @model opposite="subject" containment="true"
       * @generated
       */
    EList < Behaviour > getBehaviour ();

    /**
       * Returns the value of the '<em><b>Sans Domain</b></em>' attribute.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Sans Domain</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * <!-- begin-model-doc -->
       * Indicates this element has no associated domain model. IOW, pure design element.
       * <!-- end-model-doc -->
       * @return the value of the '<em>Sans Domain</em>' attribute.
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenCommonBase_SansDomain()
       * @model transient="true" changeable="false" volatile="true" derived="true"
       * @generated
       */
    boolean isSansDomain ();

    /**
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Class Name Prefix</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getClassNamePrefix ();

    //$NON-NLS-1$ /**
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Class Name Suffux</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getClassNameSuffux ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * <!-- begin-model-doc -->
       * This unique string identifier could be used to construct unique identifiers in generated java code
       * <!-- end-model-doc -->
       * @model kind="operation"
       * @generated
       */
    String getUniqueIdentifier ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    ViewmapLayoutType getLayoutType ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getEditPartQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getItemSemanticEditPolicyQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    String getNotationViewFactoryQualifiedClassName ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @model kind="operation"
       * @generated
       */
    GenDiagram getDiagram ();

}

// GenCommonBase
