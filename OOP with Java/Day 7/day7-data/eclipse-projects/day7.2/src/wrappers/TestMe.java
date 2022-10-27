package wrappers;

import java.util.Date;

public class TestMe {

	public static void main(String[] args) {
		// Integer i1=new Integer(1234); deprecated ctor!
		Integer i1 = Integer.valueOf(12345);// boxing : int ---> Integer
		Integer i2 = Integer.valueOf("34567");// boxing : string ---> Integer
		int data = i2.intValue();// un boxing : Integer ---> int
		i1 = 1234;// auto boxing : auto conversion from int --> Integer(prim--> wrapper) done impl
					// by javac
//		String s="53756";
//		s++;
//		Date d1=new Date();
//		d1++;
		i1++;// autoboxing(int tmp=i1.intValue()) --> inc tmp ++ ---> auto boxing
				// (i1=Integer.valueOf(tmp))
		System.out.println("i1 value "+i1);//1235
		int data2=100;
		double d1=data2;//auto promotion(widening)
	//	Double d2=data2;//javac err : since javac first perform auto boxing : int ---> INteger --X---> Double
		Double d2=(double)data2;//widening ---> auto boxing
		d2=12.34;//auto boxing
		//d2=12.34F;//javac err !
		Number n;
		n=100;//auto boxing (int -->Integer) ---> up casting 
		System.out.println("loaded class "+n.getClass());
		n=12345f;
		System.out.println("loaded class "+n.getClass());
		//Can Object type of the reference DIRECTLY (w/o type casting) refer to any reference type ? YES : up casting
		//Can Object type of the reference DIRECTLY (w/o type casting) refer to any primitive type ? YES : auto boxing + up casting
		Object o;
		o="jhjkhjh";//up casting
		o=new Date();
		o=12345;//auto boxing n up casting
		o=false;//auto boxing n up casting
		o=23.45;
		o='c';		
	}

}







