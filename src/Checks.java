import java.util.ArrayList;

import javax.swing.*;  
public class Checks {

	public static String VlaidID(String userInput, ArrayList<Program> programs) {
		boolean valid =true;
		for (Program p : programs) {
			if(p.getProgramID().equals(userInput)) {
				valid = false;
			}
		}
		if(valid) {
			return userInput;	
		}else {  
			JFrame f;  
			void OptionPaneExample(){  
			f=new JFrame();   
			String name=JOptionPane.showInputDialog(f,"Enter Name"); 
		}
	}

}
