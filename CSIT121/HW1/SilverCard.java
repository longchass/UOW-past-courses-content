//adding Silver card subclass

public class SilverCard extends Card
{
	private static final int annualfee = 10;
//adding Constructor 

	public SilverCard (String id, String name, String date, address address, int balance)
	{
		super(id, name, date, address, balance);
		
		discount = 0.05;
		CardType = "Silver";
		//Calculate discount rate
		if (balance < 3500)
		{
			
			couponRate = 0.04;
			
		}
		else if ( balance >= 3500 && years < 3)
		{
			couponRate = 0.05;
		}
		else if ( balance >= 3500 && years >= 3)
		{
			couponRate = 0.06;
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