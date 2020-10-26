class Circle
{
	private double r;
	public Circle( double r )
	{
		this.r = r;
	}
	public double calCircumference()
	{
		return 2*Math.PI*r;
	}
	public double calArea()
	{
		return Math.PI*r*r;
	}
	public Circle(Circle input)
	{
		this.r = input.r;
	}
	public void setRadius(double r)
	{
		this.r =r;
	}
	public double getRadius()
	{
		return this.r;
	}
}

class CircleNewApp
{
	public static void main( String[] args )
	{
		double rd = Double.parseDouble( args[0] );
		System.out.println( "Circle radius = " + rd );
// create an object of Circle with the radius rd
		Circle circle1 = new Circle(rd);
		Circle circle2 = new Circle(circle1);
		Circle circle3 = circle2;
		
		circle1.setRadius(5);
		System.out.println(circle1.getRadius());
		System.out.println(circle2.getRadius());
		System.out.println("new case");
		System.out.println(circle2.getRadius());
		System.out.println(circle3.getRadius());
		
		System.out.println("another case");
		circle3.setRadius(20);
		System.out.println(circle1.getRadius());
		System.out.println(circle2.getRadius());
		System.out.println(circle3.getRadius());
	}
}