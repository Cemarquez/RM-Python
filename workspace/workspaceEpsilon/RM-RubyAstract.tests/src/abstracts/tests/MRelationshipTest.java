/**
 */
package abstracts.tests;

import abstracts.AbstractsFactory;
import abstracts.MRelationship;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MRelationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MRelationshipTest extends TestCase {

	/**
	 * The fixture for this MRelationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRelationship fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MRelationshipTest.class);
	}

	/**
	 * Constructs a new MRelationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this MRelationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MRelationship fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this MRelationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRelationship getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractsFactory.eINSTANCE.createMRelationship());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MRelationshipTest
