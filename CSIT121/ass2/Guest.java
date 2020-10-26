import java.io.Serializable;
import java.util.ArrayList;
public class Guest extends Billing
{
	Address CustomerAddress;
	Address BillingAddress;
	String email;
	public Guest(String id, String First, String Last, String username, String Pass, Boolean value, String email)
	{
		super(id, First, Last, username, Pass, UserType.Guest, PermissionType.View,  value, email);
		this.email = email;
	}
	public Guest(String id, String First, String Last, String username, String Pass, Boolean value)
	{
		this(id,  First,  Last,  username, Pass, value, "default@default.com");
	}

		protected Object clone() throws CloneNotSupportedException
	{
		Customer user = (Customer)super.clone();
		return user;
	}
	@Override
	public void setid(String input)
	{
			if(input.charAt(0) == '2' && input.length() == 7)
			{
					super.setid(input);
			}
			else {
				System.out.println("This id can't be set to a Guest");
				}
	}
		public void setPermission(PermissionType input)
	{
		if (input == PermissionType.View || input == PermissionType.None) {
			super.setPermission(input);
		}
		else {
			System.out.println("you can't set this level of permission for a Guest account");
		}
	}
		public static ArrayList<Guest> filterOnlyGuestList(ArrayList<User> user)
	{
		ArrayList<Guest> GuestList = new ArrayList<Guest>();
		for (User i : user)
		{
			if(i.getUserType() == UserType.Guest)
			{
				GuestList.add((Guest)i);
			}
		}
		return  GuestList;
	}
}