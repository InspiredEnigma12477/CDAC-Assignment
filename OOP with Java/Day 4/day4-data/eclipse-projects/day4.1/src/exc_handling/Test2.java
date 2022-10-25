package exc_handling;

public class Test2 {

	public static void main(String[] args) {
		// testing checked exc : Javac FORCES handling check excs 
		//satisfying the javac : try-catch
		// Objective : print "Before" ----dly (5 secs) --After
		try {
			System.out.println("Before");
			Thread.sleep(5000);
			System.out.println("After");
		} catch (InterruptedException e) {
			System.out.println("in IE !!!!!!");
		}
		System.out.println("main continues....");

	}

}
