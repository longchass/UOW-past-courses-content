import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*; 
import java.text.ParseException;


public class freshCake extends fresh{
	private int CakeDiameter;
	private String BakerName;
	//Overloaded with unit and packing Date
	public freshCake(String IDinput, String Description, double ReccPrice, int Weight,  String unitType, String inputExpiry, int CakeDiameter, String BakerName)
	{
		this(IDinput, Description, ReccPrice, 1, Weight, unitType, "01-01-1900 00:00:01", inputExpiry, CakeDiameter, BakerName);
	}
	public freshCake(String IDinput, String Description, double ReccPrice, int unit, int Weight, String unitType, String inputPacking, String inputExpiry, int CakeDiameter, String BakerName)
	{
		super(IDinput, Description, ReccPrice, unit, Weight, unitType, inputPacking, inputExpiry);
		this.CakeDiameter = CakeDiameter;
		this.BakerName = BakerName;

	}
	@Override
		public String getInformationForSavingToFile()
	{
		return 	super.getInformationForSavingToFile() + ", " + CakeDiameter + ", " + BakerName;
	}
	@Override
		public String getAttributeDescriptionForSavingTofile()
	{
		return super.getAttributeDescriptionForSavingTofile() + ", Cake Diameter, BakerName";
	}
	@Override
		public String toString()
	{
		return super.toString() + "\nCake Diameter: " + CakeDiameter + "\nBakerName " + BakerName;
	}
}