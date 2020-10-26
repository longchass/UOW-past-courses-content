public class Student{
	
	String f;
	String l;
	String ID;
	public Student(String f, String l, String ID)
	{
		this.f = f;
		this.l = l;
		this.setID(ID);
	}
	
	public void setID(String input)
	{
		if(input.charAt(0) == '1' && input.length() == 7)
		{
		this.ID = input;
		}
		else
		{
			throw new NullPointerException("wrong ID set again");
			
		}
		
	}
	
	public String getID()
	{
		return ID;
		
	}
	
	public String toString()
	{
		
		return String.format("%s: %s%n%s: %s%n%s: %s", "First name", f,"Last name",l, "ID",ID); 
		
	}

}