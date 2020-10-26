import java.util.*;
public class Teacher extends SchoolUser
{
	public Teacher(String id, String First, String Last, String username, String Pass, Boolean value, String grade, String schoolname , String CLASS)
	{
		
		super(id,First, Last, username, Pass, UserType.Teacher, value, grade, schoolname, CLASS);


			if(id.charAt(0) == '2' && id.length() == 7)
			{

			}
			else {
				throw new NullPointerException();
			}
		

		
	}
	@Override
	public void setPermission(PermissionType input)
	{
		if (input == PermissionType.Edit || input == PermissionType.None) {
			super.setPermission(input);
		}
		else {
			throw new NullPointerException(); 
		}
	}
	@Override
	protected void setid(String input)
	{
			if(input.charAt(0) == '2' && input.length() == 7)
			{
					super.setid(input);
			}
			else {
				throw new NullPointerException();;
				}
	}


}