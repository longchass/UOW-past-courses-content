class Product
{
	private String name;
	private double price;
	private int scanCode;
	private static int numOfObjects = 0;
	
	public static void main(String[] args)
	{
		
	}
	
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getScanCode()
	{	
		
		return (1000 + numOfObjects);
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void changePrice(double input)
	{	
		this.price = input;
	}
	
	public static int getNumOfObjects()
	{
		numOfObjects++;
		return numOfObjects;
	}
}
