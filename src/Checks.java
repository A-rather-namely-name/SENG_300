import java.util.ArrayList;

import javax.swing.*;  
public class Checks {

	public static String ValidID(String userInput, ArrayList<Program> programs) {
		boolean valid =true;
		String msg="";
		if(userInput == null) {
			return null;
		}
		if(userInput.isEmpty()) {
			valid=false;
			msg="ID cannot be empty.";
		}
		else{
			for (Program p : programs) {
				if(p.getProgramID().equals(userInput)) {
					valid = false;
					msg="ID already used.";
					break;
				}
			}
		}
		if(valid) {
			return userInput;	
		}else {
			JFrame frame = new JFrame();
			frame.setAlwaysOnTop(true);
			userInput = JOptionPane.showInputDialog(frame, msg+" try again.");
		    
		    userInput=Checks.ValidID(userInput, programs);
			return userInput;
		}
	}

	public static String ValidTitle(String userInput, ArrayList<Program> programs) {
		boolean valid =true;
		String msg="";
		if(userInput == null) {
			return null;
		}
		if(userInput.isEmpty()) {
			valid=false;
			msg="Title cannot be empty.";
		}
		else{
			for (Program p : programs) {
				if(p.getProgramTitle().equals(userInput)) {
					valid = false;
					msg="Title already used.";
					break;
				}
			}
		}
		
		if(valid) {
			return userInput;	
		}else {
			JFrame frame = new JFrame();
			frame.setAlwaysOnTop(true);
			userInput = JOptionPane.showInputDialog(frame, msg+" try again.");
		    
		    userInput=Checks.VlaidTitle(userInput, programs);
			return userInput;
		}
	}

	public static void canceled() {
		JOptionPane.showMessageDialog(null, "Process canceled.");
	}
}
