import java.text.SimpleDateFormat;  
import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;
import static java.util.Calendar.*;
import java.util.Date;
import java.lang.String.*;
import static java.lang.Math.abs;

public class Card
{
	private String id;
	private String name;

	private Calendar creationCalendar = Calendar.getInstance();

	private Date createddate = null;
	private long years;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	
	private address full;
	
	private int balance;
	private double balanceyear;
	
	private int type;
	private double discount;
	private double annualfee;
	private double coupon;
	
	private String CardType;
	
	public Card ()
	{
		
	}
	public Card (String id, String name, String date, address address, int balance, int type)
	{
			this.id = id;
			this.balance = balance;
			this.name = name;
			this.type = type;
			full = address;
			Calendar todaycalendar = Calendar.getInstance();
			Date today = todaycalendar.getTime();
			try {
				createddate = dateFormat.parse(date);
			} catch (ParseException e) {
				System.out.println("wow dog");
			}
			creationCalendar.setTime(createddate);

			years = Math.round((((todaycalendar.getTimeInMillis() - creationCalendar.getTimeInMillis())/ (24 * 60 * 60 * 1000)) / 356));
			
			if (type == 1)
			{	CardType = "Basic";
				discount = 0.03;
				annualfee = 5;
				
			}
			else if (type == 2)
			{
				CardType = "Silver";
				discount = 0.05;
				annualfee = 10;
				
			}
			else if (type == 3)
			{
				CardType = "Gold";
				balanceyear = balance - 1000;
				discount = 0.1;
				
			}
			else
			{
				System.out.println("can't do a thing dog");
			}
	}

	public String toString()
	{
		
	    StringBuilder fullDetail = new StringBuilder();
		fullDetail.append("Your card id is " + id).append(System.getProperty("line.separator"));
		fullDetail.append("Your name is " + name).append(System.getProperty("line.separator"));
		fullDetail.append("You have spent " + balance).append(System.getProperty("line.separator"));
		fullDetail.append("This card was created on " + dateFormat.format(createddate)).append(System.getProperty("line.separator"));
		fullDetail.append("You have been with us for " + years + " years").append(System.getProperty("line.separator"));
		fullDetail.append("Your discount for each purchase is " + discount*100 + "%").append(System.getProperty("line.separator"));
		fullDetail.append("Your full address is " + full).append(System.getProperty("line.separator"));
		fullDetail.append("Your card type is " + CardType).append(System.getProperty("line.separator"));
		fullDetail.append("Your coupon is " + Math.round(coupon) + "$").append(System.getProperty("line.separator"));
		if (type == 3)
		{
		fullDetail.append("Your yearly balance is " + balanceyear + "$").append(System.getProperty("line.separator"));
		}
		else if (type == 1 || type == 2)
		{
			
		fullDetail.append("Your annual fee is " + annualfee + "$").append(System.getProperty("line.separator"));

		}
		return fullDetail.toString();
		//return (id + "\r\n" + name + " " + years + " " + balance + " " + type );		
	}
	public double getDiscount()
	{
		return discount;
	}

	public double getBalance()
	{
		return balance;
	}
	public String getID()
	{
		return id;
	}
		public void calCoupon()
	{
		if		(balance < 2000 && type == 1)
				{
					coupon = balance * 0.02;
				}
		
		else if (balance >= 2000 && type == 1)
				{
					coupon = balance * 0.03;
				}
		else if(balance < 3500 && type == 2)
				{
					coupon = balance * 0.03;
				}
		else if (balance >= 3500 && years < 3 && type == 2)
				{
					coupon = balance * 0.03;
				}
		else if (balance >= 3500 && years >= 3 && type == 2)
				{
					coupon = balance * 0.03;
				}
		else if(balance < 3000 && type == 3 )
				{
					coupon = balance * 0.03;
				}
		else if (balance >= 3000 && years < 3 && type == 3)
				{
					coupon = balance * 0.03;
				}
		else if (balance >= 3000 && years >= 3 && type == 3)
				{
					coupon = balance * 0.03;
				}
		else	{
					System.out.println("wrong");
					System.out.println(coupon);
					System.out.println(balance);
					
		}
	}
		public void printCoupon()
	{
		System.out.println(this);
	}
}