import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*; 
import java.text.ParseException;
public class UnderGradStudent extends Student
{
	private double ATAR;
	private boolean Domestic;
	
	public UnderGradStudent(String name, int ID, String address, String MobileNum, int IDNum, double ATAR_INPUT, boolean yesno)
	{
		this.name = name;
		this.ID = ID;
		this.Address = new address(address);
		this.Mobile_Num = MobileNum;
		this.ID_Num = IDNum;
		this.ATAR = ATAR_INPUT;
		this.Domestic = yesno;
		
	}

}