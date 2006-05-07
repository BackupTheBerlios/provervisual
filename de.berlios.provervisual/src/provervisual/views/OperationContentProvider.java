package provervisual.views;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.apache.ws.jaxme.js.JavaMethod;
import org.apache.ws.jaxme.js.JavaSource;
import org.apache.ws.jaxme.js.JavaSourceFactory;
import org.apache.ws.jaxme.js.util.JavaParser;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;

import provervisual.Operation;

import antlr.RecognitionException;
import antlr.TokenStreamException;

public class OperationContentProvider implements IStructuredContentProvider {

	public Object[] getElements(Object inputElement) {

        if (inputElement instanceof IStructuredSelection ) {
			return (getOperations((IStructuredSelection) inputElement).toArray());
		}
        
	    return null;
		
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

	public void dispose() {

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

}
