
public class CircularQueue {
	public int [] arr;
	public int front, rear, count;
	public CircularQueue() {
		arr = new int[5];
		front= rear=-1;
		count =0;
	}
	public CircularQueue(int size) {
		arr = new int[size];
		front= rear=-1;
		count =0;
	}
	public void enqueue(int data) {
		if(isFull() == false) {
		rear = (rear+1) % arr.length;
		arr[rear] = data;
		if(front==-1) {
			front=0;
		}
		count = count +1;
		System.out.println("Enqueue "+data);
		}
		else {
			System.out.println("Q is full");
			// or throw exception
		}
	}
	public int dequeue() {
		if(isEmpty() == false) {
			int temp = arr[front];
			front = (front + 1) % arr.length;
			count = count-1;
			return temp;
		}
		else {
			System.out.println("Q is empty");
			return -999;
			// OR throw exception
		}
	}
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(count == arr.length) {
			return true;
		}
		else {
			return false;
		}
	}
}
