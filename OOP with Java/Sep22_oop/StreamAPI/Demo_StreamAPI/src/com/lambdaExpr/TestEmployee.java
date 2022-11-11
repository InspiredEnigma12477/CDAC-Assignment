package com.lambdaExpr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.*;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> allEmp = EmpUtil.addEmployee();

		// toString()
		System.out.println(allEmp);

		// for each loop
		System.out.println("--------------------");
		for (Employee e : allEmp) {
			System.out.println(e);
		}

		// show salary>50000

		System.out.println("---------salary>50000-----------");
		for (Employee e : allEmp) {
			if (e.getSalary() > 50000)
				System.out.println(e);
		}

		System.out.println("---------name-----------");
		for (Employee e : allEmp) {
			if (e.getName().equals("Dinesh"))
				System.out.println(e);
		}

		// functional programming reduce code

		// java 8 all collections get added with forEach()

//		  for (T t : this)
//		         action.accept(t);

		// Consumer is FuncI/f
		// accept(t)
		System.out.println("--------------------------");
		Consumer<Employee> cons = (i) -> System.out.println(i + " ");

//		for(Employee e:allEmp)
//		{
//			cons.accept(e);
//		}

		allEmp.forEach((i) -> System.out.println(i + " "));

		// remove all emp salary=90000

		// Predicate<Employee> prd=(emp)->emp.getSalary()==90000;

		// allEmp.removeIf(prd);
		// or

		allEmp.removeIf((emp) -> emp.getSalary() == 90000);

		System.out.println("----remove salary=90000");

		allEmp.forEach((i) -> System.out.println(i + " "));
		System.out.println("----sort-by Salary-----------");
		
		//Collections.sort(allEmp);
		
		Comparator<Employee> comSal=(e1,e2)->{
			return ((Double)e1.getSalary()).compareTo(e2.getSalary());
		};
		
		
		
		//allEmp.sort(comSal);
		
		allEmp.sort((e1,e2)->((Double)e1.getSalary()).compareTo(e2.getSalary()));
		
		allEmp.forEach((i) -> System.out.println(i + " "));
		
		
		
		
		//
		
		
		
		
		
		

	}

}
