import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*; 


public class product
{

	protected String Description;
	protected double ReccPrice;
	protected int unit =1;
	protected int Weight;
	protected static final long packInmillies = -2209024800000L;
	protected String unitType;
	protected SimpleDateFormat packing = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	protected SimpleDateFormat expiry = new SimpleDateFormat("dd-MM-yyyy");
	protected StringBuilder ID = new StringBuilder();
	protected Date packingDate = new Date(packInmillies);
	protected Date expiryDate;

	public product()
	{
	
	}
	public product( String Description, double ReccPrice, int unit, int Weight)
	{
		this.Description = Description;
		this.ReccPrice = ReccPrice;
		this.unit = unit;
		this.Weight = Weight;
	}
	public String comparePrice(double input)
    {
        if (ReccPrice > input)
            return "More than reccomended price";
        else if (ReccPrice < input)
            return"Cheaper than reccomended price";
        else 
            return"Same price as reccomended";
    }
    public void editProductInformation( String Description, int unit, double price, int weight) {
    this.Description = Description;
    this.unit = unit;
    this.ReccPrice = price;
    this.Weight = weight;
    }
    public boolean verifyExpireProduct(Date input)
    {
        if (expiryDate.after(input)) {
			return false;
        }

        if (expiryDate.before(input)) {
            return true;
        }

        else{
            return true;
        }
    }
	public String getInformationForSavingToFile()
	{
		return ID.toString() + ", " + Description + ", " + ReccPrice + ", " + unit + ", " + Weight  + ", " + packingDate + ", " + expiryDate;
	}
	public String toString()
	{
		return "ID: " + ID.toString() + "\nDescription: " + Description + "\nReccomended price: " + ReccPrice + "\nUnit: " + unit + "\nWeight: " + Weight + "\nPacking date: " + packingDate + "\nExpire Date: " + expiry.format(expiryDate);
	}
	public String getAttributeDescriptionForSavingTofile()
	{
		return "ID, Description, Recomended Price, Unit, Weight, Unit type, Packing Date, Expire Date";
	}

	public static ArrayList<product> sortByPrice( ArrayList<product> list1)
	{
		ArrayList<product> sorted  = list1;
		Comparator<product> c = new Comparator<product>()
		{
			public int compare(product a, product b)
			{
                return Double.compare(a.getPrice(), b.getPrice());
			}
		};
		Collections.sort(sorted, c);
		return sorted;
	}
	public static ArrayList<product> findProductFromDescription(ArrayList<product> shoppingCart, String input) {
        ArrayList<product> find = new ArrayList<product>();
        for (product product : shoppingCart) {
      	if(product.getDescription().contains(input)==true)
       		{
        		find.add(product);

        	}
        	else
        	{

        	}
        }
        return find;

    }
    public static String allProductToString(ArrayList<product> cart)
    {
    	StringBuilder Allinfo = new StringBuilder();
    	for (product i : cart)
		{
			
			Allinfo.append(i.toString());
			Allinfo.append(System.getProperty("line.separator"));
			Allinfo.append(System.getProperty("line.separator"));
			
		}
		return Allinfo.toString();
    }
    	public String verifyUnitType(String input)
	{
		if (input.equals(unitType))
		{
			
			return "Yes";
		}
		
		else
		{
			return "The type input doesn't  matches with the item";
		}
	}
	public double getPrice()
	{
		return ReccPrice;
	}
	public String getDescription()
	{
		return Description;
	}


}
