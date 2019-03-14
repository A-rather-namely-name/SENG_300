import org.eclipse.swt.widgets.Display;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import java.awt.Frame;
import org.eclipse.swt.awt.SWT_AWT;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JRootPane;

public class GUI {

	protected Shell shlCourseAndProgram;
	protected Shell shlListCourses;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUI window = new GUI();
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
		shlCourseAndProgram.open();
		shlCourseAndProgram.layout();
		while (!shlCourseAndProgram.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCourseAndProgram = new Shell();
		shlCourseAndProgram.setSize(450, 300);
		shlCourseAndProgram.setText("Course and Program Management");
		
		Button btnListPrograms = new Button(shlCourseAndProgram, SWT.NONE);
		btnListPrograms.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				ListProgramsGUI newListProgramsScreen = new ListProgramsGUI();
				newListProgramsScreen.openListPrograms();
				
			}
		});
		btnListPrograms.setBounds(10, 10, 150, 35);
		btnListPrograms.setText("List Programs");
		
		Button btnAddProgram = new Button(shlCourseAndProgram, SWT.NONE);
		btnAddProgram.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				AddProgramGUI newAddProgramScreen = new AddProgramGUI();
				newAddProgramScreen.openAddProgram();
			}
		});
		btnAddProgram.setBounds(10, 51, 150, 35);
		btnAddProgram.setText("Add Program");
		
		Button btnEditProgram = new Button(shlCourseAndProgram, SWT.NONE);
		btnEditProgram.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				EditProgramGUI newEditProgramScreen = new EditProgramGUI();
				newEditProgramScreen.openEditProgram();
			}
		});
		btnEditProgram.setBounds(10, 92, 150, 35);
		btnEditProgram.setText("Edit Program");
		
		Button btnQuit = new Button(shlCourseAndProgram, SWT.NONE);
		btnQuit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setBounds(10, 133, 150, 35);
		btnQuit.setText("Quit");

	}

	
}
