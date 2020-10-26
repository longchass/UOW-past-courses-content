public class Student
{
	protected String name;
	protected int ID;
	protected address Address;
	protected String Mobile_Num;
	protected int ID_Num;

	public Student(String name, int ID, String address, String MobileNum, int IDNum)
	{
		this.name = name;
		this.ID = ID;
		this.Address = new address(address);
		this.Mobile_Num = MobileNum;
		this.ID_Num = IDNum;
		
	}


}