/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.ui.dashboard;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * @author dstadnik
 */
public class DashboardFigure extends RectangleFigure {

	private static final int LINE_WIDTH = 6;

	private static final int TEXT_GAP = LINE_WIDTH + 3;

	private static final int ARROW_LENGTH = 15;

	private static final Color DASHBOARD_BG = new Color(null, 113, 104, 209);

	private static final Color DASHBOARD_FG = new Color(null, 169, 164, 227);

	private static final Color MODEL_BG = ColorConstants.white;

	private ImageFigure logoFigure;

	private IFigure statusFigure;

	// models

	private ModelFigure dgmFigure;

	private ModelFigure gdmFigure;

	private ModelFigure dmFigure;

	private ModelFigure tdmFigure;

	private ModelFigure mmFigure;

	private ModelFigure gmFigure;

	// flows

	private FlowFigure dm2dgmFlow;

	private FlowFigure dm2gdmFlow;

	private FlowFigure dm2tdmFlow;

	private FlowFigure dm2mmFlow;

	private FlowFigure gdm2mmFlow;

	private FlowFigure tdm2mmFlow;

	private FlowFigure mm2gmFlow;

	// flow actions

	private FlowActionFigure dm2dgmFigure;

	private FlowActionFigure dm2gdmFigure;

	private FlowActionFigure dm2tdmFigure;

	private FlowActionFigure dm2mmFigure;

	private FlowActionFigure mm2gmFigure;

	public DashboardFigure() {
		add(logoFigure = new ImageFigure() {

			protected void paintFigure(Graphics graphics) {
				if (getImage() != null) {
					graphics.drawImage(getImage(), new Rectangle(getImage().getBounds()), getBounds());
				}
			}
		});
		Image logoImage = Plugin.getDefault().getImageRegistry().get(Plugin.GMF_LOGO_IMAGE);
		if (logoImage != null) {
			logoFigure.setImage(logoImage);
		}
		add(dgmFigure = createModelFigure(Messages.DashboardFigure_DGM, Plugin.DGM_ICON));
		add(gdmFigure = createModelFigure(Messages.DashboardFigure_GDM, Plugin.GDM_ICON));
		add(dmFigure = createModelFigure(Messages.DashboardFigure_DM, Plugin.DM_ICON));
		add(tdmFigure = createModelFigure(Messages.DashboardFigure_TDM, Plugin.TDM_ICON));
		add(mmFigure = createModelFigure(Messages.DashboardFigure_MM, Plugin.MM_ICON));
		add(gmFigure = createModelFigure(Messages.DashboardFigure_GM, Plugin.GM_ICON));
		add(dm2dgmFlow = createFlowFigure(true));
		add(dm2gdmFlow = createFlowFigure(true));
		add(dm2tdmFlow = createFlowFigure(true));
		add(dm2mmFlow = createFlowFigure(true));
		add(gdm2mmFlow = createFlowFigure(false));
		add(tdm2mmFlow = createFlowFigure(false));
		add(mm2gmFlow = createFlowFigure(true));
		add(dm2dgmFigure = createFlowActionFigure());
		add(dm2gdmFigure = createFlowActionFigure());
		add(dm2tdmFigure = createFlowActionFigure());
		add(dm2mmFigure = createFlowActionFigure());
		add(mm2gmFigure = createFlowActionFigure());
		add(statusFigure = new Figure());
		statusFigure.setFont(JFaceResources.getBannerFont());
		ToolbarLayout statusLayout = new ToolbarLayout();
		statusLayout.setStretchMinorAxis(false);
		statusFigure.setLayoutManager(statusLayout);
		statusFigure.add(new Label());
		statusFigure.add(new Label());
		setLayoutManager(new DashboardLayout());
		setBorder(new MarginBorder(10));
		setBackgroundColor(DASHBOARD_BG);
		setForegroundColor(DASHBOARD_FG);
	}

	public ModelFigure getDGMFigure() {
		return dgmFigure;
	}

	public ModelFigure getGDMFigure() {
		return gdmFigure;
	}

	public ModelFigure getDMFigure() {
		return dmFigure;
	}

	public ModelFigure getTDMFigure() {
		return tdmFigure;
	}

	public ModelFigure getMMFigure() {
		return mmFigure;
	}

	public ModelFigure getGMFigure() {
		return gmFigure;
	}

	public FlowActionFigure getDM2DGMFigure() {
		return dm2dgmFigure;
	}

	public FlowActionFigure getDM2GDMFigure() {
		return dm2gdmFigure;
	}

	public FlowActionFigure getDM2TDMFigure() {
		return dm2tdmFigure;
	}

	public FlowActionFigure getDM2MMFigure() {
		return dm2mmFigure;
	}

	public FlowActionFigure getMM2GMFigure() {
		return mm2gmFigure;
	}

	public Label getStatusLine(int i) {
		return (Label) statusFigure.getChildren().get(i);
	}

	protected ModelFigure createModelFigure(String description, String iconKey) {
		ModelFigure modelFigure = new ModelFigure();
		modelFigure.setDescription(description);
		Image image = Plugin.getDefault().getImageRegistry().get(iconKey);
		if (image != null) {
			modelFigure.setIcon(image);
		}
		modelFigure.setBackgroundColor(MODEL_BG);
		modelFigure.setForegroundColor(DASHBOARD_FG);
		modelFigure.setLineWidth(LINE_WIDTH);
		modelFigure.setSpacing(TEXT_GAP);
		return modelFigure;
	}

	protected FlowFigure createFlowFigure(boolean directed) {
		FlowFigure flowFigure = new FlowFigure();
		if (directed) {
			PolygonDecoration decoration = new PolygonDecoration();
			PointList template = new PointList();
			template.addPoint(0, -LINE_WIDTH / 2);
			template.addPoint(0, LINE_WIDTH / 2);
			template.addPoint(-ARROW_LENGTH, LINE_WIDTH / 2 + 10);
			template.addPoint(-ARROW_LENGTH, -(LINE_WIDTH / 2 + 10));
			decoration.setTemplate(template);
			decoration.setScale(1, 1);
			flowFigure.setTargetDecoration(decoration);
		}
		flowFigure.setForegroundColor(DASHBOARD_FG);
		flowFigure.setLineWidth(LINE_WIDTH);
		return flowFigure;
	}

	protected FlowActionFigure createFlowActionFigure() {
		FlowActionFigure flowActionFigure = new FlowActionFigure();
		ToolbarLayout flowActionLayout = new ToolbarLayout();
		flowActionLayout.setStretchMinorAxis(false);
		flowActionLayout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		flowActionFigure.setLayoutManager(flowActionLayout);
		flowActionFigure.setBackgroundColor(MODEL_BG);
		flowActionFigure.setForegroundColor(DASHBOARD_FG);
		flowActionFigure.setLineWidth(LINE_WIDTH / 3);
		flowActionFigure.setBorder(new MarginBorder(TEXT_GAP / 2));
		return flowActionFigure;
	}

	protected void outlineShape(Graphics graphics) {
	}

	private class DashboardLayout extends AbstractLayout {

		private static final int MAX_BOX_WIDTH = 300;

		private static final int BOX_SPACING = 20;

		protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
			Dimension d = getLayoutData().getSize();
			Insets insets = container.getInsets();
			d = new Dimension(d.width + insets.getWidth(), d.height + insets.getHeight());
			return d.union(getBorderPreferredSize(container));
		}

		public void layout(IFigure container) {
			getLayoutData().apply(container.getClientArea().getLocation());
		}

		protected LayoutData getLayoutData() {
			Dimension dgmSize = dgmFigure.getPreferredSize();
			dgmSize.width = Math.min(dgmSize.width, MAX_BOX_WIDTH);
			Dimension dmSize = dmFigure.getPreferredSize();
			dmSize.width = Math.min(dmSize.width, MAX_BOX_WIDTH);;
			Dimension gdmSize = gdmFigure.getPreferredSize();
			gdmSize.width = Math.min(gdmSize.width, MAX_BOX_WIDTH);
			Dimension tdmSize = gdmFigure.getPreferredSize();
			tdmSize.width = Math.min(tdmSize.width, MAX_BOX_WIDTH);
			Dimension mmSize = mmFigure.getPreferredSize();
			mmSize.width = Math.min(mmSize.width, MAX_BOX_WIDTH);;
			Dimension gmSize = gmFigure.getPreferredSize();
			gmSize.width = Math.min(gmSize.width, MAX_BOX_WIDTH);
			Dimension dm2dgmSize = dm2dgmFigure.getPreferredSize();
			Dimension dm2gdmSize = dm2gdmFigure.getPreferredSize();
			Dimension dm2tdmSize = dm2tdmFigure.getPreferredSize();
			Dimension dm2mmSize = dm2mmFigure.getPreferredSize();
			Dimension mm2gmSize = mm2gmFigure.getPreferredSize();

			LayoutData data = new LayoutData();

			// boxes
			int dmY = gdmSize.height + BOX_SPACING;
			int dgmY = dmY + dmSize.height + BOX_SPACING;
			data.dgmBox = new Rectangle(0, dgmY, dgmSize.width, dgmSize.height);
			data.dm2dgmBox = new Rectangle((data.dgmBox.width - dm2dgmSize.width) / 2, dmY + (dmSize.height - dm2dgmSize.height) / 2, dm2dgmSize.width, dm2dgmSize.height);
			data.dmBox = new Rectangle(data.dm2dgmBox.x + data.dm2dgmBox.width + BOX_SPACING, dmY, dmSize.width, dmSize.height);
			int dm2tdmX = data.dmBox.x + (data.dmBox.width - dm2tdmSize.width) / 2;
			int gap1 = dm2tdmX - (data.dgmBox.x + data.dgmBox.width);
			if (gap1 < BOX_SPACING) {
				int delta = BOX_SPACING - gap1;
				data.dmBox.x += delta;
				dm2tdmX += delta;
			}
			data.dm2gdmBox = new Rectangle(data.dmBox.x + (data.dmBox.width - dm2gdmSize.width) / 2, (gdmSize.height - dm2gdmSize.height) / 2, dm2gdmSize.width, dm2gdmSize.height);
			data.gdmBox = new Rectangle(data.dm2gdmBox.x + data.dm2gdmBox.width + BOX_SPACING + ARROW_LENGTH, 0, gdmSize.width, gdmSize.height);
			int tdmY = data.dmBox.y + data.dmBox.height + BOX_SPACING;
			data.dm2tdmBox = new Rectangle(dm2tdmX, tdmY + (tdmSize.height - dm2tdmSize.height) / 2, dm2tdmSize.width, dm2tdmSize.height);
			data.tdmBox = new Rectangle(data.dm2tdmBox.x + data.dm2tdmBox.width + BOX_SPACING + ARROW_LENGTH, tdmY, tdmSize.width, tdmSize.height);
			data.dm2mmBox = new Rectangle(data.dmBox.x + data.dmBox.width + BOX_SPACING, data.dmBox.y + (data.dmBox.height - dm2mmSize.height) / 2, dm2mmSize.width, dm2mmSize.height);
			data.mmBox = new Rectangle(data.dm2mmBox.x + data.dm2mmBox.width + BOX_SPACING + ARROW_LENGTH, data.dmBox.y, mmSize.width, mmSize.height);
			int gmY = data.mmBox.y + data.mmBox.height + BOX_SPACING;
			data.mm2gmBox = new Rectangle(data.mmBox.x + data.mmBox.width + BOX_SPACING, data.mmBox.y + (data.mmBox.height - mm2gmSize.height) / 2, mm2gmSize.width, mm2gmSize.height);
			data.gmBox = new Rectangle(data.mm2gmBox.x - (gmSize.width - mm2gmSize.width) / 2, gmY, gmSize.width, gmSize.height);
			int gap2 = data.gmBox.x - (data.tdmBox.x + data.tdmBox.width);
			if (gap2 < BOX_SPACING) {
				int delta = BOX_SPACING - gap2;
				data.mm2gmBox.x += delta;
				data.gmBox.x += delta;
			}

			// points
			int pointsY = data.dmBox.y + data.dmBox.height / 2;
			data.dm2dgmPoints = new PointList(3);
			data.dm2dgmPoints.addPoint(data.dmBox.x, pointsY);
			data.dm2dgmPoints.addPoint(data.dm2dgmBox.x + data.dm2dgmBox.width / 2, pointsY);
			data.dm2dgmPoints.addPoint(data.dm2dgmBox.x + data.dm2dgmBox.width / 2, data.dgmBox.y);
			int pointsX = data.dmBox.x + data.dmBox.width / 2;
			data.dm2gdmPoints = new PointList(3);
			data.dm2gdmPoints.addPoint(pointsX, data.dmBox.y);
			data.dm2gdmPoints.addPoint(pointsX, data.dm2gdmBox.y + data.dm2gdmBox.height / 2);
			data.dm2gdmPoints.addPoint(data.gdmBox.x, data.dm2gdmBox.y + data.dm2gdmBox.height / 2);
			data.dm2tdmPoints = new PointList(3);
			data.dm2tdmPoints.addPoint(pointsX, data.dmBox.y + data.dmBox.height);
			data.dm2tdmPoints.addPoint(pointsX, data.dm2tdmBox.y + data.dm2tdmBox.height / 2);
			data.dm2tdmPoints.addPoint(data.tdmBox.x, data.dm2tdmBox.y + data.dm2tdmBox.height / 2);
			data.dm2mmPoints = new PointList(2);
			data.dm2mmPoints.addPoint(data.dmBox.x + data.dmBox.width, pointsY);
			data.dm2mmPoints.addPoint(data.mmBox.x, pointsY);
			int crossX = data.dm2mmBox.x + data.dm2mmBox.width / 2;
			data.gdm2mmPoints = new PointList(2);
			data.gdm2mmPoints.addPoint(crossX, data.gdmBox.y + data.gdmBox.height);
			data.gdm2mmPoints.addPoint(crossX, pointsY);
			data.tdm2mmPoints = new PointList(2);
			data.tdm2mmPoints.addPoint(crossX, data.tdmBox.y);
			data.tdm2mmPoints.addPoint(crossX, pointsY);
			data.mm2gmPoints = new PointList(3);
			data.mm2gmPoints.addPoint(data.mmBox.x + data.mmBox.width, pointsY);
			data.mm2gmPoints.addPoint(data.mm2gmBox.x + data.mm2gmBox.width / 2, pointsY);
			data.mm2gmPoints.addPoint(data.mm2gmBox.x + data.mm2gmBox.width / 2, data.gmBox.y);

			// logo and status
			int logoMaxWidth = data.dm2gdmBox.x - BOX_SPACING;
			int logoMaxHeight = data.dmBox.y - BOX_SPACING;
			Dimension logoSize = logoFigure.getPreferredSize();
			if (logoSize.width > logoMaxWidth || logoSize.height > logoMaxHeight) {
				double scale = Math.min((double) logoMaxWidth / logoSize.width, (double) logoMaxHeight / logoSize.height);
				logoSize.width *= scale;
				logoSize.height *= scale;
			}
			data.logoBox = new Rectangle(0, 0, logoSize.width, logoSize.height);
			Dimension statusSize = statusFigure.getPreferredSize();
			int statusX = Math.max(data.gmBox.x + data.gmBox.width - statusSize.width, data.gdmBox.x + data.gdmBox.width + BOX_SPACING);
			//int statusY = (data.mmBox.y - statusSize.height) / 2;
			data.statusBox = new Rectangle(statusX, 0, statusSize.width, statusSize.height);

			return data;
		}

		private class LayoutData {

			public Rectangle logoBox;

			public Rectangle statusBox;

			public Rectangle dgmBox;

			public Rectangle gdmBox;

			public Rectangle dmBox;

			public Rectangle tdmBox;

			public Rectangle mmBox;

			public Rectangle gmBox;

			public PointList dm2dgmPoints;

			public PointList dm2gdmPoints;

			public PointList dm2tdmPoints;

			public PointList dm2mmPoints;

			public PointList gdm2mmPoints;

			public PointList tdm2mmPoints;

			public PointList mm2gmPoints;

			public Rectangle dm2dgmBox;

			public Rectangle dm2gdmBox;

			public Rectangle dm2tdmBox;

			public Rectangle dm2mmBox;

			public Rectangle mm2gmBox;

			public void apply(Point offset) {
				logoFigure.setBounds(logoBox.getTranslated(offset));
				statusFigure.setBounds(statusBox.getTranslated(offset));
				dgmFigure.setBounds(dgmBox.getTranslated(offset));
				gdmFigure.setBounds(gdmBox.getTranslated(offset));
				dmFigure.setBounds(dmBox.getTranslated(offset));
				tdmFigure.setBounds(tdmBox.getTranslated(offset));
				mmFigure.setBounds(mmBox.getTranslated(offset));
				gmFigure.setBounds(gmBox.getTranslated(offset));
				dm2dgmFlow.setPoints(getTranslated(dm2dgmPoints, offset));
				dm2gdmFlow.setPoints(getTranslated(dm2gdmPoints, offset));
				dm2tdmFlow.setPoints(getTranslated(dm2tdmPoints, offset));
				dm2mmFlow.setPoints(getTranslated(dm2mmPoints, offset));
				gdm2mmFlow.setPoints(getTranslated(gdm2mmPoints, offset));
				tdm2mmFlow.setPoints(getTranslated(tdm2mmPoints, offset));
				mm2gmFlow.setPoints(getTranslated(mm2gmPoints, offset));
				dm2dgmFigure.setBounds(dm2dgmBox.getTranslated(offset));
				dm2gdmFigure.setBounds(dm2gdmBox.getTranslated(offset));
				dm2tdmFigure.setBounds(dm2tdmBox.getTranslated(offset));
				dm2mmFigure.setBounds(dm2mmBox.getTranslated(offset));
				mm2gmFigure.setBounds(mm2gmBox.getTranslated(offset));
			}

			private PointList getTranslated(PointList source, Point offset) {
				PointList target = new PointList(source.size());
				target.addAll(source);
				target.translate(offset);
				return target;
			}

			public Dimension getSize() {
				Rectangle bounds = logoBox.getCopy();
				bounds.union(statusBox);
				bounds.union(dgmBox);
				bounds.union(gdmBox);
				bounds.union(dmBox);
				bounds.union(tdmBox);
				bounds.union(mmBox);
				bounds.union(gmBox);
				return bounds.getSize();
			}
		}
	}
}
