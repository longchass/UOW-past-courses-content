class Example 
{
	public static void main(String[] args){
		method1();
	}

	
	public static void method1()
	{
		int ap = 5;
		
		System.out.println("method1 before calling method2(), ap = " + ap);
		
		method2(ap);
		
		System.out.println("method1 after calling method2(), ap = " + ap);
	}
	public static void method2(int fp)
	{
		System.out.println("method2 before the calculation, fp = " +fp);
		fp *=2;
		
		System.out.println("method2 after the calculation, fp = " +fp);
	}
}


