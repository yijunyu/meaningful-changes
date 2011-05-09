/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Viewmap Layout Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getViewmapLayoutType()
 * @model
 * @generated
 */
public final class ViewmapLayoutType extends AbstractEnumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN = 0;

	/**
	 * The '<em><b>XY LAYOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XY LAYOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XY_LAYOUT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XY_LAYOUT = 1;

	/**
	 * The '<em><b>FLOW LAYOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOW LAYOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOW_LAYOUT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOW_LAYOUT = 2;

	/**
	 * The '<em><b>TOOLBAR LAYOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOOLBAR LAYOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOOLBAR_LAYOUT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOOLBAR_LAYOUT = 3;

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @generated
	 * @ordered
	 */
	public static final ViewmapLayoutType UNKNOWN_LITERAL = new ViewmapLayoutType(UNKNOWN, "UNKNOWN", "UNKNOWN");

	/**
	 * The '<em><b>XY LAYOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XY_LAYOUT
	 * @generated
	 * @ordered
	 */
	public static final ViewmapLayoutType XY_LAYOUT_LITERAL = new ViewmapLayoutType(XY_LAYOUT, "XY_LAYOUT", "XY_LAYOUT");

	/**
	 * The '<em><b>FLOW LAYOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOW_LAYOUT
	 * @generated
	 * @ordered
	 */
	public static final ViewmapLayoutType FLOW_LAYOUT_LITERAL = new ViewmapLayoutType(FLOW_LAYOUT, "FLOW_LAYOUT", "FLOW_LAYOUT");

	/**
	 * The '<em><b>TOOLBAR LAYOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOOLBAR_LAYOUT
	 * @generated
	 * @ordered
	 */
	public static final ViewmapLayoutType TOOLBAR_LAYOUT_LITERAL = new ViewmapLayoutType(TOOLBAR_LAYOUT, "TOOLBAR_LAYOUT", "TOOLBAR_LAYOUT");

	/**
	 * An array of all the '<em><b>Viewmap Layout Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ViewmapLayoutType[] VALUES_ARRAY =
		new ViewmapLayoutType[] {
			UNKNOWN_LITERAL,
			XY_LAYOUT_LITERAL,
			FLOW_LAYOUT_LITERAL,
			TOOLBAR_LAYOUT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Viewmap Layout Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Viewmap Layout Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewmapLayoutType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViewmapLayoutType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Viewmap Layout Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewmapLayoutType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViewmapLayoutType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Viewmap Layout Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewmapLayoutType get(int value) {
		switch (value) {
			case UNKNOWN: return UNKNOWN_LITERAL;
			case XY_LAYOUT: return XY_LAYOUT_LITERAL;
			case FLOW_LAYOUT: return FLOW_LAYOUT_LITERAL;
			case TOOLBAR_LAYOUT: return TOOLBAR_LAYOUT_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ViewmapLayoutType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ViewmapLayoutType
