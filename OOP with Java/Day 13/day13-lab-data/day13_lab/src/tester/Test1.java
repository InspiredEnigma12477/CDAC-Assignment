package tester;

import fruits.Alphonso;
import fruits.Fruit;

public class Test1 {

	public static void main(String[] args) {
		Fruit f=new Alphonso();//up casting
		System.out.println(f.taste());//DMD
		//f.pulp();
		((Alphonso)f).pulp();

	}

}
