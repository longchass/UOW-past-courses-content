class Circle
{
	private  double r;
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
}
class CircleApp
{
	public static void main( String[] args )
	{
		double rd = Double.parseDouble( args[0] );
		System.out.println( "Circle radius = " + rd );
		// create an object of Circle with the radius rd
		Circle circle1 = new Circle(rd);

		double cir = circle1.calCircumference();
		double area = circle1.calArea();
		System.out.println("Circumference = " + cir);
		System.out.println("Area = " + area);
	}
}