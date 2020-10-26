import java.util.Date;
public class address
{
	private int streetnum;
	private String streetname;
	private String suburb;
	private String city;
	private String state;
	private int postcode;
	public address(String full)
		{
			String[] address = full.split("/",6);
			this.streetnum = Integer.parseInt(address[0]);
			this.streetname = address[1];
			this.suburb = address[2];
			this.city = address[3];
			this.state = address[4];
			this.postcode = Integer.parseInt(address[5]);
		}
	public String toString()
		{
			return (streetnum + " " + streetname + " " + suburb + " " + city + " " + state + " " + postcode);		
		}
}