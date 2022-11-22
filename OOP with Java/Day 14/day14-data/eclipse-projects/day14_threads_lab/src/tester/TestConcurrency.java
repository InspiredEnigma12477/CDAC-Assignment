package tester;

import java.util.Scanner;

import runnable_tasks.EvenPrinterTask;
import runnable_tasks.OddPrinterTask;

public class TestConcurrency {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter range");
			int start = sc.nextInt();
			int end = sc.nextInt();
			// Create task instance n attach it to thrd
			// THread(Runnable target,String name)
			Thread t1 = new Thread(new EvenPrinterTask(start, end), "even");// NEW
			Thread t2 = new Thread(new OddPrinterTask(start, end), "odd");// NEW
			t1.start();
			t2.start();// main , even, odd
			System.out.println("main waiting for child thrds to finish exec");
			t1.join();
			t2.join();
			System.out.println("main over....");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
