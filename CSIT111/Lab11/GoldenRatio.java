import java.util.Scanner;
public class GoldenRatio
{
		public static void main(String[] args) {
					Scanner input = new Scanner(System.in);
					System.out.println("******");
					System.out.print("Please input a positive integer number N: ");
					double number = input.nextDouble();
					double result = number;
					int sum = 0;
					System.out.println("The GoldenRatio for " + number + " is: " + goldenratio(number));
					
}
public static double goldenratio (double number) {
					if (number == 0)
						if (number == 0) return 1;
						return 1.0 + 1.0 / goldenratio(number-1);
}
}


	
