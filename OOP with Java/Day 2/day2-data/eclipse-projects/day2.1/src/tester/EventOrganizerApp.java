package tester;

import java.util.Scanner;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class EventOrganizerApp {

	public static void main(String[] args) {
		// sc
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max no of participants");
		// create suitable D.S to hold participants info
		Person[] participants = new Person[sc.nextInt()];// 100: 1 array obj : CP --->[Linheritance.Person , len=100 ,
															// 10 nulls
		int counter = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println("Option1s :"
					+ " 1. Register Student 2. Register Faculty 3. Display all 4.Display details about specific participant"
					+ "5.Invoke specific functionality 10. Exit");
			switch (sc.nextInt()) {
			case 1:
				if (counter < participants.length) {
					System.out.println("Enter Student Details : fn,  ln,  year,  cName,  marks,  fees");
					participants[counter] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(),
							sc.nextDouble());
					counter++;
				} else
					System.out.println("Event Full!!!!!!!!!!!!!");

				break;
			case 2:
				if (counter < participants.length) {
					System.out.println("Enter faculty details : fn,  ln,  years of exp sme");
					participants[counter] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
					counter++;
				} else
					System.out.println("Event Full!!!!!!!!!!!!!");

				break;
			case 3:
				System.out.println("All Participants : ");
				// {s1,s2,s3,f1,f2,s4,null.....}
				for (Person p : participants) // p=participants[0]......
					if (p != null)
						System.out.println(p); // run time poly.
				break;
			/*
			 * 4. Display specific participant details i/p : seat no o/p : Display details
			 * of the participants (use toString)
			 */
			case 4:
				System.out.println("Enter seat no");
				int index = sc.nextInt() - 1;
				// boundary chking
				if (index >= 0 && index < counter)
					System.out.println(participants[index]);// run time poly.
				else
					System.out.println("Invalid Seat No");

				break;
			/*
			 * Option 5 : User i/p : seat no Check if seat no is valid . In case of valid
			 * seat no --- If it's a Student , invoke study method , if it's a Faculty
			 * invoke teach method
			 */
			case 5:
				// {s1,s2,s3,f1,f2,s4,null.....}
				System.out.println("Enter seat no");
				index = sc.nextInt() - 1;
				// boundary chking
				if (index >= 0 && index < counter) {
					Person p = participants[index];
					if (p instanceof Student)
						((Student) p).study();
					else // => it's a Faculty
						((Faculty) p).teach();
				}
				else
					System.out.println("Invalid Seat No");
				break;
			case 10:
				exit = true;
				break;

			}

		}

		// close resource
		sc.close();

	}

}
