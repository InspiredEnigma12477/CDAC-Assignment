package tester;

import fruits.Alphonso;
import fruits.Fruit;
import fruits.Mandarine;
import fruits.Mango;

public class Test3 {

	public static void main(String[] args) {
		Mango f=new Mango();
	//	((Alphonso)f).pulp();//class cast exc : Mango can't be cast to Alphonso
	//	Alphonso a=new Mango();
		Alphonso a=(Alphonso)new Mango();//class cast exc : Mango can't be cast to Alphonso
		System.out.println("what will happen?????");
		//Can a super class ref DIRECTLY (w/o type casting) refer ot ANY sub class instance ? YES
		//Can such a ref directly access sub class specific func ?  NO
		//soln : down casting (instanceof)
		
		//Can a sub class ref DIRECTLY refer to super cls instance ? NO
		//what will happen if u supply a type cast ? no javac err BUT ClassCastExc 
		
		
		
	}

}






