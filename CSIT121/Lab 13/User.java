public class User
{
	private String ID;
	private String FirstName;
	private String LastName;
	private int mark;


	public User (String ID, String FirstName, String LastName, int mark)
	{
		this.ID = ID;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.mark = mark;
	
	}
	public void setID(String ID)
	{
		try
		{
		if (ID.length() >= 7)
		{
				throw new NullPointerException();
			
		}
		else
		{
			
				this.ID = ID;
		}
		}
		catch(NullPointerException e)
		{
			
		}
		
	}
	public String getID()
	{
		return ID;
	}
	public String showdata()
	{
		return ID + " " + FirstName + " " + LastName + " " + mark;
	}
	 
}