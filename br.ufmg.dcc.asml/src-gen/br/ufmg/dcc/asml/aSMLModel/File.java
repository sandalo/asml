/**
 */
package br.ufmg.dcc.asml.aSMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.File#getMatching <em>Matching</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getFile()
 * @model
 * @generated
 */
public interface File extends ConfigurationElement
{
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
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getFile_Matching()
   * @model containment="true"
   * @generated
   */
  AbstractNameConvetion getMatching();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.File#getMatching <em>Matching</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matching</em>' containment reference.
   * @see #getMatching()
   * @generated
   */
  void setMatching(AbstractNameConvetion value);

} // File
