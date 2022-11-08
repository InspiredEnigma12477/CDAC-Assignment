package com.thread2;

public class BankOp2 extends Thread {
	//for performing withdraw operation on BankAccount
	
		private BankAccount act;
		
		public BankOp2(BankAccount act)
		{
			this.act=act;
			
		}

		@Override
		public void run() {
			
			System.out.println("--------Started Deposite-------->"+Thread.currentThread().getName());
			
			act.deposite(4000);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("--------Ended Deposite-------->"+Thread.currentThread().getName());
			
		}
		
		
		
		
}
