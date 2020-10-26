import java.util.Scanner;
public class SumOfDigitsAlt
{
		public static void main(String[] args) {
					Scanner input = new Scanner(System.in);
					System.out.println("******");
					System.out.print("Please input a positive integer number N: ");
					int number = input.nextInt();
					int result = number;
					int sum = 0;
					System.out.println("Sum of all digits of the number " + number + " is: " + sumofdigits(number));
					
}
public static int sumofdigits (int number) {
					if (number == 0)
					{
						return 0;
					}
					else
					{
					int digit = number % 10;
					number = number / 10;
					return (sumofdigits(number) + digit);
					}
					
    }
}



	
