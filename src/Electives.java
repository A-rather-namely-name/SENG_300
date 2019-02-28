import java.util.*;
public class Electives {
	//once we have file stuff you wont need a global list, just read the file.
	private static ArrayList<String> electivelist =new ArrayList<String>();

	public static void list_Electives(){
		//for now just displays on terminal
		load_Electives();// doesnt do anything yet
		if(electivelist.size()==0) {
			System.out.println("there are no electives");
		}else {
			for(int i=0;i<electivelist.size();i++) {
				System.out.println(electivelist.get(i));
			}
		}
	}
	public static void add_Elective(String name){
		load_Electives();// doesnt do anything yet
		electivelist.add(name);
		save_Electives();// doesnt do anything yet
	}
	public static void remove_Elective(String name){
		load_Electives();// doesnt do anything yet
		if(electivelist.contains(name)) {
			electivelist.remove(name);
		}else {
			//should display a message on a window but for now its just outputs to terminal
			System.out.println("Elective "+name+" was not found.");
			System.out.println("Make sure you spelled it correctly.");
		}
		save_Electives();// doesnt do anything yet
	}
	private static void save_Electives() {
		//I dont know how we are saving things
	}
	private static void load_Electives() {
		//it should load the electives into the arraylist from a file 
		//and check if the file is empty or not
	}
}
