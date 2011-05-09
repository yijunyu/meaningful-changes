/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage
 * @generated
 */
public interface GMFGraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFGraphFactory eINSTANCE = org.eclipse.gmf.gmfgraph.impl.GMFGraphFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas</em>'.
	 * @generated
	 */
	Canvas createCanvas();

	/**
	 * Returns a new object of class '<em>Figure Gallery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Figure Gallery</em>'.
	 * @generated
	 */
	FigureGallery createFigureGallery();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment</em>'.
	 * @generated
	 */
	Compartment createCompartment();

	/**
	 * Returns a new object of class '<em>Diagram Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Label</em>'.
	 * @generated
	 */
	DiagramLabel createDiagramLabel();

	/**
	 * Returns a new object of class '<em>General Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Facet</em>'.
	 * @generated
	 */
	GeneralFacet createGeneralFacet();

	/**
	 * Returns a new object of class '<em>Alignment Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alignment Facet</em>'.
	 * @generated
	 */
	AlignmentFacet createAlignmentFacet();

	/**
	 * Returns a new object of class '<em>Gradient Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gradient Facet</em>'.
	 * @generated
	 */
	GradientFacet createGradientFacet();

	/**
	 * Returns a new object of class '<em>Label Offset Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Offset Facet</em>'.
	 * @generated
	 */
	LabelOffsetFacet createLabelOffsetFacet();

	/**
	 * Returns a new object of class '<em>Figure Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Figure Ref</em>'.
	 * @generated
	 */
	FigureRef createFigureRef();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Labeled Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Container</em>'.
	 * @generated
	 */
	LabeledContainer createLabeledContainer();

	/**
	 * Returns a new object of class '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangle</em>'.
	 * @generated
	 */
	Rectangle createRectangle();

	/**
	 * Returns a new object of class '<em>Rounded Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rounded Rectangle</em>'.
	 * @generated
	 */
	RoundedRectangle createRoundedRectangle();

	/**
	 * Returns a new object of class '<em>Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ellipse</em>'.
	 * @generated
	 */
	Ellipse createEllipse();

	/**
	 * Returns a new object of class '<em>Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polyline</em>'.
	 * @generated
	 */
	Polyline createPolyline();

	/**
	 * Returns a new object of class '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon</em>'.
	 * @generated
	 */
	Polygon createPolygon();

	/**
	 * Returns a new object of class '<em>Polyline Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polyline Connection</em>'.
	 * @generated
	 */
	PolylineConnection createPolylineConnection();

	/**
	 * Returns a new object of class '<em>Polyline Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polyline Decoration</em>'.
	 * @generated
	 */
	PolylineDecoration createPolylineDecoration();

	/**
	 * Returns a new object of class '<em>Polygon Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon Decoration</em>'.
	 * @generated
	 */
	PolygonDecoration createPolygonDecoration();

	/**
	 * Returns a new object of class '<em>Custom Figure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Figure</em>'.
	 * @generated
	 */
	CustomFigure createCustomFigure();

	/**
	 * Returns a new object of class '<em>Custom Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Decoration</em>'.
	 * @generated
	 */
	CustomDecoration createCustomDecoration();

	/**
	 * Returns a new object of class '<em>Custom Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Connection</em>'.
	 * @generated
	 */
	CustomConnection createCustomConnection();

	/**
	 * Returns a new object of class '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RGB Color</em>'.
	 * @generated
	 */
	RGBColor createRGBColor();

	/**
	 * Returns a new object of class '<em>Constant Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Color</em>'.
	 * @generated
	 */
	ConstantColor createConstantColor();

	/**
	 * Returns a new object of class '<em>Basic Font</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Font</em>'.
	 * @generated
	 */
	BasicFont createBasicFont();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension</em>'.
	 * @generated
	 */
	Dimension createDimension();

	/**
	 * Returns a new object of class '<em>Insets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insets</em>'.
	 * @generated
	 */
	Insets createInsets();

	/**
	 * Returns a new object of class '<em>Line Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Border</em>'.
	 * @generated
	 */
	LineBorder createLineBorder();

	/**
	 * Returns a new object of class '<em>Margin Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Margin Border</em>'.
	 * @generated
	 */
	MarginBorder createMarginBorder();

	/**
	 * Returns a new object of class '<em>Compound Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Border</em>'.
	 * @generated
	 */
	CompoundBorder createCompoundBorder();

	/**
	 * Returns a new object of class '<em>Custom Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Border</em>'.
	 * @generated
	 */
	CustomBorder createCustomBorder();

	/**
	 * Returns a new object of class '<em>Custom Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Layout Data</em>'.
	 * @generated
	 */
	CustomLayoutData createCustomLayoutData();

	/**
	 * Returns a new object of class '<em>Grid Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Layout Data</em>'.
	 * @generated
	 */
	GridLayoutData createGridLayoutData();

	/**
	 * Returns a new object of class '<em>Border Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Border Layout Data</em>'.
	 * @generated
	 */
	BorderLayoutData createBorderLayoutData();

	/**
	 * Returns a new object of class '<em>Custom Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Layout</em>'.
	 * @generated
	 */
	CustomLayout createCustomLayout();

	/**
	 * Returns a new object of class '<em>Grid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Layout</em>'.
	 * @generated
	 */
	GridLayout createGridLayout();

	/**
	 * Returns a new object of class '<em>Border Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Border Layout</em>'.
	 * @generated
	 */
	BorderLayout createBorderLayout();

	/**
	 * Returns a new object of class '<em>Custom Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Attribute</em>'.
	 * @generated
	 */
	CustomAttribute createCustomAttribute();

	/**
	 * Returns a new object of class '<em>Figure Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Figure Accessor</em>'.
	 * @generated
	 */
	FigureAccessor createFigureAccessor();

	/**
	 * Returns a new object of class '<em>Flow Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Layout</em>'.
	 * @generated
	 */
	FlowLayout createFlowLayout();

	/**
	 * Returns a new object of class '<em>XY Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XY Layout</em>'.
	 * @generated
	 */
	XYLayout createXYLayout();

	/**
	 * Returns a new object of class '<em>XY Layout Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XY Layout Data</em>'.
	 * @generated
	 */
	XYLayoutData createXYLayoutData();

	/**
	 * Returns a new object of class '<em>Stack Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack Layout</em>'.
	 * @generated
	 */
	StackLayout createStackLayout();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GMFGraphPackage getGMFGraphPackage();

} //GMFGraphFactory
