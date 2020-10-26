import java.util.*;
import java.lang.Math.*;

class floatcal
{
	public static void main (String [] args)
	{	
		float nA = Float.parseFloat(args[0]);
		double nB = Math.exp(nA);
		int B = (int) nB;
		System.out.println("result " + B);
	}
}