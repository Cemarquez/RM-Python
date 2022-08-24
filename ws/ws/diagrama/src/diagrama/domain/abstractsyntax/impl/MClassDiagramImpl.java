/**
 */
package diagrama.domain.abstractsyntax.impl;

import diagrama.domain.abstractsyntax.AbstractSyntax;
import diagrama.domain.abstractsyntax.AbstractsyntaxPackage;
import diagrama.domain.abstractsyntax.MClass;
import diagrama.domain.abstractsyntax.MClassDiagram;
import diagrama.domain.abstractsyntax.MPackage;
import diagrama.domain.abstractsyntax.RelationshipFactory;

import diagrama.domain.concretesyntax.ConcreteSyntax;
import diagrama.domain.concretesyntax.ConcretesyntaxPackage;

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
 * An implementation of the model object '<em><b>MClass Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassDiagramImpl#getOwnedByAbstractSyntax <em>Owned By Abstract Syntax</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassDiagramImpl#getOwnedByConcreteSyntax <em>Owned By Concrete Syntax</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassDiagramImpl#getLstMClass <em>Lst MClass</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassDiagramImpl#getLstMPackage <em>Lst MPackage</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassDiagramImpl#getTheRelationshipFactory <em>The Relationship Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MClassDiagramImpl extends EObjectImpl implements MClassDiagram {
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
	 * The cached value of the '{@link #getLstMPackage() <em>Lst MPackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<MPackage> lstMPackage;

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
	protected MClassDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.MCLASS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSyntax getOwnedByAbstractSyntax() {
		if (eContainerFeatureID() != AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX) return null;
		return (AbstractSyntax)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByAbstractSyntax(AbstractSyntax newOwnedByAbstractSyntax, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByAbstractSyntax, AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByAbstractSyntax(AbstractSyntax newOwnedByAbstractSyntax) {
		if (newOwnedByAbstractSyntax != eInternalContainer() || (eContainerFeatureID() != AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX && newOwnedByAbstractSyntax != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByAbstractSyntax))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByAbstractSyntax != null)
				msgs = ((InternalEObject)newOwnedByAbstractSyntax).eInverseAdd(this, AbstractsyntaxPackage.ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM, AbstractSyntax.class, msgs);
			msgs = basicSetOwnedByAbstractSyntax(newOwnedByAbstractSyntax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX, newOwnedByAbstractSyntax, newOwnedByAbstractSyntax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteSyntax getOwnedByConcreteSyntax() {
		if (eContainerFeatureID() != AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX) return null;
		return (ConcreteSyntax)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByConcreteSyntax(ConcreteSyntax newOwnedByConcreteSyntax, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByConcreteSyntax, AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByConcreteSyntax(ConcreteSyntax newOwnedByConcreteSyntax) {
		if (newOwnedByConcreteSyntax != eInternalContainer() || (eContainerFeatureID() != AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX && newOwnedByConcreteSyntax != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByConcreteSyntax))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByConcreteSyntax != null)
				msgs = ((InternalEObject)newOwnedByConcreteSyntax).eInverseAdd(this, ConcretesyntaxPackage.CONCRETE_SYNTAX__LST_MCLASS_DIAGRAM, ConcreteSyntax.class, msgs);
			msgs = basicSetOwnedByConcreteSyntax(newOwnedByConcreteSyntax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX, newOwnedByConcreteSyntax, newOwnedByConcreteSyntax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MClass> getLstMClass() {
		if (lstMClass == null) {
			lstMClass = new EObjectContainmentWithInverseEList<MClass>(MClass.class, this, AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MCLASS, AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM);
		}
		return lstMClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MPackage> getLstMPackage() {
		if (lstMPackage == null) {
			lstMPackage = new EObjectContainmentWithInverseEList<MPackage>(MPackage.class, this, AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MPACKAGE, AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM);
		}
		return lstMPackage;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY, oldTheRelationshipFactory, newTheRelationshipFactory);
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
				msgs = ((InternalEObject)theRelationshipFactory).eInverseRemove(this, AbstractsyntaxPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM, RelationshipFactory.class, msgs);
			if (newTheRelationshipFactory != null)
				msgs = ((InternalEObject)newTheRelationshipFactory).eInverseAdd(this, AbstractsyntaxPackage.RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM, RelationshipFactory.class, msgs);
			msgs = basicSetTheRelationshipFactory(newTheRelationshipFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY, newTheRelationshipFactory, newTheRelationshipFactory));
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
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByAbstractSyntax((AbstractSyntax)otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByConcreteSyntax((ConcreteSyntax)otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MCLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMClass()).basicAdd(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MPACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMPackage()).basicAdd(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				if (theRelationshipFactory != null)
					msgs = ((InternalEObject)theRelationshipFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY, null, msgs);
				return basicSetTheRelationshipFactory((RelationshipFactory)otherEnd, msgs);
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
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX:
				return basicSetOwnedByAbstractSyntax(null, msgs);
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX:
				return basicSetOwnedByConcreteSyntax(null, msgs);
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MCLASS:
				return ((InternalEList<?>)getLstMClass()).basicRemove(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MPACKAGE:
				return ((InternalEList<?>)getLstMPackage()).basicRemove(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				return basicSetTheRelationshipFactory(null, msgs);
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
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX:
				return eInternalContainer().eInverseRemove(this, AbstractsyntaxPackage.ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM, AbstractSyntax.class, msgs);
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX:
				return eInternalContainer().eInverseRemove(this, ConcretesyntaxPackage.CONCRETE_SYNTAX__LST_MCLASS_DIAGRAM, ConcreteSyntax.class, msgs);
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
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX:
				return getOwnedByAbstractSyntax();
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX:
				return getOwnedByConcreteSyntax();
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MCLASS:
				return getLstMClass();
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MPACKAGE:
				return getLstMPackage();
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				return getTheRelationshipFactory();
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
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX:
				setOwnedByAbstractSyntax((AbstractSyntax)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX:
				setOwnedByConcreteSyntax((ConcreteSyntax)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MCLASS:
				getLstMClass().clear();
				getLstMClass().addAll((Collection<? extends MClass>)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MPACKAGE:
				getLstMPackage().clear();
				getLstMPackage().addAll((Collection<? extends MPackage>)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				setTheRelationshipFactory((RelationshipFactory)newValue);
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
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX:
				setOwnedByAbstractSyntax((AbstractSyntax)null);
				return;
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX:
				setOwnedByConcreteSyntax((ConcreteSyntax)null);
				return;
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MCLASS:
				getLstMClass().clear();
				return;
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MPACKAGE:
				getLstMPackage().clear();
				return;
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				setTheRelationshipFactory((RelationshipFactory)null);
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
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX:
				return getOwnedByAbstractSyntax() != null;
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX:
				return getOwnedByConcreteSyntax() != null;
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MCLASS:
				return lstMClass != null && !lstMClass.isEmpty();
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MPACKAGE:
				return lstMPackage != null && !lstMPackage.isEmpty();
			case AbstractsyntaxPackage.MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY:
				return theRelationshipFactory != null;
		}
		return super.eIsSet(featureID);
	}

} //MClassDiagramImpl
