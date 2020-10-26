import java.text.SimpleDateFormat;  
import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;
import static java.util.Calendar.*;
import java.util.*;
import java.lang.String.*;
import static java.lang.Math.abs;

//import all the necessary modules



public class Card
{
//initialise all necessary variables
	protected String id;
	protected String name;

//Calendar to get the current date
	protected Calendar creationCalendar = Calendar.getInstance();

	protected Date createddate = null;
	protected int years;
	protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	
	protected address full;
	
	protected double balance;
	
	protected double discount;
	
	protected double coupon;
	protected double couponRate;
	
	protected String CardType;
	
	protected StringBuilder fullDetail = new StringBuilder();
//no parameter constructor just in case
	public Card ()
	{
		
	}
	
//constructor for the class card
	public Card (String id, String name, String date, address address, double balance)
	{
			this.id = id;
			this.balance = balance;
			this.name = name;
			full = address;
			Calendar todaycalendar = Calendar.getInstance();
			Date today = todaycalendar.getTime();
			try {
				createddate = dateFormat.parse(date);
			} catch (ParseException e) {
				System.out.println("error can't parse");
			}
			creationCalendar.setTime(createddate);
			years = (int) Math.floor((((todaycalendar.getTimeInMillis() - creationCalendar.getTimeInMillis())/ (24 * 60 * 60 * 1000)) / 356));
	}

	public String toString()
	{
		
	    
		fullDetail.append("Your card id is " + id).append(System.getProperty("line.separator"));
		fullDetail.append("Your name is " + name).append(System.getProperty("line.separator"));
		fullDetail.append("You have spent " + balance).append(System.getProperty("line.separator"));
		fullDetail.append("This card was created on " + dateFormat.format(createddate)).append(System.getProperty("line.separator"));
		fullDetail.append("You have been with us for " + years + " years").append(System.getProperty("line.separator"));
		fullDetail.append("Your discount for each purchase is " + discount*100 + "%").append(System.getProperty("line.separator"));
		fullDetail.append("Your full address is " + full).append(System.getProperty("line.separator"));
		fullDetail.append("Your card type is " + CardType).append(System.getProperty("line.separator"));
		fullDetail.append("Your coupon is " + Math.round(coupon) + "$").append(System.getProperty("line.separator"));
		return fullDetail.toString();
		//return (id + "\r\n" + name + " " + years + " " + balance + " " + type );		
	}
	public double getDiscount()
	{
		return discount;
	}
	public static double calDiscount(ArrayList<Card> calculate)
	{
		int total = 0;
		for (Card i : calculate)
		{
			total += i.getBalance()*i.getDiscount();
		}
		return total;
	}
	public double getBalance()
	{
		return balance;
	}
	public String getID()
	{
		return id;
	}
	public double getCoupon()
	{
		return coupon;
	}
	public double getCouponRate()
	{
	 return couponRate;	
	}
		public int getYear()
	{
		return years;
	}
		public void printCoupon()
	{
		System.out.println(this.getCoupon());
	}
}