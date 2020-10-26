

import java.util.*;
public class FindBiggestAlt {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("input any numbers, as many times as you like, input 0 to finish");

	ArrayList<Integer> numberlist = new ArrayList<Integer>();
	
	while (input.hasNextInt()) {
		int i = input.nextInt();
		numberlist.add(i);
		if (i == 0){
		break;
		}
	}     
         System.out.println(numberlist); // printing each array element

      
	ArrayList<Integer> before = (ArrayList) numberlist.clone();
	  Collections.sort(numberlist);
	  int biggest = numberlist.get(numberlist.size() - 1);
	  for (int i = 0; i < before.size(); i++)
	  {
		 if(numberlist.get(numberlist.size() - 1) == before.get(i))
			 System.out.println("location in the array " + i);
	  }
	  
	  System.out.println("Biggest number is " + numberlist.get(numberlist.size() - 1));
}
}
