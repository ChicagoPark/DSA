public class LinkedList {
	public class Node {
		private int value;
		private Node next;

		public Node(int v, Node n) {
			this.value = v;
			this.next = n;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public int length() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void addLast(int value) {
		Node newNode = new Node(value, null);
		if (this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
		this.size += 1;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value, null);
		if (this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.next = this.head;
			this.head = newNode;
		}
		this.size += 1;
	}

	public void insert(int value, int location) {
		// Todo
		Node newNode = new Node(value, null);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else if (location == 0) {
			newNode.next = this.head;
			this.head = newNode;
		} else if (location == -1) {
			this.tail.next = newNode;
			this.tail = newNode;
		} else {
			int index = 0;
			Node temp = this.head;
			while (index < location - 1) {
				index += 1;
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		this.size += 1;

	}

	public int deleteNode(int location) {
		if(this.isEmpty()) {
			return -1;
		}
		int deletedValue;
		if(location == 0) {
			deletedValue = this.head.value;
			this.head = this.head.next;
		}
		else if (location == -1) {
			Node temp = this.head;
			deletedValue = this.tail.value;
			while(temp.next != this.tail) {
				temp = temp.next;
			}
			temp.next = null;
			this.tail = temp;
		}
		else {
			int index = 0;
			Node temp = this.head;
			while(index < location -1) {
				index += 1;
				temp = temp.next;
			}
			deletedValue = temp.next.value;
			temp.next = temp.next.next;
		}
		this.size -= 1;
		return deletedValue;
	}

	public void display() {
		Node temp = this.head;
		if (temp != null) {
			while (temp != null && temp.next != null) {
				System.out.print(temp.value + "-->");
				temp = temp.next;
			}
			System.out.println(temp.value);
		}
		System.out.println("==== size:" + this.size + " ====");
	}

	public int search(int value) {
		Node temp = this.head;
		int index = 0;
		while (index < this.size) {
			if (temp.value == value) {
				return index;
			}
			index += 1;
			temp = temp.next;
		}
		return -1;
	}

	public void insertSorted(int value) {
		Node newNode = new Node(value, null);
		if (this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node temp = this.head;
			while (temp != null && value > temp.value) {
				temp = temp.next;
			}
			if (temp == this.head) {
				newNode.next = this.head;
				this.head = newNode;
			} else if (temp != null) {
				newNode.next = temp.next;
				temp.next = newNode;

			} else {
				this.tail.next = newNode;
			}
		}
		this.size += 1;
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insert(7, 0);
		l.insert(2, 0);
		l.insert(3, -1);
		l.insert(6, 1);
		l.display();
		l.deleteNode(-1);
		l.display();

		l.insertSorted(0);
		l.insertSorted(15);
		l.display();

		System.out.println(l.search(6));
	}

}
