public class packedMeat extends packed{
	
	
	private String meatType;
	private int grade;

	//Overloaded with Dimension, packin date, expiryDate

	public packedMeat (String IDinput, String Description, double ReccPrice, int unit, int Weight, UnitTypeLimit unitType, Nutrition nutrition, String meatType, int grade)
	{
		this(IDinput, Description, ReccPrice, unit, Weight, new Dimension(0,0,0), unitType, "01-01-1900 00:00:01", "01-01-3000", nutrition, meatType, grade);

	}
	public packedMeat (String IDinput, String Description, double ReccPrice, int unit, int Weight, Dimension dimension, UnitTypeLimit unitType, String inputPacking, String inputExpiry, Nutrition nutrition, String meatType, int grade)
	{
		super( IDinput,  Description,  ReccPrice,  unit,  Weight,  dimension,  unitType,  inputPacking,  inputExpiry,  nutrition);
		this.meatType = meatType;
		this.grade = grade;
	}
	@Override
		public String toString()
	{
		return 	super.toString() + "\nMeat Type: " + meatType + "\nGrade: " + grade;
	}
	
	@Override
		public String getAttributeDescriptionForSavingTofile()
	{
		return super.getAttributeDescriptionForSavingTofile() + ", Meat type, Grade";
	}
	@Override
		public String getInformationForSavingToFile()
	{
		return 	super.getInformationForSavingToFile() + ", " + meatType + ", " + grade;
	}
	
	
	
	
}
