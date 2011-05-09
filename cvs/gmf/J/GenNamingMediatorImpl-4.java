/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.naming.gen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenContainerBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.MetamodelType;
import org.eclipse.gmf.codegen.gmfgen.SpecializationType;
import org.eclipse.gmf.internal.bridge.naming.ClassGenNamingStrategy;
import org.eclipse.gmf.internal.bridge.naming.DefaultGenNamingStrategy;
import org.eclipse.gmf.internal.bridge.naming.DesignGenNamingStrategy;
import org.eclipse.gmf.internal.bridge.naming.GenNamingStrategy;
import org.eclipse.gmf.internal.common.IncrementalNamesDispenser;
import org.eclipse.gmf.internal.common.NamesDispenser;

/**
 * @author dstadnik
 */
public class GenNamingMediatorImpl implements GenNamingMediator {

	public static final int COLLECT_NAMES_MODE = 0;

	public static final int DISPENSE_NAMES_MODE = 1;

	private final GMFGenPackage M = GMFGenPackage.eINSTANCE;

	private int mode;

	private NamesDispenser dispenser;

	private GenNamingStrategy viewFactory;

	private GenNamingStrategy editPart;

	private GenNamingStrategy itemSemanticPolicy;

	private GenNamingStrategy canonicalPolicy;

	private GenNamingStrategy nodeGraphicalPolicy;

	private GenNamingStrategy editHelper;

	private GenNamingStrategy editHelperAdvice;

	private GenNamingStrategy linkCreateCommand;

	private GenNamingStrategy nodeCreateCommand;

	private GenNamingStrategy linkReorientCommand;

	public GenNamingMediatorImpl() {
		this(new IncrementalNamesDispenser());
	}

	public GenNamingMediatorImpl(NamesDispenser dispenser) {
		this.dispenser = dispenser;
		mode = DISPENSE_NAMES_MODE;
		setViewFactory(createNamingStrategy(GenCommonBase.NOTATION_VIEW_FACTORY_SUFFIX));
		setEditPart(createNamingStrategy(GenCommonBase.EDIT_PART_SUFFIX));
		setItemSemanticPolicy(createNamingStrategy(GenCommonBase.ITEM_SEMANTIC_EDIT_POLICY_SUFFIX));
		setCanonicalPolicy(createNamingStrategy(GenChildContainer.CANONICAL_EDIT_POLICY_SUFFIX));
		setNodeGraphicalPolicy(createNamingStrategy(GenNode.GRAPHICAL_NODE_EDIT_POLICY_SUFFIX));
		setEditHelper(createNamingStrategy(MetamodelType.EDIT_HELPER_SUFFIX));
		setEditHelperAdvice(createNamingStrategy(SpecializationType.EDIT_HELPER_ADVICE_SUFFIX));
		setLinkCreateCommand(createNamingStrategy(GenLink.CREATE_COMMAND_SUFFIX));
		setNodeCreateCommand(createNamingStrategy(GenNode.CREATE_COMMAND_SUFFIX));
		setLinkReorientCommand(createNamingStrategy(GenLink.REORIENT_COMMAND_SUFFIX));
	}

	protected GenNamingStrategy createNamingStrategy(String suffixPart) {
		// prefix stack
		GenNamingStrategy pns = new DefaultGenNamingStrategy(null, null, null, null);
		pns = new DesignGenNamingStrategy(null, null, pns, null);
		pns = new ClassGenNamingStrategy(null, null, pns, null);
		// primary stack
		GenNamingStrategy ns = new DefaultGenNamingStrategy(suffixPart, dispenser, null, pns);
		ns = new DesignGenNamingStrategy(suffixPart, dispenser, ns, pns);
		ns = new ClassGenNamingStrategy(suffixPart, dispenser, ns, pns);
		return ns;
	}

	public void reset() {
		if (dispenser != null) {
			dispenser.clear();
		}
	}

	public final int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		if (mode != COLLECT_NAMES_MODE && mode != DISPENSE_NAMES_MODE) {
			throw new IllegalArgumentException();
		}
		this.mode = mode;
	}

	protected void feedName(EObject element, EAttribute feature, GenNamingStrategy strategy, EObject refElement) {
		switch (getMode()) {
		case COLLECT_NAMES_MODE:
			if (element.eIsSet(feature)) {
				dispenser.add((String) element.eGet(feature));
			}
			break;
		case DISPENSE_NAMES_MODE:
			if (!element.eIsSet(feature)) {
				element.eSet(feature, getName(refElement, strategy));
			}
			break;
		}
	}

	protected void feedName(EObject element, EAttribute feature, GenNamingStrategy strategy) {
		feedName(element, feature, strategy, element);
	}

	public void feed(GenDiagram element) {
		dispenser.add(element.getBaseExternalNodeLabelEditPartClassName());
		dispenser.add(element.getBaseItemSemanticEditPolicyClassName());
		dispenser.add(element.getBaseGraphicalNodeEditPolicyClassName());
		dispenser.add(element.getBaseEditHelperClassName());

		feedContainer(element);
	}

	public void feed(GenNode element) {
		feedContainer(element);
		feedName(element, M.getGenNode_GraphicalNodeEditPolicyClassName(), getNodeGraphicalPolicy());
		feedName(element, M.getGenNode_CreateCommandClassName(), getNodeCreateCommand());
	}

	public void feed(GenCompartment element) {
		feedContainer(element);
	}

	public void feed(GenLink element) {
		feedCommon(element);
		feedName(element, M.getGenLink_CreateCommandClassName(), getLinkCreateCommand());
		feedName(element, M.getGenLink_ReorientCommandClassName(), getLinkReorientCommand());
	}

	public void feed(GenLabel element) {
		feedCommon(element);
	}

	protected void feedContainer(GenContainerBase element) {
		feedCommon(element);
		feedName(element, M.getGenContainerBase_CanonicalEditPolicyClassName(), getCanonicalPolicy());
	}

	protected void feedCommon(GenCommonBase element) {
		feedName(element, M.getGenCommonBase_NotationViewFactoryClassName(), getViewFactory());
		feedName(element, M.getGenCommonBase_EditPartClassName(), getEditPart());
		feedName(element, M.getGenCommonBase_ItemSemanticEditPolicyClassName(), getItemSemanticPolicy());
		if (element.getElementType() instanceof MetamodelType) {
			MetamodelType type = (MetamodelType) element.getElementType();
			feedName(type, M.getMetamodelType_EditHelperClassName(), getEditHelper(), element);
//		} else if (element.getElementType() instanceof SpecializationType) {
//			/*
//			 * Uncoment once we generate anything reasonable in the advice's body;
//			 * otherwise no reason to generate empty class
//			 */
//			SpecializationType type = (SpecializationType) element.getElementType();
//			feedName(type, M.getSpecializationType_EditHelperAdviceClassName(), getEditHelperAdvice(), element);
		}
	}

	protected String getName(EObject element, GenNamingStrategy strategy) {
		if (element instanceof GenDiagram) {
			return strategy.get((GenDiagram) element);
		} else if (element instanceof GenNode) {
			return strategy.get((GenNode) element);
		} else if (element instanceof GenCompartment) {
			return strategy.get((GenCompartment) element);
		} else if (element instanceof GenLink) {
			return strategy.get((GenLink) element);
		} else if (element instanceof GenLabel) {
			return strategy.get((GenLabel) element);
		}
		throw new IllegalArgumentException();
	}

	public void traverse(GenEditorGenerator gen) {
		GenDiagram diagram = gen.getDiagram();
		feed(diagram);
		for (GenNode node : diagram.getTopLevelNodes()) {
			feed(node);
			for (GenLabel label : node.getLabels()) {
				feed(label);
			}
		}
		for (GenNode node : diagram.getChildNodes()) {
			feed(node);
			for (GenLabel label : node.getLabels()) {
				feed(label);
			}
		}
		for (GenCompartment node : diagram.getCompartments()) {
			feed(node);
		}
		for (GenLink link : diagram.getLinks()) {
			feed(link);
			for (GenLabel label : link.getLabels()) {
				feed(label);
			}
		}
	}

	public GenNamingStrategy getViewFactory() {
		return viewFactory;
	}

	public void setViewFactory(GenNamingStrategy viewFactory) {
		this.viewFactory = viewFactory;
	}

	public GenNamingStrategy getEditPart() {
		return editPart;
	}

	public void setEditPart(GenNamingStrategy editPart) {
		this.editPart = editPart;
	}

	public GenNamingStrategy getItemSemanticPolicy() {
		return itemSemanticPolicy;
	}

	public void setItemSemanticPolicy(GenNamingStrategy itemSemanticPolicy) {
		this.itemSemanticPolicy = itemSemanticPolicy;
	}

	public GenNamingStrategy getCanonicalPolicy() {
		return canonicalPolicy;
	}

	public void setCanonicalPolicy(GenNamingStrategy canonicalPolicy) {
		this.canonicalPolicy = canonicalPolicy;
	}

	public GenNamingStrategy getNodeGraphicalPolicy() {
		return nodeGraphicalPolicy;
	}

	public void setNodeGraphicalPolicy(GenNamingStrategy nodeGraphicalPolicy) {
		this.nodeGraphicalPolicy = nodeGraphicalPolicy;
	}

	public GenNamingStrategy getEditHelper() {
		return editHelper;
	}

	public void setEditHelper(GenNamingStrategy editHelper) {
		this.editHelper = editHelper;
	}

	public GenNamingStrategy getEditHelperAdvice() {
		return editHelperAdvice;
	}

	public void setEditHelperAdvice(GenNamingStrategy editHelperAdvice) {
		this.editHelperAdvice = editHelperAdvice;
	}

	public GenNamingStrategy getLinkCreateCommand() {
		return linkCreateCommand;
	}

	public void setLinkCreateCommand(GenNamingStrategy linkCreateCommand) {
		this.linkCreateCommand = linkCreateCommand;
	}

	public GenNamingStrategy getNodeCreateCommand() {
		return nodeCreateCommand;
	}

	public void setNodeCreateCommand(GenNamingStrategy nodeCreateCommand) {
		this.nodeCreateCommand = nodeCreateCommand;
	}

	public GenNamingStrategy getLinkReorientCommand() {
		return linkReorientCommand;
	}

	public void setLinkReorientCommand(GenNamingStrategy linkReorientCommand) {
		this.linkReorientCommand = linkReorientCommand;
	}
}
