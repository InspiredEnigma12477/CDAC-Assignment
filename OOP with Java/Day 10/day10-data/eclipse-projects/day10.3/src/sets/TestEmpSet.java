package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class TestEmpSet {

	public static void main(String[] args) {
		//create empty HS to store emp details
		HashSet<Emp> empSet=new HashSet<>();//size=0
		Emp e1=new Emp("rnd-001", "Rama", 10000);
		Emp e2=new Emp("rnd-002", "Riya", 20000);
		Emp e3=new Emp("rnd-001", "Rama", 10000);

		System.out.println("Added "+empSet.add(e1));//t
		System.out.println("Added "+empSet.add(e2));//t
		System.out.println("Added "+empSet.add(e3));//f
		System.out.println("size "+empSet.size());//2
		System.out.println("Emp details");
		for(Emp e : empSet)
			System.out.println(e);
		System.out.println(e1.equals(e3));//t
		System.out.println(e1.hashCode()+" "+e3.hashCode());//SAME  hashcode : 100
		//Contract : Equal objects(eg : e1.equals(e2) : true) MUST produce SAME hashcodes

	}

}
