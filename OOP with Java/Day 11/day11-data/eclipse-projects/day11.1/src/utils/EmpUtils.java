package utils;

import java.util.List;

import com.app.org.Emp;
import com.app.org.Manager;

public class EmpUtils {
//add a static method to display any object's details
	public static void printDetails(List<?> emps) {
		for (Object e : emps)
			System.out.println(e);
	}

	// add a static method to invoke emp specific functionality : work
	public static void invokeEmpWork(List<? extends Emp> emps) {
		//extends : for read only access
		for (Emp e : emps)
			e.work();
	}

	// add a static method to add mgr details to the list
	public static void addManagerDetails(List<? super Manager> mgrs, Manager newMgr) {
		//? super Manager : Manager OR Emp OR Object
		//super : write access
		mgrs.add(newMgr);
	}
	//PECS : Producer(read data) extends Consumer(write data) supers

}





