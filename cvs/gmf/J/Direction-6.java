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

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Geographical bit constants from org.eclipse.draw2d.PositionConstants
 * <!-- end-model-doc -->
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getDirection()
 * @model
 * @generated
 */
public final class Direction extends AbstractEnumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>NORTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORTH = 1;

	/**
	 * The '<em><b>SOUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH = 4;

	/**
	 * The '<em><b>WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEST = 8;

	/**
	 * The '<em><b>EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EAST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EAST = 16;

	/**
	 * The '<em><b>NORTH EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORTH EAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH_EAST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_EAST = 17;

	/**
	 * The '<em><b>NORTH WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORTH WEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH_WEST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_WEST = 9;

	/**
	 * The '<em><b>SOUTH EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUTH EAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH_EAST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_EAST = 20;

	/**
	 * The '<em><b>SOUTH WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUTH WEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH_WEST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_WEST = 12;

	/**
	 * The '<em><b>NORTH SOUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORTH SOUTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH_SOUTH_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_SOUTH = 5;

	/**
	 * The '<em><b>EAST WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EAST WEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EAST_WEST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EAST_WEST = 24;

	/**
	 * The '<em><b>NSEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NSEW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NSEW_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NSEW = 29;

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final Direction NONE_LITERAL = new Direction(NONE, "NONE", "NONE");

	/**
	 * The '<em><b>NORTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH
	 * @generated
	 * @ordered
	 */
	public static final Direction NORTH_LITERAL = new Direction(NORTH, "NORTH", "NORTH");

	/**
	 * The '<em><b>SOUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH
	 * @generated
	 * @ordered
	 */
	public static final Direction SOUTH_LITERAL = new Direction(SOUTH, "SOUTH", "SOUTH");

	/**
	 * The '<em><b>WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST
	 * @generated
	 * @ordered
	 */
	public static final Direction WEST_LITERAL = new Direction(WEST, "WEST", "WEST");

	/**
	 * The '<em><b>EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST
	 * @generated
	 * @ordered
	 */
	public static final Direction EAST_LITERAL = new Direction(EAST, "EAST", "EAST");

	/**
	 * The '<em><b>NORTH EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_EAST
	 * @generated
	 * @ordered
	 */
	public static final Direction NORTH_EAST_LITERAL = new Direction(NORTH_EAST, "NORTH_EAST", "NORTH_EAST");

	/**
	 * The '<em><b>NORTH WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_WEST
	 * @generated
	 * @ordered
	 */
	public static final Direction NORTH_WEST_LITERAL = new Direction(NORTH_WEST, "NORTH_WEST", "NORTH_WEST");

	/**
	 * The '<em><b>SOUTH EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_EAST
	 * @generated
	 * @ordered
	 */
	public static final Direction SOUTH_EAST_LITERAL = new Direction(SOUTH_EAST, "SOUTH_EAST", "SOUTH_EAST");

	/**
	 * The '<em><b>SOUTH WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_WEST
	 * @generated
	 * @ordered
	 */
	public static final Direction SOUTH_WEST_LITERAL = new Direction(SOUTH_WEST, "SOUTH_WEST", "SOUTH_WEST");

	/**
	 * The '<em><b>NORTH SOUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_SOUTH
	 * @generated
	 * @ordered
	 */
	public static final Direction NORTH_SOUTH_LITERAL = new Direction(NORTH_SOUTH, "NORTH_SOUTH", "NORTH_SOUTH");

	/**
	 * The '<em><b>EAST WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_WEST
	 * @generated
	 * @ordered
	 */
	public static final Direction EAST_WEST_LITERAL = new Direction(EAST_WEST, "EAST_WEST", "EAST_WEST");

	/**
	 * The '<em><b>NSEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSEW
	 * @generated
	 * @ordered
	 */
	public static final Direction NSEW_LITERAL = new Direction(NSEW, "NSEW", "NSEW");

	/**
	 * An array of all the '<em><b>Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Direction[] VALUES_ARRAY =
		new Direction[] {
			NONE_LITERAL,
			NORTH_LITERAL,
			SOUTH_LITERAL,
			WEST_LITERAL,
			EAST_LITERAL,
			NORTH_EAST_LITERAL,
			NORTH_WEST_LITERAL,
			SOUTH_EAST_LITERAL,
			SOUTH_WEST_LITERAL,
			NORTH_SOUTH_LITERAL,
			EAST_WEST_LITERAL,
			NSEW_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Direction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Direction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Direction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Direction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Direction get(int value) {
		switch (value) {
			case NONE: return NONE_LITERAL;
			case NORTH: return NORTH_LITERAL;
			case SOUTH: return SOUTH_LITERAL;
			case WEST: return WEST_LITERAL;
			case EAST: return EAST_LITERAL;
			case NORTH_EAST: return NORTH_EAST_LITERAL;
			case NORTH_WEST: return NORTH_WEST_LITERAL;
			case SOUTH_EAST: return SOUTH_EAST_LITERAL;
			case SOUTH_WEST: return SOUTH_WEST_LITERAL;
			case NORTH_SOUTH: return NORTH_SOUTH_LITERAL;
			case EAST_WEST: return EAST_WEST_LITERAL;
			case NSEW: return NSEW_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Direction(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Direction
