public class Intermediate12_generic {
	// put the generic type just after `static`
	public static <T> void printMe(T[] i) {
		for (T x : i)
			System.out.printf("%s ", x);
		System.out.println();
	}

	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T max = a;
		if(b.compareTo(max) > 0)
			max = b;
		if(c.compareTo(max)>0)
			max = c;
		
		return max;
	}

	public static void main(String[] args) {
		Integer[] iray = { 1, 2, 3, 4 };
		Character[] cray = { 'b', 'u', 'c', 'y' };

		printMe(iray);
		printMe(cray);
		
		// use max function
		System.out.println(max(42, 16, 18));
	}
}
