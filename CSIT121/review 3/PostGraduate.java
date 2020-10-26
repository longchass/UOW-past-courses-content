public class PostGraduate extends Student
{
	Address add;
	public PostGraduate(String f, String l, String ID, Address add)
	{
		super(f,l,ID);
		this.add =add;
	}	
	public PostGraduate(String f, String l, String ID)
	{
			this(f,l,ID,new Address("1","2","3",State.NSW));
		
	}

}