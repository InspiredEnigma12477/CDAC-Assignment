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

	// add a non static (=instance)method to fetch complete faculty details
	public String fetchDetails() {
		return "Faculty " + super.fetchDetails() + " exp in yrs " + expInYears + " expert in " + sme;
	}
}
