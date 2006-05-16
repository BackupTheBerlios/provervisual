package provervisual.views;

import org.eclipse.jdt.ui.JavaElementLabels;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * Provides a LabelProvider for the OperationView
 * TODO:
 */
class OperationLabelProvider extends LabelProvider implements ITableLabelProvider {

	public String getColumnText(Object element, int index) {
		String text= JavaElementLabels.getTextLabel(element, JavaElementLabels.ALL_FULLY_QUALIFIED+JavaElementLabels.ALL_DEFAULT);
		if (text.length() > 0) {
			return text;
		}
		return text;
	}

	public Image getColumnImage(Object obj, int index) {
		return getImage(obj);
	}
	
	public Image getImage(Object obj) {
		return PlatformUI.getWorkbench().
				getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
	}
	
}