package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test5 {

	public static void main(String[] args) {
		Person p;
		p = new Student("Rama", "Kher", 2020, "Java", 86, 123456);// up casting : javac implicitly adds a type
																	// cast
		System.out.println(p); // D.M.D : JVM invokes toString() on Student type of obj
	//	p.study(); javac err
		((Student)p).study();
		
//create faculty instance
		p = new Faculty("Mihir", "Rao", 10, "Java React DBT");// up casting (Faculty---> Person)
		// display faculty details
		System.out.println(p);//JVM : Faculty's toString 
		((Faculty)p).teach();
	//	((Student)p).study();//no javac err , JVM : ClassCastExc : Faculty can't be cast to Student !
	//Before down-casting , to avoid class cast exc : use instanceof checking
		if(p instanceof Student)
			((Student)p).study();
		else //=> p --> is NOT referring to a student type
			System.out.println("Invalid Type!!!!!!!!!!!!!");
		
		System.out.println("main over....");
		
	}

}
