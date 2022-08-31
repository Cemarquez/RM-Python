/**
 */
package abstracts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracts.MClass#getName <em>Name</em>}</li>
 *   <li>{@link abstracts.MClass#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link abstracts.MClass#getComments <em>Comments</em>}</li>
 *   <li>{@link abstracts.MClass#isAbstracts <em>Abstracts</em>}</li>
 *   <li>{@link abstracts.MClass#getStereoType <em>Stereo Type</em>}</li>
 *   <li>{@link abstracts.MClass#getPath <em>Path</em>}</li>
 *   <li>{@link abstracts.MClass#getLtsMRelationships <em>Lts MRelationships</em>}</li>
 * </ul>
 *
 * @see abstracts.AbstractsPackage#getMClass()
 * @model
 * @generated
 */
public interface MClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstracts.AbstractsPackage#getMClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracts.MClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Modifier</em>' attribute.
	 * @see #setAccessModifier(String)
	 * @see abstracts.AbstractsPackage#getMClass_AccessModifier()
	 * @model
	 * @generated
	 */
	String getAccessModifier();

	/**
	 * Sets the value of the '{@link abstracts.MClass#getAccessModifier <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifier</em>' attribute.
	 * @see #getAccessModifier()
	 * @generated
	 */
	void setAccessModifier(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see abstracts.AbstractsPackage#getMClass_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link abstracts.MClass#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Abstracts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstracts</em>' attribute.
	 * @see #setAbstracts(boolean)
	 * @see abstracts.AbstractsPackage#getMClass_Abstracts()
	 * @model
	 * @generated
	 */
	boolean isAbstracts();

	/**
	 * Sets the value of the '{@link abstracts.MClass#isAbstracts <em>Abstracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstracts</em>' attribute.
	 * @see #isAbstracts()
	 * @generated
	 */
	void setAbstracts(boolean value);

	/**
	 * Returns the value of the '<em><b>Stereo Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereo Type</em>' attribute.
	 * @see #setStereoType(String)
	 * @see abstracts.AbstractsPackage#getMClass_StereoType()
	 * @model
	 * @generated
	 */
	String getStereoType();

	/**
	 * Sets the value of the '{@link abstracts.MClass#getStereoType <em>Stereo Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereo Type</em>' attribute.
	 * @see #getStereoType()
	 * @generated
	 */
	void setStereoType(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see abstracts.AbstractsPackage#getMClass_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstracts.MClass#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Lts MRelationships</b></em>' containment reference list.
	 * The list contents are of type {@link abstracts.MRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lts MRelationships</em>' containment reference list.
	 * @see abstracts.AbstractsPackage#getMClass_LtsMRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<MRelationship> getLtsMRelationships();

} // MClass
