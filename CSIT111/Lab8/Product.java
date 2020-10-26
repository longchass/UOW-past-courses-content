public class Product
{
	private String name;
	private double price;
	private int productID;
	private static int total;
	public static void main(String[] args)
	{

	}
	public Product(String name, double value)
	{
		this.name = name;
		price = value;
		total++;
		productID = total;
	}
	public String getName()
	{
		return name;
	}
	public int getProductID()
	{
		return productID;
	}
	public double getPrice()
	{
		return price;
	}
	public void changePrice(double input)
	{
		
		price = input;
	}
	public static int getTotal()
	{
		return total;
			
	}
}