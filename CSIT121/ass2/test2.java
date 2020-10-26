import java.util.*;
public class test2{

		public static void main (String[] args)
		{


			UserManagement login = new UserManagement();
			login.FileToObject();

			Scanner input = new Scanner(System.in);
			System.out.println("Please input username and password");

			String user;
			String password;
			User loggedinUser = null;
			boolean verify = false;
			do
			{
				
				String in =input.nextLine();
				String[] sp = in.split(",");

				user = sp[0];
				password = sp[1];


				if(login.verifyLogIn(user, password) == true)
				{
					System.out.println("lolalulelo");
					loggedinUser = login.getUser(user, password);
					verify = true;

				}

				if(login.verifyLogIn(user, password) == false)
				{
					System.out.println("Either username or password is incorrect please try again");
				}
			}
			while(verify == false);

			System.out.println("User login sucessful please type the number of the following options");
			System.out.println("1: Display your full name");
			System.out.println("2: Change password");
			System.out.println("3: Lists all Customer emails");
			if(loggedinUser.getUserType() == UserType.Staff)
			{
				System.out.println("4: Sort Customer by options");
				System.out.println("5: Show all VIPs emails");
			}
			int options = input.nextInt();
			input.nextLine();
			if(options == 1)
			{
				System.out.println(login.getUserFullNameByUserName(user));
			}
			else if(options == 2)
			{
				
				System.out.println("please input the followings: username, current password, new password");
				String inc =input.nextLine();
				String[] spc = inc.split(",");
				String cuser = spc[0];
				String cpassword = spc[1];
				String npassword = spc[2];
				boolean loginvalue = false;
				while(loginvalue== false)
				{
					

					if(login.changePassword(cuser, cpassword, npassword) == true)
					{
						loginvalue = true;
					}
				}
			}
			else if(options == 3)
			{
				System.out.println(login.getAllCustomerEmails());
			}


			else if(options == 4 && loggedinUser.getUserType() == UserType.Staff)
			{
				System.out.println("Select from followings options");
				System.out.println("1: sort by username");
				System.out.println("2: sort by first name");
				System.out.println("3: sort by last name");
				int sortops = input.nextInt();
				if(sortops == 1)
				{
					UserManagement.sortedListByUsername(login.getArrayList());
				}
				else if(sortops == 2)
				{
					UserManagement.sortedListByFirstName(login.getArrayList());
				}
				else if(sortops == 3)
				{
					UserManagement.sortedListByLastName(login.getArrayList());
				}
				else
				{
					System.out.println("Option is not valid please try again");
				}

			}
			else if(options == 5 && loggedinUser.getUserType() == UserType.Staff)
			{
				ArrayList<Customer> VipList = Customer.filterOnlyVIPCustomerList(login.getArrayList());
				for(Customer i : VipList)
				{
					System.out.println(i.getEmail());
				}	
			}
			else
			{
				System.out.println("That option is not valid exiting");
			}

		}



}