package provervisual.diagram.providers;

import java.util.Map;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.IPaletteProvider;
import org.eclipse.ui.IEditorPart;
import provervisual.diagram.part.ProVerVisualPaletteFactory;

/**
 * @generated
 */
public class ProVerVisualPaletteProvider extends AbstractProvider implements
		IPaletteProvider {

	/**
	 * @generated
	 */
	public void contributeToPalette(IEditorPart editor, Object content,
			PaletteRoot root, Map predefinedEntries) {
		ProVerVisualPaletteFactory factory = new ProVerVisualPaletteFactory();
		factory.fillPalette(root);
	}

	/**
	 * @generated
	 */
	public void setContributions(IConfigurationElement configElement) {
		// no configuration
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		return false; // all logic is done in the service
	}
}
