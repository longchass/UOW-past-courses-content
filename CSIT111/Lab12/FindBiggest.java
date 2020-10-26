import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class FindBiggest {
   public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
		int x = 0;
	  if (input.hasNextInt() )
	  {
		  x = input.nextInt();
		  if ( x > 0)
		  System.out.println("input is fine");
			else{
		  System.out.println(" please input positive integers");
		  x = input.nextInt();

	  }
	  }
	  else
	  {
		  System.out.println(" please input positive integers please");
		  		  x = input.nextInt();


	  }
	  	

      Random rd = new Random(); // creating Random object
      int[] arr = new int[x];
	  
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(11); // storing random integers in an array
         System.out.println(arr[i]); // printing each array element

      }
	  int[] before = arr.clone();
	  Arrays.sort(arr);
	  int biggest = arr[arr.length - 1];
	  for (int i = 0; i < before.length; i++)
	  {
		 if(arr[9] == before[i])
			 System.out.println("location in the array " + i);
	  }
	  
	  System.out.println("Biggest number is " + arr[arr.length - 1]);
   }
}