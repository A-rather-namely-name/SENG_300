import java.util.*;

public class Program
{
	String title = "";
	String desc = "";
	String program_id = "";
	private ArrayList<String> departments;
	private ArrayList<String> electivelist;
	private ArrayList<String> requiredCoursesList;

	public Program()
	{
		//maybe load stuff from a file?
		departments = new ArrayList<String>();
		electivelist = new ArrayList<String>();
		requiredCoursesList = new ArrayList<String>();
	}

	public void addDepartment(String depart)
	{
		departments.add(depart);
	}

	public ArrayList<String> getDepartments()
	{
		return departments;
	}

	public void setProgramTitle(String t) 
	{
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
	
	public void setProgramID(String id)
	{
		this.program_id = id;
	}
	
	public String getProgramID()
	{
		return this.program_id;
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



	//same stuff that was done for Electives for the required courses
	public void listRequiredCourses(){
		if (requiredCoursesList.size() == 0){
			System.out.println("There are no required courses");
		} else {
			for (int i = 0; i < requiredCoursesList.size(); i++ ){
				System.out.println(requiredCoursesList.get(i));
			}
		}
	}

	public void addRequiredCourses(String rc){
		requiredCoursesList.add(rc);
	}

	public void removeRequiredCourses(String rc){
		if (requiredCoursesList.contains(rc)){
			requiredCoursesList.remove(rc);
		} else {
			System.out.println("Required course "+rc+" was not found.");
			System.out.println("Make sure you spelled it correctly.");
		}
	}

	public void displayProgram()
	{
		System.out.println("\nTitle: " + title);

		System.out.println("Description: " + desc);

		System.out.print("Departments: ");
		for(String d: departments)
			System.out.print(d + " ");
		System.out.println();

		System.out.print("Electives: " );
		for(String e: electivelist)
			System.out.print(e + " ");
		System.out.println();

		System.out.print("Required Courses: " );
		for(String e: requiredCoursesList)
			System.out.print(e + " ");
		System.out.println();
	}
}
