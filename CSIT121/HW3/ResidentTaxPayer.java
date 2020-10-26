import javax.swing.JOptionPane;
public class ResidentTaxPayer extends TaxPayer
{
	private State state;
	public ResidentTaxPayer(String tfn,String fn, String ln ,double in, Address add, State stat)
	{
		super(tfn,fn,ln,in,add);
		state = stat;
	}
	public State getState()
	{
		return state;
		
		
	}
	public void setState(State input)
	{
		state = input;
		
	}
	public String toString()
	{
		return super.toString() + state.toString();	
	}
	
	public static double calctax(double input)
	{
		if (input >= 0 && input <= 18200)
		{
			return 0;
		}
		else if(input > 18200 && input <= 37000)
		{
			return ((input-18200)*0.19);
		}
		else if(input > 37000 && input <= 90000)
		{
			return 3572 + ((input - 37000)*0.325);
		}
		else if(input > 90000 && input <= 180000)
		{
			return 20797 + ((input - 90000)*0.37);
		}
				else if(input >  180000)
		{
			return 54097 + ((input - 180000)*0.45);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Number is not valid try again" );
			return 0;
		}
		
	}


}