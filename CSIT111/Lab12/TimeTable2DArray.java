public class TimeTable2DArray {

public static void main(String[] args) {

    int[][] data = new int[9][9];

    data = timesTable(9,9);

	System.out.print("*| ");
				for (int k =1; k<=9; k++)
			{	
					System.out.printf("%2d ", k);
			}
			System.out.println();
		for (int m =1; m<=9; m++)
			{	
					System.out.printf("---");
			}
						System.out.println();
    for (int row = 0; row < data.length ; row++)
    {
		System.out.print(row + "| ");
        for (int column = 0; column < data[row].length; column++)
        {
			
            System.out.printf("%2d ",data[row][column]);
        }
        System.out.println();
		
    }
}

public static int[][] timesTable(int r, int c)
{
    int [][] yes = new int[r][c];
    for (int row = 0; row < yes.length ; row++)
    {
        for (int column = 0; column < yes[row].length; column++)
        {
            yes[row][column] = (row+1)*(column+1);
        }

    }
    return yes;
}

}