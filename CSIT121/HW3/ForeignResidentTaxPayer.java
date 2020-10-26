import javax.swing.JOptionPane;
public class ForeignResidentTaxPayer extends TaxPayer
{
	private String countryOfOrigin;
	public ForeignResidentTaxPayer(String tfn,String fn, String ln ,double in, Address add, String country)
	{
		super(tfn,fn,ln,in,add);
		countryOfOrigin = country;
	}
	public String getCountryOfOrigin()
	{
		return countryOfOrigin;
		
		
	}
	public void setCountryOfOrigin(String input)
	{
		countryOfOrigin = input;
		
	}
	@Override
	public String toString()
	{
		return super.toString() + ", " + countryOfOrigin;
		
	}
	public static double calctax(double input)
	{
		if (input >= 0 && input <= 90000)
		{
			return input*0.325;
		}
		else if(input > 90000 && input <= 180000)
		{
			return 19250 + (input*0.37);
		}
		else if(input > 180000)
		{
			return 62550 + (input*0.45);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Number is not valid try again" );
			return 0;
		}
		
	}


}