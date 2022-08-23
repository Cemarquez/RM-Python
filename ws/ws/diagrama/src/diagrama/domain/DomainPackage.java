/**
 */
package diagrama.domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see diagrama.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///diagrama/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagrama.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = diagrama.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagrama.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.impl.DomainImpl
	 * @see diagrama.domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Lst Class Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_CLASS_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_UI = 2;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link diagrama.domain.impl.MAttributesImpl <em>MAttributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.impl.MAttributesImpl
	 * @see diagrama.domain.impl.DomainPackageImpl#getMAttributes()
	 * @generated
	 */
	int MATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTES__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTES__ACCESS_MODIFIER = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTES__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTES__COMMENTS = 4;

	/**
	 * The feature id for the '<em><b>Owned By MClass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTES__OWNED_BY_MCLASS = 5;

	/**
	 * The number of structural features of the '<em>MAttributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTES_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link diagrama.domain.impl.MClassImpl <em>MClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.impl.MClassImpl
	 * @see diagrama.domain.impl.DomainPackageImpl#getMClass()
	 * @generated
	 */
	int MCLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__ACCESS_MODIFIER = 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__COMMENTS = 2;

	/**
	 * The feature id for the '<em><b>Lst MAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Lst MRelationship Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MRELATIONSHIP_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Lst MRelationship Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MRELATIONSHIP_TARGET = 5;

	/**
	 * The feature id for the '<em><b>Lst Class Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_CLASS_DIAGRAM = 6;

	/**
	 * The feature id for the '<em><b>Lst MFunction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MFUNCTION = 7;

	/**
	 * The number of structural features of the '<em>MClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link diagrama.domain.impl.MFunctionImpl <em>MFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.impl.MFunctionImpl
	 * @see diagrama.domain.impl.DomainPackageImpl#getMFunction()
	 * @generated
	 */
	int MFUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__ACCESS_MODIFIER = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__SEMANTICS = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__COMMENTS = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Owned By MClass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__OWNED_BY_MCLASS = 6;

	/**
	 * The number of structural features of the '<em>MFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link diagrama.domain.impl.MRelationshipImpl <em>MRelationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.impl.MRelationshipImpl
	 * @see diagrama.domain.impl.DomainPackageImpl#getMRelationship()
	 * @generated
	 */
	int MRELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__RELATIONSHIP_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__MULTIPLICITY_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__MULTIPLICITY_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__SOURCE_ROLE = 5;

	/**
	 * The feature id for the '<em><b>Target Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__TARGET_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Lst Relationship Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__LST_RELATIONSHIP_FACTORY = 7;

	/**
	 * The number of structural features of the '<em>MRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link diagrama.domain.impl.RelationshipFactoryImpl <em>Relationship Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.impl.RelationshipFactoryImpl
	 * @see diagrama.domain.impl.DomainPackageImpl#getRelationshipFactory()
	 * @generated
	 */
	int RELATIONSHIP_FACTORY = 5;

	/**
	 * The feature id for the '<em><b>Lst MRelationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FACTORY__LST_MRELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Lst Class Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM = 1;

	/**
	 * The number of structural features of the '<em>Relationship Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FACTORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link diagrama.domain.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.impl.ClassDiagramImpl
	 * @see diagrama.domain.impl.DomainPackageImpl#getClassDiagram()
	 * @generated
	 */
	int CLASS_DIAGRAM = 6;

	/**
	 * The feature id for the '<em><b>Lst MClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__LST_MCLASS = 0;

	/**
	 * The feature id for the '<em><b>The Relationship Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY = 1;

	/**
	 * The feature id for the '<em><b>Owned By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__OWNED_BY_DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link diagrama.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see diagrama.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see diagrama.domain.Domain#getTheModelFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.Domain#getLstClassDiagram <em>Lst Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Class Diagram</em>'.
	 * @see diagrama.domain.Domain#getLstClassDiagram()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstClassDiagram();

	/**
	 * Returns the meta object for the reference '{@link diagrama.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The UI</em>'.
	 * @see diagrama.domain.Domain#getTheUI()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheUI();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.MAttributes <em>MAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAttributes</em>'.
	 * @see diagrama.domain.MAttributes
	 * @generated
	 */
	EClass getMAttributes();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MAttributes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diagrama.domain.MAttributes#getName()
	 * @see #getMAttributes()
	 * @generated
	 */
	EAttribute getMAttributes_Name();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MAttributes#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see diagrama.domain.MAttributes#getDataType()
	 * @see #getMAttributes()
	 * @generated
	 */
	EAttribute getMAttributes_DataType();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MAttributes#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see diagrama.domain.MAttributes#getAccessModifier()
	 * @see #getMAttributes()
	 * @generated
	 */
	EAttribute getMAttributes_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MAttributes#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see diagrama.domain.MAttributes#getDefaultValue()
	 * @see #getMAttributes()
	 * @generated
	 */
	EAttribute getMAttributes_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MAttributes#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see diagrama.domain.MAttributes#getComments()
	 * @see #getMAttributes()
	 * @generated
	 */
	EAttribute getMAttributes_Comments();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.MAttributes#getOwnedByMClass <em>Owned By MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By MClass</em>'.
	 * @see diagrama.domain.MAttributes#getOwnedByMClass()
	 * @see #getMAttributes()
	 * @generated
	 */
	EReference getMAttributes_OwnedByMClass();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.MClass <em>MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass</em>'.
	 * @see diagrama.domain.MClass
	 * @generated
	 */
	EClass getMClass();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diagrama.domain.MClass#getName()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MClass#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see diagrama.domain.MClass#getAccessModifier()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MClass#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see diagrama.domain.MClass#getComments()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Comments();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.MClass#getLstMAttributes <em>Lst MAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MAttributes</em>'.
	 * @see diagrama.domain.MClass#getLstMAttributes()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMAttributes();

	/**
	 * Returns the meta object for the reference list '{@link diagrama.domain.MClass#getLstMRelationshipSource <em>Lst MRelationship Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst MRelationship Source</em>'.
	 * @see diagrama.domain.MClass#getLstMRelationshipSource()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMRelationshipSource();

	/**
	 * Returns the meta object for the reference list '{@link diagrama.domain.MClass#getLstMRelationshipTarget <em>Lst MRelationship Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst MRelationship Target</em>'.
	 * @see diagrama.domain.MClass#getLstMRelationshipTarget()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMRelationshipTarget();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.MClass#getLstClassDiagram <em>Lst Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Class Diagram</em>'.
	 * @see diagrama.domain.MClass#getLstClassDiagram()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstClassDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.MClass#getLstMFunction <em>Lst MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MFunction</em>'.
	 * @see diagrama.domain.MClass#getLstMFunction()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMFunction();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.MFunction <em>MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFunction</em>'.
	 * @see diagrama.domain.MFunction
	 * @generated
	 */
	EClass getMFunction();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diagrama.domain.MFunction#getName()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MFunction#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see diagrama.domain.MFunction#getAccessModifier()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see diagrama.domain.MFunction#getReturnType()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MFunction#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see diagrama.domain.MFunction#getSemantics()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Semantics();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MFunction#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see diagrama.domain.MFunction#getComments()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Comments();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see diagrama.domain.MFunction#getParameters()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Parameters();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.MFunction#getOwnedByMClass <em>Owned By MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By MClass</em>'.
	 * @see diagrama.domain.MFunction#getOwnedByMClass()
	 * @see #getMFunction()
	 * @generated
	 */
	EReference getMFunction_OwnedByMClass();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.MRelationship <em>MRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MRelationship</em>'.
	 * @see diagrama.domain.MRelationship
	 * @generated
	 */
	EClass getMRelationship();

	/**
	 * Returns the meta object for the reference '{@link diagrama.domain.MRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see diagrama.domain.MRelationship#getSource()
	 * @see #getMRelationship()
	 * @generated
	 */
	EReference getMRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link diagrama.domain.MRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see diagrama.domain.MRelationship#getTarget()
	 * @see #getMRelationship()
	 * @generated
	 */
	EReference getMRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MRelationship#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see diagrama.domain.MRelationship#getRelationshipType()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_RelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MRelationship#getMultiplicitySource <em>Multiplicity Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Source</em>'.
	 * @see diagrama.domain.MRelationship#getMultiplicitySource()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_MultiplicitySource();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MRelationship#getMultiplicityTarget <em>Multiplicity Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target</em>'.
	 * @see diagrama.domain.MRelationship#getMultiplicityTarget()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_MultiplicityTarget();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MRelationship#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role</em>'.
	 * @see diagrama.domain.MRelationship#getSourceRole()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_SourceRole();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.MRelationship#getTargetRole <em>Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Role</em>'.
	 * @see diagrama.domain.MRelationship#getTargetRole()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_TargetRole();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.MRelationship#getLstRelationshipFactory <em>Lst Relationship Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Relationship Factory</em>'.
	 * @see diagrama.domain.MRelationship#getLstRelationshipFactory()
	 * @see #getMRelationship()
	 * @generated
	 */
	EReference getMRelationship_LstRelationshipFactory();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.RelationshipFactory <em>Relationship Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Factory</em>'.
	 * @see diagrama.domain.RelationshipFactory
	 * @generated
	 */
	EClass getRelationshipFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.RelationshipFactory#getLstMRelationship <em>Lst MRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MRelationship</em>'.
	 * @see diagrama.domain.RelationshipFactory#getLstMRelationship()
	 * @see #getRelationshipFactory()
	 * @generated
	 */
	EReference getRelationshipFactory_LstMRelationship();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.RelationshipFactory#getLstClassDiagram <em>Lst Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Class Diagram</em>'.
	 * @see diagrama.domain.RelationshipFactory#getLstClassDiagram()
	 * @see #getRelationshipFactory()
	 * @generated
	 */
	EReference getRelationshipFactory_LstClassDiagram();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.ClassDiagram <em>Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Diagram</em>'.
	 * @see diagrama.domain.ClassDiagram
	 * @generated
	 */
	EClass getClassDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.ClassDiagram#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass</em>'.
	 * @see diagrama.domain.ClassDiagram#getLstMClass()
	 * @see #getClassDiagram()
	 * @generated
	 */
	EReference getClassDiagram_LstMClass();

	/**
	 * Returns the meta object for the containment reference '{@link diagrama.domain.ClassDiagram#getTheRelationshipFactory <em>The Relationship Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Relationship Factory</em>'.
	 * @see diagrama.domain.ClassDiagram#getTheRelationshipFactory()
	 * @see #getClassDiagram()
	 * @generated
	 */
	EReference getClassDiagram_TheRelationshipFactory();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.ClassDiagram#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Domain</em>'.
	 * @see diagrama.domain.ClassDiagram#getOwnedByDomain()
	 * @see #getClassDiagram()
	 * @generated
	 */
	EReference getClassDiagram_OwnedByDomain();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link diagrama.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.impl.DomainImpl
		 * @see diagrama.domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_MODEL_FACTORY = eINSTANCE.getDomain_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>Lst Class Diagram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_CLASS_DIAGRAM = eINSTANCE.getDomain_LstClassDiagram();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_UI = eINSTANCE.getDomain_TheUI();

		/**
		 * The meta object literal for the '{@link diagrama.domain.impl.MAttributesImpl <em>MAttributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.impl.MAttributesImpl
		 * @see diagrama.domain.impl.DomainPackageImpl#getMAttributes()
		 * @generated
		 */
		EClass MATTRIBUTES = eINSTANCE.getMAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTES__NAME = eINSTANCE.getMAttributes_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTES__DATA_TYPE = eINSTANCE.getMAttributes_DataType();

		/**
		 * The meta object literal for the '<em><b>Access Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTES__ACCESS_MODIFIER = eINSTANCE.getMAttributes_AccessModifier();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTES__DEFAULT_VALUE = eINSTANCE.getMAttributes_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTES__COMMENTS = eINSTANCE.getMAttributes_Comments();

		/**
		 * The meta object literal for the '<em><b>Owned By MClass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATTRIBUTES__OWNED_BY_MCLASS = eINSTANCE.getMAttributes_OwnedByMClass();

		/**
		 * The meta object literal for the '{@link diagrama.domain.impl.MClassImpl <em>MClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.impl.MClassImpl
		 * @see diagrama.domain.impl.DomainPackageImpl#getMClass()
		 * @generated
		 */
		EClass MCLASS = eINSTANCE.getMClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__NAME = eINSTANCE.getMClass_Name();

		/**
		 * The meta object literal for the '<em><b>Access Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__ACCESS_MODIFIER = eINSTANCE.getMClass_AccessModifier();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__COMMENTS = eINSTANCE.getMClass_Comments();

		/**
		 * The meta object literal for the '<em><b>Lst MAttributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MATTRIBUTES = eINSTANCE.getMClass_LstMAttributes();

		/**
		 * The meta object literal for the '<em><b>Lst MRelationship Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MRELATIONSHIP_SOURCE = eINSTANCE.getMClass_LstMRelationshipSource();

		/**
		 * The meta object literal for the '<em><b>Lst MRelationship Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MRELATIONSHIP_TARGET = eINSTANCE.getMClass_LstMRelationshipTarget();

		/**
		 * The meta object literal for the '<em><b>Lst Class Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_CLASS_DIAGRAM = eINSTANCE.getMClass_LstClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Lst MFunction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MFUNCTION = eINSTANCE.getMClass_LstMFunction();

		/**
		 * The meta object literal for the '{@link diagrama.domain.impl.MFunctionImpl <em>MFunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.impl.MFunctionImpl
		 * @see diagrama.domain.impl.DomainPackageImpl#getMFunction()
		 * @generated
		 */
		EClass MFUNCTION = eINSTANCE.getMFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFUNCTION__NAME = eINSTANCE.getMFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Access Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFUNCTION__ACCESS_MODIFIER = eINSTANCE.getMFunction_AccessModifier();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFUNCTION__RETURN_TYPE = eINSTANCE.getMFunction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFUNCTION__SEMANTICS = eINSTANCE.getMFunction_Semantics();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFUNCTION__COMMENTS = eINSTANCE.getMFunction_Comments();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFUNCTION__PARAMETERS = eINSTANCE.getMFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Owned By MClass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFUNCTION__OWNED_BY_MCLASS = eINSTANCE.getMFunction_OwnedByMClass();

		/**
		 * The meta object literal for the '{@link diagrama.domain.impl.MRelationshipImpl <em>MRelationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.impl.MRelationshipImpl
		 * @see diagrama.domain.impl.DomainPackageImpl#getMRelationship()
		 * @generated
		 */
		EClass MRELATIONSHIP = eINSTANCE.getMRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRELATIONSHIP__SOURCE = eINSTANCE.getMRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRELATIONSHIP__TARGET = eINSTANCE.getMRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRELATIONSHIP__RELATIONSHIP_TYPE = eINSTANCE.getMRelationship_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRELATIONSHIP__MULTIPLICITY_SOURCE = eINSTANCE.getMRelationship_MultiplicitySource();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRELATIONSHIP__MULTIPLICITY_TARGET = eINSTANCE.getMRelationship_MultiplicityTarget();

		/**
		 * The meta object literal for the '<em><b>Source Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRELATIONSHIP__SOURCE_ROLE = eINSTANCE.getMRelationship_SourceRole();

		/**
		 * The meta object literal for the '<em><b>Target Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRELATIONSHIP__TARGET_ROLE = eINSTANCE.getMRelationship_TargetRole();

		/**
		 * The meta object literal for the '<em><b>Lst Relationship Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRELATIONSHIP__LST_RELATIONSHIP_FACTORY = eINSTANCE.getMRelationship_LstRelationshipFactory();

		/**
		 * The meta object literal for the '{@link diagrama.domain.impl.RelationshipFactoryImpl <em>Relationship Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.impl.RelationshipFactoryImpl
		 * @see diagrama.domain.impl.DomainPackageImpl#getRelationshipFactory()
		 * @generated
		 */
		EClass RELATIONSHIP_FACTORY = eINSTANCE.getRelationshipFactory();

		/**
		 * The meta object literal for the '<em><b>Lst MRelationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_FACTORY__LST_MRELATIONSHIP = eINSTANCE.getRelationshipFactory_LstMRelationship();

		/**
		 * The meta object literal for the '<em><b>Lst Class Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM = eINSTANCE.getRelationshipFactory_LstClassDiagram();

		/**
		 * The meta object literal for the '{@link diagrama.domain.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.impl.ClassDiagramImpl
		 * @see diagrama.domain.impl.DomainPackageImpl#getClassDiagram()
		 * @generated
		 */
		EClass CLASS_DIAGRAM = eINSTANCE.getClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Lst MClass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM__LST_MCLASS = eINSTANCE.getClassDiagram_LstMClass();

		/**
		 * The meta object literal for the '<em><b>The Relationship Factory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY = eINSTANCE.getClassDiagram_TheRelationshipFactory();

		/**
		 * The meta object literal for the '<em><b>Owned By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM__OWNED_BY_DOMAIN = eINSTANCE.getClassDiagram_OwnedByDomain();

	}

} //DomainPackage
