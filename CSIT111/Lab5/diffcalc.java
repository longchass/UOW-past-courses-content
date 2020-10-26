import java.util.*;
import java.lang.Math.*;
class diffcalc
{
	public static void main (String [] args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b , c ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int aw = a + b + c;
		System.out.println("Sum: " + aw);
	}
}