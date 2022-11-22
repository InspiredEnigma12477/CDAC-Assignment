
public class CircularQueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue cq = new CircularQueue(5);
		cq.enqueue(345);
		cq.enqueue(45);
		cq.enqueue(3345);
		cq.enqueue(3457);
		
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		
		cq.enqueue(50);
		cq.enqueue(4590);
		cq.enqueue(35);
		cq.enqueue(37);
		
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		System.out.println("dequeue ="+ cq.dequeue());
		
		
		
		
	}

}
