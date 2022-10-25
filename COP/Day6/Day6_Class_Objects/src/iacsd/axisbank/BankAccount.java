package iacsd.axisbank;

public class BankAccount {

	private int actid;// instance variable
	private String name;
	private String email;
	private String address;
	private double balance;
	private static int actCounter;
	private static int idCounter;
	static {
		idCounter = 1001;

	}

	public BankAccount() {
		System.out.println("---default constr-----");
		actCounter = actCounter + 1;
	}

	public BankAccount(String name, String address, String email, double balance) {
		this.actid = idCounter;// 1001
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.email = email;
		actCounter = actCounter + 1;
		idCounter++;// 1002

	}

	
	//deposite
	public void  deposite(double  amt)

	{
		this.balance=this.balance+amt;
		System.out.println("Current Balanace:"+balance);
	}
	//withdraw
	public void  withdraw(double  amt)

	{
		this.balance=this.balance-amt;
		System.out.println("Current Balanace:"+balance);
	}
	//moneyTransfer
	//	act1.moneyTransfer(amt, act2);
	
	public void moneyTransfer(double amount, BankAccount reciver)
	{
		this.balance=this.balance-amount;//from sender account
		
		reciver.balance=reciver.balance+amount;
		
		System.out.println("Money Transfer from  "+this.name +"  account to "+reciver.name );
	}
	
	
	
	public void showAccount() {
		System.out.println(
				actid + " " + name + " " + address + "  " + email + "   " + balance + "    Count:" + actCounter);
	}

	public static void showCount() {
		System.out.println("Total Account Created:" + actCounter);
	}

//setter for name 
	public void setName(String name) {
	//
		this.name = name;

	}
	public void setAddress(String address) {
		this.address = address;

	}
	public void setEmail(String email) {
		this.email = email;

	}

//getter
	
	public int getActid()
	{
		return this.actid;
	}
	
	
	public String getName() {
		return this.name;

	}

	public double getBalance() {
		return balance;

	}

	public String getEmail() {
		return email;
	}

}
