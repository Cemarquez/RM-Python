/**
 */
package abstracts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MRelationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracts.MRelationship#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link abstracts.MRelationship#getMultiplicitySource <em>Multiplicity Source</em>}</li>
 *   <li>{@link abstracts.MRelationship#getMultiplicityTarget <em>Multiplicity Target</em>}</li>
 *   <li>{@link abstracts.MRelationship#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link abstracts.MRelationship#getTargetRole <em>Target Role</em>}</li>
 *   <li>{@link abstracts.MRelationship#getNavegabilitySource <em>Navegability Source</em>}</li>
 *   <li>{@link abstracts.MRelationship#getNavegabilityTarget <em>Navegability Target</em>}</li>
 * </ul>
 *
 * @see abstracts.AbstractsPackage#getMRelationship()
 * @model
 * @generated
 */
public interface MRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see #setRelationshipType(String)
	 * @see abstracts.AbstractsPackage#getMRelationship_RelationshipType()
	 * @model
	 * @generated
	 */
	String getRelationshipType();

	/**
	 * Sets the value of the '{@link abstracts.MRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Source</em>' attribute.
	 * @see #setMultiplicitySource(String)
	 * @see abstracts.AbstractsPackage#getMRelationship_MultiplicitySource()
	 * @model
	 * @generated
	 */
	String getMultiplicitySource();

	/**
	 * Sets the value of the '{@link abstracts.MRelationship#getMultiplicitySource <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Source</em>' attribute.
	 * @see #getMultiplicitySource()
	 * @generated
	 */
	void setMultiplicitySource(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Target</em>' attribute.
	 * @see #setMultiplicityTarget(String)
	 * @see abstracts.AbstractsPackage#getMRelationship_MultiplicityTarget()
	 * @model
	 * @generated
	 */
	String getMultiplicityTarget();

	/**
	 * Sets the value of the '{@link abstracts.MRelationship#getMultiplicityTarget <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Target</em>' attribute.
	 * @see #getMultiplicityTarget()
	 * @generated
	 */
	void setMultiplicityTarget(String value);

	/**
	 * Returns the value of the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role</em>' attribute.
	 * @see #setSourceRole(String)
	 * @see abstracts.AbstractsPackage#getMRelationship_SourceRole()
	 * @model
	 * @generated
	 */
	String getSourceRole();

	/**
	 * Sets the value of the '{@link abstracts.MRelationship#getSourceRole <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role</em>' attribute.
	 * @see #getSourceRole()
	 * @generated
	 */
	void setSourceRole(String value);

	/**
	 * Returns the value of the '<em><b>Target Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Role</em>' attribute.
	 * @see #setTargetRole(String)
	 * @see abstracts.AbstractsPackage#getMRelationship_TargetRole()
	 * @model
	 * @generated
	 */
	String getTargetRole();

	/**
	 * Sets the value of the '{@link abstracts.MRelationship#getTargetRole <em>Target Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Role</em>' attribute.
	 * @see #getTargetRole()
	 * @generated
	 */
	void setTargetRole(String value);

	/**
	 * Returns the value of the '<em><b>Navegability Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navegability Source</em>' attribute.
	 * @see #setNavegabilitySource(String)
	 * @see abstracts.AbstractsPackage#getMRelationship_NavegabilitySource()
	 * @model
	 * @generated
	 */
	String getNavegabilitySource();

	/**
	 * Sets the value of the '{@link abstracts.MRelationship#getNavegabilitySource <em>Navegability Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navegability Source</em>' attribute.
	 * @see #getNavegabilitySource()
	 * @generated
	 */
	void setNavegabilitySource(String value);

	/**
	 * Returns the value of the '<em><b>Navegability Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navegability Target</em>' attribute.
	 * @see #setNavegabilityTarget(String)
	 * @see abstracts.AbstractsPackage#getMRelationship_NavegabilityTarget()
	 * @model
	 * @generated
	 */
	String getNavegabilityTarget();

	/**
	 * Sets the value of the '{@link abstracts.MRelationship#getNavegabilityTarget <em>Navegability Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navegability Target</em>' attribute.
	 * @see #getNavegabilityTarget()
	 * @generated
	 */
	void setNavegabilityTarget(String value);

} // MRelationship
