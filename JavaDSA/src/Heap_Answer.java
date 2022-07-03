import java.util.Arrays;

public class Heap_Answer {
	private int data[];
	private int maxSize;
	private int cSize;

	public Heap_Answer(int size) {
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
		if (this.cSize >= this.maxSize) {
			System.out.println("Out of range");
			return;
		}
		this.cSize += 1;
		int tempIndex = this.cSize;

		while (tempIndex > 1 && newNode > this.data[(int) (tempIndex / 2)]) {
			this.data[tempIndex] = this.data[(int) (tempIndex / 2)];
			tempIndex /= 2;
		}
		this.data[tempIndex] = newNode;
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
		if (this.cSize == 0) {
			System.out.println("Size of heap is empty");
			return -1;
		}
		// replace rootNode with the last node
		int deletedNode = this.data[1];
		this.data[1] = this.data[this.cSize];
		this.data[this.cSize] = -1;
		// change size
		this.cSize -=1;
		// (2) Going down task
		int i = 1;	
		// use j to select boss child
		while (i*2 <= this.cSize) {
			int j = i*2;
			if (this.data[j] < this.data[j+1]) {
				j += 1;
			}
			if (this.data[i] < this.data[j]) {
				int temp = this.data[i];
				this.data[i] = this.data[j];
				this.data[j] = temp;
				i = j;
			}
			else {
				break;
			}
		}
		return deletedNode;

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
		Heap_Answer h = new Heap_Answer(10);
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
