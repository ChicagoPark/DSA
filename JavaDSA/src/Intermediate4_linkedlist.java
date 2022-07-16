import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Intermediate4_linkedlist {
	private static void printMe(Collection<String> l) {
		for (String b : l)
			System.out.printf("%s ", b);
		System.out.println();
	}

	private static void removeStuff(List<String> l, int start, int end) {
		l.subList(start, end).clear();
	}

	private static void reverseMe(List<String> l) {
		ListIterator<String> it = l.listIterator(l.size());
		while (it.hasPrevious()) {
			System.out.printf("%s ", it.previous());
		}
	}

	public static void main(String[] args) {
		String[] things = { "apples", "noobs", "pwnge", "bacon", "goATS" };
		List<String> list1 = new java.util.LinkedList<String>();
		for (String x : things)
			list1.add(x);

		String[] things2 = { "sausage", "bacon", "goats", "harrypotter" };
		List<String> list2 = new java.util.LinkedList<String>();
		for (String y : things2)
			list2.add(y);

		list1.addAll(list2);
		list2 = null;

		printMe(list1);
		removeStuff(list1, 2, 5); // remove the value from the index 2 to 5.
		printMe(list1);
		reverseMe(list1);
	}
}
