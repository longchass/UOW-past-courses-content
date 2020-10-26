import java.util.*;
public class test
{
	public static void main(String[] args)
	{
		GUI first = new GUI();
		Student hi = new Student("a", "b", "1123456");
		StudentManagement database = new StudentManagement();
		database.readFile();
		ArrayList<Student> ho = database.getArray();
		
		System.out.println(hi);
		for(Student i : ho)
		{
				System.out.println(i);
			
		}
	
	}





}