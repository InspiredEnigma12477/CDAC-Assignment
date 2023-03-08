package dependent;


import dependency.HttpTransport;
import dependency.TestTransport;
import dependency.Transport;

public class ATMImpl implements ATM {
	private TestTransport myTransport;
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
	
}
