
public class Queue {
	private int [] arr;
	private int front=-1,rear=-1;
	
	public Queue() {
		arr = new int[5];
		front =-1;
		rear=-1;
	}
	public Queue(int size) {
		arr = new int[size];
		front =-1;
		rear=-1;
	}
	public void enqueue(int data) {
		if(isFull() == false) {
			rear = rear+1;
			arr[rear] = data;
			// check front == -1
			if(front == -1) {
				front =0;
			}
			System.out.println("Enqueue"+data+" front "+front+" rear"+ rear);
		}
		else {
			//sysout q is full
			System.out.println("Queue is Full!!");
			// OR throw exception
		}
	}
	public int dequeue() {
		if( isEmpty() == false) {
			int temp = arr[front];
			front = front +1;
			System.out.println("Dequeue"+temp+" front "+front+" rear"+ rear);
			return temp;
		}
		else {
			// q is empty
			System.out.println("q is empty");
			return -999;
			// OR throw an exception
		}
	}
	
	public boolean isFull() {
		if( rear == (arr.length -1)) {
			// q is full
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty() {
		if((front == -1) || (front > rear)) {
			return true;
		}
		else
			return false;
	}
}
