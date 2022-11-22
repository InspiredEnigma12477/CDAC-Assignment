
public class CLL {
	// operations in CLL
	// insert in beginning
	// insert in end
	// remove from beginning , from end
	// display
	// search

	private Node head;

	public CLL() {
		head = null;
	}

	public void insertAtbeginning(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			// CLL is Empty
			head = newNode;
			newNode.setNext(newNode);
		}
		else {
			// assume CLL is existing
			// step 1
			Node lastNode = head;
			while(lastNode.getNext() != head) {
				lastNode = lastNode.getNext();
			}
			// lastNode --> last node of the CLL
			// step 2
			lastNode.setNext(newNode);
			// step 3
			newNode.setNext(head);
			// step 4 
			head = newNode;
		}
	}
	// insertAtEnd --> home work
	public Node removeFromEnd() {
		if (head == null) {
			// CLL is empty
			return null;
			// OR throw exception
		}
		else {
			// CLL with single node
			if( head.getNext() == head) {
				Node lastNode = head;
				head = null;
				// optional step
				lastNode.setNext(null);

				return lastNode;
			}
			else {
				// CLL is existing with more than 1 nodes
				// step 1
				Node lastNode = head;
				Node prevNode = head;
				while(lastNode.getNext() != head) {
					prevNode = lastNode;
					lastNode = lastNode.getNext();
				}
				// step 2
				prevNode.setNext(head);
				// step 3 --> optional step
				lastNode.setNext(null);
				// step 4
				return lastNode;
			}
		}

	}
	// removeFromBeginning Home work

	public void display() {
		// home work
	}
	public boolean searchByData(int data) {
		if(head == null) {
			// CLL is empty
			System.out.println("CLL is Empty");
			return false;
			// OR throw exception
		}
		else {
			// case 2 
			// CLL is existing
			Node currNode = head;
			while(currNode.getNext() != head) {
				if(currNode.getData() == data) {
					System.out.println("Data found");
					return true;
				}
				else {
					currNode = currNode.getNext();
				}
			}
			if(currNode.getData() == data) {
				System.out.println("Data found");
				return true;
			}
			else {
				System.out.println("Data Not found");
				return false;
			}
		}
	}
	public Node searchByIndex(int index) {
		if(head == null) {
			// CLL is empty
			System.out.println("CLL is Empty");
			return null;
			// OR throw exception
		}
		else {
			// case 2
			Node currNode = head;
			int count = 0;
			
			while(currNode.getNext() != head) {
				if(count == index) {
					System.out.println("Index found");
					return currNode;
				}
				else {
					count = count+1;
					currNode = currNode.getNext();
				}
			}
			// currNode is last node
			// count will be size of CLL -1
			if(count == index) {
				System.out.println("Index found");
				return currNode;
			}
			else{
				System.out.println("Index Not found");
				return null;
				// OR throw Exception
			}
		}
	}











}
