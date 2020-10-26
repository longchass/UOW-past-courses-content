import java.util.*;
import java.lang.Math.*;
class ASCII
{
	public static void main (String [] args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a");
		int a = input.nextInt();
		System.out.print("Enter b");
		int b = input.nextInt();
		System.out.print("Enter c");
		int c = input.nextInt();
		int aw = a + b + c;
		System.out.println("Sum: " + aw);
	}
}