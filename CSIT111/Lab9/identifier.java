import java.util.Scanner;
import java.lang.Math.*;
public class identifier 
{
	public static void main(String[] args)
	{
		System.out.printf("Please input a number: ");
		Scanner input = new Scanner(System.in);
			if (input.hasNextInt())
			{
				int a = input.nextInt();
				if (a>0)
				{
				System.out.println(a + " is a positive, integer");
	
					if (a % 2 == 0)
					{
						System.out.println(a + " is a positive, even integer");

						
					}
					else
						System.out.println(a + " is a positive, odd integer");
				}
				if (a<0)
				{
				System.out.println(a + " is a negative, integer");
	
					if (a % 2 == 0)
					{
						System.out.println(a + " is a negative, even integer");

						
					}
					else
						System.out.println(a + " is a negative, odd integer");	
				}
			}
			
			
			if (input.hasNextFloat())
			{
				float a = input.nextFloat();
				if ( a >0)
				System.out.println(a +" is a positive, floating number");
				if ( a < 0)
				System.out.println(a + " is a negative, floating number");
			}
	
	}


}