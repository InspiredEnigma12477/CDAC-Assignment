package dependent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dependency1234.Transport;
//singleton n eager
@Component("my_atm")
@Scope("prototype")
public class ATMImpl implements ATM {
	@Autowired//(required = false) //
	@Qualifier("httpTransport")//autowire=byName , field level D.I
	private Transport myTransport;// =new HttpTransport();	
	
	public ATMImpl() {
		System.out.println("in ctor of "+getClass());
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
	@PostConstruct
	public void myInit() throws Exception {
		System.out.println("in init " + myTransport);
	}

	// destroy method
	@PreDestroy
	public void myDestroy() throws Exception {
		System.out.println("in destroy " + myTransport);
	}
	

}
