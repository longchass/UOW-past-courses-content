import java.lang.Math.*;
public class CircleBugs 
{
	public static void main(String[] args) 
	{
		double r = Double.parseDouble(args[0]);
		double t = Double.parseDouble(args[1]);
		System.out.println("r = " + r + ", t = " + t);
		double c = 2 * Math.PI * r;
		double A = Math.PI * r * r;
		double x = r * Math.cos(t);
		double y = r * Math.sin(t);
		System.out.println("c = " + c );
		System.out.println("A = " + A );
		System.out.println("x = " + x + ", " + "y = " + y );
	}
}
