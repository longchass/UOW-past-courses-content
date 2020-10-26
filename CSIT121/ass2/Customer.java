import java.util.*;
import java.io.Serializable;

public class Customer extends Billing
{
	Address CustomerAddress;
	public Customer(String id, String First, String Last, String username, String Pass, UserType user, Boolean value, Address addr, Address BillingAddress, String email)
	{
		super( id,  First,  Last,  username,  Pass,  user,  PermissionType.Booking,  value,  BillingAddress,  email);
		this.CustomerAddress = addr;
	}
	public Customer(String id, String First, String Last, String username, String Pass, UserType user, Boolean value, Address addr, String email)
	{
		this(id,  First,  Last,  username,  Pass,  user, value, addr, addr, email);
	}
	public Customer(String id, String First, String Last, String username, boolean value, Address addr, String email)
	{
		this(id, First, Last, username, "default", UserType.Customer, value, addr, email);
	}
	@Override
	public void setid(String input)
	{
			if(input.charAt(0) == '1' && input.length() == 7)
			{
					super.setid(input);
			}
			else {
				System.out.println("This id can't be set to a Customer");
				}
	}
	public void setPermission(PermissionType input)
	{
		if (input == PermissionType.Booking || input == PermissionType.None) {
			super.setPermission(input);
		}
		else {
			System.out.println("you can't set this level of permission for a Customer account");
		}
	}

	public Address getCustomerAddress()
	{
		return CustomerAddress;
	}
	public void setCustomerAddress(Address input)
	{
		CustomerAddress = input;
	}
	public ArrayList<Customer> filterOnlyCustomerList(ArrayList<User> input)
	{
		ArrayList<Customer> filtered = new ArrayList<Customer>();
		for (User i : input)
		{
			if (i.getUserType() == UserType.Customer) {
				filtered.add((Customer)i);

				
			}
			else
			{

			}
		}
		return filtered;
	}

		protected Object clone() throws CloneNotSupportedException
	{
		Customer user = (Customer)super.clone();
		return user;
	}
		public static ArrayList<Customer> filterOnlyVIPCustomerList(ArrayList<User> user)
	{
		ArrayList<Customer> VIPlist = new ArrayList<Customer>();
		for (User i : user)
		{
			if(i.getUserType() == UserType.VIP)
			{
				VIPlist.add((Customer)i);
			}
		}
		return  VIPlist;
	}
}