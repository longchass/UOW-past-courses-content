public class Student{
	String id;
	String c;
	String fname;
	String lname;
	public Student(String id, String c, String fname, String lname)
	{
		this.setID(id);
		this.c = c;
		this.fname = fname;
		this.lname = lname;
	}

	public Student(String c, String fname, String lname)
	{
		this("000000", c, fname, lname);
		
		
	}
	
	public void setID(String input)
	{
		if(input.charAt(0) == '0' && input.length() == 7)
		{
		id = input;
		}
		else
		{
			throw new NullPointerException("fuck");
	}
	}
	public String getID()
	{
		return id;
		
	}
	public String toString()
	{	
		return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %s","ID", id, "Class name", c, "First name", fname,"Last name", lname);
	}

}