package thrds3;

public class NewRunnableTask implements Runnable	 {
	

	/*
	 * Overrding form of the method CAN NOT throw any NEW OR BROADER CHECKED exc
	 */
	@Override
	public void run() /* throws InterruptedException */
	{
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " exec # " + i);
				Thread.sleep(800);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " got over ");
	}
}
