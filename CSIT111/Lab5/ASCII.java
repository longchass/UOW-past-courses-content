import java.util.*;

class ASCII
{
	public static void main (String [] args)
	{	
		System.out.println("input pls");
		Scanner input = new Scanner(System.in);
		char lowercase = input.next().charAt(0);
		lowercase += 32;
		System.out.println(lowercase);
	}
}