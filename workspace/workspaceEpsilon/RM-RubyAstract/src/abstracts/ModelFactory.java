/**
 */
package abstracts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracts.ModelFactory#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracts.ModelFactory#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracts.ModelFactory#getLstPackages <em>Lst Packages</em>}</li>
 * </ul>
 *
 * @see abstracts.AbstractsPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see abstracts.AbstractsPackage#getModelFactory_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracts.ModelFactory#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta</em>' attribute.
	 * @see #setRuta(String)
	 * @see abstracts.AbstractsPackage#getModelFactory_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link abstracts.ModelFactory#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Lst Packages</b></em>' containment reference list.
	 * The list contents are of type {@link abstracts.MPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Packages</em>' containment reference list.
	 * @see abstracts.AbstractsPackage#getModelFactory_LstPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<MPackage> getLstPackages();

} // ModelFactory
