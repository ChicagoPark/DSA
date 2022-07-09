public class PriorityQueue {
	private int MAX;
	private int[] arr;
	private int nItems;
	
	public PriorityQueue() {
		MAX = 10;
		arr = new int[MAX];
		nItems = 0;
	}
	
	public void insert(int val) {
		int i;
		if(nItems == 0) {
			arr[0] = val;
			nItems += 1;
			return;
		}
		for (i = 0; i < this.nItems; i++) {
			if(val > this.arr[this.nItems - i - 1]) {
				arr[this.nItems - i] = arr[this.nItems - i - 1];
			}
			else {
				break;
			}
		}
		this.arr[nItems -i] = val;
		this.nItems+=1;
	}
	
	public void printPriorityQueue() {
		for(int i = 0 ; i < this.nItems;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public int remove() {
		return arr[--nItems];
	}
	
	public boolean isFull() {
		return nItems == MAX;
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public int getPeek() {
		return arr[nItems - 1];
	}
	public static void main(String[] args) {
		PriorityQueue a = new PriorityQueue();
		a.insert(12);
		a.insert(7);
		a.insert(10);
		a.insert(1);
		a.insert(8);

		a.printPriorityQueue();

		System.out.println();
		System.out.println(a.remove());
		a.printPriorityQueue();

		System.out.println();
		System.out.println(a.remove());
		a.printPriorityQueue();
}
	
}