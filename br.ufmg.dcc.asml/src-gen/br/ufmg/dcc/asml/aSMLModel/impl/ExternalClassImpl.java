/**
 */
package br.ufmg.dcc.asml.aSMLModel.impl;

import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.ExternalClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jdt.core.IType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>External Class</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.ExternalClassImpl#getDescription
 * <em>Description</em>}</li>
 * <li>{@link br.ufmg.dcc.asml.aSMLModel.impl.ExternalClassImpl#getType <em>Type
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalClassImpl extends AbstractComponentImpl implements ExternalClass {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExternalClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASMLModelPackage.Literals.EXTERNAL_CLASS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.EXTERNAL_CLASS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASMLModelPackage.EXTERNAL_CLASS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ASMLModelPackage.EXTERNAL_CLASS__DESCRIPTION:
			return getDescription();
		case ASMLModelPackage.EXTERNAL_CLASS__TYPE:
			return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ASMLModelPackage.EXTERNAL_CLASS__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ASMLModelPackage.EXTERNAL_CLASS__TYPE:
			setType((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ASMLModelPackage.EXTERNAL_CLASS__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ASMLModelPackage.EXTERNAL_CLASS__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ASMLModelPackage.EXTERNAL_CLASS__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ASMLModelPackage.EXTERNAL_CLASS__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	public String[] getAllTypesNames() {
		String iTypesNames[] = null;
		String typeName = ((ExternalClass) this).getType();
		iTypesNames = new String[] { this.getName(), typeName };
		return iTypesNames;
	}

	/**
	 * @generated NOT
	 */
	public String[] getAllSupertypesNames() {
		String typeName = ((ExternalClass) this).getType();
		String superTypesNamesB[] = new String[] { this.getName(), typeName };
		return superTypesNamesB;
	}

	/**
	 * @generated NOT
	 */
	public String[] getAllSubtypesNames() {
		String typeName = this.getType();
		String superTypesNamesB[] = new String[] { this.getName(), typeName };
		return superTypesNamesB;
	}

	/**
	 * @generated NOT
	 */
	public boolean containsType(String fullName) {
		if (getName().equals(fullName))
			return true;
		if (getType().equals(fullName))
			return true;
		return false;
	}

} // ExternalClassImpl
