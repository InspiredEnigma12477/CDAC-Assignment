package tester;
import code.MyMath;
public class TestMyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMath obj;
		obj=new MyMath();
		int a=10,b=30,c=40,d=90;
		obj.show();
		obj.show("IACSD");
		obj.show("Seema", 101);
		///obj.show(12);//compile time error:compile time
		
		
		
		System.out.println(a+" "+b+" "+c+" "+d+"");
		System.out.printf("%d %d %d %d", a,b,c,d);
		
		System.out.println();
	}

}
