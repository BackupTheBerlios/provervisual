package provervisual.exportWizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

import provervisual.importWizards.ImportWizardPage;

public class ExportWizard extends Wizard implements IExportWizard {

	public ExportWizard() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("File Export Wizard"); //NON-NLS-1
		setNeedsProgressMonitor(true);
	}

}
