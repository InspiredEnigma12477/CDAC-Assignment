package inheritance;

public class Person {
	private String firstName;
	private String lastName;
	public Person(String firstName, String lastName) {
		super();
		System.out.println("in person's ctor");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//add def arg-less ctor
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	//overriding toString
	@Override
	public String toString()
	{
		System.out.println(1);
		return firstName+" "+lastName;
	}
	//add a getter : firstName
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	
	

}
