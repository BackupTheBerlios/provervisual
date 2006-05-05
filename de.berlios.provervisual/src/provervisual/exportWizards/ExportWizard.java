package provervisual.exportWizards;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import provervisual.Protocol;
import provervisual.impl.ProtocolImpl;

public class ExportWizard extends Wizard implements IExportWizard {

	ExportWizardPage mainPage;
	
	public ExportWizard() {
		super();
	}

	public boolean performFinish() {
		IPath file = mainPage.getSource();
        if (file == null)
            return false;
		URI uri = URI.createFileURI(file.toOSString());
		ProtocolImpl protocol = new ProtocolImpl(uri);
        System.out.println(protocol.toString());
        
        return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("File Export Wizard"); //NON-NLS-1
		setNeedsProgressMonitor(true);
		mainPage = new ExportWizardPage("Export Protocol Verification File",selection); //NON-NLS-1

	}
	
	/* (non-Javadoc)
     * @see org.eclipse.jface.wizard.IWizard#addPages()
     */
    public void addPages() {
        super.addPages(); 
        addPage(mainPage);        
    }

}
