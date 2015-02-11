/**
 */
package br.ufmg.dcc.asml.aSMLModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Layer Matching Clause</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getLayerMatchingClause()
 * @model
 * @generated
 */
public enum LayerMatchingClause implements Enumerator
{
  /**
   * The '<em><b>RELATED TO COMPONENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RELATED_TO_COMPONENT_VALUE
   * @generated
   * @ordered
   */
  RELATED_TO_COMPONENT(0, "RELATED_TO_COMPONENT", "related to component"),

  /**
   * The '<em><b>EXTERNAL DEFINITION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXTERNAL_DEFINITION_VALUE
   * @generated
   * @ordered
   */
  EXTERNAL_DEFINITION(1, "EXTERNAL_DEFINITION", "external definition");

  /**
   * The '<em><b>RELATED TO COMPONENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RELATED TO COMPONENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RELATED_TO_COMPONENT
   * @model literal="related to component"
   * @generated
   * @ordered
   */
  public static final int RELATED_TO_COMPONENT_VALUE = 0;

  /**
   * The '<em><b>EXTERNAL DEFINITION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EXTERNAL DEFINITION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXTERNAL_DEFINITION
   * @model literal="external definition"
   * @generated
   * @ordered
   */
  public static final int EXTERNAL_DEFINITION_VALUE = 1;

  /**
   * An array of all the '<em><b>Layer Matching Clause</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LayerMatchingClause[] VALUES_ARRAY =
    new LayerMatchingClause[]
    {
      RELATED_TO_COMPONENT,
      EXTERNAL_DEFINITION,
    };

  /**
   * A public read-only list of all the '<em><b>Layer Matching Clause</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LayerMatchingClause> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Layer Matching Clause</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LayerMatchingClause get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LayerMatchingClause result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Layer Matching Clause</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LayerMatchingClause getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LayerMatchingClause result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Layer Matching Clause</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LayerMatchingClause get(int value)
  {
    switch (value)
    {
      case RELATED_TO_COMPONENT_VALUE: return RELATED_TO_COMPONENT;
      case EXTERNAL_DEFINITION_VALUE: return EXTERNAL_DEFINITION;
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
  private LayerMatchingClause(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //LayerMatchingClause
