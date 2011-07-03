/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
/**
   * <!-- begin-user-doc -->
   * A representation of the model object '<em><b>Gen Parsers</b></em>'.
   * <!-- end-user-doc -->
   *
   * <p>
   * The following features are supported:
   * <ul>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenParsers#getEditorGen <em>Editor Gen</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenParsers#getPackageName <em>Package Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenParsers#getClassName <em>Class Name</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenParsers#isExtensibleViaService <em>Extensible Via Service</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenParsers#getProviderPriority <em>Provider Priority</em>}</li>
   *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenParsers#getImplementations <em>Implementations</em>}</li>
   * </ul>
   * </p>
   *
   * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenParsers()
   * @model
   * @generated
   */
public interface GenParsers extends EObject {
    /**
       * Returns the value of the '<em><b>Editor Gen</b></em>' container reference.
    
   * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getLabelParsers <em>Label Parsers</em>}'.

       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Editor Gen</em>' container reference isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Editor Gen</em>' container reference.
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenParsers_EditorGen()
       * @see org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator#getLabelParsers
       * @model opposite="labelParsers" resolveProxies="false" required="true" transient="false" changeable="false"
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
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenParsers_PackageName()
       * @model required="true"
       * @generated
       */
    String getPackageName ();

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
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenParsers_ClassName()
       * @model required="true"
       * @generated
       */
    String getClassName ();

    /**
       * Returns the value of the '<em><b>Extensible Via Service</b></em>' attribute.
       * The default value is <code>"false"</code>.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Extensible Via Service</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Extensible Via Service</em>' attribute.
       * @see #setExtensibleViaService(boolean)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenParsers_ExtensibleViaService()
       * @model default="false"
       * @generated
       */
    boolean isExtensibleViaService ();

    /**
       * Returns the value of the '<em><b>Provider Priority</b></em>' attribute.
       * The default value is <code>"Lowest"</code>.
       * The literals are from the enumeration {@link org.eclipse.gmf.codegen.gmfgen.ProviderPriority}.
       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Provider Priority</em>' attribute isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Provider Priority</em>' attribute.
       * @see org.eclipse.gmf.codegen.gmfgen.ProviderPriority
       * @see #setProviderPriority(ProviderPriority)
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenParsers_ProviderPriority()
       * @model default="Lowest"
       * @generated
       */
    ProviderPriority getProviderPriority ();

    /**
       * Returns the value of the '<em><b>Implementations</b></em>' containment reference list.
       * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenParserImplementation}.
    
   * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenParserImplementation#getHolder <em>Holder</em>}'.

       * <!-- begin-user-doc -->
       * <p>
       * If the meaning of the '<em>Implementations</em>' containment reference list isn't clear,
       * there really should be more of a description here...
       * </p>
       * <!-- end-user-doc -->
       * @return the value of the '<em>Implementations</em>' containment reference list.
       * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenParsers_Implementations()
       * @see org.eclipse.gmf.codegen.gmfgen.GenParserImplementation#getHolder
       * @model opposite="holder" containment="true" required="true"
       * @generated
       */
    EList < GenParserImplementation > getImplementations ();

    /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * <!-- begin-model-doc -->
    
    * Class with parser access methods. In case of using extensible ParserService, that would be provider implementation class.
       * <!-- end-model-doc -->
       * @model kind="operation"
       * @generated
       */
    String getQualifiedClassName ();

}

// GenParsers
