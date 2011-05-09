/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainMetaModel <em>Domain Meta Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainDiagramElement <em>Domain Diagram Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPalette <em>Palette</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartsPackageName <em>Edit Parts Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorPackageName <em>Editor Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProvidersPackageName <em>Providers Package Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginID <em>Plugin ID</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isHasDomainModel <em>Has Domain Model</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDiagramFileExtension <em>Diagram File Extension</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartFactoryClassName <em>Edit Part Factory Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getViewProviderClassName <em>View Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartProviderClassName <em>Edit Part Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMetamodelSupportProviderClassName <em>Metamodel Support Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getModelingAssistantProviderClassName <em>Modeling Assistant Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getIconProviderClassName <em>Icon Provider Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getInitDiagramFileActionClassName <em>Init Diagram File Action Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorClassName <em>Editor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getActionBarContributorClassName <em>Action Bar Contributor Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMatchingStrategyClassName <em>Matching Strategy Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginClassName <em>Plugin Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram()
 * @model annotation="http://www.eclipse.org/emf/2004/EmfaticAnnotationMap constraints='http://www.eclipse.org/gmf/2005/constraints'"
 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='nodes->forAll(n : GenNode | self.links->forAll(l : GenLink | l.domainMetaClass <> n.domainMetaClass))'"
 * @generated
 */
public interface GenDiagram extends GenCommonBase{
	/**
	 * Returns the value of the '<em><b>Domain Meta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Meta Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Meta Model</em>' reference.
	 * @see #setDomainMetaModel(GenPackage)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_DomainMetaModel()
	 * @model required="true"
	 * @generated
	 */
	GenPackage getDomainMetaModel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainMetaModel <em>Domain Meta Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Meta Model</em>' reference.
	 * @see #getDomainMetaModel()
	 * @generated
	 */
	void setDomainMetaModel(GenPackage value);

	/**
	 * Returns the value of the '<em><b>Domain Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Diagram Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Diagram Element</em>' reference.
	 * @see #setDomainDiagramElement(GenClass)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_DomainDiagramElement()
	 * @model
	 * @generated
	 */
	GenClass getDomainDiagramElement();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDomainDiagramElement <em>Domain Diagram Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Diagram Element</em>' reference.
	 * @see #getDomainDiagramElement()
	 * @generated
	 */
	void setDomainDiagramElement(GenClass value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_Nodes()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getDiagram
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenNode" opposite="diagram" containment="true"
	 * @generated
	 */
	EList getNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenLink}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_Links()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink#getDiagram
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenLink" opposite="diagram" containment="true"
	 * @generated
	 */
	EList getLinks();

	/**
	 * Returns the value of the '<em><b>Palette</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.Palette#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette</em>' containment reference.
	 * @see #setPalette(Palette)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_Palette()
	 * @see org.eclipse.gmf.codegen.gmfgen.Palette#getDiagram
	 * @model opposite="diagram" containment="true" required="true"
	 * @generated
	 */
	Palette getPalette();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPalette <em>Palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette</em>' containment reference.
	 * @see #getPalette()
	 * @generated
	 */
	void setPalette(Palette value);

	/**
	 * Returns the value of the '<em><b>Edit Parts Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Parts Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Parts Package Name</em>' attribute.
	 * @see #setEditPartsPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditPartsPackageName()
	 * @model
	 * @generated
	 */
	String getEditPartsPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartsPackageName <em>Edit Parts Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Parts Package Name</em>' attribute.
	 * @see #getEditPartsPackageName()
	 * @generated
	 */
	void setEditPartsPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Name</em>' attribute.
	 * @see #setPluginName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_PluginName()
	 * @model
	 * @generated
	 */
	String getPluginName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginName <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Name</em>' attribute.
	 * @see #getPluginName()
	 * @generated
	 */
	void setPluginName(String value);

	/**
	 * Returns the value of the '<em><b>Provider Name</b></em>' attribute.
	 * The default value is <code>"Sample Plugin Provider, Inc"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Name</em>' attribute.
	 * @see #setProviderName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ProviderName()
	 * @model default="Sample Plugin Provider, Inc"
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

	/**
	 * Returns the value of the '<em><b>Plugin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin ID</em>' attribute.
	 * @see #setPluginID(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_PluginID()
	 * @model
	 * @generated
	 */
	String getPluginID();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginID <em>Plugin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin ID</em>' attribute.
	 * @see #getPluginID()
	 * @generated
	 */
	void setPluginID(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Class Name</em>' attribute.
	 * @see #setPluginClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_PluginClassName()
	 * @model
	 * @generated
	 */
	String getPluginClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getPluginClassName <em>Plugin Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Class Name</em>' attribute.
	 * @see #getPluginClassName()
	 * @generated
	 */
	void setPluginClassName(String value);

	/**
	 * Returns the value of the '<em><b>Editor Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Package Name</em>' attribute.
	 * @see #setEditorPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditorPackageName()
	 * @model
	 * @generated
	 */
	String getEditorPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorPackageName <em>Editor Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Package Name</em>' attribute.
	 * @see #getEditorPackageName()
	 * @generated
	 */
	void setEditorPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Providers Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers Package Name</em>' attribute.
	 * @see #setProvidersPackageName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ProvidersPackageName()
	 * @model
	 * @generated
	 */
	String getProvidersPackageName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getProvidersPackageName <em>Providers Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providers Package Name</em>' attribute.
	 * @see #getProvidersPackageName()
	 * @generated
	 */
	void setProvidersPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Editor Class Name</b></em>' attribute.
	 * The default value is <code>"DiagramEditor"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Class Name</em>' attribute.
	 * @see #setEditorClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditorClassName()
	 * @model default="DiagramEditor"
	 * @generated
	 */
	String getEditorClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditorClassName <em>Editor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Class Name</em>' attribute.
	 * @see #getEditorClassName()
	 * @generated
	 */
	void setEditorClassName(String value);

	/**
	 * Returns the value of the '<em><b>Edit Part Factory Class Name</b></em>' attribute.
	 * The default value is <code>"EditPartFactoryImpl"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Part Factory Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Part Factory Class Name</em>' attribute.
	 * @see #setEditPartFactoryClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditPartFactoryClassName()
	 * @model default="EditPartFactoryImpl"
	 * @generated
	 */
	String getEditPartFactoryClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartFactoryClassName <em>Edit Part Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Part Factory Class Name</em>' attribute.
	 * @see #getEditPartFactoryClassName()
	 * @generated
	 */
	void setEditPartFactoryClassName(String value);

	/**
	 * Returns the value of the '<em><b>Has Domain Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Domain Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Domain Model</em>' attribute.
	 * @see #setHasDomainModel(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_HasDomainModel()
	 * @model
	 * @generated
	 */
	boolean isHasDomainModel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isHasDomainModel <em>Has Domain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Domain Model</em>' attribute.
	 * @see #isHasDomainModel()
	 * @generated
	 */
	void setHasDomainModel(boolean value);

	/**
	 * Returns the value of the '<em><b>Diagram File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram File Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram File Extension</em>' attribute.
	 * @see #setDiagramFileExtension(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_DiagramFileExtension()
	 * @model
	 * @generated
	 */
	String getDiagramFileExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getDiagramFileExtension <em>Diagram File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram File Extension</em>' attribute.
	 * @see #getDiagramFileExtension()
	 * @generated
	 */
	void setDiagramFileExtension(String value);

	/**
	 * Returns the value of the '<em><b>Same File For Diagram And Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified whether editor should create separate file for domain elements if diagram file references no domain model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Same File For Diagram And Model</em>' attribute.
	 * @see #setSameFileForDiagramAndModel(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_SameFileForDiagramAndModel()
	 * @model
	 * @generated
	 */
	boolean isSameFileForDiagramAndModel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#isSameFileForDiagramAndModel <em>Same File For Diagram And Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same File For Diagram And Model</em>' attribute.
	 * @see #isSameFileForDiagramAndModel()
	 * @generated
	 */
	void setSameFileForDiagramAndModel(boolean value);

	/**
	 * Returns the value of the '<em><b>Init Diagram File Action Class Name</b></em>' attribute.
	 * The default value is <code>"InitDiagramFileAction"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Diagram File Action Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Diagram File Action Class Name</em>' attribute.
	 * @see #setInitDiagramFileActionClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_InitDiagramFileActionClassName()
	 * @model default="InitDiagramFileAction"
	 * @generated
	 */
	String getInitDiagramFileActionClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getInitDiagramFileActionClassName <em>Init Diagram File Action Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Diagram File Action Class Name</em>' attribute.
	 * @see #getInitDiagramFileActionClassName()
	 * @generated
	 */
	void setInitDiagramFileActionClassName(String value);

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
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ActionBarContributorClassName()
	 * @model
	 * @generated
	 */
	String getActionBarContributorClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getActionBarContributorClassName <em>Action Bar Contributor Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Bar Contributor Class Name</em>' attribute.
	 * @see #getActionBarContributorClassName()
	 * @generated
	 */
	void setActionBarContributorClassName(String value);

	/**
	 * Returns the value of the '<em><b>Matching Strategy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Strategy Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Strategy Class Name</em>' attribute.
	 * @see #setMatchingStrategyClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_MatchingStrategyClassName()
	 * @model
	 * @generated
	 */
	String getMatchingStrategyClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMatchingStrategyClassName <em>Matching Strategy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Strategy Class Name</em>' attribute.
	 * @see #getMatchingStrategyClassName()
	 * @generated
	 */
	void setMatchingStrategyClassName(String value);

	/**
	 * Returns the value of the '<em><b>View Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Provider Class Name</em>' attribute.
	 * @see #setViewProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ViewProviderClassName()
	 * @model
	 * @generated
	 */
	String getViewProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getViewProviderClassName <em>View Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Provider Class Name</em>' attribute.
	 * @see #getViewProviderClassName()
	 * @generated
	 */
	void setViewProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Edit Part Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Part Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Part Provider Class Name</em>' attribute.
	 * @see #setEditPartProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_EditPartProviderClassName()
	 * @model
	 * @generated
	 */
	String getEditPartProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getEditPartProviderClassName <em>Edit Part Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Part Provider Class Name</em>' attribute.
	 * @see #getEditPartProviderClassName()
	 * @generated
	 */
	void setEditPartProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel Support Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Support Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Support Provider Class Name</em>' attribute.
	 * @see #setMetamodelSupportProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_MetamodelSupportProviderClassName()
	 * @model
	 * @generated
	 */
	String getMetamodelSupportProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getMetamodelSupportProviderClassName <em>Metamodel Support Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel Support Provider Class Name</em>' attribute.
	 * @see #getMetamodelSupportProviderClassName()
	 * @generated
	 */
	void setMetamodelSupportProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Modeling Assistant Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Assistant Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Assistant Provider Class Name</em>' attribute.
	 * @see #setModelingAssistantProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_ModelingAssistantProviderClassName()
	 * @model
	 * @generated
	 */
	String getModelingAssistantProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getModelingAssistantProviderClassName <em>Modeling Assistant Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Assistant Provider Class Name</em>' attribute.
	 * @see #getModelingAssistantProviderClassName()
	 * @generated
	 */
	void setModelingAssistantProviderClassName(String value);

	/**
	 * Returns the value of the '<em><b>Icon Provider Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Provider Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Provider Class Name</em>' attribute.
	 * @see #setIconProviderClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenDiagram_IconProviderClassName()
	 * @model
	 * @generated
	 */
	String getIconProviderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getIconProviderClassName <em>Icon Provider Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Provider Class Name</em>' attribute.
	 * @see #getIconProviderClassName()
	 * @generated
	 */
	void setIconProviderClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * == domainMetaModel.getGenModel()
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	GenModel getEMFGenModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getPluginQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEditorQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEditPartFactoryQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Need this one for NewDiagramAction. Takes first diagramRunTimeClass and it's package's namespace. Perhaps, should just reference appropriate genModel instead
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.gmf.codegen.gmfgen.StringArray"
	 * @generated
	 */
	String[] getRequiredPluginIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Need this for customizing Init Diagram Action class name
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getInitDiagramFileActionQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getViewProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEditPartProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMetamodelSupportProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getModelingAssistantProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getIconProviderQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getActionBarContributorQualifiedClassName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMatchingStrategyQualifiedClassName();

} // GenDiagram
