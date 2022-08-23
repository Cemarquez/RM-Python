/**
 */
package diagrama.domain.impl;

import diagrama.domain.DomainPackage;
import diagrama.domain.MClass;
import diagrama.domain.MRelationship;
import diagrama.domain.RelationshipFactory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MRelationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.impl.MRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link diagrama.domain.impl.MRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link diagrama.domain.impl.MRelationshipImpl#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link diagrama.domain.impl.MRelationshipImpl#getMultiplicitySource <em>Multiplicity Source</em>}</li>
 *   <li>{@link diagrama.domain.impl.MRelationshipImpl#getMultiplicityTarget <em>Multiplicity Target</em>}</li>
 *   <li>{@link diagrama.domain.impl.MRelationshipImpl#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link diagrama.domain.impl.MRelationshipImpl#getTargetRole <em>Target Role</em>}</li>
 *   <li>{@link diagrama.domain.impl.MRelationshipImpl#getLstRelationshipFactory <em>Lst Relationship Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MRelationshipImpl extends EObjectImpl implements MRelationship {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MClass source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected MClass target;

	/**
	 * The default value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_TYPE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected String relationshipType = RELATIONSHIP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicitySource() <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicitySource()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_SOURCE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getMultiplicitySource() <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicitySource()
	 * @generated
	 * @ordered
	 */
	protected String multiplicitySource = MULTIPLICITY_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityTarget() <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_TARGET_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getMultiplicityTarget() <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityTarget()
	 * @generated
	 * @ordered
	 */
	protected String multiplicityTarget = MULTIPLICITY_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceRole() <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRole()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ROLE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getSourceRole() <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRole()
	 * @generated
	 * @ordered
	 */
	protected String sourceRole = SOURCE_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetRole() <em>Target Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRole()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ROLE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTargetRole() <em>Target Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRole()
	 * @generated
	 * @ordered
	 */
	protected String targetRole = TARGET_ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.MRELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (MClass)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.MRELATIONSHIP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(MClass newSource, NotificationChain msgs) {
		MClass oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.MRELATIONSHIP__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(MClass newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, DomainPackage.MCLASS__LST_MRELATIONSHIP_SOURCE, MClass.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, DomainPackage.MCLASS__LST_MRELATIONSHIP_SOURCE, MClass.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MRELATIONSHIP__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (MClass)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.MRELATIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(MClass newTarget, NotificationChain msgs) {
		MClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.MRELATIONSHIP__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(MClass newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, DomainPackage.MCLASS__LST_MRELATIONSHIP_TARGET, MClass.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, DomainPackage.MCLASS__LST_MRELATIONSHIP_TARGET, MClass.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MRELATIONSHIP__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationshipType() {
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipType(String newRelationshipType) {
		String oldRelationshipType = relationshipType;
		relationshipType = newRelationshipType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MRELATIONSHIP__RELATIONSHIP_TYPE, oldRelationshipType, relationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicitySource() {
		return multiplicitySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicitySource(String newMultiplicitySource) {
		String oldMultiplicitySource = multiplicitySource;
		multiplicitySource = newMultiplicitySource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MRELATIONSHIP__MULTIPLICITY_SOURCE, oldMultiplicitySource, multiplicitySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicityTarget() {
		return multiplicityTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityTarget(String newMultiplicityTarget) {
		String oldMultiplicityTarget = multiplicityTarget;
		multiplicityTarget = newMultiplicityTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MRELATIONSHIP__MULTIPLICITY_TARGET, oldMultiplicityTarget, multiplicityTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRole() {
		return sourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRole(String newSourceRole) {
		String oldSourceRole = sourceRole;
		sourceRole = newSourceRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MRELATIONSHIP__SOURCE_ROLE, oldSourceRole, sourceRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetRole() {
		return targetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRole(String newTargetRole) {
		String oldTargetRole = targetRole;
		targetRole = newTargetRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MRELATIONSHIP__TARGET_ROLE, oldTargetRole, targetRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipFactory getLstRelationshipFactory() {
		if (eContainerFeatureID() != DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY) return null;
		return (RelationshipFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstRelationshipFactory(RelationshipFactory newLstRelationshipFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLstRelationshipFactory, DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstRelationshipFactory(RelationshipFactory newLstRelationshipFactory) {
		if (newLstRelationshipFactory != eInternalContainer() || (eContainerFeatureID() != DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY && newLstRelationshipFactory != null)) {
			if (EcoreUtil.isAncestor(this, newLstRelationshipFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLstRelationshipFactory != null)
				msgs = ((InternalEObject)newLstRelationshipFactory).eInverseAdd(this, DomainPackage.RELATIONSHIP_FACTORY__LST_MRELATIONSHIP, RelationshipFactory.class, msgs);
			msgs = basicSetLstRelationshipFactory(newLstRelationshipFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY, newLstRelationshipFactory, newLstRelationshipFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.MRELATIONSHIP__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, DomainPackage.MCLASS__LST_MRELATIONSHIP_SOURCE, MClass.class, msgs);
				return basicSetSource((MClass)otherEnd, msgs);
			case DomainPackage.MRELATIONSHIP__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, DomainPackage.MCLASS__LST_MRELATIONSHIP_TARGET, MClass.class, msgs);
				return basicSetTarget((MClass)otherEnd, msgs);
			case DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLstRelationshipFactory((RelationshipFactory)otherEnd, msgs);
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
			case DomainPackage.MRELATIONSHIP__SOURCE:
				return basicSetSource(null, msgs);
			case DomainPackage.MRELATIONSHIP__TARGET:
				return basicSetTarget(null, msgs);
			case DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY:
				return basicSetLstRelationshipFactory(null, msgs);
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
			case DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY:
				return eInternalContainer().eInverseRemove(this, DomainPackage.RELATIONSHIP_FACTORY__LST_MRELATIONSHIP, RelationshipFactory.class, msgs);
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
			case DomainPackage.MRELATIONSHIP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DomainPackage.MRELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DomainPackage.MRELATIONSHIP__RELATIONSHIP_TYPE:
				return getRelationshipType();
			case DomainPackage.MRELATIONSHIP__MULTIPLICITY_SOURCE:
				return getMultiplicitySource();
			case DomainPackage.MRELATIONSHIP__MULTIPLICITY_TARGET:
				return getMultiplicityTarget();
			case DomainPackage.MRELATIONSHIP__SOURCE_ROLE:
				return getSourceRole();
			case DomainPackage.MRELATIONSHIP__TARGET_ROLE:
				return getTargetRole();
			case DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY:
				return getLstRelationshipFactory();
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
			case DomainPackage.MRELATIONSHIP__SOURCE:
				setSource((MClass)newValue);
				return;
			case DomainPackage.MRELATIONSHIP__TARGET:
				setTarget((MClass)newValue);
				return;
			case DomainPackage.MRELATIONSHIP__RELATIONSHIP_TYPE:
				setRelationshipType((String)newValue);
				return;
			case DomainPackage.MRELATIONSHIP__MULTIPLICITY_SOURCE:
				setMultiplicitySource((String)newValue);
				return;
			case DomainPackage.MRELATIONSHIP__MULTIPLICITY_TARGET:
				setMultiplicityTarget((String)newValue);
				return;
			case DomainPackage.MRELATIONSHIP__SOURCE_ROLE:
				setSourceRole((String)newValue);
				return;
			case DomainPackage.MRELATIONSHIP__TARGET_ROLE:
				setTargetRole((String)newValue);
				return;
			case DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY:
				setLstRelationshipFactory((RelationshipFactory)newValue);
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
			case DomainPackage.MRELATIONSHIP__SOURCE:
				setSource((MClass)null);
				return;
			case DomainPackage.MRELATIONSHIP__TARGET:
				setTarget((MClass)null);
				return;
			case DomainPackage.MRELATIONSHIP__RELATIONSHIP_TYPE:
				setRelationshipType(RELATIONSHIP_TYPE_EDEFAULT);
				return;
			case DomainPackage.MRELATIONSHIP__MULTIPLICITY_SOURCE:
				setMultiplicitySource(MULTIPLICITY_SOURCE_EDEFAULT);
				return;
			case DomainPackage.MRELATIONSHIP__MULTIPLICITY_TARGET:
				setMultiplicityTarget(MULTIPLICITY_TARGET_EDEFAULT);
				return;
			case DomainPackage.MRELATIONSHIP__SOURCE_ROLE:
				setSourceRole(SOURCE_ROLE_EDEFAULT);
				return;
			case DomainPackage.MRELATIONSHIP__TARGET_ROLE:
				setTargetRole(TARGET_ROLE_EDEFAULT);
				return;
			case DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY:
				setLstRelationshipFactory((RelationshipFactory)null);
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
			case DomainPackage.MRELATIONSHIP__SOURCE:
				return source != null;
			case DomainPackage.MRELATIONSHIP__TARGET:
				return target != null;
			case DomainPackage.MRELATIONSHIP__RELATIONSHIP_TYPE:
				return RELATIONSHIP_TYPE_EDEFAULT == null ? relationshipType != null : !RELATIONSHIP_TYPE_EDEFAULT.equals(relationshipType);
			case DomainPackage.MRELATIONSHIP__MULTIPLICITY_SOURCE:
				return MULTIPLICITY_SOURCE_EDEFAULT == null ? multiplicitySource != null : !MULTIPLICITY_SOURCE_EDEFAULT.equals(multiplicitySource);
			case DomainPackage.MRELATIONSHIP__MULTIPLICITY_TARGET:
				return MULTIPLICITY_TARGET_EDEFAULT == null ? multiplicityTarget != null : !MULTIPLICITY_TARGET_EDEFAULT.equals(multiplicityTarget);
			case DomainPackage.MRELATIONSHIP__SOURCE_ROLE:
				return SOURCE_ROLE_EDEFAULT == null ? sourceRole != null : !SOURCE_ROLE_EDEFAULT.equals(sourceRole);
			case DomainPackage.MRELATIONSHIP__TARGET_ROLE:
				return TARGET_ROLE_EDEFAULT == null ? targetRole != null : !TARGET_ROLE_EDEFAULT.equals(targetRole);
			case DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY:
				return getLstRelationshipFactory() != null;
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
		result.append(" (relationshipType: ");
		result.append(relationshipType);
		result.append(", multiplicitySource: ");
		result.append(multiplicitySource);
		result.append(", multiplicityTarget: ");
		result.append(multiplicityTarget);
		result.append(", sourceRole: ");
		result.append(sourceRole);
		result.append(", targetRole: ");
		result.append(targetRole);
		result.append(')');
		return result.toString();
	}

} //MRelationshipImpl
