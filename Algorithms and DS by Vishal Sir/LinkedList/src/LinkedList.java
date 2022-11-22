import java.util.Stack;

public class LinkedList {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(head == null) {
            head = newNode;
            return true;
        }

        //locate last node
        Node last = head;
        while(last.getNext() != null) {
            last = last.getNext();
        }

        //make newnode next of last node
        last.setNext(newNode);
        return true;
    }

    public void display() {
        Node last = head;

        while(last != null) {
            System.out.print(last.getData() + " ");
            last = last.getNext();
        }
        System.out.println();
    }

    public boolean insert(int data, int position) {
        if(position <= 0 || (head == null && position > 1)) {
            return false;
        }

        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(position == 1) {
            newNode.setNext(head);
            head  = newNode;
            return true;
        }

        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false;
            }
        }

        newNode.setNext(prev.getNext());
        prev.setNext(newNode);

        return true;
    }

    public boolean deleteByPosition(int position) {
        if(position <= 0 || head == null) {
            return false;
        }

        if(position == 1) {
            head = head.getNext();
            return true;
        }

        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev.getNext()    == null) {
                return false;
            }
        }

        Node del = prev.getNext();
        prev.setNext(del.getNext());

        return true;
    }

    public boolean deleteByValue(int data) {

        if(head == null) {
            return false;
        }

        if(head.getData() == data) {
            head = head.getNext();
            return true;
        }

        Node prev = head, del = head;

        while(del.getData() != data) {
            prev = del;
            del = del.getNext();
            if(del == null) {
                return false;
            }
        }

        prev.setNext(del.getNext());

        return true;
    }

    public void displayRev() {
        Stack<Node> stack = new Stack<>();
        Node temp = head;

        while(temp != null) {
            stack.push(temp);
            temp = temp.getNext();
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().getData() + " ");
        }
        System.out.println();
    }

    public void displayRev(Node head) {
        if(head == null) {
            System.out.println();
            return;
        }
        displayRev(head.getNext());
        System.out.print(head.getData() + " ");
    }

    public Node getHead() {
        return head;
    }

    public void reverse() {
        if(head == null || head.getNext() == null) {
            return;
        }

        Node n1 = head, n2 = head.getNext();
        Node n3;
        while(n2 != null) {
            n3 = n2.getNext();
            n2.setNext(n1);
            n1 = n2;
            n2 = n3;
        }

        head.setNext(null);
        head = n1;
    }
}









