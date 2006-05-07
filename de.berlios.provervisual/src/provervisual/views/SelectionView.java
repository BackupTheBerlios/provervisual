package provervisual.views;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.apache.ws.jaxme.js.JavaMethod;
import org.apache.ws.jaxme.js.JavaSource;
import org.apache.ws.jaxme.js.JavaSourceFactory;
import org.apache.ws.jaxme.js.util.JavaParser;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.part.ViewPart;

import antlr.RecognitionException;
import antlr.TokenStreamException;

public class SelectionView extends ViewPart{

	private PageBook pagebook;
	private TableViewer tableviewer;
	
	// the listener we register with the selection service 
	private ISelectionListener listener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart sourcepart, ISelection selection) {
			// we ignore our own selections
			if (sourcepart != SelectionView.this) {
			    showSelection(sourcepart, selection);
			}
		}
	};
	
	/**
	 * Shows the given selection in this view.
	 */
	public void showSelection(IWorkbenchPart sourcepart, ISelection selection) {
		setContentDescription(sourcepart.getTitle() + " (" + selection.getClass().getName() + ")");
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;

			//TODO: Show operations
			List <String>operations = getOperations(ss);
			System.out.println(ss.toArray());
			showOperations(operations);
			//showItems(ss.toArray());
		}
	}
	
	private void showOperations(List <String>items) {

		tableviewer.setInput(items);
		pagebook.showPage(tableviewer.getControl());
	}

	
	private void showItems(Object[] items) {

		tableviewer.setInput(items);
		pagebook.showPage(tableviewer.getControl());
	}
	
	private List <String>getOperations(IStructuredSelection files){

		JavaSourceFactory jsf = new JavaSourceFactory();
		JavaParser jp = new JavaParser(jsf);
		Vector <String>operations = new Vector<String>();
		
		for(Iterator it = files.iterator(); it.hasNext();){
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(((IFile) it.next()).getContents()));
				jp.parse(in);
			} catch (RecognitionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TokenStreamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		for (Iterator iter = jsf.getJavaSources(); iter.hasNext();) {
			JavaSource js = (JavaSource) iter.next();
			System.out.println("Public instance methods of class: "
					+ js.getQName());
			JavaMethod[] methods = js.getMethods();
			for (int i = 0; i < methods.length; i++) {
				if (methods[i].getProtection().equals(JavaSource.PUBLIC)) {
					System.out.println("  " + methods[i].getName());
					operations.add(methods[i].getName());
				}
			}
			System.out.println(js.getQName());
		}
		}
		return operations;
		
	}
	
	public void createPartControl(Composite parent) {
		// the PageBook allows simple switching between two viewers
		pagebook = new PageBook(parent, SWT.NONE);
		
		tableviewer = new TableViewer(pagebook, SWT.NONE);
		
		//TODO: change to OperationContentProvider
		tableviewer.setLabelProvider(new WorkbenchLabelProvider());
		//tableviewer.setContentProvider(new ArrayContentProvider());
		tableviewer.setContentProvider(new OperationContentProvider());
		
		// we're cooperative and also provide our selection
		// at least for the tableviewer
		getSite().setSelectionProvider(tableviewer);
		
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(listener);
	}

	public void setFocus() {
		pagebook.setFocus();
	}

	public void dispose() {
		// important: We need do unregister our listener when the view is disposed
		getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(listener);
		super.dispose();
	}


	
}
