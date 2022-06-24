import java.util.Arrays;

public class Sort_Answer {
	public static void shellSort(int a[]) {
		int n = a.length;

		// Until: gap > 0
		// way: compare next element at the next gap.
		// After swapping compare with previous element in the left gap

		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i++) {
				int temp = a[i];
				int previous = i - gap;
				while (previous >= 0 && a[previous] > temp) {
					a[previous + gap] = a[previous];
					previous = previous - gap;
				}
				a[previous + gap] = temp;
			}
		}
	}

	public static void mergeSort(int a[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(a, left, mid);
			mergeSort(a, mid + 1, right);
			merge(a, left, mid, right);
		}
	}

	public static void merge(int a[], int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		int b[] = new int[right+1];
		
		// Loop1: increasing i, j at the same time under the condition
		while (i <= mid && j <= right) {
			if (a[i] > a[j]) {
				b[k] = a[j];
				j+=1;
				k+=1;
			}
			else {
				b[k] = a[i];
				i+=1;
				k+=1;
			}
		}
		// Loop2: check the remaining at the below of mid
		while (i <= mid) {
			b[k] = a[i];
			i+=1;
			k+=1;
		}
		// Loop3: check the remaining at the below of right
		while (j <= right) {
			b[k] = a[j];
			j+=1;
			k+=1;
		}
		
		// Loop3: reflect the change into the array a
		for (int x = left; x < right+1;x++) {
			a[x] = b[x];
		}
	}

	public static void quickSort(int a[], int low, int high) {
		if (low < high) {
			int pi = partition(a, low, high);
			quickSort(a, low, pi - 1);
			quickSort(a, pi + 1, high);
		}
	}

	public static int partition(int a[], int low, int high) {
		int pi = a[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (a[j] <= pi) {
				i += 1;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		return i + 1;
	}

	public static void main(String[] args) {
		int[] a = { 51, 23, 1, 756, 1 };
		int[] b = { 3, 5, 8, 9, 6, 2 };
		int[] c = { 3, 5, 8, 9, 6, 4 };

		Sort_Answer s = new Sort_Answer();

		s.shellSort(a);

		System.out.println(Arrays.toString(a));

		s.mergeSort(b, 0, b.length - 1);
		System.out.println(Arrays.toString(b));

		s.quickSort(c, 0, c.length - 1);
		System.out.println(Arrays.toString(c));
	}
}
