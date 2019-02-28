import java.util.*;

public class Program
{
	String title = "";
	String desc = "";
	private ArrayList<String> departments;
	private ArrayList<String> electivelist;

	public Program()
	{
		//maybe load stuff from a file?
		departments = new ArrayList<String>();
		electivelist =new ArrayList<String>();
	}

	public void addDepartment(String depart)
	{
		departments.add(depart);
	}

	public ArrayList<String> getDepartments()
	{
		return departments;
	}

	public void setProgramTitle(String t) {
		title = t;
	}
	public String getProgramTitle() {
		return title;
	}
	public void setProgramDesc(String d) {
		desc = d;
	}
	public String getProgramDesc() {
		return desc;
	}
	public void list_Electives(){
		//for now just displays on terminal
		if(electivelist.size()==0) {
			System.out.println("there are no electives");
		}else {
			for(int i=0;i<electivelist.size();i++) {
				System.out.println(electivelist.get(i));
			}
		}
	}
	public void add_Elective(String name){
		
		electivelist.add(name);
		//save?
	}
	public void remove_Elective(String name){
		if(electivelist.contains(name)) {
			electivelist.remove(name);
		}else {
			//should display a message on a window but for now its just outputs to terminal
			System.out.println("Elective "+name+" was not found.");
			System.out.println("Make sure you spelled it correctly.");
		}
		//save?
	}
	//we should save the stuff

}
