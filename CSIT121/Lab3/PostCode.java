import java.util.Date;


public class PostCode
{
	//adding core variables
	private String suburb;
	private String city;
	private String state;

	
	//adding class constructor using string as input
	public PostCode(String full)
		{
			String[] address = full.split("-");

			this.suburb = address[0];
			this.city = address[1];
			this.state = address[2];

		}
		
	//toString() method
	public String toString()
		{
			return (suburb + " " + city + " " + state);		
		}
}