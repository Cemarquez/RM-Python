/**
 */
package diagrama.domain;

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
 *   <li>{@link diagrama.domain.MClass#getName <em>Name</em>}</li>
 *   <li>{@link diagrama.domain.MClass#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link diagrama.domain.MClass#getComments <em>Comments</em>}</li>
 *   <li>{@link diagrama.domain.MClass#getLstMAttributes <em>Lst MAttributes</em>}</li>
 *   <li>{@link diagrama.domain.MClass#getLstMRelationshipSource <em>Lst MRelationship Source</em>}</li>
 *   <li>{@link diagrama.domain.MClass#getLstMRelationshipTarget <em>Lst MRelationship Target</em>}</li>
 *   <li>{@link diagrama.domain.MClass#getLstClassDiagram <em>Lst Class Diagram</em>}</li>
 *   <li>{@link diagrama.domain.MClass#getLstMFunction <em>Lst MFunction</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.DomainPackage#getMClass()
 * @model
 * @generated
 */
public interface MClass extends EObject {
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
	 * @see diagrama.domain.DomainPackage#getMClass_Name()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link diagrama.domain.MClass#getName <em>Name</em>}' attribute.
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
	 * @see diagrama.domain.DomainPackage#getMClass_AccessModifier()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getAccessModifier();

	/**
	 * Sets the value of the '{@link diagrama.domain.MClass#getAccessModifier <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifier</em>' attribute.
	 * @see #getAccessModifier()
	 * @generated
	 */
	void setAccessModifier(String value);

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
	 * @see diagrama.domain.DomainPackage#getMClass_Comments()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link diagrama.domain.MClass#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Lst MAttributes</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.MAttributes}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.MAttributes#getOwnedByMClass <em>Owned By MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MAttributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MAttributes</em>' containment reference list.
	 * @see diagrama.domain.DomainPackage#getMClass_LstMAttributes()
	 * @see diagrama.domain.MAttributes#getOwnedByMClass
	 * @model opposite="ownedByMClass" containment="true"
	 * @generated
	 */
	EList<MAttributes> getLstMAttributes();

	/**
	 * Returns the value of the '<em><b>Lst MRelationship Source</b></em>' reference list.
	 * The list contents are of type {@link diagrama.domain.MRelationship}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.MRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MRelationship Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MRelationship Source</em>' reference list.
	 * @see diagrama.domain.DomainPackage#getMClass_LstMRelationshipSource()
	 * @see diagrama.domain.MRelationship#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<MRelationship> getLstMRelationshipSource();

	/**
	 * Returns the value of the '<em><b>Lst MRelationship Target</b></em>' reference list.
	 * The list contents are of type {@link diagrama.domain.MRelationship}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.MRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MRelationship Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MRelationship Target</em>' reference list.
	 * @see diagrama.domain.DomainPackage#getMClass_LstMRelationshipTarget()
	 * @see diagrama.domain.MRelationship#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<MRelationship> getLstMRelationshipTarget();

	/**
	 * Returns the value of the '<em><b>Lst Class Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.ClassDiagram#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Class Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Class Diagram</em>' container reference.
	 * @see #setLstClassDiagram(ClassDiagram)
	 * @see diagrama.domain.DomainPackage#getMClass_LstClassDiagram()
	 * @see diagrama.domain.ClassDiagram#getLstMClass
	 * @model opposite="lstMClass" transient="false"
	 * @generated
	 */
	ClassDiagram getLstClassDiagram();

	/**
	 * Sets the value of the '{@link diagrama.domain.MClass#getLstClassDiagram <em>Lst Class Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Class Diagram</em>' container reference.
	 * @see #getLstClassDiagram()
	 * @generated
	 */
	void setLstClassDiagram(ClassDiagram value);

	/**
	 * Returns the value of the '<em><b>Lst MFunction</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.MFunction}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.MFunction#getOwnedByMClass <em>Owned By MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MFunction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MFunction</em>' containment reference list.
	 * @see diagrama.domain.DomainPackage#getMClass_LstMFunction()
	 * @see diagrama.domain.MFunction#getOwnedByMClass
	 * @model opposite="ownedByMClass" containment="true"
	 * @generated
	 */
	EList<MFunction> getLstMFunction();

} // MClass
