import java.lang.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class toStringtest
{
	public static void main (String[] args)
	{
	StringBuilder  lol = new StringBuilder ();
	SimpleDateFormat pack = new SimpleDateFormat("dd-MM-yyyy");
	try{
			Date hello = pack.parse("14-12-1964");
		System.out.println(hello);
	}
	catch (ParseException e)
	{
			System.out.println("fs");
	}
	//lol.append("hi").append(System.getProperty("line.seperator"));
	lol.append("hi");
	System.out.println(lol.toString());
	System.out.println(String.format("%s: %s%n, %s", "hi", "long", "name"));
	String fuck = "ASDFASDF";
	try
	{
	Formatter hi = new Formatter("shit.txt");
	
	hi.format("%s", fuck);
	hi.close();


	}
	catch(FileNotFoundException e)
	{
		throw new NullPointerException();
	}

	}
}