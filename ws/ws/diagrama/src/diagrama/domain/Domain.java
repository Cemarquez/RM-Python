/**
 */
package diagrama.domain;

import diagrama.ModelFactory;

import diagrama.domain.abstractsyntax.AbstractSyntax;

import diagrama.domain.concretesyntax.ConcreteSyntax;

import diagrama.ui.UI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.Domain#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link diagrama.domain.Domain#getLstAbstractSyntax <em>Lst Abstract Syntax</em>}</li>
 *   <li>{@link diagrama.domain.Domain#getLstConcreteSyntax <em>Lst Concrete Syntax</em>}</li>
 *   <li>{@link diagrama.domain.Domain#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.ModelFactory#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see diagrama.domain.DomainPackage#getDomain_TheModelFactory()
	 * @see diagrama.ModelFactory#getTheDomain
	 * @model opposite="theDomain" transient="false"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link diagrama.domain.Domain#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Lst Abstract Syntax</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.AbstractSyntax}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.AbstractSyntax#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Abstract Syntax</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Abstract Syntax</em>' containment reference list.
	 * @see diagrama.domain.DomainPackage#getDomain_LstAbstractSyntax()
	 * @see diagrama.domain.abstractsyntax.AbstractSyntax#getOwnedByDomain
	 * @model opposite="ownedByDomain" containment="true"
	 * @generated
	 */
	EList<AbstractSyntax> getLstAbstractSyntax();

	/**
	 * Returns the value of the '<em><b>Lst Concrete Syntax</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.concretesyntax.ConcreteSyntax}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.concretesyntax.ConcreteSyntax#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Concrete Syntax</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Concrete Syntax</em>' containment reference list.
	 * @see diagrama.domain.DomainPackage#getDomain_LstConcreteSyntax()
	 * @see diagrama.domain.concretesyntax.ConcreteSyntax#getOwnedByDomain
	 * @model opposite="ownedByDomain" containment="true"
	 * @generated
	 */
	EList<ConcreteSyntax> getLstConcreteSyntax();

	/**
	 * Returns the value of the '<em><b>The UI</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link diagrama.ui.UI#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' reference.
	 * @see #setTheUI(UI)
	 * @see diagrama.domain.DomainPackage#getDomain_TheUI()
	 * @see diagrama.ui.UI#getTheDomain
	 * @model opposite="theDomain"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link diagrama.domain.Domain#getTheUI <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//TODO implementarModelo\n'"
	 * @generated
	 */
	void implementarModelo();

} // Domain
