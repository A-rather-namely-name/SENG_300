import java.util.*;

public class UI
{

	private ArrayList<Program> programs;
	Scanner input;

	public UI()
	{
		boolean quit = false;
		int selection;
		input = new Scanner(System.in);
		programs = new ArrayList<Program>();

		System.out.println("Welcome to the program management system");

		while(!quit)
		{
			System.out.println("\nPlease Enter your selection from the following:\n");
			System.out.println("1: List all programs");
			System.out.println("2: Add a program");
			System.out.println("3: Edit a program");
			System.out.println("4: Quit the application\n");

			selection = input.nextInt();

			switch(selection)
			{
				case 1: listPrograms();
						break;
				case 2: addProgram();
						break;
				case 3: editProgram();
						break;
				case 4: quit = true;
						break;
				default: System.out.println("Invalid selection");
						break;
			}
		}
	}

	public void listPrograms()
	{
		if(programs.size() == 0)
			System.out.println("\nNo programs added yet");

		for(Program p: programs)
			p.displayProgram();
	}

	public void addProgram()
	{
		String userInput;

		Program program = new Program();

		System.out.println("\nEnter the title of the program");
		input.nextLine();
		userInput = input.nextLine();
		program.setProgramTitle(userInput);

		System.out.println("\nEnter the description of the program");
		userInput = input.nextLine();
		program.setProgramDesc(userInput);

		System.out.println("\nEnter the departments that the program belongs to separated by commas");
		userInput = input.nextLine();
		String[] departments = userInput.split(", ");
		for (String s: departments)
			program.addDepartment(s);

		System.out.println("\nEnter the elective courses that the program offers separated by commas");
		userInput = input.nextLine();
		String[] electives = userInput.split(", ");
		for (String s: electives)
			program.add_Elective(s);

		System.out.println("\nEnter the required courses of the program separated by commas");
		userInput = input.nextLine();
		String[] requiredCourses = userInput.split(", ");
		for (String s: requiredCourses)
			program.addRequiredCourses(s);


		programs.add(program);

		System.out.println("\nProgram entered succesfully");
	}

	public void editProgram()
	{

	}
}
