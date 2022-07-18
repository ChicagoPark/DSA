import java.util.PriorityQueue;

public class Intermediate10_queue {
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.printf("%s ", q);
		System.out.println();
		
		System.out.printf("%s ", q.peek());
		System.out.println();
		
		// poll: remove the highest priority
		q.poll();
		System.out.printf("%s ", q);
	}
}
