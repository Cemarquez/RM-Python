/**
 */
package diagrama.domain.abstractsyntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama.domain.abstractsyntax.RelationshipFactory#getLstMRelationship <em>Lst MRelationship</em>}</li>
 *   <li>{@link diagrama.domain.abstractsyntax.RelationshipFactory#getLstClassDiagram <em>Lst Class Diagram</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getRelationshipFactory()
 * @model
 * @generated
 */
public interface RelationshipFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst MRelationship</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama.domain.abstractsyntax.MRelationship}.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MRelationship#getLstRelationshipFactory <em>Lst Relationship Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst MRelationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst MRelationship</em>' containment reference list.
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getRelationshipFactory_LstMRelationship()
	 * @see diagrama.domain.abstractsyntax.MRelationship#getLstRelationshipFactory
	 * @model opposite="lstRelationshipFactory" containment="true"
	 * @generated
	 */
	EList<MRelationship> getLstMRelationship();

	/**
	 * Returns the value of the '<em><b>Lst Class Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.abstractsyntax.MClassDiagram#getTheRelationshipFactory <em>The Relationship Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Class Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Class Diagram</em>' container reference.
	 * @see #setLstClassDiagram(MClassDiagram)
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#getRelationshipFactory_LstClassDiagram()
	 * @see diagrama.domain.abstractsyntax.MClassDiagram#getTheRelationshipFactory
	 * @model opposite="theRelationshipFactory" transient="false"
	 * @generated
	 */
	MClassDiagram getLstClassDiagram();

	/**
	 * Sets the value of the '{@link diagrama.domain.abstractsyntax.RelationshipFactory#getLstClassDiagram <em>Lst Class Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Class Diagram</em>' container reference.
	 * @see #getLstClassDiagram()
	 * @generated
	 */
	void setLstClassDiagram(MClassDiagram value);

} // RelationshipFactory
