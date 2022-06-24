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

	public void deleteMax() {
		// necessary variable
		// (1) Avoid the size of heap is zero
		if (this.isEmpty()) {
			System.out.println("Heap is Empty");
			return;
		}
		// (2) Get rid of rootnode and put the last node to the root
		this.data[1] = this.data[this.cSize];
		this.data[this.cSize] = -1;
		cSize = cSize - 1;

		int tempIndex = 1;
		while (tempIndex * 2 < this.cSize) {
			// (3) Select the boss among children
			int bossIndex = tempIndex*2;
			if (this.data[tempIndex * 2] < this.data[tempIndex * 2 + 1]) {
				bossIndex += 1;
			}
			if (this.data[tempIndex] < this.data[bossIndex]) {
				int temp = this.data[tempIndex];
				this.data[tempIndex] = this.data[bossIndex];
				this.data[bossIndex] = temp;
				tempIndex = bossIndex;
			}
			else {
				break;
			}
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
	}
}
