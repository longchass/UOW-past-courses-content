import java.util.Scanner;
public class  SumAndAverage
{
		public static void main (String[] args)
		{
			System.out.print("Please input a positive integer number N: ");
			Scanner input = new Scanner(System.in);
			int     input_int = input.nextInt();
			double sum = 0;
			

			
			while (input_int <0) {System.out.println("positive number only please enter again");  break;}
			int i = 0;
			
			while ( input_int >= 0 && i <= input_int)
			{
				
			
					sum += i;
					i++;
					
				
			}
			double average = sum / input_int;
			
			System.out.println("the sum from 1 to " + input_int + " is: " + String.format("%.0f", sum ));
			System.out.printf("the average is " + average );
		}
	
}