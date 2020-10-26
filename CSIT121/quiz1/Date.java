public class Date{
	 private int day;
	 private int month;
	 private int year;
	 
	 public Date(String input)
	 {
		String[] inputDate = input.split("/");
		this.day = Integer.parseInt(inputDate[0]);
		this.month = Integer.parseInt(inputDate[1]);
		this.year = Integer.parseInt(inputDate[2]);
		
		 
	 }

}