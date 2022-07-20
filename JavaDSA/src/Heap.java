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
		if (this.cSize >= this.maxSize) {
			System.out.println("It is already empty");
			return;
		}
		this.cSize += 1;
		this.data[this.cSize] = newNode;
		int i = this.cSize;
		while (i > 1 && this.data[i] > this.data[i / 2]) {
			int temp = this.data[i];
			this.data[i] = this.data[i / 2];
			this.data[i / 2] = temp;

			i = i / 2;
		}
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
		// check the size
		if (this.cSize == 0) {
			return -1;
		}
		int deletedNode = this.data[1];
		// delete the root
		this.data[1] = this.data[this.cSize];
		// reflect the size
		this.data[this.cSize] = -1;
		this.cSize -= 1;

		int i = 1;
		while (2 * i <= this.cSize) {
			// process the boss node first
			int j = i * 2;
			if (this.data[j] < this.data[j + 1])
				j += 1;
			// switch
			if (this.data[i] < this.data[j]) {
				int temp = this.data[i];
				this.data[i] = this.data[j];
				this.data[j] = temp;
			}
			else {
				break;
			}

			i = j;
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
