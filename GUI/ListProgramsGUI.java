import org.eclipse.swt.widgets.Display;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;

public class ListProgramsGUI {

	protected Shell shlProgramsList;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void openListPrograms() {
		try {
			ListProgramsGUI window = new ListProgramsGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlProgramsList.open();
		shlProgramsList.layout();
		while (!shlProgramsList.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shlProgramsList = new Shell();
		shlProgramsList.setSize(450, 300);
		shlProgramsList.setText("Programs List");
		
		ComboViewer comboViewer = new ComboViewer(shlProgramsList, SWT.NONE);
		Combo combo = comboViewer.getCombo();
		combo.setBounds(10, 41, 104, 33);
		
		
		Label lblSelectWhichProgram = new Label(shlProgramsList, SWT.NONE);
		lblSelectWhichProgram.setBounds(10, 10, 249, 25);
		lblSelectWhichProgram.setText("Select Which Program to View");
		

	}
}
