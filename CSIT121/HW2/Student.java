import java.util.*;
public class Student extends SchoolUser
{

	Student(String id, String First, String Last, String username, String Pass, UserType user, Boolean value,  String grade, String schoolname , String CLASS)
	{
		
		super(id,First, Last, username, Pass, UserType.Student, value, grade, schoolname, CLASS);


		if(id.charAt(0) == '1' && id.length() == 7)
		{

		}
		else {
			throw new NullPointerException();
		}
		

		
	}
	@Override
	public void setPermission(PermissionType input)
	{
		if (input == PermissionType.Test || input == PermissionType.None) {
			super.setPermission(input);
		}
		else {
			throw new NullPointerException();
		}
	}
		@Override
	protected void setid(String input)
	{
			if(input.charAt(0) == '1' && input.length() == 7)
			{
					super.setid(input);
			}
			else {
				throw new NullPointerException();
				}
	}

}