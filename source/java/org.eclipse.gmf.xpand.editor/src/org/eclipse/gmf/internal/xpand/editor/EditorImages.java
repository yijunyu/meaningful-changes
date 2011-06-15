/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.editor;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class EditorImages {

    public final static String EXTENSION = "extension.gif";

    public final static String OPERATION = "operation.gif";

    public final static String PROPERTY = "property.gif";

    public final static String VARIABLE = "variable.gif";

    public static final String TYPE = "type.gif";

    public static final String STATEMENT = "statement.gif";

    /**
     * The image registry containing <code>Image</code>s and
     * <code>ImageDescriptor</code>s.
     */
    private static ImageRegistry imageRegistry;

    /* Declare Common paths */
    private static URL ICON_BASE_URL = null;

    static {
        final String pathSuffix = "icons/"; //$NON-NLS-1$
        ICON_BASE_URL = Activator.getDefault().getBundle().getEntry(pathSuffix);
        initializeImageRegistry();
    }

    /**
     * Declare all images
     */
    private static void declareImages() {
        declareRegistryImage(EXTENSION, EXTENSION);
        declareRegistryImage(OPERATION, OPERATION);
        declareRegistryImage(PROPERTY, PROPERTY);
        declareRegistryImage(VARIABLE, VARIABLE);
        declareRegistryImage(STATEMENT, STATEMENT);
        declareRegistryImage(TYPE, TYPE);

    }

    /**
     * Declare an Image in the registry table.
     * 
     * @param key
     *            The key to use when registering the image
     * @param path
     *            The path where the image can be found. This path is relative
     *            to where this plugin class is found (i.e. typically the
     *            packages directory)
     */
    private final static void declareRegistryImage(final String key, final String path) {
        ImageDescriptor desc = ImageDescriptor.getMissingImageDescriptor();
        try {
            desc = ImageDescriptor.createFromURL(makeIconFileURL(path));
        } catch (final MalformedURLException me) {
            Activator.logError(me);
        }
        imageRegistry.put(key, desc);
    }

    /**
     * Returns the ImageRegistry.
     */
    public static ImageRegistry getImageRegistry() {
        if (imageRegistry == null) {
            initializeImageRegistry();
        }
        return imageRegistry;
    }

    /**
     * Initialize the image registry by declaring all of the required graphics.
     * This involves creating JFace image descriptors describing how to
     * create/find the image should it be needed. The image is not actually
     * allocated until requested.
     * 
     * Prefix conventions Wizard Banners WIZBAN_ Preference Banners PREF_BAN_
     * Property Page Banners PROPBAN_ Color toolbar CTOOL_ Enable toolbar ETOOL_
     * Disable toolbar DTOOL_ Local enabled toolbar ELCL_ Local Disable toolbar
     * DLCL_ Object large OBJL_ Object small OBJS_ View VIEW_ Product images
     * PROD_ Misc images MISC_
     * 
     * Where are the images? The images (typically gifs) are found in the same
     * location as this plugin class. This may mean the same package directory
     * as the package holding this class. The images are declared using
     * this.getClass() to ensure they are looked up via this plugin class.
     * 
     * @see org.eclipse.jface.resource.ImageRegistry
     */
    public static ImageRegistry initializeImageRegistry() {
        imageRegistry = new ImageRegistry(Display.getCurrent() == null ? Display.getDefault() : Display.getCurrent());
        declareImages();
        return imageRegistry;
    }

    /**
     * Returns the <code>Image</code> identified by the given key, or
     * <code>null</code> if it does not exist.
     */
    public static Image getImage(final String key) {
        return getImageRegistry().get(key);
    }

    /**
     * Returns the <code>ImageDescriptor</code> identified by the given key,
     * or <code>null</code> if it does not exist.
     */
    public static ImageDescriptor getImageDescriptor(final String key) {
        return getImageRegistry().getDescriptor(key);
    }

    private static URL makeIconFileURL(final String iconPath) throws MalformedURLException {
        if (ICON_BASE_URL == null) {
			throw new MalformedURLException();
		}

        return new URL(ICON_BASE_URL, iconPath);
    }
}
