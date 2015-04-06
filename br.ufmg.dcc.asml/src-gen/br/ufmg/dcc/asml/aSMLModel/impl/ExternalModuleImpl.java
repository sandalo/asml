/**
 */
package br.ufmg.dcc.asml.aSMLModel.impl;

import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.Attribute;
import br.ufmg.dcc.asml.aSMLModel.ExternalModule;
import br.ufmg.dcc.asml.aSMLModel.ModuleMatching;
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
 * An implementation of the model object '<em><b>External Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.ExternalModuleImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.ExternalModuleImpl#getMatching <em>Matching</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.ExternalModuleImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.ExternalModuleImpl#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalModuleImpl extends AbstractComponentImpl implements ExternalModule
{
  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getMatching() <em>Matching</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatching()
   * @generated
   * @ordered
   */
  protected ModuleMatching matching;

  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<AbstractComponent> components;

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
  protected ExternalModuleImpl()
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
    return ASMLModelPackage.Literals.EXTERNAL_MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ASMLModelPackage.EXTERNAL_MODULE__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleMatching getMatching()
  {
    return matching;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMatching(ModuleMatching newMatching, NotificationChain msgs)
  {
    ModuleMatching oldMatching = matching;
    matching = newMatching;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASMLModelPackage.EXTERNAL_MODULE__MATCHING, oldMatching, newMatching);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatching(ModuleMatching newMatching)
  {
    if (newMatching != matching)
    {
      NotificationChain msgs = null;
      if (matching != null)
        msgs = ((InternalEObject)matching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASMLModelPackage.EXTERNAL_MODULE__MATCHING, null, msgs);
      if (newMatching != null)
        msgs = ((InternalEObject)newMatching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASMLModelPackage.EXTERNAL_MODULE__MATCHING, null, msgs);
      msgs = basicSetMatching(newMatching, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.EXTERNAL_MODULE__MATCHING, newMatching, newMatching));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractComponent> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, ASMLModelPackage.EXTERNAL_MODULE__COMPONENTS);
    }
    return components;
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
      restrictions = new EObjectContainmentEList<Restriction>(Restriction.class, this, ASMLModelPackage.EXTERNAL_MODULE__RESTRICTIONS);
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
      case ASMLModelPackage.EXTERNAL_MODULE__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case ASMLModelPackage.EXTERNAL_MODULE__MATCHING:
        return basicSetMatching(null, msgs);
      case ASMLModelPackage.EXTERNAL_MODULE__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case ASMLModelPackage.EXTERNAL_MODULE__RESTRICTIONS:
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
      case ASMLModelPackage.EXTERNAL_MODULE__ATTRIBUTES:
        return getAttributes();
      case ASMLModelPackage.EXTERNAL_MODULE__MATCHING:
        return getMatching();
      case ASMLModelPackage.EXTERNAL_MODULE__COMPONENTS:
        return getComponents();
      case ASMLModelPackage.EXTERNAL_MODULE__RESTRICTIONS:
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
      case ASMLModelPackage.EXTERNAL_MODULE__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case ASMLModelPackage.EXTERNAL_MODULE__MATCHING:
        setMatching((ModuleMatching)newValue);
        return;
      case ASMLModelPackage.EXTERNAL_MODULE__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends AbstractComponent>)newValue);
        return;
      case ASMLModelPackage.EXTERNAL_MODULE__RESTRICTIONS:
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
      case ASMLModelPackage.EXTERNAL_MODULE__ATTRIBUTES:
        getAttributes().clear();
        return;
      case ASMLModelPackage.EXTERNAL_MODULE__MATCHING:
        setMatching((ModuleMatching)null);
        return;
      case ASMLModelPackage.EXTERNAL_MODULE__COMPONENTS:
        getComponents().clear();
        return;
      case ASMLModelPackage.EXTERNAL_MODULE__RESTRICTIONS:
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
      case ASMLModelPackage.EXTERNAL_MODULE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case ASMLModelPackage.EXTERNAL_MODULE__MATCHING:
        return matching != null;
      case ASMLModelPackage.EXTERNAL_MODULE__COMPONENTS:
        return components != null && !components.isEmpty();
      case ASMLModelPackage.EXTERNAL_MODULE__RESTRICTIONS:
        return restrictions != null && !restrictions.isEmpty();
    }
    return super.eIsSet(featureID);
  }
  
  @Override
	public boolean containsType(String fullName) {
		EList<AbstractComponent> components = getComponents();
		for (AbstractComponent abstractComponent : components) {
			if (abstractComponent.containsType(fullName))
			return true;
		}
		return false;
	}

} //ExternalModuleImpl
