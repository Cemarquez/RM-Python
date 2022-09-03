/**
 */
package concrete.impl;

import concrete.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcreteFactoryImpl extends EFactoryImpl implements ConcreteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcreteFactory init() {
		try {
			ConcreteFactory theConcreteFactory = (ConcreteFactory)EPackage.Registry.INSTANCE.getEFactory(ConcretePackage.eNS_URI);
			if (theConcreteFactory != null) {
				return theConcreteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConcreteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConcretePackage.MCLASS_DIAGRAM: return createMClassDiagram();
			case ConcretePackage.MPACKAGE: return createMPackage();
			case ConcretePackage.MCLASS: return createMClass();
			case ConcretePackage.MRELATIONSHIP: return createMRelationship();
			case ConcretePackage.MATTRIBUTE: return createMAttribute();
			case ConcretePackage.MFUNCTION: return createMFunction();
			case ConcretePackage.MPARAMETER: return createMParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MClassDiagram createMClassDiagram() {
		MClassDiagramImpl mClassDiagram = new MClassDiagramImpl();
		return mClassDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPackage createMPackage() {
		MPackageImpl mPackage = new MPackageImpl();
		return mPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MClass createMClass() {
		MClassImpl mClass = new MClassImpl();
		return mClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MRelationship createMRelationship() {
		MRelationshipImpl mRelationship = new MRelationshipImpl();
		return mRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAttribute createMAttribute() {
		MAttributeImpl mAttribute = new MAttributeImpl();
		return mAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFunction createMFunction() {
		MFunctionImpl mFunction = new MFunctionImpl();
		return mFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MParameter createMParameter() {
		MParameterImpl mParameter = new MParameterImpl();
		return mParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcretePackage getConcretePackage() {
		return (ConcretePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConcretePackage getPackage() {
		return ConcretePackage.eINSTANCE;
	}

} //ConcreteFactoryImpl
