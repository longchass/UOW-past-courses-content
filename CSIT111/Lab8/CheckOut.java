public class CheckOut

{	
	public static void main(String[] args)
	{
		CashRegister cash1 = new CashRegister();
		Product pr1 = new Product("Milk", 2.99);
		Product pr2 = new Product("Apple", 5.49);
		Product pr3 = new Product("Bread", 1.75);
		cash1.scan(pr1.getPrice());
		cash1.scan(pr2.getPrice());
		cash1.scan(pr3.getPrice());
		System.out.println("***** At Register 1 *****");
		System.out.println("You have purchased " + cash1.getTotalItems() + " items");
		System.out.println("Total: $" + cash1.getTotalPurchase());
		Product pr4 = new Product("Apple", 5.49);
		cash1.scan(pr4.getPrice());
		System.out.println("You have purchased " + cash1.getTotalItems() + " items");
		System.out.println("Total: $" + cash1.getTotalPurchase());
		CashRegister cash2 = new CashRegister();
		cash2.scan(pr1.getPrice());
		cash2.scan(pr3.getPrice());
		System.out.println("***** At Register 2 *****");	
		System.out.println("You have purchased " + cash2.getTotalItems() + " items");
		System.out.println("Total: $" + cash2.getTotalPurchase());

		
		

	}
}