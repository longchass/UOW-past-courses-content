import java.util.Scanner;

public class CheckPassFail
{
	public static void main (String[] args)
	{
		int mark = Integer.parseInt(args[0]);
		if ( mark >= 50)
		{
			System.out.println("PASS");
			System.out.println("DONE");

		}
		else if ( mark < 50)
		{
			System.out.println("FAIL");
			System.out.println("DONE");
		}
	}	
	
	
}