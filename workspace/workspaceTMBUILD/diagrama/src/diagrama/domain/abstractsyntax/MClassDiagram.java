/**
 */
package diagrama.domain.abstractsyntax;

import diagrama.domain.concretesyntax.ConcreteSyntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MClass Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByAbstractSyntax <em>Owned By Abstract Syntax</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByConcreteSyntax <em>Owned By Concrete Syntax</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClassDiagram#getLstMClass <em>Lst MClass</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClassDiagram#getLstMPackage <em>Lst MPackage</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.MClassDiagram#getTheRelationshipFactory <em>The Relationship Factory</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClassDiagram()
 * @model
 * @generated
 */
public interface MClassDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Abstract Syntax</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.AbstractSyntax#getLstMClassDiagram <em>Lst MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Abstract Syntax</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Abstract Syntax</em>' container reference.
	 * @see #setOwnedByAbstractSyntax(AbstractSyntax)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClassDiagram_OwnedByAbstractSyntax()
	 * @see diagrama.domain.abstractsyntax.AbstractSyntax#getLstMClassDiagram
	 * @model opposite="lstMClassDiagram" transient="false"
	 * @generated
	 */
	AbstractSyntax getOwnedByAbstractSyntax();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByAbstractSyntax <em>Owned By Abstract Syntax</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Abstract Syntax</em>' container reference.
	 * @see #getOwnedByAbstractSyntax()
	 * @generated
	 */
	void setOwnedByAbstractSyntax(AbstractSyntax value);

	/**
	 * Returns the value of the '<em><b>Owned By Concrete Syntax</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.concretesyntax.ConcreteSyntax#getLstMClassDiagram <em>Lst MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Concrete Syntax</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Concrete Syntax</em>' container reference.
	 * @see #setOwnedByConcreteSyntax(ConcreteSyntax)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClassDiagram_OwnedByConcreteSyntax()
	 * @see diagrama.domain.concretesyntax.ConcreteSyntax#getLstMClassDiagram
	 * @model opposite="lstMClassDiagram" transient="false"
	 * @generated
	 */
	ConcreteSyntax getOwnedByConcreteSyntax();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByConcreteSyntax <em>Owned By Concrete Syntax</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Concrete Syntax</em>' container reference.
	 * @see #getOwnedByConcreteSyntax()
	 * @generated
	 */
	void setOwnedByConcreteSyntax(ConcreteSyntax value);

	/**
	 * Returns the value of the '<em><b>Lst MClass</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.MClass}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MClass#getOwnedByClassDiagram <em>Owned By Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MClass</em>' containment reference list.
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClassDiagram_LstMClass()
	 * @see diagrama.domain.abstractsyntax.MClass#getOwnedByClassDiagram
	 * @model opposite="ownedByClassDiagram" containment="true"
	 * @generated
	 */
	EList<MClass> getLstMClass();

	/**
	 * Returns the value of the '<em><b>Lst MPackage</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.MPackage}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MPackage#getOwnedByMClassDiagram <em>Owned By MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MPackage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MPackage</em>' containment reference list.
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClassDiagram_LstMPackage()
	 * @see diagrama.domain.abstractsyntax.MPackage#getOwnedByMClassDiagram
	 * @model opposite="ownedByMClassDiagram" containment="true"
	 * @generated
	 */
	EList<MPackage> getLstMPackage();

	/**
	 * Returns the value of the '<em><b>The Relationship Factory</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.RelationshipFactory#getLstClassDiagram <em>Lst Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Relationship Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Relationship Factory</em>' containment reference.
	 * @see #setTheRelationshipFactory(RelationshipFactory)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getMClassDiagram_TheRelationshipFactory()
	 * @see diagrama.domain.abstractsyntax.RelationshipFactory#getLstClassDiagram
	 * @model opposite="lstClassDiagram" containment="true"
	 * @generated
	 */
	RelationshipFactory getTheRelationshipFactory();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.MClassDiagram#getTheRelationshipFactory <em>The Relationship Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Relationship Factory</em>' containment reference.
	 * @see #getTheRelationshipFactory()
	 * @generated
	 */
	void setTheRelationshipFactory(RelationshipFactory value);

} // MClassDiagram
