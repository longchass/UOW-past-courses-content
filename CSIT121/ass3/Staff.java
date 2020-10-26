import java.io.Serializable;
import java.util.ArrayList;
public class Staff extends User
{

	String position;
	public Staff(String id, String First, String Last, String username, String Pass, Boolean value, String position)
	{
		super(id,First,Last,username,Pass,UserType.Staff,PermissionType.Edit,value);
		this.position = position;
	}


		protected Object clone() throws CloneNotSupportedException
	{
		Staff user = (Staff)super.clone();
		return user;
	}
	@Override
	public void setid(String input)
	{
			if(input.charAt(0) == '3' && input.length() == 7)
			{
					super.setid(input);
			}
			else {
				throw new NullPointerException("This id can't be set to a Staff");
				}
	}
		public void setPermission(PermissionType input)
	{
		if (input == PermissionType.Edit || input == PermissionType.None) {
			super.setPermission(input);
		}
		else {
			throw new NullPointerException("you can't set this level of permission for a Staff account");
		}
	}
	@Override
	public String getData()
	{
		return super.getData()+","+super.getStatus()+","+position;
	}
}