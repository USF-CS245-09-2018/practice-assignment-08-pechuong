public class LinkedList implements List {
	
	public class Node {
		public Object data;
		public Node next;
		public Node prev;
		
		public Node(Object dataValue) {
			this.data = dataValue;
			this.next = null;
			this.prev = null;
		}
	}

	public Node head;
	public int size;

	public LinkedList() {
		this.head = new Node(null);
		this.size = 0;
	}
	
	public void add(Object obj) throws Exception {
		Node newNode = new Node(obj);
		newNode.next = this.head;
		this.head = newNode;	
		this.size++;
	}

	public void add(int pos, Object obj) throws Exception { 
		int listPosition = 0;
		Node currNode = this.head;
		while (currNode.data != null && listPosition < pos) {
			currNode = currNode.next;
			listPosition++;
		}
		currNode.prev.next = new Node(obj);
		currNode.prev.next.prev = currNode.prev;
		currNode.prev.next.next = currNode;
		currNode.prev = currNode.prev.next;
		this.size++;
	}

	public Object get(int pos) throws Exception {
		if (pos < 0 || this.size == 0 || pos > this.size) {
			throw new Exception("Error getting pos: " + pos);
		}
		int listPosition = 0;
		Node currNode = this.head;
		while (currNode.data != null && listPosition < pos) {
			currNode = currNode.next;
			listPosition++;
		}
		return currNode;
	}
	
	public Object remove(int pos) throws Exception {
		if (pos < 0 || this.size == 0 || pos > this.size) {
			throw new Exception("Error removing with pos: " + pos);
		}
		int listPosition = 0;
		Node currNode = this.head;
		while (listPosition < pos) {
			currNode = currNode.next;	
			listPosition++;
		}
		currNode.prev.next = currNode.next;
		currNode.next.prev = currNode.prev;
		this.size--;
		return currNode;

	}

	public int size() {
		return this.size;
	}

}
