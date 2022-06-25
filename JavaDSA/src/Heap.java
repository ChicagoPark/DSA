import java.util.Arrays;

public class Heap {
	private int data[];
	private int maxSize;
	private int cSize;

	public Heap(int size) {
		this.maxSize = size;
		this.data = new int[this.maxSize];
		this.cSize = 0;
		for (int i = 0; i < this.data.length; i++) {
			this.data[i] = -1;
		}
	}

	public int length() {
		return this.cSize;
	}

	public boolean isEmpty() {
		return this.cSize == 0;
	}

	public void insert(int newNode) {		
		// check the size of the heap
		if (this.cSize >= this.maxSize-1) {
			System.out.println("Heap is already filled");
			return;
		}
		// reflect the size
		this.cSize +=1 ;
		// put the value at the last
		this.data[this.cSize] = newNode;	
		// get index
		int i = this.cSize;
		// compare and going up
		while (i > 1 && this.data[i] > this.data[i/2]) {
			int temp = this.data[i];
			this.data[i] = this.data[i/2];
			this.data[i/2] = temp;
			i/=2;
		}
		// *No return*
	}

	public int max() {
		if (this.isEmpty()) {
			System.out.println("Heap is Empty");
			return -1;
		}
		return this.data[1];
	}

	public void display() {
		for (int i = 0; i < this.data.length; i++) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
	}

	public int deleteMax() {
		// replace the root node with the last node
		int returnValue = this.data[1];
		this.data[1] = this.data[this.cSize];
		this.data[this.cSize] = -1;
		this.cSize -= 1;
		
		// down heap
		int i = 1;
		int j = i*2;
		
		// down heap
		while(j < this.cSize) {
			// select the boss child
			if (this.data[j] < this.data[j+1]) {
				j += 1;
			}
			if (this.data[i] < this.data[j]) {
				int temp = this.data[i];
				this.data[i] = this.data[j];
				this.data[j] = temp;
				i *= 2;
				j = i*2;
			}			
		}
		return returnValue;
	}

	public void heapsort(int a[]) {
		// Create additional heap
		Heap newHeap = new Heap(a.length+1);
		
		for (int i = 0; i < a.length; i++) {
			newHeap.insert(a[i]);
		}
		
		// Loop to delete the max node from the additional heap and put it into "a"
		int k = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			int temp = newHeap.deleteMax();
			a[k] = temp;
			k -= 1;
		}
		
	}

	public static void main(String[] args) {
		Heap h = new Heap(10);
		h.insert(40);
		h.insert(20);
		h.insert(25);
		h.insert(14);
		h.insert(10);
		h.insert(55);
		h.insert(4);
		h.insert(60);
		h.insert(22);
		h.display();

		h.deleteMax();
		h.display();
		
		int a[] = {3,12,215,312,31,12,2,1241,4531};
		
		h.heapsort(a);
		System.out.println(Arrays.toString(a));
	}
}
