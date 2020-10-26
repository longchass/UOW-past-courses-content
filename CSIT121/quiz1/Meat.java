public class Meat
{
	private int ID;
	private String description;
	private double PricePerUnit;
	private int unit = 1;
	private int weight;
	private String MeasureType;
	private Date PackingDate;
	private Date ExpireDate;
	
public Meat(int ID, String description, double PricePerUnit, int unit, int weight, String MeasureType, Date PackingDate, Date ExpireDate) {
	this.ID = ID;
	this.description = description;
	this.PricePerUnit = PricePerUnit;
	this.unit = unit;
	this.weight = weight;
	this.MeasureType = MeasureType;
	this.PackingDate = PackingDate;
	this.ExpireDate = ExpireDate;

	if (unitType == "Kilogram")
	{

		pricePerUnit = PricePerUnit*weight;
		unit = 1;
	}

}

	public String getUnitTypeInString()
{
	return unitType.toString();

}

public String getQuantity()
{
	return unit;
}

public double getUnitPrice()
{
	return PricePerUnit;
}

public String getDescription()
{
	return description + " " + getUnitPrice.toString() + " Per KG" ;

}

}