/**
 */
package br.ufmg.dcc.asml.aSMLModel.impl;

import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.Configuration;
import br.ufmg.dcc.asml.aSMLModel.ConfigurationElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.ConfigurationImpl#getMatching <em>Matching</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.ConfigurationImpl#getConfigurationElement <em>Configuration Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends ConfigurationElementImpl implements Configuration
{
  /**
   * The default value of the '{@link #getMatching() <em>Matching</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatching()
   * @generated
   * @ordered
   */
  protected static final String MATCHING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMatching() <em>Matching</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatching()
   * @generated
   * @ordered
   */
  protected String matching = MATCHING_EDEFAULT;

  /**
   * The cached value of the '{@link #getConfigurationElement() <em>Configuration Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigurationElement()
   * @generated
   * @ordered
   */
  protected EList<ConfigurationElement> configurationElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationImpl()
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
    return ASMLModelPackage.Literals.CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMatching()
  {
    return matching;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatching(String newMatching)
  {
    String oldMatching = matching;
    matching = newMatching;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.CONFIGURATION__MATCHING, oldMatching, matching));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConfigurationElement> getConfigurationElement()
  {
    if (configurationElement == null)
    {
      configurationElement = new EObjectContainmentEList<ConfigurationElement>(ConfigurationElement.class, this, ASMLModelPackage.CONFIGURATION__CONFIGURATION_ELEMENT);
    }
    return configurationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ASMLModelPackage.CONFIGURATION__CONFIGURATION_ELEMENT:
        return ((InternalEList<?>)getConfigurationElement()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ASMLModelPackage.CONFIGURATION__MATCHING:
        return getMatching();
      case ASMLModelPackage.CONFIGURATION__CONFIGURATION_ELEMENT:
        return getConfigurationElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ASMLModelPackage.CONFIGURATION__MATCHING:
        setMatching((String)newValue);
        return;
      case ASMLModelPackage.CONFIGURATION__CONFIGURATION_ELEMENT:
        getConfigurationElement().clear();
        getConfigurationElement().addAll((Collection<? extends ConfigurationElement>)newValue);
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
      case ASMLModelPackage.CONFIGURATION__MATCHING:
        setMatching(MATCHING_EDEFAULT);
        return;
      case ASMLModelPackage.CONFIGURATION__CONFIGURATION_ELEMENT:
        getConfigurationElement().clear();
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
      case ASMLModelPackage.CONFIGURATION__MATCHING:
        return MATCHING_EDEFAULT == null ? matching != null : !MATCHING_EDEFAULT.equals(matching);
      case ASMLModelPackage.CONFIGURATION__CONFIGURATION_ELEMENT:
        return configurationElement != null && !configurationElement.isEmpty();
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
    result.append(" (matching: ");
    result.append(matching);
    result.append(')');
    return result.toString();
  }

} //ConfigurationImpl
