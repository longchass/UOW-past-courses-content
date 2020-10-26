import java.util.Scanner;
import java.lang.Math.*;
 class Projectile
{
	private static final double G = 9.8;
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println( "please enter the velocity");
		
		double velocity = input.nextInt();
		System.out.println("Result" + Trajectory.calculateMaxHeight(velocity));
		
	}
	public static double calculateMaxHeight(double velocity)
	{
		double input = velocity;
		double hMax = Math.pow(input,2)/(2*G);
		return hMax;
	}
}