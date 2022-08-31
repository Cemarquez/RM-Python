/**
 */
package diagrama.domain.abstractsyntax.impl;

import diagrama.domain.abstractsyntax.AbstractsyntaxPackage;
import diagrama.domain.abstractsyntax.MAttribute;
import diagrama.domain.abstractsyntax.MClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MAttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MAttributeImpl#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MAttributeImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MAttributeImpl#getOwnedByMClass <em>Owned By MClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MAttributeImpl extends EObjectImpl implements MAttribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = " ";

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
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessModifier() <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_MODIFIER_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getAccessModifier() <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifier()
	 * @generated
	 * @ordered
	 */
	protected String accessModifier = ACCESS_MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.MATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MATTRIBUTE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessModifier() {
		return accessModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessModifier(String newAccessModifier) {
		String oldAccessModifier = accessModifier;
		accessModifier = newAccessModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MATTRIBUTE__ACCESS_MODIFIER, oldAccessModifier, accessModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MATTRIBUTE__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass getOwnedByMClass() {
		if (eContainerFeatureID() != AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS) return null;
		return (MClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByMClass(MClass newOwnedByMClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByMClass, AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByMClass(MClass newOwnedByMClass) {
		if (newOwnedByMClass != eInternalContainer() || (eContainerFeatureID() != AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS && newOwnedByMClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByMClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByMClass != null)
				msgs = ((InternalEObject)newOwnedByMClass).eInverseAdd(this, AbstractsyntaxPackage.MCLASS__LST_MATTRIBUTES, MClass.class, msgs);
			msgs = basicSetOwnedByMClass(newOwnedByMClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS, newOwnedByMClass, newOwnedByMClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByMClass((MClass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS:
				return basicSetOwnedByMClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS:
				return eInternalContainer().eInverseRemove(this, AbstractsyntaxPackage.MCLASS__LST_MATTRIBUTES, MClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractsyntaxPackage.MATTRIBUTE__NAME:
				return getName();
			case AbstractsyntaxPackage.MATTRIBUTE__DATA_TYPE:
				return getDataType();
			case AbstractsyntaxPackage.MATTRIBUTE__ACCESS_MODIFIER:
				return getAccessModifier();
			case AbstractsyntaxPackage.MATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case AbstractsyntaxPackage.MATTRIBUTE__COMMENTS:
				return getComments();
			case AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS:
				return getOwnedByMClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractsyntaxPackage.MATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case AbstractsyntaxPackage.MATTRIBUTE__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case AbstractsyntaxPackage.MATTRIBUTE__ACCESS_MODIFIER:
				setAccessModifier((String)newValue);
				return;
			case AbstractsyntaxPackage.MATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case AbstractsyntaxPackage.MATTRIBUTE__COMMENTS:
				setComments((String)newValue);
				return;
			case AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS:
				setOwnedByMClass((MClass)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AbstractsyntaxPackage.MATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MATTRIBUTE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MATTRIBUTE__ACCESS_MODIFIER:
				setAccessModifier(ACCESS_MODIFIER_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MATTRIBUTE__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS:
				setOwnedByMClass((MClass)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AbstractsyntaxPackage.MATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractsyntaxPackage.MATTRIBUTE__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case AbstractsyntaxPackage.MATTRIBUTE__ACCESS_MODIFIER:
				return ACCESS_MODIFIER_EDEFAULT == null ? accessModifier != null : !ACCESS_MODIFIER_EDEFAULT.equals(accessModifier);
			case AbstractsyntaxPackage.MATTRIBUTE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case AbstractsyntaxPackage.MATTRIBUTE__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS:
				return getOwnedByMClass() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", accessModifier: ");
		result.append(accessModifier);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", comments: ");
		result.append(comments);
		result.append(')');
		return result.toString();
	}

} //MAttributeImpl
