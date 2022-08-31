/**
 */
package diagrama.domain.impl;

import diagrama.ModelFactory;
import diagrama.diagramaPackage;

import diagrama.domain.Domain;
import diagrama.domain.DomainPackage;

import diagrama.domain.abstractsyntax.AbstractSyntax;
import diagrama.domain.abstractsyntax.AbstractsyntaxPackage;

import diagrama.domain.concretesyntax.ConcreteSyntax;
import diagrama.domain.concretesyntax.ConcretesyntaxPackage;

import diagrama.ui.UI;
import diagrama.ui.UiPackage;

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
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.impl.DomainImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link diagrama.domain.impl.DomainImpl#getLstAbstractSyntax <em>Lst Abstract Syntax</em>}</li>
 *   <li>{@link diagrama.domain.impl.DomainImpl#getLstConcreteSyntax <em>Lst Concrete Syntax</em>}</li>
 *   <li>{@link diagrama.domain.impl.DomainImpl#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends EObjectImpl implements Domain {
	/**
	 * The cached value of the '{@link #getLstAbstractSyntax() <em>Lst Abstract Syntax</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAbstractSyntax()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSyntax> lstAbstractSyntax;

	/**
	 * The cached value of the '{@link #getLstConcreteSyntax() <em>Lst Concrete Syntax</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstConcreteSyntax()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteSyntax> lstConcreteSyntax;

	/**
	 * The cached value of the '{@link #getTheUI() <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUI()
	 * @generated
	 * @ordered
	 */
	protected UI theUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, DomainPackage.DOMAIN__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, diagramaPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSyntax> getLstAbstractSyntax() {
		if (lstAbstractSyntax == null) {
			lstAbstractSyntax = new EObjectContainmentWithInverseEList<AbstractSyntax>(AbstractSyntax.class, this, DomainPackage.DOMAIN__LST_ABSTRACT_SYNTAX, AbstractsyntaxPackage.ABSTRACT_SYNTAX__OWNED_BY_DOMAIN);
		}
		return lstAbstractSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteSyntax> getLstConcreteSyntax() {
		if (lstConcreteSyntax == null) {
			lstConcreteSyntax = new EObjectContainmentWithInverseEList<ConcreteSyntax>(ConcreteSyntax.class, this, DomainPackage.DOMAIN__LST_CONCRETE_SYNTAX, ConcretesyntaxPackage.CONCRETE_SYNTAX__OWNED_BY_DOMAIN);
		}
		return lstConcreteSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getTheUI() {
		if (theUI != null && theUI.eIsProxy()) {
			InternalEObject oldTheUI = (InternalEObject)theUI;
			theUI = (UI)eResolveProxy(oldTheUI);
			if (theUI != oldTheUI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN__THE_UI, oldTheUI, theUI));
			}
		}
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI basicGetTheUI() {
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUI(UI newTheUI, NotificationChain msgs) {
		UI oldTheUI = theUI;
		theUI = newTheUI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI, oldTheUI, newTheUI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUI(UI newTheUI) {
		if (newTheUI != theUI) {
			NotificationChain msgs = null;
			if (theUI != null)
				msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
			if (newTheUI != null)
				msgs = ((InternalEObject)newTheUI).eInverseAdd(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
			msgs = basicSetTheUI(newTheUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI, newTheUI, newTheUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		//TODO implementarModelo
		
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case DomainPackage.DOMAIN__LST_ABSTRACT_SYNTAX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstAbstractSyntax()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__LST_CONCRETE_SYNTAX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstConcreteSyntax()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_UI:
				if (theUI != null)
					msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
				return basicSetTheUI((UI)otherEnd, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case DomainPackage.DOMAIN__LST_ABSTRACT_SYNTAX:
				return ((InternalEList<?>)getLstAbstractSyntax()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__LST_CONCRETE_SYNTAX:
				return ((InternalEList<?>)getLstConcreteSyntax()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_UI:
				return basicSetTheUI(null, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, diagramaPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case DomainPackage.DOMAIN__LST_ABSTRACT_SYNTAX:
				return getLstAbstractSyntax();
			case DomainPackage.DOMAIN__LST_CONCRETE_SYNTAX:
				return getLstConcreteSyntax();
			case DomainPackage.DOMAIN__THE_UI:
				if (resolve) return getTheUI();
				return basicGetTheUI();
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case DomainPackage.DOMAIN__LST_ABSTRACT_SYNTAX:
				getLstAbstractSyntax().clear();
				getLstAbstractSyntax().addAll((Collection<? extends AbstractSyntax>)newValue);
				return;
			case DomainPackage.DOMAIN__LST_CONCRETE_SYNTAX:
				getLstConcreteSyntax().clear();
				getLstConcreteSyntax().addAll((Collection<? extends ConcreteSyntax>)newValue);
				return;
			case DomainPackage.DOMAIN__THE_UI:
				setTheUI((UI)newValue);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case DomainPackage.DOMAIN__LST_ABSTRACT_SYNTAX:
				getLstAbstractSyntax().clear();
				return;
			case DomainPackage.DOMAIN__LST_CONCRETE_SYNTAX:
				getLstConcreteSyntax().clear();
				return;
			case DomainPackage.DOMAIN__THE_UI:
				setTheUI((UI)null);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case DomainPackage.DOMAIN__LST_ABSTRACT_SYNTAX:
				return lstAbstractSyntax != null && !lstAbstractSyntax.isEmpty();
			case DomainPackage.DOMAIN__LST_CONCRETE_SYNTAX:
				return lstConcreteSyntax != null && !lstConcreteSyntax.isEmpty();
			case DomainPackage.DOMAIN__THE_UI:
				return theUI != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
