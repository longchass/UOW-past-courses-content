import java.util.Scanner;
import java.lang.Math.*;

public class Trajectory
{
	private static final double G = 9.8;
	public static double calculateMaxHeight(double velocity)
	{
		double input = velocity;
		double hMax = Math.pow(input,2)/(2*G);
		return hMax;
	}
}
