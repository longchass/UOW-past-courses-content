public class Address
{
	String str;
	String num;
	String city;
	State stat;
	
	public Address(String str, String num, String city, State stat)
	{
		this.str = str;
		this.num = num;
		this.city = city;
		this.stat = stat;
	}
	public Address(String str, String num, String city)
	{
		this(str, num,city, State.NSW);
		
	}






}