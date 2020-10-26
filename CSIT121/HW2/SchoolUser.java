import java.lang.String.*;
public abstract class SchoolUser extends User
{
	private String ClassID;
	private String Grade;
	private String SchoolName;
	public 	SchoolUser(String id, String First, String Last, String username, String Pass, UserType user, Boolean value, String grade, String schoolname, String CLASS)
	{
		super(id,First,Last,username,Pass,user,PermissionType.None, true);
		ClassID=CLASS;
		Grade = grade;
		SchoolName = schoolname;
	}
	public String getClassID()
	{
		return ClassID;
	}
	public void setClassID(String input)
	{
		ClassID = input;
	}
	public String getGrade()
	{
		return Grade;
	}
	public void setGrade(String input)
	{
		Grade = input;
	}
	public String getSchoolName()
	{
		return SchoolName;
	}
	public void setSchoolName(String input)
	{
	
			if (input.matches("(.*)[0-9](.*)") == true)
			{
				
				System.out.println("Can't contain any number");
			}
			else
			{
				SchoolName = input;
			}


	}
	@Override
	public String toString()
	{
		super.toString();
		fullDetail.append("Your ClassID is: " + ClassID).append(System.getProperty("line.separator"));
		fullDetail.append("Your Grade is: " + Grade).append(System.getProperty("line.separator"));
		fullDetail.append("Your degree name is: " + SchoolName).append(System.getProperty("line.separator"));
		return fullDetail.toString();
	}
}