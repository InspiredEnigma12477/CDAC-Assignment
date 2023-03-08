package tester;

import dependency.HttpTransport;
import dependent.ATMImpl;

public class TestATM {

	public static void main(String[] args) {
		ATMImpl atm=new ATMImpl();
		atm.setMyTransport(new HttpTransport());
		atm.deposit(1000);

	}

}
