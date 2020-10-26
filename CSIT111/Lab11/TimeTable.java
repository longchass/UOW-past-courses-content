import java.util.Scanner;
public class TimeTable
{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("******");
			System.out.print("Please input a positive integer number N: ");
			int limit = input.nextInt();
			int i = 1;
			System.out.print("*| ");
			for (int k =1; k<=limit; k++)
			{	
					System.out.printf("%3d ", k);
			}
			System.out.println();
			for (int m =1; m<=limit; m++)
			{	
					System.out.printf("----");
			}
			System.out.println();
			while (i <= limit){
			int j = 1; 
			int axis = i;
			System.out.print(axis + "| ");

			while (j <= limit) {
            // Notice these lines are swapped!
            System.out.printf ( "%3d ", i*j );
            j++;
        }

        System.out.println();
        i++; 
    }
}

	
}