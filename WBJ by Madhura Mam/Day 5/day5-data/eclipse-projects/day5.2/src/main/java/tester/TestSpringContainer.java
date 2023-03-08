package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependent.ATMImpl;

public class TestSpringContainer {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("bean-config.xml")) {
			System.out.println("SC booted !!!!!!!!!!!!!!!");
			//1st demand for ready to use : atm bean
			ATMImpl atm1=ctx.getBean("my_atm", ATMImpl.class);
			//B.L
			atm1.deposit(12345);
			//next demand for ready to use : atm bean
			ATMImpl atm2=ctx.getBean("my_atm", ATMImpl.class);
			System.out.println(atm1==atm2);
		} //ctx.close() => SC shut down ---searches for singleton --destroy --marks GC -- 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
