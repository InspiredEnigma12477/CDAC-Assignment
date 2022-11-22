
public class SLL {
	private Node head;
	public SLL() {
		head=null;
	}
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			// SLL is empty
			head = newNode;
		}
		else {
			Node lastNode = head;
			while(lastNode.getNext() != null) {
				lastNode = lastNode.getNext();
			}
			//lastNode contains last node of the SLL
			lastNode.setNext(newNode);
		}
	}
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.setNext(head);
			head = newNode;
		}
	}
	public void display() {
		if(head == null) {
			System.out.println("SLL is empty");

		}
		else {
			Node currNode = head;
			while(currNode.getNext() !=null) {
				System.out.println("Node is " + currNode.getData());
				currNode = currNode.getNext();
			}
			// currNode will be at last node of SLL
			// print the last node details
			System.out.println("Node is " + currNode.getData());
		}
	}
	public Node removeFromEnd() {

		if(head == null) {
			// SLL is empty
			System.out.println("SLL is empty");
			return null;
			// OR throw exception
		}
		if(head.getNext() == null) {
			// SLL has only one node
			Node lastNode = head;
			head = null;
			return lastNode;
		}
		else {
			// SLL is existing with more than one node
			Node lastNode = head;
			Node prevNode = head;
			while(lastNode.getNext() != null) {
				prevNode = lastNode;
				lastNode = lastNode.getNext();
			}
			//lastNode --> is at last node of SLL
			// prevNode is at previous of last node
			prevNode.setNext(null);
			return lastNode;
		}
	}

	public Node removeFromBeginning() {
		if(head == null) {
			// SLL is empty
			System.out.println("SLL is empty");
			return null;
			// OR throw exception
		}
		else { // case 3 will handle case 2 automatically
			Node firstNode = head;
			head = head.getNext();
			return firstNode;
		}
	}


}









