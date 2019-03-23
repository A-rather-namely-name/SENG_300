import java.util.ArrayList;

import javax.swing.*;  
public class Checks {

	public static String VlaidID(String userInput, ArrayList<Program> programs) {
		boolean valid =true;
		String msg="";
		for (Program p : programs) {
			if(p.getProgramID().equals(userInput)) {
				valid = false;
				msg="ID already used.";
				break;
			}
		}
		//adds some more checks 
		if(valid) {
			return userInput;	
		}else {  
			//JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
			JFrame frame = new JFrame();
			frame.setAlwaysOnTop(true);
			userInput = JOptionPane.showInputDialog(frame, msg+" try again.");
		    
		    userInput=Checks.VlaidID(userInput, programs);
			return userInput;
		}
	}

}
