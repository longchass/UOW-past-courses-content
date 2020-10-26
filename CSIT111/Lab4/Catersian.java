import java.util.Scanner;
import java.lang.Math.*;
class Cartesian 
{
	 public static void main(String[] args) 
	 {
		double r = 0;
		double angle = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the radius: ");
		r = input.nextDouble();
		System.out.print("Please enter the angle: ");
		angle = input.nextDouble();
		double x = r * Math.sin(angle);
		double y = r * Math.cos(angle);
		System.out.println("result x : " + x + " and y: " + y);
	 }
}

