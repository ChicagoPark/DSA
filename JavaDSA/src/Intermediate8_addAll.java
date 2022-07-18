import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Intermediate8_addAll {
	public static void main(String[] args) {
		String[] stuff = {"apples", "beef", "corn", "ham"};
		List<String> l1 = Arrays.asList(stuff);
		
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("youtube");
		l2.add("google");
		l2.add("digg");

		
		for(String x: l1) {
			System.out.printf("%s ", x);
		}
		
		Collections.addAll(l2, stuff);
		
		System.out.println();
		
		for(String x: l2) {
			System.out.printf("%s ", x);
		}
		
		System.out.println();
		// Use frequency method to figure out the number of value
		System.out.println(Collections.frequency(l2, "digg"));
		
		// Use disjoint method to know is there a common or not
		boolean trueOrFalse = Collections.disjoint(l1, l2);
		if (trueOrFalse)
			System.out.println("These lists do not have anything in common");
		else
			System.out.println("These lists must have something in common!");
		
		
	}
}
