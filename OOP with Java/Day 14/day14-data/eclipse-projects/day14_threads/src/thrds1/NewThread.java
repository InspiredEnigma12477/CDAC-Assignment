package thrds1;

public class NewThread extends Thread {
	public NewThread(String name) {
		super(name);// NEW
		start();// RUNNABLE
		System.out.println("ctor invoked by "+Thread.currentThread());//main
	}

	/*
	 * Overrding form of the method CAN NOT throw any NEW OR BROADER CHECKED exc
	 */
	@Override
	public void run() /* throws InterruptedException */
	{
		System.out.println(getName() + " strted");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + " exec # " + i);
				Thread.sleep(800);
			}
		} catch (Exception e) {
			System.out.println(getName() + " got err " + e);
		}
		System.out.println(getName() + " got over ");
	}
}
