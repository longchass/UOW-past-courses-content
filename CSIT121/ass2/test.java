public class test{

		public static void main (String[] args)
		{
			System.out.println(State.NSW);
			Customer basic = new Customer( "1223232",  "First",  "Last",  "username",  "Pass",  UserType.Customer,  true, new Address("addr", "lol", "4", State.NSW, 1234), new Address("addr", "email", "malo", State.NSW, 123), "la@asdf.ca");
			Guest basic1 = new Guest("23142", "Firstly", "Lastly", "usernamely", "Passly", true, "jia@lol.com");
			basic.setid("2111111");
			System.out.println(basic.getUsername());
			basic.setPassword("123212342134");
			basic1.setEmail("asdm");
			System.out.println(basic.getUserType().returnType());
			basic.setPermission(PermissionType.Edit);
			System.out.println(basic.getPermission());
			System.out.println(basic.getFullName());
			System.out.println(basic.verifyUsernameAndPassword("LoLe", "lolasdfalulelo"));
			System.out.println(basic.verifyUsername("LoLe"));
			System.out.println(basic);


			UserManagement login = new UserManagement();
			System.out.println(login.addUser(basic));
			System.out.println(login.verifyLogIn("username", "sdfasdfasd"));
			System.out.println(login.getUserFullNameByUserName("username"));
			login.changePassword("username", "123212342134", "hellokaa" );
			login.changePassword("username", "123212342134", "hellokaa" );

		}



}