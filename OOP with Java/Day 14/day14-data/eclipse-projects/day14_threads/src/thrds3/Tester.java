package thrds3;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread());//Thread[main-5-main]
		//create child thrds
		//Thread(Runnable instance,String nm)
		NewRunnableTask task=new NewRunnableTask();//
		Thread t1=new Thread(task,"one");
		Thread t2=new Thread(task,"two");
		Thread t3=new Thread(task,"three");
		Thread t4=new Thread(task,"four"); //RUNNABLE : 1
		t1.start();
		//t1.start();
		t2.start();
		t3.start();
		t4.start();//1 (main) + 4 child thrds  : RUNNABLE
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec # " + i);
			Thread.sleep(500);
		}
		System.out.println("main waiting for child thrds to complete exec ");
		System.out.println(t1.isAlive()+" "+t3.isAlive());//t t
		t1.join();//main : Blocked on join!
		t2.join();
		t3.join();//main : Blocked on join!
		t4.join();
		System.out.println(t1.isAlive()+" "+t3.isAlive());//f f
		System.out.println("main over....");

	}

}
