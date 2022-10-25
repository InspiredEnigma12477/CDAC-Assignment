package mathoperations;

public class TestMyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//client code
		
		//create object
		MyMath m=new MyMath();
		
		m.defaultFunction();//default accessible outside class but inside package only
		
		//m.privateFunction();//Private:not accessible out  side  class...accessible only inside class
		
		m.protectedFunction();//proteced:accessible outside class 
		
		m.publicFunction();//public :Accessible out side class as well as out side package
		
		
	}

}
