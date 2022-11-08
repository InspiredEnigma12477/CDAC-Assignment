package tester;

import com.app.core.JointAccount;

import runnable_tasks.CheckBalanceTask;
import runnable_tasks.UpdateBalanceTask;

public class TestSharedResources {

	public static void main(String[] args) throws InterruptedException{
		//1 . Create single joint acct instance
		JointAccount acct=new JointAccount(5000);
		//create tasks --> thrds --> start
		Thread t1=new Thread(new UpdateBalanceTask(acct), "cust1");
		Thread t2=new Thread(new CheckBalanceTask(acct), "cust2");
		t1.start();
		t2.start();//runnable  : 3
		System.out.println("main waiting for child thrds .....");
		t1.join();
		t2.join();
		System.out.println("main over ....");
		

	}

}
