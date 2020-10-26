import java.util.Scanner;
public class  SumAndAverageAlt
{
		public static void main (String[] args)
		{
			System.out.printf("Please input a positive integer number N: ");
			Scanner input = new Scanner(System.in);
			int     input_int = input.nextInt();
			double sum = 0;
			while (input_int <0) {System.out.println("positive number only please enter again");  System.exit(0);}
			do
			{
				for (int i = 0; i <= input_int; i++) {
				sum += i;
				}
				break;
			}
			while (input_int >= 0);
				System.out.println("the sum from 1 to " + input_int + " is: " + String.format("%.0f", sum ) );
				System.out.println("the average is " + sum/input_int);
		}
	
}