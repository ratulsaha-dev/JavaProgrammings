import java.util.*;
public class MainApp {
	public static void main(String[] args) {
		CheckValue ch = new CheckValue();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value to check");
		int val = scan.nextInt();
		scan.close();
		System.out.println(ch.check(val));
	}

}
