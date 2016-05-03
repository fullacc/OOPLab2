public class DayTester
{
   public static void main(String[] args)
   {
      Day today = new Day(2001, 2, 3); // February 3, 2001
      Day later = today.addDays(999);
      System.out.println(later.getYear() 
            + "-" + later.getMonth() 
            + "-" + later.getDate()); 
      System.out.println(later.daysFrom(today)); // Prints 999
	
	  Day before = new Day(339,3,2);
	   
	  
	   
	   today.printCalendar(1, 2016);
	   today.printCalendar(2,2016);
	   
	   today.before(before);
	   today.after(later);
   }
}
