import java.util.Scanner;
public class SumOfDigits
{
		public static void main(String[] args) {
					Scanner input = new Scanner(System.in);
					System.out.println("******");
					System.out.print("Please input a positive integer number N: ");
					int number = input.nextInt();
					int result = number;
					int sum = 0;
					while (number > 0) {
					sum += number % 10;
					number = number / 10;
					
    }
		System.out.println("Sum of all digits of the number " + result + " is: " + sum);
}
}

	
