/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure Gallery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Kind of explicit figure library notion. Allows to specify plugin ids (allows importing it later from gmfgen code) in addition to figures
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.FigureGallery#getFigures <em>Figures</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.FigureGallery#getImplBundles <em>Impl Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigureGallery()
 * @model
 * @generated
 */
public interface FigureGallery extends Identity{
	/**
	 * Returns the value of the '<em><b>Figures</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.gmfgraph.Figure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figures</em>' containment reference list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigureGallery_Figures()
	 * @model type="org.eclipse.gmf.gmfgraph.Figure" containment="true"
	 * @generated
	 */
	EList getFigures();

	/**
	 * Returns the value of the '<em><b>Impl Bundles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl Bundles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Bundles</em>' attribute list.
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getFigureGallery_ImplBundles()
	 * @model type="java.lang.String"
	 * @generated
	 */
	EList getImplBundles();

} // FigureGallery
