/**
 */
package diagrama.domain;

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
 *   <li>{@link diagrama.domain.MRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link diagrama.domain.MRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link diagrama.domain.MRelationship#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link diagrama.domain.MRelationship#getMultiplicitySource <em>Multiplicity Source</em>}</li>
 *   <li>{@link diagrama.domain.MRelationship#getMultiplicityTarget <em>Multiplicity Target</em>}</li>
 *   <li>{@link diagrama.domain.MRelationship#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link diagrama.domain.MRelationship#getTargetRole <em>Target Role</em>}</li>
 *   <li>{@link diagrama.domain.MRelationship#getLstRelationshipFactory <em>Lst Relationship Factory</em>}</li>
 * </ul>
 *
 * @see diagrama.domain.DomainPackage#getMRelationship()
 * @model
 * @generated
 */
public interface MRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.MClass#getLstMRelationshipSource <em>Lst MRelationship Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MClass)
	 * @see diagrama.domain.DomainPackage#getMRelationship_Source()
	 * @see diagrama.domain.MClass#getLstMRelationshipSource
	 * @model opposite="lstMRelationshipSource"
	 * @generated
	 */
	MClass getSource();

	/**
	 * Sets the value of the '{@link diagrama.domain.MRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MClass value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.MClass#getLstMRelationshipTarget <em>Lst MRelationship Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(MClass)
	 * @see diagrama.domain.DomainPackage#getMRelationship_Target()
	 * @see diagrama.domain.MClass#getLstMRelationshipTarget
	 * @model opposite="lstMRelationshipTarget"
	 * @generated
	 */
	MClass getTarget();

	/**
	 * Sets the value of the '{@link diagrama.domain.MRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MClass value);

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see #setRelationshipType(String)
	 * @see diagrama.domain.DomainPackage#getMRelationship_RelationshipType()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getRelationshipType();

	/**
	 * Sets the value of the '{@link diagrama.domain.MRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Source</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Source</em>' attribute.
	 * @see #setMultiplicitySource(String)
	 * @see diagrama.domain.DomainPackage#getMRelationship_MultiplicitySource()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getMultiplicitySource();

	/**
	 * Sets the value of the '{@link diagrama.domain.MRelationship#getMultiplicitySource <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Source</em>' attribute.
	 * @see #getMultiplicitySource()
	 * @generated
	 */
	void setMultiplicitySource(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Target</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Target</em>' attribute.
	 * @see #setMultiplicityTarget(String)
	 * @see diagrama.domain.DomainPackage#getMRelationship_MultiplicityTarget()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getMultiplicityTarget();

	/**
	 * Sets the value of the '{@link diagrama.domain.MRelationship#getMultiplicityTarget <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Target</em>' attribute.
	 * @see #getMultiplicityTarget()
	 * @generated
	 */
	void setMultiplicityTarget(String value);

	/**
	 * Returns the value of the '<em><b>Source Role</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role</em>' attribute.
	 * @see #setSourceRole(String)
	 * @see diagrama.domain.DomainPackage#getMRelationship_SourceRole()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getSourceRole();

	/**
	 * Sets the value of the '{@link diagrama.domain.MRelationship#getSourceRole <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role</em>' attribute.
	 * @see #getSourceRole()
	 * @generated
	 */
	void setSourceRole(String value);

	/**
	 * Returns the value of the '<em><b>Target Role</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Role</em>' attribute.
	 * @see #setTargetRole(String)
	 * @see diagrama.domain.DomainPackage#getMRelationship_TargetRole()
	 * @model default=" " dataType="diagrama.String"
	 * @generated
	 */
	String getTargetRole();

	/**
	 * Sets the value of the '{@link diagrama.domain.MRelationship#getTargetRole <em>Target Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Role</em>' attribute.
	 * @see #getTargetRole()
	 * @generated
	 */
	void setTargetRole(String value);

	/**
	 * Returns the value of the '<em><b>Lst Relationship Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link diagrama.domain.RelationshipFactory#getLstMRelationship <em>Lst MRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Relationship Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Relationship Factory</em>' container reference.
	 * @see #setLstRelationshipFactory(RelationshipFactory)
	 * @see diagrama.domain.DomainPackage#getMRelationship_LstRelationshipFactory()
	 * @see diagrama.domain.RelationshipFactory#getLstMRelationship
	 * @model opposite="lstMRelationship" transient="false"
	 * @generated
	 */
	RelationshipFactory getLstRelationshipFactory();

	/**
	 * Sets the value of the '{@link diagrama.domain.MRelationship#getLstRelationshipFactory <em>Lst Relationship Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Relationship Factory</em>' container reference.
	 * @see #getLstRelationshipFactory()
	 * @generated
	 */
	void setLstRelationshipFactory(RelationshipFactory value);

} // MRelationship
