import org.eclipse.swt.widgets.Display;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;

public class EditProgramGUI {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void openEditProgram() {
		try {
			EditProgramGUI window = new EditProgramGUI();
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
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(503, 398);
		shell.setText("SWT Application");
		
		Label lblChooseWhichProgram = new Label(shell, SWT.NONE);
		lblChooseWhichProgram.setBounds(10, 10, 264, 25);
		lblChooseWhichProgram.setText("Choose Which Program to Edit");
		
		ComboViewer comboViewer = new ComboViewer(shell, SWT.NONE);
		Combo combo_1 = comboViewer.getCombo();
		combo_1.setBounds(10, 41, 104, 33);

	}
}
