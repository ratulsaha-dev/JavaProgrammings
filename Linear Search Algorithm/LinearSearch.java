import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = scan.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" Enter an element ");
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter key to search");
		int key = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(key==arr[i]) {
				System.out.println("Element is present in "+ i + " th index");
				System.exit(0);			// exit from the code snippet if key is present in the array
			}
			
		}
		System.out.println("Key not found");
	}

}
