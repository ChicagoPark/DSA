import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intermediate11_hashset {
	public static void main(String[] args) {
		String[] things = {"apple", "bob", "ham", "bob", "bacon"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s\n", list);
		
		// HashSet takes the list
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s\n\n", set);
		
		
		int a = 10;
		int b = 3;
		int c = 88;
		int d = 50;
		
		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("a", a);
		happy.put("b", b);
		happy.put("c", c);
		happy.put("d", d);
		
		System.out.println(happy);
		System.out.println(happy.get("c"));
		
		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("jyp", "tallguy");
		fun.put("sm", "smallguy");
		fun.put("yg", "coolfit");
		
		fun.remove("sm");
		fun.replace("yg", "father");
	
		
		System.out.println(fun);
		System.out.println(fun.containsValue("coolfot"));
	}
}
