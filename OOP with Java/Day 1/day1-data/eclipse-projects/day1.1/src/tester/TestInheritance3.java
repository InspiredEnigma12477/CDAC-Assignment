package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class TestInheritance3 {

	public static void main(String[] args) {
		Person p;
		// System.out.println(p);
		// create student instance
		p = new Student("Rama", "Kher", 2020, "Java", 86, 123456);// up casting : javac implicitly adds a type cast
		// why impl : Student IS-A Person !
		// display student's details
		System.out.println(p.fetchDetails());// javac : resolves the method binding by : type of ref (i.e Person) , BUT
												// JVMresolves the method binding by type of instance it's referring to
												// !
//create faculty instance
		p = new Faculty("Mihir", "Rao", 10, "Java React DBT");//up casting (Faculty---> Person)
		// display faculty details
		System.out.println(p.fetchDetails());
	}

}
