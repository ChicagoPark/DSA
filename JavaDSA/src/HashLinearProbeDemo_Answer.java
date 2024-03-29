import java.util.Arrays;

public class HashLinearProbeDemo_Answer {
	private int hashTableSize;
	private int hashTable[];

	public HashLinearProbeDemo_Answer() {
		this.hashTableSize = 10;
		this.hashTable = new int[this.hashTableSize];
	}

	// HASH FUNCTION
	public int hashCode(int value) {
		return value % this.hashTableSize;
	}

	// COLLISION
	public int lProbe(int value) {
		int code = this.hashCode(value);
		int i = 1;
		while(this.hashTable[(code + i) % this.hashTableSize] != 0) {
			i += 1;
		}
		return (code + i) % this.hashTableSize;


	}
	/*
	// COLLISION
		public int lProbe(int value) {
			int i = 1;
			while (this.hashTable[this.hashCode(value + i)] != 0) {
				i += 1;
			}
			return this.hashCode(value + i);
		}
	*/
	public void insert(int value) {
		int i = hashCode(value);
		if (this.hashTable[i] == 0) {
			hashTable[i] = value;
		} else {
			hashTable[this.lProbe(value)] = value;
		}
	}

	public boolean search(int value) {
		int i = this.hashCode(value);
		int j = 0;
		while (this.hashTable[(i + j) % this.hashTableSize] != value) {
			if (this.hashTable[(i + j) % this.hashTableSize] == 0)
				return false;
			j += 1;
		}
		return true;
	}
	public void display() {
		for(int i = 0 ; i < this.hashTableSize; i++)
			System.out.print(this.hashTable[i] + " ");
		System.out.println();
		}
	
	public static void main(String[] args) {
		HashLinearProbeDemo_Answer hashing = new HashLinearProbeDemo_Answer();
		hashing.insert(54);
		hashing.insert(78);
		hashing.insert(64);
		hashing.insert(92);
		hashing.insert(34);
		hashing.insert(86);
		hashing.insert(28);
		hashing.display();
		System.out.println(hashing.search(54));
	}
}

	