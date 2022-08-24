/**
 */
package diagrama.domain.abstractsyntax.impl;

import diagrama.domain.abstractsyntax.AbstractsyntaxPackage;
import diagrama.domain.abstractsyntax.MClass;
import diagrama.domain.abstractsyntax.MClassDiagram;
import diagrama.domain.abstractsyntax.MPackage;

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
 * An implementation of the model object '<em><b>MPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MPackageImpl#getLstMClass <em>Lst MClass</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MPackageImpl#getPath <em>Path</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.impl.MPackageImpl#getOwnedByMClassDiagram <em>Owned By MClass Diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPackageImpl extends EObjectImpl implements MPackage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.MPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MClass> getLstMClass() {
		if (lstMClass == null) {
			lstMClass = new EObjectContainmentWithInverseEList<MClass>(MClass.class, this, AbstractsyntaxPackage.MPACKAGE__LST_MCLASS, AbstractsyntaxPackage.MCLASS__OWNED_BY_MPACKAGE);
		}
		return lstMClass;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MPACKAGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MPACKAGE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClassDiagram getOwnedByMClassDiagram() {
		if (eContainerFeatureID() != AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM) return null;
		return (MClassDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByMClassDiagram(MClassDiagram newOwnedByMClassDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByMClassDiagram, AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByMClassDiagram(MClassDiagram newOwnedByMClassDiagram) {
		if (newOwnedByMClassDiagram != eInternalContainer() || (eContainerFeatureID() != AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM && newOwnedByMClassDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByMClassDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByMClassDiagram != null)
				msgs = ((InternalEObject)newOwnedByMClassDiagram).eInverseAdd(this, AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MPACKAGE, MClassDiagram.class, msgs);
			msgs = basicSetOwnedByMClassDiagram(newOwnedByMClassDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM, newOwnedByMClassDiagram, newOwnedByMClassDiagram));
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
			case AbstractsyntaxPackage.MPACKAGE__LST_MCLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstMClass()).basicAdd(otherEnd, msgs);
			case AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByMClassDiagram((MClassDiagram)otherEnd, msgs);
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
			case AbstractsyntaxPackage.MPACKAGE__LST_MCLASS:
				return ((InternalEList<?>)getLstMClass()).basicRemove(otherEnd, msgs);
			case AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM:
				return basicSetOwnedByMClassDiagram(null, msgs);
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
			case AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, AbstractsyntaxPackage.MCLASS_DIAGRAM__LST_MPACKAGE, MClassDiagram.class, msgs);
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
			case AbstractsyntaxPackage.MPACKAGE__LST_MCLASS:
				return getLstMClass();
			case AbstractsyntaxPackage.MPACKAGE__NAME:
				return getName();
			case AbstractsyntaxPackage.MPACKAGE__PATH:
				return getPath();
			case AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM:
				return getOwnedByMClassDiagram();
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
			case AbstractsyntaxPackage.MPACKAGE__LST_MCLASS:
				getLstMClass().clear();
				getLstMClass().addAll((Collection<? extends MClass>)newValue);
				return;
			case AbstractsyntaxPackage.MPACKAGE__NAME:
				setName((String)newValue);
				return;
			case AbstractsyntaxPackage.MPACKAGE__PATH:
				setPath((String)newValue);
				return;
			case AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM:
				setOwnedByMClassDiagram((MClassDiagram)newValue);
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
			case AbstractsyntaxPackage.MPACKAGE__LST_MCLASS:
				getLstMClass().clear();
				return;
			case AbstractsyntaxPackage.MPACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MPACKAGE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM:
				setOwnedByMClassDiagram((MClassDiagram)null);
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
			case AbstractsyntaxPackage.MPACKAGE__LST_MCLASS:
				return lstMClass != null && !lstMClass.isEmpty();
			case AbstractsyntaxPackage.MPACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractsyntaxPackage.MPACKAGE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractsyntaxPackage.MPACKAGE__OWNED_BY_MCLASS_DIAGRAM:
				return getOwnedByMClassDiagram() != null;
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
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //MPackageImpl
