import java.lang.Math.*;
import java.util.Scanner;

public class ComputePi
{
	public static void main (String[] args)
	{
	 float PI = 0;

	Scanner input = new java.util.Scanner(System.in); //You can import instead
	System.out.println("Enter number of Terms: ");
	int loops = input.nextInt();
	for (int i = 10000; i > 0; i--) {
      PI += Math.pow(-1, i + 1) / (2 * i - 1); // Calculate series in parenthesis
      if (i == 1) { // When at last number in series, multiply by 4
        PI *= 4;    
        System.out.println(PI); // Print result
    }  
}	

		double pi = Math.PI;
		System.out.println(PI/pi * 100);
	}
}