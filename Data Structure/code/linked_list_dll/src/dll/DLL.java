package dll;

public class DLL {
	private Node head;

	public DLL() {
		head = null;
	}

	public void display() {
		Node currNode = head;
		while(currNode !=null) {
			System.out.print(currNode.getData() + " ");
			currNode = currNode.getNext();
		}
		System.out.println();
	}
	public void displayReverse() {
		// if DLL is empty do nothing
		if(head == null) {
			return;
		}
		else {
			Node currNode = head;
			// Because of previous node reference in DLL reverse printing is easy  
			// Traverse to last node of the DLL
			while(currNode.getNext() !=null) {
				currNode = currNode.getNext();
			}
			// from last node go till first node of DLL
			while(currNode.getPrev() !=null) {
				System.out.print(currNode.getData() + " ");
				currNode = currNode.getPrev();
			}
			System.out.println();
		}
	}
	public void insertAtBeginning(int data) {
		// create and initialize the node
		Node newNode = new Node(data);
		// what is value of next for created new node?
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.setNext(head);
			head.setPrev(newNode);
			head = newNode;
			// Home work --> can you write this code differently ?
		}
	}

	public void insertAtEnd(int data) {
		// create and initialize the node
		Node newNode = new Node(data);

		// Home work
	}

	public Node removeFromEnd() {
		if(head == null) {
			return null;
		}
		else {
			Node lastNode = head;
			while(lastNode.getNext() != null) {
				lastNode = lastNode.getNext();
			}
			Node prevNode = lastNode.getPrev();
			lastNode.setPrev(null);
			prevNode.setNext(null);
			return lastNode;
		}
	}
	public Node removeFromBeginning() {
		// home work
		return null;
	}
}
