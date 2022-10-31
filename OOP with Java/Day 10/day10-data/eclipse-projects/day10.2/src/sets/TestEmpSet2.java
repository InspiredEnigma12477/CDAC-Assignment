package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class TestEmpSet2 {

	public static void main(String[] args) {
		//create empty HS to store emp details
		HashSet<Emp> empSet=new HashSet<>();//size=0
		Emp e1=new Emp("rnd-001", "Rama", 10000);
		Emp e2=new Emp("rnd-002", "Riya", 20000);
		Emp e3=new Emp("rnd-001", "Rama", 10000);
		Emp e4=new Emp("rnd-006", "Rama2", 20000);
		Emp e5=new Emp("rnd-005", "Rama4", 40000);
		Emp e6=new Emp("rnd-009", "Rama7", 18000);

		System.out.println("Added "+empSet.add(e1));//t , hC
		System.out.println("Added "+empSet.add(e2));//t , hC : 1 , eq : 1
		System.out.println("Added "+empSet.add(e3));//f , hc : 1 , eq : 1
		System.out.println("Added "+empSet.add(e4));//t , hc : 1 , eq : 2
		System.out.println("Added "+empSet.add(e5));//t , hc : 1 , eq : 3
		System.out.println("Added "+empSet.add(e6));//t , hc : 1 , eq : 4
		System.out.println("size "+empSet.size());//
		System.out.println("Emp details");
		for(Emp e : empSet)
			System.out.println(e);
		//Contract : Equal objects(eg : e1.equals(e2) : true) MUST produce SAME hashcodes

	}

}
