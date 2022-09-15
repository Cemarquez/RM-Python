/**
 */
package abstracts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracts.MFunction#getName <em>Name</em>}</li>
 *   <li>{@link abstracts.MFunction#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link abstracts.MFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link abstracts.MFunction#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link abstracts.MFunction#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see abstracts.AbstractsPackage#getMFunction()
 * @model
 * @generated
 */
public interface MFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstracts.AbstractsPackage#getMFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracts.MFunction#getName <em>Name</em>}' attribute.
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
	 * @see abstracts.AbstractsPackage#getMFunction_AccessModifier()
	 * @model
	 * @generated
	 */
	String getAccessModifier();

	/**
	 * Sets the value of the '{@link abstracts.MFunction#getAccessModifier <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifier</em>' attribute.
	 * @see #getAccessModifier()
	 * @generated
	 */
	void setAccessModifier(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see abstracts.AbstractsPackage#getMFunction_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link abstracts.MFunction#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantics</em>' attribute.
	 * @see #setSemantics(String)
	 * @see abstracts.AbstractsPackage#getMFunction_Semantics()
	 * @model
	 * @generated
	 */
	String getSemantics();

	/**
	 * Sets the value of the '{@link abstracts.MFunction#getSemantics <em>Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantics</em>' attribute.
	 * @see #getSemantics()
	 * @generated
	 */
	void setSemantics(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see abstracts.AbstractsPackage#getMFunction_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link abstracts.MFunction#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

} // MFunction
