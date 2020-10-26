public class householdStationery extends household{


	private String inkType;
	private String penType;
	//Overloaded with expiry Date
	public householdStationery(String IDinput, String Description, double ReccPrice, int unit, int Weight, Dimension dimension, String unitType, String inputPacking, String inkType, String penType)
	{
		this(IDinput, Description, ReccPrice, unit, Weight, dimension, unitType, inputPacking, "01-01-3000", inkType, penType);
	}
	public householdStationery(String IDinput, String Description, double ReccPrice, int unit, int Weight, Dimension dimension, String unitType, String inputPacking, String inputExpiry, String inkType, String penType)
	{
		super(IDinput, Description, ReccPrice, unit, Weight, dimension, unitType, inputPacking, inputExpiry);
		this.inkType = inkType;
		this.penType = penType;
	}

		public String getInformationForSavingToFile()
	{
		return super.getInformationForSavingToFile() + ", " + inkType + ", " + penType;
	}
	public String toString()
	{
		return super.toString() + "\ninkType: " + inkType + "\npenType: " + penType;

	}
	public String getAttributeDescriptionForSavingTofile()
	{
		
		return super.getAttributeDescriptionForSavingTofile() + ", inkType, penType";
	}

}


