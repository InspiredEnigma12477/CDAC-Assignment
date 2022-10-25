package com.tester;

import com.code.ChildClass;
import com.code.ParentClass;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c=new ChildClass();
		c.childMethod();//child class method
		c.parentMethod();
		c.calIncometax();
		c.hashCode();
		
		ParentClass p=new ParentClass();
		p.parentMethod();
		p.hashCode();
	

	}

}
