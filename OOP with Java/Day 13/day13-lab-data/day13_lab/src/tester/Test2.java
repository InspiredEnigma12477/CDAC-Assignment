package tester;

import fruits.Alphonso;
import fruits.Fruit;
import fruits.Mandarine;

public class Test2 {

	public static void main(String[] args) {
		Fruit f=new Alphonso();//up casting
		System.out.println(f.taste());//DMD
		((Mandarine)f).juice();//classcast exc : Alphonso can;t be cast to Mandarine

	}

}
