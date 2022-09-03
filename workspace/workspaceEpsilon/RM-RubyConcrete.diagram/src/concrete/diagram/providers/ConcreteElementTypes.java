/*
 * 
 */
package concrete.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import concrete.ConcretePackage;
import concrete.diagram.edit.parts.MAttributeEditPart;
import concrete.diagram.edit.parts.MClassDiagramEditPart;
import concrete.diagram.edit.parts.MClassEditPart;
import concrete.diagram.edit.parts.MFunctionEditPart;
import concrete.diagram.edit.parts.MPackageEditPart;
import concrete.diagram.edit.parts.MRelationship2EditPart;
import concrete.diagram.edit.parts.MRelationshipEditPart;
import concrete.diagram.part.ConcreteDiagramEditorPlugin;

/**
 * @generated
 */
public class ConcreteElementTypes {

	/**
	* @generated
	*/
	private ConcreteElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ConcreteDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType MClassDiagram_1000 = getElementType("RM-RubyConcrete.diagram.MClassDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MPackage_2001 = getElementType("RM-RubyConcrete.diagram.MPackage_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MClass_2002 = getElementType("RM-RubyConcrete.diagram.MClass_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MAttribute_3001 = getElementType("RM-RubyConcrete.diagram.MAttribute_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MFunction_3002 = getElementType("RM-RubyConcrete.diagram.MFunction_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MRelationship_4001 = getElementType("RM-RubyConcrete.diagram.MRelationship_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MRelationship_4002 = getElementType("RM-RubyConcrete.diagram.MRelationship_4002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(MClassDiagram_1000, ConcretePackage.eINSTANCE.getMClassDiagram());

			elements.put(MPackage_2001, ConcretePackage.eINSTANCE.getMPackage());

			elements.put(MClass_2002, ConcretePackage.eINSTANCE.getMClass());

			elements.put(MAttribute_3001, ConcretePackage.eINSTANCE.getMAttribute());

			elements.put(MFunction_3002, ConcretePackage.eINSTANCE.getMFunction());

			elements.put(MRelationship_4001, ConcretePackage.eINSTANCE.getMRelationship());

			elements.put(MRelationship_4002, ConcretePackage.eINSTANCE.getMRelationship());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(MClassDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(MPackage_2001);
			KNOWN_ELEMENT_TYPES.add(MClass_2002);
			KNOWN_ELEMENT_TYPES.add(MAttribute_3001);
			KNOWN_ELEMENT_TYPES.add(MFunction_3002);
			KNOWN_ELEMENT_TYPES.add(MRelationship_4001);
			KNOWN_ELEMENT_TYPES.add(MRelationship_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MClassDiagramEditPart.VISUAL_ID:
			return MClassDiagram_1000;
		case MPackageEditPart.VISUAL_ID:
			return MPackage_2001;
		case MClassEditPart.VISUAL_ID:
			return MClass_2002;
		case MAttributeEditPart.VISUAL_ID:
			return MAttribute_3001;
		case MFunctionEditPart.VISUAL_ID:
			return MFunction_3002;
		case MRelationshipEditPart.VISUAL_ID:
			return MRelationship_4001;
		case MRelationship2EditPart.VISUAL_ID:
			return MRelationship_4002;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return concrete.diagram.providers.ConcreteElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return concrete.diagram.providers.ConcreteElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return concrete.diagram.providers.ConcreteElementTypes.getElement(elementTypeAdapter);
		}
	};

}
