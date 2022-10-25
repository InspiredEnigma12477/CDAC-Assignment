package inheritance;

public class Faculty extends Person {
	private int expInYears;
	private String sme;

	public Faculty(String firstName, String lastName, int yrs, String sme) {
		super(firstName, lastName);
		System.out.println("in faculty ctor");
		expInYears = yrs;
		this.sme = sme;

	}

	// override inherited toString : from Perso
	@Override
	public String toString() {
		return "Faculty " + super.toString() + " exp in yrs " + expInYears + " expert in " + sme;
	}
	//add a new method : teach
	public void teach()
	{
		//display last name n sme 
		System.out.println(getLastName()+" expert in "+sme);
	}
}
