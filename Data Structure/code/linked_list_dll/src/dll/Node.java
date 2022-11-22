package dll;
public class Node {

	private int data;
	private Node prev;
	private Node next;
	
	public Node() {
		data = 0;
		prev=null;
		next = null;
	}

	public Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}


	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
