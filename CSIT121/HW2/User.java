import java.util.*;
import java.lang.String.*;
public abstract class  User{
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
	protected void setid(String input)
	{
		ID = input;
	}
	public String getUsername()
	{
		return Username;
		
	}
	public boolean setPassword(String inputpass)
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
			
			return false;			
		}
		return false
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
		if( Username.equals(username) && Password.equals(password))
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
		if (Username.equals(input))
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
					
				}

			}
			return (User) null;

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

}