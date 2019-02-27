import java.util.ArrayList;
import java.util.Scanner;


public class add_id 
{

	private ArrayList<String> program_id;
	
	public add_id()
	{
		program_id = new ArrayList<String>();
	}
	
	public void add_to_id_array(String id)
	{
		program_id.add(id);
	}
	
	
	public static void create_program_ID()
	{
		add_id add_id = new add_id();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("What would you like the program's ID to be?");
		String id_str = scan.nextLine();
		
		add_id.add_to_id_array(id_str);
		
		System.out.println("The id for this course is now " + id_str);
	}
	
	public ArrayList<String> get_program_id()
	{
		return program_id;
	}
	
}
