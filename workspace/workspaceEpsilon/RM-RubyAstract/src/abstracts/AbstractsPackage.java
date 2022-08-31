/**
 */
package abstracts;

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
 * @see abstracts.AbstractsFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface AbstractsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstracts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "abstract";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstract";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractsPackage eINSTANCE = abstracts.impl.AbstractsPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstracts.impl.MClassDiagramImpl <em>MClass Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MClassDiagramImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMClassDiagram()
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
	 * The meta object id for the '{@link abstracts.impl.MPackageImpl <em>MPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MPackageImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMPackage()
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
	 * The meta object id for the '{@link abstracts.impl.MClassImpl <em>MClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MClassImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMClass()
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
	 * The number of structural features of the '<em>MClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link abstracts.impl.MRelationshipImpl <em>MRelationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MRelationshipImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMRelationship()
	 * @generated
	 */
	int MRELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__RELATIONSHIP_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__MULTIPLICITY_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__MULTIPLICITY_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__SOURCE_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Target Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__TARGET_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Navegability Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__NAVEGABILITY_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Navegability Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__NAVEGABILITY_TARGET = 6;

	/**
	 * The number of structural features of the '<em>MRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link abstracts.MClassDiagram <em>MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass Diagram</em>'.
	 * @see abstracts.MClassDiagram
	 * @generated
	 */
	EClass getMClassDiagram();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClassDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracts.MClassDiagram#getName()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EAttribute getMClassDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MClassDiagram#getLstMPackage <em>Lst MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MPackage</em>'.
	 * @see abstracts.MClassDiagram#getLstMPackage()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MClassDiagram#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass</em>'.
	 * @see abstracts.MClassDiagram#getLstMClass()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMClass();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MClassDiagram#getLstMRelationship <em>Lst MRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MRelationship</em>'.
	 * @see abstracts.MClassDiagram#getLstMRelationship()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMRelationship();

	/**
	 * Returns the meta object for class '{@link abstracts.MPackage <em>MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPackage</em>'.
	 * @see abstracts.MPackage
	 * @generated
	 */
	EClass getMPackage();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracts.MPackage#getName()
	 * @see #getMPackage()
	 * @generated
	 */
	EAttribute getMPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MPackage#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstracts.MPackage#getPath()
	 * @see #getMPackage()
	 * @generated
	 */
	EAttribute getMPackage_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MPackage#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass</em>'.
	 * @see abstracts.MPackage#getLstMClass()
	 * @see #getMPackage()
	 * @generated
	 */
	EReference getMPackage_LstMClass();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MPackage#getLstMPackage <em>Lst MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MPackage</em>'.
	 * @see abstracts.MPackage#getLstMPackage()
	 * @see #getMPackage()
	 * @generated
	 */
	EReference getMPackage_LstMPackage();

	/**
	 * Returns the meta object for class '{@link abstracts.MClass <em>MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass</em>'.
	 * @see abstracts.MClass
	 * @generated
	 */
	EClass getMClass();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracts.MClass#getName()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClass#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see abstracts.MClass#getAccessModifier()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClass#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see abstracts.MClass#getComments()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Comments();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClass#isAbstracts <em>Abstracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstracts</em>'.
	 * @see abstracts.MClass#isAbstracts()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Abstracts();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClass#getStereoType <em>Stereo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereo Type</em>'.
	 * @see abstracts.MClass#getStereoType()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_StereoType();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClass#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstracts.MClass#getPath()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MClass#getLtsMRelationships <em>Lts MRelationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lts MRelationships</em>'.
	 * @see abstracts.MClass#getLtsMRelationships()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LtsMRelationships();

	/**
	 * Returns the meta object for class '{@link abstracts.MRelationship <em>MRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MRelationship</em>'.
	 * @see abstracts.MRelationship
	 * @generated
	 */
	EClass getMRelationship();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MRelationship#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see abstracts.MRelationship#getRelationshipType()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_RelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MRelationship#getMultiplicitySource <em>Multiplicity Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Source</em>'.
	 * @see abstracts.MRelationship#getMultiplicitySource()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_MultiplicitySource();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MRelationship#getMultiplicityTarget <em>Multiplicity Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target</em>'.
	 * @see abstracts.MRelationship#getMultiplicityTarget()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_MultiplicityTarget();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MRelationship#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role</em>'.
	 * @see abstracts.MRelationship#getSourceRole()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_SourceRole();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MRelationship#getTargetRole <em>Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Role</em>'.
	 * @see abstracts.MRelationship#getTargetRole()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_TargetRole();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MRelationship#getNavegabilitySource <em>Navegability Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegability Source</em>'.
	 * @see abstracts.MRelationship#getNavegabilitySource()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_NavegabilitySource();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MRelationship#getNavegabilityTarget <em>Navegability Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegability Target</em>'.
	 * @see abstracts.MRelationship#getNavegabilityTarget()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_NavegabilityTarget();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractsFactory getAbstractsFactory();

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
		 * The meta object literal for the '{@link abstracts.impl.MClassDiagramImpl <em>MClass Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MClassDiagramImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMClassDiagram()
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
		 * The meta object literal for the '{@link abstracts.impl.MPackageImpl <em>MPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MPackageImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMPackage()
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
		 * The meta object literal for the '{@link abstracts.impl.MClassImpl <em>MClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MClassImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMClass()
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
		 * The meta object literal for the '{@link abstracts.impl.MRelationshipImpl <em>MRelationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MRelationshipImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMRelationship()
		 * @generated
		 */
		EClass MRELATIONSHIP = eINSTANCE.getMRelationship();

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

	}

} //AbstractsPackage
