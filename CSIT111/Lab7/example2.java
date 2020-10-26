class Example2
{
	public static void main(String[] args){
		method1();
	}

	
	public static void method1()
	{
		Acl ap = new Acl();
		
		ap.a = 5;
		
		System.out.println("method1 before calling method2(), ap = " + ap.a);
		
		method2(ap);
		
		System.out.println("method1 after calling method2(), ap = " + ap.a);
	}
	public static void method2(Acl fp)
	{
		System.out.println("method2 before the calculation, fp = " +fp.a);
		fp.a = 10;
		
		System.out.println("method2 after the calculation, fp = " +fp.a);
	}
}

class Acl {
	public int a;
}


