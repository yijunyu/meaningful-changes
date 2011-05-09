/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.ChildNodeMapping;
import org.eclipse.gmf.mappings.Constraint;
import org.eclipse.gmf.mappings.CreationTool;
import org.eclipse.gmf.mappings.FeatureSeqInitializer;
import org.eclipse.gmf.mappings.FeatureValueSpec;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LinkConstraints;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.NewActionTool;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.ToolGroup;
import org.eclipse.gmf.mappings.ValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFMapFactoryImpl extends EFactoryImpl implements GMFMapFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFMapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GMFMapPackage.NODE_MAPPING: return createNodeMapping();
			case GMFMapPackage.CHILD_NODE_MAPPING: return createChildNodeMapping();
			case GMFMapPackage.LINK_MAPPING: return createLinkMapping();
			case GMFMapPackage.CANVAS_MAPPING: return createCanvasMapping();
			case GMFMapPackage.MAPPING: return createMapping();
			case GMFMapPackage.TOOL_GROUP: return createToolGroup();
			case GMFMapPackage.CREATION_TOOL: return createCreationTool();
			case GMFMapPackage.NEW_ACTION_TOOL: return createNewActionTool();
			case GMFMapPackage.CONSTRAINT: return createConstraint();
			case GMFMapPackage.LINK_CONSTRAINTS: return createLinkConstraints();
			case GMFMapPackage.VALUE_EXPRESSION: return createValueExpression();
			case GMFMapPackage.FEATURE_SEQ_INITIALIZER: return createFeatureSeqInitializer();
			case GMFMapPackage.FEATURE_VALUE_SPEC: return createFeatureValueSpec();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMapping createNodeMapping() {
		NodeMappingImpl nodeMapping = new NodeMappingImpl();
		return nodeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildNodeMapping createChildNodeMapping() {
		ChildNodeMappingImpl childNodeMapping = new ChildNodeMappingImpl();
		return childNodeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMapping createLinkMapping() {
		LinkMappingImpl linkMapping = new LinkMappingImpl();
		return linkMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasMapping createCanvasMapping() {
		CanvasMappingImpl canvasMapping = new CanvasMappingImpl();
		return canvasMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolGroup createToolGroup() {
		ToolGroupImpl toolGroup = new ToolGroupImpl();
		return toolGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationTool createCreationTool() {
		CreationToolImpl creationTool = new CreationToolImpl();
		return creationTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewActionTool createNewActionTool() {
		NewActionToolImpl newActionTool = new NewActionToolImpl();
		return newActionTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkConstraints createLinkConstraints() {
		LinkConstraintsImpl linkConstraints = new LinkConstraintsImpl();
		return linkConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExpression createValueExpression() {
		ValueExpressionImpl valueExpression = new ValueExpressionImpl();
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSeqInitializer createFeatureSeqInitializer() {
		FeatureSeqInitializerImpl featureSeqInitializer = new FeatureSeqInitializerImpl();
		return featureSeqInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValueSpec createFeatureValueSpec() {
		FeatureValueSpecImpl featureValueSpec = new FeatureValueSpecImpl();
		return featureValueSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFMapPackage getGMFMapPackage() {
		return (GMFMapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static GMFMapPackage getPackage() {
		return GMFMapPackage.eINSTANCE;
	}

} //GMFMapFactoryImpl
