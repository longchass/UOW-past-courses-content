import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*; 
import java.text.ParseException;


public class fresh extends product{

			
	

	//Overloaded with Packing Date

	public fresh(String IDinput, String Description, double ReccPrice, int unit, int Weight, String unitType, String inputExpiry)
	{
		this(IDinput, Description, ReccPrice, unit, Weight, unitType, "01-01-1900 01:01:01", inputExpiry);

	}
	public fresh(String IDinput, String Description, double ReccPrice, int unit, int Weight, String unitType, String inputPacking, String inputExpiry)
	{
		super(Description,  ReccPrice,  unit,  Weight);
		expiryDate = new Date();	

		ID.append("1");
		this.Description = Description;
		this.ReccPrice = ReccPrice;
		this.unit = unit;
		this.Weight = Weight;
		this.unitType = unitType;
		
		try {
			packingDate = packing.parse(inputPacking);
			expiryDate = expiry.parse(inputExpiry);
				
			} 
		catch (ParseException e) {
				System.out.println("wow dog");
			}
		if (IDinput.length()==6) {

			ID.append(IDinput);

		}
		else
		{
			System.out.println("the ID number is either too short or too long please try again");
		}	
	}
	public String getInformationForSavingToFile()
	{
		return 	super.getInformationForSavingToFile() + ", " + unitType;
	}

	public String getAttributeDescriptionForSavingTofile()
	{
		return super.getAttributeDescriptionForSavingTofile()+ ", Unit Type";
	}
	@Override
	public String toString()
	{
		return super.toString() + "\nUnit Type" + unitType;
	}
	
	
}

