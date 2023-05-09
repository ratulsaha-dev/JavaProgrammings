import java.util.*;
public class BinarySearchAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int length = scan.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an element");
			arr[i]= scan.nextInt();
		}
		System.out.println("Enter key to search");
		int key = scan.nextInt();
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(key == arr[mid]) {
				System.out.println("Key found at the index " + mid);
				System.exit(0);
			}
			else if(key>arr[mid]) {
				low = mid+1;
				high = high;
			}
			else {
				high = mid-1;
				low = low;
			}
		}
		System.out.println("Key not found");
		

	}

}
