import java.util.*;
public class UserLoginAndRegistration
{
	private ArrayList<User> user = new ArrayList<User>();

	public UserLoginAndRegistration()
	{

	}
	public boolean verifyLogIn(String username, String password)
	{

			for (User i : user) {
				if(i.verifyUsernameAndPassword(username, password) == true)
				{
					return true;
				}
				else {
					return false;
				}
			}
					return false;
	}
	public boolean addUser(User inputUser)
	{

		if(user.add(inputUser)==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}