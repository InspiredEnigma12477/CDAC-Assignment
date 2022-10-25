package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test1 {

	public static void main(String[] args) {

		Student s1 = new Student("Rama", "Kher", 2020, "Java", 86, 123456);// up casting : javac implicitly adds a type
																			// cast
		System.out.println(s1); //: invokes s1.toString(WHY ???? Lab reading work: api docs) : using inherited toString from Object class
//create faculty instance
		Faculty f1 = new Faculty("Mihir", "Rao", 10, "Java React DBT");// up casting (Faculty---> Person)
		// display faculty details
		System.out.println(f1);
	}

}
