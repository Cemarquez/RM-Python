/**
 */
package concrete;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concrete.MAttribute#getName <em>Name</em>}</li>
 *   <li>{@link concrete.MAttribute#getType <em>Type</em>}</li>
 *   <li>{@link concrete.MAttribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link concrete.MAttribute#getComments <em>Comments</em>}</li>
 *   <li>{@link concrete.MAttribute#isConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @see concrete.ConcretePackage#getMAttribute()
 * @model annotation="gmf.node label='name,type' figure='rectangle' label.icon='false' label.pattern='{0} : {1}' color='255,216,208' tool.description='A\361ade un atributo a una clase'"
 * @generated
 */
public interface MAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see concrete.ConcretePackage#getMAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concrete.MAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see concrete.ConcretePackage#getMAttribute_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link concrete.MAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see concrete.ConcretePackage#getMAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link concrete.MAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see concrete.ConcretePackage#getMAttribute_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link concrete.MAttribute#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see concrete.ConcretePackage#getMAttribute_Constant()
	 * @model
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link concrete.MAttribute#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

} // MAttribute
