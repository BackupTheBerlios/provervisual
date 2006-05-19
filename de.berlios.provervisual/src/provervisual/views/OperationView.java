package provervisual.views;

import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.part.ViewPart;

public class OperationView extends ViewPart {

	private PageBook pagebook;

	private TableViewer viewer;

	private Action doubleClickAction;

	// the listener we register with the selection service
	private ISelectionListener listener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart sourcepart,
				ISelection selection) {
			// we ignore our own selections
			if (sourcepart != OperationView.this) {
				showSelection(sourcepart, selection);
			}
		}
	};

	/**
	 * Shows the given selection in this view.
	 */
	public void showSelection(IWorkbenchPart sourcepart, ISelection selection) {
		// setContentDescription(sourcepart.getTitle() + " (" +
		// selection.getClass().getName() + ")");
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			viewer.setInput(ss);
			pagebook.showPage(viewer.getControl());
		}
	}

	public void createPartControl(Composite parent) {
		// the PageBook allows simple switching between two viewers
		pagebook = new PageBook(parent, SWT.NONE);
		viewer = new TableViewer(pagebook, SWT.NONE);

		// Provide members of a compilation unit or class file, but no working
		// copy elements
		viewer.setContentProvider(new OperationContentProvider());
		// Provide a Label Decorator
		JavaElementLabelProvider label = new JavaElementLabelProvider(
				JavaElementLabelProvider.SHOW_PARAMETERS
						| JavaElementLabelProvider.SHOW_OVERLAY_ICONS
						| JavaElementLabelProvider.SHOW_QUALIFIED);
		viewer.setLabelProvider(label);
		makeActions();

		getSite().setSelectionProvider(viewer);
		getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(listener);

	}

	private void makeActions() {

		doubleClickAction = new Action() {

			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();
				showMessage("Double-click detected on " + obj.toString());
			}
		};

		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	private void showMessage(String message) {

		MessageDialog.openInformation(
		viewer.getControl().getShell(),
		"Operation View",
		message);

	}

	public void setFocus() {
		pagebook.setFocus();
	}

	public void dispose() {
		// important: We need do unregister our listener when the view is
		// disposed
		getSite().getWorkbenchWindow().getSelectionService()
				.removeSelectionListener(listener);
		super.dispose();
	}

}