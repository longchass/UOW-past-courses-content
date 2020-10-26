public class CashRegister 
{	
	public double itemPrice;
	public double totalPurchase;
	public int totalItems;
	public CashRegister()
	{


	}
	public void scan(double input)
	{
		totalPurchase += input;
		totalItems++;
	}
	public double getTotalPurchase()
	{
		return totalPurchase;
	}
		
	public int getTotalItems()
	{
		return totalItems;
	}
}