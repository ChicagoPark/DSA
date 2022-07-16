import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Intermediate6_collectionSort {
	public static void main(String[] args) {
		String[] crap = {"apples", "lemons", "geese", "bacon", "youtube"};
		
		List <String> l1 = Arrays.asList(crap);
		
		// ascending order
		Collections.sort(l1);
		
		System.out.printf("%s\n", l1);
		
		// descending order
		Collections.sort(l1, Collections.reverseOrder());
		
		System.out.printf("%s ", l1);
	}
}
