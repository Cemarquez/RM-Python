/**
 */
package diagrama.domain;

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
 *   <li>{@link diagrama.domain.MFunction#getName <em>Name</em>}</li>
 *   <li>{@link diagrama.domain.MFunction#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link diagrama.domain.MFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link diagrama.domain.MFunction#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link diagrama.domain.MFunction#getComments <em>Comments</em>}</li>
 *   <li>{@link diagrama.domain.MFunction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link diagrama.domain.MFunction#getOwnedByMClass <em>Owned By MClass</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.DomainPackage#getMFunction()
 * @model
 * @generated
 */
public interface MFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see diagrama.domain.DomainPackage#getMFunction_Name()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link diagrama.domain.MFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Access Modifier</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Modifier</em>' attribute.
	 * @see #setAccessModifier(String)
	 * @see diagrama.domain.DomainPackage#getMFunction_AccessModifier()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getAccessModifier();

	/**
	 * Sets the value of the '{@link diagrama.domain.MFunction#getAccessModifier <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifier</em>' attribute.
	 * @see #getAccessModifier()
	 * @generated
	 */
	void setAccessModifier(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see diagrama.domain.DomainPackage#getMFunction_ReturnType()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link diagrama.domain.MFunction#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Semantics</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantics</em>' attribute.
	 * @see #setSemantics(String)
	 * @see diagrama.domain.DomainPackage#getMFunction_Semantics()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getSemantics();

	/**
	 * Sets the value of the '{@link diagrama.domain.MFunction#getSemantics <em>Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantics</em>' attribute.
	 * @see #getSemantics()
	 * @generated
	 */
	void setSemantics(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see diagrama.domain.DomainPackage#getMFunction_Comments()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link diagrama.domain.MFunction#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see diagrama.domain.DomainPackage#getMFunction_Parameters()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link diagrama.domain.MFunction#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Owned By MClass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.MClass#getLstMFunction <em>Lst MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By MClass</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By MClass</em>' container reference.
	 * @see #setOwnedByMClass(MClass)
	 * @see diagrama.domain.DomainPackage#getMFunction_OwnedByMClass()
	 * @see diagrama.domain.MClass#getLstMFunction
	 * @model opposite="lstMFunction" transient="false"
	 * @generated
	 */
	MClass getOwnedByMClass();

	/**
	 * Sets the value of the '{@link diagrama.domain.MFunction#getOwnedByMClass <em>Owned By MClass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By MClass</em>' container reference.
	 * @see #getOwnedByMClass()
	 * @generated
	 */
	void setOwnedByMClass(MClass value);

} // MFunction
