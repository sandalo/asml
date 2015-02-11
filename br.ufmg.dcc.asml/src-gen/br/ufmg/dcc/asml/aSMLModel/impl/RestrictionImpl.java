/**
 */
package br.ufmg.dcc.asml.aSMLModel.impl;

import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.RelactionType;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.RestrictionImpl#getGroupClause <em>Group Clause</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.RestrictionImpl#getComponentA <em>Component A</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.RestrictionImpl#getPermissionClause <em>Permission Clause</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.RestrictionImpl#getRelactionType <em>Relaction Type</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.RestrictionImpl#getComponentB <em>Component B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionImpl extends MinimalEObjectImpl.Container implements Restriction
{
  /**
   * The default value of the '{@link #getGroupClause() <em>Group Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupClause()
   * @generated
   * @ordered
   */
  protected static final GroupClause GROUP_CLAUSE_EDEFAULT = GroupClause.NULL;

  /**
   * The cached value of the '{@link #getGroupClause() <em>Group Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupClause()
   * @generated
   * @ordered
   */
  protected GroupClause groupClause = GROUP_CLAUSE_EDEFAULT;

  /**
   * The cached value of the '{@link #getComponentA() <em>Component A</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentA()
   * @generated
   * @ordered
   */
  protected EList<AbstractComponent> componentA;

  /**
   * The default value of the '{@link #getPermissionClause() <em>Permission Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermissionClause()
   * @generated
   * @ordered
   */
  protected static final PermissionClause PERMISSION_CLAUSE_EDEFAULT = PermissionClause.NULL;

  /**
   * The cached value of the '{@link #getPermissionClause() <em>Permission Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermissionClause()
   * @generated
   * @ordered
   */
  protected PermissionClause permissionClause = PERMISSION_CLAUSE_EDEFAULT;

  /**
   * The default value of the '{@link #getRelactionType() <em>Relaction Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelactionType()
   * @generated
   * @ordered
   */
  protected static final RelactionType RELACTION_TYPE_EDEFAULT = RelactionType.ACCESS;

  /**
   * The cached value of the '{@link #getRelactionType() <em>Relaction Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelactionType()
   * @generated
   * @ordered
   */
  protected RelactionType relactionType = RELACTION_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getComponentB() <em>Component B</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentB()
   * @generated
   * @ordered
   */
  protected AbstractComponent componentB;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestrictionImpl()
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
    return ASMLModelPackage.Literals.RESTRICTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupClause getGroupClause()
  {
    return groupClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupClause(GroupClause newGroupClause)
  {
    GroupClause oldGroupClause = groupClause;
    groupClause = newGroupClause == null ? GROUP_CLAUSE_EDEFAULT : newGroupClause;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.RESTRICTION__GROUP_CLAUSE, oldGroupClause, groupClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractComponent> getComponentA()
  {
    if (componentA == null)
    {
      componentA = new EObjectResolvingEList<AbstractComponent>(AbstractComponent.class, this, ASMLModelPackage.RESTRICTION__COMPONENT_A);
    }
    return componentA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PermissionClause getPermissionClause()
  {
    return permissionClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPermissionClause(PermissionClause newPermissionClause)
  {
    PermissionClause oldPermissionClause = permissionClause;
    permissionClause = newPermissionClause == null ? PERMISSION_CLAUSE_EDEFAULT : newPermissionClause;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.RESTRICTION__PERMISSION_CLAUSE, oldPermissionClause, permissionClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelactionType getRelactionType()
  {
    return relactionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelactionType(RelactionType newRelactionType)
  {
    RelactionType oldRelactionType = relactionType;
    relactionType = newRelactionType == null ? RELACTION_TYPE_EDEFAULT : newRelactionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.RESTRICTION__RELACTION_TYPE, oldRelactionType, relactionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractComponent getComponentB()
  {
    if (componentB != null && componentB.eIsProxy())
    {
      InternalEObject oldComponentB = (InternalEObject)componentB;
      componentB = (AbstractComponent)eResolveProxy(oldComponentB);
      if (componentB != oldComponentB)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASMLModelPackage.RESTRICTION__COMPONENT_B, oldComponentB, componentB));
      }
    }
    return componentB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractComponent basicGetComponentB()
  {
    return componentB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentB(AbstractComponent newComponentB)
  {
    AbstractComponent oldComponentB = componentB;
    componentB = newComponentB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.RESTRICTION__COMPONENT_B, oldComponentB, componentB));
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
      case ASMLModelPackage.RESTRICTION__GROUP_CLAUSE:
        return getGroupClause();
      case ASMLModelPackage.RESTRICTION__COMPONENT_A:
        return getComponentA();
      case ASMLModelPackage.RESTRICTION__PERMISSION_CLAUSE:
        return getPermissionClause();
      case ASMLModelPackage.RESTRICTION__RELACTION_TYPE:
        return getRelactionType();
      case ASMLModelPackage.RESTRICTION__COMPONENT_B:
        if (resolve) return getComponentB();
        return basicGetComponentB();
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
      case ASMLModelPackage.RESTRICTION__GROUP_CLAUSE:
        setGroupClause((GroupClause)newValue);
        return;
      case ASMLModelPackage.RESTRICTION__COMPONENT_A:
        getComponentA().clear();
        getComponentA().addAll((Collection<? extends AbstractComponent>)newValue);
        return;
      case ASMLModelPackage.RESTRICTION__PERMISSION_CLAUSE:
        setPermissionClause((PermissionClause)newValue);
        return;
      case ASMLModelPackage.RESTRICTION__RELACTION_TYPE:
        setRelactionType((RelactionType)newValue);
        return;
      case ASMLModelPackage.RESTRICTION__COMPONENT_B:
        setComponentB((AbstractComponent)newValue);
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
      case ASMLModelPackage.RESTRICTION__GROUP_CLAUSE:
        setGroupClause(GROUP_CLAUSE_EDEFAULT);
        return;
      case ASMLModelPackage.RESTRICTION__COMPONENT_A:
        getComponentA().clear();
        return;
      case ASMLModelPackage.RESTRICTION__PERMISSION_CLAUSE:
        setPermissionClause(PERMISSION_CLAUSE_EDEFAULT);
        return;
      case ASMLModelPackage.RESTRICTION__RELACTION_TYPE:
        setRelactionType(RELACTION_TYPE_EDEFAULT);
        return;
      case ASMLModelPackage.RESTRICTION__COMPONENT_B:
        setComponentB((AbstractComponent)null);
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
      case ASMLModelPackage.RESTRICTION__GROUP_CLAUSE:
        return groupClause != GROUP_CLAUSE_EDEFAULT;
      case ASMLModelPackage.RESTRICTION__COMPONENT_A:
        return componentA != null && !componentA.isEmpty();
      case ASMLModelPackage.RESTRICTION__PERMISSION_CLAUSE:
        return permissionClause != PERMISSION_CLAUSE_EDEFAULT;
      case ASMLModelPackage.RESTRICTION__RELACTION_TYPE:
        return relactionType != RELACTION_TYPE_EDEFAULT;
      case ASMLModelPackage.RESTRICTION__COMPONENT_B:
        return componentB != null;
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
    result.append(" (groupClause: ");
    result.append(groupClause);
    result.append(", permissionClause: ");
    result.append(permissionClause);
    result.append(", relactionType: ");
    result.append(relactionType);
    result.append(')');
    return result.toString();
  }

} //RestrictionImpl
