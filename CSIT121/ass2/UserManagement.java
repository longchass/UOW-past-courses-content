import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*; 
import java.util.Collections;


public class UserManagement
{

	private Map<String, User> usersMap = new HashMap<String, User>();
	private ArrayList<User> ArrayListinput = new ArrayList<User>();
	public UserManagement()
	{

	}
	public ArrayList<User> getArrayList()
	{

		return ArrayListinput;
	}
		public boolean verifyLogIn(String username, String password)
	
	{

			for ( User i : ArrayListinput) {
				if(i.verifyUsernameAndPassword(username, password) == true)
				{
					System.out.println("Welcome: " + i.getUserType());
					return true;

				}
				else {
					return false;
				}
			}
					return false;
	}
	public String getAllCustomerEmails()
	{
		StringBuilder fullDetail = new StringBuilder();
			for ( User i : ArrayListinput) {
				if(i.getUserType() == UserType.Guest || i.getUserType() == UserType.VIP || i.getUserType() == UserType.Customer)
				{
					Billing ibill = (Billing) i;
					fullDetail.append(ibill.getEmail()).append(System.getProperty("line.separator"));
				}
				else
				{

				}
				}
			return fullDetail.toString();

	}
	public User getUser(String username, String password)
	{
				for (User i : ArrayListinput) {
				if(i.verifyUsernameAndPassword(username, password) == true)
				{
					return i;

				}
				else {
				}
				}
				return (User) null;
	}





		public boolean addUser(User inputUser)
	{

		if(ArrayListinput.add(inputUser)==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		public boolean changePassword(String username, String oldPassword, String newPassword)
	{
		for (User i : ArrayListinput)
		{
			if(i.verifyUsernameAndPassword(username, oldPassword) == true)
			{
				i.setPassword(newPassword);
				return true;
			}
			else
			{
				System.out.println("either username or password is not correct try again");
			}
		}
		return false;

	}
		public String getUserFullNameByUserName(String input)
	{
			for (User i : ArrayListinput)
			{
				if(i.getUsername().equals(input))
				{
					return i.getFullName();
				}else
				{

				}
			}
		return (String) null;
	}
		public static void sortedListByFirstName(ArrayList<User> inputlist)
	{
		Comparator<User> c = new Comparator<User>()
		{
			public int compare (User a, User b)
			{
				return a.getFirstName().compareTo(b.getFirstName());
			}
		};
		Collections.sort(inputlist, c);
	}
		public static void sortedListByUsername(ArrayList<User> inputlist)
	{
		Comparator<User> c = new Comparator<User>()
		{
			public int compare (User a, User b)
			{
				return a.getUsername().compareTo(b.getUsername());
			}
		};
		Collections.sort(inputlist, c);
	}
		public static void sortedListByLastName(ArrayList<User> inputlist)
	{
		Comparator<User> c = new Comparator<User>()
		{
			public int compare (User a, User b)
			{
				return a.getLastName().compareTo(b.getLastName());
			}
		};
		Collections.sort(inputlist, c);
	}
	public User findUserByUserName(String input)
	{

		return User.findUserByUsername(ArrayListinput, input);
	}

	public void FileToObject()
	{
		Scanner in = null;
		boolean error = false;
		try
		{
			in = new Scanner(Paths.get("User_database.txt"));
		}
		catch(IOException e)
		{
			error = true;
			System.out.println("Can't find the file");
		}
		if(!error)
		{
			while(in.hasNext())
			{
				
				try{
				String user=in.nextLine();
				String[] sp = user.split(",");
				if(sp.length == 18 )
				{
				State custost = State.valueOf(sp[10]);
				State billst =  State.valueOf(sp[15]);
				Address custo = new Address(sp[7], sp[8], sp[9], custost, Integer.parseInt(sp[11]));
				Address bill =  new Address(sp[12], sp[13], sp[14], billst, Integer.parseInt(sp[16]));
				Customer temp = new Customer(sp[0], sp[1], sp[2], sp[3], sp[4], UserType.valueOf(sp[5]), Boolean.parseBoolean(sp[6]), custo, bill, sp[17]);
				ArrayListinput.add(temp);
				}
				else if (sp.length == 13)
				{
				State custost = State.valueOf(sp[10]);
				Address custo = new Address(sp[7], sp[8], sp[9], custost, Integer.parseInt(sp[11]));
				Customer temp = new Customer(sp[0], sp[1], sp[2], sp[3], sp[4], UserType.valueOf(sp[5]), Boolean.parseBoolean(sp[6]), custo, sp[12]);
				ArrayListinput.add(temp);
				}
				else if (sp.length == 7 && sp[0].charAt(0) == '3')
				{
				Staff temp	 = new Staff(sp[0], sp[1], sp[2], sp[3],sp[4], Boolean.parseBoolean(sp[5]), sp[6]);
				ArrayListinput.add(temp);
				}
				else if (sp.length == 7)
				{
				Guest temp = new Guest(sp[0], sp[1], sp[2], sp[3], sp[4], Boolean.parseBoolean(sp[5]), sp[6]);
				ArrayListinput.add(temp);
				}
				else if (sp.length == 6)
				{
				Guest temp	 = new Guest(sp[0], sp[1], sp[2], sp[3], sp[4], Boolean.parseBoolean(sp[5]));
				ArrayListinput.add(temp);
				}
				}
				catch(NoSuchElementException ex)
            	{
                 System.out.println("Problem reading file. Does the file exsit?");
              	}
				
			}
		}
	}
}