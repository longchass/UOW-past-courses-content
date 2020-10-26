class SwapInt 
{
	 public static void main(String[] args) 
	 {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int temp;
		System.out.println("Before: " + "a = " + a + ", b = " + b);
		/* -- Please insert below your code for swapping a and b -- */
		temp = a;
		a = b;
		b = temp;

		System.out.println("After: " + "a = " + a + ", b = " + b);
	 }
}