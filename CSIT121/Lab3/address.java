import java.util.Date;


public class address
{
	//adding core variables
	private int streetnum;
	private String streetname;
	private PostCode postcode;
	private String Country;
	
	//adding class constructor using string as input
	public address(String full)
		{
			String[] address = full.split("/");
			this.streetnum = Integer.parseInt(address[0]);
			this.streetname = address[1];
			this.postcode = new PostCode(address[2]);
			this.Country =  address[3];
		}
		
	//toString() method
	public String toString()
		{
			return (streetnum + " " + streetname + " " + postcode + " " + Country);		
		}
}