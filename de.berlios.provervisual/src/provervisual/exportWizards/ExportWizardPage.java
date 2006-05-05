package provervisual.exportWizards;

import java.util.Iterator;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.dialogs.WizardExportResourcesPage;

public class ExportWizardPage extends WizardExportResourcesPage {

	protected FileFieldEditor editor;

	Text fileNameField;
	String [] extensions = new String[]{"*.pvtxt"};
	String fileExtension = ".pvtxt";
	IPath filePath;
	IPath source;
	
	Button browseButton;

	public ExportWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setTitle(pageName); // NON-NLS-1
		setDescription("Export a single diagram file"); // NON-NLS-1
	}
	
	/**
	 * Only a simple check if there is only one element selected
	 */
	
	protected boolean validateSourceGroup(){
		
		if(this.getSelectedResources().size() == 1)
			return true;
		else
			return false;
		
	}

	protected void createDestinationGroup(Composite parent) {

		// destination group
		Composite destinationSelectionGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		destinationSelectionGroup.setLayout(layout);
		destinationSelectionGroup.setLayoutData(new GridData(
				GridData.FILL_HORIZONTAL));

		Label label = new Label(destinationSelectionGroup, SWT.NONE);

		// destination filename field
		fileNameField = new Text(destinationSelectionGroup, SWT.BORDER
				| SWT.SINGLE);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		fileNameField.setLayoutData(data);
		// destination browse button
		browseButton = new Button(destinationSelectionGroup, SWT.PUSH);

		browseButton.setText("Select");
		browseButton.addListener(SWT.Selection, this);

	}

	private void handleBrowseButtonPressed() {
		FileDialog dialog = new FileDialog(getContainer().getShell(), SWT.SAVE);
		dialog.setFilterExtensions(extensions);
		dialog.setFileName(fileExtension);
		String fileName = dialog.open();
		if (fileName != null) {
			if (fileName.endsWith(fileExtension)) {
				fileNameField.setText(fileName);
			} else {
				fileNameField.setText(fileName + fileExtension);
			}
		}
		this.filePath = new Path(fileName);
		System.out.println(fileName);
	}

	public void handleEvent(Event event) {
		Widget source = event.widget;
		if (source == browseButton)
			handleBrowseButtonPressed();
		updatePageCompletion();
	}

	public IPath getfilePath() {
		return filePath;
	}

	/*
	 *	Checked in validateSourceGroup 
	 */
	public IPath getSource() {
		Iterator it = this.getSelectedResourcesIterator();
		IResource resource = (IResource) it.next();
		this.source = resource.getLocation();
		return source;
	}
}
