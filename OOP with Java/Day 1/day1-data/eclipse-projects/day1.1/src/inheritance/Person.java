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
	//add a non static (=instance)method to fetch complete Person  details
	public String fetchDetails()
	{
		System.out.println(1);
		return firstName+" "+lastName;
	}
	

}
