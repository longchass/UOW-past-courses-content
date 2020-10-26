import java.util.Scanner;
import java.lang.Math.*;
class Cartesian 
{
	 public static void main(String[] args) 
	 {
		int r = 0;
		int angle = 0;
		Scanner math = new Scanner(System.in);
		System.out.print("Please enter the radius: ");
		r = math.nextInt();
		System.out.print("Please enter the angle: ");
		angle = math.nextInt();
		double x = r * Math.sin(angle);
		double y = r * Math.cos(angle);
		System.out.println("result " + x + " and " + y);
	 }
}

