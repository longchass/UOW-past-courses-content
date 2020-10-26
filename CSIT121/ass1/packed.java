import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*; 
import java.text.ParseException;

public class packed extends product{
	private static final long expireInmillies = 32503683661000L;

	
	protected Dimension Dimension = new Dimension(0,0,0);
		
	protected Nutrition Nutrition;
	
	
	protected UnitTypeLimit UnitType;
	
	//Overloaded with expiry Date

	public packed(String IDinput, String Description, double ReccPrice, int unit, int Weight, Dimension dimension, UnitTypeLimit unitType, String inputPacking, Nutrition nutrition)
	{
		this(IDinput, Description, ReccPrice, unit, Weight, dimension, unitType, inputPacking, "01-01-3000", nutrition);
	}
	public packed(String IDinput, String Description, double ReccPrice, int unit, int Weight, Dimension dimension, UnitTypeLimit unitType, String inputPacking, String inputExpiry, Nutrition nutrition)
	{
		super(Description,  ReccPrice,  unit,  Weight);
	    expiryDate = new Date(expireInmillies);

		ID.append("2");
		this.Description = Description;
		this.Dimension = dimension;
		this.ReccPrice = ReccPrice;
		this.unit = unit;
		this.Weight = Weight;
		this.UnitType = unitType;
		
		this.Nutrition = nutrition;
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
	
	public boolean verifyUnitType(UnitTypeLimit input)
	{
		if (input == UnitType)
		{
			
			return true;
		}
		
		else
		{
			return false;
		}
	}
	

	@Override
	public String getInformationForSavingToFile()
	{
		return 	 super.getInformationForSavingToFile() + ", " + UnitType + ", " + Dimension.getWidth() + ", " + Dimension.getHeight() + ", " + Dimension.getDepth() + ", "  + Nutrition.getInformationForSavingToFile();
	}
	@Override
	public String toString()
	{
		return super.toString() + "\nUnit Type" + UnitType + "\nDimension" + Dimension +"\nNutrition" + Nutrition;
	}
	@Override
	public String getAttributeDescriptionForSavingTofile()
	{
		return super.getAttributeDescriptionForSavingTofile() + ", UnitType, Width, Height, Depth, Quantity, Engergy, Protein, Fat, Sugar, Salt";
	}
	public int getVolumn()
	{
		return Dimension.getHeight() * Dimension.getWidth() * Dimension.getDepth();
	}
}
	 class Dimension
	
	{
	private int height = 0;
	private int width = 0;
	private int depth = 0;
	
	public Dimension(int height, int width, int depth)
	{
		this.height = height;
		this.width  = width;
		this.depth  = depth;
		
		
		
	}
	public Dimension()
	{
		
	}
	public String toString()
	{
			return ("\nwidth: " + width + "\nheight: "  + height + "\ndepth: " + depth);		
	}
	public int getHeight()
	{
		return height;
	}
	public int getWidth()
	{
		return width;
	}
	public int getDepth()
	{
		return depth;
	}
	}
	 class Nutrition
	{
	private int Quantity;
	private int Engergy;
	private int Protein;
	private int Fat;
	private int Sugar;
	private int Salt;
	private Dimension Dimension = new Dimension();
	public Nutrition(String full)
		{
			String[] address = full.split("/",6);
			this.Quantity = Integer.parseInt(address[0]);
			this.Engergy = Integer.parseInt(address[1]);
			this.Protein = Integer.parseInt(address[2]);
			this.Fat = Integer.parseInt(address[3]);
			this.Sugar = Integer.parseInt(address[4]);
			this.Salt = Integer.parseInt(address[5]);
		}
	public String toString()
		{
			return ( "\nQuantity: "+ Quantity + "\nEngergy: " + Engergy + "\nProtein: " + Protein + "\nFat: " + Fat + "\nSugar: " + Sugar + "\nSalt: " + Salt);		
		}
	public String getInformationForSavingToFile()
		{
			return(Quantity + ", " + Engergy + ", " + Protein + ", " + Fat + ", " + Sugar + ", " + Salt);
		}
}
enum UnitTypeLimit {
	
	
	
	
	Box, Bottle, Pack;
	public String returnType()
	
	{
		
		return this.toString();
		
	}
};
	


