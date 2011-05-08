package org.eclipse.gmf.gmfgraph.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.gmfgraph.ColorStyle;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureMarker;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Identity;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.SizeStyle;
public class LabelImpl extends EObjectImpl implements Label {
    protected ColorStyle colorStyle = null;

    protected EClass eStaticClass (); protected EList children = null;
    protected FontStyle fontStyle = null;

    protected LabelImpl () {
    }

    protected Point location = null;
    protected Point size = null;
    protected SizeStyle sizeStyle = null;
    protected String layoutManager = LAYOUT_MANAGER_EDEFAULT;
    protected String name = NAME_EDEFAULT;
    protected String text = TEXT_EDEFAULT;
    final protected static String LAYOUT_MANAGER_EDEFAULT = null;
    final protected static String NAME_EDEFAULT = null;
    final protected static String TEXT_EDEFAULT = null;

    public ColorStyle getColorStyle ();
    public EList getChildren ();
    public Figure getParent ();
    public FontStyle getFontStyle ();
    public NotificationChain basicSetColorStyle (ColorStyle newColorStyle, NotificationChain msgs);
    public NotificationChain basicSetFontStyle (FontStyle newFontStyle, NotificationChain msgs);
    public NotificationChain basicSetLocation (Point newLocation, NotificationChain msgs);
    public NotificationChain basicSetSize (Point newSize, NotificationChain msgs);
    public NotificationChain basicSetSizeStyle (SizeStyle newSizeStyle, NotificationChain msgs);
    public NotificationChain eBasicRemoveFromContainer (NotificationChain msgs);
    public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs);
    public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs);
    public Object eGet (EStructuralFeature eFeature, boolean resolve);
    public Point getLocation ();
    public Point getSize ();
    public SizeStyle getSizeStyle ();
    public String getLayoutManager ();
    public String getName ();
    public String getText ();
    public String toString ();
    public boolean eIsSet (EStructuralFeature eFeature);
    public int eBaseStructuralFeatureID (int derivedFeatureID, Class baseClass);
    public int eDerivedStructuralFeatureID (int baseFeatureID, Class baseClass);
    public void eSet (EStructuralFeature eFeature, Object newValue);
    public void eUnset (EStructuralFeature eFeature);
    public void setColorStyle (ColorStyle newColorStyle);
    public void setFontStyle (FontStyle newFontStyle);
    public void setLayoutManager (String newLayoutManager);
    public void setLocation (Point newLocation);
    public void setName (String newName);
    public void setSize (Point newSize);
    public void setSizeStyle (SizeStyle newSizeStyle);
    public void setText (String newText);
}

