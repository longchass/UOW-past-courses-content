import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*; 
import java.text.SimpleDateFormat;
import java.text.ParseException;


import java.util.Collections;
public class BookingManagement
{
	private ArrayList<BookingRecord> bookings = new ArrayList<BookingRecord>();
	public BookingManagement()
	{

	}
	public boolean addBookingRecord(BookingRecord input)
	{
		try{
			bookings.add(input);
			return true;
		}
		catch(NullPointerException e)
		{
			System.out.println("can't add the record does it exist?");
			return false;
		}
	}
	public ArrayList<BookingRecord> findBookingRecordByUserName(String input)
	{

		return	BookingRecord.filterBookingRecordByUsername(bookings, input);
		
	}
	public void FileToObject(UserManagement input, ServiceManagement input2)
	{
		SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");
		Scanner in = null;
		boolean error = false;
		try
		{
			in = new Scanner(Paths.get("Book1.txt"));
		}
		catch(IOException e)
		{
			error = true;
			System.out.println("Can't find the file");
		}
		if(!error)
		{
			while(in.hasNext())
			{
				
				String booking=in.nextLine();
				String[] bp = booking.split(",");
				if(bp.length == 2 )
				{
				User custost = input.findUserByUserName(bp[0]);
				
				Service tempser =  input2.findServiceByID(bp[1]);
				this.addBookingRecord( new BookingRecord(custost,tempser));
				}
				


				if(bp.length == 5)
				{
				User custost = input.findUserByUserName(bp[0]);
				Service tempser =  input2.findServiceByID(bp[1]);
				try{
				Date Bookdate = formate.parse(bp[2]);
				Date Enddate = formate.parse(bp[3]);
				boolean value = Boolean.parseBoolean(bp[4]);
				this.addBookingRecord( new BookingRecord(custost,tempser,Bookdate,Enddate,value));
				}
				catch(ParseException e)
				{
					System.out.println("Can't parse the Date");
				}

				
				}

				
			}
		}
	}
}