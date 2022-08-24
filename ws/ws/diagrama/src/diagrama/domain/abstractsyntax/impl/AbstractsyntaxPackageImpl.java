/**
 */
package diagrama.domain.abstractsyntax.impl;

import diagrama.diagramaPackage;

import diagrama.domain.DomainPackage;

import diagrama.domain.abstractsyntax.AbstractSyntax;
import diagrama.domain.abstractsyntax.AbstractsyntaxFactory;
import diagrama.domain.abstractsyntax.AbstractsyntaxPackage;
import diagrama.domain.abstractsyntax.MAttribute;
import diagrama.domain.abstractsyntax.MClass;
import diagrama.domain.abstractsyntax.MClassDiagram;
import diagrama.domain.abstractsyntax.MFunction;
import diagrama.domain.abstractsyntax.MPackage;
import diagrama.domain.abstractsyntax.MRelationship;
import diagrama.domain.abstractsyntax.RelationshipFactory;

import diagrama.domain.concretesyntax.ConcretesyntaxPackage;

import diagrama.domain.concretesyntax.impl.ConcretesyntaxPackageImpl;

import diagrama.domain.impl.DomainPackageImpl;

import diagrama.impl.diagramaPackageImpl;

import diagrama.ui.UiPackage;

import diagrama.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractsyntaxPackageImpl extends EPackageImpl implements AbstractsyntaxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mClassDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSyntaxEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see diagrama.domain.abstractsyntax.AbstractsyntaxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AbstractsyntaxPackageImpl() {
		super(eNS_URI, AbstractsyntaxFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AbstractsyntaxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AbstractsyntaxPackage init() {
		if (isInited) return (AbstractsyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractsyntaxPackage.eNS_URI);

		// Obtain or create and register package
		AbstractsyntaxPackageImpl theAbstractsyntaxPackage = (AbstractsyntaxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AbstractsyntaxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AbstractsyntaxPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		diagramaPackageImpl thediagramaPackage = (diagramaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(diagramaPackage.eNS_URI) instanceof diagramaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(diagramaPackage.eNS_URI) : diagramaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		ConcretesyntaxPackageImpl theConcretesyntaxPackage = (ConcretesyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConcretesyntaxPackage.eNS_URI) instanceof ConcretesyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConcretesyntaxPackage.eNS_URI) : ConcretesyntaxPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theAbstractsyntaxPackage.createPackageContents();
		thediagramaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theConcretesyntaxPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theAbstractsyntaxPackage.initializePackageContents();
		thediagramaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theConcretesyntaxPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbstractsyntaxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AbstractsyntaxPackage.eNS_URI, theAbstractsyntaxPackage);
		return theAbstractsyntaxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMClassDiagram() {
		return mClassDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClassDiagram_OwnedByAbstractSyntax() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClassDiagram_OwnedByConcreteSyntax() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClassDiagram_LstMClass() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClassDiagram_LstMPackage() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClassDiagram_TheRelationshipFactory() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAttribute() {
		return mAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMAttribute_Name() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMAttribute_DataType() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMAttribute_AccessModifier() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMAttribute_DefaultValue() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMAttribute_Comments() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAttribute_OwnedByMClass() {
		return (EReference)mAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMClass() {
		return mClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMClass_Name() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMClass_AccessModifier() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMClass_Comments() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMClass_Abstract() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMClass_Stereotype() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMClass_Path() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClass_OwnedByClassDiagram() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClass_LstMAttributes() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClass_LstMRelationshipSource() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClass_LstMRelationshipTarget() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClass_OwnedByMPackage() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClass_LstMRelationship() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClass_LstMFunction() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFunction() {
		return mFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFunction_Name() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFunction_AccessModifier() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFunction_ReturnType() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFunction_Semantics() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFunction_Comments() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMFunction_Parameters() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFunction_OwnedByMClass() {
		return (EReference)mFunctionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMPackage() {
		return mPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPackage_LstMClass() {
		return (EReference)mPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPackage_Name() {
		return (EAttribute)mPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPackage_Path() {
		return (EAttribute)mPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPackage_OwnedByMClassDiagram() {
		return (EReference)mPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMRelationship() {
		return mRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMRelationship_Source() {
		return (EReference)mRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMRelationship_Target() {
		return (EReference)mRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMRelationship_OwnedByMClass() {
		return (EReference)mRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMRelationship_RelationshipType() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMRelationship_MultiplicitySource() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMRelationship_MultiplicityTarget() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMRelationship_SourceRole() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMRelationship_TargetRole() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMRelationship_LstRelationshipFactory() {
		return (EReference)mRelationshipEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipFactory() {
		return relationshipFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipFactory_LstMRelationship() {
		return (EReference)relationshipFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipFactory_LstClassDiagram() {
		return (EReference)relationshipFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSyntax() {
		return abstractSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSyntax_LstMClassDiagram() {
		return (EReference)abstractSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSyntax_OwnedByDomain() {
		return (EReference)abstractSyntaxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxFactory getAbstractsyntaxFactory() {
		return (AbstractsyntaxFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mClassDiagramEClass = createEClass(MCLASS_DIAGRAM);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__OWNED_BY_ABSTRACT_SYNTAX);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__OWNED_BY_CONCRETE_SYNTAX);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__LST_MCLASS);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__LST_MPACKAGE);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__THE_RELATIONSHIP_FACTORY);

		mAttributeEClass = createEClass(MATTRIBUTE);
		createEAttribute(mAttributeEClass, MATTRIBUTE__NAME);
		createEAttribute(mAttributeEClass, MATTRIBUTE__DATA_TYPE);
		createEAttribute(mAttributeEClass, MATTRIBUTE__ACCESS_MODIFIER);
		createEAttribute(mAttributeEClass, MATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(mAttributeEClass, MATTRIBUTE__COMMENTS);
		createEReference(mAttributeEClass, MATTRIBUTE__OWNED_BY_MCLASS);

		mClassEClass = createEClass(MCLASS);
		createEAttribute(mClassEClass, MCLASS__NAME);
		createEAttribute(mClassEClass, MCLASS__ACCESS_MODIFIER);
		createEAttribute(mClassEClass, MCLASS__COMMENTS);
		createEAttribute(mClassEClass, MCLASS__ABSTRACT);
		createEAttribute(mClassEClass, MCLASS__STEREOTYPE);
		createEAttribute(mClassEClass, MCLASS__PATH);
		createEReference(mClassEClass, MCLASS__OWNED_BY_CLASS_DIAGRAM);
		createEReference(mClassEClass, MCLASS__LST_MATTRIBUTES);
		createEReference(mClassEClass, MCLASS__LST_MRELATIONSHIP_SOURCE);
		createEReference(mClassEClass, MCLASS__LST_MRELATIONSHIP_TARGET);
		createEReference(mClassEClass, MCLASS__OWNED_BY_MPACKAGE);
		createEReference(mClassEClass, MCLASS__LST_MRELATIONSHIP);
		createEReference(mClassEClass, MCLASS__LST_MFUNCTION);

		mFunctionEClass = createEClass(MFUNCTION);
		createEAttribute(mFunctionEClass, MFUNCTION__NAME);
		createEAttribute(mFunctionEClass, MFUNCTION__ACCESS_MODIFIER);
		createEAttribute(mFunctionEClass, MFUNCTION__RETURN_TYPE);
		createEAttribute(mFunctionEClass, MFUNCTION__SEMANTICS);
		createEAttribute(mFunctionEClass, MFUNCTION__COMMENTS);
		createEAttribute(mFunctionEClass, MFUNCTION__PARAMETERS);
		createEReference(mFunctionEClass, MFUNCTION__OWNED_BY_MCLASS);

		mPackageEClass = createEClass(MPACKAGE);
		createEReference(mPackageEClass, MPACKAGE__LST_MCLASS);
		createEAttribute(mPackageEClass, MPACKAGE__NAME);
		createEAttribute(mPackageEClass, MPACKAGE__PATH);
		createEReference(mPackageEClass, MPACKAGE__OWNED_BY_MCLASS_DIAGRAM);

		mRelationshipEClass = createEClass(MRELATIONSHIP);
		createEReference(mRelationshipEClass, MRELATIONSHIP__SOURCE);
		createEReference(mRelationshipEClass, MRELATIONSHIP__TARGET);
		createEReference(mRelationshipEClass, MRELATIONSHIP__OWNED_BY_MCLASS);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__RELATIONSHIP_TYPE);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__MULTIPLICITY_SOURCE);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__MULTIPLICITY_TARGET);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__SOURCE_ROLE);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__TARGET_ROLE);
		createEReference(mRelationshipEClass, MRELATIONSHIP__LST_RELATIONSHIP_FACTORY);

		relationshipFactoryEClass = createEClass(RELATIONSHIP_FACTORY);
		createEReference(relationshipFactoryEClass, RELATIONSHIP_FACTORY__LST_MRELATIONSHIP);
		createEReference(relationshipFactoryEClass, RELATIONSHIP_FACTORY__LST_CLASS_DIAGRAM);

		abstractSyntaxEClass = createEClass(ABSTRACT_SYNTAX);
		createEReference(abstractSyntaxEClass, ABSTRACT_SYNTAX__LST_MCLASS_DIAGRAM);
		createEReference(abstractSyntaxEClass, ABSTRACT_SYNTAX__OWNED_BY_DOMAIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConcretesyntaxPackage theConcretesyntaxPackage = (ConcretesyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(ConcretesyntaxPackage.eNS_URI);
		diagramaPackage thediagramaPackage = (diagramaPackage)EPackage.Registry.INSTANCE.getEPackage(diagramaPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mClassDiagramEClass, MClassDiagram.class, "MClassDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMClassDiagram_OwnedByAbstractSyntax(), this.getAbstractSyntax(), this.getAbstractSyntax_LstMClassDiagram(), "ownedByAbstractSyntax", null, 0, 1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_OwnedByConcreteSyntax(), theConcretesyntaxPackage.getConcreteSyntax(), theConcretesyntaxPackage.getConcreteSyntax_LstMClassDiagram(), "ownedByConcreteSyntax", null, 0, 1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_LstMClass(), this.getMClass(), this.getMClass_OwnedByClassDiagram(), "lstMClass", null, 0, -1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_LstMPackage(), this.getMPackage(), this.getMPackage_OwnedByMClassDiagram(), "lstMPackage", null, 0, -1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_TheRelationshipFactory(), this.getRelationshipFactory(), this.getRelationshipFactory_LstClassDiagram(), "theRelationshipFactory", null, 0, 1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAttributeEClass, MAttribute.class, "MAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMAttribute_Name(), thediagramaPackage.getString(), "name", " ", 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_DataType(), thediagramaPackage.getString(), "dataType", " ", 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_AccessModifier(), thediagramaPackage.getString(), "accessModifier", " ", 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_DefaultValue(), thediagramaPackage.getString(), "defaultValue", " ", 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_Comments(), thediagramaPackage.getString(), "comments", " ", 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAttribute_OwnedByMClass(), this.getMClass(), this.getMClass_LstMAttributes(), "ownedByMClass", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mClassEClass, MClass.class, "MClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMClass_Name(), thediagramaPackage.getString(), "name", " ", 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_AccessModifier(), thediagramaPackage.getString(), "accessModifier", " ", 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_Comments(), thediagramaPackage.getString(), "comments", " ", 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_Abstract(), thediagramaPackage.getString(), "abstract", " ", 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_Stereotype(), thediagramaPackage.getString(), "stereotype", " ", 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_Path(), thediagramaPackage.getString(), "path", " ", 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_OwnedByClassDiagram(), this.getMClassDiagram(), this.getMClassDiagram_LstMClass(), "ownedByClassDiagram", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_LstMAttributes(), this.getMAttribute(), this.getMAttribute_OwnedByMClass(), "lstMAttributes", null, 0, -1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_LstMRelationshipSource(), this.getMRelationship(), this.getMRelationship_Source(), "lstMRelationshipSource", null, 0, -1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_LstMRelationshipTarget(), this.getMRelationship(), this.getMRelationship_Target(), "lstMRelationshipTarget", null, 0, -1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_OwnedByMPackage(), this.getMPackage(), this.getMPackage_LstMClass(), "ownedByMPackage", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_LstMRelationship(), this.getMRelationship(), this.getMRelationship_OwnedByMClass(), "lstMRelationship", null, 0, -1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_LstMFunction(), this.getMFunction(), this.getMFunction_OwnedByMClass(), "lstMFunction", null, 0, -1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFunctionEClass, MFunction.class, "MFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMFunction_Name(), thediagramaPackage.getString(), "name", " ", 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_AccessModifier(), thediagramaPackage.getString(), "accessModifier", " ", 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_ReturnType(), thediagramaPackage.getString(), "returnType", " ", 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_Semantics(), thediagramaPackage.getString(), "semantics", " ", 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_Comments(), thediagramaPackage.getString(), "comments", " ", 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_Parameters(), thediagramaPackage.getString(), "parameters", " ", 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFunction_OwnedByMClass(), this.getMClass(), this.getMClass_LstMFunction(), "ownedByMClass", null, 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mPackageEClass, MPackage.class, "MPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMPackage_LstMClass(), this.getMClass(), this.getMClass_OwnedByMPackage(), "lstMClass", null, 0, -1, MPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPackage_Name(), thediagramaPackage.getString(), "name", " ", 0, 1, MPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPackage_Path(), thediagramaPackage.getString(), "path", " ", 0, 1, MPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPackage_OwnedByMClassDiagram(), this.getMClassDiagram(), this.getMClassDiagram_LstMPackage(), "ownedByMClassDiagram", null, 0, 1, MPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mRelationshipEClass, MRelationship.class, "MRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMRelationship_Source(), this.getMClass(), this.getMClass_LstMRelationshipSource(), "source", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRelationship_Target(), this.getMClass(), this.getMClass_LstMRelationshipTarget(), "target", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRelationship_OwnedByMClass(), this.getMClass(), this.getMClass_LstMRelationship(), "ownedByMClass", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_RelationshipType(), thediagramaPackage.getString(), "relationshipType", " ", 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_MultiplicitySource(), thediagramaPackage.getString(), "multiplicitySource", " ", 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_MultiplicityTarget(), thediagramaPackage.getString(), "multiplicityTarget", " ", 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_SourceRole(), thediagramaPackage.getString(), "sourceRole", " ", 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_TargetRole(), thediagramaPackage.getString(), "targetRole", " ", 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRelationship_LstRelationshipFactory(), this.getRelationshipFactory(), this.getRelationshipFactory_LstMRelationship(), "lstRelationshipFactory", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipFactoryEClass, RelationshipFactory.class, "RelationshipFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipFactory_LstMRelationship(), this.getMRelationship(), this.getMRelationship_LstRelationshipFactory(), "lstMRelationship", null, 0, -1, RelationshipFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipFactory_LstClassDiagram(), this.getMClassDiagram(), this.getMClassDiagram_TheRelationshipFactory(), "lstClassDiagram", null, 0, 1, RelationshipFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSyntaxEClass, AbstractSyntax.class, "AbstractSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSyntax_LstMClassDiagram(), this.getMClassDiagram(), this.getMClassDiagram_OwnedByAbstractSyntax(), "lstMClassDiagram", null, 0, -1, AbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSyntax_OwnedByDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_LstAbstractSyntax(), "ownedByDomain", null, 0, 1, AbstractSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AbstractsyntaxPackageImpl
