import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;



public class MyCalendar
{
  static int q;
  static int m;
  static int y;
  static int h;
  static int d;
  
  public static void main(String[] paramArrayOfString)
  {
    Scanner localScanner = new Scanner(System.in);
    
    Array_args0 = paramArrayOfString[0].split("/");
    MyDate localMyDate = new MyDate(Integer.parseInt(Array_args0[0]), Integer.parseInt(Array_args0[1]), Integer.parseInt(Array_args0[2]));
    localMyDate.changeDay(Integer.parseInt(Array_args0[0]));
    localMyDate.changeMonth(Integer.parseInt(Array_args0[1]));
    localMyDate.changeYear(Integer.parseInt(Array_args0[2]));
    
    while (!localMyDate.isDateValid())
    {
      localMyDate.changeDay(Integer.parseInt(Array_args0[0]));
      localMyDate.changeMonth(Integer.parseInt(Array_args0[1]));
      localMyDate.changeYear(Integer.parseInt(Array_args0[2]));
      

      System.out.printf("%02d/%02d/" + localMyDate.getYear() + " is not a valid date, please re-input a valid date: ", new Object[] { Integer.valueOf(localMyDate.getDay()), Integer.valueOf(localMyDate.getMonth()) });
      
      Arrays.fill(Array_args0, null);
      Array_args0 = localScanner.next().split("/");
      localMyDate.changeDay(Integer.parseInt(Array_args0[0]));
      localMyDate.changeMonth(Integer.parseInt(Array_args0[1]));
      localMyDate.changeYear(Integer.parseInt(Array_args0[2]));
    }
    
    MyCalendar localMyCalendar = new MyCalendar(localMyDate);
    System.out.printf("%02d/%02d/" + y, new Object[] { Integer.valueOf(q), Integer.valueOf(m) });
    System.out.println(" is a " + localMyCalendar.dayOfWeek() + " and located in the " + Week[localMyCalendar.weekOfMonth()] + " week of " + month[m] + " " + y);
    System.out.println("The calendar of " + month[m] + " " + y + " is: ");
    System.out.println();
    localMyCalendar.printCalendar();
  }
  
  public MyCalendar(MyDate paramMyDate)
  {
    myDate = paramMyDate;
    q = paramMyDate.getDay();
    m = paramMyDate.getMonth();
    y = paramMyDate.getYear();
    
    int i = y - (14 - m) / 12;
    int j = i + i / 4 - i / 100 + i / 400;
    int k = m + 12 * ((14 - m) / 12) - 2;
    d = (1 + j + 31 * k / 12) % 7;
    int n = m;
    int i1 = y;
    
    if (((m == 2) && (y % 400 == 0)) || ((y % 4 == 0) && (y % 100 != 0))) { days_in_month[m] = 29;
    } else if (m == 2) days_in_month[m] = 28;
    if (m < 3)
    {
      n = m + 12;
      i1 = y - 1;
    }
    int i2 = i1 % 100;
    int i3 = i1 / 100;
    h = (q + 13 * (n + 1) / 5 + i2 + i2 / 4 + i3 / 4 + 5 * i3) % 7;
  }
  
  public Day dayOfWeek()
  {
    switch (h)
    {
    case 0: 
      return Day.Saturday;
    case 1: 
      return Day.Sunday;
    case 2: 
      return Day.Monday;
    case 3: 
      return Day.Tuesday;
    case 4: 
      return Day.Wednesday;
    case 5: 
      return Day.Thursday;
    case 6: 
      return Day.Friday;
    }
    System.out.println("no");
    

    return day;
  }
  


  public void printCalendar()
  {
    System.out.println("SUN   MON   TUE   WED   THU   FRI   SAT");
    
    for (int i = 0; i < d; i++)
      System.out.printf("      ", new Object[0]);
    for (i = 1; i <= days_in_month[m]; i++)
    {

      System.out.printf("%-3d   ", new Object[] { Integer.valueOf(i) });
      if (((i + d) % 7 == 0) || (i == days_in_month[m]))
      {
        System.out.println();
      }
    }
  }
  



  public int weekOfMonth()
  {
    for (int i = 1; i <= days_in_month[m]; i++)
    {

      if (((i + d) % 7 == 0) && (i < q))
      {
        track_loop += 1;
      }
    }
    return track_loop;
  }
  





  int track_loop = 0;
  
  private MyDate myDate;
  
  private static Day day;
  private static String[] Array_args0;
  private static String[] Week = { "first", "second", "third", "fourth", "fifth", "sixth" };
  int[] days_in_month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  static String[] month = { " ", "January", "Febuary", "March", "April", "May", "Jun", "July", "August", "September", "October", "November", "December" };
}
