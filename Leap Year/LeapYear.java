import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Enter the year to check");
	     int year = scan.nextInt();
	     scan.close();
	     if (year % 400 == 0)
	       System.out.println (year + " is a Leap Year");

	     else if (year % 4 == 0 && year % 100 != 0)
	       System.out.println (year + " is a Leap Year");

	     else
	         System.out.println (year + " is not a Leap Year");


	}

}
