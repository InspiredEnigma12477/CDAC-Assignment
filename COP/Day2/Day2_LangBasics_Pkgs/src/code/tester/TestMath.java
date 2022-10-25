	package code.tester;
import code.MyMath;
public class TestMath {

	public static void main(String[] args) {

//client code
		MyMath m1=new MyMath();
		
		m1.fun1();
//		m1.fun1();
//		m1.fun1();
		
		m1.fun2(20);
		String s=m1.fun3(7);
		System.out.println();
		System.out.println(s);
		System.out.println(m1.fun4());
		
	}

}
