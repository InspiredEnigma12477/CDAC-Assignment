package pre_generic;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// Create holder class instance to hold int value of 12345
		Holder h1=new Holder(12345);//auto boxing (int -->Integer) , up casting
		int data=(Integer)h1.getRef();//prog : down casting , javac : auto un boxing
		System.out.println(h1.getClass());//pre_generic.Holder
		System.out.println(h1.getRef().getClass());//java.lang.Integer
		
		//Create holder class instance to hold curnt date
		Holder h2=new Holder(new Date());//Date--> Object : up casting
		System.out.println(h2.getClass());//pre_generic.Holder
		System.out.println(h2.getRef().getClass());//java.util.Date
		Date curntDate=(Date)h2.getRef();
		h1=h2;
		data=(Integer)h1.getRef();
		 
				

	}

}
