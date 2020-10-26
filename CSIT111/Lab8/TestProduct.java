import java.lang.Math.*;

public class TestProduct {
	public static void main(String[] args) 
	{
		Product pr1 = new Product("Milk", 2.50);
		Product pr2 = new Product("Apple", 6.00);
		System.out.println("***** You have " + Product.getTotal() + " products now.");
		System.out.println("You have " + pr1.getName() + " (ID=" + pr1.getProductID() + "). Its price is $" + String.format("%.2f",pr1.getPrice()));
		System.out.println("You have " + pr2.getName() + " (ID=" + pr2.getProductID() + "). Its price is $" + String.format("%.2f",pr2.getPrice()));
		Product pr3 = new Product("Bread", 1.50);
		System.out.println("***** You have " + Product.getTotal() + " products now.");
		System.out.println("You have " + pr1.getName() + " (ID=" + pr1.getProductID() + "). Its price is $" + String.format("%.2f",pr1.getPrice()));
		System.out.println("You have " + pr2.getName() + " (ID=" + pr2.getProductID() + "). Its price is $" + String.format("%.2f",pr2.getPrice()));
		System.out.println("You have " + pr3.getName() + " (ID=" + pr3.getProductID() + "). Its price is $" + String.format("%.2f",pr3.getPrice()));
		pr3.changePrice(5.99);
				System.out.println("***** You have " + Product.getTotal() + " products now.");
		System.out.println("You have " + pr1.getName() + " (ID=" + pr1.getProductID() + "). Its price is $" + String.format("%.2f",pr1.getPrice()));
		System.out.println("You have " + pr2.getName() + " (ID=" + pr2.getProductID() + "). Its price is $" + String.format("%.2f",pr2.getPrice()));
		System.out.println("You have " + pr3.getName() + " (ID=" + pr3.getProductID() + "). Its price is $" + String.format("%.2f",pr3.getPrice()));
	}
}
