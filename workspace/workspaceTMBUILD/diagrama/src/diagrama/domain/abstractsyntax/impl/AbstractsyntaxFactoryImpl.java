/**
 */
package diagrama.domain.abstractsyntax.impl;

import diagrama.domain.abstractsyntax.*;

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
public class AbstractsyntaxFactoryImpl extends EFactoryImpl implements AbstractsyntaxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractsyntaxFactory init() {
		try {
			AbstractsyntaxFactory theAbstractsyntaxFactory = (AbstractsyntaxFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractsyntaxPackage.eNS_URI);
			if (theAbstractsyntaxFactory != null) {
				return theAbstractsyntaxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractsyntaxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxFactoryImpl() {
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
			case AbstractsyntaxPackage.MCLASS_DIAGRAM: return createMClassDiagram();
			case AbstractsyntaxPackage.MATTRIBUTE: return createMAttribute();
			case AbstractsyntaxPackage.MCLASS: return createMClass();
			case AbstractsyntaxPackage.MFUNCTION: return createMFunction();
			case AbstractsyntaxPackage.MPACKAGE: return createMPackage();
			case AbstractsyntaxPackage.MRELATIONSHIP: return createMRelationship();
			case AbstractsyntaxPackage.RELATIONSHIP_FACTORY: return createRelationshipFactory();
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX: return createAbstractSyntax();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClassDiagram createMClassDiagram() {
		MClassDiagramImpl mClassDiagram = new MClassDiagramImpl();
		return mClassDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAttribute createMAttribute() {
		MAttributeImpl mAttribute = new MAttributeImpl();
		return mAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass createMClass() {
		MClassImpl mClass = new MClassImpl();
		return mClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFunction createMFunction() {
		MFunctionImpl mFunction = new MFunctionImpl();
		return mFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPackage createMPackage() {
		MPackageImpl mPackage = new MPackageImpl();
		return mPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRelationship createMRelationship() {
		MRelationshipImpl mRelationship = new MRelationshipImpl();
		return mRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipFactory createRelationshipFactory() {
		RelationshipFactoryImpl relationshipFactory = new RelationshipFactoryImpl();
		return relationshipFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSyntax createAbstractSyntax() {
		AbstractSyntaxImpl abstractSyntax = new AbstractSyntaxImpl();
		return abstractSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxPackage getAbstractsyntaxPackage() {
		return (AbstractsyntaxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractsyntaxPackage getPackage() {
		return AbstractsyntaxPackage.eINSTANCE;
	}

} //AbstractsyntaxFactoryImpl
