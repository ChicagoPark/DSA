import java.util.Arrays;

public class Sort {
	public static void shellSort(int a[]) {
		int n = a.length;

		for (int i = n / 2; i > 0; i /= 2) {
			for (int j = i; j < n; j++) {
				if (a[j] < a[j - i]) {
					int temp = a[j];
					a[j] = a[j - i];
					a[j - i] = temp;
				}
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
		int i = left, j = mid + 1, k = left;
		int b[] = new int[a.length];
		while(i < mid + 1 && j < right + 1) {
			if(a[i] < a[j]) {
				b[k] = a[i];
				i += 1;
				k ++;
			}
			else {
				b[k] = a[j];
				j ++;
				k ++;
			}
		}
		while(i < mid + 1) {
			b[k] = a[i];
			i += 1;
			k ++;
		}
		while(j < right + 1) {
			b[k] = a[j];
			j ++;
			k ++;
		}
		for(int x = left; x < right + 1; x++) {
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
		int pi = high;
		int j = low - 1;
		for (int i = low; i < high ; i++) {
			if (j < high && a[i] < a[pi]) {
				j+=1;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		j+=1;
		int temp = a[j];
		a[j] = a[pi];
		a[pi] = temp;
		return j;
		}

	public static void main(String[] args) {
		int[] a = { 51, 23, 1, 756, 1 };
		int[] b = { 3, 5, 8, 9, 6, 2 };
		int[] c = { 3, 5, 8, 9, 6, 4 };

		Sort s = new Sort();

		s.shellSort(a);

		System.out.println("Shell Sort: " + Arrays.toString(a));

		s.mergeSort(b, 0, b.length - 1);
		System.out.println("Merge Sort: " + Arrays.toString(b));

		s.quickSort(c, 0, c.length - 1);
		System.out.println("Quick Sort: " + Arrays.toString(c));
	}
}
