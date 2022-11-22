package runnable_tasks;

public class EvenPrinterTask implements Runnable {
	// state :
	private int begin;
	private int end;

	public EvenPrinterTask(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		System.out.println("ctor invoked by " + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted exec");
		try {
			for (int i = begin; i <= end; i++) {
				if (i % 2 == 0)
					System.out.println("Even No " + i + " printed by " + Thread.currentThread().getName());
				Thread.sleep(100);
			}

		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " exec over");
	}
}
