public class HashChainDemo {
	private int hashTableSize;
	private LinkedList hashTable[];

	public HashChainDemo() {
		this.hashTableSize = 10;
		this.hashTable = new LinkedList[this.hashTableSize];
		for (int i = 0; i < this.hashTableSize; i++)
			this.hashTable[i] = new LinkedList();
	}

	// hash function
	public int hashCode(int key) {
		return key % this.hashTableSize;
	}

	public void insert(int value) {
		int i = this.hashCode(value);
		this.hashTable[i].insertSorted(value);
	}

	public boolean search(int value) {
		int i = this.hashCode(value);
		return hashTable[i].search(value) != -1;
	}

	public void display() {
		for (int i = 0; i < this.hashTableSize; i++) {
			System.out.println("[" + i + "]");
			this.hashTable[i].display();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		HashChainDemo hash = new HashChainDemo();
		hash.insert(10);
		hash.insert(4);
		hash.insert(6);
		hash.insert(8);
		hash.insert(2);
		hash.insert(3);
		hash.insert(1);
		hash.insert(42);
		hash.insert(46);
		hash.insert(89);
		hash.insert(92);
		hash.insert(9);
		
		hash.display();
		
		System.out.println("Element Found: " + hash.search(921));
	}
}

