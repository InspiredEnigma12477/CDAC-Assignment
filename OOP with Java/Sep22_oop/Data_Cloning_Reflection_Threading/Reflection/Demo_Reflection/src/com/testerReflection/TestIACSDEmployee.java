package com.testerReflection;

import java.lang.reflect.*;

import com.payroll.Employee;

//import com.payroll.Employee;//this is added jar file

public class TestIACSDEmployee {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		// how can i access Employee from other project
		// export it create jar file
		// use it by import:buildPath

		// Reflection:get metadata of type at runtime

		Class classObj = Class.forName("com.payroll.Employee");
		// forName method loads specified class at runtime
		System.out.println("Class get loaded......");

		// display info abt loaded class
		System.out.println("Loaded Class Name:" + classObj.getName());

		System.out.println("Modifiers:" + classObj.getModifiers());

		System.out.println("IsAnnotation:" + classObj.isAnnotation());
		System.out.println("IsInterface:" + classObj.isInterface());
		System.out.println("Enum:" + classObj.isEnum());
		System.out.println("Base Class:" + classObj.getSuperclass());

		// get the content of class
		// field,methods,constr
		System.out.println("\n------Data Members-----\n");
		Field[] allDataMembers = classObj.getDeclaredFields();
		for (Field f : allDataMembers) {
			System.out.println(f);
		}

		System.out.println("\n------Methods-----\n");

		Method[] allMethods = classObj.getDeclaredMethods();
		for (Method m : allMethods) {
			System.out.println(m);
		}
		System.out.println("\n------Constructor-----\n");
		
	Constructor[] allConstr=	classObj.getConstructors();
		for(Constructor ctr:allConstr)
		{
			System.out.println(ctr);
		}
		
		//create instance of loaded class dynamically
		//invoke method from class
		//accept methodName from user
		String methodName="showSalary";
		
		Method m=classObj.getDeclaredMethod(methodName, null);
		
		//emp2.showSalary();
		
		
		//create instance
		
		
		Class<Employee> clsObj=Employee.class;
		Constructor<Employee> constr=clsObj.getConstructor(int.class,String.class,String.class,double.class);
		
		Employee objInstance=constr.newInstance(909,"NewEmp","Add",80000);
		System.out.println(objInstance);
		
		m.invoke(objInstance, null);//emp.showSalary();
		
		
		
		
	}

}
