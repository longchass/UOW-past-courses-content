public class householdKitchenWare extends household{


	private String Manufacturer;
	private String Series;
	//Overloaded with ExpiryDate
	public householdKitchenWare(String IDinput, String Description, double ReccPrice, int unit, int Weight, Dimension dimension, String unitType, String inputPacking, String Manufacturer, String Series)
	{
		this(IDinput, Description, ReccPrice, unit, Weight, dimension, unitType, inputPacking, "01-01-3000", Manufacturer, Series );
	}
	public householdKitchenWare(String IDinput, String Description, double ReccPrice, int unit, int Weight, Dimension dimension, String unitType, String inputPacking, String inputExpiry, String Manufacturer, String Series)
	{
		super(IDinput, Description, ReccPrice, unit, Weight, dimension, unitType, inputPacking, inputExpiry);
		this.Manufacturer = Manufacturer;
		this.Series = Series;
	}

		public String getInformationForSavingToFile()
	{
		return super.getInformationForSavingToFile() + ", " + Manufacturer + ", " + Series;
	}
	public String toString()
	{
		return super.toString() + "\nManufacturer: " + Manufacturer + "\nSeries: " + Series;

	}
	public String getAttributeDescriptionForSavingTofile()
	{
		
		return super.getAttributeDescriptionForSavingTofile() + ", Manufacturer, Series";
	}

}


