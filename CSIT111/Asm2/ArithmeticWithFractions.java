//Student info header
/*------------------------------------------------------
My name: Le Quang Long
My student number: 6482132
My subject Code: CSIT111
My email address: qll998@uowmail.edu.au
Assignment number: 2
-------------------------------------------------------*/

//Importing necessary modules
import java.util.*;
import java.lang.Math;

//Defining the main class
public class ArithmeticWithFractions
{

   private static Fraction sum = new Fraction();
   private static Fraction difference = new Fraction();
   private static Fraction product = new Fraction();
   private static Fraction quotient = new Fraction();
   private static Fraction fraction1 = new Fraction();
   private static Fraction fraction2 = new Fraction();
//Defining main method
   public static void main(String[] args) 
   {

//Taking inputs as Strings
      String input1 = args[0];
      String input2 = args[1];

//Spliting the "/" between the strings and take them into as arrays as [numerator_string, denominator_string]
      String[] Array_input1 = args[0].split("/");
      String[] Array_input2 = args[1].split("/");

/*Parsing the Strings from the array and turning into integer under temporary fraction acting as parameter
for Calculator(fraction1, fraction2)*/
      fraction1.numerator = Integer.parseInt(Array_input1[0]);
      fraction2.numerator = Integer.parseInt(Array_input2[0]);
      fraction1.denominator = Integer.parseInt(Array_input1[1]);
      fraction2.denominator = Integer.parseInt(Array_input2[1]);

//Create a Fraction calculator using the Calculator class template
      Calculator Fraction_calculator = new Calculator(fraction1 , fraction2);

//Calling the methods from the Calculator class to calculate the resulting fractions
      sum = Fraction_calculator.addFractions();
      difference = Fraction_calculator.subtFractions();
      product = Fraction_calculator.multFractions();
      quotient = Fraction_calculator.divFractions();

//Calling the displayResult method with appropiate parameters
      displayResult();

   }

//Defining the displayResult method with appropriate paramaters 
   public static void displayResult()
   {

//Printing out the result of the the calculation
      System.out.println("--- Basic operations with fractions ---");
      System.out.println("The sum: " + fraction1.numerator + "/" + fraction1.denominator + " + " + fraction2.numerator + "/" + fraction2.denominator + " = " + sum.numerator + "/" + sum.denominator);
      System.out.println("The difference: " + fraction1.numerator + "/" + fraction1.denominator +  " - " + fraction2.numerator + "/" + fraction2.denominator + " = " + difference.numerator + "/" + difference.denominator);
      System.out.println("The product: " + fraction1.numerator + "/" + fraction1.denominator +  " * " + fraction2.numerator + "/" + fraction2.denominator + " = " + product.numerator + "/" + product.denominator); 
      System.out.println("The quotient: " + fraction1.numerator + "/" + fraction1.denominator + " / " + fraction2.numerator + "/" + fraction2.denominator + " = " + quotient.numerator + "/" + quotient.denominator);
      System.out.println();
      System.out.println("The program has terminated.");

   }

}

//Define class <<Service Provider>> known as Calculator
class Calculator
{

//Define fr1 and fr2 as Fraction to be used as variables for Calculator
   private Fraction fr1 = new Fraction();
   private Fraction fr2 = new Fraction();

//Allow Calculator to take parameters as Calculator(Fraction, Fraction)
   public Calculator( Fraction fraction1, Fraction fraction2)
   {

//Assigning values for fr1 and fr2
      this.fr1 = fraction1;
      this.fr2 = fraction2;  

   }

//Declares method to calculate common denominator by multiplying 2 denominator
//The common denominator is used for all Fractions method except the Fraction division method
   private int calcCommonDenominator()
   {

      int cd = (fr1.denominator)*(fr2.denominator);
      return cd;

   }

//Declares method to add 2 Fractions
   public Fraction addFractions()
   {

//Create and calculate the resulting fractions
      Fraction sumFraction = new Fraction(0, 0);
      sumFraction.numerator = (fr2.denominator*fr1.numerator) + (fr1.denominator*fr2.numerator);
      sumFraction.denominator = calcCommonDenominator();
      return sumFraction;

   }

//Declares method to subtract 2 Fractions
   public Fraction subtFractions()
   {

//Create and calculate the resulting fractions
      Fraction diffFraction = new Fraction(0, 0);
      diffFraction.numerator = ((fr2.denominator)*(fr1.numerator)) - ((fr1.denominator)*(fr2.numerator));
      diffFraction.denominator = calcCommonDenominator();
      return diffFraction;

   }

//Declares method to multiply 2 Fractions
   public Fraction multFractions()
   {

//Create and calculate the resulting fractions
      Fraction proFraction = new Fraction(0, 0);
      proFraction.numerator = (fr1.numerator)*(fr2.numerator);
      proFraction.denominator = calcCommonDenominator();
      return proFraction;

   }  

//Declares method to divide 2 Fractions
   public Fraction divFractions()
   {

//Create and calculate the resulting fractions only in quotient that we don't need to use common denominator
      Fraction quoFraction = new Fraction(0, 0);
      quoFraction.numerator = (fr1.numerator)*(fr2.denominator);
      quoFraction.denominator = (fr1.denominator)*(fr2.numerator);
      return quoFraction;

   }

}

//Define class <<Data Provider>> known as Fraction including (int numerator, int denominator)
class Fraction
{

   public int numerator;
   public int denominator;
//Allow to create an empty Fraction
   public Fraction()
   {
   }

//letting the Fraction to take parameters as Fraction(int,  int) 
   public Fraction (int num, int de)
   {

      this.numerator= num;
      this.denominator= de;

   }

}


