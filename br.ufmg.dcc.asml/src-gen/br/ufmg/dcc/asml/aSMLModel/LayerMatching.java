/**
 */
package br.ufmg.dcc.asml.aSMLModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Matching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.LayerMatching#getLayerMatching <em>Layer Matching</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.LayerMatching#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getLayerMatching()
 * @model
 * @generated
 */
public interface LayerMatching extends EObject
{
  /**
   * Returns the value of the '<em><b>Layer Matching</b></em>' attribute.
   * The literals are from the enumeration {@link br.ufmg.dcc.asml.aSMLModel.LayerMatchingClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layer Matching</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layer Matching</em>' attribute.
   * @see br.ufmg.dcc.asml.aSMLModel.LayerMatchingClause
   * @see #setLayerMatching(LayerMatchingClause)
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getLayerMatching_LayerMatching()
   * @model
   * @generated
   */
  LayerMatchingClause getLayerMatching();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.LayerMatching#getLayerMatching <em>Layer Matching</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layer Matching</em>' attribute.
   * @see br.ufmg.dcc.asml.aSMLModel.LayerMatchingClause
   * @see #getLayerMatching()
   * @generated
   */
  void setLayerMatching(LayerMatchingClause value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference.
   * @see #setParameter(AbstractComponent)
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getLayerMatching_Parameter()
   * @model
   * @generated
   */
  AbstractComponent getParameter();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.LayerMatching#getParameter <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(AbstractComponent value);

} // LayerMatching
