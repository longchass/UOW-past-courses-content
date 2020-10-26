//Student info header
/*------------------------------------------------------
My name: Le Quang Long
My student number: 6482132
My email address: qll998@uowmail.edu.au
My subject Code: CSIT111
Assignment number: 1
-------------------------------------------------------*/

//Importing necessary modules
import java.util.*;
import java.lang.Math;

//Defining the class and call the main method
public class BlastSafety 
{
	 public static void main(String[] args) 
	 {

		/*Calling user input variables and currently fixed
		variable with data type as double*/

		  double cl = 0;
		  double d = 0;
		  double sl = 0;
		  double ED = 1.2;
		  double FOS = 2.0;
		  
		  System.out.println("- Blast safe distance estimation -");
		/*Creating scanner to take in user input 
		and making scanner to take user input and assigning
		value to variable*/
		  Scanner doubleValue = new Scanner(System.in);

		  System.out.println("Enter the blast parameters");

		  System.out.print("Charge length (m):");
		  cl = doubleValue.nextDouble();

		  System.out.print("Stemming length (m):");
		  sl = doubleValue.nextDouble();

		  System.out.print("borehole diametter (mm):");
		  d = doubleValue.nextDouble();

		/*Defining later variables that need calculating and user input 
		to work wtih */

		  double cclf = (1000 * cl) / d;
		  if (cclf >= 10) {
		   cclf = 10;
		  }

		  double sdob = (sl + 0.0005 * cclf * d) / (0.00923 * Math.pow(((cclf * (Math.pow(d, 3)) * ED)), 0.333));
		//Calculating the safe distance and displaying the result
		  double safe = FOS * 11.0 * Math.pow(sdob, -2.167) * Math.pow(d, 0.667);

		  System.out.println("The blast safe distance is " + Math.round(safe) + " meters");
	 }
}
