/**
 */
package diagrama.domain.concretesyntax;

import diagrama.domain.Domain;

import diagrama.domain.abstractsyntax.MClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.concretesyntax.ConcreteSyntax#getLstMClassDiagram <em>Lst MClass Diagram</em>}</li>
 *   <li>{@link diagrama.domain.concretesyntax.ConcreteSyntax#getOwnedByDomain <em>Owned By Domain</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.concretesyntax.ConcretesyntaxPackage#getConcreteSyntax()
 * @model
 * @generated
 */
public interface ConcreteSyntax extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst MClass Diagram</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.MClassDiagram}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByConcreteSyntax <em>Owned By Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MClass Diagram</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MClass Diagram</em>' containment reference list.
	 * @see diagrama.domain.concretesyntax.ConcretesyntaxPackage#getConcreteSyntax_LstMClassDiagram()
	 * @see diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByConcreteSyntax
	 * @model opposite="ownedByConcreteSyntax" containment="true"
	 * @generated
	 */
	EList<MClassDiagram> getLstMClassDiagram();

	/**
	 * Returns the value of the '<em><b>Owned By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.Domain#getLstConcreteSyntax <em>Lst Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Domain</em>' container reference.
	 * @see #setOwnedByDomain(Domain)
	 * @see diagrama.domain.concretesyntax.ConcretesyntaxPackage#getConcreteSyntax_OwnedByDomain()
	 * @see diagrama.domain.Domain#getLstConcreteSyntax
	 * @model opposite="lstConcreteSyntax" transient="false"
	 * @generated
	 */
	Domain getOwnedByDomain();

	/**
	 * Sets the value of the '{@link diagrama.domain.concretesyntax.ConcreteSyntax#getOwnedByDomain <em>Owned By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Domain</em>' container reference.
	 * @see #getOwnedByDomain()
	 * @generated
	 */
	void setOwnedByDomain(Domain value);

} // ConcreteSyntax
