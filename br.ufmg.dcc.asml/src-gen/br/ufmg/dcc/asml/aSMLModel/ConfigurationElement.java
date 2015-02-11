/**
 */
package br.ufmg.dcc.asml.aSMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.ConfigurationElement#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getConfigurationElement()
 * @model
 * @generated
 */
public interface ConfigurationElement extends AbstractComponent
{
  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
   * The literals are from the enumeration {@link br.ufmg.dcc.asml.aSMLModel.Cardinality}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' attribute.
   * @see br.ufmg.dcc.asml.aSMLModel.Cardinality
   * @see #setCardinality(Cardinality)
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getConfigurationElement_Cardinality()
   * @model
   * @generated
   */
  Cardinality getCardinality();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.ConfigurationElement#getCardinality <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' attribute.
   * @see br.ufmg.dcc.asml.aSMLModel.Cardinality
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(Cardinality value);

} // ConfigurationElement
