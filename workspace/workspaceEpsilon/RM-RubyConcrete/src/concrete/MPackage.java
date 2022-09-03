/**
 */
package concrete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concrete.MPackage#getName <em>Name</em>}</li>
 *   <li>{@link concrete.MPackage#getPath <em>Path</em>}</li>
 *   <li>{@link concrete.MPackage#getLstMClass <em>Lst MClass</em>}</li>
 *   <li>{@link concrete.MPackage#getLstMPackage <em>Lst MPackage</em>}</li>
 * </ul>
 *
 * @see concrete.ConcretePackage#getMPackage()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface MPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see concrete.ConcretePackage#getMPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concrete.MPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see concrete.ConcretePackage#getMPackage_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link concrete.MPackage#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Lst MClass</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.MClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MClass</em>' containment reference list.
	 * @see concrete.ConcretePackage#getMPackage_LstMClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<MClass> getLstMClass();

	/**
	 * Returns the value of the '<em><b>Lst MPackage</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.MPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MPackage</em>' containment reference list.
	 * @see concrete.ConcretePackage#getMPackage_LstMPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<MPackage> getLstMPackage();

} // MPackage
