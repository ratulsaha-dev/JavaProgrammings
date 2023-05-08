import java.util.*;
public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		TaxCalculator t = new TaxCalculator();
		System.out.println(" Enter the amount");
		double income = scan.nextDouble();
		scan.close();
		double tax = t.calculateTax(income);
        System.out.println("Tax: " + tax);
	}
}
