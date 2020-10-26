public class Fruit
{
private int ID;
private String description;
private double PricePerUnit;
private int unit = 1;
private int weight;
private String unitType;

public Fruit (int ID, String description, double PricePerUnit, int unit, int weight, String unitType)
{
	this.ID = ID;
	this.description = description;
	this.PricePerUnit = PricePerUnit;
	this.unit = unit;
	this.weight = weight;
	this.unitType = unitType;
		if (unitType == "Dozen")
	{
		unit = 12;


	}
	else if (unitType == "Kilogram")
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
	return description;

}
}