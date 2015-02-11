/**
 */
package br.ufmg.dcc.asml.aSMLModel.impl;

import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.FrameworkClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Framework Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.FrameworkClassImpl#getJavaCLass <em>Java CLass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrameworkClassImpl extends AbstractComponentImpl implements FrameworkClass
{
  /**
   * The default value of the '{@link #getJavaCLass() <em>Java CLass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaCLass()
   * @generated
   * @ordered
   */
  protected static final String JAVA_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJavaCLass() <em>Java CLass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaCLass()
   * @generated
   * @ordered
   */
  protected String javaCLass = JAVA_CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FrameworkClassImpl()
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
    return ASMLModelPackage.Literals.FRAMEWORK_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJavaCLass()
  {
    return javaCLass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaCLass(String newJavaCLass)
  {
    String oldJavaCLass = javaCLass;
    javaCLass = newJavaCLass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.FRAMEWORK_CLASS__JAVA_CLASS, oldJavaCLass, javaCLass));
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
      case ASMLModelPackage.FRAMEWORK_CLASS__JAVA_CLASS:
        return getJavaCLass();
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
      case ASMLModelPackage.FRAMEWORK_CLASS__JAVA_CLASS:
        setJavaCLass((String)newValue);
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
      case ASMLModelPackage.FRAMEWORK_CLASS__JAVA_CLASS:
        setJavaCLass(JAVA_CLASS_EDEFAULT);
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
      case ASMLModelPackage.FRAMEWORK_CLASS__JAVA_CLASS:
        return JAVA_CLASS_EDEFAULT == null ? javaCLass != null : !JAVA_CLASS_EDEFAULT.equals(javaCLass);
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
    result.append(" (javaCLass: ");
    result.append(javaCLass);
    result.append(')');
    return result.toString();
  }

} //FrameworkClassImpl
