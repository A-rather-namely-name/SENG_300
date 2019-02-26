import java.util.*;

public class Program
{
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
}