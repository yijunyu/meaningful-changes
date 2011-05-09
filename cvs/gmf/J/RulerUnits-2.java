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
 * A representation of the literals of the enumeration '<em><b>Ruler Units</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getRulerUnits()
 * @model
 * @generated
 */
public final class RulerUnits extends AbstractEnumerator {
	/**
	 * The '<em><b>Inches</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inches</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCHES_LITERAL
	 * @model name="Inches"
	 * @generated
	 * @ordered
	 */
	public static final int INCHES = 0;

	/**
	 * The '<em><b>Centimeters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Centimeters</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTIMETERS_LITERAL
	 * @model name="Centimeters"
	 * @generated
	 * @ordered
	 */
	public static final int CENTIMETERS = 1;

	/**
	 * The '<em><b>Pixels</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pixels</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIXELS_LITERAL
	 * @model name="Pixels"
	 * @generated
	 * @ordered
	 */
	public static final int PIXELS = 2;

	/**
	 * The '<em><b>Inches</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCHES
	 * @generated
	 * @ordered
	 */
	public static final RulerUnits INCHES_LITERAL = new RulerUnits(INCHES, "Inches", "Inches");

	/**
	 * The '<em><b>Centimeters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTIMETERS
	 * @generated
	 * @ordered
	 */
	public static final RulerUnits CENTIMETERS_LITERAL = new RulerUnits(CENTIMETERS, "Centimeters", "Centimeters");

	/**
	 * The '<em><b>Pixels</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIXELS
	 * @generated
	 * @ordered
	 */
	public static final RulerUnits PIXELS_LITERAL = new RulerUnits(PIXELS, "Pixels", "Pixels");

	/**
	 * An array of all the '<em><b>Ruler Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RulerUnits[] VALUES_ARRAY =
		new RulerUnits[] {
			INCHES_LITERAL,
			CENTIMETERS_LITERAL,
			PIXELS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Ruler Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ruler Units</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulerUnits get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RulerUnits result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ruler Units</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulerUnits getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RulerUnits result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ruler Units</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulerUnits get(int value) {
		switch (value) {
			case INCHES: return INCHES_LITERAL;
			case CENTIMETERS: return CENTIMETERS_LITERAL;
			case PIXELS: return PIXELS_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RulerUnits(int value, String name, String literal) {
		super(value, name, literal);
	}

} //RulerUnits
