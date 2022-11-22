
public class DLL {
	public Node head;
	public DLL() {
		head = null;
	}
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			// DLL is existing
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
		}
	}


	public void insertByposition(int data, int position) {
		// position in DLL starts from 1
		// case 1
		// position is <=0 --> Error
		// case 2
		// position == 1 
		if(position == 1) {
			// insert the node
			insertAtBeginning(data);
		}

		else {
			// DLL is existing
			// position > 1
			Node newNode = new Node(data);
			int count =1;
			Node currNode = head;
			while(currNode.getNext() != null) {
				if(count == position) {
//					// insert
//					// step 1
//					newNode.setPrev(currNode.getPrev());
//					// step 2
//					newNode.setNext(currNode);
//					// step 3
//					currNode.setPrev(newNode);
//					// step 4
//					Node prev = newNode.getPrev();
//					prev.setNext(newNode);
//					System.out.println(" Position inserted "+position);
					break;
				}
				else {
					currNode = currNode.getNext();
					count = count +1;
				}
			}
			
			if(count == position) {
				// insert
				// step 1
				newNode.setPrev(currNode.getPrev());
				// step 2
				newNode.setNext(currNode);
				// step 3
				currNode.setPrev(newNode);
				// step 4
				Node prev = newNode.getPrev();
				prev.setNext(newNode);
				System.out.println(" Position inserted "+position);
			}
			else {
				// error
				System.out.println(" Position not found");
				// OR throw exception
			}
		}
	}
	
	public void display() {
		if(head == null) {
			System.out.println("Empty");
		}
		else {
		Node currNode = head;
		while(currNode.getNext() != null) {
			System.out.println(" Node is " +currNode.getData());
			currNode = currNode.getNext();
		}
		System.out.println(" Node is " +currNode.getData());
		}
		
	}
	// home work





}
