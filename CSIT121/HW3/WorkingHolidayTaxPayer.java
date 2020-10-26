import javax.swing.JOptionPane;
public class WorkingHolidayTaxPayer extends ForeignResidentTaxPayer
{
	private Integer Visanum;
	public WorkingHolidayTaxPayer(String tfn,String fn, String ln ,double in, Address add, String country,Integer visa)
	{
		super(tfn,fn,ln,in,add,country);
		Visanum = visa;
	}
	public Integer getVisanum()
	{
		return Visanum;
		
		
	}
	public void setVisanum(Integer input)
	{
		Visanum = input;
		
	}
	
	public String toString()
	{
		return super.toString() + ", " + Visanum;
		
	}
	public static double calctax(double input)
	{
		if (input >= 0 && input <= 37000)
		{
			return input*0.15;
		}
		else if(input > 37000 && input <= 90000)
		{
			return 5550 + (input*0.325);
		}
		else if(input > 90000 && input <= 180000)
		{
			return 22775 + (input*0.37);
		}
		else if (input > 180000)
		{
			return 56075 + (input*0.45);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Number is not valid try again" );
			return 0;
		}
		
	}


}