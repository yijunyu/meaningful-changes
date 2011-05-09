/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Appearance Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.tooldef.GMFToolPackage#getAppearanceStyle()
 * @model
 * @generated
 */
public final class AppearanceStyle extends AbstractEnumerator {
	/**
	 * The '<em><b>Font</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Font</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FONT_LITERAL
	 * @model name="Font"
	 * @generated
	 * @ordered
	 */
	public static final int FONT = 0;

	/**
	 * The '<em><b>Fill</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fill</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL_LITERAL
	 * @model name="Fill"
	 * @generated
	 * @ordered
	 */
	public static final int FILL = 1;

	/**
	 * The '<em><b>Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_LITERAL
	 * @model name="Line"
	 * @generated
	 * @ordered
	 */
	public static final int LINE = 2;

	/**
	 * The '<em><b>Font</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FONT
	 * @generated
	 * @ordered
	 */
	public static final AppearanceStyle FONT_LITERAL = new AppearanceStyle(FONT, "Font", "Font");

	/**
	 * The '<em><b>Fill</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL
	 * @generated
	 * @ordered
	 */
	public static final AppearanceStyle FILL_LITERAL = new AppearanceStyle(FILL, "Fill", "Fill");

	/**
	 * The '<em><b>Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE
	 * @generated
	 * @ordered
	 */
	public static final AppearanceStyle LINE_LITERAL = new AppearanceStyle(LINE, "Line", "Line");

	/**
	 * An array of all the '<em><b>Appearance Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AppearanceStyle[] VALUES_ARRAY = new AppearanceStyle[] { FONT_LITERAL, FILL_LITERAL, LINE_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Appearance Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Appearance Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppearanceStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppearanceStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appearance Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppearanceStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppearanceStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appearance Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppearanceStyle get(int value) {
		switch (value) {
		case FONT:
			return FONT_LITERAL;
		case FILL:
			return FILL_LITERAL;
		case LINE:
			return LINE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AppearanceStyle(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AppearanceStyle
