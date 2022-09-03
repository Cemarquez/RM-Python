/**
 */
package concrete.impl;

import concrete.ConcretePackage;
import concrete.MAttribute;
import concrete.MClass;
import concrete.MFunction;
import concrete.MRelationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concrete.impl.MClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link concrete.impl.MClassImpl#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link concrete.impl.MClassImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link concrete.impl.MClassImpl#isAbstracts <em>Abstracts</em>}</li>
 *   <li>{@link concrete.impl.MClassImpl#getStereoType <em>Stereo Type</em>}</li>
 *   <li>{@link concrete.impl.MClassImpl#getPath <em>Path</em>}</li>
 *   <li>{@link concrete.impl.MClassImpl#getLtsMRelationships <em>Lts MRelationships</em>}</li>
 *   <li>{@link concrete.impl.MClassImpl#getLstMAttribute <em>Lst MAttribute</em>}</li>
 *   <li>{@link concrete.impl.MClassImpl#getLstMFunction <em>Lst MFunction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MClassImpl extends EObjectImpl implements MClass {
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
	 * The default value of the '{@link #getAccessModifier() <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_MODIFIER_EDEFAULT = null;

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
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

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
	 * The default value of the '{@link #isAbstracts() <em>Abstracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstracts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstracts() <em>Abstracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstracts()
	 * @generated
	 * @ordered
	 */
	protected boolean abstracts = ABSTRACTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStereoType() <em>Stereo Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereoType()
	 * @generated
	 * @ordered
	 */
	protected static final String STEREO_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStereoType() <em>Stereo Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereoType()
	 * @generated
	 * @ordered
	 */
	protected String stereoType = STEREO_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLtsMRelationships() <em>Lts MRelationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtsMRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<MRelationship> ltsMRelationships;

	/**
	 * The cached value of the '{@link #getLstMAttribute() <em>Lst MAttribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<MAttribute> lstMAttribute;

	/**
	 * The cached value of the '{@link #getLstMFunction() <em>Lst MFunction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<MFunction> lstMFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.MCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessModifier() {
		return accessModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessModifier(String newAccessModifier) {
		String oldAccessModifier = accessModifier;
		accessModifier = newAccessModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCLASS__ACCESS_MODIFIER, oldAccessModifier, accessModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCLASS__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstracts() {
		return abstracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstracts(boolean newAbstracts) {
		boolean oldAbstracts = abstracts;
		abstracts = newAbstracts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCLASS__ABSTRACTS, oldAbstracts, abstracts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStereoType() {
		return stereoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStereoType(String newStereoType) {
		String oldStereoType = stereoType;
		stereoType = newStereoType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCLASS__STEREO_TYPE, oldStereoType, stereoType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MCLASS__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MRelationship> getLtsMRelationships() {
		if (ltsMRelationships == null) {
			ltsMRelationships = new EObjectContainmentEList<MRelationship>(MRelationship.class, this, ConcretePackage.MCLASS__LTS_MRELATIONSHIPS);
		}
		return ltsMRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MAttribute> getLstMAttribute() {
		if (lstMAttribute == null) {
			lstMAttribute = new EObjectContainmentEList<MAttribute>(MAttribute.class, this, ConcretePackage.MCLASS__LST_MATTRIBUTE);
		}
		return lstMAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MFunction> getLstMFunction() {
		if (lstMFunction == null) {
			lstMFunction = new EObjectContainmentEList<MFunction>(MFunction.class, this, ConcretePackage.MCLASS__LST_MFUNCTION);
		}
		return lstMFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretePackage.MCLASS__LTS_MRELATIONSHIPS:
				return ((InternalEList<?>)getLtsMRelationships()).basicRemove(otherEnd, msgs);
			case ConcretePackage.MCLASS__LST_MATTRIBUTE:
				return ((InternalEList<?>)getLstMAttribute()).basicRemove(otherEnd, msgs);
			case ConcretePackage.MCLASS__LST_MFUNCTION:
				return ((InternalEList<?>)getLstMFunction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretePackage.MCLASS__NAME:
				return getName();
			case ConcretePackage.MCLASS__ACCESS_MODIFIER:
				return getAccessModifier();
			case ConcretePackage.MCLASS__COMMENTS:
				return getComments();
			case ConcretePackage.MCLASS__ABSTRACTS:
				return isAbstracts();
			case ConcretePackage.MCLASS__STEREO_TYPE:
				return getStereoType();
			case ConcretePackage.MCLASS__PATH:
				return getPath();
			case ConcretePackage.MCLASS__LTS_MRELATIONSHIPS:
				return getLtsMRelationships();
			case ConcretePackage.MCLASS__LST_MATTRIBUTE:
				return getLstMAttribute();
			case ConcretePackage.MCLASS__LST_MFUNCTION:
				return getLstMFunction();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConcretePackage.MCLASS__NAME:
				setName((String)newValue);
				return;
			case ConcretePackage.MCLASS__ACCESS_MODIFIER:
				setAccessModifier((String)newValue);
				return;
			case ConcretePackage.MCLASS__COMMENTS:
				setComments((String)newValue);
				return;
			case ConcretePackage.MCLASS__ABSTRACTS:
				setAbstracts((Boolean)newValue);
				return;
			case ConcretePackage.MCLASS__STEREO_TYPE:
				setStereoType((String)newValue);
				return;
			case ConcretePackage.MCLASS__PATH:
				setPath((String)newValue);
				return;
			case ConcretePackage.MCLASS__LTS_MRELATIONSHIPS:
				getLtsMRelationships().clear();
				getLtsMRelationships().addAll((Collection<? extends MRelationship>)newValue);
				return;
			case ConcretePackage.MCLASS__LST_MATTRIBUTE:
				getLstMAttribute().clear();
				getLstMAttribute().addAll((Collection<? extends MAttribute>)newValue);
				return;
			case ConcretePackage.MCLASS__LST_MFUNCTION:
				getLstMFunction().clear();
				getLstMFunction().addAll((Collection<? extends MFunction>)newValue);
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
			case ConcretePackage.MCLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretePackage.MCLASS__ACCESS_MODIFIER:
				setAccessModifier(ACCESS_MODIFIER_EDEFAULT);
				return;
			case ConcretePackage.MCLASS__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case ConcretePackage.MCLASS__ABSTRACTS:
				setAbstracts(ABSTRACTS_EDEFAULT);
				return;
			case ConcretePackage.MCLASS__STEREO_TYPE:
				setStereoType(STEREO_TYPE_EDEFAULT);
				return;
			case ConcretePackage.MCLASS__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ConcretePackage.MCLASS__LTS_MRELATIONSHIPS:
				getLtsMRelationships().clear();
				return;
			case ConcretePackage.MCLASS__LST_MATTRIBUTE:
				getLstMAttribute().clear();
				return;
			case ConcretePackage.MCLASS__LST_MFUNCTION:
				getLstMFunction().clear();
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
			case ConcretePackage.MCLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretePackage.MCLASS__ACCESS_MODIFIER:
				return ACCESS_MODIFIER_EDEFAULT == null ? accessModifier != null : !ACCESS_MODIFIER_EDEFAULT.equals(accessModifier);
			case ConcretePackage.MCLASS__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case ConcretePackage.MCLASS__ABSTRACTS:
				return abstracts != ABSTRACTS_EDEFAULT;
			case ConcretePackage.MCLASS__STEREO_TYPE:
				return STEREO_TYPE_EDEFAULT == null ? stereoType != null : !STEREO_TYPE_EDEFAULT.equals(stereoType);
			case ConcretePackage.MCLASS__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ConcretePackage.MCLASS__LTS_MRELATIONSHIPS:
				return ltsMRelationships != null && !ltsMRelationships.isEmpty();
			case ConcretePackage.MCLASS__LST_MATTRIBUTE:
				return lstMAttribute != null && !lstMAttribute.isEmpty();
			case ConcretePackage.MCLASS__LST_MFUNCTION:
				return lstMFunction != null && !lstMFunction.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", accessModifier: ");
		result.append(accessModifier);
		result.append(", comments: ");
		result.append(comments);
		result.append(", abstracts: ");
		result.append(abstracts);
		result.append(", stereoType: ");
		result.append(stereoType);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //MClassImpl
