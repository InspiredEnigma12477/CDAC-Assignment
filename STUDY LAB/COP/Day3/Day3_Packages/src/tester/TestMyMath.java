package tester;

import mathoperations.MyMath;;

public class TestMyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// client
		MyMath m = new MyMath();
		//compile time error for default:not accessible outside pkg
		//m.defaultFunction();// default accessible outside class but inside package only

		// m.privateFunction();//Private:not accessible out side class...accessible only
		// inside class

		//m.protectedFunction();// proteced:accessible outside class but accessible outside package 
		//only  in sub class(derived class)

		m.publicFunction();// public :Accessible out side class as well as out side package

	}

}
