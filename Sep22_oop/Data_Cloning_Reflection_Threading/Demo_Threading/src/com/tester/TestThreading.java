package com.tester;

import com.thread1.MyThread1;
import com.thread1.MyThread2;

public class TestThreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("---Main THread Start Here:" + Thread.currentThread().getName());
		// create Thread
		MyThread1 t1 = new MyThread1("One");// Thread Name:One
		System.out.println("Priority:" + t1.getPriority());
		t1.setPriority(10);// Higest Priority
		System.out.println("Priority:" + t1.getPriority());

		//
		t1.start();// must call
		System.out.println("One:" + t1.isAlive());// true
		// Create Thread
		//MyThread2 t2 = new MyThread2("Two");
		MyThread2  obj=new MyThread2();
		Thread t2=new Thread(obj);//
		t2.start();

		t1.join();
		t2.join();
		System.out.println("One:" + t1.isAlive());// false
		// t1.start();//Runtime Exception

		System.out.println("---Main Ends Here------");

	}

}
