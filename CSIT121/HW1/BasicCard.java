//adding Basic card subclass
public class BasicCard extends Card
{
	private static final int annualfee = 5;
	
//add BasicCard constructor
	public BasicCard (String id, String name, String date, address address, int balance)
	{
		//calling the parent constructor
		super(id, name, date, address, balance);
		discount = 0.03;
		CardType = "Basic";
		if (balance <2000)
		{
			
			couponRate = 0.02;
			
		}
		else if ( balance >=2000)
		{
			couponRate = 0.03;
		}

		
	}
	@Override
	public String toString()
	{
		super.toString();
		fullDetail.append("Your annual fee is " + annualfee + "$").append(System.getProperty("line.separator"));
		fullDetail.append("Your coupon rate is " + couponRate + "%").append(System.getProperty("line.separator"));
		return fullDetail.toString();
	}
		public double calCoupon()
	{

			if (balance < 3500)
				return balance * 0.04;
			else if (balance >= 3500&&years <3)
				return balance * 0.05;
			else
				return balance * 0.06;
		
	}

	




}