
public class Stack {
	private int []arr;
	private int top, size;
	public Stack() {
		// default constructor
		//		Create Stack of size 10
		size=10;
		arr = new int[size];
		//		Set top to -1 --> means stack is empty
		top = -1;
	}
	public Stack(int s) {
		//		Parameterized constructor
		//		Create stack of given size
		size = s;
		arr = new int[size];
		//		Set top to -1 --> means stack is empty
		top = -1;
	}
	public boolean isEmpty() {
		if(top == -1) 
			return true;
		else
			return false;
	}
	public boolean isFull() {
		//		when value of top is size-1 means 
		//		'arr' in stack is full
		if(top == (size -1))
			return true;
		else
			return false;
	}
	public boolean push(int element) {
//		Element can be pushed if stack is not full
		if(isFull() == false) {
			top = top+1;
			arr[top] = element;
			return true;
		}
//		when stack is full return false
		else {
			return false;
		}
	}
	public int pop() {
		if(isEmpty() == false) {
			int temp = arr[top];
			top = top -1;
			return temp;
		}
		else {
			//WARNING!! --> 
			//Assumption --> -999 is NOT stored on stack 
			return -999;  
		}
	}

	public int pop_v2() throws Exception {
		if(isEmpty() == false) {
			int temp = arr[top];
			top = top -1;
			return temp;
		}
		else {
			throw new Exception("Stack is Empty!");
		}
	}
	public boolean push_v2(int element) throws Exception {
//		Element can be pushed if stack is not full
		if(isFull() == false) {
			top = top+1;
			arr[top] = element;
			return true;
		}
//		when stack is full throw exception
		else {
			throw new Exception("Stack is Full!");
		}
	}
}
