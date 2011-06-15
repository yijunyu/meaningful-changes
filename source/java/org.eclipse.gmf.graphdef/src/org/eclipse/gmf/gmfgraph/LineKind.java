/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Line Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * org.eclipse.draw2d.Graphics.LINE_* (== org.eclipse.swt.SWT.LINE_*. Values are same as SWT constants
 * <!-- end-model-doc -->
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getLineKind()
 * @model
 * @generated
 */
public enum LineKind implements Enumerator
{
	/**
	 * The '<em><b>LINE SOLID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_SOLID
	 * @generated
	 * @ordered
	 */
	LINE_SOLID_LITERAL(1, "LINE_SOLID", "LINE_SOLID"),
	/**
	 * The '<em><b>LINE DASH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_DASH
	 * @generated
	 * @ordered
	 */
	LINE_DASH_LITERAL(2, "LINE_DASH", "LINE_DASH"),
	/**
	 * The '<em><b>LINE DOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_DOT
	 * @generated
	 * @ordered
	 */
	LINE_DOT_LITERAL(3, "LINE_DOT", "LINE_DOT"),
	/**
	 * The '<em><b>LINE DASHDOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_DASHDOT
	 * @generated
	 * @ordered
	 */
	LINE_DASHDOT_LITERAL(4, "LINE_DASHDOT", "LINE_DASHDOT"),
	/**
	 * The '<em><b>LINE DASHDOTDOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_DASHDOTDOT
	 * @generated
	 * @ordered
	 */
	LINE_DASHDOTDOT_LITERAL(5, "LINE_DASHDOTDOT", "LINE_DASHDOTDOT"),
	/**
	 * The '<em><b>LINE CUSTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_CUSTOM
	 * @generated
	 * @ordered
	 */
	LINE_CUSTOM_LITERAL(6, "LINE_CUSTOM", "LINE_CUSTOM");
	/**
	 * The '<em><b>LINE SOLID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE SOLID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_SOLID_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_SOLID = 1;

	/**
	 * The '<em><b>LINE DASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE DASH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_DASH_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DASH = 2;

	/**
	 * The '<em><b>LINE DOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE DOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_DOT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DOT = 3;

	/**
	 * The '<em><b>LINE DASHDOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE DASHDOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_DASHDOT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DASHDOT = 4;

	/**
	 * The '<em><b>LINE DASHDOTDOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE DASHDOTDOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_DASHDOTDOT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DASHDOTDOT = 5;

	/**
	 * The '<em><b>LINE CUSTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE CUSTOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_CUSTOM_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_CUSTOM = 6;

	/**
	 * An array of all the '<em><b>Line Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LineKind[] VALUES_ARRAY =
		new LineKind[] {
			LINE_SOLID_LITERAL,
			LINE_DASH_LITERAL,
			LINE_DOT_LITERAL,
			LINE_DASHDOT_LITERAL,
			LINE_DASHDOTDOT_LITERAL,
			LINE_CUSTOM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Line Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LineKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Line Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LineKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LineKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Line Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LineKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LineKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Line Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LineKind get(int value) {
		switch (value) {
			case LINE_SOLID: return LINE_SOLID_LITERAL;
			case LINE_DASH: return LINE_DASH_LITERAL;
			case LINE_DOT: return LINE_DOT_LITERAL;
			case LINE_DASHDOT: return LINE_DASHDOT_LITERAL;
			case LINE_DASHDOTDOT: return LINE_DASHDOTDOT_LITERAL;
			case LINE_CUSTOM: return LINE_CUSTOM_LITERAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LineKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
