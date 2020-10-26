import java.nio.file.Paths;
import java.util.*;
import java.io.IOException;
public class StudentManagement
{
	public HashMap<String, Student> database = new HashMap<String, Student>();
	public StudentManagement()
	{
		
	
	
	}
	public ArrayList<Student> getArray()
	{
		System.out.println(database.values());
		ArrayList<Student> o = new ArrayList<Student>(database.values());
		System.out.println(o);
		return o;
	}
	
	public void readFile()
	{
		Scanner in = null;
		boolean error= false;
		try{
		in = new Scanner(Paths.get("data.txt"));
		}
		
		catch(IOException e)
		{
			error = true;
			throw new NullPointerException("File not Found");
		
		}
		
		if(!error)
		{
			while(in.hasNext())
			{
				try{
					String lol = in.nextLine();
					String[] data = lol.split(",");
					
					if(data.length == 3)
					{
						Student input = new Student(data[0], data[1], data[2]);
						
						database.put(input.getID(), input);
						
					}
					else if(data.length == 7)
					{
						PostGraduate input = new PostGraduate(data[0], data[1], data[2], new Address(data[3],data[4],data[5],State.valueOf(data[6])));
						database.put(input.getID(), input);
					}
					else
					{
						System.out.println("fasd");
					}
				
				}
				catch (NoSuchElementException e)
				{
					throw new NullPointerException("can't parse the student");
				}				
					
				
				
				
			}
			
			
	}
	}





}