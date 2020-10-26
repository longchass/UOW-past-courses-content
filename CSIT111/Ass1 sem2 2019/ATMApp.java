import java.util.*;
public class ATMApp
{

public static void main (String[] args)
{
	Scanner input = new Scanner(System.in);
	float A = input.nextFloat();
	
	System.out.println(hash(A));
	
	
	
	
}

public static float hash(float x)
{
		float spin = (float) ((x*2654435761f)%(Math.pow(2,32)));
		return spin;
}
}