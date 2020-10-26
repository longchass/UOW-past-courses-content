import java.util.Arrays;
import java.util.stream.IntStream;

public class Lambda
{
	public static void main(String[] args)
	{
		int[] values = new int[] {1,2,3,4,5,6,7,8,9,0};
		
		System.out.print("Original values: ");
		IntStream.of(values)
			.forEach(value -> System.out.printf("%d  " , value));
		
		System.out.println();
		
		
		System.out.printf("%nCount: %d%n", IntStream.of(values).count());
	
	}



}