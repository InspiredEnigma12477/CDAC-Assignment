package com.thread1;

public class MyThread2 implements Runnable {

	
	public MyThread2()
	{
		//super(name);//Thread(String name);
	}

	@Override
	public void run() {
		
		System.out.println("run method started by:"+Thread.currentThread().getName());
		
		for(int i=200;i<=300;i=i+10)
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
	
}
