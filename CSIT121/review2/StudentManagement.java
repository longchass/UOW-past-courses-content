import java.util.*;
import java.util.ArrayList;


public class StudentManagement
{
	HashMap<String, Student> wow = new HashMap<String, Student>();
	public void populate()
	{
	Student first = new Student("0123456", "A1", "le", "log");
	Student second = new Student("0222222", "A1", "le", "log");

	wow.put("fuck", first);
	wow.put("ey", second);
	}
	public ArrayList<Student> getArray()
	{
		ArrayList<Student> fuck = new ArrayList<Student>(wow.values());
		return fuck;
	}


}