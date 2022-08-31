/**
 */
package diagrama.domain.abstractsyntax;

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
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getName <em>Name</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getComments <em>Comments</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getPath <em>Path</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getOwnedByClassDiagram <em>Owned By Class Diagram</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getLstMAttributes <em>Lst MAttributes</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getLstMRelationshipSource <em>Lst MRelationship Source</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getLstMRelationshipTarget <em>Lst MRelationship Target</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getOwnedByMPackage <em>Owned By MPackage</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getLstMRelationship <em>Lst MRelationship</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClass#getLstMFunction <em>Lst MFunction</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass()
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
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_Name()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MClass#getName <em>Name</em>}' attribute.
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
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_AccessModifier()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getAccessModifier();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MClass#getAccessModifier <em>Access Modifier</em>}' attribute.
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
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_Comments()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MClass#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_Abstract()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MClass#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_Stereotype()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MClass#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_Path()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MClass#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Owned By Class Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MClassDiagram#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Class Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Class Diagram</em>' container reference.
	 * @see #setOwnedByClassDiagram(MClassDiagram)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_OwnedByClassDiagram()
	 * @see diagrama.domain.abstractsyntax.MClassDiagram#getLstMClass
	 * @model opposite="lstMClass" transient="false"
	 * @generated
	 */
	MClassDiagram getOwnedByClassDiagram();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MClass#getOwnedByClassDiagram <em>Owned By Class Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Class Diagram</em>' container reference.
	 * @see #getOwnedByClassDiagram()
	 * @generated
	 */
	void setOwnedByClassDiagram(MClassDiagram value);

	/**
	 * Returns the value of the '<em><b>Lst MAttributes</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.MAttribute}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MAttribute#getOwnedByMClass <em>Owned By MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MAttributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MAttributes</em>' containment reference list.
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_LstMAttributes()
	 * @see diagrama.domain.abstractsyntax.MAttribute#getOwnedByMClass
	 * @model opposite="ownedByMClass" containment="true"
	 * @generated
	 */
	EList<MAttribute> getLstMAttributes();

	/**
	 * Returns the value of the '<em><b>Lst MRelationship Source</b></em>' reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.MRelationship}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MRelationship Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MRelationship Source</em>' reference list.
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_LstMRelationshipSource()
	 * @see diagrama.domain.abstractsyntax.MRelationship#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<MRelationship> getLstMRelationshipSource();

	/**
	 * Returns the value of the '<em><b>Lst MRelationship Target</b></em>' reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.MRelationship}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MRelationship Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MRelationship Target</em>' reference list.
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_LstMRelationshipTarget()
	 * @see diagrama.domain.abstractsyntax.MRelationship#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<MRelationship> getLstMRelationshipTarget();

	/**
	 * Returns the value of the '<em><b>Owned By MPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MPackage#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By MPackage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By MPackage</em>' container reference.
	 * @see #setOwnedByMPackage(MPackage)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_OwnedByMPackage()
	 * @see diagrama.domain.abstractsyntax.MPackage#getLstMClass
	 * @model opposite="lstMClass" transient="false"
	 * @generated
	 */
	MPackage getOwnedByMPackage();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MClass#getOwnedByMPackage <em>Owned By MPackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By MPackage</em>' container reference.
	 * @see #getOwnedByMPackage()
	 * @generated
	 */
	void setOwnedByMPackage(MPackage value);

	/**
	 * Returns the value of the '<em><b>Lst MRelationship</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.MRelationship}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MRelationship#getOwnedByMClass <em>Owned By MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MRelationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MRelationship</em>' containment reference list.
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_LstMRelationship()
	 * @see diagrama.domain.abstractsyntax.MRelationship#getOwnedByMClass
	 * @model opposite="ownedByMClass" containment="true"
	 * @generated
	 */
	EList<MRelationship> getLstMRelationship();

	/**
	 * Returns the value of the '<em><b>Lst MFunction</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.MFunction}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MFunction#getOwnedByMClass <em>Owned By MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MFunction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MFunction</em>' containment reference list.
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClass_LstMFunction()
	 * @see diagrama.domain.abstractsyntax.MFunction#getOwnedByMClass
	 * @model opposite="ownedByMClass" containment="true"
	 * @generated
	 */
	EList<MFunction> getLstMFunction();

} // MClass
