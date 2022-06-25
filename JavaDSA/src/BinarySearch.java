public class BinarySearch {
	public static void binarySearch(int a[], int value) {
		int start = 0;
		int end = a.length - 1;
		int middle = (int) Math.floor((start + end) / 2);
		while (start < end && a[middle] != value) {
			if (value < a[middle]) {
				end = middle - 1;
			}
			else {
				start = middle + 1;
			}
			middle = (int) Math.floor((start + end) / 2);
			System.out.println(middle);
		}
		//System.out.println(middle);
		//System.out.println(a[middle]);
		
		if (a[middle] == value) {
			System.out.println("index: "+ middle);
		}
		else {
			System.out.println("NOne");
		}
	}

	public static void main(String[] args) {
		int a[] = new int[] {12,35,38,44,67,80,99,101,120};
		
		binarySearch(a, 35);

	}
}
