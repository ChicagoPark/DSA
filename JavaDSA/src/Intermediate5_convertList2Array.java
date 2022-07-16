import java.util.Arrays;
import java.util.LinkedList;

// possible to utilize beneficial function which is only available from another type 
public class Intermediate5_convertList2Array {
	public static void main(String[] args) {
		String[] stuff = {"babies", "watermelong", "melons", "fudge"};
		// Convert from array to list 
		LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));
		
		theList.add("pumpikinf");
		theList.addFirst("firstthing");
		
		// Convert from list to array
		stuff = theList.toArray(new String[theList.size()]);

		for(String x: theList) {
			System.out.printf("%s ", x);
		}
		System.out.println();
		for(String x: stuff) {
			System.out.printf("%s ", x);
		}
	}

}
