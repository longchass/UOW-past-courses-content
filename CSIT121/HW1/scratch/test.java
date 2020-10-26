import java.util.*; 
public class test{
	
	public static void main(String[] args) 
	{
		Card basic1=new Card("12","Andrew High","12-12-2015", new address("12/Lorne Avenue/Warwick Farm/Darwin/NSW/2000"),1999,1);
		Card basic2=new Card("14","Andrew is High","12-12-2011", new address("89/George street/Victoria/Kusher/VIC/2607"),4000,1);
		Card silver1=new Card("15","Andrew is not High","23-11-2009", new address("90/Jemama street/Tash/Tashmania/KAW/2309"),20000,2);
		Card silver2=new Card("16","Andrew is not very High","23-11-2007", new address ("90/Auntie street/Mascot/Brishbain/CAI/2358"),30000,2);
		Card gold1 = new Card("17", "Andrews are high","23-09-2001", new address("120/Freak street/Central/Gold Coast/CAR/8703"), 50000,3);
		Card gold2 = new Card("18", "Andrews are not high", "18-07-2002", new address("183/Garden street/Greener/Town Hall/SHO/9052"), 8000,3);
		basic1.calCoupon();
		basic2.calCoupon();
		silver1.calCoupon();
		silver2.calCoupon();
		gold1.calCoupon();
		gold2.calCoupon();
		basic1.printCoupon();
		System.out.println();
		basic2.printCoupon();
		System.out.println();
		silver1.printCoupon();
		System.out.println();
		silver2.printCoupon();
		System.out.println();
		gold1.printCoupon();
		System.out.println();	
		gold1.printCoupon();
		ArrayList<Card> calculate = new ArrayList<Card>();
		calculate.add(basic1);
		calculate.add(basic2);
		calculate.add(silver1);
		calculate.add(silver2);
		calculate.add(gold1);
		calculate.add(gold2);
		System.out.println();
		int total = 0;
		for (Card i : calculate)
		{
			total += i.getBalance()*i.getDiscount();
			System.out.println("Card " + i.getID() + " coupon " + (i.getBalance()*i.getDiscount()));
		}
		System.out.println("Total coupon is " + total + "$");

	}
}

