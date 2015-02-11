/**
 */
package br.ufmg.dcc.asml.aSMLModel.impl;

import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.LayerMatching;
import br.ufmg.dcc.asml.aSMLModel.LayerMatchingClause;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Matching</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.LayerMatchingImpl#getLayerMatching <em>Layer Matching</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.LayerMatchingImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayerMatchingImpl extends MinimalEObjectImpl.Container implements LayerMatching
{
  /**
   * The default value of the '{@link #getLayerMatching() <em>Layer Matching</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayerMatching()
   * @generated
   * @ordered
   */
  protected static final LayerMatchingClause LAYER_MATCHING_EDEFAULT = LayerMatchingClause.RELATED_TO_COMPONENT;

  /**
   * The cached value of the '{@link #getLayerMatching() <em>Layer Matching</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayerMatching()
   * @generated
   * @ordered
   */
  protected LayerMatchingClause layerMatching = LAYER_MATCHING_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected AbstractComponent parameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayerMatchingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ASMLModelPackage.Literals.LAYER_MATCHING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayerMatchingClause getLayerMatching()
  {
    return layerMatching;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayerMatching(LayerMatchingClause newLayerMatching)
  {
    LayerMatchingClause oldLayerMatching = layerMatching;
    layerMatching = newLayerMatching == null ? LAYER_MATCHING_EDEFAULT : newLayerMatching;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.LAYER_MATCHING__LAYER_MATCHING, oldLayerMatching, layerMatching));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractComponent getParameter()
  {
    if (parameter != null && parameter.eIsProxy())
    {
      InternalEObject oldParameter = (InternalEObject)parameter;
      parameter = (AbstractComponent)eResolveProxy(oldParameter);
      if (parameter != oldParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASMLModelPackage.LAYER_MATCHING__PARAMETER, oldParameter, parameter));
      }
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractComponent basicGetParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(AbstractComponent newParameter)
  {
    AbstractComponent oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.LAYER_MATCHING__PARAMETER, oldParameter, parameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ASMLModelPackage.LAYER_MATCHING__LAYER_MATCHING:
        return getLayerMatching();
      case ASMLModelPackage.LAYER_MATCHING__PARAMETER:
        if (resolve) return getParameter();
        return basicGetParameter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ASMLModelPackage.LAYER_MATCHING__LAYER_MATCHING:
        setLayerMatching((LayerMatchingClause)newValue);
        return;
      case ASMLModelPackage.LAYER_MATCHING__PARAMETER:
        setParameter((AbstractComponent)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ASMLModelPackage.LAYER_MATCHING__LAYER_MATCHING:
        setLayerMatching(LAYER_MATCHING_EDEFAULT);
        return;
      case ASMLModelPackage.LAYER_MATCHING__PARAMETER:
        setParameter((AbstractComponent)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ASMLModelPackage.LAYER_MATCHING__LAYER_MATCHING:
        return layerMatching != LAYER_MATCHING_EDEFAULT;
      case ASMLModelPackage.LAYER_MATCHING__PARAMETER:
        return parameter != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (layerMatching: ");
    result.append(layerMatching);
    result.append(')');
    return result.toString();
  }

} //LayerMatchingImpl
