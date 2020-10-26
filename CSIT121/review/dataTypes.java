import java.util.*;
public class dataTypes
{
	public String hi;
	public int hello;
	public Integer[] fuck_you = {1,2,3,4,5};

	
	public static void main (String[] args)
	{
		 HashMap<String, Integer> word_number = new HashMap<String, Integer>();

		word_number.put("holly", 4);
				 ArrayList<Integer> number	= new ArrayList<Integer>(word_number.values());
		 ArrayList<String> word		= new ArrayList<String> (word_number.keySet());
		for (Integer i : word_number.values())
		{
			System.out.println(i);
				
		}
		for(Integer i: number)
		{
				System.out.println(i);
		}
	}











}