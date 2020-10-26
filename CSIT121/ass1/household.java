import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*; 
import java.text.ParseException;

public class household extends product{

	private static final long expireInmillies = 32503683661000L;
	
	protected Dimension Dimension = new Dimension(0,0,0);
			
	//Overloaded with expiry Date
	public household(String IDinput, String Description, double ReccPrice, int unit, int Weight, Dimension dimension, String unitType, String inputPacking)
	{
		this(IDinput, Description,  ReccPrice,  unit,  Weight, dimension, unitType, inputPacking, "01-01-3000");
	}
	public household(String IDinput, String Description, double ReccPrice, int unit, int Weight, Dimension dimension, String unitType, String inputPacking, String inputExpiry)
	{

		super(Description,  ReccPrice,  unit,  Weight);
		packingDate = new Date(-30610200000000L);
		expiryDate = new Date(expireInmillies);

		ID.append("3");
		this.Description = Description;
		this.Dimension = dimension;
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
		return super.getInformationForSavingToFile() + ", " + unitType + ", " +  Dimension.getWidth() + ", " + Dimension.getHeight() + ", " + Dimension.getDepth();
	}
	public String toString()
	{
		return super.toString() + "\nUnit Type" + unitType + "\nDimension: " + Dimension;

	}
	public String getAttributeDescriptionForSavingTofile()
	{
		
		return super.getAttributeDescriptionForSavingTofile() + ", Unit Type, Width, Height, Depth,";
	}
	public int getVolumn()
	{
		return Dimension.getHeight() * Dimension.getWidth() * Dimension.getDepth();
	}


}