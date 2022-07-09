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
		// check the size
		if(this.cSize >= this.maxSize) {
			System.out.println("Max size");
			return;
		}
		// put the value and update the size
		this.cSize += 1;
		this.data[this.cSize] = newNode;
		
		// going up process
		int i = this.cSize;
		while(i > 1 && newNode > this.data[(int)(i/2)]) {
			this.data[i] = this.data[(int)(i/2)];
			i /= 2;
		}
		this.data[i] = newNode;
		
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
		// create new heap
		Heap newHeap = new Heap(a.length + 1);
		// insert all value into heapsort
		for (int i = 0; i < a.length; i++) {
			newHeap.insert(a[i]);
		}
		int k = a.length - 1;
		// do deletemax operation
		for (int i = 0; i < a.length; i++) {
			a[k] = newHeap.deleteMax();
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

		int a[] = { 3, 12, 215, 312, 31, 12, 2, 1241, 4531 };

		h.heapsort(a);
		System.out.println(Arrays.toString(a));
	}
}
