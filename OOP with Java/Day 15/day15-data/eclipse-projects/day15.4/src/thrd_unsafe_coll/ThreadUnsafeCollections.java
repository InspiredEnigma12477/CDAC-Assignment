package thrd_unsafe_coll;

import java.util.ArrayList;
import java.util.List;

public class ThreadUnsafeCollections {
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<>(10000);
		for (int i = 0; i < 10000; i++)
			list.add(i);
		// Thread(Runnable instance,String name)
		Thread reader = new Thread(new Runnable() {
			@Override
			public void run() {
				list.forEach(i -> System.out.println("r " + i));
			}
		}, "t1");

		Thread writer = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 10000; i < 50000; i++)
					list.add(i);
			}
		}, "t2");
		reader.start();
		Thread.sleep(10);
		writer.start();
		reader.join();
		writer.join();
		System.out.println("main over...");
	}
}