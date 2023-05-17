import java.util.*;
public class SortingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the size of the array: ");
			int size = scan.nextInt();
			int[] arr= new int[size];
			System.out.println("Enter the array elements: ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
				
			}
			System.out.println("You have entered : ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			int n = arr.length, help = 0;
			for (int i = 0; i <= n-2; i++) {
				for (int j = 0; j <= n-2-i; j++) {
					if (arr[j]>arr[j+1]) {
						help = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = help;
					}
				}
				
			}
			System.out.println("The sorted array is: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
