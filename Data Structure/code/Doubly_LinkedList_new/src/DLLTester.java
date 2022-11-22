
public class DLLTester {
	public static void main(String []args) {
		DLL myDLL = new DLL();
		myDLL.insertAtBeginning(10); // 10 -> null
		myDLL.insertAtBeginning(20); // 20 -> 10 -> null
		myDLL.insertByposition(200, 2); // 20 -> 200 -> 10 ->null
		myDLL.insertByposition(300, 2);// 20 -> 300->200 -> 10 ->null
		myDLL.insertByposition(400, 1);// 400->20 -> 300->200 -> 10 ->null
		myDLL.display();
	}
}
