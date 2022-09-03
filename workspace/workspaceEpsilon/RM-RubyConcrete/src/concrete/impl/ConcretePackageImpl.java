/**
 */
package concrete.impl;

import concrete.ConcreteFactory;
import concrete.ConcretePackage;
import concrete.MAttribute;
import concrete.MClass;
import concrete.MClassDiagram;
import concrete.MFunction;
import concrete.MPackage;
import concrete.MParameter;
import concrete.MRelationship;

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
public class ConcretePackageImpl extends EPackageImpl implements ConcretePackage {
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
	private EClass mPackageEClass = null;

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
	private EClass mRelationshipEClass = null;

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
	private EClass mFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mParameterEClass = null;

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
	 * @see concrete.ConcretePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcretePackageImpl() {
		super(eNS_URI, ConcreteFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConcretePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcretePackage init() {
		if (isInited) return (ConcretePackage)EPackage.Registry.INSTANCE.getEPackage(ConcretePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConcretePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConcretePackageImpl theConcretePackage = registeredConcretePackage instanceof ConcretePackageImpl ? (ConcretePackageImpl)registeredConcretePackage : new ConcretePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theConcretePackage.createPackageContents();

		// Initialize created meta-data
		theConcretePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcretePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcretePackage.eNS_URI, theConcretePackage);
		return theConcretePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMClassDiagram() {
		return mClassDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClassDiagram_Name() {
		return (EAttribute)mClassDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClassDiagram_LstMPackage() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClassDiagram_LstMClass() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClassDiagram_LstMRelationship() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMPackage() {
		return mPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMPackage_Name() {
		return (EAttribute)mPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMPackage_Path() {
		return (EAttribute)mPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMPackage_LstMClass() {
		return (EReference)mPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMPackage_LstMPackage() {
		return (EReference)mPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMClass() {
		return mClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClass_Name() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClass_AccessModifier() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClass_Comments() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClass_Abstracts() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClass_StereoType() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClass_Path() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClass_LtsMRelationships() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClass_LstMAttribute() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClass_LstMFunction() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMRelationship() {
		return mRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMRelationship_Source() {
		return (EReference)mRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMRelationship_Target() {
		return (EReference)mRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMRelationship_RelationshipType() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMRelationship_MultiplicitySource() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMRelationship_MultiplicityTarget() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMRelationship_SourceRole() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMRelationship_TargetRole() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMRelationship_NavegabilitySource() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMRelationship_NavegabilityTarget() {
		return (EAttribute)mRelationshipEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMAttribute() {
		return mAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_Name() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_DataType() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_AccessModifier() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_DefaultValue() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_Comments() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMFunction() {
		return mFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMFunction_Name() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMFunction_AccessModifier() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMFunction_ReturnType() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMFunction_Semantics() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMFunction_Comments() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMFunction_LstMParameter() {
		return (EReference)mFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMParameter() {
		return mParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMParameter_Name() {
		return (EAttribute)mParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMParameter_DataType() {
		return (EAttribute)mParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcreteFactory getConcreteFactory() {
		return (ConcreteFactory)getEFactoryInstance();
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
		createEAttribute(mClassDiagramEClass, MCLASS_DIAGRAM__NAME);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__LST_MPACKAGE);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__LST_MCLASS);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__LST_MRELATIONSHIP);

		mPackageEClass = createEClass(MPACKAGE);
		createEAttribute(mPackageEClass, MPACKAGE__NAME);
		createEAttribute(mPackageEClass, MPACKAGE__PATH);
		createEReference(mPackageEClass, MPACKAGE__LST_MCLASS);
		createEReference(mPackageEClass, MPACKAGE__LST_MPACKAGE);

		mClassEClass = createEClass(MCLASS);
		createEAttribute(mClassEClass, MCLASS__NAME);
		createEAttribute(mClassEClass, MCLASS__ACCESS_MODIFIER);
		createEAttribute(mClassEClass, MCLASS__COMMENTS);
		createEAttribute(mClassEClass, MCLASS__ABSTRACTS);
		createEAttribute(mClassEClass, MCLASS__STEREO_TYPE);
		createEAttribute(mClassEClass, MCLASS__PATH);
		createEReference(mClassEClass, MCLASS__LTS_MRELATIONSHIPS);
		createEReference(mClassEClass, MCLASS__LST_MATTRIBUTE);
		createEReference(mClassEClass, MCLASS__LST_MFUNCTION);

		mRelationshipEClass = createEClass(MRELATIONSHIP);
		createEReference(mRelationshipEClass, MRELATIONSHIP__SOURCE);
		createEReference(mRelationshipEClass, MRELATIONSHIP__TARGET);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__RELATIONSHIP_TYPE);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__MULTIPLICITY_SOURCE);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__MULTIPLICITY_TARGET);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__SOURCE_ROLE);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__TARGET_ROLE);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__NAVEGABILITY_SOURCE);
		createEAttribute(mRelationshipEClass, MRELATIONSHIP__NAVEGABILITY_TARGET);

		mAttributeEClass = createEClass(MATTRIBUTE);
		createEAttribute(mAttributeEClass, MATTRIBUTE__NAME);
		createEAttribute(mAttributeEClass, MATTRIBUTE__DATA_TYPE);
		createEAttribute(mAttributeEClass, MATTRIBUTE__ACCESS_MODIFIER);
		createEAttribute(mAttributeEClass, MATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(mAttributeEClass, MATTRIBUTE__COMMENTS);

		mFunctionEClass = createEClass(MFUNCTION);
		createEAttribute(mFunctionEClass, MFUNCTION__NAME);
		createEAttribute(mFunctionEClass, MFUNCTION__ACCESS_MODIFIER);
		createEAttribute(mFunctionEClass, MFUNCTION__RETURN_TYPE);
		createEAttribute(mFunctionEClass, MFUNCTION__SEMANTICS);
		createEAttribute(mFunctionEClass, MFUNCTION__COMMENTS);
		createEReference(mFunctionEClass, MFUNCTION__LST_MPARAMETER);

		mParameterEClass = createEClass(MPARAMETER);
		createEAttribute(mParameterEClass, MPARAMETER__NAME);
		createEAttribute(mParameterEClass, MPARAMETER__DATA_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mClassDiagramEClass, MClassDiagram.class, "MClassDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMClassDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_LstMPackage(), this.getMPackage(), null, "lstMPackage", null, 0, -1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_LstMClass(), this.getMClass(), null, "lstMClass", null, 0, -1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_LstMRelationship(), this.getMRelationship(), null, "lstMRelationship", null, 0, -1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mPackageEClass, MPackage.class, "MPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, MPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPackage_Path(), ecorePackage.getEString(), "path", null, 0, 1, MPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPackage_LstMClass(), this.getMClass(), null, "lstMClass", null, 0, -1, MPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPackage_LstMPackage(), this.getMPackage(), null, "lstMPackage", null, 0, -1, MPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mClassEClass, MClass.class, "MClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_AccessModifier(), ecorePackage.getEString(), "accessModifier", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_Abstracts(), ecorePackage.getEBoolean(), "abstracts", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_StereoType(), ecorePackage.getEString(), "stereoType", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_Path(), ecorePackage.getEString(), "path", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_LtsMRelationships(), this.getMRelationship(), null, "ltsMRelationships", null, 0, -1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_LstMAttribute(), this.getMAttribute(), null, "lstMAttribute", null, 0, -1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_LstMFunction(), this.getMFunction(), null, "lstMFunction", null, 0, -1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mRelationshipEClass, MRelationship.class, "MRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMRelationship_Source(), this.getMClass(), null, "source", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMRelationship_Target(), this.getMClass(), null, "target", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_RelationshipType(), ecorePackage.getEString(), "relationshipType", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_MultiplicitySource(), ecorePackage.getEString(), "multiplicitySource", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_MultiplicityTarget(), ecorePackage.getEString(), "multiplicityTarget", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_SourceRole(), ecorePackage.getEString(), "sourceRole", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_TargetRole(), ecorePackage.getEString(), "targetRole", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_NavegabilitySource(), ecorePackage.getEString(), "navegabilitySource", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMRelationship_NavegabilityTarget(), ecorePackage.getEString(), "navegabilityTarget", null, 0, 1, MRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAttributeEClass, MAttribute.class, "MAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_AccessModifier(), ecorePackage.getEString(), "accessModifier", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFunctionEClass, MFunction.class, "MFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_AccessModifier(), ecorePackage.getEString(), "accessModifier", null, 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_Semantics(), ecorePackage.getEString(), "semantics", null, 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFunction_LstMParameter(), this.getMParameter(), null, "lstMParameter", null, 0, -1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterEClass, MParameter.class, "MParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, MParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMParameter_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, MParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (mClassDiagramEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (mPackageEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
		addAnnotation
		  (mClassEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
		addAnnotation
		  (mAttributeEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
		addAnnotation
		  (mFunctionEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getMClass_LstMAttribute(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMClass_LstMFunction(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (mRelationshipEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "dot",
			   "width", "2"
		   });
	}

} //ConcretePackageImpl
