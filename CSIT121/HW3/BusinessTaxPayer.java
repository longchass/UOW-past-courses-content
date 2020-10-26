import javax.swing.JOptionPane;

public class BusinessTaxPayer
{
	
private Integer TFN;
private String companyName;
private double totalIncome;
private double totalExpenses;
private Address address;

public BusinessTaxPayer(int TFN, String compName, double totalIn, double totalOut, Address add)
{
	this.TFN = TFN;
	this.companyName = compName;
	this.totalIncome = totalIn;
	this.totalExpenses = totalIn;
	this.address = add;
}

public String toString()
{
	
	return(TFN + ", " + companyName + ", " + totalIncome + ", " + totalExpenses + address.toString());	
}

public Integer getTFN()
{
	return TFN;
}

public void setTFN(Integer input)
{
	TFN = input;
}
public String getCompanyName()
{
	
		return companyName;
	
}
public void setCompanyName(String input)
{
		companyName = input;
	
}
public double getTotalIncome()
{
	return totalIncome;
	
}
public void setTotalIncome(double input)
{
	totalIncome = input;
}
public double getTotalExpenses()
{
	return totalExpenses;
}
public void setTotalExpenses(double input)
{
	totalExpenses = input;
	
}
public Address getAddress()
{
	return address;
}
public void setAddress(Address input)
{
	address = input;
	
}
	public static double calctax(double input, double input2)
	{
		if (input >= 0 && input2 >= 0)
		{
			if(input - input2 > 0)
			return 	Math.round(((input - input2) * 0.3));
			else
			JOptionPane.showMessageDialog(null, "No profit is made can't tax this" );
			return 0;
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Number is not valid try again" );
			return 0;
		}
		
	}





}