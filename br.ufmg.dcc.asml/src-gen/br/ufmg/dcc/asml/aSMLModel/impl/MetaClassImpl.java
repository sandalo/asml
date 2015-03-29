/**
 */
package br.ufmg.dcc.asml.aSMLModel.impl;

import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.AbstractNameConvetion;
import br.ufmg.dcc.asml.aSMLModel.Cardinality;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;
import br.ufmg.dcc.asml.aSMLModel.Method;

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
 * An implementation of the model object '<em><b>Meta Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.MetaClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.MetaClassImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.MetaClassImpl#getMatching <em>Matching</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.MetaClassImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.MetaClassImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaClassImpl extends AbstractComponentImpl implements MetaClass
{
  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected MetaClass extends_;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getMatching() <em>Matching</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatching()
   * @generated
   * @ordered
   */
  protected AbstractNameConvetion matching;

  /**
   * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.ONE;

  /**
   * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected Cardinality cardinality = CARDINALITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<Method> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetaClassImpl()
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
    return ASMLModelPackage.Literals.META_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaClass getExtends()
  {
    if (extends_ != null && extends_.eIsProxy())
    {
      InternalEObject oldExtends = (InternalEObject)extends_;
      extends_ = (MetaClass)eResolveProxy(oldExtends);
      if (extends_ != oldExtends)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASMLModelPackage.META_CLASS__EXTENDS, oldExtends, extends_));
      }
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaClass basicGetExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(MetaClass newExtends)
  {
    MetaClass oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.META_CLASS__EXTENDS, oldExtends, extends_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.META_CLASS__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractNameConvetion getMatching()
  {
    return matching;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMatching(AbstractNameConvetion newMatching, NotificationChain msgs)
  {
    AbstractNameConvetion oldMatching = matching;
    matching = newMatching;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASMLModelPackage.META_CLASS__MATCHING, oldMatching, newMatching);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatching(AbstractNameConvetion newMatching)
  {
    if (newMatching != matching)
    {
      NotificationChain msgs = null;
      if (matching != null)
        msgs = ((InternalEObject)matching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASMLModelPackage.META_CLASS__MATCHING, null, msgs);
      if (newMatching != null)
        msgs = ((InternalEObject)newMatching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASMLModelPackage.META_CLASS__MATCHING, null, msgs);
      msgs = basicSetMatching(newMatching, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.META_CLASS__MATCHING, newMatching, newMatching));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality getCardinality()
  {
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCardinality(Cardinality newCardinality)
  {
    Cardinality oldCardinality = cardinality;
    cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.META_CLASS__CARDINALITY, oldCardinality, cardinality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<Method>(Method.class, this, ASMLModelPackage.META_CLASS__METHODS);
    }
    return methods;
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
      case ASMLModelPackage.META_CLASS__MATCHING:
        return basicSetMatching(null, msgs);
      case ASMLModelPackage.META_CLASS__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case ASMLModelPackage.META_CLASS__EXTENDS:
        if (resolve) return getExtends();
        return basicGetExtends();
      case ASMLModelPackage.META_CLASS__DESCRIPTION:
        return getDescription();
      case ASMLModelPackage.META_CLASS__MATCHING:
        return getMatching();
      case ASMLModelPackage.META_CLASS__CARDINALITY:
        return getCardinality();
      case ASMLModelPackage.META_CLASS__METHODS:
        return getMethods();
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
      case ASMLModelPackage.META_CLASS__EXTENDS:
        setExtends((MetaClass)newValue);
        return;
      case ASMLModelPackage.META_CLASS__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ASMLModelPackage.META_CLASS__MATCHING:
        setMatching((AbstractNameConvetion)newValue);
        return;
      case ASMLModelPackage.META_CLASS__CARDINALITY:
        setCardinality((Cardinality)newValue);
        return;
      case ASMLModelPackage.META_CLASS__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method>)newValue);
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
      case ASMLModelPackage.META_CLASS__EXTENDS:
        setExtends((MetaClass)null);
        return;
      case ASMLModelPackage.META_CLASS__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ASMLModelPackage.META_CLASS__MATCHING:
        setMatching((AbstractNameConvetion)null);
        return;
      case ASMLModelPackage.META_CLASS__CARDINALITY:
        setCardinality(CARDINALITY_EDEFAULT);
        return;
      case ASMLModelPackage.META_CLASS__METHODS:
        getMethods().clear();
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
      case ASMLModelPackage.META_CLASS__EXTENDS:
        return extends_ != null;
      case ASMLModelPackage.META_CLASS__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ASMLModelPackage.META_CLASS__MATCHING:
        return matching != null;
      case ASMLModelPackage.META_CLASS__CARDINALITY:
        return cardinality != CARDINALITY_EDEFAULT;
      case ASMLModelPackage.META_CLASS__METHODS:
        return methods != null && !methods.isEmpty();
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
    result.append(" (description: ");
    result.append(description);
    result.append(", cardinality: ");
    result.append(cardinality);
    result.append(')');
    return result.toString();
  }

} //MetaClassImpl
