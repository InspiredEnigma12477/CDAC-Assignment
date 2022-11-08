package runnable_tasks;

import java.util.List;
import java.util.Map;

import com.app.banking.BankAccount;
import static utils.BankingUtils.sortAcctsByDate;
import static utils.IOUtils.storeAcctDetails;

public class AcctDateSorter implements Runnable{
	//state
	private Map<Integer, BankAccount> acctsMap;
	private String fileName;
	

	public AcctDateSorter(Map<Integer, BankAccount> acctsMap, String fileName) {
		super();
		this.acctsMap = acctsMap;
		this.fileName = fileName;
		System.out.println("in ctor by : "+Thread.currentThread().getName());//main
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" strted");
		try {
			//1. sort the data
			List<BankAccount> list = sortAcctsByDate(acctsMap);
			//2 save sorted list
			storeAcctDetails(list, fileName);
			System.out.println("saved sorted list as per date successfully!");
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got exc "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over");
		
	}

}
