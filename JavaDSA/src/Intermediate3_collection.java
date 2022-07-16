import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Intermediate3_collection {
	public static void editList(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			if(l2.contains(it.next())) {	// it.next() directs the first element once it called at the first time.
				it.remove();
			}
		}
	}

	public static void main(String[] args) {
		String[] things = { "eggs", "lasers", "hats", "pie" };
		// Collection: We should define datatype
		List<String> list1 = new ArrayList<String>();

		// add array items to list
		for (String thing : things) {
			list1.add(thing);
		}

		String[] moreThings = { "lasers", "hats" };

		List<String> list2 = new ArrayList<String>();

		// add array items to list
		for (String thing : moreThings) {
			list2.add(thing);
		}

		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}

		editList(list1, list2);
		System.out.println();
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		

	}
}
