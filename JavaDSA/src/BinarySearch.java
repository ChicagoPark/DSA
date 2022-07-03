import java.util.Arrays;

public class BinarySearch {
	public static void binarySearch(int a[], int value) {
		int start = 0, end = a.length;
		int middle = (int) Math.floor((start+end)/2);
		
		while(start < end && a[middle] != value) {
			if (value < a[middle]) {
				end = middle - 1;
			}
			else {
				start = middle + 1;
			}
			middle = (int) Math.floor((start+end)/2);
		}
		if (a[middle] == value) {
			System.out.println("index: "+ middle);
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[] = new int[] {12,35,38,44,67,80,99,101,120};
		
		binarySearch(a, 35);

	}
}
