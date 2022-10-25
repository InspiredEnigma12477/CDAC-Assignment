package inheritance;

public class Student extends Person {
//additional state
	private int gradYear;
	private String courseName;
	private int marks;
	private double fees;

	public Student(String fn, String ln, int year, String cName, int marks, double fees) {

		super(fn, ln);// to invoke IMMEDIATE super cls's MATCHING ctor
		System.out.println("in student's ctor");
		this.gradYear = year;
		courseName = cName;
		this.marks = marks;
		this.fees = fees;
	}

	// add a non static (=instance)method to fetch complete student details
	public String fetchDetails() {
		System.out.println(2);
		return "Student " + super.fetchDetails() + " year " + gradYear + " " + courseName + " marks " + marks + " fees "
				+ fees;
	}

}
