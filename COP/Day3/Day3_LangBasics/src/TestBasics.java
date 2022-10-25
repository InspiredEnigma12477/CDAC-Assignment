import java.util.Scanner;
public class TestBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---welcome----");
      Scanner sc;
		
      int a=20;// local variable
      System.out.println(a);//compile error if not initialised
		System.out.println(a);
		
		char c='B';
		System.out.println(c);
		System.out.println((int)c);
		//65 to 90
		for(int i=65;i<=90;i++)
		{
			System.out.print((char)i+"  ");
		}
		//
		char a1='A';
		char b1='B';
		
		int c3=a1+b1;
		System.out.println(c3);
		int x=10;//primitive type: holds value
		String str="Welcome To IACSD";//String is Non primitive type: hold refernce
		System.out.println(str);
		
		
	//	int cnt=0;
		for(int i=1;i<=10;i++)
		{
			int cnt=1;//local for for loop
			System.out.print(cnt+"  ");//1 2 3
			cnt=cnt+1;//2  3
			
		}
		
		//System.out.println("\n cnt="+cnt);
		
		
		
		
		
		
		
		
		
	}
	
	

}
