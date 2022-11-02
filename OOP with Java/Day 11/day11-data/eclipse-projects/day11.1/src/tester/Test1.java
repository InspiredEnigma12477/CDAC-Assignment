package tester;

import java.util.ArrayList;
import java.util.Collections;import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import static utils.EmpUtils.printDetails;

import com.app.org.Emp;
import com.app.org.Manager;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * AL<Emp> AL<Mgr> LL<Worker> Vector<Mgr> */
		
		ArrayList<Emp> emps=new ArrayList<>();
		Collections.addAll(emps,new Emp("e1"),new Emp("e2"),new Emp("e3"));
		printDetails(emps);
		ArrayList<Manager> mgrs=new ArrayList<>();
		Collections.addAll(mgrs, new Manager("m1"),new Manager("m2"),new Manager("m3"));
		System.out.println("Mgr list");
		printDetails(mgrs);//no javac err 
		//print shuffled list of managers
		//API of Collections class : public static void shuffle(List<?> list)
		System.out.println("Shuffled mgr list");
		Collections.shuffle(mgrs);
		printDetails(mgrs);//shuffled list

	}

}





