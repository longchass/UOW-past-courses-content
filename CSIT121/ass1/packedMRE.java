public class packedMRE extends packed{
	
	
	private String Producer;
	private String Code;

		//Overloaded with  Dimension, packing Date and expiry Date


	public packedMRE (String IDinput, String Description, double ReccPrice, int unit, int Weight, UnitTypeLimit unitType, Nutrition nutrition, String Producer, String code)
	{
		this(IDinput, Description, ReccPrice, unit, Weight, new Dimension(0,0,0), unitType, "01-01-1900 00:00:01", "01-01-3000", nutrition, Producer, code);

	}

	public packedMRE(String IDinput, String Description, double ReccPrice, int unit, int Weight, Dimension dimension, UnitTypeLimit unitType, String inputPacking, String inputExpiry, Nutrition nutrition, String Producer, String code)
	{
		super( IDinput,  Description,  ReccPrice,  unit,  Weight,  dimension,  unitType,  inputPacking,  inputExpiry,  nutrition);
		this.Producer = Producer;
		this.Code = code;
		
	}


	@Override
		public String getInformationForSavingToFile()
	{
		return 	super.getInformationForSavingToFile() +  ", " + Producer + ", " + Code;
	}
	@Override
		public String getAttributeDescriptionForSavingTofile()
	{
		return super.getAttributeDescriptionForSavingTofile() + ", Producer, Code";
	}
	@Override
		public String toString()
	{
		return super.toString() + "\nProducer: "  + Producer + "\nCode: " + Code;
	}

	
	
	
	
	
	
}
