package provervisual.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.wizards.EditorCreationWizard;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

/**
 * @generated
 */
public class ProVerVisualCreationWizard extends EditorCreationWizard {

	/**
	 * @generated
	 */
	public void addPages() {
		super.addPages();
		if (page == null) {
			page = new ProVerVisualCreationWizardPage(getWorkbench(),
					getSelection());
		}
		addPage(page);
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle("New ProVerVisual Diagram"); //$NON-NLS-1$
		setDefaultPageImageDescriptor(provervisual.diagram.part.ProVerVisualDiagramEditorPlugin
				.getBundledImageDescriptor("icons/full/wizban/NewProVerVisual.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}
}
