/**
 */
package br.ufmg.dcc.asml.aSMLModel.impl;

import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.Attribute;
import br.ufmg.dcc.asml.aSMLModel.Restriction;
import br.ufmg.dcc.asml.aSMLModel.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.ViewImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.ViewImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.ViewImpl#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends AbstractComponentImpl implements View
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
  protected ViewImpl()
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
    return ASMLModelPackage.Literals.VIEW;
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
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ASMLModelPackage.VIEW__ATTRIBUTES);
    }
    return attributes;
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
      components = new EObjectContainmentEList<AbstractComponent>(AbstractComponent.class, this, ASMLModelPackage.VIEW__COMPONENTS);
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
      restrictions = new EObjectContainmentEList<Restriction>(Restriction.class, this, ASMLModelPackage.VIEW__RESTRICTIONS);
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
      case ASMLModelPackage.VIEW__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case ASMLModelPackage.VIEW__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case ASMLModelPackage.VIEW__RESTRICTIONS:
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
      case ASMLModelPackage.VIEW__ATTRIBUTES:
        return getAttributes();
      case ASMLModelPackage.VIEW__COMPONENTS:
        return getComponents();
      case ASMLModelPackage.VIEW__RESTRICTIONS:
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
      case ASMLModelPackage.VIEW__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case ASMLModelPackage.VIEW__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends AbstractComponent>)newValue);
        return;
      case ASMLModelPackage.VIEW__RESTRICTIONS:
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
      case ASMLModelPackage.VIEW__ATTRIBUTES:
        getAttributes().clear();
        return;
      case ASMLModelPackage.VIEW__COMPONENTS:
        getComponents().clear();
        return;
      case ASMLModelPackage.VIEW__RESTRICTIONS:
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
      case ASMLModelPackage.VIEW__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case ASMLModelPackage.VIEW__COMPONENTS:
        return components != null && !components.isEmpty();
      case ASMLModelPackage.VIEW__RESTRICTIONS:
        return restrictions != null && !restrictions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ViewImpl
