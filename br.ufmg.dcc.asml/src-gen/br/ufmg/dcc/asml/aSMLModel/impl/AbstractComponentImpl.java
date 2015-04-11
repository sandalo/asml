/**
 */
package br.ufmg.dcc.asml.aSMLModel.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;

import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.ComponentVisitor;
import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.AbstractComponentImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractComponentImpl extends MinimalEObjectImpl.Container implements AbstractComponent
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractComponentImpl()
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
    return ASMLModelPackage.Literals.ABSTRACT_COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.ABSTRACT_COMPONENT__NAME, oldName, name));
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
      case ASMLModelPackage.ABSTRACT_COMPONENT__NAME:
        return getName();
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
      case ASMLModelPackage.ABSTRACT_COMPONENT__NAME:
        setName((String)newValue);
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
      case ASMLModelPackage.ABSTRACT_COMPONENT__NAME:
        setName(NAME_EDEFAULT);
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
      case ASMLModelPackage.ABSTRACT_COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

	/**
	 * @generated NOT
	 */
  	public EList<AbstractComponent> getComponents(){return new BasicEList<AbstractComponent>();}

	/**
	 * @generated NOT
	 */
	private final Set<ComponentInstance> componentInstances = new HashSet<ComponentInstance>();

  
	/**
	 * @generated NOT
	 */
	public Set<ComponentInstance> getInstances() {
		return Collections.unmodifiableSet(componentInstances);
	}

	/**
	 * @generated NOT
	 */
	public Set<ComponentInstance> getAllComponentInstances() {
		Set<ComponentInstance> resourcesAux = new HashSet<ComponentInstance>();
		EList<AbstractComponent> children = getComponents();
		for (AbstractComponent child : children) {
			Set<ComponentInstance> allComponentInstances = child.getAllComponentInstances();
			resourcesAux.addAll(allComponentInstances);
		}
		resourcesAux.addAll(componentInstances);
		return Collections.unmodifiableSet(resourcesAux);
	}
	/**
	 * @generated NOT
	 */
	@Override
	public void addComponentInstance(ComponentInstance resource) {
		componentInstances.remove(resource);
		componentInstances.add(resource);
	} 

	/**
	 * @generated NOT
	 */
	@Override
	public void resourceClear() {
		componentInstances.clear();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String[] getAllTypesNames() {
		String iTypesNames[] = null;
		Set<ComponentInstance> componentInstances = this.getAllComponentInstances();
		iTypesNames = new String[componentInstances.size()];
		int i = 0;
		for (ComponentInstance componentInstance : componentInstances) {
			IType iType = componentInstance.getType();
			iTypesNames[i] = iType.getFullyQualifiedName();
		}
		return iTypesNames;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public boolean containsType(String fullName) {
		for (ComponentInstance componentInstances : this.componentInstances) {
			IType iType = componentInstances.getType();
			String fullyQualifiedName = iType.getFullyQualifiedName();
			if(fullyQualifiedName.equals(fullName))
				return true;
		}
		return false;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public String[] getAllSupertypesNames() {
		Set<ComponentInstance> componentInstances = this.getInstances();
		String[] iTypesNames = null;
		for (ComponentInstance componentInstance : componentInstances) {
			IType iType = componentInstance.getType();
			ITypeHierarchy typeHierarchy_;
			IType[] iTypes = null;
			try {
				typeHierarchy_ = iType.newSupertypeHierarchy(new NullProgressMonitor());
				iTypes = typeHierarchy_.getAllSupertypes(iType);
				int i = 0;
				iTypesNames = new String[iTypes.length];
				for (IType iType2 : iTypes) {
					iTypesNames[i++] = iType2.getFullyQualifiedName();
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
		return iTypesNames;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void accept(ComponentVisitor compVisitor) {
		EList<AbstractComponent> children = getComponents();
		for (AbstractComponent child : children) {
			child.accept(compVisitor);
		}
		compVisitor.visit(this);
	}
} //AbstractComponentImpl
