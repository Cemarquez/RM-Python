/**
 */
package diagrama.impl;

import diagrama.ModelFactory;
import diagrama.diagramaFactory;
import diagrama.diagramaPackage;

import diagrama.domain.DomainPackage;

import diagrama.domain.abstractsyntax.AbstractsyntaxPackage;

import diagrama.domain.abstractsyntax.impl.AbstractsyntaxPackageImpl;

import diagrama.domain.concretesyntax.ConcretesyntaxPackage;

import diagrama.domain.concretesyntax.impl.ConcretesyntaxPackageImpl;

import diagrama.domain.impl.DomainPackageImpl;

import diagrama.ui.UiPackage;

import diagrama.ui.impl.UiPackageImpl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class diagramaPackageImpl extends EPackageImpl implements diagramaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBooleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntegerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCharEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arrayListEDataType = null;

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
	 * @see diagrama.diagramaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private diagramaPackageImpl() {
		super(eNS_URI, diagramaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link diagramaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static diagramaPackage init() {
		if (isInited) return (diagramaPackage)EPackage.Registry.INSTANCE.getEPackage(diagramaPackage.eNS_URI);

		// Obtain or create and register package
		diagramaPackageImpl thediagramaPackage = (diagramaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof diagramaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new diagramaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		AbstractsyntaxPackageImpl theAbstractsyntaxPackage = (AbstractsyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AbstractsyntaxPackage.eNS_URI) instanceof AbstractsyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AbstractsyntaxPackage.eNS_URI) : AbstractsyntaxPackage.eINSTANCE);
		ConcretesyntaxPackageImpl theConcretesyntaxPackage = (ConcretesyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConcretesyntaxPackage.eNS_URI) instanceof ConcretesyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConcretesyntaxPackage.eNS_URI) : ConcretesyntaxPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		thediagramaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theAbstractsyntaxPackage.createPackageContents();
		theConcretesyntaxPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		thediagramaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theAbstractsyntaxPackage.initializePackageContents();
		theConcretesyntaxPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thediagramaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(diagramaPackage.eNS_URI, thediagramaPackage);
		return thediagramaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_TheDomain() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_TheUI() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBooleanObject() {
		return eBooleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDoubleObject() {
		return eDoubleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEIntegerObject() {
		return eIntegerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEList() {
		return eListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEChar() {
		return eCharEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArrayList() {
		return arrayListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public diagramaFactory getdiagramaFactory() {
		return (diagramaFactory)getEFactoryInstance();
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
		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEReference(modelFactoryEClass, MODEL_FACTORY__THE_DOMAIN);
		createEReference(modelFactoryEClass, MODEL_FACTORY__THE_UI);

		// Create data types
		stringEDataType = createEDataType(STRING);
		eBooleanObjectEDataType = createEDataType(EBOOLEAN_OBJECT);
		eDoubleObjectEDataType = createEDataType(EDOUBLE_OBJECT);
		eIntegerObjectEDataType = createEDataType(EINTEGER_OBJECT);
		eListEDataType = createEDataType(ELIST);
		eCharEDataType = createEDataType(ECHAR);
		arrayListEDataType = createEDataType(ARRAY_LIST);
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
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDomainPackage);
		getESubpackages().add(theUiPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactory_TheDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheModelFactory(), "theDomain", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_TheUI(), theUiPackage.getUI(), theUiPackage.getUI_TheModelFactory(), "theUI", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(modelFactoryEClass, this.getModelFactory(), "cargar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "ruta", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelFactoryEClass, null, "salvar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "ruta", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(modelFactoryEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eBooleanObjectEDataType, Boolean.class, "EBooleanObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDoubleObjectEDataType, Double.class, "EDoubleObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eIntegerObjectEDataType, Integer.class, "EIntegerObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eListEDataType, EList.class, "EList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eCharEDataType, char.class, "EChar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(arrayListEDataType, ArrayList.class, "ArrayList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //diagramaPackageImpl
