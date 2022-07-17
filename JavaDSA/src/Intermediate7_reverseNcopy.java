import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Intermediate7_reverseNcopy {
	public static void main(String[] args) {
		// create an array and convert it to list
		Character[] ray = {'p', 'w', 'n'};
		List<Character> l = Arrays.asList(ray);
		
		System.out.print("List is : ");
		System.out.printf("%s\n\n", l);
		
		// reverse and print out the list
		Collections.reverse(l);
		System.out.print("After reverse : ");
		System.out.printf("%s", l);
	
		// create new array and a new list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		// copy contents of list into listcopy
		Collections.copy(listCopy, l);
		System.out.printf("\n\nCopied one: %s", listCopy);
	}
}
