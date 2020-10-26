public class Student
{
	protected String fname;
	protected String lname;
	protected String cname;
	protected int ID;
	protected double ATAR ;
	public Student(String fname, String lname, String cname, int ID, double ATAR)
	{
		this.fname = fname;
		this.lname = lname;
		this.cname = cname;
		this.ID	   = ID;
		this.ATAR = ATAR;
	}
	public Student(String fname, String lname, String cname, int ID)
	{
		this(fname, lname, cname, ID, 99.5);
		
	}
	public String toString()
	{
		return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s: %s", "First name", fname, "Last name", lname, "cname", cname, "ID", ID, "ATAR", ATAR);
		
	}



}