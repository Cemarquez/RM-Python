/**
 */
package diagrama.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAttributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.MAttributes#getName <em>Name</em>}</li>
 *   <li>{@link diagrama.domain.MAttributes#getDataType <em>Data Type</em>}</li>
 *   <li>{@link diagrama.domain.MAttributes#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link diagrama.domain.MAttributes#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link diagrama.domain.MAttributes#getComments <em>Comments</em>}</li>
 *   <li>{@link diagrama.domain.MAttributes#getOwnedByMClass <em>Owned By MClass</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.DomainPackage#getMAttributes()
 * @model
 * @generated
 */
public interface MAttributes extends EObject {
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
	 * @see diagrama.domain.DomainPackage#getMAttributes_Name()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link diagrama.domain.MAttributes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see diagrama.domain.DomainPackage#getMAttributes_DataType()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link diagrama.domain.MAttributes#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

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
	 * @see diagrama.domain.DomainPackage#getMAttributes_AccessModifier()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getAccessModifier();

	/**
	 * Sets the value of the '{@link diagrama.domain.MAttributes#getAccessModifier <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifier</em>' attribute.
	 * @see #getAccessModifier()
	 * @generated
	 */
	void setAccessModifier(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see diagrama.domain.DomainPackage#getMAttributes_DefaultValue()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link diagrama.domain.MAttributes#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

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
	 * @see diagrama.domain.DomainPackage#getMAttributes_Comments()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link diagrama.domain.MAttributes#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Owned By MClass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.MClass#getLstMAttributes <em>Lst MAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By MClass</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By MClass</em>' container reference.
	 * @see #setOwnedByMClass(MClass)
	 * @see diagrama.domain.DomainPackage#getMAttributes_OwnedByMClass()
	 * @see diagrama.domain.MClass#getLstMAttributes
	 * @model opposite="lstMAttributes" transient="false"
	 * @generated
	 */
	MClass getOwnedByMClass();

	/**
	 * Sets the value of the '{@link diagrama.domain.MAttributes#getOwnedByMClass <em>Owned By MClass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By MClass</em>' container reference.
	 * @see #getOwnedByMClass()
	 * @generated
	 */
	void setOwnedByMClass(MClass value);

} // MAttributes
