import java.util.*; 
public class test{
	
	public static void main(String[] args) 
	{
		//initializing all the cards
		Card basic1=new BasicCard("12","Andrew High","12-12-2015", new address("12/Lorne Avenue/Warwick Farm/Darwin/NSW/2000"),1800);
		Card basic2=new BasicCard("14","Andrew is High","12-12-2011", new address("89/George street/Victoria/Kusher/VIC/2607"),4000);
		Card silver1=new SilverCard("15","Andrew is not High","23-11-2009", new address("90/Jemama street/Tash/Tashmania/KAW/2309"),3000);
		Card silver2=new SilverCard("16","Andrew is not very High","23-11-2007", new address ("90/Auntie street/Mascot/Brishbain/CAI/2358"),4000);
		Card gold1 = new GoldCard("17", "Andrews are high","23-09-2001", new address("120/Freak street/Central/Gold Coast/CAR/8703"), 50000, 2000);
		Card gold2 = new GoldCard("18", "Andrews are not high", "18-07-2002", new address("183/Garden street/Greener/Town Hall/SHO/9052"), 8000, 5000);
		
		
		//Run calCoupon to calculate coupon

		
		//Running printCoupon to get all the information about the coupons and the cards
		
		//Creating the Card ArrayList and adding all the cards to the ArrayList
		ArrayList<Card> calculate = new ArrayList<Card>();
		calculate.add(basic1);
		calculate.add(basic2);
		calculate.add(silver1);
		calculate.add(silver2);
		calculate.add(gold1);
		calculate.add(gold2);
		System.out.println();
		for(Card i : calculate)
		{
			System.out.println(i);
			
		}
		System.out.println("total Discount "+Card.calDiscount(calculate));
		//initializing the total of all the discount
		
		

	}

}

