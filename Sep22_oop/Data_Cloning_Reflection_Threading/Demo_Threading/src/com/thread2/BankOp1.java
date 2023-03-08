package com.thread2;

public class BankOp1 extends Thread {
//for performing withdraw operation on BankAccount
	
	private BankAccount act;
	
	public BankOp1(BankAccount act)
	{
		this.act=act;
		
	}

	@Override
	public void run() {
		
		System.out.println("--------Started Withdraw-------->"+Thread.currentThread().getName());
		
		try {
			act.withdraw(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("--------Ended Withdraw-------->"+Thread.currentThread().getName());
		
	}
	
	
	
	
}
