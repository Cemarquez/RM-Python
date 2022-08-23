/**
 */
package diagrama.domain.impl;

import diagrama.domain.ClassDiagram;
import diagrama.domain.DomainPackage;
import diagrama.domain.MRelationship;
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
 * An implementation of the model object '<em><b>Relationship Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.impl.RelationshipFactoryImpl#getLstMRelationship <em>Lst MRelationship</em>}</li>
 *   <li>{@link diagrama.domain.impl.RelationshipFactoryImpl#getLstClassDiagram <em>Lst Class Diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipFactoryImpl extends EObjectImpl implements RelationshipFactory {
	/**
	 * The cached value of the '{@link #getLstMRelationship() <em>Lst MRelationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<MRelationship> lstMRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.RELATIONSHIP_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MRelationship> getLstMRelationship() {
		if (lstMRelationship == null) {
			lstMRelationship = new EObjectContainmentWithInverseEList<MRelationship>(MRelationship.class, this, DomainPackage.RELATIONSHIP_FACTORY__LST_MRELATIONSHIP, DomainPackage.MRELATIONSHIP__LST_RELATIONSHIP_FACTORY);
		}
		return lstMRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagram getLstClassDiagram() {
		if (eContainerFeatureID() != DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM) return null;
		return (ClassDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstClassDiagram(ClassDiagram newLstClassDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLstClassDiagram, DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstClassDiagram(ClassDiagram newLstClassDiagram) {
		if (newLstClassDiagram != eInternalContainer() || (eContainerFeatureID() != DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM && newLstClassDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newLstClassDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLstClassDiagram != null)
				msgs = ((InternalEObject)newLstClassDiagram).eInverseAdd(this, DomainPackage.CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY, ClassDiagram.class, msgs);
			msgs = basicSetLstClassDiagram(newLstClassDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM, newLstClassDiagram, newLstClassDiagram));
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
			case DomainPackage.RELATIONSHIP_FACTORY__LST_MRELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMRelationship()).basicAdd(otherEnd, msgs);
			case DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLstClassDiagram((ClassDiagram)otherEnd, msgs);
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
			case DomainPackage.RELATIONSHIP_FACTORY__LST_MRELATIONSHIP:
				return ((InternalEList<?>)getLstMRelationship()).basicRemove(otherEnd, msgs);
			case DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM:
				return basicSetLstClassDiagram(null, msgs);
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
			case DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, DomainPackage.CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY, ClassDiagram.class, msgs);
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
			case DomainPackage.RELATIONSHIP_FACTORY__LST_MRELATIONSHIP:
				return getLstMRelationship();
			case DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM:
				return getLstClassDiagram();
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
			case DomainPackage.RELATIONSHIP_FACTORY__LST_MRELATIONSHIP:
				getLstMRelationship().clear();
				getLstMRelationship().addAll((Collection<? extends MRelationship>)newValue);
				return;
			case DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM:
				setLstClassDiagram((ClassDiagram)newValue);
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
			case DomainPackage.RELATIONSHIP_FACTORY__LST_MRELATIONSHIP:
				getLstMRelationship().clear();
				return;
			case DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM:
				setLstClassDiagram((ClassDiagram)null);
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
			case DomainPackage.RELATIONSHIP_FACTORY__LST_MRELATIONSHIP:
				return lstMRelationship != null && !lstMRelationship.isEmpty();
			case DomainPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM:
				return getLstClassDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipFactoryImpl
