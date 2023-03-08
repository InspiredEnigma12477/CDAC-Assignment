package dependent;

import dependency.Transport;

public class ATMImpl implements ATM {
	private Transport myTransport;// =new HttpTransport();

	private ATMImpl(Transport t1234) {
		myTransport = t1234;
		System.out.println("in cnstr of " + getClass().getName() + " " + myTransport);
	}

	@Override
	public void deposit(double amt) {
		System.out.println("depositing " + amt);
		byte[] data = ("depositing " + amt).getBytes();
		myTransport.informBank(data);

	}

	@Override
	public void withdraw(double amt) {
		System.out.println("withdrawing " + amt);
		byte[] data = ("withdrawing " + amt).getBytes();
		myTransport.informBank(data);
	}

	// init method
	public void myInit() throws Exception {
		System.out.println("in init " + myTransport);
	}

	// destroy method
	public void myDestroy() throws Exception {
		System.out.println("in destroy " + myTransport);
	}

	// factory method
	public static ATMImpl myFactoryMethod(Transport t12)// invoking fatctory method + dep creation : SC
	{
		System.out.println("in factory method ");
		return new ATMImpl(t12);//creatting dependent : prog
	}

}
