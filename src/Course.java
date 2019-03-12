import java.util.ArrayList;

public class Course {
	String title = "";
	String year = "";
	String descr = "";
	String id = "";
	private ArrayList<String> pre_req;
	private ArrayList<String> mutually_exclusive;
	
	public void set_title(String title)
	{
		this.title = title;
	}
	
	public String get_title()
	{
		return this.title;
	}
	
	public void set_year(String year)
	{
		this.year = year;
	}
	
	public String get_year(String year)
	{
		return this.year;
	}
	
	public void set_descr(String descr)
	{
		this.descr = descr;
	}
	
	public String get_descr()
	{
		return this.descr;
	}
	
	public void set_id(String id)
	{
		this.id = id;
	}
	
	public String get_id()
	{
		return this.id;
	}
}

