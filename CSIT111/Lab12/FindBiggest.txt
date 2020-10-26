import java.util.Random;
import java.util.Arrays;

public class FindSmallest {
   public static void main(String[] args) {
      Random rd = new Random(); // creating Random object
      int[] arr = new int[10];
	  int smallest = arr[0];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(11); // storing random integers in an array
         System.out.println(arr[i]); // printing each array element

      }
	  int[] before = arr.clone();
	  Arrays.sort(arr);

	  for (int i = 0; i < before.length; i++)
	  {
		 if(arr[0] == before[i])
			 System.out.println("location in the array " + i);
	  }
	  
	  System.out.println("Smallest number is " + arr[0]);
   }
}