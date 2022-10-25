package iacsd.bank;

public class Account {
	
	private  int actid;
	private String name;
	private String email;
	private String address;
	private double balance;
	private  static int actCounter;
	
	public Account()
	{
		System.out.println("---default constr-----");
		actCounter=actCounter+1;
	}
	public Account(int actid,String name,String address,String email,double balance)
	{
		this.actid=actid;
		this.name=name;
		this.address=address;
		this.balance=balance;
		this.email=email;
		actCounter=actCounter+1;
	}
public void showAccount()
{
	System.out.println(actid +" "+name+" "+address+"  "+email+"   "+balance+"    Count:"+actCounter);
}


public static void showCount()
{
	System.out.println("Total Account Created:"+actCounter);
}














}
