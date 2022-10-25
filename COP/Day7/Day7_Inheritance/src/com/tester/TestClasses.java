package com.tester;

import com.code.A;
import com.code.B;
import com.code.C;

public class TestClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A();
		a.dispA();//public
		a.hashCode();
		
		B b=new B();
		b.dispB();
		b.hashCode();
		
		b.dispA();
		b.newMethod();
		
		C c=new C();
		c.dispC();
		c.hashCode();
		c.dispA();
		
		
		
		
		
		
		
		
	}

}
