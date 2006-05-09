package provervisual.diagram.part;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteSeparator;

import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import provervisual.diagram.providers.ProVerVisualElementTypes;

/**
 * @generated
 */
public class ProVerVisualPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createprovervisual1Group());
	}

	/**
	 * @generated
	 */
	private PaletteContainer createprovervisual1Group() {
		PaletteContainer paletteContainer = createContainer("provervisual");
		paletteContainer.add(createInitialState1001CreationTool());
		paletteContainer.add(createFinalState1002CreationTool());
		paletteContainer.add(createActionState1003CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createOperation2001CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialState1001CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = ProVerVisualElementTypes
				.getImageDescriptor(ProVerVisualElementTypes.InitialState_1001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(ProVerVisualElementTypes.InitialState_1001);
		return new ToolEntry("InitialState", "Create new InitialState",
				smallImage, largeImage) {
			public Tool createTool() {
				Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinalState1002CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = ProVerVisualElementTypes
				.getImageDescriptor(ProVerVisualElementTypes.FinalState_1002);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(ProVerVisualElementTypes.FinalState_1002);
		return new ToolEntry("FinalState", "Create new FinalState", smallImage,
				largeImage) {
			public Tool createTool() {
				Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionState1003CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = ProVerVisualElementTypes
				.getImageDescriptor(ProVerVisualElementTypes.ActionState_1003);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(ProVerVisualElementTypes.ActionState_1003);
		return new ToolEntry("ActionState", "Create new ActionState",
				smallImage, largeImage) {
			public Tool createTool() {
				Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation2001CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = ProVerVisualElementTypes
				.getImageDescriptor(ProVerVisualElementTypes.Operation_3001);

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(ProVerVisualElementTypes.Operation_3001);
		return new ToolEntry("Operation", "Create new operation", smallImage,
				largeImage) {

			public Tool createTool() {
				Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
				tool.setProperties(getToolProperties());
				return tool;
			}
		};
	}

	/**
	 * @generated
	 */
	private PaletteContainer createContainer(String title) {
		return new PaletteDrawer(title);
	}

}
