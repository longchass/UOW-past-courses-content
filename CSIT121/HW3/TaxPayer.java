public abstract class TaxPayer
{
	private String TFN;
	private String firstName;
	private String lastName;
	private double income;
	private Address address;
	public TaxPayer(String tfn,String fn, String ln ,double in, Address add)
	{
		TFN = tfn;
		firstName = fn;
		lastName = ln;
		income = in;
		address = add;
	}
	public static double calctax(double input)
	{
		return (double) 0;
		
		
	}
	public double calctax()
	{
		return  (double) 0;
		
		
		
	}
	public void setIncome(double input)
	{
	
		income = input;
		
	}
	public double getIncome()
	{
		return income;
	}
	public String toString()
	{
		
		return TFN + ", " + firstName + ", " + lastName + ", " + income + ", " + address;
		
	}
}