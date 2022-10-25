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

	// Overriding inherited toString to replace Person's  ver by complete student 
	@Override
	public String toString() {
		System.out.println(2);
		return "Student " + super.toString() + " year " + gradYear + " " + courseName + " marks " + marks + " fees "
				+ fees;
	}
	//Can a sub class add a new behavior?
	
	public void study()
	{
		//print student's first name studying in course name
		System.out.println(getFirstName()+" studying in course "+courseName);
	}
	
	
	
	
	
	
	

}
