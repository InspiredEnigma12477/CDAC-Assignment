package sll;
public class SLL {

	private Node head;

	public SLL() {
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void display() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.getData() + " ");
			currNode = currNode.getNext();
		}
		System.out.println();
		// check what will happen if condition of while is changed
		// while(temp.getNext() != null) {
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
			head = newNode;
		}
		// Home work --> can you shorten this code?
	}

	public boolean insertAtEnd(int data) {
		// create and initialize the node
		Node newNode = new Node(data);
		// what is value of next for created new node?

		/* The list is empty, so the newNode becomes the first node */
		if (head == null) {
			head = newNode;
			return true;
		}

		/*
		 * the list is not empty so locate last node and link newnode to last node
		 */
		/*
		 * Never use head ref to iterate through the list, that way you would loose the
		 * linked list. If 'head' value is changed then linked list first node is lost
		 */

		// Take new reference and start traversing the list
		Node last = head;

		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		// what happens if while condition is (last != NULL)
		// what happens if 'last' is not end of the list?
		// what happens if last is null ?

		return true;
	}

	public Node removeFromBeginning() {
		// check if list is empty
		if (head == null) {
			return null;
		} else {
			Node firstNode = head;
			head = head.getNext();
			return firstNode;
		}
	}

	public Node removeFromEnd() {
		// check if list is empty
		if (head == null) {
			return null;
		} else {
			// check if ONLY one node is present
			if (head.getNext() == null) {
				Node lastNode = head;
				head = null;
				return lastNode;
			} else {
				// More than one node is present in the list

				// take two references
				// One for last node
				// one for previous to last node
				Node lastNode = head;
				Node prevNode = head;
				while (lastNode.getNext() != null) {
					prevNode = lastNode;
					lastNode = lastNode.getNext();
				}
				// set previous nodes next value to null
				prevNode.setNext(null);
				return lastNode;
				// what happens if only one node in list
				// and i use two references ??
			}
		}
	}

	// Extra
//	public boolean insertByPosition(int data, int position) {
//        if(position <= 0) {
//            return false;
//        }
//
//        Node newNode = new Node(data);
//        if(newNode == null) {
//            return false;
//        }
//
//        if(position == 1) {
//            newNode.setNext(head);
//            head = newNode;
//            return true;
//        }
//
//        //position is not 1, locate the node at pos - 1
//        Node prev = head;
//        for(int i = 1; i < position - 1; i++) {
//            prev = prev.getNext();
//            if(prev == null) {
//                return false; //position is invalid
//            }
//
//        }
//
//        newNode.setNext(prev.getNext());
//        prev.setNext(newNode);
//
//        return true;
//
//    }
//
//	
//	public boolean deleteByPosition(int position) {
//
//        if(head == null || position <= 0) {
//            return false;
//        }
//
//        if(position == 1) {
//            head = head.getNext();
//            return true;
//        }
//
//        //Locate the prev node i.e. the node prior to position to be deleted
//        Node prev = head;
//        for(int i = 1; i < position - 1; i++) {
//            prev = prev.getNext();
//            //invalid position (Not existing position)
//            if (prev == null) {
//                return false;
//            }
//        }
//
//        if(prev.getNext() == null) {
//            return false;
//        }
//
//        Node del = prev.getNext();
//        prev.setNext(del.getNext());
//
//        return true;
//    }
//
//    public boolean deleteByVal(int data) {
//        if(head == null) {
//            return false;
//        }
//
//        if(head.getData() == data) {
//            head = head.getNext();
//            return true;
//        }
//
//        Node prev = head, del = head;
//        while(del.getData() != data) {
//            prev = del;
//            del = del.getNext();
//
//            if(del == null) {
//                return false;
//            }
//        }
//
//        prev.setNext(del.getNext());
//
//        return true;
//    }
//
//    public void displayRev1() {
//        int top = -1;
//        int [] stack = new int[20];
//        Node temp = head;
//
//        while(temp != null) {
//            stack[++top] = temp.getData();
//            temp = temp.getNext();
//        }
//
//        while(top >= 0) {
//            System.out.print(stack[top--] + " ");
//        }
//        System.out.println();
//    }

	

}
