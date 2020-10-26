
import java.util.Date;
import java.io.Serializable;
import java.lang.*;


public class Address implements Cloneable, Serializable
{
	//adding core variables
	private String street_number;
	private String street_name;
	private String suburb;
	private State state;
	private int postcode;
	
	//adding class constructor using string as input
	public Address(String num, String name, String sub, State input_state, int PO)
		{
			;
			this.street_number = num ;
			this.street_name = name;
			this.suburb = sub;
			this.state = input_state;
			this.postcode = PO;
		}
		
	//toString() method
	public String toString()
		{
			return (street_number + " " + street_name + " " + suburb + " " + state + " " + postcode);		
		}
	public String getStreetNum()
	{
		return street_number;
		
	}
	public String getStreetName()
	{
		return street_name;
			
	}
	public String getSuburb()
	{
		return suburb;
	}
	public State getState()
	{
		return state;
		
	}
	public int postcode()
	{
		return postcode;
	}
	public void setStreetNum(String input)
	{
		street_number = input;
	}
	public void setStreetName(String input)
	{
		street_name = input;
		
	}
	public void setSuburb(String input)
	{
		suburb = input;
		
	}
	public void setState(State input)
	{
		state = input;
		
	}
	public void postcode(int input)
	{
		postcode = input;
		
	}
	public Object clone() throws CloneNotSupportedException
	{
		Address address = (Address) super.clone();
		return address;

	}
}
