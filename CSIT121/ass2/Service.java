import java.util.*;
import java.lang.String.*;
import java.io.Serializable;
import java.lang.*; 
import java.util.Collections;
public class Service implements Cloneable, ShopingCart, ProductInformation
{
	private String id;
	private String name;
	private String detail;
	private String parts;
	private double duration;
	private double pricePerUnit;
	private boolean status;
	StringBuilder fullDetail = new StringBuilder();
	public Service(String id , String name, String detail, String parts, double duration, double pricePerUnit, boolean status)
	{
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.parts = parts;
		this.duration = duration;
		this.pricePerUnit = pricePerUnit;
		this.status = status;
	}
	protected void setID(String input)
	{
		this.id = input;
	}
	public String getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String input)
	{
		this.name = input;
	}
	public void setDetail(String input)
	{
		this.detail = input;
	}
	public String getParts()
	{
		return parts;
	}
	public void setParts(String input)
	{
		this.parts = input;
	}
	public double getDuration()
	{
		return duration;
	}
	public void setDuration(double input)
	{
		this.duration = input;
	}
	public void setPricePerUnit(double input)
	{
		this.pricePerUnit = input;
	}
	public boolean getStatus()
	{
		return status;
	}
	public void setStatus(boolean input)
	{
		this.status = input;
	}
	public String toString()
	{
		fullDetail.append("Service id is " + id).append(System.getProperty("line.separator"));
		fullDetail.append("Service full name is " + name).append(System.getProperty("line.separator"));
		fullDetail.append("Service detail is "  + detail).append(System.getProperty("line.separator"));
		fullDetail.append("Service parts are  " + parts).append(System.getProperty("line.separator"));
		fullDetail.append("Service duration is  "  + duration).append(System.getProperty("line.separator"));
		fullDetail.append("Service price is  " + parts).append(System.getProperty("line.separator"));

		if(status == true)
			{
		fullDetail.append("The service status is: active").append(System.getProperty("line.separator"));
			}
		else
			{	
		fullDetail.append("The service status is: deativated").append(System.getProperty("line.separator"));
			}
		return fullDetail.toString();
	}
	public String getProductDescription()
	{
		return name + " " + duration;
	}
	public String getDetail()
	{
		return detail;
	}
	public double getPricePerUnit()
	{
		return pricePerUnit;
	}
	public String getUnitDescription()
	{
		return "hours";
	}
	public String getProductID()
	{
		return id;
	}
	public Object clone() throws CloneNotSupportedException
	{
		Service clone  = (Service)super.clone();
		return clone;
	}
	public String getAttributeDescriptionForSavingToFile()
	{
		return "id, name, detail, parts, duration, pricePerUnit, status";
	}
	public String getDataToSaveToFile()
	{
		return id+ ", " + name + ", " + detail + ", " + parts + ", " + duration + ", " + pricePerUnit + ", " + status;
	}
	public static Service findServiceByID(ArrayList<Service> input, String ID)
	{
		for (Service i : input)
		{
			if (i.getID().equals(ID))
			{
				return i;
			}
		}
		return (Service) null;
	}
	public static ArrayList<Service> findServiceByKeywordSearchOnName(ArrayList<Service> input, String find)
	{
		ArrayList<Service> matchedServices = new ArrayList<Service>();
		for(Service i : input)
		{
			if(i.getName().matches("(.*)"+find+"(.*)") == true)
			{
				matchedServices.add(i);
			}
		}
		return matchedServices;
	}
	public static Service filterServiceByDuration(ArrayList<Service> input, double duration)
	{
		for (Service i : input)
		{
			if (i.getDuration() == duration)
			{
				return i;
			}
		}
		return (Service) null;
	}
}