/**
 */
package concrete;

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
 * @see concrete.ConcreteFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface ConcretePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concrete";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "concrete";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concrete";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcretePackage eINSTANCE = concrete.impl.ConcretePackageImpl.init();

	/**
	 * The meta object id for the '{@link concrete.impl.MClassDiagramImpl <em>MClass Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MClassDiagramImpl
	 * @see concrete.impl.ConcretePackageImpl#getMClassDiagram()
	 * @generated
	 */
	int MCLASS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lst MPackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Lst MClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MCLASS = 2;

	/**
	 * The feature id for the '<em><b>Lst MRelationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MRELATIONSHIP = 3;

	/**
	 * The number of structural features of the '<em>MClass Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link concrete.impl.MPackageImpl <em>MPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MPackageImpl
	 * @see concrete.impl.ConcretePackageImpl#getMPackage()
	 * @generated
	 */
	int MPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Lst MClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__LST_MCLASS = 2;

	/**
	 * The feature id for the '<em><b>Lst MPackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__LST_MPACKAGE = 3;

	/**
	 * The number of structural features of the '<em>MPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link concrete.impl.MClassImpl <em>MClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MClassImpl
	 * @see concrete.impl.ConcretePackageImpl#getMClass()
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
	 * The feature id for the '<em><b>Abstracts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__ABSTRACTS = 3;

	/**
	 * The feature id for the '<em><b>Stereo Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__STEREO_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__PATH = 5;

	/**
	 * The feature id for the '<em><b>Lts MRelationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LTS_MRELATIONSHIPS = 6;

	/**
	 * The feature id for the '<em><b>Lst MAttribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Lst MFunction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MFUNCTION = 8;

	/**
	 * The number of structural features of the '<em>MClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link concrete.impl.MRelationshipImpl <em>MRelationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MRelationshipImpl
	 * @see concrete.impl.ConcretePackageImpl#getMRelationship()
	 * @generated
	 */
	int MRELATIONSHIP = 3;

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
	 * The feature id for the '<em><b>Navegability Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__NAVEGABILITY_SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Navegability Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__NAVEGABILITY_TARGET = 8;

	/**
	 * The number of structural features of the '<em>MRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link concrete.impl.MAttributeImpl <em>MAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MAttributeImpl
	 * @see concrete.impl.ConcretePackageImpl#getMAttribute()
	 * @generated
	 */
	int MATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__ACCESS_MODIFIER = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__COMMENTS = 4;

	/**
	 * The number of structural features of the '<em>MAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link concrete.impl.MFunctionImpl <em>MFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MFunctionImpl
	 * @see concrete.impl.ConcretePackageImpl#getMFunction()
	 * @generated
	 */
	int MFUNCTION = 5;

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
	 * The feature id for the '<em><b>Lst MParameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__LST_MPARAMETER = 5;

	/**
	 * The number of structural features of the '<em>MFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link concrete.impl.MParameterImpl <em>MParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MParameterImpl
	 * @see concrete.impl.ConcretePackageImpl#getMParameter()
	 * @generated
	 */
	int MPARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>MParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link concrete.MClassDiagram <em>MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass Diagram</em>'.
	 * @see concrete.MClassDiagram
	 * @generated
	 */
	EClass getMClassDiagram();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClassDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concrete.MClassDiagram#getName()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EAttribute getMClassDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClassDiagram#getLstMPackage <em>Lst MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MPackage</em>'.
	 * @see concrete.MClassDiagram#getLstMPackage()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClassDiagram#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass</em>'.
	 * @see concrete.MClassDiagram#getLstMClass()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMClass();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClassDiagram#getLstMRelationship <em>Lst MRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MRelationship</em>'.
	 * @see concrete.MClassDiagram#getLstMRelationship()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMRelationship();

	/**
	 * Returns the meta object for class '{@link concrete.MPackage <em>MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPackage</em>'.
	 * @see concrete.MPackage
	 * @generated
	 */
	EClass getMPackage();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concrete.MPackage#getName()
	 * @see #getMPackage()
	 * @generated
	 */
	EAttribute getMPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MPackage#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see concrete.MPackage#getPath()
	 * @see #getMPackage()
	 * @generated
	 */
	EAttribute getMPackage_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MPackage#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass</em>'.
	 * @see concrete.MPackage#getLstMClass()
	 * @see #getMPackage()
	 * @generated
	 */
	EReference getMPackage_LstMClass();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MPackage#getLstMPackage <em>Lst MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MPackage</em>'.
	 * @see concrete.MPackage#getLstMPackage()
	 * @see #getMPackage()
	 * @generated
	 */
	EReference getMPackage_LstMPackage();

	/**
	 * Returns the meta object for class '{@link concrete.MClass <em>MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass</em>'.
	 * @see concrete.MClass
	 * @generated
	 */
	EClass getMClass();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concrete.MClass#getName()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClass#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see concrete.MClass#getAccessModifier()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClass#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see concrete.MClass#getComments()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Comments();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClass#isAbstracts <em>Abstracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstracts</em>'.
	 * @see concrete.MClass#isAbstracts()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Abstracts();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClass#getStereoType <em>Stereo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereo Type</em>'.
	 * @see concrete.MClass#getStereoType()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_StereoType();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClass#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see concrete.MClass#getPath()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClass#getLtsMRelationships <em>Lts MRelationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lts MRelationships</em>'.
	 * @see concrete.MClass#getLtsMRelationships()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LtsMRelationships();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClass#getLstMAttribute <em>Lst MAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MAttribute</em>'.
	 * @see concrete.MClass#getLstMAttribute()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClass#getLstMFunction <em>Lst MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MFunction</em>'.
	 * @see concrete.MClass#getLstMFunction()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMFunction();

	/**
	 * Returns the meta object for class '{@link concrete.MRelationship <em>MRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MRelationship</em>'.
	 * @see concrete.MRelationship
	 * @generated
	 */
	EClass getMRelationship();

	/**
	 * Returns the meta object for the reference '{@link concrete.MRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concrete.MRelationship#getSource()
	 * @see #getMRelationship()
	 * @generated
	 */
	EReference getMRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link concrete.MRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concrete.MRelationship#getTarget()
	 * @see #getMRelationship()
	 * @generated
	 */
	EReference getMRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MRelationship#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see concrete.MRelationship#getRelationshipType()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_RelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MRelationship#getMultiplicitySource <em>Multiplicity Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Source</em>'.
	 * @see concrete.MRelationship#getMultiplicitySource()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_MultiplicitySource();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MRelationship#getMultiplicityTarget <em>Multiplicity Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target</em>'.
	 * @see concrete.MRelationship#getMultiplicityTarget()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_MultiplicityTarget();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MRelationship#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role</em>'.
	 * @see concrete.MRelationship#getSourceRole()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_SourceRole();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MRelationship#getTargetRole <em>Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Role</em>'.
	 * @see concrete.MRelationship#getTargetRole()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_TargetRole();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MRelationship#getNavegabilitySource <em>Navegability Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegability Source</em>'.
	 * @see concrete.MRelationship#getNavegabilitySource()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_NavegabilitySource();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MRelationship#getNavegabilityTarget <em>Navegability Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegability Target</em>'.
	 * @see concrete.MRelationship#getNavegabilityTarget()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_NavegabilityTarget();

	/**
	 * Returns the meta object for class '{@link concrete.MAttribute <em>MAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAttribute</em>'.
	 * @see concrete.MAttribute
	 * @generated
	 */
	EClass getMAttribute();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concrete.MAttribute#getName()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see concrete.MAttribute#getDataType()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_DataType();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see concrete.MAttribute#getAccessModifier()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see concrete.MAttribute#getDefaultValue()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see concrete.MAttribute#getComments()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Comments();

	/**
	 * Returns the meta object for class '{@link concrete.MFunction <em>MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFunction</em>'.
	 * @see concrete.MFunction
	 * @generated
	 */
	EClass getMFunction();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concrete.MFunction#getName()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MFunction#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see concrete.MFunction#getAccessModifier()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see concrete.MFunction#getReturnType()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MFunction#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see concrete.MFunction#getSemantics()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Semantics();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MFunction#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see concrete.MFunction#getComments()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Comments();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MFunction#getLstMParameter <em>Lst MParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MParameter</em>'.
	 * @see concrete.MFunction#getLstMParameter()
	 * @see #getMFunction()
	 * @generated
	 */
	EReference getMFunction_LstMParameter();

	/**
	 * Returns the meta object for class '{@link concrete.MParameter <em>MParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MParameter</em>'.
	 * @see concrete.MParameter
	 * @generated
	 */
	EClass getMParameter();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concrete.MParameter#getName()
	 * @see #getMParameter()
	 * @generated
	 */
	EAttribute getMParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MParameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see concrete.MParameter#getDataType()
	 * @see #getMParameter()
	 * @generated
	 */
	EAttribute getMParameter_DataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConcreteFactory getConcreteFactory();

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
		 * The meta object literal for the '{@link concrete.impl.MClassDiagramImpl <em>MClass Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MClassDiagramImpl
		 * @see concrete.impl.ConcretePackageImpl#getMClassDiagram()
		 * @generated
		 */
		EClass MCLASS_DIAGRAM = eINSTANCE.getMClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS_DIAGRAM__NAME = eINSTANCE.getMClassDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Lst MPackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__LST_MPACKAGE = eINSTANCE.getMClassDiagram_LstMPackage();

		/**
		 * The meta object literal for the '<em><b>Lst MClass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__LST_MCLASS = eINSTANCE.getMClassDiagram_LstMClass();

		/**
		 * The meta object literal for the '<em><b>Lst MRelationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__LST_MRELATIONSHIP = eINSTANCE.getMClassDiagram_LstMRelationship();

		/**
		 * The meta object literal for the '{@link concrete.impl.MPackageImpl <em>MPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MPackageImpl
		 * @see concrete.impl.ConcretePackageImpl#getMPackage()
		 * @generated
		 */
		EClass MPACKAGE = eINSTANCE.getMPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPACKAGE__NAME = eINSTANCE.getMPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPACKAGE__PATH = eINSTANCE.getMPackage_Path();

		/**
		 * The meta object literal for the '<em><b>Lst MClass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPACKAGE__LST_MCLASS = eINSTANCE.getMPackage_LstMClass();

		/**
		 * The meta object literal for the '<em><b>Lst MPackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPACKAGE__LST_MPACKAGE = eINSTANCE.getMPackage_LstMPackage();

		/**
		 * The meta object literal for the '{@link concrete.impl.MClassImpl <em>MClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MClassImpl
		 * @see concrete.impl.ConcretePackageImpl#getMClass()
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
		 * The meta object literal for the '<em><b>Abstracts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__ABSTRACTS = eINSTANCE.getMClass_Abstracts();

		/**
		 * The meta object literal for the '<em><b>Stereo Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__STEREO_TYPE = eINSTANCE.getMClass_StereoType();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__PATH = eINSTANCE.getMClass_Path();

		/**
		 * The meta object literal for the '<em><b>Lts MRelationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LTS_MRELATIONSHIPS = eINSTANCE.getMClass_LtsMRelationships();

		/**
		 * The meta object literal for the '<em><b>Lst MAttribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MATTRIBUTE = eINSTANCE.getMClass_LstMAttribute();

		/**
		 * The meta object literal for the '<em><b>Lst MFunction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MFUNCTION = eINSTANCE.getMClass_LstMFunction();

		/**
		 * The meta object literal for the '{@link concrete.impl.MRelationshipImpl <em>MRelationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MRelationshipImpl
		 * @see concrete.impl.ConcretePackageImpl#getMRelationship()
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
		 * The meta object literal for the '<em><b>Navegability Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRELATIONSHIP__NAVEGABILITY_SOURCE = eINSTANCE.getMRelationship_NavegabilitySource();

		/**
		 * The meta object literal for the '<em><b>Navegability Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRELATIONSHIP__NAVEGABILITY_TARGET = eINSTANCE.getMRelationship_NavegabilityTarget();

		/**
		 * The meta object literal for the '{@link concrete.impl.MAttributeImpl <em>MAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MAttributeImpl
		 * @see concrete.impl.ConcretePackageImpl#getMAttribute()
		 * @generated
		 */
		EClass MATTRIBUTE = eINSTANCE.getMAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__NAME = eINSTANCE.getMAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__DATA_TYPE = eINSTANCE.getMAttribute_DataType();

		/**
		 * The meta object literal for the '<em><b>Access Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__ACCESS_MODIFIER = eINSTANCE.getMAttribute_AccessModifier();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getMAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__COMMENTS = eINSTANCE.getMAttribute_Comments();

		/**
		 * The meta object literal for the '{@link concrete.impl.MFunctionImpl <em>MFunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MFunctionImpl
		 * @see concrete.impl.ConcretePackageImpl#getMFunction()
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
		 * The meta object literal for the '<em><b>Lst MParameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFUNCTION__LST_MPARAMETER = eINSTANCE.getMFunction_LstMParameter();

		/**
		 * The meta object literal for the '{@link concrete.impl.MParameterImpl <em>MParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MParameterImpl
		 * @see concrete.impl.ConcretePackageImpl#getMParameter()
		 * @generated
		 */
		EClass MPARAMETER = eINSTANCE.getMParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPARAMETER__NAME = eINSTANCE.getMParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPARAMETER__DATA_TYPE = eINSTANCE.getMParameter_DataType();

	}

} //ConcretePackage
