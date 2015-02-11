/**
 */
package br.ufmg.dcc.asml.aSMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.XmlElement#getMatching <em>Matching</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getXmlElement()
 * @model
 * @generated
 */
public interface XmlElement extends ConfigurationElement
{
  /**
   * Returns the value of the '<em><b>Matching</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matching</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matching</em>' attribute.
   * @see #setMatching(String)
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getXmlElement_Matching()
   * @model
   * @generated
   */
  String getMatching();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.XmlElement#getMatching <em>Matching</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matching</em>' attribute.
   * @see #getMatching()
   * @generated
   */
  void setMatching(String value);

} // XmlElement
