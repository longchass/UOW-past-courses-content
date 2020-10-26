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
public class ServiceManagement
{
	private Map<String, Service>  map = new HashMap<String,Service>();

	ArrayList<Service> map_Array  = new ArrayList<Service>(map.values());
	public ServiceManagement()
	{

	}
	public boolean addService(Service input )
	{
		try{
			map.put(input.getID(), input);
			map_Array.add(input);
			return true;
		}
		catch(NullPointerException e)
		{
			System.out.println("Service is not found");
			return false;
		}
		
	}
	public Service findServiceByID(String input)
	{
		return Service.findServiceByID(map_Array, input);
	}
	public Service findServiceUsingKeywordOnName(String input)
	{
		for (Map.Entry<String,Service> entry : map.entrySet())
		{
			input.matches("(.*)"+input+"(.*)");
			return entry.getValue();
		}
		return (Service) null;
		
	}
		public void FileToObject()
	{
		Scanner in = null;
		boolean error = false;
		try
		{
			in = new Scanner(Paths.get("Service1.txt"));
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
				
				String service=in.nextLine();
				String[] sp = service.split(",");
				if(sp.length == 7)
				{
				Service temp = new Service(sp[0], sp[1], sp[2], sp[3], Double.parseDouble(sp[4]), Double.parseDouble(sp[5]),Boolean.parseBoolean(sp[6]));
				map.put(sp[0], temp);
				map_Array.add(temp);
				}
				else
				{
					System.out.println("Can't get object from file");
				}

				
			}
		}
	}
}