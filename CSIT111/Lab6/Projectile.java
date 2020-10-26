import java.util.Scanner;
import java.lang.Math.*;
public class Projectile
{
		public static void main (String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.print( "please enter the velocity");
			double velocity = input.nextInt();
			System.out.println("Result" + Trajectory.calculateMaxHeight(velocity));
		}
}