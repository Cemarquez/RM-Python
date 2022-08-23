/**
 */
package diagrama.domain.impl;

import diagrama.domain.ClassDiagram;
import diagrama.domain.Domain;
import diagrama.domain.DomainPackage;
import diagrama.domain.MClass;
import diagrama.domain.RelationshipFactory;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.impl.ClassDiagramImpl#getLstMClass <em>Lst MClass</em>}</li>
 *   <li>{@link diagrama.domain.impl.ClassDiagramImpl#getTheRelationshipFactory <em>The Relationship Factory</em>}</li>
 *   <li>{@link diagrama.domain.impl.ClassDiagramImpl#getOwnedByDomain <em>Owned By Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDiagramImpl extends EObjectImpl implements ClassDiagram {
	/**
	 * The cached value of the '{@link #getLstMClass() <em>Lst MClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMClass()
	 * @generated
	 * @ordered
	 */
	protected EList<MClass> lstMClass;

	/**
	 * The cached value of the '{@link #getTheRelationshipFactory() <em>The Relationship Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheRelationshipFactory()
	 * @generated
	 * @ordered
	 */
	protected RelationshipFactory theRelationshipFactory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CLASS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MClass> getLstMClass() {
		if (lstMClass == null) {
			lstMClass = new EObjectContainmentWithInverseEList<MClass>(MClass.class, this, DomainPackage.CLASS_DIAGRAM__LST_MCLASS, DomainPackage.MCLASS__LST_CLASS_DIAGRAM);
		}
		return lstMClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipFactory getTheRelationshipFactory() {
		return theRelationshipFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheRelationshipFactory(RelationshipFactory newTheRelationshipFactory, NotificationChain msgs) {
		RelationshipFactory oldTheRelationshipFactory = theRelationshipFactory;
		theRelationshipFactory = newTheRelationshipFactory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY, oldTheRelationshipFactory, newTheRelationshipFactory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheRelationshipFactory(RelationshipFactory newTheRelationshipFactory) {
		if (newTheRelationshipFactory != theRelationshipFactory) {
			NotificationChain msgs = null;
			if (theRelationshipFactory != null)
				msgs = ((InternalEObject)theRelationshipFactory).eInverseRemove(this, DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM, RelationshipFactory.class, msgs);
			if (newTheRelationshipFactory != null)
				msgs = ((InternalEObject)newTheRelationshipFactory).eInverseAdd(this, DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM, RelationshipFactory.class, msgs);
			msgs = basicSetTheRelationshipFactory(newTheRelationshipFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY, newTheRelationshipFactory, newTheRelationshipFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwnedByDomain() {
		if (eContainerFeatureID() != DomainPackage.CLASS_DIAGRAM__OWNED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByDomain(Domain newOwnedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByDomain, DomainPackage.CLASS_DIAGRAM__OWNED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByDomain(Domain newOwnedByDomain) {
		if (newOwnedByDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.CLASS_DIAGRAM__OWNED_BY_DOMAIN && newOwnedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByDomain != null)
				msgs = ((InternalEObject)newOwnedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LST_CLASS_DIAGRAM, Domain.class, msgs);
			msgs = basicSetOwnedByDomain(newOwnedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CLASS_DIAGRAM__OWNED_BY_DOMAIN, newOwnedByDomain, newOwnedByDomain));
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
			case DomainPackage.CLASS_DIAGRAM__LST_MCLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMClass()).basicAdd(otherEnd, msgs);
			case DomainPackage.CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				if (theRelationshipFactory != null)
					msgs = ((InternalEObject)theRelationshipFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY, null, msgs);
				return basicSetTheRelationshipFactory((RelationshipFactory)otherEnd, msgs);
			case DomainPackage.CLASS_DIAGRAM__OWNED_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByDomain((Domain)otherEnd, msgs);
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
			case DomainPackage.CLASS_DIAGRAM__LST_MCLASS:
				return ((InternalEList<?>)getLstMClass()).basicRemove(otherEnd, msgs);
			case DomainPackage.CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				return basicSetTheRelationshipFactory(null, msgs);
			case DomainPackage.CLASS_DIAGRAM__OWNED_BY_DOMAIN:
				return basicSetOwnedByDomain(null, msgs);
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
			case DomainPackage.CLASS_DIAGRAM__OWNED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LST_CLASS_DIAGRAM, Domain.class, msgs);
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
			case DomainPackage.CLASS_DIAGRAM__LST_MCLASS:
				return getLstMClass();
			case DomainPackage.CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				return getTheRelationshipFactory();
			case DomainPackage.CLASS_DIAGRAM__OWNED_BY_DOMAIN:
				return getOwnedByDomain();
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
			case DomainPackage.CLASS_DIAGRAM__LST_MCLASS:
				getLstMClass().clear();
				getLstMClass().addAll((Collection<? extends MClass>)newValue);
				return;
			case DomainPackage.CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				setTheRelationshipFactory((RelationshipFactory)newValue);
				return;
			case DomainPackage.CLASS_DIAGRAM__OWNED_BY_DOMAIN:
				setOwnedByDomain((Domain)newValue);
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
			case DomainPackage.CLASS_DIAGRAM__LST_MCLASS:
				getLstMClass().clear();
				return;
			case DomainPackage.CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				setTheRelationshipFactory((RelationshipFactory)null);
				return;
			case DomainPackage.CLASS_DIAGRAM__OWNED_BY_DOMAIN:
				setOwnedByDomain((Domain)null);
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
			case DomainPackage.CLASS_DIAGRAM__LST_MCLASS:
				return lstMClass != null && !lstMClass.isEmpty();
			case DomainPackage.CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				return theRelationshipFactory != null;
			case DomainPackage.CLASS_DIAGRAM__OWNED_BY_DOMAIN:
				return getOwnedByDomain() != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassDiagramImpl
