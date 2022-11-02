package tester;

import java.util.ArrayList;

import com.app.org.Emp;
import com.app.org.Manager;
import com.app.org.Worker;

public class Test2 {

	public static void main(String[] args) {
		Emp e=new Manager("mgr1");//up casting
		ArrayList<Emp> emps=new ArrayList<>();
		ArrayList<Manager> mgrs=new ArrayList<>();
	//	emps=mgrs;//Even though Mgr IS-A Emp , List<Emp> IS NOT a super type of the List<Mgr>
		Object o=new Worker("w1");//up casting
		ArrayList<Object> objs=new ArrayList<>();
	//	objs=mgrs;//un comment to understand the prob!
		ArrayList<?> list=new ArrayList<>();
		list=emps;
		list=mgrs;
		
		
		
		

	}

}
