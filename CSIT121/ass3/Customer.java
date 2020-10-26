import java.util.*;

import javax.lang.model.util.ElementScanner6;

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
		this(id,  First,  Last,  username,  Pass,  user, value, addr, (Address) null, email);
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
				throw new NullPointerException("This id can't be set to a Customer");
				}
	}
	public void setPermission(PermissionType input)
	{
		if (input == PermissionType.Booking || input == PermissionType.None) {
			super.setPermission(input);
		}
		else {
			throw new NullPointerException("you can't set this level of permission for a Customer account");
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
			if (i instanceof Billing) {
				filtered.add((Customer)i);

				
			}
			else
			{
				throw  new NullPointerException("Can't filter the arraylist");
			}
		}
		return filtered;
	}

		protected Object clone() throws CloneNotSupportedException
	{

		Customer user = (Customer)super.clone();
		user.CustomerAddress = (Address) CustomerAddress.clone();
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
	@Override
	public String getData()
	{
		if(super.getBillingAddress() == null)
		return super.getData()+","+super.getUserType()+","+super.getStatus()+","+CustomerAddress.toString()+","+super.getEmail();

		else if(super.getUserType() == UserType.VIP)
		return super.getData()+","+super.getUserType()+","+super.getStatus()+","+CustomerAddress.toString()+","+super.getBillingAddress().toString()+","+super.getEmail();
		else
		return super.getData()+","+super.getUserType()+","+super.getStatus()+","+CustomerAddress.toString()+","+super.getBillingAddress()+","+super.getEmail();
	}
}