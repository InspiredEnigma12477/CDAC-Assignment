package code;

public class Account {

	// data member
	private int acctno;
	private String name;
	private double balance;

	// default
	public Account() {
		System.out.println("default constr");
		acctno = 101;
		name = "Ram";
		balance = 10000;
	}

	public Account(int actid, String nm, double bal) {
		System.out.println("parameter constr");
		acctno = actid;
		name = nm;
		balance = bal;
	}

	public void displayDetails() {
		System.out.println(acctno + "   " + name + "   " + balance);
	}

	public void deposite(double amount) {
		// BL
		System.out.println("inside deposite");
		balance = balance + amount;
		System.out.println("after deposite:" + balance);
	}

	public void withdraw(double amount) {
		// BL
		System.out.println("inside withdraw");
		balance = balance - amount;
		System.out.println("after withdraw:" + balance);
	}

	public void showBalance() {
		System.out.println("Current Balance=" + balance);
	}

}
