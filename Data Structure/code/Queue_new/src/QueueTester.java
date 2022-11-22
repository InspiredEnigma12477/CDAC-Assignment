
public class QueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// verify if 0 size queue is allowed or not
		Queue qtest = new Queue(0);
		// why 0 size array is allowed ???
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(50);
		q.enqueue(30);
		q.enqueue(40);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(10);
		q.enqueue(50);
		q.enqueue(30);
		q.enqueue(40);
		
		System.out.println("completed!!");	
	}

}
