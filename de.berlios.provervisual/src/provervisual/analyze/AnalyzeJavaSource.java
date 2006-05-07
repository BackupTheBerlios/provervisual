/**
 * 
 */
package provervisual.analyze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.apache.ws.jaxme.js.JavaMethod;
import org.apache.ws.jaxme.js.JavaSource;
import org.apache.ws.jaxme.js.JavaSourceFactory;
import org.apache.ws.jaxme.js.util.JavaParser;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import antlr.RecognitionException;
import antlr.TokenStreamException;

public class AnalyzeJavaSource {

	public static String getOperationNames() {

		JavaSourceFactory jsf = new JavaSourceFactory();
		JavaParser jp = new JavaParser(jsf);
		IFile file = null;
		StringBuffer names = new StringBuffer();

		try {
			IWorkbenchWindow window = null;
			Display display = Display.getCurrent();
			FileDialog dialog = new FileDialog(display.getActiveShell());
			dialog.open();

			
			window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

			try {
				ISelection selection = window.getSelectionService()
						.getSelection();
				IStructuredSelection structSelection = null;
				if (selection instanceof IStructuredSelection) {
					structSelection = (IStructuredSelection) selection;
					if (structSelection.isEmpty()) {
						//    	handle empty
					} else {
						Object selectionObj = structSelection.getFirstElement();
						if (selectionObj instanceof IFile) {
							//    	handle ICompilationUnit´s
							file = (IFile) selectionObj;
							
						}
					}
				}
			} catch (Throwable e) {
//				IStatus status = new Status(IStatus.ERROR, .getInstance().getDescriptor().getUniqueIdentifier(),
//						IStatus.OK, e.getMessage(), e);
//				ErrorDialog.openError(window.getShell(), "Selection Error",
//						"Error in selection.", status);
			}

			BufferedReader in = new BufferedReader(new InputStreamReader(file.getContents()));
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
					names.append(methods[i].getName());
				}
			}
			System.out.println(js.getQName());
		}
		return names.toString();
	}

}
