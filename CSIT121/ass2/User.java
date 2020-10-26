import java.util.*;
import java.lang.String.*;
import java.io.Serializable;
import java.lang.*; 
import java.util.Collections;

public abstract class  User implements Cloneable, Comparable<User>, Serializable{
	private String ID;
	private String FirstName;
	private String LastName;
	private String Username;
	private String Password;
	private UserType UserType;
	private PermissionType Permission;
	private boolean status;
	protected StringBuilder fullDetail = new StringBuilder();
	User(String id, String First, String Last, String username, String Pass, UserType user, PermissionType permis, Boolean value)
	{
		setid(id);
		this.FirstName= First;
		this.LastName= Last;
		this.Username= username;
		setPassword(Pass);
		setUserType(user);
		this.Permission= permis;
		this.status=value;
		
		
	}
	protected Object clone() throws CloneNotSupportedException
	{
		User user = (User)super.clone();
		return user;
	}
	protected void setid(String input)
	{
		ID = input;
	}
	public String getUsername()
	{
		return Username;
		
	}
	public void setPassword(String inputpass)
	{
		try
		{
			if(inputpass.length() < 7)
			{
				throw new NullPointerException();
			}
			else{
				this.Password = inputpass;
			}
		}
		catch(NullPointerException e){
			
			System.out.println("the password is too short");
			
		}
	}
	public String getFirstName()
	{
		return FirstName;
	}
	public void setFirstName(String input)
	{
		if(input.matches("(.*)[0-9](.*)"))
			{
				System.out.println("Name contains numeric please fix it");
			}
		else{
			FirstName = input;
		}
		
	}
	public String getLastName()
	{
		return LastName;
	}
	public void setLastName(String input)
	{
		if(input.matches("(.*)[0-9](.*)"))
			{
				System.out.println("Name contains numeric please fix it");
			}
		else{
			LastName = input;
		}
	}
	public UserType getUserType()
	{
		return UserType;
	}
	public void setUserType(UserType input)
	{
		UserType = input;
	}
	public PermissionType getPermission()
	{
		return Permission;
	}
	public void setPermission(PermissionType input)
	{
		Permission = input;
	}
	public String getFullName()
	{
		return FirstName + " " + LastName;
	}
	public boolean verifyUsernameAndPassword(String username, String password)
	{
		if(Username.equals(username) == true && Password.equals(password)== true)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean verifyUsername(String input)
	{
		if (Username.equals(input) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean verifyPermission(PermissionType input)
	{
		if (Permission == input)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		fullDetail.append("Your id is " + ID).append(System.getProperty("line.separator"));
		fullDetail.append("Your full name is " + FirstName + " " + LastName).append(System.getProperty("line.separator"));
		fullDetail.append("Your UserType is " + UserType).append(System.getProperty("line.separator"));
		fullDetail.append("Your Permission level is " + Permission).append(System.getProperty("line.separator"));
		if(status == true)
			{
		fullDetail.append("Your account status is: active").append(System.getProperty("line.separator"));
			}
		else
			{	
		fullDetail.append("Your account status is: deativated").append(System.getProperty("line.separator"));
			}
		return fullDetail.toString();
	}
	public static User findUserByUsername(ArrayList<User> inputdata, String inputuser)
	{

		for (User i : inputdata)
			{

				if(i.getUsername().equals(inputuser))
				{
					return i;
				}
				else
				{
					System.out.println("Can't find user");
				}

			}
			return (User) null;

	}
	public int compareTo(User input)
	{
		if(ID == input.ID)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public static boolean logInByUsernameAndPassword(ArrayList<User> user, String username, String password)
	{
		for (User i : user) 
		{
			if(i.getUsername() == username && i.Password == password)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	public static ArrayList<User> filterUserByUserType(ArrayList<User> user, UserType type)
	{
		ArrayList<User> userwithtype = new ArrayList<User>();
		for (User i : user ) {
			if(i.getUserType() == type)
			{
				userwithtype.add(i);
			}
		}
		return userwithtype;
	}
	public static boolean verifyLogInByUsernameAndPassword(ArrayList<User> user, String inputuser, String inputpass)
	{
		for(User i : user)
		{
			if(i.verifyUsernameAndPassword(inputuser, inputpass) == true)
			{
				return true;
			}
			else
			{

			}

		}
		return false;
	}
	public static Map<String, User> getMapOfUserWithUsernameAsKey(ArrayList<User> user)
	{
		Map<String, User> map = new HashMap<String, User>();
		for(User i : user)
		{
			String key = i.getUsername();
			User value = i;
			map.put(key, value);
		}
		return map;
	}
	public static Map<String, User> getMapOfUserWithLastNameAsKey(ArrayList<User> user)
	{
		Map<String, User> map = new HashMap<String, User>();
		for(User i : user)
		{
			String key = i.getLastName();
			User value = i;
			map.put(key, value);
		}
		return map;
	}

}