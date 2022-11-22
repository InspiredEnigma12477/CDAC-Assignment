
public class SLLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL mySLL = new SLL();
		mySLL.insertAtBeginning(100); // 100 -> null
		mySLL.insertAtBeginning(200); // 200 -> 100 -> null
		//mySLL.display();
		mySLL.insertAtEnd(500);// 200 -> 100 -> 500 ->null
		//mySLL.display();
		Node rNode = mySLL.removeFromEnd();
		System.out.println("Removed node is " + rNode.getData());
//		mySLL.display();// 200 -> 100 -> null
		rNode = mySLL.removeFromEnd();
		System.out.println("Removed node is " + rNode.getData());
//		mySLL.display();// 200 -> null
		rNode = mySLL.removeFromEnd();
		System.out.println("Removed node is " + rNode.getData());
		//mySLL.display();//  null
		
		mySLL.insertAtEnd(234);// 234 -> null
		//mySLL.display(); // 234 -> null
		mySLL.insertAtEnd(444);// 234 -> 444 ->null
		//mySLL.display();
		
		rNode =mySLL.removeFromBeginning();
		System.out.println("Removed node is " + rNode.getData());
		mySLL.display();
		rNode =mySLL.removeFromBeginning();
		System.out.println("Removed node is " + rNode.getData());
		mySLL.display(); // null
	}

}
