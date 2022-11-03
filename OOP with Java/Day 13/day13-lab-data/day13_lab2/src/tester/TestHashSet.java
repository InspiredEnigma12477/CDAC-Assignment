package tester;

import java.util.HashSet;

import com.app.core.Emp;

public class TestHashSet {

	public static void main(String[] args) {
		/*
		 * Aa BB
Ba CB 
Ca DB
Da EB
BBBB AaBB AaAa BBAa
FB Ea
		 */
//		System.out.println("Aa".equals("BB"));
//		System.out.println("Aa".hashCode()+" "+"BB".hashCode());
		Emp e1=new Emp("Aa","Raj",12345);
		Emp e2=new Emp("BB","Rama",22345);
		HashSet<Emp> emps=new HashSet<>();
		System.out.println(emps.add(e1));//t , hC : 1 , eq : 0
		System.out.println(emps.add(e2));//t , hC : 1 , eq : 1
		System.out.println(emps.size());
		//BBBB AaBB AaAa BBAa
		

	}

}
