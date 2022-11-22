package dll;

public class Main {
	public static void main(String[] args) {
		DLL l1 = new DLL();

		l1.display();

		l1.insertAtBeginning(10);
		l1.display();

		l1.insertAtBeginning(20);
		l1.display();

		l1.insertAtBeginning(30);
		l1.display();

		l1.insertAtBeginning(40);
		l1.display();

				
		Node rNode= l1.removeFromEnd();
		System.out.println("Removed Node is "+ rNode.getData());
		l1.display();
		
		rNode= l1.removeFromEnd();
		System.out.println("Removed Node is "+ rNode.getData());
		l1.display();
		
		// home work 
		// DLL as stack
		// DLL as queue
		
	}
}
