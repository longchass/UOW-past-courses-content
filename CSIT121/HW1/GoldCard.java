//adding Gold card subclass

public class GoldCard extends Card
{

	private double yearlyBalance;
//adding Constructor 
	public GoldCard (String id, String name, String date, address address, int balance, double yearlyBalance)
	{
		super(id, name, date,address,balance);
		
		discount = 0.1;
		CardType = "Gold";
		this.yearlyBalance = yearlyBalance;
		//Calculate discount rate
		if (yearlyBalance < 3000)
		{
			
			couponRate = 0.1;
			
		}
		else if ( yearlyBalance >= 3000 && years < 3)
		{
			couponRate = 0.15;
		}
		else if ( yearlyBalance >= 3000 && years >= 3)
		{
			couponRate = 0.2;
		}

	}
	public double calCoupon()
	{
		if (yearlyBalance < 3000)
			return this.balance *0.1;
		else if (yearlyBalance >= 3000&& years < 3)
			return balance * 0.15;
		else
			return super.getBalance() * 0.2;
	}
	
	@Override
	public String toString()
	{
		super.toString();
		fullDetail.append("Your yearly balance is " + yearlyBalance + "$").append(System.getProperty("line.separator"));
		fullDetail.append("Your coupon rate is " + couponRate + "%").append(System.getProperty("line.separator"));
		return fullDetail.toString();
	}
}