import java.util.*;

public class Program
{
	String title = "";
	String desc = "";
	private ArrayList<String> departments;

	public Program()
	{
		departments = new ArrayList<String>();
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

}
