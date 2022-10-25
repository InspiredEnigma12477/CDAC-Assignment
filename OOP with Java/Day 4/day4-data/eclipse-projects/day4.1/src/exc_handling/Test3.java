package exc_handling;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// testing checked exc : Javac FORCES handling check excs
		// Objective : print "Before" ----dly (5 secs) --After
		//Can u satisfy the javac : using throws keyword
		
			System.out.println("Before");
			Thread.sleep(5000);
			System.out.println("After");
		
		System.out.println("main continues....");

	}

}
