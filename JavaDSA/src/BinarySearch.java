import java.util.Arrays;

public class BinarySearch {
	public static void binarySearch(int a[], int value) {
		int start = 0, end = a.length, mid = (start + end)/2;
		while(start < end && a[mid] != value) {
			if(a[mid] < value) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			mid = (start + end)/2;
		}
		if(a[mid] == value) {
			System.out.println("index: " + mid);
		}
	}

	public static void main(String[] args) {
		int a[] = new int[] { 12, 35, 38, 44, 67, 80, 99, 101, 120 };

		binarySearch(a, 99);

	}
}
