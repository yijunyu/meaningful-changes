/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage
 * @generated
 */
public interface GMFGenFactory extends EFactory{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFGenFactory eINSTANCE = new org.eclipse.gmf.codegen.gmfgen.impl.GMFGenFactoryImpl();

	/**
	 * Returns a new object of class '<em>Gen Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Diagram</em>'.
	 * @generated
	 */
	GenDiagram createGenDiagram();

	/**
	 * Returns a new object of class '<em>Gen Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Node</em>'.
	 * @generated
	 */
	GenNode createGenNode();

	/**
	 * Returns a new object of class '<em>Gen Child Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Child Node</em>'.
	 * @generated
	 */
	GenChildNode createGenChildNode();

	/**
	 * Returns a new object of class '<em>Gen Child Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Child Container</em>'.
	 * @generated
	 */
	GenChildContainer createGenChildContainer();

	/**
	 * Returns a new object of class '<em>Gen Link With Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Link With Class</em>'.
	 * @generated
	 */
	GenLinkWithClass createGenLinkWithClass();

	/**
	 * Returns a new object of class '<em>Gen Link Reference Only</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Link Reference Only</em>'.
	 * @generated
	 */
	GenLinkReferenceOnly createGenLinkReferenceOnly();

	/**
	 * Returns a new object of class '<em>Link Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Label</em>'.
	 * @generated
	 */
	LinkLabel createLinkLabel();

	/**
	 * Returns a new object of class '<em>Color Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Attributes</em>'.
	 * @generated
	 */
	ColorAttributes createColorAttributes();

	/**
	 * Returns a new object of class '<em>Shape Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shape Attributes</em>'.
	 * @generated
	 */
	ShapeAttributes createShapeAttributes();

	/**
	 * Returns a new object of class '<em>Default Size Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Size Attributes</em>'.
	 * @generated
	 */
	DefaultSizeAttributes createDefaultSizeAttributes();

	/**
	 * Returns a new object of class '<em>Basic Node Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Node Viewmap</em>'.
	 * @generated
	 */
	BasicNodeViewmap createBasicNodeViewmap();

	/**
	 * Returns a new object of class '<em>Decorated Connection Viewmap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decorated Connection Viewmap</em>'.
	 * @generated
	 */
	DecoratedConnectionViewmap createDecoratedConnectionViewmap();

	/**
	 * Returns a new object of class '<em>Link Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Decoration</em>'.
	 * @generated
	 */
	LinkDecoration createLinkDecoration();

	/**
	 * Returns a new object of class '<em>Palette</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Palette</em>'.
	 * @generated
	 */
	Palette createPalette();

	/**
	 * Returns a new object of class '<em>Node Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Entry</em>'.
	 * @generated
	 */
	NodeEntry createNodeEntry();

	/**
	 * Returns a new object of class '<em>Link Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Entry</em>'.
	 * @generated
	 */
	LinkEntry createLinkEntry();

	/**
	 * Returns a new object of class '<em>Tool Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Group</em>'.
	 * @generated
	 */
	ToolGroup createToolGroup();

	/**
	 * Returns a new object of class '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Expression</em>'.
	 * @generated
	 */
	ValueExpression createValueExpression();

	/**
	 * Returns a new object of class '<em>Model Element Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Selector</em>'.
	 * @generated
	 */
	ModelElementSelector createModelElementSelector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GMFGenPackage getGMFGenPackage();

} //GMFGenFactory
