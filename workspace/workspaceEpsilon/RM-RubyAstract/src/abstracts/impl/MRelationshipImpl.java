/**
 */
package abstracts.impl;

import abstracts.AbstractsPackage;
import abstracts.MRelationship;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MRelationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracts.impl.MRelationshipImpl#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link abstracts.impl.MRelationshipImpl#getMultiplicitySource <em>Multiplicity Source</em>}</li>
 *   <li>{@link abstracts.impl.MRelationshipImpl#getMultiplicityTarget <em>Multiplicity Target</em>}</li>
 *   <li>{@link abstracts.impl.MRelationshipImpl#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link abstracts.impl.MRelationshipImpl#getTargetRole <em>Target Role</em>}</li>
 *   <li>{@link abstracts.impl.MRelationshipImpl#getNavegabilitySource <em>Navegability Source</em>}</li>
 *   <li>{@link abstracts.impl.MRelationshipImpl#getNavegabilityTarget <em>Navegability Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MRelationshipImpl extends EObjectImpl implements MRelationship {
	/**
	 * The default value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_TYPE_EDEFAULT = null;

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
	protected static final String MULTIPLICITY_SOURCE_EDEFAULT = null;

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
	protected static final String MULTIPLICITY_TARGET_EDEFAULT = null;

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
	protected static final String SOURCE_ROLE_EDEFAULT = null;

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
	protected static final String TARGET_ROLE_EDEFAULT = null;

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
	 * The default value of the '{@link #getNavegabilitySource() <em>Navegability Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilitySource()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVEGABILITY_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavegabilitySource() <em>Navegability Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilitySource()
	 * @generated
	 * @ordered
	 */
	protected String navegabilitySource = NAVEGABILITY_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavegabilityTarget() <em>Navegability Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilityTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVEGABILITY_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavegabilityTarget() <em>Navegability Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilityTarget()
	 * @generated
	 * @ordered
	 */
	protected String navegabilityTarget = NAVEGABILITY_TARGET_EDEFAULT;

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
		return AbstractsPackage.Literals.MRELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelationshipType() {
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipType(String newRelationshipType) {
		String oldRelationshipType = relationshipType;
		relationshipType = newRelationshipType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MRELATIONSHIP__RELATIONSHIP_TYPE, oldRelationshipType, relationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultiplicitySource() {
		return multiplicitySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicitySource(String newMultiplicitySource) {
		String oldMultiplicitySource = multiplicitySource;
		multiplicitySource = newMultiplicitySource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MRELATIONSHIP__MULTIPLICITY_SOURCE, oldMultiplicitySource, multiplicitySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultiplicityTarget() {
		return multiplicityTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicityTarget(String newMultiplicityTarget) {
		String oldMultiplicityTarget = multiplicityTarget;
		multiplicityTarget = newMultiplicityTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MRELATIONSHIP__MULTIPLICITY_TARGET, oldMultiplicityTarget, multiplicityTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceRole() {
		return sourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceRole(String newSourceRole) {
		String oldSourceRole = sourceRole;
		sourceRole = newSourceRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MRELATIONSHIP__SOURCE_ROLE, oldSourceRole, sourceRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetRole() {
		return targetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetRole(String newTargetRole) {
		String oldTargetRole = targetRole;
		targetRole = newTargetRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MRELATIONSHIP__TARGET_ROLE, oldTargetRole, targetRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNavegabilitySource() {
		return navegabilitySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavegabilitySource(String newNavegabilitySource) {
		String oldNavegabilitySource = navegabilitySource;
		navegabilitySource = newNavegabilitySource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MRELATIONSHIP__NAVEGABILITY_SOURCE, oldNavegabilitySource, navegabilitySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNavegabilityTarget() {
		return navegabilityTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavegabilityTarget(String newNavegabilityTarget) {
		String oldNavegabilityTarget = navegabilityTarget;
		navegabilityTarget = newNavegabilityTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsPackage.MRELATIONSHIP__NAVEGABILITY_TARGET, oldNavegabilityTarget, navegabilityTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractsPackage.MRELATIONSHIP__RELATIONSHIP_TYPE:
				return getRelationshipType();
			case AbstractsPackage.MRELATIONSHIP__MULTIPLICITY_SOURCE:
				return getMultiplicitySource();
			case AbstractsPackage.MRELATIONSHIP__MULTIPLICITY_TARGET:
				return getMultiplicityTarget();
			case AbstractsPackage.MRELATIONSHIP__SOURCE_ROLE:
				return getSourceRole();
			case AbstractsPackage.MRELATIONSHIP__TARGET_ROLE:
				return getTargetRole();
			case AbstractsPackage.MRELATIONSHIP__NAVEGABILITY_SOURCE:
				return getNavegabilitySource();
			case AbstractsPackage.MRELATIONSHIP__NAVEGABILITY_TARGET:
				return getNavegabilityTarget();
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
			case AbstractsPackage.MRELATIONSHIP__RELATIONSHIP_TYPE:
				setRelationshipType((String)newValue);
				return;
			case AbstractsPackage.MRELATIONSHIP__MULTIPLICITY_SOURCE:
				setMultiplicitySource((String)newValue);
				return;
			case AbstractsPackage.MRELATIONSHIP__MULTIPLICITY_TARGET:
				setMultiplicityTarget((String)newValue);
				return;
			case AbstractsPackage.MRELATIONSHIP__SOURCE_ROLE:
				setSourceRole((String)newValue);
				return;
			case AbstractsPackage.MRELATIONSHIP__TARGET_ROLE:
				setTargetRole((String)newValue);
				return;
			case AbstractsPackage.MRELATIONSHIP__NAVEGABILITY_SOURCE:
				setNavegabilitySource((String)newValue);
				return;
			case AbstractsPackage.MRELATIONSHIP__NAVEGABILITY_TARGET:
				setNavegabilityTarget((String)newValue);
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
			case AbstractsPackage.MRELATIONSHIP__RELATIONSHIP_TYPE:
				setRelationshipType(RELATIONSHIP_TYPE_EDEFAULT);
				return;
			case AbstractsPackage.MRELATIONSHIP__MULTIPLICITY_SOURCE:
				setMultiplicitySource(MULTIPLICITY_SOURCE_EDEFAULT);
				return;
			case AbstractsPackage.MRELATIONSHIP__MULTIPLICITY_TARGET:
				setMultiplicityTarget(MULTIPLICITY_TARGET_EDEFAULT);
				return;
			case AbstractsPackage.MRELATIONSHIP__SOURCE_ROLE:
				setSourceRole(SOURCE_ROLE_EDEFAULT);
				return;
			case AbstractsPackage.MRELATIONSHIP__TARGET_ROLE:
				setTargetRole(TARGET_ROLE_EDEFAULT);
				return;
			case AbstractsPackage.MRELATIONSHIP__NAVEGABILITY_SOURCE:
				setNavegabilitySource(NAVEGABILITY_SOURCE_EDEFAULT);
				return;
			case AbstractsPackage.MRELATIONSHIP__NAVEGABILITY_TARGET:
				setNavegabilityTarget(NAVEGABILITY_TARGET_EDEFAULT);
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
			case AbstractsPackage.MRELATIONSHIP__RELATIONSHIP_TYPE:
				return RELATIONSHIP_TYPE_EDEFAULT == null ? relationshipType != null : !RELATIONSHIP_TYPE_EDEFAULT.equals(relationshipType);
			case AbstractsPackage.MRELATIONSHIP__MULTIPLICITY_SOURCE:
				return MULTIPLICITY_SOURCE_EDEFAULT == null ? multiplicitySource != null : !MULTIPLICITY_SOURCE_EDEFAULT.equals(multiplicitySource);
			case AbstractsPackage.MRELATIONSHIP__MULTIPLICITY_TARGET:
				return MULTIPLICITY_TARGET_EDEFAULT == null ? multiplicityTarget != null : !MULTIPLICITY_TARGET_EDEFAULT.equals(multiplicityTarget);
			case AbstractsPackage.MRELATIONSHIP__SOURCE_ROLE:
				return SOURCE_ROLE_EDEFAULT == null ? sourceRole != null : !SOURCE_ROLE_EDEFAULT.equals(sourceRole);
			case AbstractsPackage.MRELATIONSHIP__TARGET_ROLE:
				return TARGET_ROLE_EDEFAULT == null ? targetRole != null : !TARGET_ROLE_EDEFAULT.equals(targetRole);
			case AbstractsPackage.MRELATIONSHIP__NAVEGABILITY_SOURCE:
				return NAVEGABILITY_SOURCE_EDEFAULT == null ? navegabilitySource != null : !NAVEGABILITY_SOURCE_EDEFAULT.equals(navegabilitySource);
			case AbstractsPackage.MRELATIONSHIP__NAVEGABILITY_TARGET:
				return NAVEGABILITY_TARGET_EDEFAULT == null ? navegabilityTarget != null : !NAVEGABILITY_TARGET_EDEFAULT.equals(navegabilityTarget);
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
		result.append(", navegabilitySource: ");
		result.append(navegabilitySource);
		result.append(", navegabilityTarget: ");
		result.append(navegabilityTarget);
		result.append(')');
		return result.toString();
	}

} //MRelationshipImpl
