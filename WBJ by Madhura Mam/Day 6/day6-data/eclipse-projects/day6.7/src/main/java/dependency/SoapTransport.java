package dependency;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//singleton n lazy
@Component("soap")
@Lazy(true)
public class SoapTransport implements Transport {
	public SoapTransport() {
		System.out.println("in cnstr of " +getClass().getName());
	}

	@Override
	public void informBank(byte[] data) {
		System.out.println("informing bank using " + getClass().getName() + " layer");

	}

}
