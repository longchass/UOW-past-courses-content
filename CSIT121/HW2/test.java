public class test {
	
		public static void main(String[] args)
		{
			Teacher basic =	new Teacher("2344567", "Lo", "Le", "LoLe", "lolasdfalulelo", true, "99.99","UNO", "1e4");
			basic.setid("2111111");
			System.out.println(basic.getUsername());
			basic.setPassword("123212342134");
			System.out.println(basic.getUserType().returnType());
			basic.setPermission(PermissionType.Edit);
			System.out.println(basic.getPermission());
			System.out.println(basic.getFullName());
			System.out.println(basic.verifyUsernameAndPassword("LoLe", "lolasdfalulelo"));
			System.out.println(basic.verifyUsername("LoLe"));
			System.out.println(basic);


			UserLoginAndRegistration login = new UserLoginAndRegistration();
			System.out.println(login.addUser(basic));
			System.out.println(login.verifyLogIn("LoLe", "sdfasdfasd"));

			basic.setSchoolName("1232132123");
			System.out.println(basic.getSchoolName());

			
		}
	
	
}