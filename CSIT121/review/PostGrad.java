public class PostGrad extends Student
{
	GradType type;

	public PostGrad(String fname, String lname, String cname, int ID, double ATAR, GradType type)
	{
		super( fname,  lname,  cname,  ID,  ATAR);
		this.type = type;
		
	}
	public PostGrad(String fname, String lname, String cname, int ID, double ATAR)
	{
		this(fname,lname,cname,ID,ATAR,GradType.Master);
	}



}