import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*; 
import java.util.Collections;
public class UserManagement
{
	private ArrayList<User> ArrayListinput = new ArrayList<User>();
	
	public ArrayList<User> getArrayList()
	{
			return ArrayListinput;
		
	}

	public void readData()
		{
			try{
				Scanner reader = new Scanner(Paths.get("data.txt"));
				reader.nextLine();
				reader.nextLine();



				while(reader.hasNext())
				{
					String input = reader.nextLine();
					String[] sp = input.split(",");
					User read = new User(sp[0], sp[1], sp[2], Integer.parseInt(sp[3]));
					ArrayListinput.add(read);
				}
			}
			catch(IOException e)
			{
				
				
			}
		}
	public String printFormat()
	{
		return "StudentID,First Name,Last Name,Mark";
	}
	public String[] display()
	{
		String[] hi = ArrayListinput.stream().map(e -> e.showdata()).toArray(String[]::new);
		return hi;
	}
	public String[] displaysorted()
	{
		String[] hi = ArrayListinput.stream().map(e -> e.showdata()).sorted(Comparator.reverseOrder()).toArray(String[]::new);
		return hi;
	}

	
}