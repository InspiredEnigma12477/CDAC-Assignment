package com.thread1;

public class MyThread1 extends Thread {

	
	public MyThread1(String name)
	{
		super(name);//Thread(String name);
	}

	@Override
	public void run() {
		
		System.out.println("run method started by:"+Thread.currentThread().getName());
		
		for(int i=10;i<=100;i=i+10)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("run method ended by:"+Thread.currentThread().getName());
		
	}
	
	//override run
	
	
	
}
