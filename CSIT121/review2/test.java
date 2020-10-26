import java.util.*;
import java.util.ArrayList;
public class test
{
	public static void main(String[] args)
	{
	 Student first = new Student("0123456", "A1", "le", "log");
	 first.getID();
	 
	 StudentManagement hello = new StudentManagement();
	 hello.populate();
	 ArrayList<Student> hi =  hello.getArray();
	 for(Student i : hi)
	 {
		System.out.println(i);
	 }
	 
	 hi.stream().sorted(Comparator.comparing(Student::getID)).forEach(i -> System.out.println(i));
	}
	

}