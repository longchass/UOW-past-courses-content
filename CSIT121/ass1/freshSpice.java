import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*; 
import java.text.ParseException;


public class freshSpice extends fresh{
	private String jar;
	private String components;
	//Overloaded with unit and packing date
	public freshSpice(String IDinput, String Description, double ReccPrice, int Weight,  String unitType, String inputExpiry, String jar, String components)
	{
		this(IDinput, Description, ReccPrice, 1, Weight, unitType, "01-01-1900 00:00:01", inputExpiry, jar, components);
	}
	public freshSpice(String IDinput, String Description, double ReccPrice, int unit, int Weight,  String unitType, String inputPacking, String inputExpiry, String jar, String components)
	{
		super(IDinput, Description, ReccPrice, unit, Weight, unitType, inputPacking, inputExpiry);
		this.jar = jar;
		this.components = components;

	}
	@Override
		public String getInformationForSavingToFile()
	{
		return 	super.getInformationForSavingToFile() + ", " + jar + ", " + components;
	}
	@Override
		public String getAttributeDescriptionForSavingTofile()
	{
		return super.getAttributeDescriptionForSavingTofile() + ", jar, components";
	}
	@Override
	public String toString()
	{
		return super.toString() + "\njar: " + jar + "\ncomponents: " + components;
	}
}