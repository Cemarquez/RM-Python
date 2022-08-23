/**
 */
package diagrama.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.ClassDiagram#getLstMClass <em>Lst MClass</em>}</li>
 *   <li>{@link diagrama.domain.ClassDiagram#getTheRelationshipFactory <em>The Relationship Factory</em>}</li>
 *   <li>{@link diagrama.domain.ClassDiagram#getOwnedByDomain <em>Owned By Domain</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.DomainPackage#getClassDiagram()
 * @model
 * @generated
 */
public interface ClassDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst MClass</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.MClass}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.MClass#getLstClassDiagram <em>Lst Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MClass</em>' containment reference list.
	 * @see diagrama.domain.DomainPackage#getClassDiagram_LstMClass()
	 * @see diagrama.domain.MClass#getLstClassDiagram
	 * @model opposite="lstClassDiagram" containment="true"
	 * @generated
	 */
	EList<MClass> getLstMClass();

	/**
	 * Returns the value of the '<em><b>The Relationship Factory</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.RelationshipFactory#getLstClassDiagram <em>Lst Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Relationship Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Relationship Factory</em>' containment reference.
	 * @see #setTheRelationshipFactory(RelationshipFactory)
	 * @see diagrama.domain.DomainPackage#getClassDiagram_TheRelationshipFactory()
	 * @see diagrama.domain.RelationshipFactory#getLstClassDiagram
	 * @model opposite="lstClassDiagram" containment="true"
	 * @generated
	 */
	RelationshipFactory getTheRelationshipFactory();

	/**
	 * Sets the value of the '{@link diagrama.domain.ClassDiagram#getTheRelationshipFactory <em>The Relationship Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Relationship Factory</em>' containment reference.
	 * @see #getTheRelationshipFactory()
	 * @generated
	 */
	void setTheRelationshipFactory(RelationshipFactory value);

	/**
	 * Returns the value of the '<em><b>Owned By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.Domain#getLstClassDiagram <em>Lst Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Domain</em>' container reference.
	 * @see #setOwnedByDomain(Domain)
	 * @see diagrama.domain.DomainPackage#getClassDiagram_OwnedByDomain()
	 * @see diagrama.domain.Domain#getLstClassDiagram
	 * @model opposite="lstClassDiagram" transient="false"
	 * @generated
	 */
	Domain getOwnedByDomain();

	/**
	 * Sets the value of the '{@link diagrama.domain.ClassDiagram#getOwnedByDomain <em>Owned By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Domain</em>' container reference.
	 * @see #getOwnedByDomain()
	 * @generated
	 */
	void setOwnedByDomain(Domain value);

} // ClassDiagram
