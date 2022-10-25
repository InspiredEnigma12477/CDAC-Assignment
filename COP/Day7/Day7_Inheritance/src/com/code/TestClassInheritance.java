package com.code;

public class TestClassInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.dispA();//public
		a.hashCode();
		a.dispDefaultA();//inside pkg
		a.dispProtectedA();//protected are accessible out side class but in same package
		B b=new B();
		b.dispB();
		b.hashCode();
		
		b.dispA();
		b.newMethod();
		b.dispProtectedA();
		b.dispProtectedB();
		
		C c=new C();
		c.dispC();
		c.hashCode();
		c.dispA();
		c.dispProtectedA();
	}

}
