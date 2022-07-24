import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Intermediate9_stack {
	private static <T> void printStack(Stack<T> s) {
		if(s.isEmpty())
			System.out.println("You have nothing in your stack");
		else
			System.out.printf("%s TOP\n", s);
	}
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String> ();
		stack.push("bottom");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);

	}
}
