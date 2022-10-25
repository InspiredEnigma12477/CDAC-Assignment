package tester;

import inheritance.Faculty;
import inheritance.Student;

public class TestInheritance2 {

	public static void main(String[] args) {
		// create student instance
		Student s1 = new Student("Rama", "Kher", 2020, "Java", 86, 123456);
		//display student's details
		System.out.println(s1.fetchDetails());
//create faculty instance
		Faculty f1=new Faculty("Mihir", "Rao", 10, "Java React DBT");
		//display faculty details
		System.out.println(f1.fetchDetails());
	}

}
