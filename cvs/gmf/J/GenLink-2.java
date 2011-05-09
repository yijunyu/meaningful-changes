/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getDomainLinkTargetFeature <em>Domain Link Target Feature</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getSourceDecorationFigureQualifiedClassName <em>Source Decoration Figure Qualified Class Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getTargetDecorationFigureQualifiedClassName <em>Target Decoration Figure Qualified Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink()
 * @model abstract="true"
 * @generated
 */
public interface GenLink extends GenBaseElement {
	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_Diagram()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram#getLinks
	 * @model opposite="links" required="true" changeable="false"
	 * @generated
	 */
	GenDiagram getDiagram();

	/**
	 * Returns the value of the '<em><b>Domain Link Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Link Target Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Link Target Feature</em>' reference.
	 * @see #setDomainLinkTargetFeature(EStructuralFeature)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_DomainLinkTargetFeature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getDomainLinkTargetFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getDomainLinkTargetFeature <em>Domain Link Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Link Target Feature</em>' reference.
	 * @see #getDomainLinkTargetFeature()
	 * @generated
	 */
	void setDomainLinkTargetFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One of LINE_* constants defined in {@link org.eclipse.draw2d.Graphics}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see #setLineStyle(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_LineStyle()
	 * @model
	 * @generated
	 */
	String getLineStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(String value);

	/**
	 * Returns the value of the '<em><b>Figure Qualified Class Name</b></em>' attribute.
	 * The default value is <code>"org.eclipse.draw2d.PolylineConnection"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall be {@link org.eclipse.draw2d.PolylineConnection} or subclass thereof to use decorations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Figure Qualified Class Name</em>' attribute.
	 * @see #setFigureQualifiedClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_FigureQualifiedClassName()
	 * @model default="org.eclipse.draw2d.PolylineConnection"
	 * @generated
	 */
	String getFigureQualifiedClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure Qualified Class Name</em>' attribute.
	 * @see #getFigureQualifiedClassName()
	 * @generated
	 */
	void setFigureQualifiedClassName(String value);

	/**
	 * Returns the value of the '<em><b>Source Decoration Figure Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Implementation of {@link org.eclipse.draw2d.RotatableDecoration}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Decoration Figure Qualified Class Name</em>' attribute.
	 * @see #setSourceDecorationFigureQualifiedClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_SourceDecorationFigureQualifiedClassName()
	 * @model
	 * @generated
	 */
	String getSourceDecorationFigureQualifiedClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getSourceDecorationFigureQualifiedClassName <em>Source Decoration Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Decoration Figure Qualified Class Name</em>' attribute.
	 * @see #getSourceDecorationFigureQualifiedClassName()
	 * @generated
	 */
	void setSourceDecorationFigureQualifiedClassName(String value);

	/**
	 * Returns the value of the '<em><b>Target Decoration Figure Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Implementation of {@link org.eclipse.draw2d.RotatableDecoration}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Decoration Figure Qualified Class Name</em>' attribute.
	 * @see #setTargetDecorationFigureQualifiedClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLink_TargetDecorationFigureQualifiedClassName()
	 * @model
	 * @generated
	 */
	String getTargetDecorationFigureQualifiedClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLink#getTargetDecorationFigureQualifiedClassName <em>Target Decoration Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Decoration Figure Qualified Class Name</em>' attribute.
	 * @see #getTargetDecorationFigureQualifiedClassName()
	 * @generated
	 */
	void setTargetDecorationFigureQualifiedClassName(String value);

} // GenLink
