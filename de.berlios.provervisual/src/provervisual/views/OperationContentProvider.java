package provervisual.views;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
//import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;

/**
 * Provide a ContentProvider for the OperationView TODO:
 */
class OperationContentProvider implements IStructuredContentProvider {

	/**
	 * Returns the elements in the input, which must be either an array or a
	 * <code>Collection</code>.
	 */
	public Object[] getElements(Object inputElement) {

		if (inputElement instanceof IStructuredSelection) {

			Collection<IMethod> methods = new Vector<IMethod>();
			IStructuredSelection items = (IStructuredSelection) inputElement;
			try {

				for (Iterator it = items.iterator(); it.hasNext();) {
					IJavaElement item = (IJavaElement) it.next();

					if (item instanceof ICompilationUnit) {
						ICompilationUnit compUnit = (ICompilationUnit) item;
						IJavaElement elements[] = compUnit.getChildren();
						for (int i = 0; i < elements.length; i++) {
							if (elements[i].getElementType() == IJavaElement.TYPE) {
								IType type = (IType) elements[i];
								IMethod method[] = type.getMethods();
								for (int j = 0; j < method.length; j++) {
									// System.out.println(method[j].getFlags());
									methods.add(method[j]);
								}
							}
						}
					}

					if (item instanceof IClassFile) {
						IClassFile compUnit = (IClassFile) item;
						IJavaElement elements[] = compUnit.getChildren();
						for (int i = 0; i < elements.length; i++) {
							if (elements[i].getElementType() == IJavaElement.TYPE) {
								IType type = (IType) elements[i];
								IMethod method[] = type.getMethods();
								for (int j = 0; j < method.length; j++) {
									// System.out.println(method[j].getFlags());
									methods.add(method[j]);
								}
							}
						}
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return methods.toArray();
		}
		return new Object[0];
	}

	/**
	 * This implementation does nothing.
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// do nothing.
	}

	/**
	 * This implementation does nothing.
	 */
	public void dispose() {
		// do nothing.
	}
}