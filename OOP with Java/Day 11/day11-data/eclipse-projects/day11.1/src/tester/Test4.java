package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import static utils.EmpUtils.invokeEmpWork;

import com.app.org.Emp;
import com.app.org.Manager;
import com.app.org.Worker;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * AL<Emp> AL<Mgr> LL<Worker> Vector<Mgr> : no err AL<Object> , LL<String> :
		 * javac err public static void invokeEmpWork(List<? extends Emp> emps) {...}
		 */

		ArrayList<Emp> emps = new ArrayList<>();
		Collections.addAll(emps, new Emp("e1"), new Emp("e2"), new Emp("e3"));
		invokeEmpWork(emps);
		ArrayList<Manager> mgrs = new ArrayList<>();
		Collections.addAll(mgrs, new Manager("m1"), new Manager("m2"), new Manager("m3"));
		System.out.println("Mgr work");
		invokeEmpWork(mgrs);// javac chks : is Al a List : YES , if Manager extends Emp : YES
		LinkedList<Worker> workers = new LinkedList<>();
		Collections.addAll(workers, new Worker("w1"), new Worker("w2"), new Worker("w3"));
		invokeEmpWork(workers);
	}

}
