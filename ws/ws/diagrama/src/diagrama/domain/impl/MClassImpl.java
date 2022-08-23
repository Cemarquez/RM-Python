/**
 */
package diagrama.domain.impl;

import diagrama.domain.ClassDiagram;
import diagrama.domain.DomainPackage;
import diagrama.domain.MAttributes;
import diagrama.domain.MClass;
import diagrama.domain.MFunction;
import diagrama.domain.MRelationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.impl.MClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link diagrama.domain.impl.MClassImpl#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link diagrama.domain.impl.MClassImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link diagrama.domain.impl.MClassImpl#getLstMAttributes <em>Lst MAttributes</em>}</li>
 *   <li>{@link diagrama.domain.impl.MClassImpl#getLstMRelationshipSource <em>Lst MRelationship Source</em>}</li>
 *   <li>{@link diagrama.domain.impl.MClassImpl#getLstMRelationshipTarget <em>Lst MRelationship Target</em>}</li>
 *   <li>{@link diagrama.domain.impl.MClassImpl#getLstClassDiagram <em>Lst Class Diagram</em>}</li>
 *   <li>{@link diagrama.domain.impl.MClassImpl#getLstMFunction <em>Lst MFunction</em>}</li>
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
	 * The cached value of the '{@link #getLstMAttributes() <em>Lst MAttributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MAttributes> lstMAttributes;

	/**
	 * The cached value of the '{@link #getLstMRelationshipSource() <em>Lst MRelationship Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMRelationshipSource()
	 * @generated
	 * @ordered
	 */
	protected EList<MRelationship> lstMRelationshipSource;

	/**
	 * The cached value of the '{@link #getLstMRelationshipTarget() <em>Lst MRelationship Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMRelationshipTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<MRelationship> lstMRelationshipTarget;

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
		return DomainPackage.Literals.MCLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MCLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MCLASS__ACCESS_MODIFIER, oldAccessModifier, accessModifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MCLASS__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MAttributes> getLstMAttributes() {
		if (lstMAttributes == null) {
			lstMAttributes = new EObjectContainmentWithInverseEList<MAttributes>(MAttributes.class, this, DomainPackage.MCLASS__LST_MATTRIBUTES, DomainPackage.MATTRIBUTES__OWNED_BY_MCLASS);
		}
		return lstMAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MRelationship> getLstMRelationshipSource() {
		if (lstMRelationshipSource == null) {
			lstMRelationshipSource = new EObjectWithInverseResolvingEList<MRelationship>(MRelationship.class, this, DomainPackage.MCLASS__LST_MRELATIONSHIP_SOURCE, DomainPackage.MRELATIONSHIP__SOURCE);
		}
		return lstMRelationshipSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MRelationship> getLstMRelationshipTarget() {
		if (lstMRelationshipTarget == null) {
			lstMRelationshipTarget = new EObjectWithInverseResolvingEList<MRelationship>(MRelationship.class, this, DomainPackage.MCLASS__LST_MRELATIONSHIP_TARGET, DomainPackage.MRELATIONSHIP__TARGET);
		}
		return lstMRelationshipTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagram getLstClassDiagram() {
		if (eContainerFeatureID() != DomainPackage.MCLASS__LST_CLASS_DIAGRAM) return null;
		return (ClassDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstClassDiagram(ClassDiagram newLstClassDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLstClassDiagram, DomainPackage.MCLASS__LST_CLASS_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstClassDiagram(ClassDiagram newLstClassDiagram) {
		if (newLstClassDiagram != eInternalContainer() || (eContainerFeatureID() != DomainPackage.MCLASS__LST_CLASS_DIAGRAM && newLstClassDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newLstClassDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLstClassDiagram != null)
				msgs = ((InternalEObject)newLstClassDiagram).eInverseAdd(this, DomainPackage.CLASS_DIAGRAM__LST_MCLASS, ClassDiagram.class, msgs);
			msgs = basicSetLstClassDiagram(newLstClassDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MCLASS__LST_CLASS_DIAGRAM, newLstClassDiagram, newLstClassDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFunction> getLstMFunction() {
		if (lstMFunction == null) {
			lstMFunction = new EObjectContainmentWithInverseEList<MFunction>(MFunction.class, this, DomainPackage.MCLASS__LST_MFUNCTION, DomainPackage.MFUNCTION__OWNED_BY_MCLASS);
		}
		return lstMFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.MCLASS__LST_MATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMAttributes()).basicAdd(otherEnd, msgs);
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMRelationshipSource()).basicAdd(otherEnd, msgs);
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMRelationshipTarget()).basicAdd(otherEnd, msgs);
			case DomainPackage.MCLASS__LST_CLASS_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLstClassDiagram((ClassDiagram)otherEnd, msgs);
			case DomainPackage.MCLASS__LST_MFUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMFunction()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.MCLASS__LST_MATTRIBUTES:
				return ((InternalEList<?>)getLstMAttributes()).basicRemove(otherEnd, msgs);
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				return ((InternalEList<?>)getLstMRelationshipSource()).basicRemove(otherEnd, msgs);
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				return ((InternalEList<?>)getLstMRelationshipTarget()).basicRemove(otherEnd, msgs);
			case DomainPackage.MCLASS__LST_CLASS_DIAGRAM:
				return basicSetLstClassDiagram(null, msgs);
			case DomainPackage.MCLASS__LST_MFUNCTION:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DomainPackage.MCLASS__LST_CLASS_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, DomainPackage.CLASS_DIAGRAM__LST_MCLASS, ClassDiagram.class, msgs);
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
			case DomainPackage.MCLASS__NAME:
				return getName();
			case DomainPackage.MCLASS__ACCESS_MODIFIER:
				return getAccessModifier();
			case DomainPackage.MCLASS__COMMENTS:
				return getComments();
			case DomainPackage.MCLASS__LST_MATTRIBUTES:
				return getLstMAttributes();
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				return getLstMRelationshipSource();
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				return getLstMRelationshipTarget();
			case DomainPackage.MCLASS__LST_CLASS_DIAGRAM:
				return getLstClassDiagram();
			case DomainPackage.MCLASS__LST_MFUNCTION:
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
			case DomainPackage.MCLASS__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.MCLASS__ACCESS_MODIFIER:
				setAccessModifier((String)newValue);
				return;
			case DomainPackage.MCLASS__COMMENTS:
				setComments((String)newValue);
				return;
			case DomainPackage.MCLASS__LST_MATTRIBUTES:
				getLstMAttributes().clear();
				getLstMAttributes().addAll((Collection<? extends MAttributes>)newValue);
				return;
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				getLstMRelationshipSource().clear();
				getLstMRelationshipSource().addAll((Collection<? extends MRelationship>)newValue);
				return;
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				getLstMRelationshipTarget().clear();
				getLstMRelationshipTarget().addAll((Collection<? extends MRelationship>)newValue);
				return;
			case DomainPackage.MCLASS__LST_CLASS_DIAGRAM:
				setLstClassDiagram((ClassDiagram)newValue);
				return;
			case DomainPackage.MCLASS__LST_MFUNCTION:
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
			case DomainPackage.MCLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.MCLASS__ACCESS_MODIFIER:
				setAccessModifier(ACCESS_MODIFIER_EDEFAULT);
				return;
			case DomainPackage.MCLASS__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case DomainPackage.MCLASS__LST_MATTRIBUTES:
				getLstMAttributes().clear();
				return;
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				getLstMRelationshipSource().clear();
				return;
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				getLstMRelationshipTarget().clear();
				return;
			case DomainPackage.MCLASS__LST_CLASS_DIAGRAM:
				setLstClassDiagram((ClassDiagram)null);
				return;
			case DomainPackage.MCLASS__LST_MFUNCTION:
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
			case DomainPackage.MCLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.MCLASS__ACCESS_MODIFIER:
				return ACCESS_MODIFIER_EDEFAULT == null ? accessModifier != null : !ACCESS_MODIFIER_EDEFAULT.equals(accessModifier);
			case DomainPackage.MCLASS__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case DomainPackage.MCLASS__LST_MATTRIBUTES:
				return lstMAttributes != null && !lstMAttributes.isEmpty();
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				return lstMRelationshipSource != null && !lstMRelationshipSource.isEmpty();
			case DomainPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				return lstMRelationshipTarget != null && !lstMRelationshipTarget.isEmpty();
			case DomainPackage.MCLASS__LST_CLASS_DIAGRAM:
				return getLstClassDiagram() != null;
			case DomainPackage.MCLASS__LST_MFUNCTION:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", accessModifier: ");
		result.append(accessModifier);
		result.append(", comments: ");
		result.append(comments);
		result.append(')');
		return result.toString();
	}

} //MClassImpl
