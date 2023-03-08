package dependent;


import dependency.HttpTransport;
import dependency.TestTransport;
import dependency.Transport;

public class ATMImpl implements ATM {
	private Transport myTransport;//=new HttpTransport();
	public ATMImpl() {
		System.out.println("in cnstr of " +getClass().getName()+" "+myTransport);
	}

	@Override
	public void deposit(double amt) {
		System.out.println("depositing "+amt);
		byte[] data=("depositing "+amt).getBytes();
		myTransport.informBank(data);

	}

	@Override
	public void withdraw(double amt) {
		System.out.println("withdrawing "+amt);
		byte[] data=("withdrawing "+amt).getBytes();
		myTransport.informBank(data);
	}
	//setter Based D.I

	public void setMyTransport(Transport myTransport) {
		this.myTransport = myTransport;
		System.out.println("in set transport "+this.myTransport);//not null !
	}
	//init method
	public void myInit() throws Exception
	{
		System.out.println("in init "+myTransport);
	}
	//destroy method
		public void myDestroy() throws Exception
		{
			System.out.println("in destroy "+myTransport);
		}
	
	
}
