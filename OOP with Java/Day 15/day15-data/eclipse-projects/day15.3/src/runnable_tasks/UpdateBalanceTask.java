package runnable_tasks;

import com.app.core.JointAccount;
import static java.lang.Thread.*;

public class UpdateBalanceTask implements Runnable {
	private JointAccount jointAcct;
	

	public UpdateBalanceTask(JointAccount jointAcct) {
		super();
		this.jointAcct = jointAcct;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName()+" strted");
		try {
			while(true)
			{
				jointAcct.updateBalance(500);
				Thread.sleep(57);
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName()+" got err "+e);
		}
		System.out.println(currentThread().getName()+" over");

	}

}
