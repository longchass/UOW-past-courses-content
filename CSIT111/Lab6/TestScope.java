class TestScope
{
	private static final double CT = 0.25;
	private static double fd = 1.0;
	public static void main(String[] args)
	{
		double x = 1, y=1;
		method1(x);
		System.out.println("x= " + x );
		System.out.println("y= " + y );
		System.out.println("fd= " + fd );
		double z = method2(x);
		System.out.println("x= " + x );
		System.out.println("z= " + z );
		System.out.println("fd= " + fd );
	}
	private static void method1(double x)
	{
		x += 3;
		double y = 6;
		double fd = 2.0 ;
		System.out.println( CT*(x + y) );
	}
	private static double method2( double x )
	{
		fd = 2.0 ;
		return ( (x + 3.0)/fd );
	}
}
