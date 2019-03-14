import org.eclipse.swt.widgets.Display;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AddProgramGUI {

	protected Shell shell;
	private Text IDtxt;
	private Text titletxt;
	private Text descriptiontxt;
	private Text departmentstxt;
	private Text electivestxt;
	private Text requiredtxt;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void openAddProgram() {
		try {
			AddProgramGUI window = new AddProgramGUI();
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
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(515, 529);
		shell.setText("SWT Application");
		
		Label lblTitle = new Label(shell, SWT.NONE);
		lblTitle.setBounds(10, 78, 81, 25);
		lblTitle.setText("Title:");
		
		Label lblId = new Label(shell, SWT.NONE);
		lblId.setBounds(10, 10, 81, 25);
		lblId.setText("ID:");
		
		Label lblDescription = new Label(shell, SWT.NONE);
		lblDescription.setBounds(10, 146, 107, 25);
		lblDescription.setText("Description:");
		
		Label lblDepartmentsProgramBelongs = new Label(shell, SWT.NONE);
		lblDepartmentsProgramBelongs.setBounds(10, 214, 485, 25);
		lblDepartmentsProgramBelongs.setText("Departments Program Belongs to Separated by Commas:");
		
		Label lblElectiveCoursesSeparated = new Label(shell, SWT.NONE);
		lblElectiveCoursesSeparated.setBounds(10, 282, 379, 25);
		lblElectiveCoursesSeparated.setText("Elective Courses Separated by Commas:");
		
		Label lblRequiredCoursesSeparated = new Label(shell, SWT.NONE);
		lblRequiredCoursesSeparated.setBounds(10, 350, 345, 25);
		lblRequiredCoursesSeparated.setText("Required Courses Separated by Commas");
		
		IDtxt = new Text(shell, SWT.BORDER);
		IDtxt.setBounds(10, 41, 80, 31);
		
		titletxt = new Text(shell, SWT.BORDER);
		titletxt.setBounds(10, 109, 80, 31);
		
		descriptiontxt = new Text(shell, SWT.BORDER);
		descriptiontxt.setBounds(10, 177, 80, 31);
		
		departmentstxt = new Text(shell, SWT.BORDER);
		departmentstxt.setBounds(10, 245, 80, 31);
		
		electivestxt = new Text(shell, SWT.BORDER);
		electivestxt.setBounds(10, 313, 80, 31);
		
		requiredtxt = new Text(shell, SWT.BORDER);
		requiredtxt.setBounds(10, 381, 80, 31);
		
		Button btnSubmitNewProgram = new Button(shell, SWT.NONE);
		btnSubmitNewProgram.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				/////////////////////////////////////////////////////
				//here the inputs in the text boxes should be added//
				/////////////////////////////////////////////////////
				
				
				shell.dispose();
				
			}
		});
		btnSubmitNewProgram.setBounds(10, 418, 183, 35);
		btnSubmitNewProgram.setText("Submit New Program");

	}
}
