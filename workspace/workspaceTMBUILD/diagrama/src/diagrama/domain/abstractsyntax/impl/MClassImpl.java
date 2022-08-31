/**
 */
package diagrama.domain.abstractsyntax.impl;

import diagrama.domain.abstractsyntax.AbstractsyntaxPackage;
import diagrama.domain.abstractsyntax.MAttribute;
import diagrama.domain.abstractsyntax.MClass;
import diagrama.domain.abstractsyntax.MClassDiagram;
import diagrama.domain.abstractsyntax.MFunction;
import diagrama.domain.abstractsyntax.MPackage;
import diagrama.domain.abstractsyntax.MRelationship;

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
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getPath <em>Path</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getOwnedByClassDiagram <em>Owned By Class Diagram</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getLstMAttributes <em>Lst MAttributes</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getLstMRelationshipSource <em>Lst MRelationship Source</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getLstMRelationshipTarget <em>Lst MRelationship Target</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getOwnedByMPackage <em>Owned By MPackage</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getLstMRelationship <em>Lst MRelationship</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MClassImpl#getLstMFunction <em>Lst MFunction</em>}</li>
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
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected String abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final String STEREOTYPE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected String stereotype = STEREOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = " ";

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
	 * The cached value of the '{@link #getLstMAttributes() <em>Lst MAttributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MAttribute> lstMAttributes;

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
	 * The cached value of the '{@link #getLstMRelationship() <em>Lst MRelationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<MRelationship> lstMRelationship;

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
		return AbstractsyntaxPackage.Literals.MCLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS__ACCESS_MODIFIER, oldAccessModifier, accessModifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(String newAbstract) {
		String oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		String oldStereotype = stereotype;
		stereotype = newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClassDiagram getOwnedByClassDiagram() {
		if (eContainerFeatureID() != AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM) return null;
		return (MClassDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByClassDiagram(MClassDiagram newOwnedByClassDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByClassDiagram, AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByClassDiagram(MClassDiagram newOwnedByClassDiagram) {
		if (newOwnedByClassDiagram != eInternalContainer() || (eContainerFeatureID() != AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM && newOwnedByClassDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByClassDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByClassDiagram != null)
				msgs = ((InternalEObject)newOwnedByClassDiagram).eInverseAdd(this, AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MCLASS, MClassDiagram.class, msgs);
			msgs = basicSetOwnedByClassDiagram(newOwnedByClassDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM, newOwnedByClassDiagram, newOwnedByClassDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MAttribute> getLstMAttributes() {
		if (lstMAttributes == null) {
			lstMAttributes = new EObjectContainmentWithInverseEList<MAttribute>(MAttribute.class, this, AbstractsyntaxPackage.MCLASS__LST_MATTRIBUTES, AbstractsyntaxPackage.MATTRIBUTE__OWNED_BY_MCLASS);
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
			lstMRelationshipSource = new EObjectWithInverseResolvingEList<MRelationship>(MRelationship.class, this, AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_SOURCE, AbstractsyntaxPackage.MRELATIONSHIP__SOURCE);
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
			lstMRelationshipTarget = new EObjectWithInverseResolvingEList<MRelationship>(MRelationship.class, this, AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_TARGET, AbstractsyntaxPackage.MRELATIONSHIP__TARGET);
		}
		return lstMRelationshipTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPackage getOwnedByMPackage() {
		if (eContainerFeatureID() != AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE) return null;
		return (MPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByMPackage(MPackage newOwnedByMPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByMPackage, AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByMPackage(MPackage newOwnedByMPackage) {
		if (newOwnedByMPackage != eInternalContainer() || (eContainerFeatureID() != AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE && newOwnedByMPackage != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByMPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByMPackage != null)
				msgs = ((InternalEObject)newOwnedByMPackage).eInverseAdd(this, AbstractsyntaxPackage.MPACKAGE__LST_MCLASS, MPackage.class, msgs);
			msgs = basicSetOwnedByMPackage(newOwnedByMPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE, newOwnedByMPackage, newOwnedByMPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MRelationship> getLstMRelationship() {
		if (lstMRelationship == null) {
			lstMRelationship = new EObjectContainmentWithInverseEList<MRelationship>(MRelationship.class, this, AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP, AbstractsyntaxPackage.MRELATIONSHIP__OWNED_BY_MCLASS);
		}
		return lstMRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFunction> getLstMFunction() {
		if (lstMFunction == null) {
			lstMFunction = new EObjectContainmentWithInverseEList<MFunction>(MFunction.class, this, AbstractsyntaxPackage.MCLASS__LST_MFUNCTION, AbstractsyntaxPackage.MFUNCTION__OWNED_BY_MCLASS);
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
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByClassDiagram((MClassDiagram)otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS__LST_MATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMAttributes()).basicAdd(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMRelationshipSource()).basicAdd(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMRelationshipTarget()).basicAdd(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByMPackage((MPackage)otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMRelationship()).basicAdd(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS__LST_MFUNCTION:
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
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM:
				return basicSetOwnedByClassDiagram(null, msgs);
			case AbstractsyntaxPackage.MCLASS__LST_MATTRIBUTES:
				return ((InternalEList<?>)getLstMAttributes()).basicRemove(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				return ((InternalEList<?>)getLstMRelationshipSource()).basicRemove(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				return ((InternalEList<?>)getLstMRelationshipTarget()).basicRemove(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE:
				return basicSetOwnedByMPackage(null, msgs);
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP:
				return ((InternalEList<?>)getLstMRelationship()).basicRemove(otherEnd, msgs);
			case AbstractsyntaxPackage.MCLASS__LST_MFUNCTION:
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
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MCLASS, MClassDiagram.class, msgs);
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE:
				return eInternalContainer().eInverseRemove(this, AbstractsyntaxPackage.MPACKAGE__LST_MCLASS, MPackage.class, msgs);
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
			case AbstractsyntaxPackage.MCLASS__NAME:
				return getName();
			case AbstractsyntaxPackage.MCLASS__ACCESS_MODIFIER:
				return getAccessModifier();
			case AbstractsyntaxPackage.MCLASS__COMMENTS:
				return getComments();
			case AbstractsyntaxPackage.MCLASS__ABSTRACT:
				return getAbstract();
			case AbstractsyntaxPackage.MCLASS__STEREOTYPE:
				return getStereotype();
			case AbstractsyntaxPackage.MCLASS__PATH:
				return getPath();
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM:
				return getOwnedByClassDiagram();
			case AbstractsyntaxPackage.MCLASS__LST_MATTRIBUTES:
				return getLstMAttributes();
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				return getLstMRelationshipSource();
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				return getLstMRelationshipTarget();
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE:
				return getOwnedByMPackage();
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP:
				return getLstMRelationship();
			case AbstractsyntaxPackage.MCLASS__LST_MFUNCTION:
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
			case AbstractsyntaxPackage.MCLASS__NAME:
				setName((String)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__ACCESS_MODIFIER:
				setAccessModifier((String)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__COMMENTS:
				setComments((String)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__PATH:
				setPath((String)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM:
				setOwnedByClassDiagram((MClassDiagram)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__LST_MATTRIBUTES:
				getLstMAttributes().clear();
				getLstMAttributes().addAll((Collection<? extends MAttribute>)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				getLstMRelationshipSource().clear();
				getLstMRelationshipSource().addAll((Collection<? extends MRelationship>)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				getLstMRelationshipTarget().clear();
				getLstMRelationshipTarget().addAll((Collection<? extends MRelationship>)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE:
				setOwnedByMPackage((MPackage)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP:
				getLstMRelationship().clear();
				getLstMRelationship().addAll((Collection<? extends MRelationship>)newValue);
				return;
			case AbstractsyntaxPackage.MCLASS__LST_MFUNCTION:
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
			case AbstractsyntaxPackage.MCLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MCLASS__ACCESS_MODIFIER:
				setAccessModifier(ACCESS_MODIFIER_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MCLASS__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MCLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MCLASS__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MCLASS__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM:
				setOwnedByClassDiagram((MClassDiagram)null);
				return;
			case AbstractsyntaxPackage.MCLASS__LST_MATTRIBUTES:
				getLstMAttributes().clear();
				return;
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				getLstMRelationshipSource().clear();
				return;
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				getLstMRelationshipTarget().clear();
				return;
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE:
				setOwnedByMPackage((MPackage)null);
				return;
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP:
				getLstMRelationship().clear();
				return;
			case AbstractsyntaxPackage.MCLASS__LST_MFUNCTION:
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
			case AbstractsyntaxPackage.MCLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractsyntaxPackage.MCLASS__ACCESS_MODIFIER:
				return ACCESS_MODIFIER_EDEFAULT == null ? accessModifier != null : !ACCESS_MODIFIER_EDEFAULT.equals(accessModifier);
			case AbstractsyntaxPackage.MCLASS__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case AbstractsyntaxPackage.MCLASS__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case AbstractsyntaxPackage.MCLASS__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case AbstractsyntaxPackage.MCLASS__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_CLASS_DIAGRAM:
				return getOwnedByClassDiagram() != null;
			case AbstractsyntaxPackage.MCLASS__LST_MATTRIBUTES:
				return lstMAttributes != null && !lstMAttributes.isEmpty();
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_SOURCE:
				return lstMRelationshipSource != null && !lstMRelationshipSource.isEmpty();
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP_TARGET:
				return lstMRelationshipTarget != null && !lstMRelationshipTarget.isEmpty();
			case AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE:
				return getOwnedByMPackage() != null;
			case AbstractsyntaxPackage.MCLASS__LST_MRELATIONSHIP:
				return lstMRelationship != null && !lstMRelationship.isEmpty();
			case AbstractsyntaxPackage.MCLASS__LST_MFUNCTION:
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
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", stereotype: ");
		result.append(stereotype);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //MClassImpl
