/**
 */
package br.ufmg.dcc.asml.aSMLModel.impl;

import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.Layer;
import br.ufmg.dcc.asml.aSMLModel.LayerMatching;
import br.ufmg.dcc.asml.aSMLModel.Module;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

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
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.LayerImpl#getMatching <em>Matching</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.LayerImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.LayerImpl#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayerImpl extends AbstractComponentImpl implements Layer
{
  /**
   * The cached value of the '{@link #getMatching() <em>Matching</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatching()
   * @generated
   * @ordered
   */
  protected LayerMatching matching;

  /**
   * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModules()
   * @generated
   * @ordered
   */
  protected EList<Module> modules;

  /**
   * The cached value of the '{@link #getRestrictions() <em>Restrictions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestrictions()
   * @generated
   * @ordered
   */
  protected EList<Restriction> restrictions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayerImpl()
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
    return ASMLModelPackage.Literals.LAYER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayerMatching getMatching()
  {
    return matching;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMatching(LayerMatching newMatching, NotificationChain msgs)
  {
    LayerMatching oldMatching = matching;
    matching = newMatching;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASMLModelPackage.LAYER__MATCHING, oldMatching, newMatching);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatching(LayerMatching newMatching)
  {
    if (newMatching != matching)
    {
      NotificationChain msgs = null;
      if (matching != null)
        msgs = ((InternalEObject)matching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASMLModelPackage.LAYER__MATCHING, null, msgs);
      if (newMatching != null)
        msgs = ((InternalEObject)newMatching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASMLModelPackage.LAYER__MATCHING, null, msgs);
      msgs = basicSetMatching(newMatching, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.LAYER__MATCHING, newMatching, newMatching));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Module> getModules()
  {
    if (modules == null)
    {
      modules = new EObjectContainmentEList<Module>(Module.class, this, ASMLModelPackage.LAYER__MODULES);
    }
    return modules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Restriction> getRestrictions()
  {
    if (restrictions == null)
    {
      restrictions = new EObjectContainmentEList<Restriction>(Restriction.class, this, ASMLModelPackage.LAYER__RESTRICTIONS);
    }
    return restrictions;
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
      case ASMLModelPackage.LAYER__MATCHING:
        return basicSetMatching(null, msgs);
      case ASMLModelPackage.LAYER__MODULES:
        return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
      case ASMLModelPackage.LAYER__RESTRICTIONS:
        return ((InternalEList<?>)getRestrictions()).basicRemove(otherEnd, msgs);
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
      case ASMLModelPackage.LAYER__MATCHING:
        return getMatching();
      case ASMLModelPackage.LAYER__MODULES:
        return getModules();
      case ASMLModelPackage.LAYER__RESTRICTIONS:
        return getRestrictions();
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
      case ASMLModelPackage.LAYER__MATCHING:
        setMatching((LayerMatching)newValue);
        return;
      case ASMLModelPackage.LAYER__MODULES:
        getModules().clear();
        getModules().addAll((Collection<? extends Module>)newValue);
        return;
      case ASMLModelPackage.LAYER__RESTRICTIONS:
        getRestrictions().clear();
        getRestrictions().addAll((Collection<? extends Restriction>)newValue);
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
      case ASMLModelPackage.LAYER__MATCHING:
        setMatching((LayerMatching)null);
        return;
      case ASMLModelPackage.LAYER__MODULES:
        getModules().clear();
        return;
      case ASMLModelPackage.LAYER__RESTRICTIONS:
        getRestrictions().clear();
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
      case ASMLModelPackage.LAYER__MATCHING:
        return matching != null;
      case ASMLModelPackage.LAYER__MODULES:
        return modules != null && !modules.isEmpty();
      case ASMLModelPackage.LAYER__RESTRICTIONS:
        return restrictions != null && !restrictions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LayerImpl
