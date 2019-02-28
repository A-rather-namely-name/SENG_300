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
	
	public static void edit_program_ID()
	{
		add_id add_id = new add_id();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Which ID code would you like to edit?"); //Expects an ID contained in program_id array
		String id_str = scan.nextLine();
		
		if(add_id.program_id.contains(id_str))
		{
			Scanner scanner= new Scanner(System.in);
			System.out.println("What would you like the new ID to be?"); //Expects an ID contained in program_id array
			String edit_str = scan.nextLine();
			
			int index = add_id.program_id.indexOf(id_str);
			add_id.program_id.remove(index);
			add_id.program_id.add(index, edit_str);
			
			System.out.println("The ID code is now " + add_id.program_id.get(index));
		}
		
		else if(!add_id.program_id.contains(id_str))
		{
			System.out.println("There is no ID code with that name, "
					+ "please enter the ID code of the program you wish to edit.");
			edit_program_ID();
		}
	}
	
	public ArrayList<String> get_program_id()
	{
		return program_id;
	}
	
}
