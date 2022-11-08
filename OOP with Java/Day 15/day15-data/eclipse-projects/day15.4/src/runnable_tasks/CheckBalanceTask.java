package runnable_tasks;

import com.app.core.JointAccount;
import static java.lang.Thread.*;

public class CheckBalanceTask implements Runnable {
	private JointAccount jointAcct;

	public CheckBalanceTask(JointAccount jointAcct) {
		super();
		this.jointAcct = jointAcct;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");
		try {
			while (true) {
				synchronized (jointAcct) {
					double balance = jointAcct.checkBalance();
					if (balance != 5000) {
						System.out.println("ERROR!!!!!!!!!!!!!!!!!!!!!!");
						System.exit(-1);
					}
				}
				Thread.sleep(31);
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " got err " + e);
		}
		System.out.println(currentThread().getName() + " over");

	}

}
