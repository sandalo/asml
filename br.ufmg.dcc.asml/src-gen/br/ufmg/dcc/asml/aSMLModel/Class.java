/**
 */
package br.ufmg.dcc.asml.aSMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.Class#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.Class#getMatching <em>Matching</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.Class#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.Class#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends AbstractComponent
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getClass_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.Class#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Matching</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matching</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matching</em>' containment reference.
   * @see #setMatching(AbstractNameConvetion)
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getClass_Matching()
   * @model containment="true"
   * @generated
   */
  AbstractNameConvetion getMatching();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.Class#getMatching <em>Matching</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matching</em>' containment reference.
   * @see #getMatching()
   * @generated
   */
  void setMatching(AbstractNameConvetion value);

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
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getClass_Cardinality()
   * @model
   * @generated
   */
  Cardinality getCardinality();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.Class#getCardinality <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' attribute.
   * @see br.ufmg.dcc.asml.aSMLModel.Cardinality
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(Cardinality value);

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link br.ufmg.dcc.asml.aSMLModel.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getClass_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethods();

} // Class
