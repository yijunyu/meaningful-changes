/**
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.svg;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.transcoder.Transcoder;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.ImageTranscoder;
import org.apache.batik.util.XMLResourceDescriptor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.internal.runtime.lite.svg.Activator;
import org.eclipse.gmf.internal.runtime.lite.svg.ImageTranscoderEx;
import org.eclipse.gmf.internal.runtime.lite.svg.InferringNamespaceContext;
import org.eclipse.gmf.internal.runtime.lite.svg.SVGGraphics2D;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class SVGFigure extends Figure {

	private String uri;
	private Document document;
	private boolean failedToLoadDocument;
	private boolean safeRendering;
	private boolean directRenderingSucceeded;
	private Rectangle2D aoi;

	public final String getURI() {
		return uri;
	}

	public final void setURI(String uri) {
		setURI(uri, true);
	}

	public void setURI(String uri, boolean loadOnDemand) {
		this.uri = uri;
		document = null;
		failedToLoadDocument = false;
		if (loadOnDemand) {
			loadDocument();
		}
	}

	private void loadDocument() {
		failedToLoadDocument = true;
		if (uri == null) {
			return;
		}
		String parser = XMLResourceDescriptor.getXMLParserClassName();
		SAXSVGDocumentFactory factory = new SAXSVGDocumentFactory(parser);
		try {
			document = factory.createDocument(uri);
			failedToLoadDocument = false;
		} catch (IOException e) {
			Activator.logError("Error loading SVG file", e);
		}
	}

	protected final Document getDocument() {
		if (failedToLoadDocument) {
			return null;
		}
		if (document == null) {
			loadDocument();
		}
		return document;
	}

	/**
	 * Returns true if document was loaded without errors; tries to load document if needed.
	 */
	public final boolean checkContentAvailable() {
		return getDocument() != null;
	}

	private XPath getXPath() {
		XPath xpath = XPathFactory.newInstance().newXPath();
		xpath.setNamespaceContext(new InferringNamespaceContext(getDocument().getDocumentElement()));
		return xpath;
	}

	/**
	 * Executes XPath query over the SVG document.
	 */
	protected final NodeList getNodes(String query) {
		Document document = getDocument();
		if (document != null) {
			try {
				return (NodeList) getXPath().evaluate(query, document, XPathConstants.NODESET);
			} catch (XPathExpressionException e) {
				throw new RuntimeException(e);
			}
		}
		return null;
	}

	private void renderDocument(Transcoder transcoder, Document document) {
		try {
			Rectangle r = getClientArea();
			transcoder.addTranscodingHint(ImageTranscoder.KEY_WIDTH, new Float(r.width));
			transcoder.addTranscodingHint(ImageTranscoder.KEY_HEIGHT, new Float(r.height));
			if (aoi != null) {
				transcoder.addTranscodingHint(ImageTranscoder.KEY_AOI, aoi);
			}
			transcoder.transcode(new TranscoderInput(document), new TranscoderOutput());
		} catch (TranscoderException e) {
			Activator.logError("Error rendering SVG image", e);
		}
	}

	@Override
	protected void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);
		Document document = getDocument();
		if (document == null) {
			return;
		}
		directRenderingSucceeded = false;
		if (safeRendering) {
			paintUsingAWT(graphics, document);
		} else {
			// Try to paint directly on provided graphics with fallback to
			// safe routine.
			try {
				graphics.pushState();
				paintDirectly(graphics, document);
				directRenderingSucceeded = true;
			} catch (RuntimeException e) {
				Activator.log(IStatus.INFO, "Failed to paint SVG image directly", e);
				graphics.restoreState();
				paintUsingAWT(graphics, document);
			} finally {
				graphics.popState();
			}
		}
	}

	private void paintDirectly(final Graphics graphics, Document document) {
		ImageTranscoderEx transcoder = new ImageTranscoderEx() {

			@Override
			protected Graphics2D createGraphics(int w, int h) {
				return new SVGGraphics2D(graphics);
			}
		};
		renderDocument(transcoder, document);
	}

	private void paintUsingAWT(Graphics graphics, Document document) {
		Image image = null;
		try {
			// SimpleImageTranscoder transcoder = new SimpleImageTranscoder();
			ImageTranscoderEx transcoder = new ImageTranscoderEx();
			renderDocument(transcoder, document);
			BufferedImage awtImage = transcoder.getBufferedImage();
			if (awtImage != null) {
				image = SVGGraphics2D.toSWT(Display.getCurrent(), awtImage);
				Rectangle r = getClientArea();
				graphics.drawImage(image, r.x, r.y);
			}
		} finally {
			if (image != null) {
				image.dispose();
			}
		}
	}

	public final boolean isDirectRenderingSucceeded() {
		return directRenderingSucceeded;
	}

	public final boolean isSafeRendering() {
		return safeRendering;
	}

	public void setSafeRendering(boolean safeRendering) {
		this.safeRendering = safeRendering;
		repaint();
	}

	public final Rectangle2D getAreaOfInterest() {
		if (aoi == null) {
			return null;
		}
		Rectangle2D result = new Rectangle2D.Double();
		result.setRect(aoi);
		return result;
	}

	public void setAreaOfInterest(Rectangle2D value) {
		if (value == null) {
			aoi = null;
			return;
		}
		aoi = new Rectangle2D.Double();
		aoi.setRect(value);
		repaint();
	}
}
