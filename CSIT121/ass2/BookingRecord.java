import java.util.*;
import java.lang.String.*;
import java.io.Serializable;
import java.lang.*; 
import java.util.Collections;
public class BookingRecord
{
	private User user;
	private Service Service;
	private Date bookingDate;
	private Date endDate;
	private boolean status;
	private StringBuilder fullDetail = new StringBuilder();
	public BookingRecord(User user, Service Service)
	{
		this.user = user;
		this.Service = Service;
	}
	public User getUser()
	{
		return user;
	}
	public BookingRecord(User user, Service Service, Date BookingDate, Date EndDate, boolean value)
	{
		this.user = user;
		this.Service = Service;
		this.bookingDate = BookingDate;
		this.endDate = EndDate;
		this.status = value;
	}
	public String getAttributeDescriptionForSavingToFile()
	{
		return "User, Service, Booking date, End date, Status";
	}
	public String getDataToSaveToFile()
	{
		return  user + ", " + Service + ", " + bookingDate + ", " + endDate + ", " + status;
	}
	public String toString()
	{
		fullDetail.append("The User is: ").append(System.getProperty("line.separator"));
		fullDetail.append(user).append(System.getProperty("line.separator"));
		fullDetail.append("The Service is: ").append(System.getProperty("line.separator"));
		fullDetail.append(Service).append(System.getProperty("line.separator"));
		fullDetail.append("The booking date is " + bookingDate).append(System.getProperty("line.separator"));
		fullDetail.append("The end date is " + endDate).append(System.getProperty("line.separator"));
		if(status == true)
			{
		fullDetail.append("The booking is valid").append(System.getProperty("line.separator"));
			}
		else
			{	
		fullDetail.append("The booking is invalid").append(System.getProperty("line.separator"));
			}
		return fullDetail.toString();

	}
	public static ArrayList<BookingRecord> filterBookingRecordByUsername(ArrayList<BookingRecord> input, String key)
	{
		ArrayList<BookingRecord> sortedbooking= new ArrayList<BookingRecord>();
		for (BookingRecord i : input)
		{
			if(i.getUser().getUsername().equals(key))
			{

				sortedbooking.add(i);
			}
				System.out.println(i.getUser().getUsername());
		}
		return sortedbooking;
	}
}