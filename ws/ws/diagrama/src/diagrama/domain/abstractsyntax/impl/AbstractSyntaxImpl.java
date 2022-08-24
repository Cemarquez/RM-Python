/**
 */
package diagrama.domain.abstractsyntax.impl;

import diagrama.domain.Domain;
import diagrama.domain.DomainPackage;

import diagrama.domain.abstractsyntax.AbstractSyntax;
import diagrama.domain.abstractsyntax.AbstractsyntaxPackage;
import diagrama.domain.abstractsyntax.MClassDiagram;

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
 * An implementation of the model object '<em><b>Abstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.AbstractSyntaxImpl#getLstMClassDiagram <em>Lst MClass Diagram</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.AbstractSyntaxImpl#getOwnedByDomain <em>Owned By Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractSyntaxImpl extends EObjectImpl implements AbstractSyntax {
	/**
	 * The cached value of the '{@link #getLstMClassDiagram() <em>Lst MClass Diagram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMClassDiagram()
	 * @generated
	 * @ordered
	 */
	protected EList<MClassDiagram> lstMClassDiagram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSyntaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.ABSTRACT_SYNTAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MClassDiagram> getLstMClassDiagram() {
		if (lstMClassDiagram == null) {
			lstMClassDiagram = new EObjectContainmentWithInverseEList<MClassDiagram>(MClassDiagram.class, this, AbstractsyntaxPackage.ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM, AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX);
		}
		return lstMClassDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwnedByDomain() {
		if (eContainerFeatureID() != AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByDomain(Domain newOwnedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByDomain, AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByDomain(Domain newOwnedByDomain) {
		if (newOwnedByDomain != eInternalContainer() || (eContainerFeatureID() != AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN && newOwnedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByDomain != null)
				msgs = ((InternalEObject)newOwnedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LST_ABSTRACT_SYNTAX, Domain.class, msgs);
			msgs = basicSetOwnedByDomain(newOwnedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN, newOwnedByDomain, newOwnedByDomain));
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
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMClassDiagram()).basicAdd(otherEnd, msgs);
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN:
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
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM:
				return ((InternalEList<?>)getLstMClassDiagram()).basicRemove(otherEnd, msgs);
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN:
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
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LST_ABSTRACT_SYNTAX, Domain.class, msgs);
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
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM:
				return getLstMClassDiagram();
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN:
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
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM:
				getLstMClassDiagram().clear();
				getLstMClassDiagram().addAll((Collection<? extends MClassDiagram>)newValue);
				return;
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN:
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
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM:
				getLstMClassDiagram().clear();
				return;
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN:
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
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM:
				return lstMClassDiagram != null && !lstMClassDiagram.isEmpty();
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN:
				return getOwnedByDomain() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractSyntaxImpl
