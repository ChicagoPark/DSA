public class Intermediate2_bucky {
	public static void main(String[] args) {
		
		String s = "buckyrobertsbuckyroberts";
		
		System.out.println(s.indexOf("k", 5)); // return the index near at the 0 index for the same char
											   // Second argument means neglecting the first numbers of words
		
		System.out.println("rob is at the " + s.indexOf("rob") + "index");
		
		
		String a = "Bacon ";
		String b = "monster";

		// Concatenate //
		// way 1 of concatenate 
		System.out.println(a + b);
		// way 2 of concatenate 
		System.out.println(a.concat(b));
		
		// Replace //
		System.out.println(a.replace("ac", "AC"));
		
		// Upper or Lower //
		System.out.println(a.toUpperCase());
		System.out.println(a.toUpperCase());
		
		// Trim: remove any space at the side of the String//
		String c = "    HI I am ";
		System.out.println(c.trim());		
	}
}
