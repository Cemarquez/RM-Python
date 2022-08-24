/**
 */
package diagrama.domain.abstractsyntax;

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
 * @see diagrama.domain.abstractsyntax.AbstractsyntaxFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractsyntaxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstractsyntax";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///diagrama/domain/abstractsyntax.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagrama.domain.abstractsyntax";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractsyntaxPackage eINSTANCE = diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagrama.domain.abstractsyntax.impl.MClassDiagramImpl <em>MClass Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.abstractsyntax.impl.MClassDiagramImpl
	 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMClassDiagram()
	 * @generated
	 */
	int MCLASS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Owned By Abstract Syntax</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX = 0;

	/**
	 * The feature id for the '<em><b>Owned By Concrete Syntax</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX = 1;

	/**
	 * The feature id for the '<em><b>Lst MClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MCLASS = 2;

	/**
	 * The feature id for the '<em><b>Lst MPackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MPACKAGE = 3;

	/**
	 * The feature id for the '<em><b>The Relationship Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY = 4;

	/**
	 * The number of structural features of the '<em>MClass Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link diagrama.domain.abstractsyntax.impl.MAttributeImpl <em>MAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.abstractsyntax.impl.MAttributeImpl
	 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMAttribute()
	 * @generated
	 */
	int MATTRIBUTE = 1;

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
	 * The feature id for the '<em><b>Owned By MClass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__OWNED_BY_MCLASS = 5;

	/**
	 * The number of structural features of the '<em>MAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link diagrama.domain.abstractsyntax.impl.MClassImpl <em>MClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.abstractsyntax.impl.MClassImpl
	 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMClass()
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
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__STEREOTYPE = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__PATH = 5;

	/**
	 * The feature id for the '<em><b>Owned By Class Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__OWNED_BY_CLASS_DIAGRAM = 6;

	/**
	 * The feature id for the '<em><b>Lst MAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MATTRIBUTES = 7;

	/**
	 * The feature id for the '<em><b>Lst MRelationship Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MRELATIONSHIP_SOURCE = 8;

	/**
	 * The feature id for the '<em><b>Lst MRelationship Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MRELATIONSHIP_TARGET = 9;

	/**
	 * The feature id for the '<em><b>Owned By MPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__OWNED_BY_MPACKAGE = 10;

	/**
	 * The feature id for the '<em><b>Lst MRelationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MRELATIONSHIP = 11;

	/**
	 * The feature id for the '<em><b>Lst MFunction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MFUNCTION = 12;

	/**
	 * The number of structural features of the '<em>MClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link diagrama.domain.abstractsyntax.impl.MFunctionImpl <em>MFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.abstractsyntax.impl.MFunctionImpl
	 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMFunction()
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
	 * The meta object id for the '{@link diagrama.domain.abstractsyntax.impl.MPackageImpl <em>MPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.abstractsyntax.impl.MPackageImpl
	 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMPackage()
	 * @generated
	 */
	int MPACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Lst MClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__LST_MCLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Owned By MClass Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__OWNED_BY_MCLASS_DIAGRAM = 3;

	/**
	 * The number of structural features of the '<em>MPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link diagrama.domain.abstractsyntax.impl.MRelationshipImpl <em>MRelationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.abstractsyntax.impl.MRelationshipImpl
	 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMRelationship()
	 * @generated
	 */
	int MRELATIONSHIP = 5;

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
	 * The feature id for the '<em><b>Owned By MClass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__OWNED_BY_MCLASS = 2;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__RELATIONSHIP_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__MULTIPLICITY_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__MULTIPLICITY_TARGET = 5;

	/**
	 * The feature id for the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__SOURCE_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Target Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__TARGET_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Lst Relationship Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP__LST_RELATIONSHIP_FACTORY = 8;

	/**
	 * The number of structural features of the '<em>MRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRELATIONSHIP_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link diagrama.domain.abstractsyntax.impl.RelationshipFactoryImpl <em>Relationship Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.abstractsyntax.impl.RelationshipFactoryImpl
	 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getRelationshipFactory()
	 * @generated
	 */
	int RELATIONSHIP_FACTORY = 6;

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
	 * The meta object id for the '{@link diagrama.domain.abstractsyntax.impl.AbstractSyntaxImpl <em>Abstract Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama.domain.abstractsyntax.impl.AbstractSyntaxImpl
	 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getAbstractSyntax()
	 * @generated
	 */
	int ABSTRACT_SYNTAX = 7;

	/**
	 * The feature id for the '<em><b>Lst MClass Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Owned By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__OWNED_BY_DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Abstract Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link diagrama.domain.abstractsyntax.MClassDiagram <em>MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass Diagram</em>'.
	 * @see diagrama.domain.abstractsyntax.MClassDiagram
	 * @generated
	 */
	EClass getMClassDiagram();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByAbstractSyntax <em>Owned By Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Abstract Syntax</em>'.
	 * @see diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByAbstractSyntax()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_OwnedByAbstractSyntax();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByConcreteSyntax <em>Owned By Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Concrete Syntax</em>'.
	 * @see diagrama.domain.abstractsyntax.MClassDiagram#getOwnedByConcreteSyntax()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_OwnedByConcreteSyntax();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.abstractsyntax.MClassDiagram#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass</em>'.
	 * @see diagrama.domain.abstractsyntax.MClassDiagram#getLstMClass()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMClass();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.abstractsyntax.MClassDiagram#getLstMPackage <em>Lst MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MPackage</em>'.
	 * @see diagrama.domain.abstractsyntax.MClassDiagram#getLstMPackage()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMPackage();

	/**
	 * Returns the meta object for the containment reference '{@link diagrama.domain.abstractsyntax.MClassDiagram#getTheRelationshipFactory <em>The Relationship Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Relationship Factory</em>'.
	 * @see diagrama.domain.abstractsyntax.MClassDiagram#getTheRelationshipFactory()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_TheRelationshipFactory();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.abstractsyntax.MAttribute <em>MAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAttribute</em>'.
	 * @see diagrama.domain.abstractsyntax.MAttribute
	 * @generated
	 */
	EClass getMAttribute();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diagrama.domain.abstractsyntax.MAttribute#getName()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MAttribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see diagrama.domain.abstractsyntax.MAttribute#getDataType()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_DataType();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MAttribute#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see diagrama.domain.abstractsyntax.MAttribute#getAccessModifier()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see diagrama.domain.abstractsyntax.MAttribute#getDefaultValue()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MAttribute#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see diagrama.domain.abstractsyntax.MAttribute#getComments()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Comments();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.abstractsyntax.MAttribute#getOwnedByMClass <em>Owned By MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By MClass</em>'.
	 * @see diagrama.domain.abstractsyntax.MAttribute#getOwnedByMClass()
	 * @see #getMAttribute()
	 * @generated
	 */
	EReference getMAttribute_OwnedByMClass();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.abstractsyntax.MClass <em>MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass
	 * @generated
	 */
	EClass getMClass();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getName()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MClass#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getAccessModifier()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MClass#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getComments()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Comments();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MClass#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getAbstract()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MClass#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getStereotype()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MClass#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getPath()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Path();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.abstractsyntax.MClass#getOwnedByClassDiagram <em>Owned By Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Class Diagram</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getOwnedByClassDiagram()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_OwnedByClassDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.abstractsyntax.MClass#getLstMAttributes <em>Lst MAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MAttributes</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getLstMAttributes()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMAttributes();

	/**
	 * Returns the meta object for the reference list '{@link diagrama.domain.abstractsyntax.MClass#getLstMRelationshipSource <em>Lst MRelationship Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst MRelationship Source</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getLstMRelationshipSource()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMRelationshipSource();

	/**
	 * Returns the meta object for the reference list '{@link diagrama.domain.abstractsyntax.MClass#getLstMRelationshipTarget <em>Lst MRelationship Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst MRelationship Target</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getLstMRelationshipTarget()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMRelationshipTarget();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.abstractsyntax.MClass#getOwnedByMPackage <em>Owned By MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By MPackage</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getOwnedByMPackage()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_OwnedByMPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.abstractsyntax.MClass#getLstMRelationship <em>Lst MRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MRelationship</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getLstMRelationship()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.abstractsyntax.MClass#getLstMFunction <em>Lst MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MFunction</em>'.
	 * @see diagrama.domain.abstractsyntax.MClass#getLstMFunction()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMFunction();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.abstractsyntax.MFunction <em>MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFunction</em>'.
	 * @see diagrama.domain.abstractsyntax.MFunction
	 * @generated
	 */
	EClass getMFunction();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diagrama.domain.abstractsyntax.MFunction#getName()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MFunction#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see diagrama.domain.abstractsyntax.MFunction#getAccessModifier()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see diagrama.domain.abstractsyntax.MFunction#getReturnType()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MFunction#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see diagrama.domain.abstractsyntax.MFunction#getSemantics()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Semantics();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MFunction#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see diagrama.domain.abstractsyntax.MFunction#getComments()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Comments();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see diagrama.domain.abstractsyntax.MFunction#getParameters()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Parameters();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.abstractsyntax.MFunction#getOwnedByMClass <em>Owned By MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By MClass</em>'.
	 * @see diagrama.domain.abstractsyntax.MFunction#getOwnedByMClass()
	 * @see #getMFunction()
	 * @generated
	 */
	EReference getMFunction_OwnedByMClass();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.abstractsyntax.MPackage <em>MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPackage</em>'.
	 * @see diagrama.domain.abstractsyntax.MPackage
	 * @generated
	 */
	EClass getMPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.abstractsyntax.MPackage#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass</em>'.
	 * @see diagrama.domain.abstractsyntax.MPackage#getLstMClass()
	 * @see #getMPackage()
	 * @generated
	 */
	EReference getMPackage_LstMClass();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diagrama.domain.abstractsyntax.MPackage#getName()
	 * @see #getMPackage()
	 * @generated
	 */
	EAttribute getMPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MPackage#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see diagrama.domain.abstractsyntax.MPackage#getPath()
	 * @see #getMPackage()
	 * @generated
	 */
	EAttribute getMPackage_Path();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.abstractsyntax.MPackage#getOwnedByMClassDiagram <em>Owned By MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By MClass Diagram</em>'.
	 * @see diagrama.domain.abstractsyntax.MPackage#getOwnedByMClassDiagram()
	 * @see #getMPackage()
	 * @generated
	 */
	EReference getMPackage_OwnedByMClassDiagram();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.abstractsyntax.MRelationship <em>MRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MRelationship</em>'.
	 * @see diagrama.domain.abstractsyntax.MRelationship
	 * @generated
	 */
	EClass getMRelationship();

	/**
	 * Returns the meta object for the reference '{@link diagrama.domain.abstractsyntax.MRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see diagrama.domain.abstractsyntax.MRelationship#getSource()
	 * @see #getMRelationship()
	 * @generated
	 */
	EReference getMRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link diagrama.domain.abstractsyntax.MRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see diagrama.domain.abstractsyntax.MRelationship#getTarget()
	 * @see #getMRelationship()
	 * @generated
	 */
	EReference getMRelationship_Target();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.abstractsyntax.MRelationship#getOwnedByMClass <em>Owned By MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By MClass</em>'.
	 * @see diagrama.domain.abstractsyntax.MRelationship#getOwnedByMClass()
	 * @see #getMRelationship()
	 * @generated
	 */
	EReference getMRelationship_OwnedByMClass();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MRelationship#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see diagrama.domain.abstractsyntax.MRelationship#getRelationshipType()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_RelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MRelationship#getMultiplicitySource <em>Multiplicity Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Source</em>'.
	 * @see diagrama.domain.abstractsyntax.MRelationship#getMultiplicitySource()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_MultiplicitySource();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MRelationship#getMultiplicityTarget <em>Multiplicity Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target</em>'.
	 * @see diagrama.domain.abstractsyntax.MRelationship#getMultiplicityTarget()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_MultiplicityTarget();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MRelationship#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role</em>'.
	 * @see diagrama.domain.abstractsyntax.MRelationship#getSourceRole()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_SourceRole();

	/**
	 * Returns the meta object for the attribute '{@link diagrama.domain.abstractsyntax.MRelationship#getTargetRole <em>Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Role</em>'.
	 * @see diagrama.domain.abstractsyntax.MRelationship#getTargetRole()
	 * @see #getMRelationship()
	 * @generated
	 */
	EAttribute getMRelationship_TargetRole();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.abstractsyntax.MRelationship#getLstRelationshipFactory <em>Lst Relationship Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Relationship Factory</em>'.
	 * @see diagrama.domain.abstractsyntax.MRelationship#getLstRelationshipFactory()
	 * @see #getMRelationship()
	 * @generated
	 */
	EReference getMRelationship_LstRelationshipFactory();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.abstractsyntax.RelationshipFactory <em>Relationship Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Factory</em>'.
	 * @see diagrama.domain.abstractsyntax.RelationshipFactory
	 * @generated
	 */
	EClass getRelationshipFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.abstractsyntax.RelationshipFactory#getLstMRelationship <em>Lst MRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MRelationship</em>'.
	 * @see diagrama.domain.abstractsyntax.RelationshipFactory#getLstMRelationship()
	 * @see #getRelationshipFactory()
	 * @generated
	 */
	EReference getRelationshipFactory_LstMRelationship();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.abstractsyntax.RelationshipFactory#getLstClassDiagram <em>Lst Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lst Class Diagram</em>'.
	 * @see diagrama.domain.abstractsyntax.RelationshipFactory#getLstClassDiagram()
	 * @see #getRelationshipFactory()
	 * @generated
	 */
	EReference getRelationshipFactory_LstClassDiagram();

	/**
	 * Returns the meta object for class '{@link diagrama.domain.abstractsyntax.AbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Syntax</em>'.
	 * @see diagrama.domain.abstractsyntax.AbstractSyntax
	 * @generated
	 */
	EClass getAbstractSyntax();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama.domain.abstractsyntax.AbstractSyntax#getLstMClassDiagram <em>Lst MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass Diagram</em>'.
	 * @see diagrama.domain.abstractsyntax.AbstractSyntax#getLstMClassDiagram()
	 * @see #getAbstractSyntax()
	 * @generated
	 */
	EReference getAbstractSyntax_LstMClassDiagram();

	/**
	 * Returns the meta object for the container reference '{@link diagrama.domain.abstractsyntax.AbstractSyntax#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Domain</em>'.
	 * @see diagrama.domain.abstractsyntax.AbstractSyntax#getOwnedByDomain()
	 * @see #getAbstractSyntax()
	 * @generated
	 */
	EReference getAbstractSyntax_OwnedByDomain();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractsyntaxFactory getAbstractsyntaxFactory();

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
		 * The meta object literal for the '{@link diagrama.domain.abstractsyntax.impl.MClassDiagramImpl <em>MClass Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.abstractsyntax.impl.MClassDiagramImpl
		 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMClassDiagram()
		 * @generated
		 */
		EClass MCLASS_DIAGRAM = eINSTANCE.getMClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Owned By Abstract Syntax</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX = eINSTANCE.getMClassDiagram_OwnedByAbstractSyntax();

		/**
		 * The meta object literal for the '<em><b>Owned By Concrete Syntax</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX = eINSTANCE.getMClassDiagram_OwnedByConcreteSyntax();

		/**
		 * The meta object literal for the '<em><b>Lst MClass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__LST_MCLASS = eINSTANCE.getMClassDiagram_LstMClass();

		/**
		 * The meta object literal for the '<em><b>Lst MPackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__LST_MPACKAGE = eINSTANCE.getMClassDiagram_LstMPackage();

		/**
		 * The meta object literal for the '<em><b>The Relationship Factory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY = eINSTANCE.getMClassDiagram_TheRelationshipFactory();

		/**
		 * The meta object literal for the '{@link diagrama.domain.abstractsyntax.impl.MAttributeImpl <em>MAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.abstractsyntax.impl.MAttributeImpl
		 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMAttribute()
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
		 * The meta object literal for the '<em><b>Owned By MClass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATTRIBUTE__OWNED_BY_MCLASS = eINSTANCE.getMAttribute_OwnedByMClass();

		/**
		 * The meta object literal for the '{@link diagrama.domain.abstractsyntax.impl.MClassImpl <em>MClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.abstractsyntax.impl.MClassImpl
		 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMClass()
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
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__ABSTRACT = eINSTANCE.getMClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__STEREOTYPE = eINSTANCE.getMClass_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__PATH = eINSTANCE.getMClass_Path();

		/**
		 * The meta object literal for the '<em><b>Owned By Class Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__OWNED_BY_CLASS_DIAGRAM = eINSTANCE.getMClass_OwnedByClassDiagram();

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
		 * The meta object literal for the '<em><b>Owned By MPackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__OWNED_BY_MPACKAGE = eINSTANCE.getMClass_OwnedByMPackage();

		/**
		 * The meta object literal for the '<em><b>Lst MRelationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MRELATIONSHIP = eINSTANCE.getMClass_LstMRelationship();

		/**
		 * The meta object literal for the '<em><b>Lst MFunction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MFUNCTION = eINSTANCE.getMClass_LstMFunction();

		/**
		 * The meta object literal for the '{@link diagrama.domain.abstractsyntax.impl.MFunctionImpl <em>MFunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.abstractsyntax.impl.MFunctionImpl
		 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMFunction()
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
		 * The meta object literal for the '{@link diagrama.domain.abstractsyntax.impl.MPackageImpl <em>MPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.abstractsyntax.impl.MPackageImpl
		 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMPackage()
		 * @generated
		 */
		EClass MPACKAGE = eINSTANCE.getMPackage();

		/**
		 * The meta object literal for the '<em><b>Lst MClass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPACKAGE__LST_MCLASS = eINSTANCE.getMPackage_LstMClass();

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
		 * The meta object literal for the '<em><b>Owned By MClass Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPACKAGE__OWNED_BY_MCLASS_DIAGRAM = eINSTANCE.getMPackage_OwnedByMClassDiagram();

		/**
		 * The meta object literal for the '{@link diagrama.domain.abstractsyntax.impl.MRelationshipImpl <em>MRelationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.abstractsyntax.impl.MRelationshipImpl
		 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMRelationship()
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
		 * The meta object literal for the '<em><b>Owned By MClass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRELATIONSHIP__OWNED_BY_MCLASS = eINSTANCE.getMRelationship_OwnedByMClass();

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
		 * The meta object literal for the '{@link diagrama.domain.abstractsyntax.impl.RelationshipFactoryImpl <em>Relationship Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.abstractsyntax.impl.RelationshipFactoryImpl
		 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getRelationshipFactory()
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
		 * The meta object literal for the '{@link diagrama.domain.abstractsyntax.impl.AbstractSyntaxImpl <em>Abstract Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama.domain.abstractsyntax.impl.AbstractSyntaxImpl
		 * @see diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl#getAbstractSyntax()
		 * @generated
		 */
		EClass ABSTRACT_SYNTAX = eINSTANCE.getAbstractSyntax();

		/**
		 * The meta object literal for the '<em><b>Lst MClass Diagram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM = eINSTANCE.getAbstractSyntax_LstMClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Owned By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SYNTAX__OWNED_BY_DOMAIN = eINSTANCE.getAbstractSyntax_OwnedByDomain();

	}

} //AbstractsyntaxPackage
