/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.naming.gen;

import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.internal.bridge.naming.ClassNameStrategy;
import org.eclipse.gmf.internal.bridge.naming.CollectingDispenser;
import org.eclipse.gmf.internal.bridge.naming.NamingStrategy;
import org.eclipse.gmf.internal.bridge.naming.UniqueValueDispenser;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * @author artem
 */
public class GenModelNamingMediatorImpl implements GenModelNamingMediator {

	private UniqueValueDispenser myDispenser;
	private NamingStrategy myViewFactory;
	private NamingStrategy myEditPart;
	private NamingStrategy myItemSemanticPolicy;
	private NamingStrategy myCanonicalPolicy;
	private NamingStrategy myNodeGraphicalPolicy;
	private NamingStrategy myTextViewFactory;

	public GenModelNamingMediatorImpl() {
		this(new CollectingDispenser());
	}

	public GenModelNamingMediatorImpl(UniqueValueDispenser dispenser) {
		setViewFactory(new ClassNameStrategy(GenCommonBase.NOTATION_VIEW_FACTORY_SUFFIX, null, dispenser));
		setEditPart(new ClassNameStrategy(GenCommonBase.EDIT_PART_SUFFIX, null, dispenser));
		setItemSemanticPolicy(new ClassNameStrategy(GenCommonBase.ITEM_SEMANTIC_EDIT_POLICY_SUFFIX, null, dispenser));
		setCanonicalPolicy(new ClassNameStrategy(GenChildContainer.CANONICAL_EDIT_POLICY_SUFFIX, null, dispenser));
		setNodeGraphicalPolicy(new ClassNameStrategy(GenNode.GRAPHICAL_NODE_EDIT_POLICY_SUFFIX, null, dispenser));
	}

	public UniqueValueDispenser getDispenser() {
		return myDispenser;
	}

	public void setViewFactory(NamingStrategy viewFactory) {
		myViewFactory = viewFactory;
	}

	public NamingStrategy getViewFactory() {
		return myViewFactory;
	}

	public void setEditPart(NamingStrategy editPart) {
		myEditPart = editPart;
	}

	public NamingStrategy getEditPart() {
		return myEditPart;
	}

	public void setItemSemanticPolicy(NamingStrategy itemSemanticPolicy) {
		myItemSemanticPolicy = itemSemanticPolicy;
	}

	public NamingStrategy getItemSemanticPolicy() {
		return myItemSemanticPolicy;
	}

	public void setCanonicalPolicy(NamingStrategy canonicalPolicy) {
		myCanonicalPolicy = canonicalPolicy;
	}

	public NamingStrategy getCanonicalPolicy() {
		return myCanonicalPolicy;
	}

	public void setTextViewFactory(NamingStrategy textViewFactory) {
		myTextViewFactory = textViewFactory;
	}

	public NamingStrategy getTextViewFactory() {
		return myTextViewFactory;
	}

	public void feed(GenDiagram genDiagram, CanvasMapping cme) {
		genDiagram.setNotationViewFactoryClassName(getViewFactory().get(cme));
		genDiagram.setEditPartClassName(getEditPart().get(cme));
		genDiagram.setItemSemanticEditPolicyClassName(getItemSemanticPolicy().get(cme));
		genDiagram.setCanonicalEditPolicyClassName(getCanonicalPolicy().get(cme));
	}

	private void setNodeGraphicalPolicy(NamingStrategy nodeGraphicalPolicy) {
		myNodeGraphicalPolicy = nodeGraphicalPolicy;
	}

	private NamingStrategy getNodeGraphicalPolicy() {
		return myNodeGraphicalPolicy;
	}

	public void feed(GenTopLevelNode genNode, NodeMapping nme) {
		genNode.setNotationViewFactoryClassName(getViewFactory().get(nme));
		genNode.setEditPartClassName(getEditPart().get(nme));
		genNode.setItemSemanticEditPolicyClassName(getItemSemanticPolicy().get(nme));
		genNode.setCanonicalEditPolicyClassName(getCanonicalPolicy().get(nme));
		genNode.setGraphicalNodeEditPolicyClassName(getNodeGraphicalPolicy().get(nme));
	}

	public void feed(GenChildNode childNode, NodeMapping nme) {
		childNode.setNotationViewFactoryClassName(getViewFactory().get(nme));
		childNode.setEditPartClassName(getEditPart().get(nme));
		childNode.setItemSemanticEditPolicyClassName(getItemSemanticPolicy().get(nme));
		childNode.setCanonicalEditPolicyClassName(getCanonicalPolicy().get(nme));
		childNode.setGraphicalNodeEditPolicyClassName(getNodeGraphicalPolicy().get(nme));
	}

	public void feed(GenLink genLink, LinkMapping lme) {
		genLink.setNotationViewFactoryClassName(getViewFactory().get(lme));
		genLink.setEditPartClassName(getEditPart().get(lme));
		genLink.setItemSemanticEditPolicyClassName(getItemSemanticPolicy().get(lme));
	}

	public void feed(GenCompartment genCompartment, CompartmentMapping mapping) {
		genCompartment.setNotationViewFactoryClassName(getViewFactory().get(mapping));
		genCompartment.setEditPartClassName(getEditPart().get(mapping));
		genCompartment.setItemSemanticEditPolicyClassName(getItemSemanticPolicy().get(mapping));
		genCompartment.setCanonicalEditPolicyClassName(getCanonicalPolicy().get(mapping));
	}

	public void feed(GenNodeLabel label, LabelMapping labelMapping) {
		label.setNotationViewFactoryClassName(getViewFactory().get(labelMapping));
		label.setEditPartClassName(getEditPart().get(labelMapping));
		label.setItemSemanticEditPolicyClassName(getItemSemanticPolicy().get(labelMapping));
	}

	public void feed(GenLinkLabel label, LabelMapping labelMapping) {
		label.setNotationViewFactoryClassName(getViewFactory().get(labelMapping));
		label.setEditPartClassName(getEditPart().get(labelMapping));
		label.setItemSemanticEditPolicyClassName(getItemSemanticPolicy().get(labelMapping));
	}
}
