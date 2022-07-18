public class Intermediate12_generic {
	
	// put the generic type just after `static`
	public static <T> void printMe(T[] i){
		for(T x : i)
			System.out.printf("%s ", x);
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] iray = {1,2,3,4};
		Character[] cray = {'b', 'u', 'c', 'y'};
		
		printMe(iray);
		printMe(cray);
	}
}
