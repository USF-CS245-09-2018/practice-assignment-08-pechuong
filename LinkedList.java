public class LinkedList implements List {
	
	public class Node {
		public Object data;
		public Object left;
		public Object right;
		
		public Node(Object dataValue) {
			this.data = dataValue;
			this.left = null;
			this.right = null;
		}
	}

	public Object head;
	public int size;

	public LinkedList() {
		this.head = new Node(null);
		this.size = 0;
	}
	
	public void add(Object obj) throws Exception {
	
	}

	public void add(int pos, Object obj) throws Exception { 
	
	}

	public Object get(int pos) throws Exception {
		return null;	
	}
	
	public Object remove(int pos) throws Exception {
		return null;	
	
	}

	public int size() {
		return this.size;	
	}

}
