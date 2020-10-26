import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*; 
import java.util.Collections;

public abstract class Billing extends User 
{
	private Address billingAddress;
	private String email;
	public Billing(String id, String First, String Last, String username, String Pass, UserType user, PermissionType permis, Boolean value, Address billingaddr, String email)
	{
		super( id,  First,  Last,  username,  Pass,  user,  permis,  value);
		this.billingAddress = billingaddr;
		setEmail(email);
	}
	public Billing(String id, String First, String Last, String username, String Pass, UserType user, PermissionType permis, Boolean value, String email)
	{
		this(id,  First,  Last,  username,  Pass,  user,  permis,  value, new Address("1111", "1111", "1111", State.NSW, 1111), email);

	}
	public Billing(String id, String First, String Last, String username, String Pass, UserType user, PermissionType permis, Boolean value)
	{
		this(id,  First,  Last,  username,  Pass,  user,  permis,  value, new Address("1111", "1111", "1111", State.NSW, 1111), "default@default.com");

	}
	public Address getBillingAddress()
	{
		return billingAddress;
	}
	public void setBillingAddress(Address input)
	{
		billingAddress = input;
	}
	public void setEmail(String input)
	{
		if(input.matches("(.*)[@](.*)") && input.matches("(.*)[.](.*)"))
		{
			email = input;
		}
		else
		{
			System.out.println("email is not valid");
		}
	}
	public String getEmail()
	{
		return email;
	}
	@Override
	public String toString()
	{
		fullDetail.append("Billing Address: " + billingAddress).append(System.getProperty("line.separator"));

		return fullDetail.toString();
	}
	protected Object clone() throws CloneNotSupportedException
	{

		Billing billing = (Billing) super.clone();
		billing.billingAddress = (Address) billingAddress.clone();
		return billing;
	}
	public static void sortedListByEmail(ArrayList<Billing> inputlist)
	{
		Comparator<Billing> c = new Comparator<Billing>()
		{
			public int compare (Billing a, Billing b)
			{
				return a.getEmail().compareTo(b.getEmail());
			}
		};
		Collections.sort(inputlist, c);
	}
	public static ArrayList<Billing> filterOnlyBillingList(ArrayList<User> user)

	{
		ArrayList<Billing> BillingList = new ArrayList<Billing>();
		for (User i : user)
		{
			if(i.getUserType() == UserType.Customer || i.getUserType() == UserType.Guest || i.getUserType() == UserType.VIP)
			{
				BillingList.add((Billing)i);
			}
		}
		return  BillingList;
	}
	 
}