import java.lang.*;
public enum PermissionType
{
	Edit("Allow to view or edit", 1),
	View("Only allow to view the result", 2),
	Test("Only allow to do the test", 3),
	None("Don't have any persmission", 5);

	private String name;
	private int id;
	PermissionType(String descriptor, int input)
	{
		this.name = descriptor;
		this.id = input;
	}

	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
		public String toString()
	{
		return name + " " + id;
	}
}