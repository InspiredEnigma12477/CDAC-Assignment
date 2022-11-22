package thrds1;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread());//Thread[main-5-main]
		//create child thrds
		NewThread t1=new NewThread("one");// RUNNABLE
		NewThread t2=new NewThread("two");// RUNNABLE
		NewThread t3=new NewThread("three");// RUNNABLE
		NewThread t4=new NewThread("four");// RUNNABLE
		//1 (main) + 4 child thrds 
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec # " + i);
			Thread.sleep(500);
		}
		System.out.println("main over....");

	}

}
